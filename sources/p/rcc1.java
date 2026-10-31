package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rcc1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ scc1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rcc1(scc1 scc1Var, byte b) {
        super(2);
        this.a = b;
        this.b = scc1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        scc1 scc1Var = this.b;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                    scc1 scc1Var2 = this.b;
                    dsq dsqVar = scc1Var2.d;
                    boolean zI = x340Var2.i(scc1Var2);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        k7b1 k7b1Var = new k7b1(1, scc1Var2, scc1.class, "sendEvent", "sendEvent(Lcom/spotify/search/stploadingpage/mobius/domain/StpLoadingPageEvent;)V", 0, (byte) 6);
                        x340Var2.s0(k7b1Var);
                        objT = k7b1Var;
                    }
                    dsqVar.getClass();
                    ejo1.k(new ufd((iu30) objT, new urk0((byte) 4)), scc1Var2.e, qim0VarD, x340Var2, 384, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(-841466807, new rcc1(scc1Var, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 3072, 7);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    qsw.c(new obk1(scc1Var.f), apo.r(-1620248266, new rcc1(scc1Var, b2), x340Var6), x340Var6, 48);
                }
                break;
        }
        return rih1Var;
    }
}
