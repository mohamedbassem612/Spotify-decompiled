package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class xs31 {
    public static final zhq0 a = new zhq0((byte) 14);

    public static final us31 a(w1k w1kVar, ork orkVar) {
        ks31 ks31Var = new ks31();
        orkVar.invoke(ks31Var);
        return new us31(w1kVar, o7h.l1(ks31Var.a));
    }

    public static final dmh1 b(w1k w1kVar, ks31 ks31Var) {
        ArrayList arrayList = ks31Var.a;
        return arrayList.isEmpty() ? w1kVar : new us31(w1kVar, o7h.l1(arrayList));
    }

    public static void d(ns31 ns31Var, zjd1 zjd1Var, xv00 xv00Var, iu30 iu30Var, iu30 iu30Var2) {
        ns31Var.a(new or31(new lga(zjd1Var, vm31.N0, (byte) 1), vm31.O0, new juy0(iu30Var, xv00Var), new t7i(iu30Var2, (byte) 12)));
    }

    public static final void e(ns31 ns31Var, zjd1 zjd1Var, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, vu30 vu30Var2) {
        ns31Var.a(new or31(new lga(zjd1Var, iu30Var, (byte) 2), new n601(iu30Var2, (byte) 14), new p3k(vu30Var, (byte) 3), new p3k(vu30Var2, (byte) 4)));
    }
}
