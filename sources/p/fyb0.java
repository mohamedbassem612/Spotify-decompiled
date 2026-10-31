package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class fyb0 {
    public static final int a;

    static {
        uwr uwrVar = cbx.a;
        a = z4p1.G(((yex) zex.a.d).d);
    }

    public static final boolean a(vxb0 vxb0Var) {
        Set set = s4b1.f;
        v5b1 v5b1Var = uic.x(vxb0Var.a).d;
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e);
    }

    public static final boolean b(vxb0 vxb0Var) {
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(vxb0Var.a).c;
        return blc0Var == blc0.Pg || blc0Var == blc0.fh;
    }

    public static final boolean c(vxb0 vxb0Var) {
        List list = vxb0Var.b;
        if (list.size() == 1) {
            ji0 ji0Var = (ji0) o7h.t0(0, list);
            String str = ji0Var != null ? ji0Var.W0 : null;
            if (str == null ? false : str.equals("sponsored_playlist")) {
                return true;
            }
        }
        return false;
    }
}
