package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wpx0 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ hux a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ max i;
    public final /* synthetic */ vu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wpx0(hux huxVar, String str, String str2, Function0 function0, qim0 qim0Var, long j, boolean z, boolean z2, max maxVar, vu30 vu30Var, int i, int i2) {
        super(2);
        this.a = huxVar;
        this.b = str;
        this.c = str2;
        this.d = function0;
        this.e = qim0Var;
        this.f = j;
        this.g = z;
        this.h = z2;
        this.i = maxVar;
        this.t = vu30Var;
        this.X = i;
        this.Y = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.X | 1);
        short s = this.Y;
        hqn1.h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP, s);
        return rih1.a;
    }
}
