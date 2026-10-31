package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p6q0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6q0(rwj rwjVar, byte b) {
        super(4);
        this.a = b;
        this.b = rwjVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                jjm0 jjm0Var = (jjm0) obj;
                l6q0 l6q0Var = (l6q0) obj2;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-15422535);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(l6q0Var.a());
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                bb71 bb71Var = l6q0Var.b;
                int i = (iIntValue & 112) ^ 48;
                boolean z = (i > 32 && x340Var.g(l6q0Var)) || (iIntValue & 48) == 32;
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new n6q0(l6q0Var, ven0Var, null, (byte) 0);
                    x340Var.s0(objT2);
                }
                qxd0.t(bb71Var, x340Var, (vu30) objT2);
                Boolean boolValueOf = Boolean.valueOf(l6q0Var.g);
                boolean z2 = (i > 32 && x340Var.g(l6q0Var)) || (iIntValue & 48) == 32;
                Object objT3 = x340Var.T();
                if (z2 || objT3 == m4cVar) {
                    objT3 = new n6q0(l6q0Var, ven0Var, null, (byte) 1);
                    x340Var.s0(objT3);
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT3);
                ven0 ven0VarS = v8r.s(l6q0Var, x340Var);
                rwj rwjVar = this.b;
                boolean zI = x340Var.i(rwjVar) | x340Var.g(ven0VarS);
                Object objT4 = x340Var.T();
                if (zI || objT4 == m4cVar) {
                    o6q0 o6q0Var = new o6q0(rwjVar, ven0VarS, ven0Var, (lnm) null, (byte) 0);
                    x340Var.s0(o6q0Var);
                    objT4 = o6q0Var;
                }
                jjm0Var.a((zu30) objT4, x340Var, (iIntValue << 3) & 112);
                m6q0 m6q0Var = (m6q0) ven0Var.getValue();
                x340Var.r(false);
                return m6q0Var;
            default:
                l6q0 l6q0Var2 = (l6q0) obj;
                ((Number) obj3).intValue();
                opl0 opl0Var = (opl0) this.b.f;
                a6q0 a6q0Var = l6q0Var2.a;
                if (a6q0Var instanceof x5q0) {
                    return new dyl0(new eyl0(opl0Var));
                }
                return a6q0Var instanceof v5q0 ? new byl0(new eyl0(opl0Var)) : new cyl0(new eyl0(opl0Var), Integer.valueOf(l6q0Var2.c), a6q0Var.b().a.D());
        }
    }
}
