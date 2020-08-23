<%@page import="java.util.Locale"%>
<%@page import="dados.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.Date"%>

<%@page contentType="text/html; charset=ISO-8859-1" language="java"
	pageEncoding="UTF-8" import="java.sql.*" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">-->
<title>Gincana Virtual Movimento e Resgate</title>
<link rel="icon" href="imgs/logo-pref.png">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
	type="text/css">
<link rel="stylesheet"
	href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
<link rel="stylesheet" href="css/stylo.css">
</head>

<body id="topo" class="slowpage">

	<%
		Date data = new Date();

		DateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy HH:mm");
		String dataStr = formato.format(data);
	%>
	<nav class="navbar navbar-expand-md navbar-light">
	<div class="container">
		<a class="navbar-brand text-primary" href="index.jsp"> <img
			src="imgs/logo-pref.png" width="190" class="d-inline-block align-top"
			alt=""></a>
		<button class="navbar-toggler navbar-toggler-right border-0"
			type="button" data-toggle="collapse" data-target="#navbar4">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbar4">
			<ul
				class="navbar-nav ml-auto text-uppercase font-weight-bold negrita fonte_menu">
				<li class="nav-item"><a class="nav-link" href="index.jsp">HOME</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="equipessextodia.jsp">6ª dia</a>
				</li>	
				<li class="nav-item"><a class="nav-link" href="#equipes">EQUIPES</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#regras">Regras</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="equipesoitavodia.jsp">8ª dia de votação</a>
				</li>
			</ul>
		</div>
	</div>
	</nav>
	<div class="py-2" id="equipes">
		<div class="container">
			<div class="row">
				<div class="bg-white mr-auto col-md-12">
					<h1 class="text-danger font-weight-bold">Campeonato de votação - 7ª dia </h1>
					<p class="mb-3 lead">Vote na sua equipe preferida e ajude a
						pontuar nesta competição.</p>
				</div>
			</div>
		</div>
	</div>
	<div class="py-3" id="">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1 class="font-weight-bold text-center">Grupo A</h1>
				</div>
			</div>

			<div class="row negrita">
				<div class="col-md-8 mx-auto">
					<form method="post" action="ServerVotacaoSetimoDia">
						<div class="form-group">
							<div class="form-row">
								<div class="col-md-5 p-3 text-center">
									<input class="form-check-input" type="radio" name="grupoa_1"
										value="BACANGA(Edmilson França)">BACANGA (Edmilson
									França)<br>
									<div class="progress">


										<%
											PreparedStatement ps = null;
											Connection con = null;
											ResultSet rs = null;

											{

												try {
													Class.forName("org.postgresql.Driver").newInstance();
													con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
															"252107");
													ps = con.prepareStatement(
															"select count(*) AS contaBacanga from votacao_7_dia where grupoa_1 = 'BACANGA(Edmilson França)'");
													rs = ps.executeQuery();
													rs.next();
													rs = ps.executeQuery();

													while (rs.next()) {
										%>

										<div class="progress-bar" role="progressbar" aria-valuemin="0"
											aria-valuemax="100"><%=rs.getString("contaBacanga")%></div>
									</div>
								</div>


								<%
									}

										} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
										{
											out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
										}

										catch (SQLException erroSQL) /* erro no banco de dados */
										{
											out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
										} finally {
											if (rs != null)
												rs.close();
											if (ps != null)
												ps.close();
											if (con != null)
												con.close();
										}
									}
								%>

								<div class="col-md-2 p-2 center-v">
									<img class="img-fluid" src="imgs/x_disputas.png">
								</div>
								<div class="col-md-5 p-3 text-center">
									<input type="hidden" name="data_votacao_7_dia" value="<%=dataStr%>">

									<input class="form-check-input" type="radio" name="grupoa_1"
										value="JARDIM AMERICA(José Carlos Ribeiro)">JARDIM AMERICA(José Carlos Ribeiro)<br>
									<div class="progress">
										<%
											{

												try {
													Class.forName("org.postgresql.Driver").newInstance();
													con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
															"252107");
													ps = con.prepareStatement(
															"select count(*) AS contaJardim from votacao_7_dia where grupoa_1 = 'JARDIM AMERICA(José Carlos Ribeiro)'");
													rs = ps.executeQuery();
													rs.next();
													rs = ps.executeQuery();

													while (rs.next()) {
										%>

										<div class="progress-bar" role="progressbar" aria-valuemin="0"
											aria-valuemax="100"><%=rs.getString("contaJardim")%></div>
									</div>
								</div>
							</div>
						</div>


						<div class="form-group text-center">
							<button class="btn btn-primary">Votar</button>
						</div>

						<%
							}

								} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
								{
									out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
								}

								catch (SQLException erroSQL) /* erro no banco de dados */
								{
									out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
								} finally {
									if (rs != null)
										rs.close();
									if (ps != null)
										ps.close();
									if (con != null)
										con.close();
								}
							}
						%>

						<form method="post" action="ServerVotacaoSetimoDia">
							<div class="form-group">
								<div class="form-row">
									<div class="col-md-5 p-3 text-center">
										<input class="form-check-input" type="radio" name="grupoa_2"
											value="GAPARA(Roberto Costa)">GAPARA (Roberto Costa)<br>
										<div class="progress">
											<%
												{

													try {
														Class.forName("org.postgresql.Driver").newInstance();
														con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																"252107");
														ps = con.prepareStatement(
																"select count(*) AS contaGapara from votacao_7_dia where grupoa_2 = 'GAPARA(Roberto Costa)'");
														rs = ps.executeQuery();
														rs.next();
														rs = ps.executeQuery();

														while (rs.next()) {
											%>

											<div class="progress-bar" role="progressbar"
												aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaGapara")%></div>
										</div>
									</div>


									<%
										}

											} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
											{
												out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
											}

											catch (SQLException erroSQL) /* erro no banco de dados */
											{
												out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
											} finally {
												if (rs != null)
													rs.close();
												if (ps != null)
													ps.close();
												if (con != null)
													con.close();
											}
										}
									%>

									<div class="col-md-2 p-2 center-v">
										<img class="img-fluid" src="imgs/x_disputas.png">
									</div>
									<div class="col-md-5 p-3 text-center">


										<input class="form-check-input" type="radio" name="grupoa_2"
											value="SALINA DO SACAVEM(Ritchee Cleidmam)">SALINA DO SACAVEM (Ritchee Cleidmam)<br>
										<div class="progress">
											<%
												{

													try {
														Class.forName("org.postgresql.Driver").newInstance();
														con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																"252107");
														ps = con.prepareStatement(
																"select count(*) AS contaSalina from votacao_7_dia where grupoa_2 = 'SALINA DO SACAVEM(Ritchee Cleidmam)'");
														rs = ps.executeQuery();
														rs.next();
														rs = ps.executeQuery();

														while (rs.next()) {
											%>

											<div class="progress-bar" role="progressbar"
												aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaSalina")%></div>
										</div>
									</div>
								</div>
							</div>


							<div class="form-group text-center">
								<button class="btn btn-primary">Votar</button>
							</div>

							<%
								}

									} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
									{
										out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
									}

									catch (SQLException erroSQL) /* erro no banco de dados */
									{
										out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
									} finally {
										if (rs != null)
											rs.close();
										if (ps != null)
											ps.close();
										if (con != null)
											con.close();
									}
								}
							%>


							<div class="col-md-12">
								<h1 class="font-weight-bold text-center">Grupo B</h1>
							</div>
							<form method="post" action="ServerVotacaoSetimoDia">
								<div class="form-group">
									<div class="form-row">
										<div class="col-md-5 p-3 text-center">
											<input class="form-check-input" type="radio" name="grupob_1"
												value="TURU(Alerrandro Barbosa)">TURU (Alerrandro
											Barbosa)<br>
											<div class="progress">
												<%
													{

														try {
															Class.forName("org.postgresql.Driver").newInstance();
															con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																	"252107");
															ps = con.prepareStatement(
																	"select count(*) AS contaTuru from votacao_7_dia where grupob_1 = 'TURU(Alerrandro Barbosa)'");
															rs = ps.executeQuery();
															rs.next();
															rs = ps.executeQuery();

															while (rs.next()) {
												%>

												<div class="progress-bar" role="progressbar"
													aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaTuru")%></div>
											</div>
										</div>


										<%
											}

												} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
												{
													out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
												}

												catch (SQLException erroSQL) /* erro no banco de dados */
												{
													out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
												} finally {
													if (rs != null)
														rs.close();
													if (ps != null)
														ps.close();
													if (con != null)
														con.close();
												}
											}
										%>

										<div class="col-md-2 p-2 center-v">
											<img class="img-fluid" src="imgs/x_disputas.png">
										</div>
										<div class="col-md-5 p-3 text-center">


											<input class="form-check-input" type="radio" name="grupob_1"
												value="SÃO CRISTOVÃO(Carlos Braga)">SÃO CRISTOVÃO(Carlos Braga)<br>
											<div class="progress">
												<%
													{

														try {
															Class.forName("org.postgresql.Driver").newInstance();
															con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																	"252107");
															ps = con.prepareStatement(
																	"select count(*) AS contaSao from votacao_7_dia where grupob_1 = 'SÃO CRISTOVÃO(Carlos Braga)'");
															rs = ps.executeQuery();
															rs.next();
															rs = ps.executeQuery();

															while (rs.next()) {
												%>

												<div class="progress-bar" role="progressbar"
													aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaSao")%></div>
											</div>
										</div>
									</div>
								</div>


								<div class="form-group text-center">
									<button class="btn btn-primary">Votar</button>
								</div>

								<%
									}

										} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
										{
											out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
										}

										catch (SQLException erroSQL) /* erro no banco de dados */
										{
											out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
										} finally {
											if (rs != null)
												rs.close();
											if (ps != null)
												ps.close();
											if (con != null)
												con.close();
										}
									}
								%>
								<form method="post" action="ServerVotacaoSetimoDia">
									<div class="form-group">
										<div class="form-row">
											<div class="col-md-5 p-3 text-center">
												<input class="form-check-input" type="radio" name="grupob_2"
													value="MAURO FECURY(José Matias)">MAURO FECURY(José Matias)<br>
												<div class="progress">
													<%
														{

															try {
																Class.forName("org.postgresql.Driver").newInstance();
																con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																		"252107");
																ps = con.prepareStatement(
																		"select count(*) AS contaMauro from votacao_7_dia where grupob_2 = 'MAURO FECURY(José Matias)'");
																rs = ps.executeQuery();
																rs.next();
																rs = ps.executeQuery();

																while (rs.next()) {
													%>

													<div class="progress-bar" role="progressbar"
														aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaMauro")%></div>
												</div>
											</div>

											<%
												}

													} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
													{
														out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
													}

													catch (SQLException erroSQL) /* erro no banco de dados */
													{
														out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
													} finally {
														if (rs != null)
															rs.close();
														if (ps != null)
															ps.close();
														if (con != null)
															con.close();
													}
												}
											%>
											<div class="col-md-2 p-2 center-v">
												<img class="img-fluid" src="imgs/x_disputas.png">
											</div>
											<div class="col-md-5 p-3 text-center">


												<input class="form-check-input" type="radio" name="grupob_2"
													value="COHAB(Arnaldo Peixoto)">COHAB(Arnaldo Peixoto)<br>
												<div class="progress">
													<%
													{

														try {
															Class.forName("org.postgresql.Driver").newInstance();
															con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																	"252107");
															ps = con.prepareStatement(
																	"select count(*) AS contaCohab from votacao_7_dia where grupob_2 = 'COHAB(Arnaldo Peixoto)'");
															rs = ps.executeQuery();
															rs.next();
															rs = ps.executeQuery();

															while (rs.next()) {
												%>

												<div class="progress-bar" role="progressbar"
													aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaCohab")%></div>
											</div>
										</div>
									</div>
								</div>


								<div class="form-group text-center">
									<button class="btn btn-primary">Votar</button>
								</div>

								<%
									}

										} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
										{
											out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
										}

										catch (SQLException erroSQL) /* erro no banco de dados */
										{
											out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
										} finally {
											if (rs != null)
												rs.close();
											if (ps != null)
												ps.close();
											if (con != null)
												con.close();
										}
									}
								%>

									<form method="post" action="ServerVotacaoSetimoDia">
										<div class="form-group">
											<div class="form-row">
												<div class="col-md-12">
													<h1 class="font-weight-bold text-center">Grupo C</h1>
												</div>

												<div class="col-md-5 p-3 text-center">
													<input class="form-check-input" type="radio"
														name="grupoc_1"
														value="ITAPERA(Rosmarindo)">ITAPERA (Rosmarindo)<br>
													<div class="progress">
														<%
															{

																try {
																	Class.forName("org.postgresql.Driver").newInstance();
																	con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																			"252107");
																	ps = con.prepareStatement(
																			"select count(*) AS contaItapera from votacao_7_dia where grupoc_1 = 'ITAPERA(Rosmarindo)'");
																	rs = ps.executeQuery();
																	rs.next();
																	rs = ps.executeQuery();

																	while (rs.next()) {
														%>

														<div class="progress-bar" role="progressbar"
															aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaItapera")%></div>
													</div>
												</div>

												<%
													}

														} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
														{
															out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
														}

														catch (SQLException erroSQL) /* erro no banco de dados */
														{
															out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
														} finally {
															if (rs != null)
																rs.close();
															if (ps != null)
																ps.close();
															if (con != null)
																con.close();
														}
													}
												%>
												<div class="col-md-2 p-2 center-v">
													<img class="img-fluid" src="imgs/x_disputas.png">
												</div>
												<div class="col-md-5 p-3 text-center">


													<input class="form-check-input" type="radio"
														name="grupoc_1"
														value="ANJO DA GUARDA(Jacques Lopes Botão)">ANJO DA GUARDA(Jacques Lopes Botão)<br>
													<div class="progress">
														<%
															{

																try {
																	Class.forName("org.postgresql.Driver").newInstance();
																	con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																			"252107");
																	ps = con.prepareStatement(
																			"select count(*) AS contaAnjo from votacao_7_dia where grupoc_1 = 'ANJO DA GUARDA(Jacques Lopes Botão)'");
																	rs = ps.executeQuery();
																	rs.next();
																	rs = ps.executeQuery();

																	while (rs.next()) {
														%>

														<div class="progress-bar" role="progressbar"
															aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaAnjo")%></div>
													</div>
												</div>

											</div>
										</div>


										<div class="form-group text-center">
											<button class="btn btn-primary">Votar</button>
										</div>

										<%
											}

												} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
												{
													out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
												}

												catch (SQLException erroSQL) /* erro no banco de dados */
												{
													out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
												} finally {
													if (rs != null)
														rs.close();
													if (ps != null)
														ps.close();
													if (con != null)
														con.close();
												}
											}
										%>
										<form method="post" action="ServerVotacaoSetimoDia">
											<div class="form-group">
												<div class="form-row">
													<div class="col-md-5 p-3 text-center">
														<input class="form-check-input" type="radio"
															name="grupoc_2"
															value="PQ BOM MENINO(Evandro Lima)">PQ BOM MENINO(Evandro Lima)<br>
														<div class="progress">
															<%
																{

																	try {
																		Class.forName("org.postgresql.Driver").newInstance();
																		con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																				"252107");
																		ps = con.prepareStatement(
																				"select count(*) AS contaParque from votacao_7_dia where grupoc_2 = 'PQ BOM MENINO(Evandro Lima)'");
																		rs = ps.executeQuery();
																		rs.next();
																		rs = ps.executeQuery();

																		while (rs.next()) {
															%>

															<div class="progress-bar" role="progressbar"
																aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaParque")%></div>
														</div>
													</div>

													<%
														}

															} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
															{
																out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
															}

															catch (SQLException erroSQL) /* erro no banco de dados */
															{
																out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
															} finally {
																if (rs != null)
																	rs.close();
																if (ps != null)
																	ps.close();
																if (con != null)
																	con.close();
															}
														}
													%>
													<div class="col-md-2 p-2 center-v">
														<img class="img-fluid" src="imgs/x_disputas.png">
													</div>
													<div class="col-md-5 p-3 text-center">


														<input class="form-check-input" type="radio"
															name="grupoc_2"
															value="BOM JESUS(Ronilson Mendes)">BOM JESUS (Ronilson Mendes)<br>
														<div class="progress">
															<%
																{

																	try {
																		Class.forName("org.postgresql.Driver").newInstance();
																		con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																				"252107");
																		ps = con.prepareStatement(
																				"select count(*) AS contaBom from votacao_7_dia where grupoc_2 = 'BOM JESUS(Ronilson Mendes)'");
																		rs = ps.executeQuery();
																		rs.next();
																		rs = ps.executeQuery();

																		while (rs.next()) {
															%>

															<div class="progress-bar" role="progressbar"
																aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaBom")%></div>
														</div>
													</div>


												</div>
											</div>


											<div class="form-group text-center">
												<button class="btn btn-primary">Votar</button>
											</div>
											<%
												}

													} catch (ClassNotFoundException erroClass) /*erro caso ele não localize a classe o driver*/
													{
														out.println("Classe Driver JDBC não foi localizado, erro " + erroClass);
													}

													catch (SQLException erroSQL) /* erro no banco de dados */
													{
														out.println("Erro de conexão com o banco de dados , erro" + erroSQL);
													} finally {
														if (rs != null)
															rs.close();
														if (ps != null)
															ps.close();
														if (con != null)
															con.close();
													}
												}
											%>
										
				</div>
			</div>

			<div class="form-group text-center">
			</form>
		</div>
	</div>
	</div>
	</div>
	<div class="py-5 text-white bg-danger" id="regras">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h1>Regras</h1>
					<p>O Campeonato de votação na página da Prefeitura de São Luís
						será disputa entre as duas “escolinhas” que ficará disponível por
						24 horas no sítio referido. Durante este período, o público
						realizaria a votação na “escolinha de esporte” de sua preferência.
						Aquela que obtiver mais votos vence a disputa e avança para uma
						próxima etapa. No geral, o Campeonato será composto por três fases
						classificatórias, seguidas por disputas que definirão o 1º, 2º, 3º
						e 4º colocados.</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<h3>1ª FASE</h3>
					<ul>
						<li>38 Equipes- Escolinhas do Programa Movimento e Resgate</li>
						<li>02 grupos de 5 equipes</li>
						<li>07 grupos de 4 equipes</li>
						<li>Classificam 02 de cada grupo (1º e 2 º colocado) - para
							2ª fase</li>
					</ul>
				</div>
				<div class="col-md-4">
					<h3>2ª FASE</h3>
					<ul>
						<li>18 equipes</li>
						<li>06 grupos de 03 equipes</li>
						<li>Classifica o 1º de cada grupo</li>
					</ul>
				</div>
				<div class="col-md-4">
					<h3>3ª FASE</h3>
					<ul>
						<li>06 equipes são classificadas</li>
						<li>02 grupos de 03 equipes</li>
						<li>Classificado 1º de cada grupo</li>
						<li>Os 02 primeiros fazem a final</li>
						<li>Os 02 segundos fazem a decisão de 3ª e 4ª colocados</li>
						<li>Forma de disputa na fase de grupos</li>
						<li>Número de pontos</li>
						<li>Número de vitórias</li>
						<li>Número de votos</li>
						<li>Outra partida</li>
						<li>Em casos omissos a organização decidirá</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="">
		<div class="container">
			<div class="row">
				<div class="p-4 col-md-4">
					<h2 class="mb-4">SEMDEL</h2>
					<p>A company for whatever you may need, from website
						prototyping to publishing</p>
				</div>
				<div class="p-4 col-md-4" style="">
					<h2 class="mb-4">Mapsite</h2>
					<ul class="list-unstyled">
						<a href="#" class="text-dark">Home</a>
						<br>
						<a href="#" class="text-dark">Apresetação</a>
						<br>
						<a href="#" class="text-dark">Regras</a>
						<br>
						<a href="#" class="text-dark">Competições</a>
					</ul>
				</div>
				<div class="p-4 col-md-4">
					<h2 class="mb-4">Contatos</h2>
					<p>
						<a href="#" class="text-dark"> <i
							class="fa d-inline mr-3 text-muted fa-phone"></i>9
						</a>8 99999-9999
					</p>
					<p>
						<a href="#" class="text-dark"> <i
							class="fa d-inline mr-3 text-muted fa-envelope-o"></i>semdel@saoluis.ma.gov.b
						</a>r
					</p>
					<p>
						<a href="#" class="text-dark"> <i
							class="fa d-inline mr-3 fa-map-marker text-muted"></i>Rua de
							Nazaré
						</a>
					</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 mt-3">
					<p class="text-center">© Copyright 2020 SEMIT - PMSL - All
						rights reserved.</p>
				</div>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
	<script src="js/personalizado.js"></script>
	<a href="#topo"><botao
			style="cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:10px;background-color: #00b0eb;border-radius: 20px; display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:20px;color:white">
		<i class="fa fa-arrow-circle-up text-white fa-lg"> </i></botao></a>

	<script language=JavaScript>
		$('.slowpage a[href^="#"]').on('click', function(e) {
			e.preventDefault();
			var id = $(this).attr('href'), targetOffset = $(id).offset().top;

			$('html, body').animate({
				scrollTop : targetOffset - 100
			}, 800);
		});
	</script>

</body>
</html>
