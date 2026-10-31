package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hhv extends hab0 implements vu30 {
    public final /* synthetic */ j2i N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ short P0;
    public final /* synthetic */ short Q0;
    public final /* synthetic */ vu30 X;
    public final /* synthetic */ vu30 Y;
    public final /* synthetic */ idn0 Z;
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hhv(Function0 function0, qim0 qim0Var, String str, int i, int i2, long j, float f, boolean z, boolean z2, int i3, vu30 vu30Var, vu30 vu30Var2, idn0 idn0Var, j2i j2iVar, int i4, int i5, int i6) {
        super(2);
        this.a = function0;
        this.b = qim0Var;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = f;
        this.h = z;
        this.i = z2;
        this.t = i3;
        this.X = vu30Var;
        this.Y = vu30Var2;
        this.Z = idn0Var;
        this.N0 = j2iVar;
        this.O0 = i4;
        this.P0 = i5;
        this.Q0 = i6;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.O0 | 1);
        int iP2 = czo1.p(this.P0);
        short s = this.Q0;
        dem1.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
