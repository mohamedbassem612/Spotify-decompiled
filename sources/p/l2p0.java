package p;

import android.view.ViewGroup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l2p0 extends r3g1 {
    public final iu30 N0;
    public final q2p0 O0;
    public final HashMap P0 = new HashMap();
    public final Map X;
    public final List Y;
    public final v1r0 Z;

    public l2p0(Map map, List list, v1r0 v1r0Var, iu30 iu30Var, q2p0 q2p0Var, dn4 dn4Var) {
        this.X = map;
        this.Y = list;
        this.Z = v1r0Var;
        this.N0 = iu30Var;
        this.O0 = q2p0Var;
        x(true);
        ((r3g1) this).g = dn4Var.b();
        ((r3g1) this).h = dn4Var.a();
    }

    public final int g(int i) {
        okf1 okf1Var;
        kkf1 kkf1Var = new kkf1(D(i), ((r3g1) this).e, ((r3g1) this).f);
        for (lzd lzdVar : this.Y) {
            ynb0 ynb0Var = (ynb0) this.X.get(lzdVar.a);
            if (ynb0Var != null && (okf1Var = (okf1) ynb0Var.get()) != null && okf1Var.b(kkf1Var)) {
                return lzdVar.a.ordinal();
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return 0;
    }

    public final void n(int i, w611 w611Var) {
        ((e711) w611Var).E(i, D(i));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        for (lzd lzdVar : this.Y) {
            lkf1 lkf1Var = lzdVar.a;
            if (lkf1Var.ordinal() == i) {
                HashMap map = this.P0;
                Object objA = map.get(lkf1Var);
                if (objA == null) {
                    objA = ((okf1) ((ynb0) sqg0.G(lkf1Var, this.X)).get()).a(this.O0);
                    map.put(lkf1Var, objA);
                }
                mkf1 mkf1VarA = ((nkf1) objA).a();
                Object obj = lzdVar.b;
                if (obj == null) {
                    obj = rih1.a;
                }
                return mkf1VarA.d(viewGroup, obj, this.Z, new y3o0(this, (byte) 16));
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }
}
