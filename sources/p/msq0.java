package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class msq0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ osq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ msq0(osq0 osq0Var, byte b) {
        super(4);
        this.a = b;
        this.b = osq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x031f  */
    /* JADX WARN: Code duplicated, block: B:182:0x040f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object rwm0Var;
        haw0 haw0Var;
        lnm lnmVar;
        ven0 ven0Var;
        Object sv8Var;
        lnm lnmVar2;
        gi41 gi41Var;
        wsq0 usq0Var;
        ii41 ii41Var;
        v3d v3dVar;
        lae1 lae1Var;
        pdg1 pdg1Var;
        long j;
        tg41 sg41Var;
        switch (this.a) {
            case 0:
                jjm0 jjm0Var = (jjm0) obj;
                int iIntValue = ((Number) obj4).intValue();
                gi41 gi41Var2 = gi41.b;
                Object obj5 = fkj0.X;
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-316321155);
                osq0 osq0Var = this.b;
                boolean zI = x340Var.i(osq0Var);
                Object objT = x340Var.T();
                if (zI || objT == obj5) {
                    objT = new i2p0(osq0Var, (lnm) null, (byte) 9);
                    x340Var.s0(objT);
                }
                rih1 rih1Var = rih1.a;
                qxd0.t(rih1Var, x340Var, (vu30) objT);
                Object objT2 = x340Var.T();
                if (objT2 == obj5) {
                    objT2 = v8r.q(Boolean.TRUE);
                    x340Var.s0(objT2);
                }
                ven0 ven0Var2 = (ven0) objT2;
                Object objT3 = x340Var.T();
                if (objT3 == obj5) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT3);
                }
                ven0 ven0Var3 = (ven0) objT3;
                boolean zI2 = x340Var.i(osq0Var) | x340Var.i(ven0Var2) | x340Var.i(ven0Var3);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == obj5) {
                    wkk0 wkk0Var = new wkk0(osq0Var, ven0Var2, ven0Var3, (lnm) null, (byte) 29);
                    x340Var.s0(wkk0Var);
                    objT4 = wkk0Var;
                }
                qxd0.t(rih1Var, x340Var, (vu30) objT4);
                Object objT5 = x340Var.T();
                if (objT5 == obj5) {
                    objT5 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT5);
                }
                ven0 ven0Var4 = (ven0) objT5;
                Object objT6 = x340Var.T();
                if (objT6 == obj5) {
                    objT6 = d3p1.H(osq0Var.Q0, osq0Var.S0, rih1Var);
                    x340Var.s0(objT6);
                }
                ven0 ven0VarH = rwq.h((zob1) objT6, x340Var, 0);
                Object objT7 = x340Var.T();
                if (objT7 == obj5) {
                    objT7 = v8r.q((Object) null);
                    x340Var.s0(objT7);
                }
                ven0 ven0Var5 = (ven0) objT7;
                gix0 gix0Var = ((gsq0) ven0VarH.getValue()).a;
                gix0 gix0Var2 = gix0Var instanceof gix0 ? gix0Var : null;
                if (((Long) ven0Var5.getValue()) == null && gix0Var2 != null) {
                    ven0Var5.setValue(Long.valueOf(gix0Var2.c));
                }
                boolean zG = x340Var.g((Long) ven0Var5.getValue());
                Object objT8 = x340Var.T();
                if (zG || objT8 == obj5) {
                    Long l = (Long) ven0Var5.getValue();
                    dj41 dj41VarA = l != null ? osq0Var.c.a(osq0Var.a.b, Long.valueOf(l.longValue()), mdg1.a) : null;
                    x340Var.s0(dj41VarA);
                    objT8 = dj41VarA;
                }
                dj41 dj41Var = (dj41) objT8;
                Object objT9 = x340Var.T();
                if (objT9 == obj5) {
                    objT9 = v8r.q((Object) null);
                    x340Var.s0(objT9);
                }
                ven0 ven0Var6 = (ven0) objT9;
                Object objT10 = x340Var.T();
                if (objT10 == obj5) {
                    objT10 = v8r.q((Object) null);
                    x340Var.s0(objT10);
                }
                ven0 ven0Var7 = (ven0) objT10;
                haw0 haw0Var2 = (haw0) ven0Var7.getValue();
                Boolean bool = (Boolean) ven0Var2.getValue();
                bool.getClass();
                boolean zI3 = x340Var.i(dj41Var) | x340Var.i(haw0Var2) | x340Var.i(ven0Var2);
                Object objT11 = x340Var.T();
                if (zI3 || objT11 == obj5) {
                    haw0Var = haw0Var2;
                    lnmVar = null;
                    rwm0Var = new rwm0(dj41Var, haw0Var, ven0Var2, (lnm) null, (byte) 10);
                    ven0Var = ven0Var2;
                    x340Var.s0(rwm0Var);
                } else {
                    haw0Var = haw0Var2;
                    ven0Var = ven0Var2;
                    rwm0Var = objT11;
                    lnmVar = null;
                }
                qxd0.r(dj41Var, haw0Var, bool, (vu30) rwm0Var, x340Var);
                boolean zI4 = x340Var.i(ven0Var7) | x340Var.i(osq0Var) | x340Var.i(ven0Var);
                Object objT12 = x340Var.T();
                if (zI4 || objT12 == obj5) {
                    lnmVar2 = lnmVar;
                    sv8Var = new sv8(osq0Var, ven0Var7, ven0Var, lnmVar2, (byte) 7);
                    x340Var.s0(sv8Var);
                } else {
                    sv8Var = objT12;
                    lnmVar2 = lnmVar;
                }
                jjm0Var.a((zu30) sv8Var, x340Var, (iIntValue << 3) & 112);
                boolean zG2 = x340Var.g(dj41Var);
                Object objT13 = x340Var.T();
                if (zG2 || objT13 == obj5) {
                    lnm lnmVarA = dj41Var != 0 ? osq0Var.d.a(dj41Var.k, false) : lnmVar2;
                    x340Var.s0(lnmVarA);
                    objT13 = lnmVarA;
                }
                huz huzVar = (mr20) objT13;
                if (huzVar == null) {
                    gi41Var = gi41Var2;
                    huzVar = new huz(gi41Var, (byte) 10);
                } else {
                    gi41Var = gi41Var2;
                }
                ven0 ven0VarG = rwq.g(huzVar, gi41Var, (o8n) null, x340Var, 0, 2);
                boolean z = ((ji41) ven0VarG.getValue()) instanceof ii41;
                long jF = ((gsq0) ven0VarH.getValue()).a.f();
                boolean zF = x340Var.f(jF);
                Object objT14 = x340Var.T();
                if (zF || objT14 == obj5) {
                    objT14 = new gte0(jF);
                    x340Var.s0(objT14);
                }
                gte0 gte0Var = (gte0) objT14;
                ji41 ji41Var = (ji41) ven0VarG.getValue();
                Long l2 = (Long) ven0Var5.getValue();
                long jLongValue = l2 != null ? l2.longValue() : 0L;
                boolean zJ = u890.j(ji41Var, gi41Var);
                rg41 rg41Var = rg41.a;
                if (zJ || u890.j(ji41Var, gi41.c)) {
                    usq0Var = tsq0.a;
                } else {
                    boolean zJ2 = u890.j(ji41Var, gi41.d);
                    usq0Var = vsq0.a;
                    if (!zJ2 && !u890.j(ji41Var, gi41.e) && !u890.j(ji41Var, gi41.f) && !(ji41Var instanceof hi41) && !u890.j(ji41Var, gi41.g)) {
                        if (!(ji41Var instanceof ii41)) {
                            eg.o();
                            return null;
                        }
                        qdg1 qdg1Var = ((ii41) ji41Var).b;
                        rdg1 rdg1Var = qdg1Var.e;
                        if (rdg1Var != null) {
                            long j2 = qdg1Var.f;
                            gte0Var.getClass();
                            long j3 = j2 + rdg1Var.a;
                            long j4 = j2 + rdg1Var.b;
                            if (j3 > jLongValue || jLongValue > j4) {
                                j = jLongValue < j3 ? jLongValue - j3 : jLongValue - j4;
                            } else {
                                j = 0;
                            }
                            if (j == 0) {
                                sg41Var = rg41Var;
                            } else {
                                int i = (int) (gte0Var.a / 1000);
                                if (i < 1) {
                                    i = 1;
                                }
                                float fO = yoi1.o(j / (i * 1000.0f), -1.0f, 1.0f);
                                sg41Var = new sg41((float) ((Math.log((((double) Math.abs(fO)) * 10.0d) + 1.0d) * ((double) Math.signum(fO))) / Math.log(11.0d)), j3, j);
                            }
                            usq0Var = new usq0(sg41Var);
                        }
                    }
                }
                wsq0 wsq0Var = (wsq0) ven0Var6.getValue();
                usq0 usq0Var2 = wsq0Var instanceof usq0 ? (usq0) wsq0Var : null;
                boolean z2 = (usq0Var2 != null ? usq0Var2.b : null) instanceof trq0;
                if (z && !z2) {
                    ven0Var6.setValue(usq0Var);
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                boolean zH = x340Var.h(z2) | x340Var.i(ven0Var4);
                Object objT15 = x340Var.T();
                if (zH || objT15 == obj5) {
                    objT15 = new wsh(z2, ven0Var4, (lnm) null, (byte) 4);
                    x340Var.s0(objT15);
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT15);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    usq0Var = rsq0.a;
                } else if (((Boolean) ven0Var4.getValue()).booleanValue()) {
                    usq0Var = ssq0.a;
                } else if (z2) {
                    usq0Var = new usq0(rg41Var);
                } else if (!z && ((wsq0) ven0Var6.getValue()) != null) {
                    usq0Var = (wsq0) ven0Var6.getValue();
                    usq0Var.getClass();
                }
                usq0 usq0Var3 = usq0Var instanceof usq0 ? (usq0) usq0Var : null;
                urq0 urq0Var = usq0Var3 != null ? usq0Var3.b : null;
                boolean zI5 = x340Var.i(urq0Var) | x340Var.i(osq0Var);
                Object objT16 = x340Var.T();
                if (zI5 || objT16 == obj5) {
                    ii41Var = null;
                    objT16 = new e3p0(urq0Var, osq0Var, (lnm) null, (byte) 9);
                    x340Var.s0(objT16);
                } else {
                    ii41Var = null;
                }
                qxd0.t(urq0Var, x340Var, (vu30) objT16);
                ji41 ji41Var2 = (ji41) ven0VarG.getValue();
                ii41 ii41Var2 = ji41Var2 instanceof ii41 ? (ii41) ji41Var2 : ii41Var;
                if (ii41Var2 == null || (lae1Var = ii41Var2.c) == null || (pdg1Var = ii41Var2.b.g) == null) {
                    v3dVar = ii41Var;
                } else {
                    gae1 gae1Var = (gae1) o7h.t0(pdg1Var.a, lae1Var.a);
                    if (gae1Var == null) {
                        v3dVar = ii41Var;
                    } else {
                        v3dVar = new v3d(gae1Var.c, lae1Var.b, lae1Var.c);
                    }
                }
                isq0 isq0Var = new isq0(usq0Var, v3dVar, ((Boolean) ven0Var3.getValue()).booleanValue());
                x340Var.r(false);
                return isq0Var;
            default:
                ((Number) obj3).intValue();
                osq0 osq0Var2 = this.b;
                osq0Var2.R0 = (r6h1) obj4;
                return new nkl0(osq0Var2.a.b);
        }
    }
}
