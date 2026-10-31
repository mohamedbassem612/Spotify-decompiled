package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eon0 extends wnn0 {
    public final rzn0 h;
    public final String i;
    public final Object j;
    public final ArrayList k;

    public eon0(rzn0 rzn0Var, String str) {
        super(rzn0Var.b(rzn1.u(fon0.class)), -1, (String) null);
        this.k = new ArrayList();
        this.h = rzn0Var;
        this.i = str;
    }

    public final don0 c() {
        don0 don0Var = (don0) super.a();
        for (vnn0 vnn0Var : this.k) {
            if (vnn0Var != null) {
                don0Var.n(vnn0Var);
            }
        }
        Object obj = this.j;
        String str = this.i;
        if (str == null && obj == null) {
            if (this.c != null) {
                eg.m("You must set a start destination route");
                return null;
            }
            eg.m("You must set a start destination id");
            return null;
        }
        if (str != null) {
            don0Var.t(str);
            return don0Var;
        }
        if (obj == null) {
            don0Var.s(0);
            return don0Var;
        }
        nma0 nma0VarT = wmo1.t(rc11.a.b(obj.getClass()));
        sa5 sa5Var = new sa5(obj, (byte) 3);
        int iN = up30.n(nma0VarT);
        vnn0 vnn0VarP = don0Var.p(iN, don0Var, false);
        if (vnn0VarP == null) {
            jah.h("Cannot find startDestination ", nma0VarT.getDescriptor().h(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
            return null;
        }
        don0Var.t((String) sa5Var.invoke(vnn0VarP));
        don0Var.Z = iN;
        return don0Var;
    }

    public eon0(rzn0 rzn0Var, Object obj, Map map) {
        super(rzn0Var.b(rzn1.u(fon0.class)), (tka0) null, map);
        this.k = new ArrayList();
        this.h = rzn0Var;
        this.j = obj;
    }
}
