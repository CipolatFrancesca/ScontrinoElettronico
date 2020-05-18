import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import java.io.*;

//https://www.codicefacile.it/java/jdom-file-xml-e-java-leggere-e-scrivere-un-file-xml

public class Scontrino {

    //float gia convertiti in string
    String idProgressivo;
    String datoTipo;
    String datoIdDispositivo;
    String datoLat;
    String datoLong;
    String dataOraDal;
    String dataOraAl;
    String dataOraRilevazione;
    String datoAliquotaIVA;
    String datoImposta;
    String datoNatura;
    String datoAmmontare;
    String datoRifNormativo;
    String datoImortoParziale;
    String datoTotaleAmmontareResi;
    String datoTotaleAmmontareAnnulli;
    String datoBeniInSospeso;
    String datoNonRiscossoServizi;
    String datoNonRiscossoFatture;
    String datoTotaleDaFattureRT;
    String datoNonRiscossoDCRaSSN;
    String datoNonRiscossoOmaggio;
    String datoCodiceAttivita;
    String datoNumeroDocCommerciali;
    String datoPagatoContanti;
    String datoPagatoElettronico;
    String datoScontoApagare;
    String datoPagatoTicket;
    String datoNumeroTicket;
    String datoVendutoP;
    String datoVendutoContanteP;
    String datoVendutoNoContanteP;
    String datoIncassatoP;
    String datoIncassatoRicaricaP;
    String datoIncassatoVenditaP;
    String datoTotaleResoTubiRestoP;
    String datoTotaleCaricatoTubiRestoP;
    String datoTotaleResoManualeTubiRestoP;
    String datoTotaleCaricatoManualeTubiRestoP;
    String datoDataOraPrelievoPrecP;
    String datoProgressivoPrelievoP;
    String datoVendutoC;
    String datoVendutoContanteC;
    String datoVendutoNoContanteC;
    String datoIncassatoC;
    String datoIncassatoRicaricaC;
    String datoIncassatoVenditaC;
    String datoTotaleResoTubiRestoC;
    String datoTotaleCaricatoTubiRestoC;
    String datoTotaleResoManualeTubiRestoC;
    String datoTotaleCaricatoManualeTubiRestoC;

    String datoCFTecnico;
    String datoIdPaese;
    String datoIdCodice;
    String datoDataOraIT;
    String datoCodiceIT;
    String datoNumeroSW;
    String datoDataRelease;
    String datoNoteIT;

    String datoMatricola;

    String datoDataOraS;

    String datoCodiceS;

    String datoNoteS;



    public Scontrino() {}

    public Scontrino(String datoTipo, String datoIdDispositivo, String datoLat, String datoLong) {
        this.datoTipo = datoTipo;
        this.datoIdDispositivo = datoIdDispositivo;
        this.datoLat = datoLat;
        this.datoLong = datoLong;
    }

    public Scontrino(String idProgressivo, String dataOraDal, String dataOraAl, String dataOraRilevazione, String datoAliquotaIVA, String datoImposta, String datoNatura, String datoAmmontare, String datoRifNormativo, String datoImortoParziale, String datoTotaleAmmontareResi, String datoTotaleAmmontareAnnulli, String datoBeniInSospeso, String datoNonRiscossoServizi, String datoNonRiscossoFatture, String datoTotaleDaFattureRT, String datoNonRiscossoDCRaSSN, String datoNonRiscossoOmaggio, String datoCodiceAttivita, String datoNumeroDocCommerciali, String datoPagatoContanti, String datoPagatoElettronico, String datoScontoApagare, String datoPagatoTicket, String datoNumeroTicket, String datoVendutoP, String datoVendutoContanteP, String datoVendutoNoContanteP, String datoIncassatoP, String datoIncassatoRicaricaP, String datoIncassatoVenditaP, String datoTotaleResoTubiRestoP, String datoTotaleCaricatoTubiRestoP, String datoTotaleResoManualeTubiRestoP, String datoTotaleCaricatoManualeTubiRestoP, String datoDataOraPrelievoPrecP, String datoProgressivoPrelievoP, String datoVendutoC, String datoVendutoContanteC, String datoVendutoNoContanteC, String datoIncassatoC, String datoIncassatoRicaricaC, String datoIncassatoVenditaC, String datoTotaleResoTubiRestoC, String datoTotaleCaricatoTubiRestoC, String datoTotaleResoManualeTubiRestoC, String datoTotaleCaricatoManualeTubiRestoC, String datoCFTecnico, String datoIdPaese, String datoIdCodice, String datoDataOraIT, String datoCodiceIT, String datoNumeroSW, String datoDataRelease, String datoNoteIT, String datoMatricola, String datoDataOraS, String datoCodiceS, String datoNoteS) {
        this.idProgressivo = idProgressivo;
        this.dataOraDal = dataOraDal;
        this.dataOraAl = dataOraAl;
        this.dataOraRilevazione = dataOraRilevazione;
        this.datoAliquotaIVA = datoAliquotaIVA;
        this.datoImposta = datoImposta;
        this.datoNatura = datoNatura;
        this.datoAmmontare = datoAmmontare;
        this.datoRifNormativo = datoRifNormativo;
        this.datoImortoParziale = datoImortoParziale;
        this.datoTotaleAmmontareResi = datoTotaleAmmontareResi;
        this.datoTotaleAmmontareAnnulli = datoTotaleAmmontareAnnulli;
        this.datoBeniInSospeso = datoBeniInSospeso;
        this.datoNonRiscossoServizi = datoNonRiscossoServizi;
        this.datoNonRiscossoFatture = datoNonRiscossoFatture;
        this.datoTotaleDaFattureRT = datoTotaleDaFattureRT;
        this.datoNonRiscossoDCRaSSN = datoNonRiscossoDCRaSSN;
        this.datoNonRiscossoOmaggio = datoNonRiscossoOmaggio;
        this.datoCodiceAttivita = datoCodiceAttivita;
        this.datoNumeroDocCommerciali = datoNumeroDocCommerciali;
        this.datoPagatoContanti = datoPagatoContanti;
        this.datoPagatoElettronico = datoPagatoElettronico;
        this.datoScontoApagare = datoScontoApagare;
        this.datoPagatoTicket = datoPagatoTicket;
        this.datoNumeroTicket = datoNumeroTicket;
        this.datoVendutoP = datoVendutoP;
        this.datoVendutoContanteP = datoVendutoContanteP;
        this.datoVendutoNoContanteP = datoVendutoNoContanteP;
        this.datoIncassatoP = datoIncassatoP;
        this.datoIncassatoRicaricaP = datoIncassatoRicaricaP;
        this.datoIncassatoVenditaP = datoIncassatoVenditaP;
        this.datoTotaleResoTubiRestoP = datoTotaleResoTubiRestoP;
        this.datoTotaleCaricatoTubiRestoP = datoTotaleCaricatoTubiRestoP;
        this.datoTotaleResoManualeTubiRestoP = datoTotaleResoManualeTubiRestoP;
        this.datoTotaleCaricatoManualeTubiRestoP = datoTotaleCaricatoManualeTubiRestoP;
        this.datoDataOraPrelievoPrecP = datoDataOraPrelievoPrecP;
        this.datoProgressivoPrelievoP = datoProgressivoPrelievoP;
        this.datoVendutoC = datoVendutoC;
        this.datoVendutoContanteC = datoVendutoContanteC;
        this.datoVendutoNoContanteC = datoVendutoNoContanteC;
        this.datoIncassatoC = datoIncassatoC;
        this.datoIncassatoRicaricaC = datoIncassatoRicaricaC;
        this.datoIncassatoVenditaC = datoIncassatoVenditaC;
        this.datoTotaleResoTubiRestoC = datoTotaleResoTubiRestoC;
        this.datoTotaleCaricatoTubiRestoC = datoTotaleCaricatoTubiRestoC;
        this.datoTotaleResoManualeTubiRestoC = datoTotaleResoManualeTubiRestoC;
        this.datoTotaleCaricatoManualeTubiRestoC = datoTotaleCaricatoManualeTubiRestoC;
        this.datoCFTecnico = datoCFTecnico;
        this.datoIdPaese = datoIdPaese;
        this.datoIdCodice = datoIdCodice;
        this.datoDataOraIT = datoDataOraIT;
        this.datoCodiceIT = datoCodiceIT;
        this.datoNumeroSW = datoNumeroSW;
        this.datoDataRelease = datoDataRelease;
        this.datoNoteIT = datoNoteIT;
        this.datoMatricola = datoMatricola;
        this.datoDataOraS = datoDataOraS;
        this.datoCodiceS = datoCodiceS;
        this.datoNoteS = datoNoteS;
    }

    public void crea(Scontrino scontrino1, Scontrino scontrino ){

        //storico scontrini, ogni volta creo un vuovo file con progressivo

        try {
            //Elemento radice
            Element radice = new Element("DatiCorrispettivi");
            radice.setAttribute("versione","COR10");
            radice.setAttribute("simulazione","true");

            //Trasmissione: campo obbligatorio contenente informazioni che identificano univocamente
            // il tipo di trasmissione ed il soggetto che trasmette

            Element nodo1 = new Element("Trasmissione");

            //Progressivo: deve essere strettamente sequenziale ed univoco per dispositivo
            // formato numerico
            Element ramo1 = new Element("Progressivo");
            ramo1.setText(scontrino.idProgressivo);
            nodo1.addContent(ramo1);

            //Formato:Codice identificativo del tipo di trasmissione che si sta effettuando
            //valori ammessi: [COR10]
            Element ramo2 = new Element("Formato");
            ramo2.setText("COR10");
            nodo1.addContent(ramo2);

            //Dispositivo: Elementi identificativi del dispositivo di provenienza dei dati trasmessi; viene
            //valorizzato solo nei casi di vending machine (soluzione transitoria) o nei casi di soggetti
            //con più punti cassa per singolo punto vendita (in quest'ultimo caso identifica la singola
            //cassa)
            Element nodo2 = new Element("Dispositivo");

            //Tipo: Tipologia del dispositivo
            //valori ammessi:
            //[DA]: vending machine
            //[MC]: soggetti con più punti cassa per singolo punto vendita
            Element ramo3 = new Element("Tipo");
            ramo3.setText(scontrino1.datoTipo);
            nodo2.addContent(ramo3);

            //IdDispositivo: Numero identificativo del dispositivo. Nei casi di palmare che trasmette i dati della
            //vending machine nella soluzione transitoria,rappresenta l'ID del sistema master del
            //distributore; nei casi di più punti cassa per punto vendita, rappresenta l'ID del singolo punto cassa.
            //formato alfanumerico
            Element ramo4 = new Element("IdDispositivo");
            ramo4.setText(scontrino1.datoIdDispositivo);
            nodo2.addContent(ramo4);

            //GeoLocalizzazione: Identificazione della posizione geografica del dispositivo (da valorizzare nei soli casi di
            //vending machine, campo 1.3.1 = 'DA'
            Element nodo3 = new Element("GeoLocalizzazione");

            //Lat:Latitudine espressa in gradi decimali
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo5 = new Element("Lat");
            ramo5.setText(scontrino1.datoLat);
            nodo3.addContent(ramo5);

            //Long: Longitudine espressa in gradi decimali
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo6 = new Element("Long");
            ramo6.setText(scontrino1.datoLong);
            nodo3.addContent(ramo6);

            nodo1.addContent(nodo2);
            nodo2.addContent(nodo3);

            //PeriodoInattivo: Blocco da valorizzare per comunicare un eventuale periodo con corrispettivi di importo
            //pari a zero
            Element nodo4 = new Element("PeriodoInattivo");

            //Dal:Data e ora iniziali del periodo in cui, causa interruzione dell'attività
            // (per ferie, chiusura per eventi straordinari o per qualsiasi altro
            //motivo), i corrispettivi sono di importo zero; se l'ora non rileva,
            // può essere valorizzata a 00:00:00
            //formato ISO 8601:2004, con la precisione seguente:YYYY-MM-DDTHH:MM:SS
            Element ramo7 = new Element("Dal");
            ramo7.setText(scontrino.dataOraDal);
            nodo4.addContent(ramo7);

            //Al:Data e ora finali del periodo in cui, causa interruzione dell'attività (per ferie, chiusura
            //per eventi straordinari o per qualsiasi altro motivo), i corrispettivi sono di importo zero;se l'ora non rileva, può essere valorizzata a 00:00:00
            //formato ISO 8601:2004, con la precisione seguente: YYYY-MM-DDTHH:MM:SS
            Element ramo8 = new Element("Al");
            ramo8.setText(scontrino.dataOraAl);
            nodo4.addContent(ramo8);

            //DataOraRilevazione: Per RT: data e ora della chiusura giornaliera.
            // Per VM: data e ora rilevazione dei corrispettivi presente nel Sistema master; se
            //l'ora non presente deve coincidere con quella di rilevazione del dato dal DM
            //formato ISO 8601:2004, con la precisione seguente: YYYY-MM-DDTHH:MM:SS
            Element nodo5 = new Element("DataOraRilevazione");
            nodo5.setText(scontrino.dataOraRilevazione);

            //DatiRT:Blocco obbligatorio per i dati contabili-fiscali provenienti dai registratori
            // telematici o dai soggetti con più punti cassa per singolo punto vendita
            Element nodo6 = new Element("DatiRT");

            //Riepilogo: Blocco che si ripete per ogni aliquota IVA, Natura o Ventilazione IVA
            Element nodo7 = new Element("Riepilogo");
            nodo6.addContent(nodo7);

            //IVA: Blocco presente per i soggetti IVA che non optano per la “Ventilazione IVA”.
            // Elemento in alternativa con 4.1.2 <Natura> e 4.1.3 <VentilazioneIVA>
            Element nodo8 = new Element("IVA");
            nodo7.addContent(nodo8);

            //AliquotaIVA:Aliquota (%) IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo9 = new Element("AliquotaIVA");
            ramo9.setText(scontrino.datoAliquotaIVA);
            nodo8.addContent(ramo9);

            //Imposta: Imposta risultante dall'applicazione dell'aliquota IVA all'imponibile.
            //Tale campo deve contenere l’imposta IVA relativa agli imponibili al netto dei campi
            //riguardanti il non riscosso dal 4.1.7 al 4.1.13. Tale valore è quello calcolato sull’
            // importo riportato nel campo 4.1.6 <ImportoParziale>, comprensivo anche dell’importo
            // riportato nel campo 4.1.14 <NonRiscossoOmaggio>.
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo10 = new Element("Imposta");
            ramo10.setText(scontrino.datoImposta);
            nodo8.addContent(ramo10);

            //Natura:Natura delle operazioni qualora non rientrino tra quelle 'imponibili'.
            // Elemento in alternativa con 4.1.1 <IVA> e 4.1.3 <VentilazioneIVA>
            /*valori ammessi:
                N1:escluse ex art. 15
                N2:non soggette
                N3:non imponibili
                N4:Esenti
                N5:regime del margine
                N6:Altro non IVA
            */
            Element nodo9 = new Element("Natura");
            nodo9.setText(scontrino.datoNatura);
            nodo7.addContent(nodo9);

            //VentilazioneIVA:Indica l'eventuale applicazione della ventilazione dell'IVA
            // sui corrispettivi (ex DM 3495 del 24/02/1973). Elemento in alternativa
            //con 4.1.2 <Natura> e 4.1.1 <IVA>
            //valori ammessi: [SI]
            Element nodo39 = new Element("VentilazioneIVA");
            nodo39.setText("SI");
            nodo7.addContent(nodo39);

            //Ammontare: Questo valore rappresenta: base imponibile complessiva, per le
            //operazioni soggette ad IVA; nel caso in cui è stata compilata la sezione 4.1.1 <IVA>
            //importo, per le operazioni che non rientrano tra quelle 'imponibili'; nel caso in
            // cui è stato compilato il campo 4.1.2 <Natura> totale complessivo, importo senza
            //distinzione di ammontare e imposta previsto dall’ ex art. 2 del DM 3495 del 24/02/1973;
            //nel caso in cui è stato compilato il campo 4.1.3 <VentilazioneIVA>. Tale importo
            //corrisponde al totale dei corrispettivi memorizzati dall’RT, quindi al lordo dei
            //corrispettivi non riscossi e della quota parte dei corrispettivi a fronte dei quali
            //sono stati acquisiti ticket restaurant. Il valore <Ammontare> deve essere uguale
            //alla somma degli importi riportati nei campi da 4.1.6 al campo 4.1.14.
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto).
            Element nodo40 = new Element("Ammontare");
            nodo40.setText(scontrino.datoAmmontare);
            nodo7.addContent(nodo40);

            //RifNormativo: Eventuale riferimento normativo (ex art. 21, comma 6, DPR 633/72)
            //formato alfanumerico
            Element nodo10 = new Element("RifNormativo");
            nodo10.setText(scontrino.datoRifNormativo);
            nodo7.addContent(nodo10);

            //ImportoParziale:Tale importo è quello dell’ammontare imponibile totale da
            // assoggettare ad IVA, comprensivo anche dell’importo riportato nel
            //campo 4.1.14 <NonRiscossoOmaggio>.
            //Per le operazioni soggette ad IVA, deve rappresentare il valore complessivo dei
            //corrispettivi al netto dell’IVA, al lordo dei corrispettivi non riscossi per
            // cessioni di beni consegnati e al netto dei seguenti valori:
            //- resi;
            //- annulli;
            //- corrispettivi non riscossi in caso di cessione di beni in sospeso (non consegnati);
            //- corrispettivi non riscossi in caso di prestazioni di servizi;
            //- corrispettivi non riscossi per i quali, al documento commerciale è collegata una
            // fattura;
            //- corrispettivi derivanti dalle fatture emesse tramite il medesimo RT;
            //- corrispettivi non riscossi in caso di “Distinta Contabile Riepilogativa SSN”
            //(solo per RT configurati per sistema TS);
            //Le stesse regole si applicano nel caso di operazioni con valorizzazione del campo
            //“Natura IVA” ovvero nel caso di Ventilazione.
            //In caso di Ventilazione questo importo è al lordo dell’IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element nodo11 = new Element("ImportoParziale");
            nodo11.setText(scontrino.datoImortoParziale);
            nodo7.addContent(nodo11);

            //TotaleAmmontareResi: Ammontare totale degli eventuali resi effettuati dall’esercente
            //(ammontareimponibile al netto dell’IVA).In caso di Ventilazione questo importo è al
            //lordo dell’IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element nodo12 = new Element("TotaleAmmontareResi");
            nodo12.setText(scontrino.datoTotaleAmmontareResi);
            nodo7.addContent(nodo12);

            //Ammontare totale dei documenti commerciali eventualmente annullati dall’esercente
            //(ammontare imponibile al netto dell’IVA). In caso di Ventilazione questo importo è al
            //lordo dell’IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element nodo13 = new Element("TotaleAmmontareAnnulli");
            nodo13.setText(scontrino.datoTotaleAmmontareAnnulli);
            nodo7.addContent(nodo13);

            //Ammontare totale dei corrispettivi non riscossi contenuti nei documenti commerciali
            //emessi a fronte di cessioni di beni per le quali il bene non è stato consegnato al cliente.
            //L’importo deve essere al netto dell’IVA. In caso di Ventilazione questo importo è al
            //lordo dell’IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element nodo14 = new Element("BeniInSospeso");
            nodo14.setText(scontrino.datoBeniInSospeso);
            nodo7.addContent(nodo14);

            //Ammontare totale dei corrispettivi non riscossi contenuti nei documenti commerciali
            //emessi a fronte di prestazioni di servizi. L’importo deve essere al netto dell’IVA.
            //In caso di Ventilazione questo importo è al lordo dell’IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element nodo15 = new Element("NonRiscossoServizi");
            nodo15.setText(scontrino.datoNonRiscossoServizi);
            nodo7.addContent(nodo15);

            //Ammontare totale dei corrispettivi non riscossi contenuti nei documenti commerciali
            //emessi e collegati a fatture. L’importo deve essere al netto dell’IVA.
            //In caso di Ventilazione questo importo è al lordo dell’IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element nodo16 = new Element("NonRiscossoFatture");
            nodo16.setText(scontrino.datoNonRiscossoFatture);
            nodo7.addContent(nodo16);

            //Ammontare totale dei corrispettivi contenuti nelle fatture emesse da RT.
            //L’importo deve essere al netto dell’IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element nodo17 = new Element("TotaleDaFattureRT");
            nodo17.setText(scontrino.datoTotaleDaFattureRT);
            nodo7.addContent(nodo17);

            //Ammontare totale dei corrispettivi non riscossi contenuti nella Distinta Contabile
            //Riepilogativa da trasmettere al SSN. L’importo deve essere al netto dell’IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element nodo18 = new Element("NonRiscossoDCRaSSN");
            nodo18.setText(scontrino.datoNonRiscossoDCRaSSN);
            nodo7.addContent(nodo18);

            //Ammontare totale dei corrispettivi non riscossi per omaggi, da includere
            //nell’ammontare imponibile totale da assoggettare ad IVA rappresentato dal
            //campo 4.1.6 <ImportoParziale> L’importo deve essere al netto dell’IVA.
            //In caso di Ventilazione questo importo è al lordo dell’IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element nodo19 = new Element("NonRiscossoOmaggio");
            nodo19.setText(scontrino.datoNonRiscossoOmaggio);
            nodo7.addContent(nodo19);

            //Codice attività, indicando senza separatori quanto presente nella tabella di ATECO di
            //classificazione delle attività economiche, a cui l’importo parziale si riferisce
            //formato numerico
            Element nodo20 = new Element("CodiceAttivita");
            nodo20.setText(scontrino.datoCodiceAttivita);
            nodo7.addContent(nodo20);

            //Blocco sempre obbligatorio contenente informazioni relative ai documenti
            //commerciali emessi ed alle modalità di pagamento utilizzate
            Element nodo21 = new Element("Totali");
            nodo7.addContent(nodo21);

            //Numero complessivo dei documenti commerciali emessi dall’RT.
            //formato numerico
            Element ramo11 = new Element("NumeroDocCommerciali");
            ramo11.setText(scontrino.datoNumeroDocCommerciali);
            nodo21.addContent(ramo11);

            //Importo pagato in contanti
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo12 = new Element("PagatoContanti");
            ramo12.setText(scontrino.datoPagatoContanti);
            nodo21.addContent(ramo12);

            //Importo pagato elettronico
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo13 = new Element("PagatoElettronico");
            ramo13.setText(scontrino.datoPagatoElettronico);
            nodo21.addContent(ramo13);

            //Importo dello sconto applicato in fase di pagamento. L’importo deve essere al
            // lordo dell’IVA. Questo importo non ha riflessi sui campi 4.1.1 <IVA> e 4.1.6 <ImportoParziale>.
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo14 = new Element("ScontoApagare");
            ramo14.setText(scontrino.datoScontoApagare);
            nodo21.addContent(ramo14);

            //Blocco da valorizzare se si devono riportare informazioni relative al pagamento mediante
            //ticket restaurant.
            Element nodo22 = new Element("Ticket");
            nodo21.addContent(nodo22);

            //Ammontare totale dei corrispettivi riscossi a fronte di pagamenti con ticket restaurant.
            //L’importo deve essere al lordo dell’IVA
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo15 = new Element("PagatoTicket");
            ramo15.setText(scontrino.datoPagatoTicket);
            nodo22.addContent(ramo15);

            //Numero complessivo di ticket restaurant consegnati dai clienti all’esercente in
            //relazione all’importo indicato al punto precedente
            //formato numerico
            Element ramo16 = new Element("NumeroTicket");
            ramo16.setText(scontrino.datoNumeroTicket);
            nodo22.addContent(ramo16);

            //Blocco obbligatorio per i dati contabili-fiscali provenienti dalle vending machine (campo
            //1.3.1 = DA)
            Element nodo23 = new Element("DatiDA");

            //Blocco relativo ai valori di venduto ed incassato nel periodo di rilevazione; questo
            //blocco dati è in alternativa al blocco dati 5.2 <Cumulato>
            Element nodo24 = new Element("Periodo");
            nodo23.addContent(nodo24);

            //Valore totale dei beni venduti nel periodo di rilevazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo17 = new Element("Venduto");
            ramo17.setText(scontrino.datoVendutoP);
            nodo24.addContent(ramo17);

            //Valore totale dei beni venduti con pagamento in contante nel periodo di rilevazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo18 = new Element("VendutoContante");
            ramo18.setText(scontrino.datoVendutoContanteP);
            nodo24.addContent(ramo18);

            //Valore totale dei beni venduti con pagamento NON in contante nel periodo di rilevazione
            //Tale valore è quello riferito alla singola periferica cashless. Quindi si avrà un “totale
            //venduto non a contante” per il cashless 1 ed un “totale venduto non a contante” per il
            //cashless 2, ecc.
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo19 = new Element("VendutoNoContante");
            ramo19.setText(scontrino.datoVendutoNoContanteP);
            nodo24.addContent(ramo19);

            //Ammontare totale incassato in contante e nelle altre forme di pagamento nel periodo di
            //rilevazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo20 = new Element("Incassato");
            ramo20.setText(scontrino.datoIncassatoP);
            nodo24.addContent(ramo20);

            //Ammontare totale incassato per operazioni di ricarica nel periodo di rilevazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo21 = new Element("IncassatoRicarica");
            ramo21.setText(scontrino.datoIncassatoRicaricaP);
            nodo24.addContent(ramo21);

            //Ammontare totale incassato per operazioni di vendita nel periodo di rilevazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo22 = new Element("IncassatoVendita");
            ramo22.setText(scontrino.datoIncassatoVenditaP);
            nodo24.addContent(ramo22);

            //Ammontare totale reso dai tubi di resto nel periodo di rilevazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo23 = new Element("TotaleResoTubiResto");
            ramo23.setText(scontrino.datoTotaleResoTubiRestoP);
            nodo24.addContent(ramo23);

            //Ammontare totale verso i tubi di resto nel periodo di rilevazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo24 = new Element("TotaleCaricatoTubiResto");
            ramo24.setText(scontrino.datoTotaleCaricatoTubiRestoP);
            nodo24.addContent(ramo24);

            //Ammontare totale reso manualmente dai tubi di resto nel periodo di rilevazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo25 = new Element("TotaleResoManualeTubiResto");
            ramo25.setText(scontrino.datoTotaleResoManualeTubiRestoP);
            nodo24.addContent(ramo25);

            //Ammontare totale caricato manualmente nei tubi di resto nel periodo di rilevazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo26 = new Element("TotaleCaricatoManualeTubiResto");
            ramo26.setText(scontrino.datoTotaleCaricatoManualeTubiRestoP);
            nodo24.addContent(ramo26);

            //Data e ora della rilevazione dei corrispettivi precedente rispetto a quella in corso
            //formato ISO 8601:2004, con la precisione seguente: YYYY-MM-DDTHH:MM:SS
            Element ramo27 = new Element("DataOraPrelievoPrec");
            ramo27.setText(scontrino.datoDataOraPrelievoPrecP);
            nodo24.addContent(ramo27);

            //Numero progressivo della rilevazione dei corrispettivi
            //formato numerico
            Element ramo28 = new Element("ProgressivoPrelievo");
            ramo28.setText(scontrino.datoProgressivoPrelievoP);
            nodo24.addContent(ramo28);

            //Blocco relativo ai valori di venduto ed incassato dal momento dell'inizializzazione;
            //questo blocco dati è in alternativa al blocco dati 5.1 <Periodo>
            Element nodo25 = new Element("Cumulato");
            nodo23.addContent(nodo25);

            //Valore totale dei beni venduti dal momento dell'inizializzazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo29 = new Element("Venduto");
            ramo29.setText(scontrino.datoVendutoC);
            nodo25.addContent(ramo29);

            //Valore totale dei beni venduti con pagamento in contante dal momento dell'inizializzazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo30 = new Element("VendutoContante");
            ramo30.setText(scontrino.datoVendutoContanteC);
            nodo25.addContent(ramo30);

            //Valore totale dei beni venduti con pagamento NON in contante dal momento
            //dell'inizializzazione. Tale valore è quello riferito alla singola
            //periferica cashless. Quindi si avrà un “totale venduto non a contante” per il cashless 1 ed
            //un “totale venduto non a contante” per il cashless 2, ecc.
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo31 = new Element("VendutoNoContante");
            ramo31.setText(scontrino.datoVendutoNoContanteC);
            nodo25.addContent(ramo31);

            //Ammontare totale incassato in contante e nelle altre forme di pagamento dal momento dell'inizializzazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo32 = new Element("Incassato");
            ramo32.setText(scontrino.datoIncassatoC);
            nodo25.addContent(ramo32);

            //Ammontare totale incassato per operazioni di ricarica dal momento dell'inizializzazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo33 = new Element("IncassatoRicarica");
            ramo33.setText(scontrino.datoIncassatoRicaricaC);
            nodo25.addContent(ramo33);

            //Ammontare totale incassato per operazioni di vendita dal momento dell'inizializzazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo34 = new Element("IncassatoVendita");
            ramo34.setText(scontrino.datoIncassatoVenditaC);
            nodo25.addContent(ramo34);

            //Ammontare totale reso dai tubi di resto dal momento dell'inizializzazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo35 = new Element("TotaleResoTubiResto");
            ramo35.setText(scontrino.datoTotaleResoTubiRestoC);
            nodo25.addContent(ramo35);

            //Ammontare totale verso i tubi di resto dal momento dell'inizializzazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo36 = new Element("TotaleCaricatoTubiResto");
            ramo36.setText(scontrino.datoTotaleCaricatoTubiRestoC);
            nodo25.addContent(ramo36);

            //Ammontare totale reso manualmente dai tubi di resto dal momento dell'inizializzazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo37 = new Element("TotaleResoManualeTubiResto");
            ramo37.setText(scontrino.datoTotaleResoManualeTubiRestoC);
            nodo25.addContent(ramo37);

            //Ammontare totale caricato manualmente nei tubi di resto dal momento dell'inizializzazione
            //formato numerico; i decimali vanno separati dall'intero con il carattere '.' (punto)
            Element ramo38 = new Element("TotaleCaricatoManualeTubiResto");
            ramo38.setText(scontrino.datoTotaleCaricatoManualeTubiRestoC);
            nodo25.addContent(ramo38);

            //Blocco da valorizzare se si devono riportare informazioni relative ad intervento tecnico
            //effettuato sul dispositivo
            Element nodo26 = new Element("InterventoTecnico");

            //Codice fiscale del soggetto che ha effettuato l'intervento
            //formato alfanumerico
            Element nodo27 = new Element("CFTecnico");
            nodo27.setText(scontrino.datoCFTecnico);
            nodo26.addContent(nodo27);

            //Numero di partita IVA del laboratorio; da inserire solo nei casi di RT e MC
            Element nodo28 = new Element("IdIVALaboratorio");
            nodo26.addContent(nodo28);

            //Codice della nazione espresso secondo lo standard ISO 3166-1 alpha-2 code
            //valore ammessi:[IT], [ES], [DK],[...]
            Element ramo39 = new Element("IdPaese");
            ramo39.setText(scontrino.datoIdPaese);
            nodo28.addContent(ramo39);

            //Codice identificativo IVA
            //formato alfanumerico
            Element ramo40 = new Element("IdCodice");
            ramo40.setText(scontrino.datoIdCodice);
            nodo28.addContent(ramo40);

            //Data e ora in cui è stato effettuato l'intervento
            //formato ISO 8601:2004, con la precisione seguente: YYYY-MM-DDTHH:MM:SS
            Element nodo29 = new Element("DataOra");
            nodo29.setText(scontrino.datoDataOraIT);
            nodo26.addContent(nodo29);

            //Codice che identifica la natura dell'intervento
            /*
            01 manutenzione (ordinaria o straordinaria)
            02 sostituzione del DGFE per guasto o esaurimento
            03 verificazione periodica con esito positivo
            04 verificazione periodica con esito negativo
            05 verifica periodica con ritiro apparecchio
            06 altro (in questo caso è obbligatoria una nota esplicativa dell'intervento)
            07 Aggiornamento Software
            */
            Element nodo30 = new Element("Codice");
            nodo30.setText(scontrino.datoCodiceIT);
            nodo26.addContent(nodo30);

            //Per interventi identificati con Codice “07”, per aggiornamenti software del firmware fiscale, è
            //necessario riportare la versione della release installata sul dispositivo
            //formato alfanumerico
            Element nodo32 = new Element("NumeroSw");
            nodo32.setText(scontrino.datoNumeroSW);
            nodo26.addContent(nodo32);

            //Per interventi identificati con Codice “07”, per aggiornamenti software del firmware fiscale, è
            //necessario riportare la data corrispondente alla versione indicata nel campo precedente
            //formato ISO 8601:2004, con la precisione seguente: YYYY-MM-DDTHH:MM:SS
            Element nodo33 = new Element("DataRelease");
            nodo33.setText(scontrino.datoDataRelease);
            nodo26.addContent(nodo33);

            //Eventuale descrizione aggiuntiva sull'intervento
            //formato alfanumerico
            Element nodo31 = new Element("Note");
            nodo31.setText(scontrino.datoNoteIT);
            nodo26.addContent(nodo31);

            //Blocco da valorizzare se si devono inviare segnalazioni di eventi eccezionali sul dispositivo
            Element nodo34 = new Element("Segnalazione");

            //Numero identificativo del dispositivo interessato dall’evento
            //formato alfanumerico
            Element nodo35 = new Element("Matricola");
            nodo35.setText(scontrino.datoMatricola);
            nodo34.addContent(nodo35);

            //Data e ora in cui si è verificato l’evento
            //formato ISO 8601:2004, con la precisione seguente: YYYY-MM-DDTHH:MM:SS
            Element nodo36 = new Element("DataOra");
            nodo36.setText(scontrino.datoDataOraS);
            nodo34.addContent(nodo36);

            //Codice che identifica la tipologia di evento
            /*
            01 Blocco Vending Machine per problemi di sicurezza nella comunicazione tra SM e MF
            02 Anomalia del punto cassa
            */
            Element nodo37 = new Element("Codice");
            nodo37.setText(scontrino.datoCodiceS);
            nodo34.addContent(nodo37);

            //Eventuale descrizione aggiuntiva sull'intervento
            //formato alfanumerico
            Element nodo38 = new Element("Note");
            nodo38.setText(scontrino.datoNoteS);
            nodo34.addContent(nodo38);

            //ordine di inserimento nella radice
            radice.addContent(nodo1);
            radice.addContent(nodo4);
            radice.addContent(nodo5);
            radice.addContent(nodo6);
            radice.addContent(nodo23);
            radice.addContent(nodo26);
            radice.addContent(nodo34);

            //Documento
            Document document = new Document(radice);
            //Creazione dell'oggetto XMLOutputter
            XMLOutputter outputter = new XMLOutputter();
            //Imposto il formato dell'outputter come "bel formato"
            outputter.setFormat(Format.getPrettyFormat());
            //Produco l'output sul file xml.foo


            File file1=new File("E:\\_scontrino\\scritturaXML\\ScontrinoElettronico"+scontrino.idProgressivo+".xml");
            outputter.output(document, new FileOutputStream(file1));

            System.out.println("File creato:");
            //Stampo l'output anche sullo standard output
            outputter.output(document, System.out);
        } catch (IOException e) {
            System.err.println("Errore durante il parsing del documento");
            e.printStackTrace();
        }
    }
}