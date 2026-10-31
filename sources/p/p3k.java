package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p3k extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3k(vu30 vu30Var, byte b) {
        super(4);
        this.a = b;
        this.b = vu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        jfe jfeVarA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iIntValue2 = ((Number) obj4).intValue();
                b0k b0kVar = (x340) ((b0k) obj3);
                b0kVar.i0(-1791288007);
                jia jiaVar = (jia) vu30Var.invoke(b0kVar, 0);
                if (jiaVar == null) {
                    b0kVar.i0(707690080);
                    b0kVar.r(false);
                    jfeVarA = null;
                } else {
                    b0kVar.i0(854112705);
                    jfeVarA = jiaVar.a(iIntValue, iIntValue2 & 126, b0kVar, zBooleanValue);
                    b0kVar.r(false);
                }
                if (jfeVarA == null) {
                    b0kVar.i0(854114799);
                    Object objT = b0kVar.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = mno1.a(-2, 0, 6);
                        b0kVar.s0(objT);
                    }
                    jfeVarA = (jfe) objT;
                    boolean zI = b0kVar.i(jfeVarA);
                    Object objT2 = b0kVar.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new zw11((Object) jfeVarA, (byte) 16);
                        b0kVar.s0(objT2);
                    }
                    qxd0.i(rih1Var, (iu30) objT2, b0kVar);
                } else {
                    b0kVar.i0(854112102);
                }
                b0kVar.r(false);
                b0kVar.r(false);
                return jfeVarA;
            case 1:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                vu30Var.invoke((b0k) obj3, 0);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                vu30Var.invoke((b0k) obj3, 0);
                return rih1Var;
            case 3:
                ses0 ses0Var = (ses0) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                int iIntValue4 = ((Number) obj4).intValue();
                Object obj5 = ((jh5) obj).b;
                for (int i = 0; i < iIntValue4; i++) {
                    ses0Var.p(iIntValue3 + i, (jh5) vu30Var.invoke(obj5, Integer.valueOf(i)));
                }
                return rih1Var;
            default:
                int iIntValue5 = ((Number) obj3).intValue();
                return (k3r) vu30Var.invoke(((jh5) obj).b, new ms31((ses0) obj2, iIntValue5, ((Number) obj4).intValue() - iIntValue5));
        }
    }
}
