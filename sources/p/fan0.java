package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fan0 implements hj71 {
    public static final Set b = f46.S0(new o571[]{g571.d, n571.d, i571.d, j571.d, v471.d});
    public final d4e0 a;

    public fan0(d4e0 d4e0Var) {
        this.a = d4e0Var;
    }

    public final Object n(k371 k371Var, lnm lnmVar) {
        wa71 wa71Var;
        blc0 m231Var;
        if (((ug4) this.a.b).a() && (wa71Var = k371Var.a) != null) {
            try {
                Set set = s4b1.f;
                m231Var = uic.x(wa71Var.a).c;
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            if (m231Var == blc0.ti) {
                wa71 wa71VarA = wa71.a(wa71Var, null, mqo1.G(wa71Var.c).put("feature", "mvcdp"), null, 123);
                z771 z771VarP = tyo1.p(blc0.mg, new String[0]);
                dz61 dz61Var = dz61.d;
                return new qj71(Collections.singletonList(new u771(new t771(wa71VarA, z771VarP), new pz61(new y171(rc11.a.b(zwy.class)), new exy(null, m1f1.a, 5, false, new rhy(vny.a, 62), null, null), cz61.d, false), new bj71(b, false, null))), 0, puk.d);
            }
        }
        return null;
    }
}
