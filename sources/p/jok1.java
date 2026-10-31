package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jok1 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ hux c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jok1(String str, long j, hux huxVar, long j2, Function0 function0, qim0 qim0Var, float f, boolean z, float f2, float f3, int i, int i2) {
        super(2);
        this.a = str;
        this.b = j;
        this.c = huxVar;
        this.d = j2;
        this.e = function0;
        this.f = qim0Var;
        this.g = f;
        this.h = z;
        this.i = f2;
        this.t = f3;
        this.X = i;
        this.Y = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.X | 1);
        short s = this.Y;
        pok1.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP, s);
        return rih1.a;
    }
}
