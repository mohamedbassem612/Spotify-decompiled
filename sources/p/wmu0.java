package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wmu0 {
    public final kly0 a;
    public final ced0 b;
    public final xm41 c;
    public final idd1 d = new idd1(new kks0(this, (byte) 24));

    public wmu0(kly0 kly0Var, ced0 ced0Var, xm41 xm41Var) {
        this.a = kly0Var;
        this.b = ced0Var;
        this.c = xm41Var;
    }

    public final boolean a(x7i1 x7i1Var) {
        rmu0 rmu0Var = rmu0.b;
        idd1 idd1Var = this.d;
        return ((idd1Var.isInitialized() || eth.C(this.c)) ? ((Map) ((u601) idd1Var.getValue()).getValue()).get(rmu0Var) instanceof ul10 : false) && x7i1Var.X;
    }
}
