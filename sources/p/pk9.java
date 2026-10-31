package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pk9 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk9(tm tmVar, byte b) {
        super(4);
        this.a = b;
        this.b = tmVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new hhl0(new g5l0((r6h1) obj4, (byte) 29), ((rm9) tmVar.e).a.h);
            default:
                hhl0 hhl0Var = (hhl0) obj;
                lk9 lk9Var = (lk9) obj4;
                if (!lk9Var.equals(kk9.a)) {
                    if (lk9Var.equals(jk9.a)) {
                        return hhl0Var.e();
                    }
                    eg.o();
                    return null;
                }
                hpc1 hpc1VarK = tmVar.k();
                String str = hpc1VarK != null ? hpc1VarK.f : null;
                if (str == null) {
                    str = "";
                }
                return hhl0Var.h(str);
        }
    }
}
