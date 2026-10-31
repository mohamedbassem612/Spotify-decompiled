package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class km60 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km60(byte b, float f, Object obj, boolean z) {
        super(3);
        this.a = b;
        this.b = z;
        this.d = obj;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Object obj4 = this.d;
        boolean z = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                tob1 tob1Var = (tob1) obj4;
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-387255199);
                qim0 qim0VarS = nim0.a;
                if (z) {
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = c97.b(0.0f);
                        x340Var.s0(objT);
                    }
                    o95 o95Var = (o95) objT;
                    boolean zI = x340Var.i(o95Var);
                    Object objT2 = x340Var.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new b(o95Var, (lnm) null, (byte) 11);
                        x340Var.s0(objT2);
                    }
                    qxd0.t(rih1.a, x340Var, (vu30) objT2);
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = new jz71();
                        x340Var.s0(objT3);
                    }
                    jz71 jz71Var = (jz71) objT3;
                    boolean zI2 = x340Var.i(o95Var) | x340Var.i(tob1Var) | x340Var.i(jz71Var);
                    float f = this.c;
                    boolean zD = x340Var.d(f) | zI2;
                    Object objT4 = x340Var.T();
                    if (zD || objT4 == m4cVar) {
                        yv40 yv40Var = new yv40(o95Var, tob1Var, jz71Var, f, (byte) 1);
                        x340Var.s0(yv40Var);
                        objT4 = yv40Var;
                    }
                    qim0VarS = exd0.s(qim0VarS, (iu30) objT4);
                }
                x340Var.r(false);
                return qim0VarS;
            default:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-1355619305);
                ven0 ven0VarS = v8r.s(Boolean.valueOf(z), x340Var2);
                ven0 ven0VarS2 = v8r.s((iu30) obj4, x340Var2);
                Object objT5 = x340Var2.T();
                m4c m4cVar2 = fkj0.X;
                float f2 = this.c;
                if (objT5 == m4cVar2) {
                    objT5 = us71.i(jch0.U(f2 * 100.0f), x340Var2);
                }
                drr0 drr0Var = (drr0) objT5;
                Float fValueOf = Float.valueOf(f2);
                boolean zD2 = x340Var2.d(f2);
                Object objT6 = x340Var2.T();
                if (zD2 || objT6 == m4cVar2) {
                    objT6 = new n2t0(f2, drr0Var, (lnm) null);
                    x340Var2.s0(objT6);
                }
                qxd0.t(fValueOf, x340Var2, (vu30) objT6);
                boolean zG = x340Var2.g(ven0VarS) | x340Var2.g(ven0VarS2);
                Object objT7 = x340Var2.T();
                if (zG || objT7 == m4cVar2) {
                    objT7 = new xs3(ven0VarS, ven0VarS2, (byte) 20);
                    x340Var2.s0(objT7);
                }
                qim0 qim0VarK = t3k1.K(s161.b(qim0Var, false, (iu30) objT7), drr0Var.s(), new jsg(0.0f, 100.0f), 4);
                x340Var2.r(false);
                return qim0VarK;
        }
    }
}
