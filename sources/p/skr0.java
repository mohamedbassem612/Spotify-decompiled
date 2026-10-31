package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class skr0 extends a8d1 implements xu30 {
    public /* synthetic */ long a;
    public /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skr0(long j, lnm lnmVar) {
        super(3, lnmVar);
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        skr0 skr0Var = new skr0(this.c, (lnm) obj3);
        skr0Var.a = jLongValue;
        skr0Var.b = jLongValue2;
        return skr0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j = this.a;
        long j2 = this.b;
        hm5.M(obj);
        long j3 = this.c;
        return Boolean.valueOf(j == j3 || j2 == j3);
    }
}
