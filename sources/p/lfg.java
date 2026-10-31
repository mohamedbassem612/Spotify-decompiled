package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lfg {
    public static final lfg b = new lfg(0);
    public static final lfg c = new lfg(1);
    public static final lfg d = new lfg(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ lfg(byte b2) {
        this.a = b2;
    }

    public static String a(jfg jfgVar) {
        String strX;
        String strV = n8p1.v(jfgVar.getName());
        if (!(jfgVar instanceof y0h1)) {
            n9r n9rVarK = jfgVar.k();
            if (n9rVarK instanceof beg) {
                strX = a((jfg) n9rVarK);
            } else {
                strX = n9rVarK instanceof dzq0 ? n8p1.x(lf30.f(((ezq0) ((dzq0) n9rVarK)).f.a)) : null;
            }
            if (strX != null && !strX.equals("")) {
                return cy30.l(strX, '.', strV);
            }
        }
        return strV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [p.jfg, p.n9r] */
    /* JADX WARN: Type inference failed for: r2v2, types: [p.n9r] */
    /* JADX WARN: Type inference failed for: r2v3, types: [p.n9r] */
    public final String b(jfg jfgVar, cht chtVar) {
        switch (this.a) {
            case 0:
                return jfgVar instanceof y0h1 ? chtVar.L(((y0h1) jfgVar).getName(), false) : chtVar.n(n8p1.x(lf30.f(iht.f(jfgVar))));
            case 1:
                if (jfgVar instanceof y0h1) {
                    return chtVar.L(((y0h1) jfgVar).getName(), false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(jfgVar.getName());
                    jfgVar = jfgVar.k();
                } while (jfgVar instanceof beg);
                return n8p1.x(new vd31(arrayList));
            default:
                return a(jfgVar);
        }
    }
}
