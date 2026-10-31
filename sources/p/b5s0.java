package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b5s0 {
    public final pn0 a;
    public final Flowable b;

    public b5s0(pn0 pn0Var, Flowable flowable) {
        this.a = pn0Var;
        this.b = flowable;
    }

    public static ArrayList a(fn0 fn0Var) {
        List<en0> list = fn0Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (en0 en0Var : list) {
            arrayList.add(new oi0(en0Var.a, en0Var.b, en0Var.c, en0Var.g.a));
        }
        return arrayList;
    }

    public final lt20 b(String str, boolean z) {
        Flowable flowableU = this.b.x(new njp1(str, (byte) 12)).J(yz10.U0).U(j5.a);
        flowableU.getClass();
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableU.t(Functions.a);
        vbm[] vbmVarArr = q601.a;
        return x4p1.h(new qsc0(x4p1.r(z4p1.J(f5p1.q(z4p1.J(o4p1.l(rqt0.u(hu20.e(new k6e0(new dy20(new kge(flowableDistinctUntilChangedT), (byte) 16), (byte) 19), new h64((lnm) null, this, str, z, (byte) 3)))), new x4s0((byte) 1)), new zio0((byte) 7)), new x4s0((byte) 2)), new a5s0()), this, str, (byte) 20), new rd0(str, (lnm) null, (byte) 2));
    }
}
