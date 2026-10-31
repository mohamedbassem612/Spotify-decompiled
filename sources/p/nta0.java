package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nta0 extends hab0 implements vu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ Function0 O0;
    public final /* synthetic */ xta0 P0;
    public final /* synthetic */ int Q0;
    public final /* synthetic */ int R0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ Function0 Y;
    public final /* synthetic */ Function0 Z;
    public final /* synthetic */ y7e1 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ lz20 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nta0(y7e1 y7e1Var, iu30 iu30Var, lz20 lz20Var, qim0 qim0Var, boolean z, int i, boolean z2, boolean z3, iu30 iu30Var2, boolean z4, boolean z5, Function0 function0, Function0 function1, boolean z6, Function0 function2, xta0 xta0Var, int i2, int i3) {
        super(2);
        this.a = y7e1Var;
        this.b = iu30Var;
        this.c = lz20Var;
        this.d = qim0Var;
        this.e = z;
        this.f = i;
        this.g = z2;
        this.h = z3;
        this.i = iu30Var2;
        this.t = z4;
        this.X = z5;
        this.Y = function0;
        this.Z = function1;
        this.N0 = z6;
        this.O0 = function2;
        this.P0 = xta0Var;
        this.Q0 = i2;
        this.R0 = i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Q0 | 1);
        int iP2 = czo1.p(this.R0);
        ltn1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}
