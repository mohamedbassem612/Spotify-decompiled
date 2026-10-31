package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a6j1 extends hab0 implements dv30 {
    public final /* synthetic */ ymg1 a;
    public final /* synthetic */ lo60 b;
    public final /* synthetic */ vgm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6j1(ymg1 ymg1Var, lo60 lo60Var, vgm vgmVar) {
        super(6);
        this.a = ymg1Var;
        this.b = lo60Var;
        this.c = vgmVar;
    }

    @Override // p.dv30
    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        n6j1 n6j1Var = (n6j1) obj2;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj5;
        ymg1 ymg1Var = this.a;
        boolean zG = x340Var.g(ymg1Var) | x340Var.i(n6j1Var) | ((((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            vxg1 vxg1Var = new vxg1(ymg1Var, n6j1Var, iu30Var, (lnm) null, (byte) 13);
            x340Var.s0(vxg1Var);
            objT = vxg1Var;
        }
        qxd0.t(n6j1Var, x340Var, (vu30) objT);
        lo60 lo60Var = this.b;
        boolean zI = x340Var.i(lo60Var);
        vgm vgmVar = this.c;
        boolean zI2 = zI | x340Var.i(vgmVar);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new sv8(lo60Var, vgmVar, (lnm) null, (byte) 11);
            x340Var.s0(objT2);
        }
        jjm0Var.a((zu30) objT2, x340Var, (iIntValue << 3) & 112);
        return rih1.a;
    }
}
