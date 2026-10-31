package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f7h0 extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ ven0 Y;
    public boolean a;
    public final /* synthetic */ iac0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ zh80 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7h0(iac0 iac0Var, boolean z, boolean z2, Function0 function0, boolean z3, zh80 zh80Var, boolean z4, boolean z5, Function0 function1, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = iac0Var;
        this.c = z;
        this.d = z2;
        this.e = function0;
        this.f = z3;
        this.g = zh80Var;
        this.h = z4;
        this.i = z5;
        this.t = function1;
        this.X = ven0Var;
        this.Y = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new f7h0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            x8c0 lifecycle = this.b.getLifecycle();
            e7h0 e7h0Var = new e7h0(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, null);
            this.a = true;
            Object objT = z8p1.t(lifecycle, w8c0.e, e7h0Var, this);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
