package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o93 implements shm {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public o93(oum oumVar, hum humVar, oql oqlVar) {
        this.a = (byte) 1;
        this.b = oumVar;
        this.c = humVar;
        this.d = oqlVar;
        jd0 jd0Var = jd0.j;
        this.e = w3p1.o(new l4r(jd0Var, 2, atm.Q0, new j4r(new ztm(this, (byte) 0)), atm.R0), aum.a);
        this.f = w3p1.o(new l4r(jd0Var, 1, atm.S0, new j4r(new ztm(this, (byte) 1)), atm.T0), atm.P0);
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                qxc0 qxc0Var = hti0Var.d;
                lnm lnmVar = null;
                if (qxc0Var != null) {
                    if (((me30) this.f).a(qxc0Var.e) != le30.b) {
                        qxc0Var = null;
                    }
                    if (qxc0Var != null) {
                        return new x010(yoi1.g(((xvo) obj).a(true)), ((ov20) obj2).a, new n93((Object) this, (Object) qxc0Var, (Object) hti0Var, lnmVar, (byte) 0), (byte) 1);
                    }
                }
                return new huz((Object) null, (byte) 10);
            case 1:
                String str = hti0Var.a;
                return ((oum) obj2).a().isEmpty() ? new huz((Object) null, (byte) 10) : new x010(new te1(d3p1.F(rzqVar, (o3r) obj3, str), (byte) 24), ((hum) obj).a(str), new b7c(this, hti0Var, (lnm) null, (byte) 18), (byte) 1);
            case 2:
                return new huz(g(hti0Var), (byte) 10);
            case 3:
                return !c(hti0Var) ? new huz((Object) null, (byte) 10) : new mpy0(((a4q0) obj3).b(), this, hti0Var, (byte) 16);
            default:
                return !d(hti0Var) ? new huz((Object) null, (byte) 10) : h5p1.s(yoi1.g(((b221) this.d).a(hti0Var.a)), new lt20(((a4q0) obj3).e(gtg1.c), new q8t0(3, (lnm) null, (byte) 27), (byte) 0), ((ov20) obj2).a, new kw0(this, hti0Var, (lnm) null, (byte) 18));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        m93 m93Var;
        qxc0 qxc0Var;
        boolean zBooleanValue;
        Object objI;
        hti0 hti0Var2;
        boolean z;
        bum bumVar;
        bjb1 bjb1Var;
        o93 o93Var = this;
        hti0 hti0Var3 = hti0Var;
        byte b = o93Var.a;
        Object obj = o93Var.c;
        Object obj2 = o93Var.f;
        Object obj3 = o93Var.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof m93) {
                    m93Var = (m93) lnmVar;
                    int i = m93Var.f;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        m93Var.f = i - Integer.MIN_VALUE;
                    } else {
                        m93Var = new m93(o93Var, (onm) lnmVar);
                    }
                } else {
                    m93Var = new m93(o93Var, (onm) lnmVar);
                }
                Object obj4 = m93Var.d;
                int i2 = m93Var.f;
                if (i2 == 0) {
                    hm5.M(obj4);
                    qxc0 qxc0Var2 = hti0Var3.d;
                    if (qxc0Var2 != null) {
                        if (((me30) obj2).a(qxc0Var2.e) != le30.b) {
                            qxc0Var2 = null;
                        }
                        if (qxc0Var2 != null) {
                            ezc ezcVarG = yoi1.g(((xvo) obj).a(true));
                            m93Var.a = hti0Var3;
                            m93Var.b = qxc0Var2;
                            m93Var.f = 1;
                            Object objI2 = b5p1.i(ezcVarG, m93Var);
                            if (objI2 == d9nVar) {
                                return d9nVar;
                            }
                            qxc0Var = qxc0Var2;
                            obj4 = objI2;
                            zBooleanValue = ((Boolean) obj4).booleanValue();
                            ezc ezcVar = ((ov20) obj3).a;
                            m93Var.a = hti0Var3;
                            m93Var.b = qxc0Var;
                            m93Var.c = zBooleanValue;
                            m93Var.f = 2;
                            objI = b5p1.i(ezcVar, m93Var);
                            if (objI == d9nVar) {
                                return d9nVar;
                            }
                            hti0Var2 = hti0Var3;
                            z = zBooleanValue;
                            obj4 = objI;
                        }
                    }
                    return null;
                }
                if (i2 == 1) {
                    qxc0 qxc0Var3 = m93Var.b;
                    hti0 hti0Var4 = m93Var.a;
                    hm5.M(obj4);
                    qxc0Var = qxc0Var3;
                    hti0Var3 = hti0Var4;
                    zBooleanValue = ((Boolean) obj4).booleanValue();
                    ezc ezcVar2 = ((ov20) obj3).a;
                    m93Var.a = hti0Var3;
                    m93Var.b = qxc0Var;
                    m93Var.c = zBooleanValue;
                    m93Var.f = 2;
                    objI = b5p1.i(ezcVar2, m93Var);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                    hti0Var2 = hti0Var3;
                    z = zBooleanValue;
                    obj4 = objI;
                } else {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = m93Var.c;
                    qxc0Var = m93Var.b;
                    hti0Var2 = m93Var.a;
                    hm5.M(obj4);
                }
                return o93Var.f(qxc0Var, hti0Var2.a, z, (Map) obj4);
            case 1:
                if (lnmVar instanceof bum) {
                    bumVar = (bum) lnmVar;
                    int i3 = bumVar.d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        bumVar.d = i3 - Integer.MIN_VALUE;
                    } else {
                        bumVar = new bum(o93Var, (onm) lnmVar);
                    }
                } else {
                    bumVar = new bum(o93Var, (onm) lnmVar);
                }
                Object objS = bumVar.b;
                int i4 = bumVar.d;
                if (i4 == 0) {
                    hm5.M(objS);
                    if (!((oum) obj3).a().isEmpty()) {
                        ay8 ay8VarF = d3p1.F(d0rVar, (o3r) obj2, hti0Var3.a);
                        bumVar.a = hti0Var3;
                        bumVar.d = 1;
                        objS = wgo1.s(ay8VarF, bumVar);
                        if (objS == d9nVar) {
                            return d9nVar;
                        }
                        if (((Boolean) objS).booleanValue()) {
                            mr20 mr20VarA = ((hum) obj).a(hti0Var3.a);
                            bumVar.a = hti0Var3;
                            bumVar.d = 2;
                            objS = b5p1.i(mr20VarA, bumVar);
                            if (objS == d9nVar) {
                                return d9nVar;
                            }
                            return ((oql) o93Var.d).c(hti0Var3.a, ((Boolean) objS).booleanValue());
                        }
                    }
                    return null;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hti0Var3 = bumVar.a;
                    hm5.M(objS);
                    return ((oql) o93Var.d).c(hti0Var3.a, ((Boolean) objS).booleanValue());
                }
                hti0Var3 = bumVar.a;
                hm5.M(objS);
                if (((Boolean) objS).booleanValue()) {
                    mr20 mr20VarA2 = ((hum) obj).a(hti0Var3.a);
                    bumVar.a = hti0Var3;
                    bumVar.d = 2;
                    objS = b5p1.i(mr20VarA2, bumVar);
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                    return ((oql) o93Var.d).c(hti0Var3.a, ((Boolean) objS).booleanValue());
                }
                return null;
            case 2:
                return g(hti0Var);
            case 3:
                if (lnmVar instanceof bjb1) {
                    bjb1Var = (bjb1) lnmVar;
                    int i5 = bjb1Var.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bjb1Var.e = i5 - Integer.MIN_VALUE;
                    } else {
                        bjb1Var = new bjb1(o93Var, (onm) lnmVar);
                    }
                } else {
                    bjb1Var = new bjb1(o93Var, (onm) lnmVar);
                }
                Object objD = bjb1Var.c;
                int i6 = bjb1Var.e;
                if (i6 != 0) {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hti0 hti0Var5 = bjb1Var.b;
                    o93 o93Var2 = bjb1Var.a;
                    hm5.M(objD);
                    hti0Var3 = hti0Var5;
                    o93Var = o93Var2;
                    return ((ua91) o93Var.d).x(hti0Var3.a, null, mno1.O, ((Boolean) objD).booleanValue());
                }
                hm5.M(objD);
                if (c(hti0Var)) {
                    a4q0 a4q0Var = (a4q0) o93Var.e;
                    bjb1Var.a = o93Var;
                    bjb1Var.b = hti0Var3;
                    bjb1Var.e = 1;
                    objD = a4q0Var.d(gtg1.d, bjb1Var);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                    return ((ua91) o93Var.d).x(hti0Var3.a, null, mno1.O, ((Boolean) objD).booleanValue());
                }
                return null;
            default:
                if (d(hti0Var)) {
                    return smo1.s(new zsg1(o93Var, hti0Var3, null), lnmVar);
                }
                return null;
        }
    }

    public boolean c(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null) {
            return false;
        }
        le30 le30VarA = ((me30) this.f).a(qxc0Var.e);
        if (qxc0Var.i.a()) {
            return false;
        }
        npm1 npm1Var = (npm1) this.c;
        String str = hti0Var.a;
        npm1Var.getClass();
        return (str.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") || !((bp90) ((c9c0) this.b).e.a().getValue()).f || le30VarA == le30.U0) ? false : true;
    }

    public boolean d(hti0 hti0Var) {
        qxc0 qxc0Var;
        return (((drp0) this.f).b() || !((a4q0) this.e).a.g() || (qxc0Var = hti0Var.d) == null || gyo1.H(qxc0Var.O0, dlc0.b) || Boolean.parseBoolean((String) qxc0Var.X.get("is_video_first"))) ? false : true;
    }

    public jhm e(String str, c221 c221Var, boolean z, Map map) {
        if ((!y7y0.t("offline", map) && (y7y0.G(map) || !y7y0.L(map) || y7y0.F(map))) || !c221Var.a) {
            return null;
        }
        return ((k811) this.c).b(str, z ? 2 : 0, c221Var.b);
    }

    public jhm f(qxc0 qxc0Var, String str, boolean z, Map map) {
        r2q0 r2q0Var = qxc0Var.U0;
        boolean z2 = true;
        boolean z3 = r2q0Var == r2q0.c || r2q0Var == r2q0.d;
        if (!y7y0.G(map) && !y7y0.L(map)) {
            ((rh11) this.d).getClass();
            if (!rh11.c(map) && !z3) {
                z2 = false;
            }
        }
        if (z || !z2) {
            return null;
        }
        return ((uf0) this.e).b(str);
    }

    public jhm g(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        String str = hti0Var.a;
        if (qxc0Var != null) {
            String str2 = qxc0Var.e;
            le30 le30VarA = ((me30) this.f).a(str2);
            if (!((f771) this.b).a.o(str) && le30VarA != le30.U0) {
                hd71 hd71Var = (hd71) this.c;
                x7i1 x7i1Var = qxc0Var.t;
                wls0 wls0Var = qxc0Var.i;
                hd71Var.getClass();
                if (hd71.a(x7i1Var, wls0Var, wls0.d)) {
                    xf60 xf60Var = (xf60) this.d;
                    g771 g771Var = new g771(str, qxc0Var.a);
                    Map map = qxc0Var.X;
                    fsx fsxVar = fsx.c;
                    ihm ihmVar = new ihm(chm.c, new ghm(new q961(g771Var, (byte) 21), s571.b1), new e971((byte) 1, xf60Var, g771Var, map, str2));
                    Integer num = (244 & 8) != 0 ? null : 2131954432;
                    Integer num2 = (244 & 32) != 0 ? null : 2131962696;
                    boolean z = (244 & 64) != 0;
                    if (!(num != null)) {
                        hhg1.n("Exactly one title property must be populated.");
                        return null;
                    }
                    if (fsxVar != null) {
                        return new jhm((255 & 1) != 0 ? "share" : null, (hux) fsxVar, (fhm) null, (255 & 8) != 0 ? num : 2131954060, (String) null, num2, z, (tm81) null, (255 & 256) != 0 ? ihmVar : ihm.a(ihmVar, new mvn0((byp) this.e, str, ihmVar, (byte) 3)));
                    }
                    hhg1.n("Exactly one icon property must be populated.");
                    return null;
                }
            }
        }
        return null;
    }

    public /* synthetic */ o93(ov20 ov20Var, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = ov20Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ o93(Object obj, Object obj2, Object obj3, me30 me30Var, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = me30Var;
        this.e = obj4;
    }
}
