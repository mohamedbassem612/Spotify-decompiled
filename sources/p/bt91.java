package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bt91 implements vu30 {
    public final /* synthetic */ vu30 a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public bt91(vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, long j, long j2) {
        this.a = vu30Var;
        this.b = j2iVar;
        this.c = vu30Var2;
        this.d = j;
        this.e = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            mod.b(q9e1.a.a(o2h1.a(x340Var2, 2)), apo.r(969655473, new at91(this.a, this.b, this.c, o2h1.a(x340Var2, 10), this.d, this.e), x340Var2), x340Var2, 56);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
