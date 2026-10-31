package p;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class woi1 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static iva0 a(eva0 eva0Var) {
        fva0 fva0VarO = iva0.o();
        int iQ = eva0Var.q();
        fva0VarO.d();
        ((iva0) fva0VarO.b).p(iQ);
        for (dva0 dva0Var : eva0Var.p()) {
            gva0 gva0VarN = hva0.n();
            String strO = dva0Var.m().o();
            gva0VarN.d();
            ((hva0) gva0VarN.b).r(strO);
            rpa0 rpa0VarP = dva0Var.p();
            gva0VarN.d();
            ((hva0) gva0VarN.b).q(rpa0VarP);
            fuq0 fuq0VarO = dva0Var.o();
            gva0VarN.d();
            ((hva0) gva0VarN.b).p(fuq0VarO);
            int iN = dva0Var.n();
            gva0VarN.d();
            ((hva0) gva0VarN.b).o(iN);
            hva0 hva0Var = (hva0) gva0VarN.a();
            fva0VarO.d();
            ((iva0) fva0VarO.b).m(hva0Var);
        }
        return (iva0) fva0VarO.a();
    }
}
