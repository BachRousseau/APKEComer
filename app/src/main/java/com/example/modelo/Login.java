package com.example.modelo;

public class Login {
    private int codlog;
    private String corlog;
    private String paslog;
    private int idcli;
    private int idemp;
    private String tipolog;
    private int actlog;

    public Login() {}

    public Login(int codlog, String corlog, String paslog, int idcli, int idemp, String tipolog, int actlog) {
        this.codlog = codlog;
        this.corlog = corlog;
        this.paslog = paslog;
        this.idcli = idcli;
        this.idemp = idemp;
        this.tipolog = tipolog;
        this.actlog = actlog;
    }

    public int getCodlog() {
        return codlog;
    }

    public void setCodlog(int codlog) {
        this.codlog = codlog;
    }

    public String getCorlog() {
        return corlog;
    }

    public void setCorlog(String corlog) {
        this.corlog = corlog;
    }

    public String getPaslog() {
        return paslog;
    }

    public void setPaslog(String paslog) {
        this.paslog = paslog;
    }

    public int getIdcli() {
        return idcli;
    }

    public void setIdcli(int idcli) {
        this.idcli = idcli;
    }

    public int getIdemp() {
        return idemp;
    }

    public void setIdemp(int idemp) {
        this.idemp = idemp;
    }

    public String getTipolog() {
        return tipolog;
    }

    public void setTipolog(String tipolog) {
        this.tipolog = tipolog;
    }

    public int getActlog() {
        return actlog;
    }

    public void setActlog(int actlog) {
        this.actlog = actlog;
    }
}
