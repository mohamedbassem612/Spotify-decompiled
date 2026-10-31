package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r2r {
    public final iu30 a;
    public final vu30 b;
    public final gs90 c;
    public final iu30 d;
    public List e;

    public r2r(gs90 gs90Var, gs90 gs90Var2) {
        jqa0 jqa0Var = jqa0.V0;
        this.a = ywq.P0;
        this.b = gs90Var;
        this.c = gs90Var2;
        this.d = jqa0Var;
        this.e = z6x.a;
    }

    public final dmh1 a(String str, iu30 iu30Var) {
        u2r u2rVar = new u2r();
        this.a.invoke(u2rVar);
        this.b.invoke(u2rVar, str);
        iu30Var.invoke(u2rVar);
        w1k w1kVar = new w1k(u2rVar.b);
        ArrayList arrayList = u2rVar.c;
        if (!arrayList.isEmpty()) {
            w1kVar = new w1k(p7h.M(new w1k(arrayList), w1kVar));
        }
        dmh1 jd80Var = new jd80(xs31.b(w1kVar, u2rVar.a));
        this.e = o7h.O0(jd80Var, u2rVar.d);
        ArrayList arrayList2 = u2rVar.e;
        if (!arrayList2.isEmpty()) {
            jd80Var = (dmh1) this.c.invoke(jd80Var, arrayList2);
        }
        return (dmh1) this.d.invoke(jd80Var);
    }
}
