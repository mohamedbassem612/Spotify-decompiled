package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ok6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok6(j2i j2iVar, boolean z) {
        super(2);
        this.a = (byte) 1;
        this.b = j2iVar;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                rk6.b(z, j2iVar, (b0k) obj, czo1.p(49));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j2iVar.invoke(Boolean.valueOf(z), x340Var2, 0);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                h7w.n(z, j2iVar, (b0k) obj, czo1.p(49));
                break;
            case 3:
                ((Number) obj2).intValue();
                rck.i(z, j2iVar, (b0k) obj, czo1.p(49));
                break;
            case 4:
                ((Number) obj2).intValue();
                x74.a(z, j2iVar, (b0k) obj, czo1.p(49));
                break;
            case 5:
                ((Number) obj2).intValue();
                zho1.y(z, j2iVar, (b0k) obj, czo1.p(49));
                break;
            default:
                ((Number) obj2).intValue();
                u4p1.q(z, j2iVar, (b0k) obj, czo1.p(49));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok6(byte b, int i, j2i j2iVar, boolean z) {
        super(2);
        this.a = b;
        this.c = z;
        this.b = j2iVar;
    }
}
