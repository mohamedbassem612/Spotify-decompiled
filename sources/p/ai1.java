package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ai1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bi1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai1(bi1 bi1Var, byte b) {
        super(2);
        this.a = b;
        this.b = bi1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bi1 bi1Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    q7r0 q7r0VarG = ((cir0) x340Var2.k(k2r0.a)).g();
                    d0r d0rVarC = cwl1.C(q7r0VarG);
                    boolean zG = x340Var2.g(d0rVarC) | x340Var2.g(q7r0VarG);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        p2o0 p2o0Var = (p2o0) bi1Var.c.a.c;
                        axo axoVar = (axo) ((jly0) p2o0Var.b).get();
                        bxo bxoVar = (bxo) ((jly0) p2o0Var.c).get();
                        cxo cxoVar = (cxo) ((jly0) p2o0Var.d).get();
                        ei1 ei1Var = new ei1(axoVar, bxoVar, cxoVar, d0rVarC, q7r0VarG);
                        x340Var2.s0(ei1Var);
                        objT = ei1Var;
                    }
                    ei1 ei1Var2 = (ei1) objT;
                    fi1 fi1Var = bi1Var.b;
                    los losVar = bi1Var.d;
                    boolean zI = x340Var2.i(q7r0VarG);
                    Object objT2 = x340Var2.T();
                    Object obj3 = objT2;
                    if (zI || objT2 == m4cVar) {
                        j2 j2Var = new j2(q7r0VarG, (byte) 29);
                        x340Var2.s0(j2Var);
                        obj3 = j2Var;
                    }
                    d7p1.a(ei1Var2, fi1Var, losVar, (iu30) obj3, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(426349404, new ai1(bi1Var, z ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
