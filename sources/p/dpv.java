package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dpv extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ max d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ short f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dpv(String str, Function0 function0, long j, max maxVar, qim0 qim0Var, int i) {
        super(2);
        this.a = str;
        this.b = function0;
        this.c = j;
        this.d = maxVar;
        this.e = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bqn1.e(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1));
        return rih1.a;
    }
}
