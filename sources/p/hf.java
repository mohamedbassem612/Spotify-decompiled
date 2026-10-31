package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hf extends hab0 implements vu30 {
    public final /* synthetic */ hux a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hf(hux huxVar, int i, Function0 function0, qim0 qim0Var, boolean z, float f, int i2, int i3) {
        super(2);
        this.a = huxVar;
        this.b = i;
        this.c = function0;
        this.d = qim0Var;
        this.e = z;
        this.f = f;
        this.g = i2;
        this.h = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        guo1.a(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1), this.h);
        return rih1.a;
    }
}
