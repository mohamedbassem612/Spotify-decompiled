package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ocx extends hab0 implements vu30 {
    public final /* synthetic */ byte N0;
    public final /* synthetic */ short O0;
    public final /* synthetic */ vu30 X;
    public final /* synthetic */ j2i Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ scx b;
    public final /* synthetic */ mfx c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ocx(Function0 function0, scx scxVar, mfx mfxVar, boolean z, boolean z2, float f, boolean z3, Boolean bool, boolean z4, boolean z5, vu30 vu30Var, j2i j2iVar, int i, int i2, int i3) {
        super(2);
        this.a = function0;
        this.b = scxVar;
        this.c = mfxVar;
        this.d = z;
        this.e = z2;
        this.f = f;
        this.g = z3;
        this.h = bool;
        this.i = z4;
        this.t = z5;
        this.X = vu30Var;
        this.Y = j2iVar;
        this.Z = i;
        this.N0 = i2;
        this.O0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        short s = this.O0;
        x74.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
