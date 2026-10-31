package p;

import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rbc0 implements jsw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ rbc0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public static final boolean g(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    public static final void h(ven0 ven0Var) {
        ven0Var.setValue(Boolean.TRUE);
    }

    public static final void i(rbc0 rbc0Var, c9n c9nVar, SmartShuffleButtonView smartShuffleButtonView, int i, um91 um91Var) {
        fn31.T(c9nVar, (o8n) null, 0, new fe6(rbc0Var, smartShuffleButtonView, i, um91Var, (lnm) null, (byte) 14), 3);
    }

    public final void a(int i, Object obj, b0k b0kVar, ksw kswVar, iu30 iu30Var) {
        switch (this.a) {
            case 0:
                e((unb1) obj, iu30Var, kswVar, b0kVar, i);
                break;
            case 1:
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(1504006056);
                boolean zBooleanValue = ((Boolean) ((iu30) this.c).invoke(obj)).booleanValue();
                boolean z = (((i & 112) ^ 48) > 32 && x340Var.g(iu30Var)) || (i & 48) == 32;
                Object obj2 = this.d;
                boolean zI = z | x340Var.i(obj2);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new c3n((byte) 3, obj2, iu30Var);
                    x340Var.s0(objT);
                }
                s3o1.j(zBooleanValue, (Function0) objT, (qim0) null, apo.r(719333541, new pby0((xpw) this.b, obj, iu30Var, kswVar, (byte) 25), x340Var), x340Var, 3072);
                x340Var.r(false);
                break;
            case 2:
                d((om91) obj, iu30Var, kswVar, b0kVar, i);
                break;
            default:
                f((nue1) obj, iu30Var, kswVar, b0kVar, i);
                break;
        }
    }

    public void c(uvx uvxVar, jmb1 jmb1Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        gbx gbxVar;
        boolean z;
        gbx gbxVar2;
        xu30 xu30Var;
        boolean z2;
        jmb1 jmb1Var2;
        boolean z3;
        xu30 xu30Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1888395922);
        int i2 = i | (b0kVar3.i(uvxVar) ? 4 : 2) | (b0kVar3.g(jmb1Var) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | (b0kVar3.i(this) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            n6u n6uVar = jmb1Var.i;
            boolean zJ = u890.j(n6uVar, j6u.a);
            boolean z4 = !zJ;
            xn70 xn70Var = jmb1Var.c;
            String str = xn70Var != null ? xn70Var.a : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            boolean zJ2 = u890.j(n6uVar, k6u.a);
            boolean z5 = !zJ2;
            sz6 sz6Var = jmb1Var.b.l;
            sz6 sz6Var2 = sz6Var instanceof sz6 ? sz6Var : null;
            String str3 = sz6Var2 != null ? sz6Var2.c : null;
            boolean z6 = jmb1Var.j || u890.j(n6uVar, m6u.a);
            String strO0 = cwl1.o0(b0kVar3, 2131954295);
            qim0 qim0VarB = nim0.a;
            if (zJ) {
                b0kVar3.i0(-2022650438);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1722251252);
                boolean zG = b0kVar3.g(strO0);
                Object objT = b0kVar3.T();
                if (zG || objT == m4cVar) {
                    objT = new z9b0(strO0, (byte) 3);
                    b0kVar3.s0(objT);
                }
                qim0VarB = s161.b(qim0VarB, false, (iu30) objT);
                b0kVar3.r(false);
            }
            if (zJ2) {
                b0kVar3.i0(1722553067);
                b0kVar3.r(false);
                gbxVar = null;
            } else {
                b0kVar3.i0(1722402842);
                String strO1 = cwl1.o0(b0kVar3, 2131961042);
                boolean z7 = (i2 & 896) == 256;
                Object objT2 = b0kVar3.T();
                if (z7 || objT2 == m4cVar) {
                    objT2 = new sya0(iu30Var, (byte) 12);
                    b0kVar3.s0(objT2);
                }
                Function0 function0 = (Function0) objT2;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    gbx gbxVar3 = new gbx(new y50(strO1), function0);
                    b0kVar3.r(false);
                    gbxVar = gbxVar3;
                }
            }
            if (zJ2) {
                z = false;
                b0kVar3.i0(1722769323);
                b0kVar3.r(false);
                gbxVar2 = null;
            } else {
                b0kVar3.i0(1722610449);
                String strO2 = cwl1.o0(b0kVar3, 2131961046);
                boolean z8 = (i2 & 896) == 256;
                Object objT3 = b0kVar3.T();
                if (z8 || objT3 == m4cVar) {
                    objT3 = new sya0(iu30Var, (byte) 13);
                    b0kVar3.s0(objT3);
                }
                Function0 function1 = (Function0) objT3;
                if (ihc1.y0(strO2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    gbxVar2 = new gbx(new y50(strO2), function1);
                    z = false;
                    b0kVar3.r(false);
                }
            }
            if (z6 || str3 != null) {
                b0kVar3.i0(1723036048);
                xu30 xu30VarR = apo.r(2030568253, new qbc0(str3, z6, z4, z5, iu30Var), b0kVar3);
                b0kVar3.r(z);
                xu30Var = xu30VarR;
            } else {
                b0kVar3.i0(1723318891);
                b0kVar3.r(z);
                xu30Var = null;
            }
            if (str2.length() <= 0 && jmb1Var.h == n4m.c) {
                jmb1Var2 = jmb1Var;
                z2 = z4;
                z3 = false;
                b0kVar3.i0(1723750411);
                b0kVar3.r(false);
                xu30Var2 = null;
            } else {
                b0kVar3.i0(1723555019);
                z2 = z4;
                jmb1Var2 = jmb1Var;
                xu30 xu30VarR2 = apo.r(661904420, new o3(z2, str2, false, jmb1Var, (byte) 25), b0kVar3);
                z3 = false;
                b0kVar3.r(false);
                xu30Var2 = xu30VarR2;
            }
            b0kVar3.i0(1723854355);
            j2i j2iVarR = apo.r(1498642503, new h6a0((Object) this, (Object) jmb1Var2, (byte) 8), b0kVar3);
            b0kVar3.r(z3);
            gbx gbxVar4 = gbxVar2;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, gbxVar4, (xu30) null, xu30Var, (xu30) null, xu30Var2, j2iVarR, (xu30) null, (xu30) null, apo.r(1364477398, new zw2(jmb1Var2, z2, (byte) 12), b0kVar3), b0kVar2, 64 | ((i2 << 3) & 112), 196608, 25916);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i, this, uvxVar, jmb1Var, iu30Var, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    public void d(om91 om91Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        h311 h311VarV;
        vm91 vm91Var;
        iu30 iu30Var3;
        gi91 gi91Var;
        m4c m4cVar = fkj0.X;
        String str = om91Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-767907614);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(om91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1043) != 1042)) {
            if (om91Var.g) {
                ven0 ven0VarA = gfe0.a(x340Var);
                boolean zG = x340Var.g((op80) ven0VarA.getValue()) | x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    h3h1 h3h1VarC = j0o1.C((op80) ven0VarA.getValue());
                    if (h3h1VarC == null || (iu30Var3 = h3h1VarC.b) == null) {
                        objT = null;
                    } else {
                        Integer numN = l0o1.n((op80) ven0VarA.getValue());
                        r6h1 r6h1Var = (r6h1) iu30Var3.invoke(Integer.valueOf(numN != null ? numN.intValue() : 0));
                        if (r6h1Var != null) {
                            objT = new um91(str, (n6r0) this.c, r6h1Var, (i8h1) ((idq) this.b).a.b.A5.get());
                        } else {
                            objT = null;
                        }
                    }
                    x340Var.s0(objT);
                }
                um91 um91Var = (um91) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT2);
                }
                ven0 ven0Var = (ven0) objT2;
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT3);
                }
                c9n c9nVar = (c9n) objT3;
                int iOrdinal = om91Var.b.ordinal();
                if (iOrdinal == 0) {
                    gi91Var = fi91.e;
                } else if (iOrdinal == 1) {
                    gi91Var = fi91.g;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return;
                    }
                    gi91Var = gi91.e;
                }
                boolean z = om91Var.h;
                boolean zI = x340Var.i(ven0Var) | ((i3 & 14) == 4) | x340Var.i(this) | x340Var.i(c9nVar) | x340Var.i(um91Var);
                Object objT4 = x340Var.T();
                if (zI || objT4 == m4cVar) {
                    aw40 aw40Var = new aw40(om91Var, this, c9nVar, um91Var, ven0Var, (byte) 3);
                    x340Var.s0(aw40Var);
                    objT4 = aw40Var;
                }
                lyg.j(iu30Var, gi91Var, (iu30) objT4, (qim0) null, z, x340Var, (i3 >> 3) & 14);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    vm91Var = new vm91(this, om91Var, iu30Var2, kswVar, i, (byte) 0);
                }
            }
            h311VarV.d = vm91Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            vm91Var = new vm91(this, om91Var, iu30Var, kswVar, i, (byte) 1);
            h311VarV.d = vm91Var;
        }
    }

    public void e(unb1 unb1Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1592843547);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(unb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            tvx tvxVarB = gto1.B(1, x340Var, 2);
            boolean zG = x340Var.g(tvxVarB);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                uvx uvxVar = new uvx(ngx.e, 3, tvxVarB, null, 17);
                x340Var.s0(uvxVar);
                objT = uvxVar;
            }
            mod.b(oi7.a.a((gw70) this.c), apo.r(-2097793115, new cb60(unb1Var, this, (uvx) objT, iu30Var2, (byte) 19), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, this, unb1Var, iu30Var, kswVar, (byte) 9);
        }
    }

    public void f(nue1 nue1Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1882479526);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(nue1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = p3d1.n(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            Integer numValueOf = Integer.valueOf((int) (((yr80) ven0Var.getValue()).a >> 32));
            boolean zI = x340Var.i(ven0Var) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new h43(iu30Var, ven0Var, (lnm) null, (byte) 4);
                x340Var.s0(objT2);
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT2);
            float f = nue1Var.a.b;
            nim0 nim0Var = nim0.a;
            if (f <= 0.0f) {
                x340Var.i0(1559958976);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean zI2 = x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new ry71(ven0Var, (byte) 18);
                    x340Var.s0(objT3);
                }
                t1c.a(ern1.x(qim0VarD, (iu30) objT3), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1560069491);
                fae1.h(nue1Var, (ggv) this.c, u291.f(u291.z(nim0Var, (fra) null, 3), 1.0f), (sm51) this.d, (zge1) this.b, iu30Var, x340Var, (i2 & 14) | ((i2 << 12) & 458752));
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, this, nue1Var, iu30Var, kswVar, (byte) 17);
        }
    }
}
