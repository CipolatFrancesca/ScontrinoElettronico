import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Grafica extends JFrame {
    public Grafica (){
        initUI();
    }
    CSVIdProgressivo csvIdProgressivo=new CSVIdProgressivo();
    int idProgressivo=0;

    {
        try {
            idProgressivo = csvIdProgressivo.readId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //int idProgressivo=csvIdProgressivo.read();
    Scontrino scontrino1,nuovoXML;

    //String datoTipo,datoIdDispositivo,datoLat,datoLong;

    private void initUI() {

        //row indica il numero di elementi
        JPanel pnlcenter = new JPanel(new GridLayout(72,2));

        JLabel lblVuota1=new JLabel("campi abilitati");
        JLabel lblVuota2=new JLabel("campi abilitati");
        JLabel lblVuota3=new JLabel("  ");
        JLabel lblVuota4=new JLabel("  ");
        JLabel lblVuota5=new JLabel("campi abilitati");
        JLabel lblVuota6=new JLabel("campi abilitati");

        //deve incrementarsi ad ogni nuovo scontrino
       // idProgressivo=String.valueOf(idProgressivo);
        JLabel lblProgressivo = new JLabel("Progressivo");
        JTextField txtnProgressivo = new JTextField(20);
        txtnProgressivo.setText(String.valueOf(idProgressivo));
        txtnProgressivo.setEnabled(false);

        String[] vTipo={"inserisci tipo","DA: vending machine","MC: soggetti con più punti cassa per singolo punto vendita"};
        JLabel lblTipo = new JLabel ("Tipo");
        JComboBox cbxTipo=new JComboBox(vTipo);

        JLabel lblIdDispositivo = new JLabel("IdDispositivo ");
        JTextField txtIdDispositivo = new JTextField(20);

        JLabel lblLat = new JLabel("Lat ");
        JTextField txtLat = new JTextField(20);

         JLabel lblLong = new JLabel("Long ");
        JTextField txtLong = new JTextField(20);

        JLabel lblDomandaInterventoTecnico=new JLabel("E' stato effettuato un intervento tecnico?");
        JRadioButton rdbInterventoTecnicoSi=new JRadioButton("SI");
        JRadioButton rdbInterventoTecnicoNo=new JRadioButton("NO");

        ButtonGroup group1=new ButtonGroup();
        group1.add(rdbInterventoTecnicoSi);
        group1.add(rdbInterventoTecnicoNo);

        JLabel lblDomandaSegnalazione=new JLabel("Bisogna inviare delle segnalazioni?");
        JRadioButton rdbSegnalazioneSi=new JRadioButton("SI");
        JRadioButton rdbSegnalazioneNo=new JRadioButton("NO");

        ButtonGroup group2=new ButtonGroup();
        group2.add(rdbSegnalazioneSi);
        group2.add(rdbSegnalazioneNo);

        Date data = new Date();
        JLabel lblDal = new JLabel("Inizio periodo inattività");
        SimpleDateFormat formatterDal = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dataStringDal = formatterDal.format(data);
        JFormattedTextField formatTextDal = new JFormattedTextField(formatterDal);
        formatTextDal.setColumns(20);
        formatTextDal.setText(dataStringDal);


        JLabel lblAl = new JLabel("Fine periodo inattività");
        SimpleDateFormat formatterAl = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dataStringAl = formatterAl.format(data);
        JFormattedTextField formatTextAl = new JFormattedTextField(formatterAl);
        formatTextAl.setColumns(20);
        formatTextAl.setText(dataStringAl);


        JLabel lblDataOraRilevazione = new JLabel("Data e ora della rilevazione");
        SimpleDateFormat formatterDataOraRilevazione = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dataStringDataOraRilevazione = formatterDataOraRilevazione.format(data);
        JFormattedTextField formatTextDataOraRilevazione = new JFormattedTextField(formatterDataOraRilevazione);
        formatTextDataOraRilevazione.setColumns(20);
        formatTextDataOraRilevazione.setText(dataStringDataOraRilevazione);

        JLabel lblAliquotaIVA = new JLabel("AliquotaIVA (ex: 22.5)");
        JTextField txtAliquotaIVA = new JTextField(20);

        JLabel lblImposta = new JLabel("Imposta (ex: 22.5)");
        JTextField txtImposta = new JTextField(20);


        String[] vNatura={"inserisci","N1:escluse ex art. 15","N2:non soggette","N3:non imponibili"," N4:Esenti","N5:regime del margine","N6:Altro non IVA"};
        JLabel lblNatura = new JLabel ("Natura");
        JComboBox cbxNatura=new JComboBox(vNatura);

        JLabel lblAmmontare = new JLabel("Ammontare (ex: 22.5)");
        JTextField txtAmmontare = new JTextField(20);

        JLabel lblRifNormativo = new JLabel("RifNormativo");
        JTextField txtRifNormativo = new JTextField(20);

        JLabel lblImportoParziale = new JLabel("ImportoParziale");
        JTextField txtImportoParziale = new JTextField(20);

        JLabel lblTotaleAmmontareResi = new JLabel("TotaleAmmontareResi (ex: 22.5)");
        JTextField txtTotaleAmmontareResi = new JTextField(20);

        JLabel lblTotaleAmmontareAnnulli = new JLabel("TotaleAmmontareAnnulli (ex: 22.5)");
        JTextField txtTotaleAmmontareAnnulli = new JTextField(20);

        JLabel lblBeniInSospeso = new JLabel("BeniInSospeso (ex: 22.5)");
        JTextField txtBeniInSospeso = new JTextField(20);

        JLabel lblNonRiscossoServizi = new JLabel("NonRiscossoServizi (ex: 22.5)");
        JTextField txtNonRiscossoServizi = new JTextField(20);

        JLabel lblNonRiscossoFatture = new JLabel("NonRiscossoFatture (ex: 22.5)");
        JTextField txtNonRiscossoFatture = new JTextField(20);

        JLabel lblTotaleDaFattureRT = new JLabel("TotaleDaFattureRT (ex: 22.5)");
        JTextField txtTotaleDaFattureRT = new JTextField(20);

        JLabel lblNonRiscossoDCRaSSN = new JLabel("NonRiscossoDCRaSSN (ex: 22.5)");
        JTextField txtNonRiscossoDCRaSSN = new JTextField(20);

        JLabel lblNonRiscossoOmaggio = new JLabel("NonRiscossoOmaggio (ex: 22.5)");
        JTextField txtNonRiscossoOmaggio = new JTextField(20);

        JLabel lblCodiceAttivita = new JLabel("CodiceAttivita");
        JTextField txtCodiceAttivita = new JTextField(20);

        JLabel lblNumeroDocCommerciali = new JLabel("NumeroDocCommerciali");
        JTextField txtNumeroDocCommerciali = new JTextField(20);

        JLabel lblPagatoContanti = new JLabel("PagatoContanti (ex: 22.5)");
        JTextField txtPagatoContanti = new JTextField(20);

        JLabel lblPagatoElettronico = new JLabel("PagatoElettronico (ex: 22.5)");
        JTextField txtPagatoElettronico = new JTextField(20);

        JLabel lblScontoApagare = new JLabel("ScontoApagare (ex: 22.5)");
        JTextField txtScontoApagare = new JTextField(20);

        JLabel lblPagatoTicket= new JLabel("PagatoTicket (ex: 22.5)");
        JTextField txtPagatoTicket= new JTextField(20);

        JLabel lblNumeroTicket= new JLabel("datoNumeroTicket ");
        JTextField txtNumeroTicket= new JTextField(20);

        //****************************************************
        JLabel lblPeriodo=new JLabel("Periodo");
        //Periodo
        JLabel lblVendutoP= new JLabel("Venduto (ex: 22.5)");
        JTextField txtVendutoP= new JTextField(20);

        JLabel lblVendutoContanteP= new JLabel("VendutoContante (ex: 22.5)");
        JTextField txtVendutoContanteP= new JTextField(20);

        JLabel lblVendutoNoContanteP= new JLabel("VendutoNoContante (ex: 22.5)");
        JTextField txtVendutoNoContanteP= new JTextField(20);

        JLabel lblIncassatoP= new JLabel("Incassato (ex: 22.5)");
        JTextField txtIncassatoP= new JTextField(20);

        JLabel lblIncassatoRicaricaP= new JLabel("IncassatoRicarica (ex: 22.5)");
        JTextField txtIncassatoRicaricaP= new JTextField(20);

        JLabel lblIncassatoVenditaP= new JLabel("IncassatoVendita (ex: 22.5)");
        JTextField txtIncassatoVenditaP= new JTextField(20);

        JLabel lblTotaleResoTubiRestoP= new JLabel("TotaleResoTubiResto (ex: 22.5)");
        JTextField txtTotaleResoTubiRestoP= new JTextField(20);

        JLabel lblTotaleCaricatoTubiRestoP= new JLabel("TotaleCaricatoTubiResto (ex: 22.5)");
        JTextField txtTotaleCariatoTubiRestoP= new JTextField(20);

        JLabel lblTotaleResoManualeTubiRestoP= new JLabel("TotaleResoManualeTubiResto (ex: 22.5)");
        JTextField txtTotaleResoManualeTubiRestoP= new JTextField(20);

        JLabel lblTotaleCaricatoManualeTubiRestoP= new JLabel("TotaleCaricatoManualeTubiResto (ex: 22.5)");
        JTextField txtTotaleCariatoManualeTubiRestoP= new JTextField(20);

        JLabel lblDataOraPrelievoPrecP = new JLabel("Data e ora della rilevazione");
        SimpleDateFormat formatterDataOraPrelievoPrecP = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dataStringDataOraPrelievoPrecP = formatterDataOraPrelievoPrecP.format(data);
        JFormattedTextField formatTextDataOraPrelievoPrecP= new JFormattedTextField(formatterDataOraPrelievoPrecP);
        formatTextDataOraPrelievoPrecP.setColumns(20);
        formatTextDataOraPrelievoPrecP.setText(dataStringDataOraPrelievoPrecP);

        JLabel lblProgressivoPrelievoP= new JLabel("ProgressivoPrelievo ");
        JTextField txtProgressivoPrelievoP= new JTextField(20);

        //Cumulato
        JLabel lblCumulato=new JLabel("Cumulato");

        JLabel lblVendutoC= new JLabel("Venduto (ex: 22.5)");
        JTextField txtVendutoC= new JTextField(20);

        JLabel lblVendutoContanteC= new JLabel("VendutoContante (ex: 22.5)");
        JTextField txtVendutoContanteC= new JTextField(20);

        JLabel lblVendutoNoContanteC= new JLabel("VendutoNoContante (ex: 22.5)");
        JTextField txtVendutoNoContanteC= new JTextField(20);

        JLabel lblIncassatoC= new JLabel("Incassato (ex: 22.5)");
        JTextField txtIncassatoC= new JTextField(20);

        JLabel lblIncassatoRicaricaC= new JLabel("IncassatoRicarica (ex: 22.5)");
        JTextField txtIncassatoRicaricaC= new JTextField(20);

        JLabel lblIncassatoVenditaC= new JLabel("IncassatoVendita (ex: 22.5)");
        JTextField txtIncassatoVenditaC= new JTextField(20);

        JLabel lblTotaleResoTubiRestoC= new JLabel("TotaleResoTubiResto (ex: 22.5)");
        JTextField txtTotaleResoTubiRestoC= new JTextField(20);

        JLabel lblTotaleCaricatoTubiRestoC= new JLabel("TotaleCaricatoTubiResto (ex: 22.5)");
        JTextField txtTotaleCariatoTubiRestoC= new JTextField(20);

        JLabel lblTotaleResoManualeTubiRestoC= new JLabel("TotaleResoManualeTubiResto  (ex: 22.5)");
        JTextField txtTotaleResoManualeTubiRestoC= new JTextField(20);

        JLabel lblTotaleCaricatoManualeTubiRestoC= new JLabel("TotaleCaricatoManualeTubiResto (ex: 22.5)");
        JTextField txtTotaleCariatoManualeTubiRestoC= new JTextField(20);

        JLabel lblInterventoTecnico= new JLabel("Intervento tecnico");

        JLabel lblCFTecnico= new JLabel("Codice fiscale del tecnico");
        JTextField txtCFTecnico= new JTextField(20);

        JLabel lblIdPaese= new JLabel("IdPaese (ex: IT)");
        JTextField txtIdPaese= new JTextField(20);

        JLabel lblIdCodice= new JLabel("IdCodice");
        JTextField txtIdCodice= new JTextField(20);

        JLabel lblDataOraIT = new JLabel("Data e ora intervento tecnico");
        SimpleDateFormat formatterDataOraIT = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dataStringDataOraIT = formatterDataOraIT.format(data);
        JFormattedTextField formatTextDataOraIT = new JFormattedTextField(formatterDataOraIT);
        formatTextDataOraIT.setColumns(20);
        formatTextDataOraIT.setText(dataStringDataOraIT);

        String[] vCodiceIT={"inserisci","01:manutenzione (ordinaria o straordinaria)","02:sostituzione del DGFE per guasto o esaurimento",
                "03:verificazione periodica con esito positivo"," 04:verificazione periodica con esito negativo",
                "05:verifica periodica con ritiro apparecchio","06:altro (in questo caso è obbligatoria una nota esplicativa dell'intervento)",
                "07:Aggiornamento Software"};
        JLabel lblCodiceIT = new JLabel ("Codice");
        JComboBox cbxCodiceIT=new JComboBox(vCodiceIT);

        JLabel lblNumeroSW= new JLabel("NumeroSW");
        JTextField txtNumeroSW= new JTextField(20);

        JLabel lblDataRelease = new JLabel("Data e ora intervento tecnico");
        SimpleDateFormat formatterDataRelease = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dataStringDataRelease = formatterDataRelease.format(data);
        JFormattedTextField formatTextDataRelease = new JFormattedTextField(formatterDataRelease);
        formatTextDataRelease.setColumns(20);
        formatTextDataRelease.setText(dataStringDataRelease);

        JLabel lblNoteIT= new JLabel("NoteIT");
        JTextField txtNoteIT= new JTextField(20);

        JLabel lblSegnalazione= new JLabel("Segnalazione");

        JLabel lblMaricola= new JLabel("Matricola");
        JTextField txtMatricola= new JTextField(20);

        JLabel lblDataOraS = new JLabel("Data e ora segnalazione");
        SimpleDateFormat formatterDataOraS = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dataStringDataOraS = formatterDataOraS.format(data);
        JFormattedTextField formatTextDataOraS = new JFormattedTextField(formatterDataOraS);
        formatTextDataOraS.setColumns(20);
        formatTextDataOraS.setText(dataStringDataOraS);

        String[] vCodiceS={"inserisci","01:Blocco Vending Machine per problemi di sicurezza nella comunicazione tra SM e MF",
                "02:Anomalia del punto cassa"};
        JLabel lblCodiceS = new JLabel ("Codice");
        JComboBox cbxCodiceS=new JComboBox(vCodiceS);

        JLabel lblNoteS= new JLabel("NoteS");
        JTextField txtNoteS= new JTextField(20);

        //****************************

        pnlcenter.add(lblProgressivo);
        pnlcenter.add(txtnProgressivo);
        pnlcenter.add(lblTipo);
        pnlcenter.add(cbxTipo);
        pnlcenter.add(lblIdDispositivo);
        pnlcenter.add(txtIdDispositivo);
        pnlcenter.add(lblLat);
        pnlcenter.add(txtLat);
        pnlcenter.add(lblLong);
        pnlcenter.add(txtLong);

        pnlcenter.add(lblDomandaInterventoTecnico);
        pnlcenter.add(lblVuota3);
        pnlcenter.add(rdbInterventoTecnicoSi);
        pnlcenter.add(rdbInterventoTecnicoNo);

        pnlcenter.add(lblDomandaSegnalazione);
        pnlcenter.add(lblVuota4);
        pnlcenter.add(rdbSegnalazioneSi);
        pnlcenter.add(rdbSegnalazioneNo);

        pnlcenter.add(lblDal);
        pnlcenter.add(formatTextDal);
        pnlcenter.add(lblAl);
        pnlcenter.add(formatTextAl);
        pnlcenter.add(lblDataOraRilevazione);
        pnlcenter.add(formatTextDataOraRilevazione);
        pnlcenter.add(lblAliquotaIVA);
        pnlcenter.add(txtAliquotaIVA);
        pnlcenter.add(lblImposta);
        pnlcenter.add(txtImposta);
        pnlcenter.add(lblNatura);
        pnlcenter.add(cbxNatura);
        pnlcenter.add(lblAmmontare);
        pnlcenter.add(txtAmmontare);
        pnlcenter.add(lblRifNormativo);
        pnlcenter.add(txtRifNormativo);
        pnlcenter.add(lblImportoParziale);
        pnlcenter.add(txtImportoParziale);
        pnlcenter.add(lblTotaleAmmontareResi);
        pnlcenter.add(txtTotaleAmmontareResi);
        pnlcenter.add(lblTotaleAmmontareAnnulli);
        pnlcenter.add(txtTotaleAmmontareAnnulli);
        pnlcenter.add(lblBeniInSospeso);
        pnlcenter.add(txtBeniInSospeso);
        pnlcenter.add(lblNonRiscossoServizi);
        pnlcenter.add(txtNonRiscossoServizi);
        pnlcenter.add(lblNonRiscossoFatture);
        pnlcenter.add(txtNonRiscossoFatture);
        pnlcenter.add(lblTotaleDaFattureRT);
        pnlcenter.add(txtTotaleDaFattureRT);
        pnlcenter.add(lblNonRiscossoDCRaSSN);
        pnlcenter.add(txtNonRiscossoDCRaSSN);
        pnlcenter.add(lblNonRiscossoOmaggio);
        pnlcenter.add(txtNonRiscossoOmaggio);
        pnlcenter.add(lblCodiceAttivita);
        pnlcenter.add(txtCodiceAttivita);
        pnlcenter.add(lblNumeroDocCommerciali);
        pnlcenter.add(txtNumeroDocCommerciali);
        pnlcenter.add(lblPagatoContanti);
        pnlcenter.add(txtPagatoContanti);
        pnlcenter.add(lblPagatoElettronico);
        pnlcenter.add(txtPagatoElettronico);
        pnlcenter.add(lblScontoApagare);
        pnlcenter.add(txtScontoApagare);
        pnlcenter.add(lblPagatoTicket);
        pnlcenter.add(txtPagatoTicket);
        pnlcenter.add(lblNumeroTicket);
        pnlcenter.add(txtNumeroTicket);

        pnlcenter.add(lblPeriodo);
        pnlcenter.add(lblVuota1);

        pnlcenter.add(lblVendutoP);
        pnlcenter.add(txtVendutoP);
        pnlcenter.add(lblVendutoContanteP);
        pnlcenter.add(txtVendutoContanteP);
        pnlcenter.add(lblVendutoNoContanteP);
        pnlcenter.add(txtVendutoNoContanteP);
        pnlcenter.add(lblIncassatoP);
        pnlcenter.add(txtIncassatoP);
        pnlcenter.add(lblIncassatoRicaricaP);
        pnlcenter.add(txtIncassatoRicaricaP);
        pnlcenter.add(lblIncassatoVenditaP);
        pnlcenter.add(txtIncassatoVenditaP);
        pnlcenter.add(lblTotaleResoTubiRestoP);
        pnlcenter.add(txtTotaleResoTubiRestoP);
        pnlcenter.add(lblTotaleCaricatoTubiRestoP);
        pnlcenter.add(txtTotaleCariatoTubiRestoP);
        pnlcenter.add(lblTotaleResoManualeTubiRestoP);
        pnlcenter.add(txtTotaleResoManualeTubiRestoP);
        pnlcenter.add(lblTotaleCaricatoManualeTubiRestoP);
        pnlcenter.add(txtTotaleCariatoManualeTubiRestoP);
        pnlcenter.add(lblDataOraPrelievoPrecP);
        pnlcenter.add(formatTextDataOraPrelievoPrecP);
        pnlcenter.add(lblProgressivoPrelievoP);
        pnlcenter.add(txtProgressivoPrelievoP);

        pnlcenter.add(lblCumulato);
        pnlcenter.add(lblVuota2);

        pnlcenter.add(lblVendutoC);
        pnlcenter.add(txtVendutoC);
        pnlcenter.add(lblVendutoContanteC);
        pnlcenter.add(txtVendutoContanteC);
        pnlcenter.add(lblVendutoNoContanteC);
        pnlcenter.add(txtVendutoNoContanteC);
        pnlcenter.add(lblIncassatoC);
        pnlcenter.add(txtIncassatoC);
        pnlcenter.add(lblIncassatoRicaricaC);
        pnlcenter.add(txtIncassatoRicaricaC);
        pnlcenter.add(lblIncassatoVenditaC);
        pnlcenter.add(txtIncassatoVenditaC);
        pnlcenter.add(lblTotaleResoTubiRestoC);
        pnlcenter.add(txtTotaleResoTubiRestoC);
        pnlcenter.add(lblTotaleCaricatoTubiRestoC);
        pnlcenter.add(txtTotaleCariatoTubiRestoC);
        pnlcenter.add(lblTotaleResoManualeTubiRestoC);
        pnlcenter.add(txtTotaleResoManualeTubiRestoC);
        pnlcenter.add(lblTotaleCaricatoManualeTubiRestoC);
        pnlcenter.add(txtTotaleCariatoManualeTubiRestoC);

        pnlcenter.add(lblInterventoTecnico);
        pnlcenter.add(lblVuota5);
        pnlcenter.add(lblCFTecnico);
        pnlcenter.add(txtCFTecnico);
        pnlcenter.add(lblIdPaese);
        pnlcenter.add(txtIdPaese);
        pnlcenter.add(lblIdCodice);
        pnlcenter.add(txtIdCodice);
        pnlcenter.add(lblDataOraIT);
        pnlcenter.add(formatTextDataOraIT);
        pnlcenter.add(lblCodiceIT);
        pnlcenter.add(cbxCodiceIT);
        pnlcenter.add(lblNumeroSW);
        pnlcenter.add(txtNumeroSW);
        pnlcenter.add(lblDataRelease);
        pnlcenter.add(formatTextDataRelease);
        pnlcenter.add(lblNoteIT);
        pnlcenter.add(txtNoteIT);

        pnlcenter.add(lblSegnalazione);
        pnlcenter.add(lblVuota6);
        pnlcenter.add(lblMaricola);
        pnlcenter.add(txtMatricola);
        pnlcenter.add(lblDataOraS);
        pnlcenter.add(formatTextDataOraS);
        pnlcenter.add(lblCodiceS);
        pnlcenter.add(cbxCodiceS);
        pnlcenter.add(lblNoteS);
        pnlcenter.add(txtNoteS);


        //--------------------

        lblDal.setVisible(false);
        formatTextDal.setVisible(false);
        lblAl.setVisible(false);
        formatTextAl.setVisible(false);
        lblDataOraRilevazione.setVisible(false);
        formatTextDataOraRilevazione.setVisible(false);
        lblAliquotaIVA.setVisible(false);
        txtAliquotaIVA.setVisible(false);
        lblImposta.setVisible(false);
        txtImposta.setVisible(false);
        lblNatura.setVisible(false);
        cbxNatura.setVisible(false);
        lblAmmontare.setVisible(false);
        txtAmmontare.setVisible(false);
        lblRifNormativo.setVisible(false);
        txtRifNormativo.setVisible(false);
        lblImportoParziale.setVisible(false);
        txtImportoParziale.setVisible(false);
        lblTotaleAmmontareResi.setVisible(false);
        txtTotaleAmmontareResi.setVisible(false);
        lblTotaleAmmontareAnnulli.setVisible(false);
        txtTotaleAmmontareAnnulli.setVisible(false);
        lblBeniInSospeso.setVisible(false);
        txtBeniInSospeso.setVisible(false);
        lblNonRiscossoServizi.setVisible(false);
        txtNonRiscossoServizi.setVisible(false);
        lblNonRiscossoFatture.setVisible(false);
        txtNonRiscossoFatture.setVisible(false);
        lblTotaleDaFattureRT.setVisible(false);
        txtTotaleDaFattureRT.setVisible(false);
        lblNonRiscossoDCRaSSN.setVisible(false);
        txtNonRiscossoDCRaSSN.setVisible(false);
        lblNonRiscossoOmaggio.setVisible(false);
        txtNonRiscossoOmaggio.setVisible(false);
        lblCodiceAttivita.setVisible(false);
        txtCodiceAttivita.setVisible(false);
        lblNumeroDocCommerciali.setVisible(false);
        txtNumeroDocCommerciali.setVisible(false);
        lblPagatoContanti.setVisible(false);
        txtPagatoContanti.setVisible(false);
        lblPagatoElettronico.setVisible(false);
        txtPagatoElettronico.setVisible(false);
        lblScontoApagare.setVisible(false);
        txtScontoApagare.setVisible(false);
        lblPagatoTicket.setVisible(false);
        txtPagatoTicket.setVisible(false);
        lblNumeroTicket.setVisible(false);
        txtNumeroTicket.setVisible(false);

        lblPeriodo.setVisible(false);
        lblVuota1.setVisible(false);

        lblVendutoP.setVisible(false);
        txtVendutoP.setVisible(false);
        lblVendutoContanteP.setVisible(false);
        txtVendutoContanteP.setVisible(false);
        lblVendutoNoContanteP.setVisible(false);
        txtVendutoNoContanteP.setVisible(false);
        lblIncassatoP.setVisible(false);
        txtIncassatoP.setVisible(false);
        lblIncassatoRicaricaP.setVisible(false);
        txtIncassatoRicaricaP.setVisible(false);
        lblIncassatoVenditaP.setVisible(false);
        txtIncassatoVenditaP.setVisible(false);
        lblTotaleResoTubiRestoP.setVisible(false);
        txtTotaleResoTubiRestoP.setVisible(false);
        lblTotaleCaricatoTubiRestoP.setVisible(false);
        txtTotaleCariatoTubiRestoP.setVisible(false);
        lblTotaleResoManualeTubiRestoP.setVisible(false);
        txtTotaleResoManualeTubiRestoP.setVisible(false);
        lblTotaleCaricatoManualeTubiRestoP.setVisible(false);
        txtTotaleCariatoManualeTubiRestoP.setVisible(false);
        lblDataOraPrelievoPrecP.setVisible(false);
        formatTextDataOraPrelievoPrecP.setVisible(false);
        lblProgressivoPrelievoP.setVisible(false);
        txtProgressivoPrelievoP.setVisible(false);

        lblCumulato.setVisible(false);
        lblVuota2.setVisible(false);

        lblVendutoC.setVisible(false);
        txtVendutoC.setVisible(false);
        lblVendutoContanteC.setVisible(false);
        txtVendutoContanteC.setVisible(false);
        lblVendutoNoContanteC.setVisible(false);
        txtVendutoNoContanteC.setVisible(false);
        lblIncassatoC.setVisible(false);
        txtIncassatoC.setVisible(false);
        lblIncassatoRicaricaC.setVisible(false);
        txtIncassatoRicaricaC.setVisible(false);
        lblIncassatoVenditaC.setVisible(false);
        txtIncassatoVenditaC.setVisible(false);
        lblTotaleResoTubiRestoC.setVisible(false);
        txtTotaleResoTubiRestoC.setVisible(false);
        lblTotaleCaricatoTubiRestoC.setVisible(false);
        txtTotaleCariatoTubiRestoC.setVisible(false);
        lblTotaleResoManualeTubiRestoC.setVisible(false);
        txtTotaleResoManualeTubiRestoC.setVisible(false);
        lblTotaleCaricatoManualeTubiRestoC.setVisible(false);
        txtTotaleCariatoManualeTubiRestoC.setVisible(false);

        lblInterventoTecnico.setVisible(false);
        lblVuota5.setVisible(false);
        lblCFTecnico.setVisible(false);
        txtCFTecnico.setVisible(false);
        lblIdPaese.setVisible(false);
        txtIdPaese.setVisible(false);
        lblIdCodice.setVisible(false);
        txtIdCodice.setVisible(false);
        lblDataOraIT.setVisible(false);
        formatTextDataOraIT.setVisible(false);
        lblCodiceIT.setVisible(false);
        cbxCodiceIT.setVisible(false);
        lblNumeroSW.setVisible(false);
        txtNumeroSW.setVisible(false);
        lblDataRelease.setVisible(false);
        formatTextDataRelease.setVisible(false);
        lblNoteIT.setVisible(false);
        txtNoteIT.setVisible(false);

        lblSegnalazione.setVisible(false);
        lblVuota6.setVisible(false);
        lblMaricola.setVisible(false);
        txtMatricola.setVisible(false);
        lblDataOraS.setVisible(false);
        formatTextDataOraS.setVisible(false);
        lblCodiceS.setVisible(false);
        cbxCodiceS.setVisible(false);
        lblNoteS.setVisible(false);
        txtNoteS.setVisible(false);


        //*************

        this.add(pnlcenter,BorderLayout.CENTER);

        //south

        JPanel pnlSouth = new JPanel(new FlowLayout());
        JButton btnInserimentoParziale = new JButton("Inserisci");
        JButton btnGeneraXML = new JButton("GeneraXML");
        JButton btnOk = new JButton("OK");
        JButton btnAnnulla = new JButton("Annulla");
        JButton btnNuovo = new JButton("Nuovo");

        pnlSouth.add(btnInserimentoParziale);
        pnlSouth.add(btnGeneraXML);
        pnlSouth.add(btnOk);
        pnlSouth.add(btnAnnulla);
        pnlSouth.add(btnNuovo);

        this.add(pnlSouth,BorderLayout.SOUTH);

        JPanel pnlEst = new JPanel();
        JPanel pnlOvest = new JPanel();
        JPanel pnlNord = new JPanel();

        this.add(pnlEst,BorderLayout.EAST);
        this.add(pnlOvest,BorderLayout.WEST);
        this.add(pnlNord,BorderLayout.NORTH);

        btnGeneraXML.setEnabled(false);
        btnOk.setEnabled(false);

         JScrollPane pnlScroll=new JScrollPane(pnlcenter);
         this.getContentPane().add(pnlScroll);
        this.setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scontrino elettronico");
        setLocationRelativeTo(null);
        setVisible(true);

        btnInserimentoParziale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datoTipo = controlloComboBox(cbxTipo,vTipo,"Tipo");

                String datoIdDispositivo = controlloString(txtIdDispositivo, "IdDispositivo");

                String datoLat = controlloFloat(txtLat, "Lat");
                String datoLong = controlloFloat(txtLong, "Long");

                scontrino1 = new Scontrino(datoTipo, datoIdDispositivo, datoLat, datoLong);

                btnOk.setEnabled(true);

                lblDal.setVisible(true);
                formatTextDal.setVisible(true);
                lblAl.setVisible(true);
                formatTextAl.setVisible(true);
                lblDataOraRilevazione.setVisible(true);
                formatTextDataOraRilevazione.setVisible(true);
                lblAliquotaIVA.setVisible(true);
                txtAliquotaIVA.setVisible(true);
                lblImposta.setVisible(true);
                txtImposta.setVisible(true);
                lblNatura.setVisible(true);
                cbxNatura.setVisible(true);
                lblAmmontare.setVisible(true);
                txtAmmontare.setVisible(true);
                lblRifNormativo.setVisible(true);
                txtRifNormativo.setVisible(true);
                lblImportoParziale.setVisible(true);
                txtImportoParziale.setVisible(true);
                lblTotaleAmmontareResi.setVisible(true);
                txtTotaleAmmontareResi.setVisible(true);
                lblTotaleAmmontareAnnulli.setVisible(true);
                txtTotaleAmmontareAnnulli.setVisible(true);
                lblBeniInSospeso.setVisible(true);
                txtBeniInSospeso.setVisible(true);
                lblNonRiscossoServizi.setVisible(true);
                txtNonRiscossoServizi.setVisible(true);
                lblNonRiscossoFatture.setVisible(true);
                txtNonRiscossoFatture.setVisible(true);
                lblTotaleDaFattureRT.setVisible(true);
                txtTotaleDaFattureRT.setVisible(true);
                lblNonRiscossoDCRaSSN.setVisible(true);
                txtNonRiscossoDCRaSSN.setVisible(true);
                lblNonRiscossoOmaggio.setVisible(true);
                txtNonRiscossoOmaggio.setVisible(true);
                lblCodiceAttivita.setVisible(true);
                txtCodiceAttivita.setVisible(true);
                lblNumeroDocCommerciali.setVisible(true);
                txtNumeroDocCommerciali.setVisible(true);
                lblPagatoContanti.setVisible(true);
                txtPagatoContanti.setVisible(true);
                lblPagatoElettronico.setVisible(true);
                txtPagatoElettronico.setVisible(true);
                lblScontoApagare.setVisible(true);
                txtScontoApagare.setVisible(true);
                lblPagatoTicket.setVisible(true);
                txtPagatoTicket.setVisible(true);
                lblNumeroTicket.setVisible(true);
                txtNumeroTicket.setVisible(true);

                lblPeriodo.setVisible(true);
                lblVuota1.setVisible(true);
                lblVendutoP.setVisible(true);
                txtVendutoP.setVisible(true);
                lblVendutoContanteP.setVisible(true);
                txtVendutoContanteP.setVisible(true);
                lblVendutoNoContanteP.setVisible(true);
                txtVendutoNoContanteP.setVisible(true);
                lblIncassatoP.setVisible(true);
                txtIncassatoP.setVisible(true);
                lblIncassatoRicaricaP.setVisible(true);
                txtIncassatoRicaricaP.setVisible(true);
                lblIncassatoVenditaP.setVisible(true);
                txtIncassatoVenditaP.setVisible(true);
                lblTotaleResoTubiRestoP.setVisible(true);
                txtTotaleResoTubiRestoP.setVisible(true);
                lblTotaleCaricatoTubiRestoP.setVisible(true);
                txtTotaleCariatoTubiRestoP.setVisible(true);
                lblTotaleResoManualeTubiRestoP.setVisible(true);
                txtTotaleResoManualeTubiRestoP.setVisible(true);
                lblTotaleCaricatoManualeTubiRestoP.setVisible(true);
                txtTotaleCariatoManualeTubiRestoP.setVisible(true);
                lblDataOraPrelievoPrecP.setVisible(true);
                formatTextDataOraPrelievoPrecP.setVisible(true);
                lblProgressivoPrelievoP.setVisible(true);
                txtProgressivoPrelievoP.setVisible(true);

                lblCumulato.setVisible(true);
                lblVuota2.setVisible(true);
                lblVendutoC.setVisible(true);
                txtVendutoC.setVisible(true);
                lblVendutoContanteC.setVisible(true);
                txtVendutoContanteC.setVisible(true);
                lblVendutoNoContanteC.setVisible(true);
                txtVendutoNoContanteC.setVisible(true);
                lblIncassatoC.setVisible(true);
                txtIncassatoC.setVisible(true);
                lblIncassatoRicaricaC.setVisible(true);
                txtIncassatoRicaricaC.setVisible(true);
                lblIncassatoVenditaC.setVisible(true);
                txtIncassatoVenditaC.setVisible(true);
                lblTotaleResoTubiRestoC.setVisible(true);
                txtTotaleResoTubiRestoC.setVisible(true);
                lblTotaleCaricatoTubiRestoC.setVisible(true);
                txtTotaleCariatoTubiRestoC.setVisible(true);
                lblTotaleResoManualeTubiRestoC.setVisible(true);
                txtTotaleResoManualeTubiRestoC.setVisible(true);
                lblTotaleCaricatoManualeTubiRestoC.setVisible(true);
                txtTotaleCariatoManualeTubiRestoC.setVisible(true);

                lblInterventoTecnico.setVisible(true);
                lblVuota5.setVisible(true);
                lblCFTecnico.setVisible(true);
                txtCFTecnico.setVisible(true);
                lblIdPaese.setVisible(true);
                txtIdPaese.setVisible(true);
                lblIdCodice.setVisible(true);
                txtIdCodice.setVisible(true);
                lblDataOraIT.setVisible(true);
                formatTextDataOraIT.setVisible(true);
                lblCodiceIT.setVisible(true);
                cbxCodiceIT.setVisible(true);
                lblNumeroSW.setVisible(true);
                txtNumeroSW.setVisible(true);
                lblDataRelease.setVisible(true);
                formatTextDataRelease.setVisible(true);
                lblNoteIT.setVisible(true);
                txtNoteIT.setVisible(true);

                lblSegnalazione.setVisible(true);
                lblVuota6.setVisible(true);
                lblMaricola.setVisible(true);
                txtMatricola.setVisible(true);
                lblDataOraS.setVisible(true);
                formatTextDataOraS.setVisible(true);
                lblCodiceS.setVisible(true);
                cbxCodiceS.setVisible(true);
                lblNoteS.setVisible(true);
                txtNoteS.setVisible(true);

                if (cbxTipo.getSelectedItem() == vTipo[1]) {
                    if (Integer.valueOf(idProgressivo) == 1) {
                        txtVendutoP.setEnabled(false);
                        txtVendutoContanteP.setEnabled(false);
                        txtVendutoNoContanteP.setEnabled(false);
                        txtIncassatoP.setEnabled(false);
                        txtIncassatoRicaricaP.setEnabled(false);
                        txtIncassatoVenditaP.setEnabled(false);
                        txtTotaleResoTubiRestoP.setEnabled(false);
                        txtTotaleCariatoTubiRestoP.setEnabled(false);
                        txtTotaleResoManualeTubiRestoP.setEnabled(false);
                        txtTotaleCariatoManualeTubiRestoP.setEnabled(false);
                        formatTextDataOraPrelievoPrecP.setEnabled(false);
                        txtProgressivoPrelievoP.setEnabled(false);
                        lblVuota1.setText("campi disabilitati");
                    } else {
                        txtVendutoC.setEnabled(false);
                        txtVendutoContanteC.setEnabled(false);
                        txtVendutoNoContanteC.setEnabled(false);
                        txtIncassatoC.setEnabled(false);
                        txtIncassatoRicaricaC.setEnabled(false);
                        txtIncassatoVenditaC.setEnabled(false);
                        txtTotaleResoTubiRestoC.setEnabled(false);
                        txtTotaleCariatoTubiRestoC.setEnabled(false);
                        txtTotaleResoManualeTubiRestoC.setEnabled(false);
                        txtTotaleCariatoManualeTubiRestoC.setEnabled(false);
                        lblVuota2.setText("campi disabilitati");
                    }
                } else{
                    txtVendutoP.setEnabled(false);
                    txtVendutoContanteP.setEnabled(false);
                    txtVendutoNoContanteP.setEnabled(false);
                    txtIncassatoP.setEnabled(false);
                    txtIncassatoRicaricaP.setEnabled(false);
                    txtIncassatoVenditaP.setEnabled(false);
                    txtTotaleResoTubiRestoP.setEnabled(false);
                    txtTotaleCariatoTubiRestoP.setEnabled(false);
                    txtTotaleResoManualeTubiRestoP.setEnabled(false);
                    txtTotaleCariatoManualeTubiRestoP.setEnabled(false);
                    formatTextDataOraPrelievoPrecP.setEnabled(false);
                    txtProgressivoPrelievoP.setEnabled(false);
                    lblVuota1.setText("campi disabilitati");

                    txtVendutoC.setEnabled(false);
                    txtVendutoContanteC.setEnabled(false);
                    txtVendutoNoContanteC.setEnabled(false);
                    txtIncassatoC.setEnabled(false);
                    txtIncassatoRicaricaC.setEnabled(false);
                    txtIncassatoVenditaC.setEnabled(false);
                    txtTotaleResoTubiRestoC.setEnabled(false);
                    txtTotaleCariatoTubiRestoC.setEnabled(false);
                    txtTotaleResoManualeTubiRestoC.setEnabled(false);
                    txtTotaleCariatoManualeTubiRestoC.setEnabled(false);
                    lblVuota2.setText("campi disabilitati");
                }
                if (rdbInterventoTecnicoNo.isSelected() == true) {
                    //non si è verificato un intervento tecnico -> non inserisco i campi
                    lblVuota5.setText("campi disabilitati");
                    txtCFTecnico.setEnabled(false);
                    txtIdPaese.setEnabled(false);
                    txtIdCodice.setEnabled(false);
                    formatTextDataOraIT.setEnabled(false);
                    cbxCodiceIT.setEnabled(false);
                    txtNumeroSW.setEnabled(false);
                    formatTextDataRelease.setEnabled(false);
                    txtNoteIT.setEnabled(false);
                }

                if (rdbSegnalazioneNo.isSelected() == true) {
                    //non si deve segnalare qualcosa
                    lblVuota6.setText("campi disabilitati");
                    txtMatricola.setEnabled(false);
                    formatTextDataOraS.setEnabled(false);
                    cbxCodiceS.setEnabled(false);
                    txtNoteS.setEnabled(false);
                }
            }
        });

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String dataOraDal = controlloData(formatTextDal, "DataOraDal");

                String dataOraAl = controlloData(formatTextAl, "DataOraAl");

                String datoDataOraRilevazione = controlloData(formatTextDataOraRilevazione, "DataOraRilevazione");

                String datoAliquotaIVA = controlloFloat(txtAliquotaIVA, "AliquotaIVA");

                String datoImposta = controlloFloat(txtImposta, "Imposta");

                String datoNatura = controlloComboBox(cbxNatura, vNatura, "Natura");

                String datoAmmontare = controlloFloat(txtAmmontare, "Ammontare");

                String datoRifNormativo = controlloString(txtRifNormativo, "RifNormativo");

                String datoImortoParziale = controlloFloat(txtImportoParziale, "ImortoParziale");

                String datoTotaleAmmontareResi = controlloFloat(txtTotaleAmmontareResi, "TotaleAmmontareResi");

                String datoTotaleAmmontareAnnulli = controlloFloat(txtTotaleAmmontareAnnulli, "TotaleAmmontareAnnulli");

                String datoBeniInSospeso = controlloFloat(txtBeniInSospeso, "BeniInSospeso");

                String datoNonRiscossoServizi = controlloFloat(txtNonRiscossoServizi, "NonRiscossoServizi");

                String datoNonRiscossoFatture = controlloFloat(txtNonRiscossoFatture, "NonRiscossoFatture");

                String datoTotaleDaFattureRT = controlloFloat(txtTotaleDaFattureRT, "TotaleDaFattureRT");

                String datoNonRiscossoDCRaSSN = controlloFloat(txtNonRiscossoDCRaSSN, "datoNonRiscossoDCRaSSN");

                String datoNonRiscossoOmaggio = controlloFloat(txtNonRiscossoOmaggio, "NonRiscossoOmaggio");

                String datoCodiceAttivita = controlloInt(txtCodiceAttivita, "CodiceAttivita");

                String datoNumeroDocCommerciali = controlloInt(txtNumeroDocCommerciali, "NumeroDocCommerciali");

                String datoPagatoContanti = controlloFloat(txtPagatoContanti, "PagatoContanti");

                String datoPagatoElettronico = controlloFloat(txtPagatoElettronico, "PagatoElettronico");

                String datoScontoApagare = controlloFloat(txtScontoApagare, "ScontoApagare");

                String datoPagatoTicket = controlloFloat(txtPagatoTicket, "PagatoTicket");

                String datoNumeroTicket = controlloInt(txtNumeroTicket, "NumeroTicket");

                String datoVendutoP = controlloFloat(txtVendutoP, "Venduto (Prelievo)");

                String datoVendutoContanteP = controlloFloat(txtVendutoContanteP, "VendutoContante (Prelievo)");

                String datoVendutoNoContanteP = controlloFloat(txtVendutoNoContanteP, "VendutoNoContante (Prelievo)");

                String datoIncassatoP = controlloFloat(txtIncassatoP, "Incassato (Prelievo)");

                String datoIncassatoRicaricaP = controlloFloat(txtIncassatoRicaricaP, "IncassatoRicarica (Prelievo)");

                String datoIncassatoVenditaP = controlloFloat(txtIncassatoVenditaP, "IncassatoVendita (Prelievo)");

                String datoTotaleResoTubiRestoP = controlloFloat(txtTotaleResoTubiRestoP, "TotaleResoTubiResto (Prelievo)");

                String datoTotaleCaricatoTubiRestoP = controlloFloat(txtTotaleCariatoTubiRestoP, "TotaleCaricatoTubiResto (Prelievo)");

                String datoTotaleResoManualeTubiRestoP = controlloFloat(txtTotaleResoManualeTubiRestoP, "TotaleResoManualeTubiResto (Prelievo)");

                String datoTotaleCaricatoManualeTubiRestoP = controlloFloat(txtTotaleCariatoManualeTubiRestoP, "TotaleCariatoManualeTubiResto (Prelievo)");

                String datoDataOraPrelievoPrecP = controlloData(formatTextDataOraPrelievoPrecP, "DataOraPrelievoPrecP");

                String datoProgressivoPrelievoP = controlloInt(txtProgressivoPrelievoP, "ProgressivoPrelievo (Prelievo)");

                String datoVendutoC = controlloFloat(txtVendutoC, "Venduto (Cumulato)");

                String datoVendutoContanteC = controlloFloat(txtVendutoContanteC, "VendutoContante (Cumulato)");

                String datoVendutoNoContanteC = controlloFloat(txtVendutoNoContanteC, "VendutoNoContante (Cumulato)");

                String datoIncassatoC = controlloFloat(txtIncassatoC, "Incassato (Cumulato)");

                String datoIncassatoRicaricaC = controlloFloat(txtIncassatoRicaricaC, "IncassatoRicarica (Cumulato)");

                String datoIncassatoVenditaC = controlloFloat(txtIncassatoVenditaC, "IncassatoVendita (Cumulato)");

                String datoTotaleResoTubiRestoC = controlloFloat(txtTotaleResoTubiRestoC, "TotaleResoTubiResto (Cumulato)");

                String datoTotaleCaricatoTubiRestoC = controlloFloat(txtTotaleCariatoTubiRestoC, "TotaleCaricatoTubiResto (Cumulato)");

                String datoTotaleResoManualeTubiRestoC = controlloFloat(txtTotaleResoManualeTubiRestoC, "TotaleResoManualeTubiResto (Cumulato)");

                String datoTotaleCaricatoManualeTubiRestoC = controlloFloat(txtTotaleCariatoManualeTubiRestoC, "TotaleCariatoManualeTubiResto (Cumulato)");

                String datoCFTecnico = controlloString(txtCFTecnico, "codice fiscale tecnico");

                String datoIdPaese = controlloString(txtIdPaese, "idPaese (ex:IT)");

                String datoIdCodice = controlloString(txtIdCodice, "idCodice");

                String datoDataOraIT = controlloData(formatTextDataOraIT, "DataOraIT");

                String datoCodiceIT = controlloComboBox(cbxCodiceIT, vCodiceIT, "CodiceIT");

                String datoNumeroSW=null;
                String datoDataRelease=null;
                if(datoCodiceIT=="07"){
                    datoNumeroSW = controlloString(txtNumeroSW, "NumeroSW");
                    datoDataRelease = controlloData(formatTextDataRelease, "DataRelease");
                }

                String datoNoteIT=controlloString(txtNoteIT,"NoteIT");

                String datoMatricola=controlloString(txtMatricola,"Matricola");

                String datoDataOraS=controlloData(formatTextDataOraS,"DataOraS");

                String datoCodiceS=controlloComboBox(cbxCodiceS,vCodiceS,"CodiceS");

                String datoNoteS=controlloString(txtNoteS,"NoteS");




                //a questo punto è possibile stampare il file
                JOptionPane.showMessageDialog(null,"i dati sono stati inseriti correttamente. Clicca sul bottone GeneraXML per creare il file XML");
                btnGeneraXML.setEnabled(true);
                nuovoXML=new Scontrino(String.valueOf(idProgressivo),dataOraDal,dataOraAl,datoDataOraRilevazione,datoAliquotaIVA,
                        datoImposta,datoNatura,datoAmmontare,datoRifNormativo,datoImortoParziale,
                        datoTotaleAmmontareResi,datoTotaleAmmontareAnnulli,datoBeniInSospeso,
                        datoNonRiscossoServizi,datoNonRiscossoFatture,datoTotaleDaFattureRT,datoNonRiscossoDCRaSSN,
                        datoNonRiscossoOmaggio,datoCodiceAttivita,datoNumeroDocCommerciali,datoPagatoContanti,
                        datoPagatoElettronico,datoScontoApagare,datoPagatoTicket,datoNumeroTicket,datoVendutoP,datoVendutoContanteP,
                        datoVendutoNoContanteP,datoIncassatoP,datoIncassatoRicaricaP,datoIncassatoVenditaP,datoTotaleResoTubiRestoP,
                        datoTotaleCaricatoTubiRestoP,datoTotaleResoManualeTubiRestoP,datoTotaleCaricatoManualeTubiRestoP,
                        datoDataOraPrelievoPrecP,datoProgressivoPrelievoP,datoVendutoC,datoVendutoContanteC,datoVendutoNoContanteC,
                        datoIncassatoC,datoIncassatoRicaricaC,datoIncassatoVenditaC,datoTotaleResoTubiRestoC,datoTotaleCaricatoTubiRestoC,
                        datoTotaleResoManualeTubiRestoC,datoTotaleCaricatoManualeTubiRestoC,datoCFTecnico,datoIdPaese,datoIdCodice,
                        datoDataOraIT,datoCodiceIT,datoNumeroSW,datoDataRelease,datoNoteIT,datoMatricola,datoDataOraS,datoCodiceS,datoNoteS);
            }
        });

        btnGeneraXML.setVisible(true);
        btnGeneraXML.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scontrino1.crea(scontrino1,nuovoXML);
                idProgressivo++;
                csvIdProgressivo.writeId(idProgressivo);
            }
        });

        btnAnnulla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                csvIdProgressivo.writeId(idProgressivo);
                System.exit(0);
            }
        });

        btnNuovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlcenter.setVisible(false);
                initUI();
            }
        });
    }

    //controlli di inserimento
    private String controlloFloat(JTextField txtInserito, String tag){
        if(txtInserito.isEnabled()==true) {
            if (txtInserito.getText().matches("^-?(?:\\d+|\\d*\\.\\d+)$")) {
                float dato = Float.valueOf(txtInserito.getText());
                return String.valueOf(dato);
            } else {
                String datoInserito = JOptionPane.showInputDialog("ERRORE! inserisci il valore corretto del campo " + tag);
                txtInserito.setText(datoInserito);
                //finzione ricorsiva per verificare il nuovo dato inserito
                return controlloFloat(txtInserito, tag);
            }
        }
        return null;
    }

    private String controlloString(JTextField txtInserito,String tag){
        if(txtInserito.isEnabled()==true) {
            if (!txtInserito.getText().equals("")) {
                String dato = txtInserito.getText();
                return dato;
            } else {
                String datoInserito = JOptionPane.showInputDialog("ERRORE! inserisci il valore corretto del campo " + tag);
                txtInserito.setText(datoInserito);
                //finzione ricorsiva per verificare il nuovo dato inserito
                return controlloFloat(txtInserito, tag);
            }
        }
        return null;
    }

    private String controlloInt(JTextField txtInserito, String tag){
        if(txtInserito.isEnabled()==true) {
        if(txtInserito.getText().matches("^([1-9]\\d*|0)$")){
            int dato = Integer.valueOf(txtInserito.getText());
            return String.valueOf(dato);
        } else {
            String datoInserito = JOptionPane.showInputDialog("ERRORE! inserisci il valore corretto del campo " + tag);
            txtInserito.setText(datoInserito);
            //finzione ricorsiva per verificare il nuovo dato inserito
            return controlloInt(txtInserito, tag);
        }
        }
        return null;
    }

    private String controlloData(JFormattedTextField formatInserito, String tag){
        if(formatInserito.isEnabled()==true) {
            //sostituisco spazio con T
            String testo= String.format(formatInserito.getText());
            String dato= testo.replace(' ','T');
            return dato;
            }
            return null;
        }

    private String controlloComboBox(JComboBox cbxInserito,String[] v, String tag){
        if(cbxInserito.isEnabled()==true) {
            String dato="";
            if(cbxInserito.getSelectedItem()=="inserisci"){
                dato= (String) JOptionPane.showInputDialog(null,
                        "ERRORE! inserisci il valore corretto del campo "+tag,null,
                        JOptionPane.QUESTION_MESSAGE,null,v,v[0]);
                cbxInserito.setSelectedItem(dato);
                dato=controlloComboBox(cbxInserito,v,tag);
            } else{
                dato= (String) cbxInserito.getSelectedItem();
            }
            return dato=dato.substring(0,2);
        }
        return null;
    }
}

