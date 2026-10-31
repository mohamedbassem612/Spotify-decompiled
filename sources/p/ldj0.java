package p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ldj0 {
    public final dg30 a;
    public final lzn0 b;
    public final i3j0 c;
    public final a1r0 d;

    public ldj0(dg30 dg30Var, lzn0 lzn0Var, i3j0 i3j0Var, a1r0 a1r0Var) {
        this.a = dg30Var;
        this.b = lzn0Var;
        this.c = i3j0Var;
        this.d = a1r0Var;
    }

    public final void a() {
        dg30 dg30Var = this.a;
        if (dg30Var.isDestroyed()) {
            return;
        }
        lzn0 lzn0Var = this.b;
        if (lzn0Var.j(dg30Var)) {
            lzn0Var.e();
            return;
        }
        a1r0 a1r0Var = this.d;
        if (a1r0Var.h(dg30Var)) {
            a1r0Var.l();
        }
    }

    public final void b(blc0 blc0Var) {
        dg30 dg30Var = this.a;
        if (dg30Var.isDestroyed()) {
            return;
        }
        lzn0 lzn0Var = this.b;
        if (lzn0Var.j(dg30Var)) {
            lzn0Var.d(blc0Var);
            return;
        }
        a1r0 a1r0Var = this.d;
        if (a1r0Var.h(dg30Var)) {
            a1r0Var.d(blc0Var);
        }
    }

    public final Object c(String str, tv80 tv80Var, Bundle bundle, kdj0 kdj0Var, onm onmVar) {
        ou80 ou80Var;
        lzn0 lzn0Var = this.b;
        dg30 dg30Var = this.a;
        str = null;
        String str2 = null;
        if (!lzn0Var.j(dg30Var)) {
            Set set = s4b1.f;
            if (uic.x(str).c != blc0.o6) {
                a1r0 a1r0Var = this.d;
                if (a1r0Var.h(dg30Var)) {
                    if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                        str2 = ou80Var.a;
                    }
                    a1r0Var.a(str, str2, bundle);
                } else {
                    a1r0.m(a1r0Var, str, tv80Var, bundle, 8);
                }
            } else {
                lzn0Var.i(new dwn0(str, "", false, false, 0, 0, false, null, null, tv80Var != null ? new bwn0(tv80Var) : null), bundle);
            }
        } else {
            if (kdj0Var != null) {
                y2j0 y2j0Var = kdj0Var.c;
                z2j0 z2j0Var = kdj0Var.b;
                int i = kdj0Var.a;
                boolean z = z2j0Var instanceof z2j0;
                f3j0 f3j0Var = f3j0.a;
                f3j0 f3j0Var2 = e3j0.a;
                i3j0 i3j0Var = this.c;
                if (z) {
                    int iC = l1d.C(i);
                    if (iC != 0) {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        f3j0Var = f3j0Var2;
                    }
                    boolean z2 = z2j0Var.a;
                    i3j0Var.getClass();
                    return i3j0Var.a(str, (tv80) null, f3j0Var, new d3j0(new z2j0(z2), y2j0Var), bundle, onmVar);
                }
                if (tv80Var == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                int iC2 = l1d.C(i);
                if (iC2 != 0) {
                    if (iC2 != 1) {
                        eg.o();
                        return null;
                    }
                    f3j0Var = f3j0Var2;
                }
                boolean z3 = z2j0Var instanceof b3j0 ? ((b3j0) z2j0Var).a : false;
                i3j0Var.getClass();
                return i3j0Var.a(str, tv80Var, f3j0Var, new d3j0(new b3j0(z3), y2j0Var), bundle, onmVar);
            }
            lzn0Var.i(new dwn0(str, "", false, false, 0, 0, false, null, null, tv80Var != null ? new bwn0(tv80Var) : null), bundle);
        }
        return Boolean.TRUE;
    }
}
