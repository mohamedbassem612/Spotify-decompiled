package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eh6 extends hab0 implements Function0 {
    public final /* synthetic */ drr0 X;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ dw91 b;
    public final /* synthetic */ xu30 c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ drr0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ xd6 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh6(boolean z, dw91 dw91Var, xu30 xu30Var, hdn0 hdn0Var, drr0 drr0Var, Function0 function0, xd6 xd6Var, boolean z2, Function0 function1, ven0 ven0Var, drr0 drr0Var2) {
        super(0);
        this.a = z;
        this.b = dw91Var;
        this.c = xu30Var;
        this.d = hdn0Var;
        this.e = drr0Var;
        this.f = function0;
        this.g = xd6Var;
        this.h = z2;
        this.i = function1;
        this.t = ven0Var;
        this.X = drr0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    public final Object invoke() {
        boolean zA;
        if (this.a) {
            err0 err0Var = this.d;
            err0 err0Var2 = err0Var;
            if (err0Var2.s() <= 0) {
                zA = false;
            } else {
                this.c.invoke(Integer.valueOf(err0Var2.s()), u890.j(this.b.get(Integer.valueOf(err0Var2.s())), Boolean.TRUE) ? tf6.b : tf6.a, vf6.a);
                zA = gh6.a(this.e, this.f, this.g, this.h, this.i, err0Var, this.t, this.X, true);
            }
        } else {
            zA = false;
        }
        return Boolean.valueOf(zA);
    }
}
