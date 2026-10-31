package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class laf extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ yf d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ short g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public laf(String str, int i, int i2, yf yfVar, boolean z, Function0 function0, int i3) {
        super(2);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = yfVar;
        this.e = z;
        this.f = function0;
        this.g = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        iro1.a(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1));
        return rih1.a;
    }
}
