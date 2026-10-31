package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ed50 extends hab0 implements vu30 {
    public final /* synthetic */ double a;
    public final /* synthetic */ long b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed50(double d, long j, c380 c380Var, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = d;
        this.b = j;
        this.c = c380Var;
        this.d = function0;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        qon1.e(this.a, this.b, this.c, this.d, this.e, (b0k) obj, iP);
        return rih1.a;
    }
}
