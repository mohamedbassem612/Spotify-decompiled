package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bxt0 implements wpw {
    public final uu00 a;
    public final int b;
    public final idd1 c;
    public final idd1 d;
    public final poy0 e;
    public final eih1 f;
    public final nsw g;

    public bxt0(FlowableMap flowableMap, uu00 uu00Var, Function0 function0, Function0 function1, boolean z, int i) {
        this.a = uu00Var;
        this.b = i;
        idd1 idd1Var = new idd1(new isr0(function0, (byte) 21));
        this.c = idd1Var;
        idd1 idd1Var2 = new idd1(new isr0(function1, (byte) 22));
        this.d = idd1Var2;
        if (!z) {
        }
        this.e = y3o1.Y(Flowable.h(flowableMap.J(a020.Y0).t(Functions.a), flowableMap.t(sa20.Y0).X(new jkp0(this, (byte) 13)).U(ktl.a), ua20.X0), new fgs0(this, (byte) 24), fnt0.X, (iu30) null, 24);
        this.f = new eih1();
        this.g = jch0.j(new x3o0(this, (byte) 29));
    }

    public final rqw a() {
        return this.f;
    }

    public final rsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
