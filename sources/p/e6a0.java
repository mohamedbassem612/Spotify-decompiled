package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e6a0 extends a8d1 implements dv30 {
    public /* synthetic */ ap90 a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ long d;
    public /* synthetic */ long e;
    public final /* synthetic */ g6a0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6a0(g6a0 g6a0Var, lnm lnmVar) {
        super(6, lnmVar);
        this.f = g6a0Var;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        long jLongValue = ((Number) obj4).longValue();
        long jLongValue2 = ((Number) obj5).longValue();
        e6a0 e6a0Var = new e6a0(this.f, (lnm) obj6);
        e6a0Var.a = (ap90) obj;
        e6a0Var.b = zBooleanValue;
        e6a0Var.c = zBooleanValue2;
        e6a0Var.d = jLongValue;
        e6a0Var.e = jLongValue2;
        return e6a0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        d6a0 d6a0Var;
        ap90 ap90Var = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        long j = this.d;
        long j2 = this.e;
        hm5.M(obj);
        Long l = new Long(j);
        if (l.longValue() < 0) {
            l = null;
        }
        Long l2 = new Long(j2);
        if (l2.longValue() < 0) {
            l2 = null;
        }
        a6a0 a6a0Var = new a6a0(z, z2, l, l2);
        ap90Var.getClass();
        int iOrdinal = ap90Var.a.a.ordinal();
        if (iOrdinal == 0) {
            d6a0Var = new d6a0(true);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return null;
                }
                eg.o();
                return null;
            }
            d6a0Var = new d6a0(false);
        }
        return new gd80(new b6a0(d6a0Var, a6a0Var), (xpw) this.f.b.get());
    }
}
