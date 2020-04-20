import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import java.io.*;

public class Scontrino {

    public void crea(){
        try {
           
            Element radice = new Element("DatiCorrispettivi");
            radice.setAttribute("versione","COR10");
            radice.setAttribute("simulazione","true");

            Element nodo1 = new Element("Trasmissione");

           
            Element ramo1 = new Element("Progressivo");
            ramo1.setText("");
            nodo1.addContent(ramo1);

            Element ramo2 = new Element("Formato");
            ramo2.setText("");
            nodo1.addContent(ramo2);

            Element nodo2 = new Element("Dispositivo");

            Element ramo3 = new Element("Tipo");
            ramo3.setText("DA");
            nodo2.addContent(ramo3);

            Element ramo4 = new Element("IdDispositivo");
            ramo4.setText("IdDispositivo1");
            nodo2.addContent(ramo4);
			
            Element nodo3 = new Element("GeoLocalizzazione");

            Element ramo5 = new Element("Lat");
            ramo5.setText("1");
            nodo3.addContent(ramo5);

            Element ramo6 = new Element("Long");
            ramo6.setText("1");
            nodo3.addContent(ramo6);

            nodo1.addContent(nodo2);
            nodo2.addContent(nodo3);

            Element nodo4 = new Element("PeriodoInattivo");

            Element ramo7 = new Element("Dal");
            ramo7.setText("");
            nodo4.addContent(ramo7);

            Element ramo8 = new Element("Al");
            ramo8.setText("");
            nodo4.addContent(ramo8);

            Element nodo5 = new Element("DataOraRilevazione");
            nodo5.setText("");

            Element nodo6 = new Element("DatiRT");

            Element nodo7 = new Element("Riepilogo");
            nodo6.addContent(nodo7);

            Element nodo8 = new Element("IVA");
            nodo7.addContent(nodo8);

            Element ramo9 = new Element("AliquotaIVA");
            ramo9.setText("");
            nodo8.addContent(ramo9);

            Element ramo10 = new Element("Imposta");
            ramo10.setText("");
            nodo8.addContent(ramo10);

            Element nodo9 = new Element("Natura");
            nodo9.setText("");
            nodo7.addContent(nodo9);

            Element nodo39 = new Element("VentilazioneIVA");
            nodo39.setText("1");
            nodo7.addContent(nodo39);

            Element nodo40 = new Element("Ammontare");
            nodo40.setText("");
            nodo7.addContent(nodo40);

            Element nodo10 = new Element("RifNormativo");
            nodo10.setText("");
            nodo7.addContent(nodo10);

            Element nodo11 = new Element("ImportoParziale");
            nodo11.setText("");
            nodo7.addContent(nodo11);

            Element nodo12 = new Element("TotaleAmmontareResi");
            nodo12.setText("");
            nodo7.addContent(nodo12);

            Element nodo13 = new Element("TotaleAmmontareAnnulli");
            nodo13.setText("1");
            nodo7.addContent(nodo13);

            Element nodo14 = new Element("BeniInSospeso");
            nodo14.setText("1");
            nodo7.addContent(nodo14);

            Element nodo15 = new Element("NonRiscossoServizi");
            nodo15.setText("1");
            nodo7.addContent(nodo15);

            Element nodo16 = new Element("NonRiscossoFatture");
            nodo16.setText("1");
            nodo7.addContent(nodo16);

            Element nodo17 = new Element("TotaleDaFattureRT");
            nodo17.setText("1");
            nodo7.addContent(nodo17);

            Element nodo18 = new Element("NonRiscossoDCRaSSN");
            nodo18.setText("1");
            nodo7.addContent(nodo18);

            Element nodo19 = new Element("NonRiscossoOmaggio");
            nodo19.setText("1");
            nodo7.addContent(nodo19);

            Element nodo20 = new Element("CodiceAttivita");
            nodo20.setText("1");
            nodo7.addContent(nodo20);

            Element nodo21 = new Element("Totali");
            nodo7.addContent(nodo21);

            Element ramo11 = new Element("NumeroDocCommerciali");
            ramo11.setText("1");
            nodo21.addContent(ramo11);

            Element ramo12 = new Element("PagatoContanti");
            ramo12.setText("1");
            nodo21.addContent(ramo12);

            Element ramo13 = new Element("PagatoElettronico");
            ramo13.setText("1");
            nodo21.addContent(ramo13);

            Element ramo14 = new Element("ScontoApagare");
            ramo14.setText("1");
            nodo21.addContent(ramo14);

            Element nodo22 = new Element("Ticket");
            nodo21.addContent(nodo22);

            Element ramo15 = new Element("PagatoTicket");
            ramo15.setText("1");
            nodo22.addContent(ramo15);

            Element ramo16 = new Element("NumeroTicket");
            ramo16.setText("1");
            nodo22.addContent(ramo16);

            Element nodo23 = new Element("DatiDA");

            Element nodo24 = new Element("Periodo");
            nodo23.addContent(nodo24);

            Element ramo17 = new Element("Venduto");
            ramo17.setText("9");
            nodo24.addContent(ramo17);

            Element ramo18 = new Element("VendutoContante");
            ramo18.setText("9");
            nodo24.addContent(ramo18);

            Element ramo19 = new Element("VendutoNoContante");
            ramo19.setText("9");
            nodo24.addContent(ramo19);

            Element ramo20 = new Element("Incassato");
            ramo20.setText("9");
            nodo24.addContent(ramo20);

            Element ramo21 = new Element("IncassatoRicarica");
            ramo21.setText("9");
            nodo24.addContent(ramo21);

            Element ramo22 = new Element("IncassatoVendita");
            ramo22.setText("9");
            nodo24.addContent(ramo22);

            Element ramo23 = new Element("TotaleResoTubiResto");
            ramo23.setText("9");
            nodo24.addContent(ramo23);

            Element ramo24 = new Element("TotaleCaricatoTubiResto");
            ramo24.setText("9");
            nodo24.addContent(ramo24);

            Element ramo25 = new Element("TotaleResoManualeTubiResto");
            ramo25.setText("9");
            nodo24.addContent(ramo25);

            Element ramo26 = new Element("TotaleCaricatoManualeTubiResto");
            ramo26.setText("9");
            nodo24.addContent(ramo26);

            Element ramo27 = new Element("DataOraPrelievoPrec");
            ramo27.setText("9");
            nodo24.addContent(ramo27);

            Element ramo28 = new Element("ProgressivoPrelievo");
            ramo28.setText("9");
            nodo24.addContent(ramo28);

            Element nodo25 = new Element("Cumulato");
            nodo23.addContent(nodo25);

            Element ramo29 = new Element("Venduto");
            ramo29.setText("9");
            nodo25.addContent(ramo29);

            Element ramo30 = new Element("VendutoContante");
            ramo30.setText("9");
            nodo25.addContent(ramo30);

            Element ramo31 = new Element("VendutoNoContante");
            ramo31.setText("9");
            nodo25.addContent(ramo31);

            Element ramo32 = new Element("Incassato");
            ramo32.setText("9");
            nodo25.addContent(ramo32);

            Element ramo33 = new Element("IncassatoRicarica");
            ramo33.setText("9");
            nodo25.addContent(ramo33);

            Element ramo34 = new Element("IncassatoVendita");
            ramo34.setText("9");
            nodo25.addContent(ramo34);

            Element ramo35 = new Element("TotaleResoTubiResto");
            ramo35.setText("9");
            nodo25.addContent(ramo35);

            Element ramo36 = new Element("TotaleCaricatoTubiResto");
            ramo36.setText("9");
            nodo25.addContent(ramo36);

            Element ramo37 = new Element("TotaleResoManualeTubiResto");
            ramo37.setText("9");
            nodo25.addContent(ramo37);

            Element ramo38 = new Element("TotaleCaricatoManualeTubiResto");
            ramo38.setText("9");
            nodo25.addContent(ramo38);

            Element nodo26 = new Element("InterventoTecnico");

            Element nodo27 = new Element("CFTecnico");
            nodo27.setText("CFTecnico1");
            nodo26.addContent(nodo27);

            Element nodo28 = new Element("IdIVALaboratorio");
            nodo26.addContent(nodo28);

            Element ramo39 = new Element("IdPaese");
            ramo39.setText("IdPaese1");
            nodo28.addContent(ramo39);

            Element ramo40 = new Element("IdCodice");
            ramo40.setText("IdCodice__1");
            nodo28.addContent(ramo40);

            Element nodo29 = new Element("DataOra");
            nodo29.setText("1900-01-01T01:01:01+01:00");
            nodo26.addContent(nodo29);

            Element nodo30 = new Element("Codice");
            nodo30.setText("Codice1");
            nodo26.addContent(nodo30);

            Element nodo31 = new Element("Note");
            nodo31.setText("Note1");
            nodo26.addContent(nodo31);

            Element nodo32 = new Element("NumeroSw");
            nodo32.setText("NumeroSw1");
            nodo26.addContent(nodo32);

            Element nodo33 = new Element("DataRelease");
            nodo33.setText("1900-01-01T01:01:01+01:00");
            nodo26.addContent(nodo33);

            Element nodo34 = new Element("Segnalazione");

            Element nodo35 = new Element("Matricola");
            nodo35.setText("Matricola1");
            nodo34.addContent(nodo35);

            Element nodo36 = new Element("DataOra");
            nodo36.setText("1900-01-01T01:01:01+01:00");
            nodo34.addContent(nodo36);

            Element nodo37 = new Element("Codice");
            nodo37.setText("Codice1");
            nodo34.addContent(nodo37);

            Element nodo38 = new Element("Note");
            nodo38.setText("Note1");
            nodo34.addContent(nodo38);

            radice.addContent(nodo1);
            radice.addContent(nodo4);
            radice.addContent(nodo5);
            radice.addContent(nodo6);
            radice.addContent(nodo23);
            radice.addContent(nodo26);
            radice.addContent(nodo34);

            Document document = new Document(radice);
            XMLOutputter outputter = new XMLOutputter();
            outputter.setFormat(Format.getPrettyFormat());
            outputter.output(document, new FileOutputStream("E:\\_scontrino\\scritturaXML\\src\\fileFinale.xml"));
            System.out.println("File creato:");
            outputter.output(document, System.out);
        } catch (IOException e) {
            System.err.println("Errore durante il parsing del documento");
            e.printStackTrace();
        }
    }
}