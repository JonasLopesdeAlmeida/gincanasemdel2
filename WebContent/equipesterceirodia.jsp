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
<link rel="icon" href="imgs/favicon.ico">
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
		<a class="navbar-brand text-primary" href="index.html"> <img
			src="imgs/logo.png" width="190" class="d-inline-block align-top"
			alt=""></a>
		<button class="navbar-toggler navbar-toggler-right border-0"
			type="button" data-toggle="collapse" data-target="#navbar4">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbar4">
			<ul
				class="navbar-nav ml-auto text-uppercase font-weight-bold negrita fonte_menu">
				<li class="nav-item"><a class="nav-link" href="#equipes">EQUIPES</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#regras">Regras</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="equipesquartodia.jsp">4ª dia de votação</a>
				</li>
			</ul>
		</div>
	</div>
	</nav>
	<div class="py-2" id="equipes">
		<div class="container">
			<div class="row">
				<div class="bg-white mr-auto col-md-12">
					<h1 class="text-danger font-weight-bold">Campeonato de votação - 3ª dia </h1>
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
					<h1 class="font-weight-bold text-center">Grupo G</h1>
				</div>
			</div>

			<div class="row negrita">
				<div class="col-md-8 mx-auto">
					<form method="post" action="ServerVotacaoTerceiroDia">
						<div class="form-group">
							<div class="form-row">
								<div class="col-md-5 p-3 text-center">
									<input class="form-check-input" type="radio" name="grupog_1"
										value="JANAINA(Dario Sousa)">JANAINA (Dario Sousa)<br>
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
															"select count(*) AS contaJanaina from votacao_3_dia where grupog_1 = 'JANAINA(Dario Sousa)'");
													rs = ps.executeQuery();
													rs.next();
													rs = ps.executeQuery();

													while (rs.next()) {
										%>
                                         <!-- recebendo o resultado dos votos na barra de progresso.-->
										<div class="progress-bar" role="progressbar" aria-valuemin="0"
											aria-valuemax="100"><%=rs.getString("contaJanaina")%></div>
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
									<input type="hidden" name="data_votacao_3_dia" value="<%=dataStr%>">

									<input class="form-check-input" type="radio" name="grupog_1"
										value="VILA PALMEIRA(Emerson Viana)">VILA PALMEIRA (Emerson Viana)<br>
									<div class="progress">
										<%
											{

												try {
													Class.forName("org.postgresql.Driver").newInstance();
													con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
															"252107");
													ps = con.prepareStatement(
															"select count(*) AS contaVila from votacao_3_dia where grupog_1 = 'VILA PALMEIRA(Emerson Viana)'");
													rs = ps.executeQuery();
													rs.next();
													rs = ps.executeQuery();

													while (rs.next()) {
										%>

										<div class="progress-bar" role="progressbar" aria-valuemin="0"
											aria-valuemax="100"><%=rs.getString("contaVila")%></div>
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

						<form method="post" action="ServerVotacaoTerceiroDia">
							<div class="form-group">
								<div class="form-row">
									<div class="col-md-5 p-3 text-center">
										<input class="form-check-input" type="radio" name="grupog_2"
											value="CIDADE OLIMPICA(Juvaldir Ferreira)">CIDADE OLIMPICA (Juvaldir Ferreira)<br>
										<div class="progress">
											<%
												{

													try {
														Class.forName("org.postgresql.Driver").newInstance();
														con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																"252107");
														ps = con.prepareStatement(
																"select count(*) AS contaCidade from votacao_3_dia where grupog_2 = 'CIDADE OLIMPICA(Juvaldir Ferreira)'");
														rs = ps.executeQuery();
														rs.next();
														rs = ps.executeQuery();

														while (rs.next()) {
											%>

											<div class="progress-bar" role="progressbar"
												aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaCidade")%></div>
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


										<input class="form-check-input" type="radio" name="grupog_2"
											value="BEQUIMÃO(Samir Nunes)">BEQUIMÃO (Samir Nunes)<br>
										<div class="progress">
											<%
												{

													try {
														Class.forName("org.postgresql.Driver").newInstance();
														con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																"252107");
														ps = con.prepareStatement(
																"select count(*) AS contaBequimao from votacao_3_dia where grupog_2 = 'BEQUIMÃO(Samir Nunes)'");
														rs = ps.executeQuery();
														rs.next();
														rs = ps.executeQuery();

														while (rs.next()) {
											%>

											<div class="progress-bar" role="progressbar"
												aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaBequimao")%></div>
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
								<h1 class="font-weight-bold text-center">Grupo H</h1>
							</div>
							<form method="post" action="ServerVotacaoTerceiroDia">
								<div class="form-group">
									<div class="form-row">
										<div class="col-md-5 p-3 text-center">
											<input class="form-check-input" type="radio" name="grupoh_1"
												value="JARDIM AMERICA(Antônio Luís)">JARDIM AMERICA (Antônio Luís)<br>
											<div class="progress">
												<%
													{

														try {
															Class.forName("org.postgresql.Driver").newInstance();
															con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																	"252107");
															ps = con.prepareStatement(
																	"select count(*) AS contaJardim from votacao_3_dia where grupoh_1 = 'JARDIM AMERICA(Antônio Luís)'");
															rs = ps.executeQuery();
															rs.next();
															rs = ps.executeQuery();

															while (rs.next()) {
												%>

												<div class="progress-bar" role="progressbar"
													aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaJardim")%></div>
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


											<input class="form-check-input" type="radio" name="grupoh_1"
												value="FORQUILHA(Ary de Sousa)">FORQUILHA (Ary de Sousa)<br>
											<div class="progress">
												<%
													{

														try {
															Class.forName("org.postgresql.Driver").newInstance();
															con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																	"252107");
															ps = con.prepareStatement(
																	"select count(*) AS contaForquilha from votacao_3_dia where grupoh_1 = 'FORQUILHA(Ary de Sousa)'");
															rs = ps.executeQuery();
															rs.next();
															rs = ps.executeQuery();

															while (rs.next()) {
												%>

												<div class="progress-bar" role="progressbar"
													aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaForquilha")%></div>
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
								<form method="post" action="ServerVotacaoTerceiroDia">
									<div class="form-group">
									<div class="form-row">
											<div class="col-md-5 p-3 text-center">
												<input class="form-check-input" type="radio" name="grupoh_2"
													value="SANTA CRUZ(Francineide Alves Neidinha)">SANTA CRUZ (Francineide Alves Neidinha)<br>
												<div class="progress">
													<%
														{

															try {
																Class.forName("org.postgresql.Driver").newInstance();
																con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																		"252107");
																ps = con.prepareStatement(
																		"select count(*) AS contaSanta from votacao_3_dia where grupoh_2 = 'SANTA CRUZ(Francineide Alves Neidinha)'");
																rs = ps.executeQuery();
																rs.next();
																rs = ps.executeQuery();

																while (rs.next()) {
													%>

													<div class="progress-bar" role="progressbar"
														aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaSanta")%></div>
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


												<input class="form-check-input" type="radio" name="grupoh_2"
													value="VILA ITAMAR(Raimundo Ferreira)">VILA ITAMAR (Raimundo Ferreira)<br>
												<div class="progress">
													<%
													{

														try {
															Class.forName("org.postgresql.Driver").newInstance();
															con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																	"252107");
															ps = con.prepareStatement(
																	"select count(*) AS contaVila from votacao_3_dia where grupoh_2 = 'VILA ITAMAR(Raimundo Ferreira)'");
															rs = ps.executeQuery();
															rs.next();
															rs = ps.executeQuery();

															while (rs.next()) {
												%>

												<div class="progress-bar" role="progressbar"
													aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaVila")%></div>
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

									<form method="post" action="ServerVotacaoTerceiroDia">
										<div class="form-group">
											<div class="form-row">
												<div class="col-md-12">
													<h1 class="font-weight-bold text-center">Grupo I</h1>
												</div>

												<div class="col-md-5 p-3 text-center">
													<input class="form-check-input" type="radio"
														name="grupoi_1"
														value="PQ BOM MENINO(Jaciel Helder Falcão)">PQ BOM MENINO (Jaciel Helder Falcão)<br>
													<div class="progress">
														<%
															{

																try {
																	Class.forName("org.postgresql.Driver").newInstance();
																	con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																			"252107");
																	ps = con.prepareStatement(
																			"select count(*) AS contaParque from votacao_3_dia where grupoi_1 = 'PQ BOM MENINO(Jaciel Helder Falcão)'");
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
														name="grupoi_1"
														value="SACAVEM(José dos Santos Kiriri)">SACAVEM (José dos Santos Kiriri)<br>
													<div class="progress">
														<%
															{

																try {
																	Class.forName("org.postgresql.Driver").newInstance();
																	con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																			"252107");
																	ps = con.prepareStatement(
																			"select count(*) AS contaSacavem from votacao_3_dia where grupoi_1 = 'SACAVEM(José dos Santos Kiriri)'");
																	rs = ps.executeQuery();
																	rs.next();
																	rs = ps.executeQuery();

																	while (rs.next()) {
														%>

														<div class="progress-bar" role="progressbar"
															aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaSacavem")%></div>
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
										<form method="post" action="ServerVotacaoTerceiroDia">
											<div class="form-group">
												<div class="form-row">
													<div class="col-md-5 p-3 text-center">
														<input class="form-check-input" type="radio"
															name="grupoi_2"
															value="BEQUIMÃO(Nerivaldo Frade Nhopi)">BEQUIMÃO (Nerivaldo Frade Nhopi)<br>
														<div class="progress">
															<%
																{

																	try {
																		Class.forName("org.postgresql.Driver").newInstance();
																		con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																				"252107");
																		ps = con.prepareStatement(
																				"select count(*) AS contaBequimao from votacao_3_dia where grupoi_2 = 'BEQUIMÃO(Nerivaldo Frade Nhopi)'");
																		rs = ps.executeQuery();
																		rs.next();
																		rs = ps.executeQuery();

																		while (rs.next()) {
															%>

															<div class="progress-bar" role="progressbar"
																aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaBequimao")%></div>
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
															name="grupoi_2"
															value="VICENTE FIALHO(Sergio Pacheco)">VICENTE FIALHO (Sergio Pacheco)<br>
														<div class="progress">
															<%
																{

																	try {
																		Class.forName("org.postgresql.Driver").newInstance();
																		con = DriverManager.getConnection("jdbc:postgresql://localhost/bdgincanasemdel", "postgres",
																				"252107");
																		ps = con.prepareStatement(
																				"select count(*) AS contaVicente from votacao_3_dia where grupoi_2 = 'VICENTE FIALHO(Sergio Pacheco)'");
																		rs = ps.executeQuery();
																		rs.next();
																		rs = ps.executeQuery();

																		while (rs.next()) {
															%>

															<div class="progress-bar" role="progressbar"
																aria-valuemin="0" aria-valuemax="100"><%=rs.getString("contaVicente")%></div>
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
