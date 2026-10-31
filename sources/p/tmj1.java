package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tmj1 implements shm {
    public final z6k0 a;
    public final ov20 b;
    public final dlg1 c;
    public final j9q d;
    public final boolean e;

    public tmj1(z6k0 z6k0Var, ov20 ov20Var, cua cuaVar, dlg1 dlg1Var, j9q j9qVar, boolean z) {
        this.a = z6k0Var;
        this.b = ov20Var;
        this.c = dlg1Var;
        this.d = j9qVar;
        this.e = z;
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null) {
            return new huz((Object) null, (byte) 10);
        }
        String str = hti0Var.a;
        ptf1 ptf1VarA = this.d.a(rzqVar);
        return hu20.e(this.b.a, new o8c1((lnm) null, this, qxc0Var, new cly0(d3p1.F(rzqVar, x2p1.t(str), rih1.a), (byte) 21), ptf1VarA, str, rzqVar));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        pmj1 pmj1Var;
        qxc0 qxc0Var;
        Object objI;
        String str;
        ptf1 ptf1Var;
        d0r d0rVar2;
        if (lnmVar instanceof pmj1) {
            pmj1Var = (pmj1) lnmVar;
            int i = pmj1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                pmj1Var.g = i - Integer.MIN_VALUE;
            } else {
                pmj1Var = new pmj1(this, (onm) lnmVar);
            }
        } else {
            pmj1Var = new pmj1(this, (onm) lnmVar);
        }
        pmj1 pmj1Var2 = pmj1Var;
        Object obj = pmj1Var2.e;
        int i2 = pmj1Var2.g;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            qxc0Var = hti0Var.d;
            if (qxc0Var != null) {
                String str2 = hti0Var.a;
                ptf1 ptf1VarA = this.d.a(d0rVar);
                ezc ezcVar = this.b.a;
                pmj1Var2.a = d0rVar;
                pmj1Var2.b = qxc0Var;
                pmj1Var2.c = str2;
                pmj1Var2.d = ptf1VarA;
                pmj1Var2.g = 1;
                objI = b5p1.i(ezcVar, pmj1Var2);
                if (objI != d9nVar) {
                    str = str2;
                    ptf1Var = ptf1VarA;
                    d0rVar2 = d0rVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ptf1Var = pmj1Var2.d;
        str = pmj1Var2.c;
        qxc0Var = pmj1Var2.b;
        d0r d0rVar3 = pmj1Var2.a;
        hm5.M(obj);
        objI = obj;
        d0rVar2 = d0rVar3;
        Map map = (Map) objI;
        boolean z = cua.f(map) && qxc0Var.X0;
        boolean zE = e(map, qxc0Var);
        if (z || zE) {
            qmj1 qmj1Var = new qmj1(this, str, d0rVar2, qxc0Var, ptf1Var, z, null);
            pmj1Var2.a = null;
            pmj1Var2.b = null;
            pmj1Var2.c = null;
            pmj1Var2.d = null;
            pmj1Var2.g = 2;
            Object objS = smo1.s(qmj1Var, pmj1Var2);
            return objS == d9nVar ? d9nVar : objS;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    public final jhm c(String str, d0r d0rVar, Map map, ptf1 ptf1Var, boolean z, boolean z2, tm81 tm81Var) {
        int i;
        int i2;
        hhm hhmVar;
        this.a.getClass();
        boolean zA = z6k0.a(map);
        int i3 = 1;
        if (tm81Var.d == 1) {
            i3 = 5;
        } else {
            if (!z2) {
                if (!zA) {
                    if (z) {
                        i3 = 3;
                    } else {
                        i = 2;
                    }
                }
                xtx xtxVar = xtx.c;
                if (z2) {
                    i2 = 2131960091;
                } else {
                    i2 = 2131960092;
                }
                ygm ygmVar = new ygm(2);
                if (z2) {
                    hhmVar = hhm.b;
                } else {
                    hhmVar = hhm.a;
                }
                return new jhm("list_video_first", (hux) xtxVar, (fhm) null, Integer.valueOf(i2), (String) null, false, tm81Var, new ihm(ygmVar, hhmVar, new ghm(jmj1.d, new sl11(i, (byte) 19)), new qf8(i, (Object) ptf1Var, (Object) this.c, (Object) d0rVar, (Object) str, (byte) 7)), 116);
            }
            i3 = 4;
        }
        i = i3;
        xtx xtxVar2 = xtx.c;
        if (z2) {
            i2 = 2131960091;
        } else {
            i2 = 2131960092;
        }
        ygm ygmVar2 = new ygm(2);
        if (z2) {
            hhmVar = hhm.b;
        } else {
            hhmVar = hhm.a;
        }
        return new jhm("list_video_first", (hux) xtxVar2, (fhm) null, Integer.valueOf(i2), (String) null, false, tm81Var, new ihm(ygmVar2, hhmVar, new ghm(jmj1.d, new sl11(i, (byte) 19)), new qf8(i, (Object) ptf1Var, (Object) this.c, (Object) d0rVar, (Object) str, (byte) 7)), 116);
    }

    public final tm81 d(boolean z) {
        int i;
        boolean z2 = this.e;
        if (z2 && z) {
            i = 3;
        } else {
            i = (!z2 || z) ? 0 : 1;
        }
        return new tm81(i, 6, "video_first", (iu30) null, false);
    }

    public final boolean e(Map map, qxc0 qxc0Var) {
        return this.e && y7y0.z(map) && !y7y0.G(map) && qxc0Var.X0;
    }
}
