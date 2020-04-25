import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import java.io.*;

public class GenerazioneXML {

    public void crea(String progressivo, String formato,String tipo,String dA, String idDispositivo,String latGeo,
                     String longGeo,String dal, String al,String dataOraRilevazione,String aliquotaIVA, String imposta,
                     String natura, String ventilazioneIVA, String ammontare, String rifNormativo, String importoParziale,
                     String totaleAmmontareResi, String totaleAmmontareAnnulli, String beniInSospeso,
                     String nonRiscossoServizi, String nonRiscossoFatture, String totaleDaFattureRT,
                     String nonRiscossoDCRaSSN, String nonRiscossoOmaggio, String codiceAttivita, String numeroDocCommerciali,
                     String pagatoContanti, String pagatoElettronico, String scontoApagare, String pagatoTicket,
                     String numeroTicket, String venduto, String vendutoContante, String vendutoNoContante, String incassato,
                     String incassatoRicarica, String incassatoVendita, String totaleResoTubiResto, String totaleCaricatoTubiResto,
                     String totaleResoManualeTubiResto, String totaleCaricatoManualeTubiResto, String dataOraPrelievoPrec,
                     String progressivoPrelievo, String vendutoC, String vendutoContanteC, String vendutoNoContanteC,
                     String incassatoC, String incassatoRicaricaC, String incassatoVenditaC, String totaleResoTubiRestoC,
                     String totaleCaricatoTubiRestoC, String totaleResoManualeTubiRestoC, String totaleCaricatoManualeTubiRestoC,
                     String cFTecnico, String idPaese, String idCodice, String dataOra, String codice, String note,
                     String numeroSw, String dataRelease, String matricola, String dataOraS, String codiceS,
                     String noteS){
        try {

            Element radice = new Element("DatiCorrispettivi");
            radice.setAttribute("versione","COR10");

            Element nodo1 = new Element("Trasmissione");


            Element ramo1 = new Element("Progressivo");
            ramo1.setText(progressivo);
            nodo1.addContent(ramo1);

            Element ramo2 = new Element("Formato");
            ramo2.setText(formato);
            nodo1.addContent(ramo2);

            Element nodo2 = new Element("Dispositivo");

            Element ramo3 = new Element("Tipo");
            ramo3.setText(tipo);
            nodo2.addContent(ramo3);

            Element ramo4 = new Element("IdDispositivo");
            ramo4.setText(idDispositivo);
            nodo2.addContent(ramo4);

            Element nodo3 = new Element("GeoLocalizzazione");

            Element ramo5 = new Element("Lat");
            ramo5.setText(latGeo);
            nodo3.addContent(ramo5);

            Element ramo6 = new Element("Long");
            ramo6.setText(longGeo);
            nodo3.addContent(ramo6);

            nodo1.addContent(nodo2);
            nodo2.addContent(nodo3);

            Element nodo4 = new Element("PeriodoInattivo");

            Element ramo7 = new Element("Dal");
            ramo7.setText(dal);
            nodo4.addContent(ramo7);

            Element ramo8 = new Element("Al");
            ramo8.setText(al);
            nodo4.addContent(ramo8);

            Element nodo5 = new Element("DataOraRilevazione");
            nodo5.setText(dataOraRilevazione);

            Element nodo6 = new Element("DatiRT");

            Element nodo7 = new Element("Riepilogo");
            nodo6.addContent(nodo7);

            Element nodo8 = new Element("IVA");
            nodo7.addContent(nodo8);

            Element ramo9 = new Element("AliquotaIVA");
            ramo9.setText(aliquotaIVA);
            nodo8.addContent(ramo9);

            Element ramo10 = new Element("Imposta");
            ramo10.setText("");
            nodo8.addContent(ramo10);

            Element nodo9 = new Element("Natura");
            nodo9.setText(natura);
            nodo7.addContent(nodo9);

            Element nodo39 = new Element("VentilazioneIVA");
            nodo39.setText(ventilazioneIVA);
            nodo7.addContent(nodo39);

            Element nodo40 = new Element("Ammontare");
            nodo40.setText(ammontare);
            nodo7.addContent(nodo40);

            Element nodo10 = new Element("RifNormativo");
            nodo10.setText(rifNormativo);
            nodo7.addContent(nodo10);

            Element nodo11 = new Element("ImportoParziale");
            nodo11.setText(importoParziale);
            nodo7.addContent(nodo11);

            Element nodo12 = new Element("TotaleAmmontareResi");
            nodo12.setText(totaleAmmontareResi);
            nodo7.addContent(nodo12);

            Element nodo13 = new Element("TotaleAmmontareAnnulli");
            nodo13.setText(totaleAmmontareAnnulli);
            nodo7.addContent(nodo13);

            Element nodo14 = new Element("BeniInSospeso");
            nodo14.setText(beniInSospeso);
            nodo7.addContent(nodo14);

            Element nodo15 = new Element("NonRiscossoServizi");
            nodo15.setText(nonRiscossoServizi);
            nodo7.addContent(nodo15);

            Element nodo16 = new Element("NonRiscossoFatture");
            nodo16.setText(nonRiscossoFatture);
            nodo7.addContent(nodo16);

            Element nodo17 = new Element("TotaleDaFattureRT");
            nodo17.setText(totaleDaFattureRT);
            nodo7.addContent(nodo17);

            Element nodo18 = new Element("NonRiscossoDCRaSSN");
            nodo18.setText(nonRiscossoDCRaSSN);
            nodo7.addContent(nodo18);

            Element nodo19 = new Element("NonRiscossoOmaggio");
            nodo19.setText(nonRiscossoOmaggio);
            nodo7.addContent(nodo19);

            Element nodo20 = new Element("CodiceAttivita");
            nodo20.setText(codiceAttivita);
            nodo7.addContent(nodo20);

            Element nodo21 = new Element("Totali");
            nodo7.addContent(nodo21);

            Element ramo11 = new Element("NumeroDocCommerciali");
            ramo11.setText(numeroDocCommerciali);
            nodo21.addContent(ramo11);

            Element ramo12 = new Element("PagatoContanti");
            ramo12.setText(pagatoContanti);
            nodo21.addContent(ramo12);

            Element ramo13 = new Element("PagatoElettronico");
            ramo13.setText(pagatoElettronico);
            nodo21.addContent(ramo13);

            Element ramo14 = new Element("ScontoApagare");
            ramo14.setText(scontoApagare);
            nodo21.addContent(ramo14);

            Element nodo22 = new Element("Ticket");
            nodo21.addContent(nodo22);

            Element ramo15 = new Element("PagatoTicket");
            ramo15.setText(pagatoTicket);
            nodo22.addContent(ramo15);

            Element ramo16 = new Element("NumeroTicket");
            ramo16.setText(numeroTicket);
            nodo22.addContent(ramo16);

            Element nodo23 = new Element("DatiDA");

            Element nodo24 = new Element("Periodo");
            nodo23.addContent(nodo24);

            Element ramo17 = new Element("Venduto");
            ramo17.setText(venduto);
            nodo24.addContent(ramo17);

            Element ramo18 = new Element("VendutoContante");
            ramo18.setText(vendutoContante);
            nodo24.addContent(ramo18);

            Element ramo19 = new Element("VendutoNoContante");
            ramo19.setText(vendutoNoContante);
            nodo24.addContent(ramo19);

            Element ramo20 = new Element("Incassato");
            ramo20.setText(incassato);
            nodo24.addContent(ramo20);

            Element ramo21 = new Element("IncassatoRicarica");
            ramo21.setText(incassatoRicarica);
            nodo24.addContent(ramo21);

            Element ramo22 = new Element("IncassatoVendita");
            ramo22.setText(incassatoVendita);
            nodo24.addContent(ramo22);

            Element ramo23 = new Element("TotaleResoTubiResto");
            ramo23.setText(totaleResoTubiResto);
            nodo24.addContent(ramo23);

            Element ramo24 = new Element("TotaleCaricatoTubiResto");
            ramo24.setText(totaleCaricatoTubiResto);
            nodo24.addContent(ramo24);

            Element ramo25 = new Element("TotaleResoManualeTubiResto");
            ramo25.setText(totaleResoManualeTubiResto);
            nodo24.addContent(ramo25);

            Element ramo26 = new Element("TotaleCaricatoManualeTubiResto");
            ramo26.setText(totaleCaricatoManualeTubiResto);
            nodo24.addContent(ramo26);

            Element ramo27 = new Element("DataOraPrelievoPrec");
            ramo27.setText(dataOraPrelievoPrec);
            nodo24.addContent(ramo27);

            Element ramo28 = new Element("ProgressivoPrelievo");
            ramo28.setText(progressivoPrelievo);
            nodo24.addContent(ramo28);

            Element nodo25 = new Element("Cumulato");
            nodo23.addContent(nodo25);

            Element ramo29 = new Element("Venduto");
            ramo29.setText(vendutoC);
            nodo25.addContent(ramo29);

            Element ramo30 = new Element("VendutoContante");
            ramo30.setText(vendutoContanteC);
            nodo25.addContent(ramo30);

            Element ramo31 = new Element("VendutoNoContante");
            ramo31.setText(vendutoNoContanteC);
            nodo25.addContent(ramo31);

            Element ramo32 = new Element("Incassato");
            ramo32.setText(incassatoC);
            nodo25.addContent(ramo32);

            Element ramo33 = new Element("IncassatoRicarica");
            ramo33.setText(incassatoRicaricaC);
            nodo25.addContent(ramo33);

            Element ramo34 = new Element("IncassatoVendita");
            ramo34.setText(incassatoVenditaC);
            nodo25.addContent(ramo34);

            Element ramo35 = new Element("TotaleResoTubiResto");
            ramo35.setText("9");
            nodo25.addContent(ramo35);

            Element ramo36 = new Element("TotaleCaricatoTubiResto");
            ramo36.setText(totaleResoTubiRestoC);
            nodo25.addContent(ramo36);

            Element ramo37 = new Element("TotaleResoManualeTubiResto");
            ramo37.setText(totaleResoManualeTubiRestoC);
            nodo25.addContent(ramo37);

            Element ramo38 = new Element("TotaleCaricatoManualeTubiResto");
            ramo38.setText(totaleResoManualeTubiRestoC);
            nodo25.addContent(ramo38);

            Element nodo26 = new Element("InterventoTecnico");

            Element nodo27 = new Element("CFTecnico");
            nodo27.setText(cFTecnico);
            nodo26.addContent(nodo27);

            Element nodo28 = new Element("IdIVALaboratorio");
            nodo26.addContent(nodo28);

            Element ramo39 = new Element("IdPaese");
            ramo39.setText(idPaese);
            nodo28.addContent(ramo39);

            Element ramo40 = new Element("IdCodice");
            ramo40.setText(idCodice);
            nodo28.addContent(ramo40);

            Element nodo29 = new Element("DataOra");
            nodo29.setText(dataOra);
            nodo26.addContent(nodo29);

            Element nodo30 = new Element("Codice");
            nodo30.setText(codice);
            nodo26.addContent(nodo30);

            Element nodo31 = new Element("Note");
            nodo31.setText(note);
            nodo26.addContent(nodo31);

            Element nodo32 = new Element("NumeroSw");
            nodo32.setText(numeroSw);
            nodo26.addContent(nodo32);

            Element nodo33 = new Element("DataRelease");
            nodo33.setText(dataRelease);
            nodo26.addContent(nodo33);

            Element nodo34 = new Element("Segnalazione");

            Element nodo35 = new Element("Matricola");
            nodo35.setText(matricola);
            nodo34.addContent(nodo35);

            Element nodo36 = new Element("DataOra");
            nodo36.setText(dataOraS);
            nodo34.addContent(nodo36);

            Element nodo37 = new Element("Codice");
            nodo37.setText(codiceS);
            nodo34.addContent(nodo37);

            Element nodo38 = new Element("Note");
            nodo38.setText(noteS);
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
            /* ! cambiare il path !*/
            //tutte le volte scrive in questo file (sovrascirive)
            outputter.output(document, new FileOutputStream("E:\\_scontrino\\generazioneXML\\src\\scontrino"));
            System.out.println("File creato:");
            outputter.output(document, System.out);
        } catch (IOException e) {
            System.err.println("Errore durante il parsing del documento");
            e.printStackTrace();
        }
    }
}