package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fh6 extends hab0 implements Function0 {
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ drr0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ xd6 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ hdn0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ drr0 i;
    public final /* synthetic */ drr0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh6(ven0 ven0Var, drr0 drr0Var, Function0 function0, xd6 xd6Var, boolean z, Function0 function1, hdn0 hdn0Var, ven0 ven0Var2, drr0 drr0Var2, drr0 drr0Var3) {
        super(0);
        this.a = ven0Var;
        this.b = drr0Var;
        this.c = function0;
        this.d = xd6Var;
        this.e = z;
        this.f = function1;
        this.g = hdn0Var;
        this.h = ven0Var2;
        this.i = drr0Var2;
        this.t = drr0Var3;
    }

    public final Object invoke() {
        ven0 ven0Var = this.a;
        x9b1 x9b1Var = (x9b1) ven0Var.getValue();
        if (x9b1Var != null) {
            if (x9b1Var.e) {
                gh6.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, false);
            }
            this.t.t(0.0f);
            ven0Var.setValue((Object) null);
        }
        return rih1.a;
    }
}
