package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e7h0 extends a8d1 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zh80 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7h0(boolean z, boolean z2, Function0 function0, boolean z3, zh80 zh80Var, boolean z4, boolean z5, Function0 function1, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = z;
        this.b = z2;
        this.c = function0;
        this.d = z3;
        this.e = zh80Var;
        this.f = z4;
        this.g = z5;
        this.h = function1;
        this.i = ven0Var;
        this.t = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new e7h0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        e7h0 e7h0VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        e7h0VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        boolean z = this.a;
        Function0 function0 = this.c;
        if (!z || ((Boolean) this.i.getValue()).booleanValue() || this.b) {
            function0.invoke();
        } else {
            if (!this.d && this.e == zh80.a && this.f && !this.g) {
                this.h.invoke();
                function0.invoke();
            }
        }
        return rih1.a;
    }
}
