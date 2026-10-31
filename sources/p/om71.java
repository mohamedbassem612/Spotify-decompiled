package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class om71 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ idn0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public om71(String str, long j, boolean z, qim0 qim0Var, boolean z2, idn0 idn0Var, Function0 function0, int i, int i2) {
        super(2);
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = qim0Var;
        this.e = z2;
        this.f = idn0Var;
        this.g = function0;
        this.h = i;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        g2p1.x(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1), this.i);
        return rih1.a;
    }
}
