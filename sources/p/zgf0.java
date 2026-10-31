package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class zgf0 implements jly0 {
    public static yun0 a(bvn0 bvn0Var, ynb0 ynb0Var, boolean z) {
        return z ? (yun0) ynb0Var.get() : bvn0Var;
    }

    public static w7w b(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 25);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static t700 c(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 13);
    }

    public static sjf0 d(jo80 jo80Var, jo80 jo80Var2, kly0 kly0Var, r7q r7qVar, kly0 kly0Var2, caq caqVar, kly0 kly0Var3, caq caqVar2, caq caqVar3, kly0 kly0Var4, caq caqVar4, caq caqVar5, caq caqVar6, caq caqVar7, r7q r7qVar2, caq caqVar8, g5t g5tVar, r7q r7qVar3, r7q r7qVar4, kly0 kly0Var5, caq caqVar9, caq caqVar10, kly0 kly0Var6, r7q r7qVar5, kly0 kly0Var7, kly0 kly0Var8, caq caqVar11, caq caqVar12, caq caqVar13) {
        sjf0 sjf0Var = new sjf0();
        sjf0Var.a = jo80Var;
        sjf0Var.b = jo80Var2;
        sjf0Var.c = kly0Var;
        sjf0Var.d = r7qVar;
        sjf0Var.e = kly0Var2;
        sjf0Var.f = caqVar;
        sjf0Var.g = kly0Var3;
        sjf0Var.h = caqVar2;
        sjf0Var.i = caqVar3;
        sjf0Var.j = kly0Var4;
        sjf0Var.k = caqVar4;
        sjf0Var.l = caqVar5;
        sjf0Var.m = caqVar6;
        sjf0Var.n = caqVar7;
        sjf0Var.o = r7qVar2;
        sjf0Var.f75p = caqVar8;
        sjf0Var.q = g5tVar;
        sjf0Var.r = r7qVar3;
        sjf0Var.s = r7qVar4;
        sjf0Var.t = kly0Var5;
        sjf0Var.u = caqVar9;
        sjf0Var.v = caqVar10;
        sjf0Var.w = kly0Var6;
        sjf0Var.x = r7qVar5;
        sjf0Var.y = kly0Var7;
        sjf0Var.z = kly0Var8;
        sjf0Var.A = caqVar11;
        sjf0Var.B = caqVar12;
        sjf0Var.C = caqVar13;
        return sjf0Var;
    }

    public static dpf0 e(caq caqVar, caq caqVar2, kly0 kly0Var, caq caqVar3, kly0 kly0Var2, r7q r7qVar) {
        dpf0 dpf0Var = new dpf0();
        dpf0Var.a = caqVar;
        dpf0Var.b = caqVar2;
        dpf0Var.c = kly0Var;
        dpf0Var.d = caqVar3;
        dpf0Var.e = kly0Var2;
        dpf0Var.f = r7qVar;
        return dpf0Var;
    }

    public static ruf0 f(jo80 jo80Var, jo80 jo80Var2, r7q r7qVar, caq caqVar, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar2, kly0 kly0Var4, r7q r7qVar2, kly0 kly0Var5, kly0 kly0Var6, thq thqVar, g5t g5tVar, kly0 kly0Var7, caq caqVar3, kly0 kly0Var8, g5t g5tVar2, caq caqVar4, caq caqVar5, caq caqVar6, kly0 kly0Var9) {
        ruf0 ruf0Var = new ruf0();
        ruf0Var.a = jo80Var;
        ruf0Var.b = jo80Var2;
        ruf0Var.c = r7qVar;
        ruf0Var.d = caqVar;
        ruf0Var.e = kly0Var;
        ruf0Var.f = kly0Var2;
        ruf0Var.g = kly0Var3;
        ruf0Var.h = caqVar2;
        ruf0Var.i = kly0Var4;
        ruf0Var.j = r7qVar2;
        ruf0Var.k = kly0Var5;
        ruf0Var.l = kly0Var6;
        ruf0Var.m = thqVar;
        ruf0Var.n = g5tVar;
        ruf0Var.o = kly0Var7;
        ruf0Var.f70p = caqVar3;
        ruf0Var.q = kly0Var8;
        ruf0Var.r = g5tVar2;
        ruf0Var.s = caqVar4;
        ruf0Var.t = caqVar5;
        ruf0Var.u = caqVar6;
        ruf0Var.v = kly0Var9;
        return ruf0Var;
    }

    public static uuf0 g(jo80 jo80Var, jo80 jo80Var2, r7q r7qVar, caq caqVar, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, caq caqVar2, kly0 kly0Var4, r7q r7qVar2, g5t g5tVar, kly0 kly0Var5, caq caqVar3, kly0 kly0Var6, g5t g5tVar2, caq caqVar4, caq caqVar5, caq caqVar6, kly0 kly0Var7, r7q r7qVar3) {
        uuf0 uuf0Var = new uuf0();
        uuf0Var.a = jo80Var;
        uuf0Var.b = jo80Var2;
        uuf0Var.c = r7qVar;
        uuf0Var.d = caqVar;
        uuf0Var.e = kly0Var;
        uuf0Var.f = kly0Var2;
        uuf0Var.g = kly0Var3;
        uuf0Var.h = caqVar2;
        uuf0Var.i = kly0Var4;
        uuf0Var.j = r7qVar2;
        uuf0Var.k = g5tVar;
        uuf0Var.l = kly0Var5;
        uuf0Var.m = caqVar3;
        uuf0Var.n = kly0Var6;
        uuf0Var.o = g5tVar2;
        uuf0Var.f81p = caqVar4;
        uuf0Var.q = caqVar5;
        uuf0Var.r = caqVar6;
        uuf0Var.s = kly0Var7;
        uuf0Var.t = r7qVar3;
        return uuf0Var;
    }

    public static a0g0 h(jly0 jly0Var) {
        a0g0 a0g0Var = new a0g0();
        a0g0Var.a = jly0Var;
        return a0g0Var;
    }

    public static w7w i(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 26);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static t700 j(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 14);
    }

    public static w7w k(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 28);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static t700 l(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 15);
    }

    public static iac0 m(nte0 nte0Var) {
        f8l f8lVarF = nte0Var.F();
        c8o.m(f8lVarF);
        return f8lVarF;
    }

    public static ygf0 n(gc31 gc31Var) {
        return (ygf0) gc31Var.b(ygf0.class);
    }

    public static onf0 o(caq caqVar, ynb0 ynb0Var, ynb0 ynb0Var2) {
        return (onf0) (((rm4) caqVar.get()).c() ? ynb0Var2.get() : ynb0Var.get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qxb1 p(byb1 byb1Var, fyb1 fyb1Var, ztw0 ztw0Var) {
        j3r j3rVar = rzq.y;
        return new qxb1(l2p1.f(new w1k(new l2r[]{byb1Var, fyb1Var, ztw0Var})));
    }

    public static ftf0 q(gc31 gc31Var) {
        return (ftf0) gc31Var.b(ftf0.class);
    }

    public static aqs0 r(Context context, ut71 ut71Var) {
        return new aqs0(context, ut71Var);
    }

    public static yun0 s(bvn0 bvn0Var, ynb0 ynb0Var, boolean z) {
        return z ? (yun0) ynb0Var.get() : bvn0Var;
    }

    public static rsn0 t(ccs ccsVar, ynb0 ynb0Var, boolean z) {
        return z ? (rsn0) ynb0Var.get() : ccsVar;
    }

    public static ayf0 u(ozp ozpVar) {
        return new ayf0(ozpVar);
    }

    public static hds v(ynb0 ynb0Var) {
        return (hds) ynb0Var.get();
    }

    public static FlowableDistinctUntilChanged w(Flowable flowable, Scheduler scheduler, yqg yqgVar) {
        Flowable flowableX = flowable.X(new btf0(hzd1.a ? 10000L : 32L, scheduler, yqgVar, (byte) 0));
        flowableX.getClass();
        return flowableX.t(Functions.a);
    }

    public static FlowableMap x(Flowable flowable, Scheduler scheduler, yqg yqgVar) {
        return flowable.j(new xeu0(hzd1.a ? 10000L : 32L, scheduler, yqgVar)).x(dj20.Y).J(xj20.Z);
    }

    public static ucd y(gma1 gma1Var) {
        return new ucd(gma1Var.a(), (byte) 3);
    }
}
