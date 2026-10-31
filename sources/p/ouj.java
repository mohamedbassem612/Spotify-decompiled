package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ouj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pbq b;
    public final /* synthetic */ tuj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouj(tuj tujVar, pbq pbqVar) {
        super(2);
        this.a = (byte) 2;
        this.c = tujVar;
        this.b = pbqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pbq pbqVar = this.b;
        tuj tujVar = this.c;
        byte b2 = 1;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    pbqVar.h(6, apo.r(984937754, new nuj(tujVar, (byte) 0), x340Var2), x340Var2);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (pbqVar == null) {
                    x340Var4.i0(-1736864410);
                    j82.p(0.0f, (xtb0) null, (c380) null, (vzq0) null, (vu30) null, tujVar.n, x340Var4, 0, 31);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-1737502390);
                    nyx.a(2, (wux) null, apo.r(1036191510, new ouj(pbqVar, tujVar, objArr == true ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                    x340Var4.r(false);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    mod.b(oi7.a.a(tujVar.b), apo.r(1385703336, new ouj(pbqVar, tujVar, b2), x340Var6), x340Var6, 56);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ouj(pbq pbqVar, tuj tujVar, byte b) {
        super(2);
        this.a = b;
        this.b = pbqVar;
        this.c = tujVar;
    }
}
