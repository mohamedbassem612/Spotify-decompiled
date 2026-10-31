package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vgi0 implements mj00 {
    public final /* synthetic */ byte a;
    public final pbq b;
    public final cgi0 c;
    public final lj00 d;

    public vgi0(pbq pbqVar, h30 h30Var) {
        this.a = (byte) 0;
        this.b = pbqVar;
        this.d = h30Var;
        this.c = new cgi0(63);
    }

    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        byte b = this.a;
        h30 h30Var = this.d;
        switch (b) {
            case 0:
                ugi0 ugi0Var = new ugi0(this, ji50Var, xk00Var, (byte) 0);
                Map map = h30Var.b;
                pfi0 pfi0Var = pfi0.h;
                ish0 ish0Var = ish0.N0;
                LinkedHashMap linkedHashMap = ji50Var.b;
                linkedHashMap.put(yfi0.class, new vw21(pfi0Var, map, new fc3(ugi0Var, (byte) 5), ish0Var, (vu30) null));
                ugi0 ugi0Var2 = new ugi0(this, ji50Var, xk00Var, (byte) 1);
                linkedHashMap.put(zfi0.class, new vw21(pfi0Var, map, new fc3(ugi0Var2, (byte) 5), ish0.O0, (vu30) null));
                break;
            default:
                w4v0 w4v0Var = new w4v0(this, ji50Var, xk00Var, (byte) 0);
                Map map2 = h30Var.b;
                pfi0 pfi0Var2 = pfi0.h;
                fnt0 fnt0Var = fnt0.b1;
                LinkedHashMap linkedHashMap2 = ji50Var.b;
                linkedHashMap2.put(s4v0.class, new vw21(pfi0Var2, map2, new fc3(w4v0Var, (byte) 5), fnt0Var, (vu30) null));
                w4v0 w4v0Var2 = new w4v0(this, ji50Var, xk00Var, (byte) 1);
                linkedHashMap2.put(t4v0.class, new vw21(pfi0Var2, map2, new fc3(w4v0Var2, (byte) 5), fnt0.c1, (vu30) null));
                break;
        }
        return ji50Var;
    }

    public vgi0(pbq pbqVar, h30 h30Var, byte b) {
        this.a = (byte) 1;
        this.b = pbqVar;
        this.d = h30Var;
        this.c = cgi0.g;
    }
}
