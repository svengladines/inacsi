<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri = "http://www.springframework.org/tags" prefix = "spring"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

   <div class="navbar navbar navbar-acsi">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <div class="hidden-xs">
          		<img src="resources/images/logo.gif" title="ACSI" height="60"/>
          </div>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="index.html#welkom">WELKOM</a></li>
            <li><a href="index.html#team">TEAM</a>
            <li><a href="index.html#therapie">THERAPIE</a>
          	<li><a href="index.html#afspraak">AFSPRAAK</a>
            </li>
            <li><a href="index.html#contact">CONTACT</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    
    <section id="team-picture" class="hidden-xs">
	
		<img src="resources/images/team-2016.png"/>
		
	</section>
		
	<section id="welcome" class="west">
	
		<br/>
	
		<div class="container">
		
			<div class="row showcases">
			
				<div class="col-sm-4">
					<c:set var="articleId" value="entry"/>
					<div id="aanmelden" class="showcase article" data-article-id="${page.articles[articleId].id}">
							${page.articles[articleId].text}
					</div>
				</div>
				
				<div class="col-sm-4">
					<div id="erkenning" class="showcase article">
						<h3><i class="fa fa-check-circle-o"></i></h3>
						<h3>Erkenning</h3>
						<p>Al onze therapeuten zijn erkend door de
							<a href="http://www.compsy.be">psychologencommissie.</a>
							<img alt="psychologencommissie" title="psychologencommissie" width="100%" src="resources/images/psychologencommissie.gif"/>
						</p>
					</div>
				</div>
				
				<div class="col-sm-4">
					<div class="showcase article">
						<h3><i class="fa fa-users"></i></h3>
						<h3>Voor iedereen</h3>
							<ul class="list-unstyled">
								<li><strong>Therapie</strong></li>
								<li>Kind</li>
								<li>Jongvolwassene</li>
								<li>Volwassene</li>
								<li>Koppel</li>
								<li>Gezin</li>
								<li><strong>Vormingen &amp; workshops</strong></li> 
								<li>ouders</li>
								<li>leerkrachten</li>
								<li>hulpverleners</li>
							</ul>
					</div>
				</div>
				
			</div>
			
			<div class="row showcases">
			
			<!-- 
			
				<div id="problems-col" class="col-md-4">
					<div id="problems" class="showcase north">
					<h3><span class="fa-stack">
  						<i class="fa fa-phone fa-stack-1x"></i>
  						<i class="fa fa-ban fa-stack-2x text-danger"></i>
						</span>
					</h3>
					<h3>Werken aan de telefoon</h3>
					<p>
						Wegens werken bij Telenet vandaag (29/11) zou het kunnen dat u ons niet kan bereiken per telefoon. Probeer dan morgen even opnieuw of stuur ons een e-mail naar info@inacsi.be. <br/>
						Groetjes, het ACSI-team.
					</p>
					</div>
				</div>
			
			-->
				<div id="problems-col" class="col-sm-8">
					<div id="problems" class="showcase article">
					<h3>Problematieken</h3>
					<p class="small">Waarvoor kan je bij ACSI terecht ?</p>
					<span class="problem"> ADHD </span><span class="problem"> angst </span><span class="problem"> assertiviteit </span><span class="problem"> concentratieproblemen </span><span class="problem"> conflicten </span><span class="problem"> echtscheiding </span><span class="problem"> gedragsproblemen </span><span class="problem"> emotionele&nbsp;problemen </span><span class="problem"> faalangst  </span><span class="problem"> fobie </span><span class="problem"> eetstoornissen </span><span class="problem"> gezinsproblemen </span><span class="problem"> identiteitsvragen </span><span class="problem"> ontwikkelingsstoornissen </span><span class="problem"> opvoedingsvragen </span><span class="problem"> persoonlijkheidsproblemen </span><span class="problem"> relatieproblemen </span><span class="problem"> slaapstoornissen </span><span class="problem"> spanning </span><span class="problem"> stress </span><span class="problem"> trauma </span><span class="problem"> rouw </span><span class="problem"> verslaving </span><span class="problem"> zelfbeeld </span><span class="problem"> zelfvertrouwen </span>
					</div>
				</div>
				<div id="problems-col" class="col-sm-4">
					<div id="problems" class="showcase article">
						<h3>Vacature(s)</h3>
						<p>
							Momenteel zijn er geen openstaande vacatures. <br/> Je kan altijd vrijblijven je CV e-mailen.
						</p>
						<p>

						</p>
						<p>
					
						</p>
					</div>
				</div>
			</div>
			
			<!-- 
			<div class="row showcases">
			
				<div id="kijker" class="col-sm-12 showcase south">
				<h3><i class="fa fa-exclamation-circle"></i></h3>
					<h3>In de kijker</h3>
					<p>Hier komen meldingen van nieuwe therapieen, of gewijzigde openingsuren, of groepen die starten, ... </p>
				</div>
				
			</div>
			 -->
			
		</div>
		
	</section>
	
	<section id="team" class="east">
	
		<div class="section-header">
	
			<div class="container">
	
				<div class="row">
				
					<h2>Team</h2>
					<p>
						Lees alles over onze teamleden.
					</p>
				</div>
			
			</div>
		
		</div>
		
		<div class="container">
		
			<br/>
			
			<div class="row showcases">
			
				<div class="col-sm-6">
					<div class="box therapist showcase">
						<img class="img-circle" src="resources/images/katrienbelmans.jpg" width="110" height="110" alt="">
						<h3>Katrien Belmans</h3>
						<c:set var="articleId" value="belmans-cover"/>
						<p id="${articleId}" class="article" data-article-id="${page.articles[articleId].id}">
							${page.articles[articleId].text}
						</p>
						<h4>Doelgroep</h4>
						<p>
							kinderen, jongeren, gezinnen en koppels
						</p>
						<div id="belmans-less">
							<button class="btn btn-info toggle" data-show-div="belmans-more">Lees meer</button>
						</div>
						<div id="belmans-more" class="hidden">
									<strong>Opleiding</strong><ul><li>Klinische psychologie optie kind, adolescent en gezin (KU&nbsp;Leuven,2009).</li>
									<li>Algemene lerarenopleiding (2009)</li>
									<li>Relatie-, gezins- en systeempsychotherapie (KU Leuven,2013).</li>
									</ul>
									<strong>Interesses</strong>
										<ul>
											<li>Depressie en angstproblematiek</li>
											<li>Familiale moeilijkheden</li>
											<li>Gedragsproblemen</li>
											<li>Internaliserende problemen</li>
											<li>Ontwikkelingsproblemen (ADHD, ASS, DCD, ...)</li>
											<li>Relatieproblemen</li>
										</ul>
										<strong>Professioneel</strong>
										<ul>
											<li>Werkzaam als psycholoog in het Buitengewoon Onderwijs (Windekind, Leuven)</li>
											<li>Lid van de BVRGS </li>
										</ul>
										<strong>Nummers</strong>
										<ul>
											<li>Erkenningsnummer psychologencommissie: <a href="https://www.compsy.be/psycholoog/9558">862109715</a></li>
											<li>GSM-nummer: 0478/12.41.08</li>
										</ul>
										<br/>
										<button class="btn btn-info toggle" data-show-div="belmans-less">Lees minder</button>
										
						</div>
					</div>
				</div>
			
				<div class="col-sm-6">
					<div class="article therapist showcase">
						<img class="img-circle" src="resources/images/katrienmelotte.jpg" width="110" height="110"  alt="katrien melotte">
						<h3>Katrien Melotte</h3>
						<p>Erkend relatie- en gezinstherapeute<br/>Erkend EMDR-therapeut
						</p>
						<h4>Doelgroep</h4>
						<p>volwassenen, koppels en gezinnen</p>
						<div id="melotte-less">
							<button class="btn btn-info toggle" data-show-div="melotte-more">Lees meer</button>
						</div>
						<div id="melotte-more" class="hidden">
							<strong>Opleiding</strong><ul><li>Klinisch psychologe, optie volwassenen (KU&nbsp;Leuven, 2006).</li>
							<li>Systeemtherapeute (IPRR)</li>
							<li>EMDR (Integrativa 2016-2017)</li>
							</ul>
							<strong>Interesses</strong>
								<ul>
									<li>Gezins- en relatieproblematiek</li>
									<li>Traumaverwerking</li>
									<li>Identiteitsontwikkeling en zelfbeeld</li>
									<li>Rouw</li>
									<li>Depressie</li>
									<li>Stress</li>
									<li>Burn-out</li>
								</ul>
							<strong>Professioneel</strong>
							<ul>
								<li>Eerstelijnspsychologe in CAW De Kempen</li>
							</ul>
							<strong>Nummers</strong>
							<ul>
								<li>Erkenningsnummer psychologencommissie: <a href="https://www.compsy.be/psycholoog/9643">822109800</a></li>
								<li>GSM-nummer: 0470/69.33.50</li>
							</ul>
							<button class="btn btn-info toggle" data-show-div="melotte-less">Lees minder</button>					
						</div>
					</div>
				</div>
			</div>
			
			<br/>
			<br/>
			
			<div class="row showcases">
				<div class="col-sm-6">
					<div class="article therapist showcase">
						<img class="img-circle" src="resources/images/sabinepoel.jpg" width="110" height="110" alt="sabine poel">
						<h3>Sabine Poel</h3>
						<p>
							Erkend relatie- en gezinstherapeute<br/>
							Erkend echtscheidingsbemiddelaar<br/>
						</p>
						<h4>Doelgroep</h4>
						<p>
							Kinderen, jongeren, gezinnen en koppels <br/>
							Volwassenen met BDL-problematiek (DGT-aanpak)
						</p>
						<p>
							Sabine gebruikt hoofdzakelijk de praktijkruimte in Linden<br/>
						</p>
						<div id="poel-less">
							<button class="btn btn-info toggle" data-show-div="poel-more">Lees meer</button>
						</div>
						<div id="poel-more" class="hidden">
							<strong>Opleiding</strong><ul>
							<li>Klinisch psychologe optie kind, jeugd en gezin (KU&nbsp;Leuven, 2006)</li>
							<li>Kortdurende opleiding gezinsbegeleiding (Interactie-academie Antwerpen, 2008)</li>
							<li>Algemene lerarenopleiding (2006)</li>
							<li>Systeemtherapeute (Interactie-academie Antwerpen, 2012)</li>
							<li>Familiaal bemiddelaar (KU&nbsp;Leuven, 2013)</li>
							<li>Postgraduaat psychodiagnostiek (Thomas More, 2014-2016)
							</ul>
							<strong>Interesses</strong>
							<ul>
								<li>Familiale problemen</li>
								<li>Eetproblematiek</li>
								<li>Opvoedingsondersteuning</li>
								<li>Persoonlijkheidsproblemen</li>
								<li>Ontwikkelingsproblemen</li>
								<li>relationele moeilijkheden</li>
							</ul>
							<strong>Professioneel</strong>
							<ul>tc
								<li>Klinisch psychologe bij Z.ORG UPC KULEUVEN</li>
								<li>Erkend supervisor bij VVKP</li>
							</ul>
							<strong>Nummers</strong>
							<ul>
								<li>Erkenningsnummer psychologencommissie: <a href="https://www.compsy.be/psycholoog/6844">802106865</a></li>
								<li>GSM-nummer: 0484/76.73.80</li>
							</ul>
							<button class="btn btn-info toggle" data-show-div="poel-less">Lees minder</button>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="article therapist showcase">
						<img class="img-circle" src="resources/images/thijsvanhie.jpg" width="110" height="110" alt="Thijs Vanhie">
						<h3>Thijs Vanhie</h3>
						<p>
							"Emotion Focused" therapeut i.o.
						</p>
						<h4>Doelgroep</h4>
						<p>volwassenen</p>
						<div id="vanhie-less">
							<button class="btn btn-info toggle" data-show-div="vanhie-more">Lees meer</button>
						</div>
						<div id="vanhie-more" class="hidden">
							<strong>Opleiding</strong>
							<ul>
								<li>Klinische en gezondheidspsychologie, optie volwassenen (KU&nbsp;Leuven, 2014)</li>
								<li>Existentiële psychotherapie (FMS Focus on Emotion, 2015)</li>
								<li>Emotion Focused Therapie i.o. (FMS Focus on Emotion)</li>
							</ul>
							<strong>Interesses</strong>
								<ul>
									<li>Individuele en groepspsychotherapie</li>
									<li>Angst- en depressieproblematiek</li>
									<li>Relatie- en gezinsproblemen</li>
									<li>Verslaving</li>
									<li>Stress &amp; burn-out</li>
									<li>Functionele syndromen (chronische vermoeidheid en/of pijnklachten)</li>
									<li>Existentiële vragen</li>
								</ul>
								<strong>Nummers</strong>
								<ul>
									<li>Erkenningsnummer psychologencommissie: <a href="https://www.compsy.be/psycholoog/13230">901113408</a></li>
									<li>GSM-nummer: 0471/52.17.20</li>
								</ul>
							<button class="btn btn-info toggle" data-show-div="vanhie-less">Lees minder</button>
						</div>
					</div>
				</div>
			</div>
				
			<br/>
			<br/>
			
			<div class="row showcases">
			
			<div class="col-sm-6">
					<div class="article therapist showcase">
						<img class="img-circle" src="resources/images/julievanmeel.jpg" width="110" height="110" alt="Julie Van Meel">
						<h3>Julie Van Meel</h3>
						<p>
							Klinisch psychologe<br/>
							Gedragstherapeute i.o. (sept '17 - ...)
						</p>
						<h4>Doelgroep</h4>
						<p>kinderen, jongeren en gezinnen</p>
						<div id="vanmeel-less">
							<button class="btn btn-info toggle" data-show-div="vanmeel-more">Lees meer</button>
						</div>
							<div id="vanmeel-more" class="hidden">
								
								<strong>Opleiding</strong>
									<ul>
										<li>Klinische psychologie (VUB, 2005)</li>
										<li>Psychodiagnostiek bij kinderen (interuniversitaire opleiding, 2011)</li>
									</ul>
								<strong>Interesses</strong>
									<ul>
										<li>Internaliserende problemen</li>
										<li>Ontwikkelingsproblemen</li>
										<li>Leerproblemen</li>
										<li>Gedragsproblemen</li>
										<li>Opvoedingsondersteuning</li>
									</ul>	
									
										<strong>Professioneel</strong>
										<ul>
											<li>Werkzaam als psycholoog in het Centrum voor Leerlingenbegeleiding (Stedelijk en Gemeentelijk onderwijs, VGC)</li>
										</ul>
										<strong>Nummers</strong>
										<ul>
											<li>Erkenningsnummer psychologencommissie: <a href="https://www.compsy.be/psycholoog/21028">822116554</a></li>
											<li>GSM-nummer: 0472/33.66.19</li>
										</ul>
									<button class="btn btn-info toggle" data-show-div="vanmeel-less">Lees minder</button>
							</div>
						</div>
		
				
				</div>
			
				<div class="col-sm-6">
					<div class="article therapist showcase">
						<img class="img-circle" src="resources/images/ellenvannooten.jpg" width="110" height="110" alt="Ellen Van Nooten">
						<h3>Ellen Van Nooten</h3>
						<p>
							Systeemtherapeute, relatietherapeute en seksuologe
						</p>
						<h4>Doelgroep</h4>
						<p>
							Volwassenen en koppels
						</p>
						<div id="vannooten-less">
							<button class="btn btn-info toggle" data-show-div="vannooten-more">Lees meer</button>
						</div>
						<div id="vannooten-more" class="hidden">
							<strong>Opleiding</strong>
							<ul>
									<li>Psychologie (KU Leuven, 2005)</li>
									<li>Familiale en seksuologische wetenschappen (KU Leuven, 2009)</li>
									<li>Postgraduaat Familiale Bemiddeling (KU Leuven, 2010)</li>
									<li>Systeemtherapie (IPRR, 2015)</li>
							</ul>
							<strong>Interesses</strong>
								<ul>
									<li>Individuele problematieken <br/>(depressieve klachten, zelfbeeldgerelateerde twijfels, angsten,...)</li>
									<li>Relatieproblemen<br/>(communicatieproblemen, ruzies, relationele twijfel, ontrouw,...)</li>
									<li>Seksuele klachten<br/>(geen zin in seks of verschil in seksueel verlangen, vaginistische en/of pijnklachten tijdens het vrijen, te snel of juist moeilijk klaarkomen, opwindings-of erectieproblemen, seksverslaving, seksueel misbruik, ...)
</li>								</ul>
							<strong>Professioneel</strong>
							<ul>
								<li>Werkzaam bij groepspraktijk Facet te Kortenberg</li>
							</ul>
							<strong>Nummers</strong>
							<ul>
								<li>GSM-nummer: 0494/87.85.66</li>
							</ul>
							
							<button class="btn btn-info toggle" data-show-div="vannooten-less">Lees minder</button>
						</div>
					</div>
				
				</div>
				
				
		
			</div>
			
			<br/>
			<br/>
			
			<div class="row showcases">
				
				<div class="col-sm-6">
					<div class="article therapist showcase">
						<img class="img-circle" src="resources/images/hanneverbruggen.jpg" width="110" height="110" alt="Hanne Verbruggen">
						<h3>Hanne Verbruggen</h3>
						<p>
							Relatie- en gezinstherapeute i.o.
						</p>
						<h4>Doelgroep</h4>
						<p>
							Kinderen, jongeren, gezinnen en koppels
						</p>
						<div id="verbruggen-less">
							<button class="btn btn-info toggle" data-show-div="verbruggen-more">Lees meer</button>
						</div>
						<div id="verbruggen-more" class="hidden">
							<strong>Opleiding</strong>
							<ul>
									<li>Klinisch psychologe optie kinderen en adolescenten (KU&nbsp;Leuven, 2012)</li>
									<li>Gezins- Relatie en Systeemtherapeut i.o. (Rapunzel)</li>
							</ul>
							<strong>Interesses</strong>
								<ul>
									<li>Depressie en angstproblematiek</li>
									<li>Gezins- en relatieproblematiek</li>
									<li>Ontwikkelingsproblemen</li>
									<li>Zelfbeeld en persoonlijkheidsproblemen</li>
									<li>Hechtingsproblemen</li>
								</ul>
							<strong>Professioneel</strong>
							<ul>
								<li>Werkzaam als contextbegeleidster bij Amber vzw</li>
							</ul>
							<strong>Nummers</strong>
							<ul>
								<li>Erkenningsnummer psychologencommissie: <a href="https://www.compsy.be/psycholoog/11850">882112021</a></li>
								<li>GSM-nummer: 0472/87.46.33</li>
							</ul>
							
							<button class="btn btn-info toggle" data-show-div="verbruggen-less">Lees minder</button>
						</div>
					
					</div>
				
				</div>
				
				<div class="col-sm-6">
				
					<div class="article therapist showcase">
							<img class="img-circle" src="resources/images/katrienvuerinckx.jpg" width="110" height="110" alt="Katrien Vuerinckx">
							<h3>Katrien Vuerinckx</h3>
							<p>
								Erkend gedragstherapeute
							</p>
							<h4>Doelgroep</h4>
							<p>jongeren, volwassenen</p>
							<div id="vuerinckx-less">
								<button class="btn btn-info toggle" data-show-div="vuerinckx-more">Lees meer</button>
							</div>
								<div id="vuerinckx-more" class="hidden">
									
									<strong>Opleiding</strong>
										<ul>
											<li>Klinisch psychologe optie kind, jeugd en gezin (2006)</li>
											<li>Kortdurende opleiding gezinsbegeleiding (Interactie-academie A'pen, 2008-2009)</li>
											<li>Gedragstherapeute (KU&nbsp;Leuven, 2013)</li>
										</ul>
									<strong>Interesses</strong>
										<ul>
											<li>Gedragstherapie</li>
											<li>ACT</li>
											<li>Oplossingsgerichte therapie</li>
											<li>Angstproblemen</li>
											<li>Depressie</li>
											<li>Zelfbeeld en persoonlijkheidsproblemen</li>
										</ul>	
										
											<strong>Professioneel</strong>
											<ul>
												<li>Deeltijds werkzaam als Stafmedewerker Contextgericht werken in Studio 3 - VZW Sporen</li>
											</ul>
											<strong>Nummers</strong>
											<ul>
												<li>Erkenningsnummer psychologencommissie: <a href="https://www.compsy.be/psycholoog/7379">832107398</a></li>
												<li>GSM-nummer: 0487/60.59.57</li>
											</ul>
										<button class="btn btn-info toggle" data-show-div="vuerinckx-less">Lees minder</button>
								</div>
							</div>
				</div>
			</div>

			<br/>
			<br/>
			
		</div>
		
		<br/>
		
	</section>
	
	<section id="therapie" class="west">
	
		<div class="section-header">
	
			<div class="container">
	
				<div class="row">
				
					<h2>Therapie</h2>
					<p>
						Voor welke therapie kan je bij ons terecht ?
					</p>
				</div>
			
			</div>
		
		</div>

		<br/>
		
		<div class="container">
	
		<div class="row">
			<div id="individueel" class="col-sm-12">
				<div class="article">
					<div class="article-header">
						<h2><i class="fa fa-male fa-1x"></i>&nbsp;Individuele therapie</h2>
					</div>
					<div class="article-body">
						<p>
						Vele kinderen, jongeren en/of volwassenen komen op een bepaald moment in hun leven vast te zitten. Mensen kunnen problemen hebben op het werk of op school, moeite hebben met het verwerken van bepaalde gebeurtenissen, gepest worden, zich depressief of (faal)angstig voelen, niet weten hoe ze moeten omgaan met hun emoties, snel boos worden, zich slecht voelen in sociale contacten, slecht slapen, zich niet goed kunnen concentreren, ....
		Vaak klaren deze problemen na een tijdje weer op of slagen mensen er in om op eigen kracht of samen met hun ouders, partner, familie en vrienden een uitweg te vinden. Soms echter, is dit moeilijk. Je krijgt dan het gevoel vast te zitten en niet het leven te leiden dat je wil leiden. Niet de persoon, de partner, de ouder of het gezinslid te kunnen zijn die je wil zijn.
		 				</p>
		 				<p>
		Herken je jezelf hierin? Dan kan een therapeutische begeleiding bij een psycholoog aangewezen zijn. Wij gaan samen met jou aan de slag om te zoeken wat er moeilijk loopt en vooral wat er kan veranderen om dichter bij het “gewenste” leven te komen. Er wordt samen met jou gekeken naar wat je kan veranderen in je dagdagelijks leven en hoe je op een andere manier naar de dingen kan kijken. Ook zoeken we samen welke mensen rondom jou je hierbij kunnen ondersteunen. Eventueel kunnen deze mensen ook uitgenodigd worden bij een of meerdere gesprekken. De psycholoog volgt tijdens de therapie het veranderingsproces op en stuurt bij waar nodig.</p>
		<p>Ook wanneer je je kind hierin herkent, kan een therapie helpend zijn. De psycholoog gaat samen met jullie als ouders en - afhankelijk van de leeftijd - ook met jullie kind zoeken naar hoe jullie traject er best zou uitzien. Meestal werkt de psycholoog samen met de ouders en het kind. Bij jonge kinderen wordt er soms voor gekozen om enkel oudergesprekken te doen.
		</p>
						</p>
					</div>
				</div>
			</div>
		</div>
		<br/>
		<div  class="row">
			<div id="gezin" class="col-sm-6">
				<div class="article">
					<div class="article-header">
						<h2><i class="fa fa-male fa-1x"></i><i class="fa fa-child fa-1x"></i><i class="fa fa-female fa-1x"></i>&nbsp;Gezinstherapie</h2>
					</div>
					<div class="article-body">
						<p>
						Gezinsleden zijn niet zomaar individuen die toevallig samen in 1 huis wonen. Ze hebben een belangrijke band met elkaar en worden voortdurend door elkaar beïnvloed, op aangename maar ook minder aangename manieren. Soms geraken gezinnen verstrikt in steeds terugkerende conflicten of communicatiemoeilijkheden en komen ze hier alleen niet meer uit. 
				
						</p>
						<p>Op zo'n moment kan gezinstherapie iets voor uw gezin betekenen.
		In de gezinstherapie worden problemen niet bekeken als 'van 1 individu', maar wel benaderd vanuit een 'systemisch perspectief'. Dit wil zeggen dat er gefocust wordt op verbondenheid en communicatie en dat er gezocht wordt naar nieuwe verklaringen voor de problemen waar één gezinslid of het gezin mee worstelt. Op die manier kan men een andere visie krijgen op elkaar, op de relaties en op de zorgen die er zijn.
		De gezinstherapeut zal zich 'meerzijdig partijdig' opstellen. Dit betekent dat hij of zij geen partij zal kiezen, geen oordelen zal uitspreken en niet zal gaan veroordelen.
						</p>
					</div>
				</div>
			</div>
			<div id="relatie" class="col-sm-6">
				<div class="article">
					<div class="article-header">
						<h2><i class="fa fa-venus-mars fa-1x"></i>&nbsp;Relatietherapie</h2>
					</div>
					<div class="article-body">
						<p>
							Relaties kunnen soms zo vast lopen dat de partners het gevoel hebben tegenover elkaar te staan. De emotionele band tussen partners ("wij samen") lijkt zoek te zijn. Dit gaat vaak samen met afstandelijkheid, herhaaldelijk conflict, eenzaamheid, frustratie, verdriet, pijn ...
						</p>
						<p>
							Relatietherapie betekent samen "tijd nemen" voor jezelf en jullie relatie. De relatietherapeut creeert, als neutrale derde, een veilige ruimte. Hij/Zij is meerzijdig partijdig en helpt jullie om de dialoog terug aan te gaan. Er wordt aandacht besteed aan spreken, luisteren en elkaar opnieuw horen.				
						</p>
					</div>
				</div>
			</div>
			
				
		</div>
		
		<div  class="row">
			<div id="bemiddeling" class="col-sm-8">
				<div class="article">
					<div class="article-header">
						<h2><i class="fa fa-gavel fa-1x"></i>&nbsp;Bemiddeling</h2>
					</div>
					<div class="article-body">
						<p>
						In ons therapeutisch werk komen we in contact met kinderen, gezinnen en koppels die met problemen kampen. 
						Bij het goed verkennen van deze problemen valt het op dat er vaak sprake is van hevige discussies binnen echtscheidingssituaties, conflicten over de overeenkomst na echtscheiding, conflicten over het niet naleven van afspraken,...<br/>
					</p>
					<p> 
						Vaak zijn het de kinderen die worden 'aangemeld bij de therapeut' omdat ze problemen hebben. Uit onderzoek blijkt dat kinderen bij een echtscheiding vooral lijden onder de mate van conflict dat er heerst tussen beide ouders. 
						Deze discussies zijn al zo lang bezig dat ze als het ware 'te ver gevorderd zijn' om ze nog te kunnen 'ontmijnen'.
					</p>
					<p>
						Als je voor bemiddeling kiest, kies je ervoor om je conflicten als ex-partners of als ouders in eigen handen te houden. 
						Je wil je ouderschap of je echtscheiding samen met je ex-partner regelen, en dit door dialoog in plaats van door strijd. 
						Als ex-partner en als ouder ben je het best geplaatst om zelf te zoeken naar goede regelingen voor jou en de kinderen. 
						Enkel afspraken waar alle betrokkenen zich kunnen in vinden zijn op lange termijn haalbaar en zorgen voor weinig discussies achteraf. 
						Bemiddeling is altijd gebaseerd op "vrijwilligheid", wat betekent dat men niet kan gedwongen worden om in bemiddeling te gaan.
					</p>
					<p>
						Bij ACSI worden er vooral regelingen uitgewerkt rond het kind/de kinderen, met name: ouderlijk gezag, verblijfsregeling, kostenregeling en wat bij conflicten en discussies. Om het kind belang van het kind maximaal centraal te stellen kunnen de kinderen ook gezien worden door de bemiddelaar die tevens kinderpsycholoog is van opleiding.
					</p>
				</div>
			</div>
				
		</div>
		
		<div id="vorming" class="col-sm-4">
				
					<div class="article">
						<div class="article-header">
							<h2><i class="fa fa-users fa-1x"></i>&nbsp;Vormingen voor ouders, leerkrachten en hulpverleners</h2>
						</div>
						<div class="article-body">
							<p>
								We organiseren ook vormingen/workshops rond faalangst en (v)echtscheiding. Wenst u meer informatie, neem gerust contact met ons op via het webformulier, via e-mail of telefoon.  
							</p>
						</div>
					</div>
			</div>
		
		</div>
		
		<div  class="row">
			<div id="emdr" class="col-sm-12">
				<div class="article">
					<div class="article-header">
						<h2><i class="fa fa-eye fa-1x"></i>&nbsp;EMDR</h2>
					</div>
					<div class="article-body">
						<p>
						Net zoals ons lichaam in staat is om spontaan te genezen van verwondingen, is ons brein van nature in staat om moeilijke levenservaringen te verwerken. Soms blokkeert dit verwerkingssysteem echter (onder invloed van psychisch trauma, bij zeer hevige emoties of wanneer onze hersenen niet "rijp" waren op het moment van de gebeurtenis). Deze "onverwerkte" informatie kan voor allerlei klachten en problemen zorgen (herbelevingen, nachtmerries, angsten, onzekerheid,  depressie, relatieproblemen,...).
						<p>
						EMDR is een therapievorm die toelaat om onverwerkte herinneringen alsnog te verwerken, zelfs wanneer het over gebeurtenissen van jaren geleden gaat.
						</p> 
						<p>
						EM staat voor Eye Movement: aanvankelijk werd het verwerkingsproces op gang gebracht met oogbewegingen (naar analogie met de REM-slaap - de fase in onze slaap waarin we de indrukken van de afgelopen dag verwerken), maar intussen worden ook andere manieren van bilaterale stimulatie gebruikt om het verwerkingsproces te ondersteunen.
						<br/>D staat voor Desensitisatie: dat wil zeggen dat er voor gezorgd wordt dat aan de moeilijke herinneringen of problemen gedacht kan worden, zonder emotionele lading. Dus: zonder moeilijke emoties of vervelende lichaamssensaties (krop in de keel, benauwdheid, hartkloppingen).
						<br/>R staat voor Reprocessing: naast desensitisatie (verdwijnen van negatieve gevoelens) wordt er ook gezorgd voor het oplossen van negatieve gedachten. Waar de cliënt eerst nog negatief denkt over zichzelf of de te verwerken situatie, worden deze gedachten omgevormd tot neutrale of positieve gedachten.
						</p> 
						<p>
						Voor meer informatie zie <a href="http://www.emdr-belgium.be">www.emdr-belgium.be</a>
						</p>
				</div>
			</div>
				
			</div>
		
		</div>
	</div>
	
	</section>
	
	<section id="afspraak" class="east">
	
		<div class="section-header">
	
			<div class="container">
	
				<div class="row">
				
					<h2>Afspraak</h2>
					<p>
						Hoe maak je een afspraak en hoe gaan we te werk ?
					</p>
				</div>
			
			</div>
		
		</div>
		
		
		<div class="container">
		
			<div class="row">
	
					<div id="aanmelding" class="col-sm-6">
						<div class="article">
							<div class="article-header">
								<h2>Procedure</h2>
							</div>
							<div class="article-body">
									<ol>
									<li>
										<h4>Aanmelding</h4>
											Een aanmelding is een eerste contact tussen jou en ACSI, waarbij je aangeeft waarvoor je graag bij ons terecht zou kunnen. Bij elke aanmelding wordt in onderling overleg beslist door wie en wanneer uw hulpvraag kan beantwoord worden. Aanmelden kan via:
											<ul class="list-unstyled">
												<li><i class="fa fa-laptop"></i>&nbsp;&nbsp;<strong><a href="entry.html">webformulier</a></strong></li>
												<li><i class="fa fa-phone"></i>&nbsp;&nbsp;<strong>016/43.55.71</strong></li>
												<li><i class="fa fa-envelope"></i>&nbsp;&nbsp;&nbsp;info@inacsi.be</li>
											</ul>
									</li>
									<li>
										<h4>Intakegesprek</h4>
										<p>
											Een eerste verkennend gesprek wordt gevoerd om de hulpvragen in kaart te brengen.
										</p>
									</li>
									<li>
										<h4>Termijn</h4>
										<p>
											Er wordt samen met u gekeken naar een wenselijke of haalbare termijn van de therapie, 
											die afhankelijk van de hulpvraag kortdurend is, of eerder van lange duur zal zijn. 
											Indien het therapeutisch aanbod niet voldoende aansluit bij de hulpvraag, zoeken we mee naar een zo goed mogelijke doorverwijzing.
										</p>
									</li>
									<li>
										<h4>Begeleiding</h4>
										<p>
											De eigenlijke begeleiding wordt opgestart. Concreet kan dit zijn: belevingsonderzoek, adviesgesprekken, 
											ondersteunende gesprekken, relaxatietherapie, individuele psychotherapie, sociale vaardigheidstraining (zowel individueel als in groep), 
											gezinsbegeleiding, ...
										</p>
									</li>
									<li>
										<h4>Overleg</h4>
										<p>
											Als team hebben we regelmatig intervisiemomenten waar ruimte is tot onderlinge feedback en ondersteuning. Overleg met externen is ook steeds mogelijk.
										</p>
									</li>
								</ol>
							</div>
					</div>
				</div>
			<div id="tarieven" class="col-sm-6">
						<div class="article">
							<div class="article-header">
								<h2>Tarieven</h2>
							</div>
							<div class="article-body">
								<table class="table table-bordered">
								<thead>
									<tr>
										<th colspan="2">Psychotherapie</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Oriëntatiegesprek of intake voor individuele therapie</td>
										<td>
											60 euro voor 18u<br/>
											65 euro na 18u en in het weekend
										</td>
									</tr>
									<tr>
										<td>Oriëntatiegesprek of intake voor ouders met kind, koppel of gezin</td>
										<td>
											70 euro
										</td>
									</tr>
									<tr>
										<td>Individuele therapie</td>
										<td>
											50 euro/50 min. voor 18u<br/>
											55 euro/50 min. na 18u en in het weekend
										</td>
									</tr>
									<tr>
										<td>Therapie koppel, gezin, meerdere personen</td>
										<td>65 euro/uur</td>
									</tr>
									<tr>
										<td>Dienstverplaatsingen <br>(bv. schoolbezoek, intake of therapie op verplaatsing, ...)</td>
										<td>Wettelijke tarief per gereden kilometer + vergoeding voor de reistijd (= 5 euro per begonnen kwartier)</td>
									</tr>
									<tr>
										<td>Inhoudelijke verslagvoering</td>
										<td>25 euro</td>
									</tr>
									<tr>
										<th colspan="2">Bemiddeling</th>
									</tr>
									<tr>
										<td>Bemiddelingsgesprekken</td>
										<td>100 euro per uur</td>
									</tr>
									
									<tr>
										<td>Maken van documenten en afsprakennota’s</td>
										<td>50 euro per uur</td>
									</tr>
									<tr>
										<td>Formaliteiten gerechtelijke bemiddeling</td>
										<td>60 euro (30 euro p.p.)</td>
									</tr>
									<tr>
										<td>Niet nagekomen afspraak</td>
										<td>25 euro p.p.</td>
									</tr>
									<tr class="info">
										<td colspan="2">
											Wanneer cliënten zonder geldige reden (ziekte e.d.) niet komen opdagen voor een sessie of minder dan 24 uur op voorhand afbellen, zal voor de gemiste sessie de helft van de prijs aangerekend worden.
										</td>
									</tr>
								</tbody>
								</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		
	</section>
		
	<section id="contact" class="west">
	
		<div class="section-header">
	
			<div class="container">
	
				<div class="row">
				
					<h2>Contact</h2>
					<p>
						Waar vind je ons en hoe kan je ons contacteren ? 
					</p>
				</div>
			
			</div>
		
		</div>
		
		
		<div class="container">
		
			<div class="row">
			
				<div id="praktijkruimtes" class="col-sm-12">
						<div class="article">
							<div class="article-header">
								<h2>Praktijkruimtes</h2>
							</div>
							<div class="article-body">
								<div class="row">
									<div class="col-sm-6">
											Groepspraktijk Nieuwrode<br/>
											Dorp 13, bus 1<br/>
											3221 Nieuwrode
											<br/><br/>
											<div id="map-1">
												<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d80415.9995385937!2d4.891560515904264!3d50.960704514626!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0000000000000000%3A0xc74999062ec1b1aa!2sGroepspraktijk+ACSI!5e0!3m2!1snl!2sbe!4v1432797795137" width="100%" height="450" frameborder="0" style="border:0"></iframe>
											</div>	
										</div>		
									<div class="col-sm-6">
										Praktijkruimte Linden<br/>
										Houwaartstraat 114<br/>
										3210 Linden
										<br/>
										<strong>Enkel Sabine werkt hier</strong>
										<br/>
										<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d40252.084710016694!2d4.784482724664476!3d50.90974382833042!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xcbf9cfec8edc3f10!2sGroepspraktijk+ACSI%2C+praktijkruimte+Linden!5e0!3m2!1snl!2sus!4v1488802194962" width="100%" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
									</div>
								</div>
							</div>
						</div>
				</div>
			</div>
			
			<div class="row">
				
				<div id="adres" class="col-sm-4">
					<div class="article">
						<div class="article-header">
							<h2>Contact</h2>
						</div>
						<div class="article-body">
								<p>
									Voor algemene vragen en aanmelding:
									<ul class="list-unstyled">
										<li><i class="fa fa-phone"></i>&nbsp;&nbsp;<strong>016/43.55.71</strong></li>
										<li><i class="fa fa-envelope"></i>&nbsp;&nbsp;&nbsp;info@inacsi.be</li>
										<li><i class="fa fa-laptop"></i>&nbsp;&nbsp;<strong><a href="entry.html">webformulier</a></strong></li>	
									</ul>
									<br/>
								</p>
						</div>
					</div>
				</div>
				<div id="mobiel" class="col-sm-8">
					<div class="article">
						<div class="article-header">
							<h2>Mobiele  nummers therapeuten</h2>
						</div>
						<div class="article-body">
							<table class="table table-condensed table-bordered">
									<tr>
										<td>Katrien Belmans</td>
										<td>0478/12.41.08</td>
									</tr>						
									<tr>
										<td>Katrien Melotte</td>
										<td>0470/69.33.50</td>
									</tr>
									<tr>
										<td>Sabine Poel</td>
										<td>0484/76.73.80</td>
									</tr>
									<tr>
										<td>Thijs Vanhie</td>
										<td>0471/52.17.20</td>
									</tr>
									<tr>
										<td>Julie Van Meel</td>
										<td>0472/33.66.19</td>
									</tr>
									<tr>
										<td>Ellen Van Nooten</td>
										<td>0494/87.85.66</td>
									</tr>
									
									<tr>
										<td>Hanne Verbruggen</td>
										<td>0472/87.46.33</td>
									</tr>
									<tr>
										<td>Katrien Vuerinckx</td>
										<td>0487/60.59.57</td>
									</tr>
								</table>
								
							</div>
						</div>
					</div>
				</div>
		</div>
		
	</section>
	
	<section class="section-footer">
		<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<h4>Groepspraktijk Nieuwrode</h4>
				<p>
					Dorp 13, bus 1<br/>
					3221 Nieuwrode
				</p>
			</div>
			<div class="col-sm-4">
				<h4>Praktijkruimte Linden</h4>
				<p>
					Houwaartstraat 114<br/>
					3210 Linden
				</p>
			</div>
			<div class="col-sm-4">
				<h4>Contacteer ons</h4>
				<ul class="list-unstyled">
					<li><i class="fa fa-phone"></i>&nbsp;&nbsp;<strong>016/43.55.71</strong></li>
					<li><i class="fa fa-envelope"></i>&nbsp;&nbsp;&nbsp;info@inacsi.be
				</ul>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12">
				<span><i class="fa fa-copyright"></i>&nbsp; ACSI 2017</span>
			</div>
		</div>
	</div>
	</section>