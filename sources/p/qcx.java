package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qcx extends hab0 implements vu30 {
    public final /* synthetic */ j2i N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ int P0;
    public final /* synthetic */ short Q0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ vu30 Z;
    public final /* synthetic */ u390 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qcx(u390 u390Var, boolean z, Function0 function0, qim0 qim0Var, long j, float f, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, vu30 vu30Var, j2i j2iVar, int i, int i2, int i3) {
        super(2);
        this.a = u390Var;
        this.b = z;
        this.c = function0;
        this.d = qim0Var;
        this.e = j;
        this.f = f;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.t = z5;
        this.X = z6;
        this.Y = z7;
        this.Z = vu30Var;
        this.N0 = j2iVar;
        this.O0 = i;
        this.P0 = i2;
        this.Q0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.O0 | 1);
        int iP2 = czo1.p(this.P0);
        short s = this.Q0;
        x74.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
