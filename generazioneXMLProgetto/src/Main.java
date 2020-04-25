public class Main {
    public static void main(String[] args) {

        String progressivo="";
        String formato="";

        String tipo="";
        String dA="";
        String idDispositivo="";

        String latGeo="";
        String longGeo="";

        String dal="";
        String al="";
        String dataOraRilevazione="";

        String aliquotaIVA="";
        String imposta="";
        String natura="";
        String ventilazioneIVA="";
        String ammontare="";
        String rifNormativo="";
        String importoParziale="";
        String totaleAmmontareResi="";
        String totaleAmmontareAnnulli="";
        String beniInSospeso="";
        String nonRiscossoServizi="";
        String nonRiscossoFatture="";
        String totaleDaFattureRT="";
        String nonRiscossoDCRaSSN="";
        String nonRiscossoOmaggio="";
        String codiceAttivita="";

        String numeroDocCommerciali="";
        String pagatoContanti="";
        String pagatoElettronico="";
        String scontoApagare="";

        String pagatoTicket="";
        String numeroTicket="";

        String venduto="";
        String vendutoContante="";
        String vendutoNoContante="";
        String incassato="";
        String incassatoRicarica="";
        String incassatoVendita="";
        String totaleResoTubiResto="";
        String totaleCaricatoTubiResto="";
        String totaleResoManualeTubiResto="";
        String totaleCaricatoManualeTubiResto="";
        String dataOraPrelievoPrec="";
        String progressivoPrelievo="";

        String vendutoC="";
        String vendutoContanteC="";
        String vendutoNoContanteC="";
        String incassatoC="";
        String incassatoRicaricaC="";
        String incassatoVenditaC="";
        String totaleResoTubiRestoC="";
        String totaleCaricatoTubiRestoC="";
        String totaleResoManualeTubiRestoC="";
        String totaleCaricatoManualeTubiRestoC="";

        String cFTecnico="";

        String idPaese="";
        String idCodice="";
        String dataOra="";
        String codice="";
        String note="";
        String numeroSw="";
        String dataRelease="";

        String matricola="";
        String dataOraS="";
        String codiceS="";
        String noteS="";


        GenerazioneXML xml=new GenerazioneXML();
        xml.crea( progressivo,  formato, tipo, dA,  idDispositivo, latGeo,
                 longGeo, dal, al, dataOraRilevazione, aliquotaIVA,  imposta,
                 natura,  ventilazioneIVA,  ammontare,  rifNormativo,  importoParziale,
                 totaleAmmontareResi,  totaleAmmontareAnnulli,  beniInSospeso,
                 nonRiscossoServizi,  nonRiscossoFatture,  totaleDaFattureRT,
                 nonRiscossoDCRaSSN,  nonRiscossoOmaggio,  codiceAttivita,  numeroDocCommerciali,
                 pagatoContanti,  pagatoElettronico,  scontoApagare,  pagatoTicket,
                 numeroTicket,  venduto,  vendutoContante,  vendutoNoContante,  incassato,
                 incassatoRicarica,  incassatoVendita,  totaleResoTubiResto,  totaleCaricatoTubiResto,
                 totaleResoManualeTubiResto,  totaleCaricatoManualeTubiResto,  dataOraPrelievoPrec,
                 progressivoPrelievo,  vendutoC,  vendutoContanteC,  vendutoNoContanteC,
                 incassatoC,  incassatoRicaricaC,  incassatoVenditaC,  totaleResoTubiRestoC,
                 totaleCaricatoTubiRestoC,  totaleResoManualeTubiRestoC,  totaleCaricatoManualeTubiRestoC,
                 cFTecnico,  idPaese,  idCodice,  dataOra,  codice,  note,
                 numeroSw,  dataRelease,  matricola,  dataOraS,  codiceS,
                 noteS);
    }
}
