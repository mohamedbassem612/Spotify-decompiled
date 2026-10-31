package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pq01 extends hab0 implements bv30 {
    public final /* synthetic */ zhc0 a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq01(zhc0 zhc0Var, boolean z) {
        super(5);
        this.a = zhc0Var;
        this.b = z;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        zhc0 zhc0Var = this.a;
        gxo1.f((aob1) obj2, (xpw) zhc0Var.c, (kly0) zhc0Var.b, this.b, (b0k) obj4, 8 | ((iIntValue >> 3) & 14));
        return rih1.a;
    }
}
