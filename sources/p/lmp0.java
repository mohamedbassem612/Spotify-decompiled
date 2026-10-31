package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lmp0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lmp0(pt ptVar, byte b) {
        super(4);
        this.a = b;
        this.b = ptVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                jjm0 jjm0Var = (jjm0) obj;
                jmp0 jmp0Var = (jmp0) obj2;
                int iIntValue = ((Number) obj4).intValue();
                bb71 bb71Var = jmp0Var.e;
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-1726891245);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(new kmp0(jmp0Var.a, jmp0Var.b, jmp0Var.c, bb71Var, jmp0Var.j));
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                boolean zG = x340Var.g(bb71Var);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new e3p0(bb71Var, ven0Var, (lnm) null, (byte) 3);
                    x340Var.s0(objT2);
                }
                qxd0.t(bb71Var, x340Var, (vu30) objT2);
                Boolean boolValueOf = Boolean.valueOf(jmp0Var.c);
                Boolean boolValueOf2 = Boolean.valueOf(jmp0Var.j);
                boolean z = (((iIntValue & 112) ^ 48) > 32 && x340Var.g(jmp0Var)) || (iIntValue & 48) == 32;
                Object objT3 = x340Var.T();
                if (z || objT3 == m4cVar) {
                    objT3 = new e3p0(jmp0Var, ven0Var, (lnm) null, (byte) 4);
                    x340Var.s0(objT3);
                }
                qxd0.s(boolValueOf, boolValueOf2, (vu30) objT3, x340Var);
                ven0 ven0VarS = v8r.s(jmp0Var, x340Var);
                boolean zG2 = x340Var.g(ven0VarS);
                pt ptVar = this.b;
                boolean zI = x340Var.i(ptVar) | zG2;
                Object objT4 = x340Var.T();
                if (zI || objT4 == m4cVar) {
                    cz40 cz40Var = new cz40(ptVar, ven0Var, ven0VarS, (lnm) null, (byte) 2);
                    x340Var.s0(cz40Var);
                    objT4 = cz40Var;
                }
                jjm0Var.a((zu30) objT4, x340Var, (iIntValue << 3) & 112);
                kmp0 kmp0Var = (kmp0) ven0Var.getValue();
                x340Var.r(false);
                return kmp0Var;
            default:
                jmp0 jmp0Var2 = (jmp0) obj;
                ((Number) obj3).intValue();
                ayl0 ayl0Var = (ayl0) this.b.d;
                ayl0Var.getClass();
                return new yxl0(new zxl0(ayl0Var), jmp0Var2.a.a, Integer.valueOf(jmp0Var2.i), jmp0Var2.e.a.a.b.a());
        }
    }
}
