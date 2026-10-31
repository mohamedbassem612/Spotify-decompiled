package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nmu implements oi51 {
    public final /* synthetic */ byte a;

    public final void a(ji50 ji50Var, tcr0 tcr0Var) {
        byte b = this.a;
        w7x w7xVar = w7x.a;
        switch (b) {
            case 0:
                qlt qltVar = qlt.T0;
                ji50Var.b.put(qer0.class, r4o1.Q(wiu.O0, w7xVar, qltVar, qlt.S0));
                break;
            default:
                h9a1 h9a1Var = h9a1.c1;
                ji50Var.b.put(hfr0.class, r4o1.Q(hea1.Z0, w7xVar, h9a1Var, h9a1.b1));
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return qer0.class;
            default:
                return hfr0.class;
        }
    }

    public final Set c() {
        byte b = this.a;
        return w7x.a;
    }
}
