package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class at91 implements vu30 {
    public final /* synthetic */ vu30 a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public at91(vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, lee1 lee1Var, long j, long j2) {
        this.a = vu30Var;
        this.b = j2iVar;
        this.c = vu30Var2;
        this.d = lee1Var;
        this.e = j;
        this.f = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            x340Var2.i0(-168976609);
            brl.e(this.b, this.a, this.c, this.d, this.e, this.f, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
