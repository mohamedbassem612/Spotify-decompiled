package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ryf1 implements f4r {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tva1 b;

    public /* synthetic */ ryf1(tva1 tva1Var, byte b) {
        this.a = b;
        this.b = tva1Var;
    }

    public final f1r a(Object obj) {
        byte b = this.a;
        tva1 tva1Var = this.b;
        switch (b) {
            case 0:
                hyf1 hyf1Var = (hyf1) obj;
                return ((y08) tva1Var.h).Y.a(new p08(hyf1Var.a, null, hyf1Var.e));
            case 1:
                return ((jd6) tva1Var.i).c.a(new uho(((hyf1) obj).a, null, null, null, null, null, 254));
            case 2:
                hyf1 hyf1Var2 = (hyf1) obj;
                return g6p1.s(g6p1.s(g6p1.s(g6p1.s(((o3r) tva1Var.c).a(hyf1Var2), ((ryf1) tva1Var.O0).a(hyf1Var2)), qxy0.r(((ryf1) tva1Var.X).a(hyf1Var2))), qxy0.r(((ryf1) tva1Var.Y).a(hyf1Var2))), qxy0.r(((ryf1) tva1Var.Z).a(hyf1Var2)));
            case 3:
                hyf1 hyf1Var3 = (hyf1) obj;
                String str = hyf1Var3.b;
                if (str != null) {
                    return ((wm31) tva1Var.t).a.a(new tm31(hyf1Var3.a, str, hyf1Var3.c));
                }
                return new p6x();
            default:
                hyf1 hyf1Var4 = (hyf1) obj;
                qyf1 qyf1Var = hyf1Var4.d;
                return ((qyf1Var instanceof oyf1) && ((oyf1) qyf1Var).a == 1) ? ((o3r) tva1Var.N0).a(hyf1Var4) : new p6x();
        }
    }
}
