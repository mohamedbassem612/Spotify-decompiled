package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ghg implements xu30 {
    public final /* synthetic */ ga80 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ pm31 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;

    public ghg(ga80 ga80Var, boolean z, String str, pm31 pm31Var, Function0 function0, String str2, Function0 function1, Function0 function2) {
        this.a = ga80Var;
        this.b = z;
        this.c = str;
        this.d = pm31Var;
        this.e = function0;
        this.f = str2;
        this.g = function1;
        this.h = function2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        x340Var.i0(-1525724089);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = ktd.n(x340Var);
        }
        idn0 idn0Var = (idn0) objT;
        qim0 qim0VarThen = da80.a(nim0.a, idn0Var, this.a).then(new ech(this.c, this.f, this.e, this.g, this.h, (ga80) null, idn0Var, this.d, false, this.b));
        x340Var.r(false);
        return qim0VarThen;
    }
}
