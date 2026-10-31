package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lft0 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lft0(boolean z, boolean z2, Function0 function0, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = z;
        this.b = z2;
        this.c = function0;
        this.d = qim0Var;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        czo1.d(this.a, this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1), this.f);
        return rih1.a;
    }
}
