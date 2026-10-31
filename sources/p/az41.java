package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class az41 implements r331 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ az41(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void e(d331 d331Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (d331Var instanceof y231) {
                    qe7 qe7Var = ((y231) d331Var).a;
                    hi90 hi90Var = (hi90) o7h.s0(qe7Var.a);
                    if (hi90Var != null) {
                        ((bz41) obj).a.a.invoke(new r400(hi90Var.getUri(), qe7Var.c));
                    }
                    break;
                } else if (!(d331Var instanceof l231)) {
                    eg.o();
                    break;
                }
                break;
            case 1:
                if (d331Var instanceof y231) {
                    ((qy71) obj).a.invoke(((y231) d331Var).a);
                }
                break;
            case 2:
                vas vasVar = ((z481) obj).b;
                if (d331Var.equals(l231.a)) {
                    vasVar.invoke(oe20.a);
                } else if (!(d331Var instanceof y231)) {
                    eg.o();
                } else {
                    Set set = s4b1.f;
                    qxm1 qxm1Var = (qxm1) ((y231) d331Var).a;
                    vasVar.invoke(new ne20(uic.j(qxm1Var.a, e6k.e) ? new vod1(0, qxm1Var.a, qxm1Var.b) : iro1.n(qxm1Var.a, z6x.a)));
                }
                break;
            case 3:
                if (d331Var instanceof y231) {
                    ((g1f1) obj).d.l(new nif0(((jcb0) ((y231) d331Var).a).a));
                }
                break;
            default:
                npg1 npg1Var = (npg1) obj;
                est estVar = d331Var instanceof y231 ? ((y231) d331Var).a.a : est.c;
                ohd ohdVar = npg1Var.m;
                if (ohdVar != null) {
                    ohdVar.resumeWith(estVar);
                }
                npg1Var.m = null;
                break;
        }
    }
}
