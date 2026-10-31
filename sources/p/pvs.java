package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pvs extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fws b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pvs(fws fwsVar, byte b) {
        super(2);
        this.a = b;
        this.b = fwsVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fws fwsVar = this.b;
        byte b2 = 2;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    aak0 aak0Var = (aak0) fwsVar.i.getValue();
                    if (aak0Var == null) {
                        x340Var2.i0(1175527298);
                    } else {
                        x340Var2.i0(1175527299);
                        g2p1.s(aak0Var, x340Var2, 0);
                    }
                    x340Var2.r(false);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(1939269598, new pvs(fwsVar, z ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    boolean zBooleanValue = ((Boolean) fwsVar.g.getValue()).booleanValue();
                    boolean zI = x340Var6.i(fwsVar);
                    Object objT = x340Var6.T();
                    if (zI || objT == m4cVar) {
                        obj3 = objT;
                        qvs qvsVar = new qvs(fwsVar, (byte) 0);
                        x340Var6.s0(qvsVar);
                        obj3 = qvsVar;
                    }
                    iu30 iu30Var = (iu30) obj3;
                    Object objT2 = x340Var6.T();
                    Object obj4 = objT2;
                    if (objT2 == m4cVar) {
                        mls mlsVar = mls.Y0;
                        x340Var6.s0(mlsVar);
                        obj4 = mlsVar;
                    }
                    aex.b(zBooleanValue, iu30Var, s161.a(nim0.a, (iu30) obj4), (String) null, 0, (idn0) null, (ga80) null, x340Var6, 0, 120);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(1960828425, new pvs(fwsVar, b2), x340Var8), x340Var8, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
