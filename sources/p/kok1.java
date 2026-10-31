package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kok1 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kok1(Function0 function0, float f, qim0 qim0Var, float f2, boolean z, int i, int i2) {
        super(2);
        this.a = function0;
        this.b = f;
        this.c = qim0Var;
        this.d = f2;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        pok1.i(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1), this.g);
        return rih1.a;
    }
}
