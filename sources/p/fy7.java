package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fy7 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ short e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fy7(String str, boolean z, boolean z2, Function0 function0, int i, int i2) {
        super(2);
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = function0;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        pto1.k(this.a, this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1), this.f);
        return rih1.a;
    }
}
