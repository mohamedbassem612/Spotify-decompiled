package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class az0 extends a8d1 implements xu30 {
    public /* synthetic */ long a;
    public /* synthetic */ long b;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        az0 az0Var = new az0(3, (lnm) obj3);
        az0Var.a = jLongValue;
        az0Var.b = jLongValue2;
        return az0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j = this.a;
        long j2 = this.b;
        hm5.M(obj);
        return new gvf1(j, j2);
    }
}
