package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vt90 {
    public final lx91 a;
    public final kea0 b;

    public vt90(lx91 lx91Var, kea0 kea0Var) {
        this.a = lx91Var;
        this.b = kea0Var;
    }

    public final void a(wea0 wea0Var, qo90 qo90Var, no90 no90Var) {
        boolean z;
        kda0 kda0Var;
        boolean z2;
        int i = no90Var.a;
        Set set = qo90Var.b;
        String str = qo90Var.c;
        if (!no90Var.b.a) {
            int iC = l1d.C(i);
            if (iC == 0 || iC == 1) {
                z = false;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                z = true;
            }
            this.a.p.onNext(new v3a1(str, z, wea0Var, set, 1));
            return;
        }
        String str2 = pno1.g(qo90Var.d).b;
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            kda0Var = kda0.UNKNOWN;
        } else if (iC2 == 1) {
            kda0Var = kda0.CONTROL;
        } else {
            if (iC2 != 2) {
                eg.o();
                return;
            }
            kda0Var = kda0.LISTEN_AND_CONTROL;
        }
        int iC3 = l1d.C(i);
        if (iC3 == 0 || iC3 == 1) {
            z2 = false;
        } else {
            if (iC3 != 2) {
                eg.o();
                return;
            }
            z2 = true;
        }
        this.b.a.b.accept(new yt60(str2, kda0Var, str, wea0Var, z2, set));
    }
}
