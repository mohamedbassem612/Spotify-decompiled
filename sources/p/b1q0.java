package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b1q0 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ e0q0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ gdx g;
    public final /* synthetic */ j82 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b1q0(e0q0 e0q0Var, Function0 function0, String str, float f, boolean z, int i, gdx gdxVar, j82 j82Var, boolean z2, Function0 function1, int i2, int i3) {
        super(2);
        this.a = e0q0Var;
        this.b = function0;
        this.c = str;
        this.d = f;
        this.e = z;
        this.f = i;
        this.g = gdxVar;
        this.h = j82Var;
        this.i = z2;
        this.t = function1;
        this.X = i2;
        this.Y = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        c1q0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(this.X | 1), this.Y);
        return rih1.a;
    }
}
