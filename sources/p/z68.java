package p;

import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z68 implements slq0 {
    public final /* synthetic */ byte a = 0;
    public final xe01 b;
    public final Object c;
    public final Object d;

    public z68(iac0 iac0Var, Set set, elo eloVar) {
        this.c = set;
        this.d = eloVar;
        iib iibVar = new iib(eloVar.b, this, (byte) 3);
        u9c0 u9c0VarQ = cto1.q(iac0Var);
        Set set2 = set;
        int iS = zno1.s(q7h.U(set2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj : set2) {
            linkedHashMap.put(obj, plq0.a);
        }
        this.b = d5p1.t(iibVar, u9c0VarQ, ey71.a, new rlq0(linkedHashMap));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p.slq0
    public final Object a(String str, mlq0 mlq0Var, r6h1 r6h1Var, lnm lnmVar) {
        y68 y68Var;
        yio yioVar;
        byte b = this.a;
        rih1 rih1Var = d9n.a;
        boolean z = true;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (lnmVar instanceof y68) {
                    y68Var = (y68) lnmVar;
                    int i = y68Var.d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        y68Var.d = i - Integer.MIN_VALUE;
                    } else {
                        y68Var = new y68(this, (onm) lnmVar);
                    }
                } else {
                    y68Var = new y68(this, (onm) lnmVar);
                }
                Object objK = y68Var.b;
                int i2 = y68Var.d;
                if (i2 == 0) {
                    hm5.M(objK);
                    xe01 xe01VarD = ((k740) obj).d(str);
                    y68Var.a = str;
                    y68Var.d = 1;
                    objK = b5p1.k(xe01VarD, y68Var);
                    if (objK == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = y68Var.a;
                    hm5.M(objK);
                }
                if (objK instanceof p440) {
                    ((i1r0) this.c).a(str);
                }
                return Boolean.FALSE;
            default:
                elo eloVar = (elo) obj;
                if (lnmVar instanceof yio) {
                    yioVar = (yio) lnmVar;
                    int i3 = yioVar.d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        yioVar.d = i3 - Integer.MIN_VALUE;
                    } else {
                        yioVar = new yio(this, (onm) lnmVar);
                    }
                } else {
                    yioVar = new yio(this, (onm) lnmVar);
                }
                Object objJ = yioVar.b;
                int i4 = yioVar.d;
                if (i4 == 0) {
                    hm5.M(objJ);
                    int iOrdinal = mlq0Var.ordinal();
                    if (iOrdinal == 0) {
                        yioVar.a = str;
                        yioVar.d = 1;
                        eloVar.b(str, (tv80) null, yioVar);
                        if (rih1.a == rih1Var) {
                            return rih1Var;
                        }
                        zob1 zob1Var = eloVar.b;
                        ytw0 ytw0Var = jfv.b;
                        lt20 lt20Var = new lt20(new h6a(r4p1.w(zob1Var, fdg1.k0(30, ngv.e)), (byte) 5), new bz0(3, (lnm) null, (byte) 6), (byte) 0);
                        lm9 lm9Var = new lm9((lnm) null, str, (byte) 3);
                        yioVar.a = str;
                        yioVar.d = 2;
                        objJ = b5p1.j(lt20Var, lm9Var, yioVar);
                        if (objJ == rih1Var) {
                            return rih1Var;
                        }
                    } else if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    return Boolean.valueOf(z);
                }
                if (i4 == 1) {
                    str = yioVar.a;
                    hm5.M(objJ);
                    zob1 zob1Var2 = eloVar.b;
                    ytw0 ytw0Var2 = jfv.b;
                    lt20 lt20Var2 = new lt20(new h6a(r4p1.w(zob1Var2, fdg1.k0(30, ngv.e)), (byte) 5), new bz0(3, (lnm) null, (byte) 6), (byte) 0);
                    lm9 lm9Var2 = new lm9((lnm) null, str, (byte) 3);
                    yioVar.a = str;
                    yioVar.d = 2;
                    objJ = b5p1.j(lt20Var2, lm9Var2, yioVar);
                    if (objJ == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    if (i4 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = yioVar.a;
                    hm5.M(objJ);
                }
                Object objValueOf = ((e331) objJ).a;
                if (!(objValueOf instanceof m231)) {
                    objValueOf = Boolean.valueOf(((ijo) objValueOf).a.contains(str));
                }
                z = true ^ (objValueOf instanceof m231);
                return Boolean.valueOf(z);
        }
    }

    @Override // p.slq0
    public final zob1 getStatus() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public z68(i1r0 i1r0Var, mr20 mr20Var, k740 k740Var, llm llmVar) {
        this.c = i1r0Var;
        this.d = k740Var;
        this.b = d5p1.t(hu20.e(mr20Var, new qt((lnm) null, this, (byte) 17)), llmVar, ey71.a, new rlq0(b7x.a));
    }
}
