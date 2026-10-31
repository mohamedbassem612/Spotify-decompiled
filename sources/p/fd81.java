package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fd81 extends hab0 implements dv30 {
    public final /* synthetic */ hd81 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd81(hd81 hd81Var) {
        super(6);
        this.a = hd81Var;
    }

    @Override // p.dv30
    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        id81 id81Var = (id81) obj2;
        he81 he81Var = (he81) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj5;
        hd81 hd81Var = this.a;
        boolean zI = x340Var.i(hd81Var) | x340Var.i(id81Var) | ((((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048);
        Object objT = x340Var.T();
        lnm lnmVar = null;
        if (zI || objT == m4cVar) {
            zfe zfeVar = new zfe(hd81Var, id81Var, iu30Var, lnmVar, (byte) 11);
            x340Var.s0(zfeVar);
            objT = zfeVar;
        }
        qxd0.t(id81Var, x340Var, (vu30) objT);
        ggl gglVar = hd81Var.P0;
        String str = he81Var.d;
        String str2 = id81Var.b;
        boolean zI2 = x340Var.i(hd81Var) | x340Var.i(he81Var) | x340Var.i(id81Var);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            uk71 uk71Var = new uk71(hd81Var, he81Var, id81Var, (lnm) null, (byte) 9);
            x340Var.s0(uk71Var);
            objT2 = uk71Var;
        }
        qxd0.r(gglVar, str, str2, (vu30) objT2, x340Var);
        boolean zI3 = x340Var.i(hd81Var);
        Object objT3 = x340Var.T();
        if (zI3 || objT3 == m4cVar) {
            objT3 = new w63(hd81Var, (lnm) null, (byte) 21);
            x340Var.s0(objT3);
        }
        jjm0Var.a((zu30) objT3, x340Var, (iIntValue << 3) & 112);
        return rih1.a;
    }
}
