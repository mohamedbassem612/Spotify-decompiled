package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e891 extends a8d1 implements bv30 {
    public /* synthetic */ long a;
    public /* synthetic */ long b;
    public /* synthetic */ String c;
    public /* synthetic */ i6h1 d;
    public final /* synthetic */ Long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e891(Long l, lnm lnmVar) {
        super(5, lnmVar);
        this.e = l;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        e891 e891Var = new e891(this.e, (lnm) obj5);
        e891Var.a = jLongValue;
        e891Var.b = jLongValue2;
        e891Var.c = (String) obj3;
        e891Var.d = (i6h1) obj4;
        return e891Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j = this.a;
        long j2 = this.b;
        String str = this.c;
        i6h1 i6h1Var = this.d;
        hm5.M(obj);
        Long l = this.e;
        long jLongValue = l.longValue() - j2;
        return jLongValue <= 0 ? new b891(str, j2, j, i6h1Var) : new c891(jLongValue, jLongValue / l.longValue(), i6h1Var);
    }
}
