package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tg0 implements o2q0 {
    public final /* synthetic */ ug0 a;
    public final /* synthetic */ ssw0 b;

    public tg0(ug0 ug0Var, ssw0 ssw0Var) {
        this.a = ug0Var;
        this.b = ssw0Var;
    }

    public final void b(String str, zf30 zf30Var) {
        m4j0 m4j0Var;
        e6w0 e6w0VarK = this.a.b.k();
        k6w0 k6w0Var = null;
        if (e6w0VarK instanceof c6w0) {
            m4j0Var = m4j0.a;
        } else {
            m4j0Var = e6w0VarK instanceof b6w0 ? l4j0.a : null;
        }
        if (m4j0Var != null) {
            Bundle bundle = zf30Var.f;
            d3j0 d3j0Var = bundle != null ? (d3j0) jhc1.t(bundle, "message_metadata", d3j0.class) : null;
            if (d3j0Var == null) {
                d3j0Var = new d3j0(a3j0.a, x2j0.a);
            }
            k6w0Var = new k6w0(m4j0Var, d3j0Var, new sg0(1, (lnm) null, (byte) 0));
        }
        smc0 smc0VarN = k4p1.n();
        if (k6w0Var != null) {
            smc0VarN.add(k6w0Var);
        }
        this.b.l(k4p1.k(smc0VarN));
    }
}
