package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jl01 extends hab0 implements Function0 {
    public final /* synthetic */ ll01 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl01(ll01 ll01Var) {
        super(0);
        this.a = ll01Var;
    }

    public final Object invoke() {
        ll01 ll01Var = this.a;
        i8h1 i8h1Var = (i8h1) ll01Var.f.get();
        i4m0 i4m0Var = ll01Var.g;
        i4m0Var.getClass();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("take_screenshot", 1, b7xVar), i4m0Var.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
        return rih1.a;
    }
}
