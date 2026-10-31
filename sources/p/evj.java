package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class evj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hvj b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ evj(hvj hvjVar, j2i j2iVar, Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = hvjVar;
        this.c = j2iVar;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        j2i j2iVar = this.c;
        hvj hvjVar = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    hvjVar.b.b(6, apo.r(1659904372, new vvb(j2iVar, obj3, (byte) 2), x340Var2), x340Var2);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    qsw.a(apo.r(1492156340, new evj(hvjVar, j2iVar, obj3, objArr == true ? 1 : 0), x340Var4), x340Var4);
                }
                break;
        }
        return rih1Var;
    }
}
