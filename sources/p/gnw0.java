package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gnw0 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ max b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ short d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gnw0(int i, max maxVar, Function0 function0, int i2, int i3) {
        super(2);
        this.a = i;
        this.b = maxVar;
        this.c = function0;
        this.d = i2;
        this.e = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        t890.c(this.a, this.b, this.c, (b0k) obj, czo1.p(this.d | 1), this.e);
        return rih1.a;
    }
}
