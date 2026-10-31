package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ixb0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kxb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ixb0(kxb0 kxb0Var, byte b) {
        super(4);
        this.a = b;
        this.b = kxb0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        kxb0 kxb0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                String strD = kaa0.d(kxb0Var.b);
                r6h1 r6h1Var = r6h1.c;
                return new opk0(strD);
            default:
                ((Number) obj3).intValue();
                String strD2 = kaa0.d(kxb0Var.b);
                r6h1 r6h1Var2 = r6h1.c;
                return new tol0(strD2);
        }
    }
}
