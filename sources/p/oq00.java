package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oq00 implements o1i {
    public final bcl1 a;

    public oq00(bcl1 bcl1Var) {
        this.a = bcl1Var;
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        return new x0i(new w0i(o0iVar.e, "expandable_description", null, null, 12));
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:118:0x02de  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:127:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0315  */
    /* JADX WARN: Code duplicated, block: B:131:0x032f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0331  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(nq00 nq00Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        nq00 nq00Var2;
        o0i o0iVar2;
        oq00 oq00Var;
        ven0 ven0Var;
        Function0 function0;
        qim0 qim0Var2;
        boolean z;
        ?? r3;
        vu30 vu30Var;
        ?? r13;
        ?? r0;
        Object objT;
        m4c m4cVar;
        ?? r1;
        int i3;
        Object obj;
        ven0 ven0Var2;
        boolean zG;
        Object obj2;
        boolean zG2;
        Object obj3;
        Object obj4;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1359178438);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(nq00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object objT2 = x340Var.T();
            Object obj5 = objT2;
            if (z2 || objT2 == m4cVar2) {
                hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                x340Var.s0(hrr0VarQ);
                obj5 = hrr0VarQ;
            }
            ven0 ven0Var3 = (ven0) obj5;
            boolean z3 = i4 == 4;
            Object objT3 = x340Var.T();
            Object obj6 = objT3;
            if (z3 || objT3 == m4cVar2) {
                hrr0 hrr0VarQ2 = v8r.q(Boolean.FALSE);
                x340Var.s0(hrr0VarQ2);
                obj6 = hrr0VarQ2;
            }
            ven0 ven0Var4 = (ven0) obj6;
            Boolean bool = (Boolean) ven0Var3.getValue();
            bool.booleanValue();
            int i5 = i2 & 112;
            boolean zG3 = (i5 == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.g(ven0Var3);
            Object objT4 = x340Var.T();
            Object obj7 = objT4;
            if (zG3 || objT4 == m4cVar2) {
                l7x l7xVar = new l7x(o0iVar, ven0Var3, null, (byte) 1);
                x340Var.s0(l7xVar);
                obj7 = l7xVar;
            }
            qxd0.t(bool, x340Var, (vu30) obj7);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean zBooleanValue = ((Boolean) ven0Var4.getValue()).booleanValue();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarThen = qim0VarF.then(zBooleanValue ? o0c.d(qim0Var3, (ni20) null, 3) : qim0Var3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z4) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            vu30 vu30Var2 = y580.O0;
            nko1.H(mbhVarA, x340Var, vu30Var2);
            llj lljVar = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar2);
            nko1.F(x340Var);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar3);
            Object objT5 = x340Var.T();
            Object obj8 = objT5;
            if (objT5 == m4cVar2) {
                mdt mdtVarA = yv91.a(new t3x(nq00Var, ven0Var3, (byte) 24));
                x340Var.s0(mdtVarA);
                obj8 = mdtVarA;
            }
            if (((Boolean) ((tob1) obj8).getValue()).booleanValue()) {
                x340Var.i0(-458982144);
                String str = nq00Var.d;
                if (str == null) {
                    str = "";
                }
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).h;
                cjc0 cjc0Var = new cjc0(5);
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                boolean zG4 = x340Var.g(ven0Var3);
                Object objT6 = x340Var.T();
                if (zG4 || objT6 == m4cVar2) {
                    iwr iwrVar = new iwr(ven0Var3, (byte) 18);
                    x340Var.s0(iwrVar);
                    obj4 = iwrVar;
                } else {
                    obj4 = objT6;
                }
                qim0 qim0VarX = bin.x(qim0VarB, false, (String) null, (pm31) null, (idn0) null, (Function0) obj4, 15);
                r3 = 1;
                qim0Var2 = qim0Var3;
                ven0Var = ven0Var4;
                function0 = function1;
                z = false;
                vu30Var = vu30Var2;
                uwo1.e(str, qim0VarX, lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 1572864, 0, 1720);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                ven0Var = ven0Var4;
                function0 = function1;
                qim0Var2 = qim0Var3;
                z = false;
                r3 = 1;
                vu30Var = vu30Var2;
                x340Var.i0(-458618638);
                x340Var.r(false);
            }
            qim0 qim0VarH = l6o1.H(u291.j(0.0f, 250.0f, (int) r3, u291.f(qim0Var2, 1.0f)), l6o1.C(z ? 1 : 0, z ? 1 : 0, (int) r3, x340Var), z, 14);
            gfh0 gfh0VarC = t1c.c(een.d, z);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, vu30Var);
            nko1.H(xos0VarM2, x340Var, lljVar);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar3);
            oq00Var = this;
            int i6 = (x340Var.g(ven0Var3) ? 1 : 0) | (x340Var.i(oq00Var) ? 1 : 0);
            if (i5 != 32) {
                o0iVar2 = o0iVar;
                if ((i2 & 64) == 0 || !x340Var.i(o0iVar2)) {
                    r13 = z ? 1 : 0;
                }
                r0 = i6 | r13;
                objT = x340Var.T();
                if (r0 == 0) {
                    if (objT == m4cVar) {
                    }
                    m4cVar = m4cVar2;
                    obj = objT;
                    iu30 iu30Var = (iu30) obj;
                    qim0 qim0VarF3 = u291.f(qim0Var2, 1.0f);
                    boolean zG5 = x340Var.g(ven0Var3);
                    r1 = z;
                    if (i4 == 4) {
                        r1 = r3;
                    }
                    i3 = r1 | (zG5 ? 1 : 0);
                    Object objT7 = x340Var.T();
                    if (i3 == 0 || objT7 == m4cVar) {
                        nq00Var2 = nq00Var;
                        f0z f0zVar = new f0z(nq00Var2, ven0Var3, (byte) 21);
                        x340Var.s0(f0zVar);
                        obj = f0zVar;
                    } else {
                        nq00Var2 = nq00Var;
                        obj = objT7;
                    }
                    dm5.a(iu30Var, qim0VarF3, (iu30) obj, x340Var, 48, 0);
                    x340Var.r((boolean) r3);
                    x340Var.r((boolean) r3);
                    ven0Var2 = ven0Var;
                    zG = x340Var.g(ven0Var2);
                    Object objT8 = x340Var.T();
                    obj2 = objT8;
                    if (zG || objT8 == m4cVar) {
                        vk1 vk1Var = new vk1(ven0Var2, (lnm) null, (byte) 9);
                        x340Var.s0(vk1Var);
                        obj2 = vk1Var;
                    }
                    qxd0.t(nq00Var2, x340Var, (vu30) obj2);
                    zG2 = x340Var.g(ven0Var3);
                    Object objT9 = x340Var.T();
                    obj3 = objT9;
                    if (zG2 || objT9 == m4cVar) {
                        d7v d7vVar = new d7v(ven0Var3, (byte) 24);
                        x340Var.s0(d7vVar);
                        obj3 = d7vVar;
                    }
                    oto1.c(nq00Var2, o0iVar2, (iu30) obj3, x340Var, i4 | 64 | i5);
                } else {
                    m4cVar = m4cVar2;
                }
                m4cVar = m4cVar2;
                obj = objT;
                djx djxVar = new djx(oq00Var, o0iVar2, ven0Var3, (byte) 12);
                x340Var.s0(djxVar);
                Object obj9 = djxVar;
                m4cVar = m4cVar2;
                obj9 = objT;
                iu30 iu30Var2 = (iu30) obj9;
                qim0 qim0VarF4 = u291.f(qim0Var2, 1.0f);
                boolean zG6 = x340Var.g(ven0Var3);
                r1 = z;
                if (i4 == 4) {
                    r1 = r3;
                }
                i3 = r1 | (zG6 ? 1 : 0);
                Object objT10 = x340Var.T();
                if (i3 == 0) {
                    nq00Var2 = nq00Var;
                    f0z f0zVar2 = new f0z(nq00Var2, ven0Var3, (byte) 21);
                    x340Var.s0(f0zVar2);
                    obj = f0zVar2;
                } else {
                    nq00Var2 = nq00Var;
                    f0z f0zVar3 = new f0z(nq00Var2, ven0Var3, (byte) 21);
                    x340Var.s0(f0zVar3);
                    obj = f0zVar3;
                }
                dm5.a(iu30Var2, qim0VarF4, (iu30) obj, x340Var, 48, 0);
                x340Var.r((boolean) r3);
                x340Var.r((boolean) r3);
                ven0Var2 = ven0Var;
                zG = x340Var.g(ven0Var2);
                Object objT11 = x340Var.T();
                obj2 = objT11;
                if (zG) {
                    vk1 vk1Var2 = new vk1(ven0Var2, (lnm) null, (byte) 9);
                    x340Var.s0(vk1Var2);
                    obj2 = vk1Var2;
                } else {
                    vk1 vk1Var3 = new vk1(ven0Var2, (lnm) null, (byte) 9);
                    x340Var.s0(vk1Var3);
                    obj2 = vk1Var3;
                }
                qxd0.t(nq00Var2, x340Var, (vu30) obj2);
                zG2 = x340Var.g(ven0Var3);
                Object objT12 = x340Var.T();
                obj3 = objT12;
                if (zG2) {
                    d7v d7vVar2 = new d7v(ven0Var3, (byte) 24);
                    x340Var.s0(d7vVar2);
                    obj3 = d7vVar2;
                } else {
                    d7v d7vVar3 = new d7v(ven0Var3, (byte) 24);
                    x340Var.s0(d7vVar3);
                    obj3 = d7vVar3;
                }
                oto1.c(nq00Var2, o0iVar2, (iu30) obj3, x340Var, i4 | 64 | i5);
            } else {
                o0iVar2 = o0iVar;
            }
            r13 = r3;
            r0 = i6 | r13;
            objT = x340Var.T();
            if (r0 == 0) {
                if (objT == m4cVar) {
                }
                m4cVar = m4cVar2;
                obj9 = objT;
                iu30 iu30Var3 = (iu30) obj9;
                qim0 qim0VarF5 = u291.f(qim0Var2, 1.0f);
                boolean zG7 = x340Var.g(ven0Var3);
                r1 = z;
                if (i4 == 4) {
                    r1 = r3;
                }
                i3 = r1 | (zG7 ? 1 : 0);
                Object objT13 = x340Var.T();
                if (i3 == 0) {
                    nq00Var2 = nq00Var;
                    f0z f0zVar4 = new f0z(nq00Var2, ven0Var3, (byte) 21);
                    x340Var.s0(f0zVar4);
                    obj = f0zVar4;
                } else {
                    nq00Var2 = nq00Var;
                    f0z f0zVar5 = new f0z(nq00Var2, ven0Var3, (byte) 21);
                    x340Var.s0(f0zVar5);
                    obj = f0zVar5;
                }
                dm5.a(iu30Var3, qim0VarF5, (iu30) obj, x340Var, 48, 0);
                x340Var.r((boolean) r3);
                x340Var.r((boolean) r3);
                ven0Var2 = ven0Var;
                zG = x340Var.g(ven0Var2);
                Object objT14 = x340Var.T();
                obj2 = objT14;
                if (zG) {
                    vk1 vk1Var4 = new vk1(ven0Var2, (lnm) null, (byte) 9);
                    x340Var.s0(vk1Var4);
                    obj2 = vk1Var4;
                } else {
                    vk1 vk1Var5 = new vk1(ven0Var2, (lnm) null, (byte) 9);
                    x340Var.s0(vk1Var5);
                    obj2 = vk1Var5;
                }
                qxd0.t(nq00Var2, x340Var, (vu30) obj2);
                zG2 = x340Var.g(ven0Var3);
                Object objT15 = x340Var.T();
                obj3 = objT15;
                if (zG2) {
                    d7v d7vVar4 = new d7v(ven0Var3, (byte) 24);
                    x340Var.s0(d7vVar4);
                    obj3 = d7vVar4;
                } else {
                    d7v d7vVar5 = new d7v(ven0Var3, (byte) 24);
                    x340Var.s0(d7vVar5);
                    obj3 = d7vVar5;
                }
                oto1.c(nq00Var2, o0iVar2, (iu30) obj3, x340Var, i4 | 64 | i5);
            } else {
                m4cVar = m4cVar2;
            }
            m4cVar = m4cVar2;
            obj9 = objT;
            djx djxVar2 = new djx(oq00Var, o0iVar2, ven0Var3, (byte) 12);
            x340Var.s0(djxVar2);
            Object obj10 = djxVar2;
            m4cVar = m4cVar2;
            obj10 = objT;
            iu30 iu30Var4 = (iu30) obj10;
            qim0 qim0VarF6 = u291.f(qim0Var2, 1.0f);
            boolean zG8 = x340Var.g(ven0Var3);
            r1 = z;
            if (i4 == 4) {
                r1 = r3;
            }
            i3 = r1 | (zG8 ? 1 : 0);
            Object objT16 = x340Var.T();
            if (i3 == 0) {
                nq00Var2 = nq00Var;
                f0z f0zVar6 = new f0z(nq00Var2, ven0Var3, (byte) 21);
                x340Var.s0(f0zVar6);
                obj = f0zVar6;
            } else {
                nq00Var2 = nq00Var;
                f0z f0zVar7 = new f0z(nq00Var2, ven0Var3, (byte) 21);
                x340Var.s0(f0zVar7);
                obj = f0zVar7;
            }
            dm5.a(iu30Var4, qim0VarF6, (iu30) obj, x340Var, 48, 0);
            x340Var.r((boolean) r3);
            x340Var.r((boolean) r3);
            ven0Var2 = ven0Var;
            zG = x340Var.g(ven0Var2);
            Object objT17 = x340Var.T();
            obj2 = objT17;
            if (zG) {
                vk1 vk1Var6 = new vk1(ven0Var2, (lnm) null, (byte) 9);
                x340Var.s0(vk1Var6);
                obj2 = vk1Var6;
            } else {
                vk1 vk1Var7 = new vk1(ven0Var2, (lnm) null, (byte) 9);
                x340Var.s0(vk1Var7);
                obj2 = vk1Var7;
            }
            qxd0.t(nq00Var2, x340Var, (vu30) obj2);
            zG2 = x340Var.g(ven0Var3);
            Object objT18 = x340Var.T();
            obj3 = objT18;
            if (zG2) {
                d7v d7vVar6 = new d7v(ven0Var3, (byte) 24);
                x340Var.s0(d7vVar6);
                obj3 = d7vVar6;
            } else {
                d7v d7vVar7 = new d7v(ven0Var3, (byte) 24);
                x340Var.s0(d7vVar7);
                obj3 = d7vVar7;
            }
            oto1.c(nq00Var2, o0iVar2, (iu30) obj3, x340Var, i4 | 64 | i5);
        } else {
            nq00Var2 = nq00Var;
            o0iVar2 = o0iVar;
            oq00Var = this;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, oq00Var, nq00Var2, o0iVar2, qim0Var, (byte) 23);
        }
    }
}
