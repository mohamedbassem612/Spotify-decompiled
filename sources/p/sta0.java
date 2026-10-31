package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sta0 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ Function0 P0;
    public final /* synthetic */ xta0 Q0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Function0 Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ lz20 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sta0(String str, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, qim0 qim0Var, lz20 lz20Var, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, Function0 function0, Function0 function1, boolean z6, Function0 function2, xta0 xta0Var, int i2) {
        super(2);
        this.a = str;
        this.b = iu30Var;
        this.c = iu30Var2;
        this.d = iu30Var3;
        this.e = qim0Var;
        this.f = lz20Var;
        this.g = z;
        this.h = i;
        this.i = z2;
        this.t = z3;
        this.X = z4;
        this.Y = z5;
        this.Z = function0;
        this.N0 = function1;
        this.O0 = z6;
        this.P0 = function2;
        this.Q0 = xta0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ltn1.m(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, (b0k) obj, iP);
        return rih1.a;
    }
}
