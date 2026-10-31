package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ll80 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ short d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ll80(Function0 function0, long j, qim0 qim0Var, int i) {
        super(2);
        this.a = function0;
        this.b = j;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        s8p1.b(this.a, this.b, this.c, (b0k) obj, czo1.p(this.d | 1));
        return rih1.a;
    }
}
