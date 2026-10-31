package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d9r0 extends a8d1 implements zu30 {
    public /* synthetic */ int a;
    public /* synthetic */ long b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ n9r0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9r0(int i, lnm lnmVar, n9r0 n9r0Var) {
        super(4, lnmVar);
        this.d = i;
        this.e = n9r0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        d9r0 d9r0Var = new d9r0(this.d, (lnm) obj4, this.e);
        d9r0Var.a = iIntValue;
        d9r0Var.b = jLongValue;
        d9r0Var.c = zBooleanValue;
        return d9r0Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        long j = this.b;
        boolean z = this.c;
        hm5.M(obj);
        int i2 = this.d;
        boolean z2 = true;
        if (i != -1 && j != -1) {
            boolean z3 = this.e.d.b() - j >= 2592000000L;
            if (i2 <= i || !z3) {
                z2 = false;
            }
        } else if (i2 <= 0 && z) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
