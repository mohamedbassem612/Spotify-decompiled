package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j87 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j87(String str, qim0 qim0Var, boolean z, Function0 function0, int i, int i2) {
        super(2);
        this.a = str;
        this.b = function0;
        this.c = qim0Var;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wpo1.a(czo1.p(this.e | 1), this.f, this.a, this.b, (b0k) obj, this.c, this.d);
        return rih1.a;
    }
}
