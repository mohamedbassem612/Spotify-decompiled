package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dkq0 extends klq0 {
    public static final dkq0 c = new dkq0(0, 2, 1);

    public final void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        int i;
        vr80 vr80Var = (vr80) a9aVar.m(0);
        int iC = hf91Var.c((s340) a9aVar.m(1));
        if (hf91Var.t >= iC) {
            g0k.a("Check failed");
        }
        rqt0.E(hf91Var, j06Var, iC);
        int i2 = hf91Var.t;
        int iF = hf91Var.v;
        while (iF >= 0 && !hf91Var.x(iF)) {
            iF = hf91Var.F(iF, hf91Var.b);
        }
        int iT = iF + 1;
        int iM = 0;
        while (iT < i2) {
            if (hf91Var.u(i2, iT)) {
                if (hf91Var.x(iT)) {
                    iM = 0;
                }
                iT++;
            } else {
                iM += hf91Var.x(iT) ? 1 : hf91Var.E(iT);
                iT += hf91Var.t(iT);
            }
        }
        while (true) {
            i = hf91Var.t;
            if (i >= iC) {
                break;
            }
            if (hf91Var.u(iC, i)) {
                int i3 = hf91Var.t;
                if (i3 < hf91Var.u && (hf91Var.b[(hf91Var.q(i3) * 5) + 1] & 1073741824) != 0) {
                    j06Var.h(hf91Var.D(hf91Var.t));
                    iM = 0;
                }
                hf91Var.Q();
            } else {
                iM += hf91Var.M();
            }
        }
        if (i != iC) {
            g0k.a("Check failed");
        }
        vr80Var.a = iM;
    }
}
