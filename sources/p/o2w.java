package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class o2w {
    public static final g820 a = k8p1.m(vy5.d, 25);

    public static final void a(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1619005917);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131955354);
            String strO1 = cwl1.o0(x340Var, 2131955353);
            String strO2 = cwl1.o0(x340Var, 2131955351);
            z50 z50Var = z50.c;
            function2 = function1;
            mqo1.d(function2, (i3u) null, (hux) null, strO0, strO1, new zgx(strO2, new gbx(z50Var, function0)), new zgx(cwl1.o0(x340Var, 2131955352), new gbx(z50Var, function1)), x340Var, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function2, i, (byte) 20);
        }
    }

    public static final void b(m3w m3wVar, iu30 iu30Var, jut jutVar, b0k b0kVar, int i) {
        int i2;
        Object l2wVar;
        jut jutVar2;
        lnm lnmVar;
        m4c m4cVar = fkj0.X;
        ke81 ke81Var = m3wVar.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-396009613);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(m3wVar) : x340Var.i(m3wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(jutVar) ? 256 : 128;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            y7e1 y7e1VarD = c4p1.D(0, 2, m3wVar.b, x340Var);
            k6a1 k6a1Var = (k6a1) x340Var.k(t4k.q);
            int i4 = i3 & 112;
            boolean zI = x340Var.i(y7e1VarD) | (i4 == 32) | x340Var.i(jutVar);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                jutVar2 = jutVar;
                l2wVar = new l2w(y7e1VarD, iu30Var, jutVar2, (lnm) null, (byte) 0);
                lnmVar = null;
                x340Var.s0(l2wVar);
            } else {
                jutVar2 = jutVar;
                l2wVar = objT;
                lnmVar = null;
            }
            qxd0.t(y7e1VarD, x340Var, (vu30) l2wVar);
            boolean zI2 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && x340Var.i(m3wVar))) | x340Var.i(k6a1Var);
            Object objT2 = x340Var.T();
            byte b = 14;
            if (zI2 || objT2 == m4cVar) {
                objT2 = new ymu(m3wVar, k6a1Var, lnmVar, b);
                x340Var.s0(objT2);
            }
            qxd0.t(ke81Var, x340Var, (vu30) objT2);
            int iOrdinal = ke81Var.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(754244493);
                x340Var.r(false);
            } else if (iOrdinal == 1) {
                x340Var.i0(1686882616);
                boolean zI3 = x340Var.i(jutVar2) | (i4 == 32);
                Object objT3 = x340Var.T();
                if (zI3 || objT3 == m4cVar) {
                    objT3 = new m2w(jutVar2, iu30Var, (byte) 0);
                    x340Var.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                boolean zI4 = x340Var.i(jutVar2) | (i4 == 32);
                Object objT4 = x340Var.T();
                if (zI4 || objT4 == m4cVar) {
                    objT4 = new m2w(jutVar2, iu30Var, (byte) 1);
                    x340Var.s0(objT4);
                }
                a(function0, (Function0) objT4, x340Var, 0);
                x340Var.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw p3d1.k(x340Var, 1686880849, false);
                }
                x340Var.i0(1686892968);
                boolean z = i4 == 32;
                Object objT5 = x340Var.T();
                if (z || objT5 == m4cVar) {
                    objT5 = new q7u(iu30Var, (byte) 13);
                    x340Var.s0(objT5);
                }
                Function0 function1 = (Function0) objT5;
                boolean z2 = i4 == 32;
                Object objT6 = x340Var.T();
                if (z2 || objT6 == m4cVar) {
                    objT6 = new q7u(iu30Var, (byte) 14);
                    x340Var.s0(objT6);
                }
                g(function1, (Function0) objT6, x340Var, 0);
                x340Var.r(false);
            }
            irn1.u((qim0) null, apo.r(-1059104096, new n7m((Object) m3wVar, (Object) jutVar, (Object) k6a1Var, iu30Var, (byte) 23), x340Var), (vu30) null, (erl1) null, apo.r(-1281055846, new nzd((Object) y7e1VarD, (Object) m3wVar, (Object) iu30Var, (byte) 25), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t((byte) 18, i, (Object) m3wVar, (Object) jutVar, iu30Var);
        }
    }

    public static final void c(hux huxVar, String str, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1464598203);
        int i2 = ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i | (b0kVar3.g(str) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b((qim0) null, new uvx(0, (pgx) null, 0, new zzq0(8.0f, 8.0f, 8.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(638423793, new g70(huxVar, (byte) 4), b0kVar3), (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-1018536713, new kaf(str, (byte) 28), b0kVar3), b0kVar2, 100663360, 196608, 32509);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new grc(huxVar, str, i, (byte) 1);
        }
    }

    public static final void d(lrz0 lrz0Var, qim0 qim0Var, b0k b0kVar, int i) {
        String strK;
        int i2 = lrz0Var.a;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(456398235);
        int i3 = (b0kVar2.g(lrz0Var) ? 4 : 2) | i | (b0kVar2.i(qim0Var) ? 32 : 16);
        if (b0kVar2.Y(i3 & 1, (i3 & 19) != 18)) {
            int i4 = lrz0Var.b;
            if (i2 <= 0 || i4 <= 0) {
                strK = x0d.k(b0kVar2, -1306251695, 2131955363, b0kVar2, false);
            } else {
                b0kVar2.i0(-1306456357);
                strK = cwl1.U(2131820675, i2, new Object[]{Integer.valueOf(i2), Integer.valueOf(i4)}, b0kVar2);
                b0kVar2.r(false);
            }
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String strO0 = cwl1.o0(b0kVar2, 2131955364);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            uwo1.e(strO0, uyn1.B(nim0.a, 8.0f, 0.0f, 0.0f, 8.0f, 6), cbx.d(b0kVar2).h, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
            b0kVar2 = b0kVar2;
            c(vtx.c, cwl1.o0(b0kVar2, 2131955365), b0kVar2, vtx.d);
            c(xmx.c, cwl1.o0(b0kVar2, 2131955362), b0kVar2, xmx.d);
            c(xrx.c, strK, b0kVar2, xrx.d);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new o1t(lrz0Var, qim0Var, i, (byte) 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v43 */
    public static final void e(y7e1 y7e1Var, job1 job1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        lz20 lz20Var;
        Object obj;
        boolean z;
        Function0 function0;
        vu30 vu30Var;
        boolean z2;
        af5 af5Var;
        af5 af5Var2;
        boolean z3;
        int i2;
        ?? r5;
        jax haxVar;
        zxx zxxVarA;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1358988500);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.i(y7e1Var) ? 4 : 2) | (x340Var.g(job1Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            Object obj2 = fkj0.X;
            if (objT == obj2) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var2 = (lz20) objT;
            boolean zI = x340Var.i(lz20Var2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj2) {
                objT2 = new fx1(lz20Var2, (lnm) null, (byte) 5);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar);
            nko1.F(x340Var);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var4);
            if (job1Var instanceof enb1) {
                x340Var.i0(1483694349);
                af5 af5Var3 = new af5(cwl1.o0(x340Var, 2131955357));
                x340Var.r(false);
                vu30Var2 = vu30Var2;
                lz20Var = lz20Var2;
                obj = obj2;
                af5Var2 = af5Var3;
                r5 = 0;
                vu30Var3 = vu30Var3;
                function0 = function1;
                vu30Var = vu30Var4;
                z2 = true;
            } else {
                if (job1Var instanceof dmb1) {
                    x340Var.i0(1483698339);
                    int i4 = ((dmb1) job1Var).a;
                    int i5 = i3 >> 3;
                    x340Var.i0(-1349197312);
                    if (i4 != 6) {
                        x340Var.i0(-1632980039);
                        switch (l1d.C(i4)) {
                            case 0:
                            case 7:
                                i2 = 2131955357;
                                break;
                            case 1:
                                i2 = 2131955359;
                                break;
                            case 2:
                                i2 = 2131955360;
                                break;
                            case 3:
                                i2 = 2131955355;
                                break;
                            case 4:
                                i2 = 2131955361;
                                break;
                            case 5:
                                i2 = 2131955356;
                                break;
                            case 6:
                                i2 = 2131955358;
                                break;
                            default:
                                eg.o();
                                return;
                        }
                        af5 af5Var4 = new af5(cwl1.o0(x340Var, i2));
                        x340Var.r(false);
                        x340Var.r(false);
                        lz20Var = lz20Var2;
                        z3 = false;
                        function0 = function1;
                        vu30Var = vu30Var4;
                        af5Var = af5Var4;
                        z2 = true;
                        obj = obj2;
                    } else {
                        x340Var.i0(-1632909886);
                        x340Var.r(false);
                        boolean z5 = (((i5 & 112) ^ 48) > 32 && x340Var.g(iu30Var)) || (i5 & 48) == 32;
                        Object objT3 = x340Var.T();
                        if (z5 || objT3 == obj2) {
                            objT3 = new hws(iu30Var, (byte) 19);
                            x340Var.s0(objT3);
                        }
                        iu30 iu30Var3 = (iu30) objT3;
                        vu30Var = vu30Var4;
                        lz20Var = lz20Var2;
                        obj = obj2;
                        function0 = function1;
                        z3 = false;
                        z2 = true;
                        af5 af5VarA = wmo1.A(2131955356, 2131955367, "https://www.spotify.com/safetyandprivacy/platform-rules", (zma1) null, iu30Var3, x340Var, 384, 8);
                        x340Var.r(false);
                        af5Var = af5VarA;
                    }
                    x340Var.r(z3);
                    z = z3;
                } else {
                    vu30Var2 = vu30Var2;
                    lz20Var = lz20Var2;
                    obj = obj2;
                    z = false;
                    vu30Var3 = vu30Var3;
                    function0 = function1;
                    vu30Var = vu30Var4;
                    z2 = true;
                    x340Var.i0(1483700049);
                    x340Var.r(false);
                    af5Var = new af5("");
                }
                af5Var2 = af5Var;
                r5 = z;
            }
            boolean z6 = job1Var instanceof dmb1;
            ?? r8 = (z6 && ((dmb1) job1Var).a == 6) ? z2 : r5;
            String strO0 = cwl1.o0(x340Var, 2131955367);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarP = vby0.p(nim0Var, lz20Var);
            ?? r10 = (i3 & 112) != 32 ? r5 : z2;
            Object objT4 = x340Var.T();
            if (r10 != 0 || objT4 == obj) {
                objT4 = new nit(job1Var, (byte) 26);
                x340Var.s0(objT4);
            }
            qim0 qim0VarB = s161.b(qim0VarP, (boolean) r5, (iu30) objT4);
            if (job1Var instanceof fnb1) {
                x340Var.i0(-1249365359);
                haxVar = new hax(cwl1.o0(x340Var, 2131955378));
                x340Var.r((boolean) r5);
            } else {
                x340Var.i0(-1249416230);
                x340Var.r((boolean) r5);
                haxVar = jax.a;
            }
            j2i j2iVarR = apo.r(743311465, new n2w(job1Var, (byte) r5), x340Var);
            kua0 kua0Var = new kua0(0, (Boolean) null, 0, 7, 119);
            if (z6 || (job1Var instanceof lnb1)) {
                x340Var.i0(-564767042);
                zxx zxxVarT = eyx.d.t(x340Var);
                uwr uwrVar = cbx.a;
                zxxVarA = zxx.a(zxxVarT, cbx.a(x340Var).a.b.a(), cbx.a(x340Var).a.b.a(), cbx.a(x340Var).b.c, cbx.a(x340Var).b.c, 591);
                x340Var.r(false);
            } else {
                x340Var.i0(-564755432);
                x340Var.i0(939287598);
                zxx zxxVarM = pwo1.m(x340Var);
                x340Var.r(false);
                uwr uwrVar2 = cbx.a;
                zxxVarA = zxx.a(zxxVarM, cbx.a(x340Var).a.b.a(), cbx.a(x340Var).a.b.a(), 0L, 0L, 975);
                x340Var.r(false);
            }
            ?? r3 = r8;
            Object obj3 = obj;
            Function0 function2 = function0;
            af5 af5Var5 = af5Var2;
            rwo1.b(y7e1Var, qim0VarB, haxVar, (String) null, (vu30) null, j2iVarR, false, z6, a, (lee1) null, kua0Var, (yta0) null, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, (vzq0) null, 0.0f, false, zxxVarA, x340Var, (i3 & 14) | 196608, 0, 1043032);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean zI2 = x340Var.i(af5Var5) | x340Var.h((boolean) r3) | x340Var.g(strO0) | ((i3 & 896) == 256);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == obj3) {
                iu30Var2 = iu30Var;
                objT5 = new gh1(af5Var5, (boolean) r3, strO0, iu30Var2);
                x340Var.s0(objT5);
            } else {
                iu30Var2 = iu30Var;
            }
            qim0 qim0VarA = s161.a(qim0VarB2, (iu30) objT5);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, vu30Var2);
            nko1.H(xos0VarM2, x340Var, vu30Var3);
            x0d.q(iHashCode2, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var);
            uwo1.d(af5Var5, cbx.a(x340Var).b.d, (qim0) null, cbx.d(x340Var).m, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4084);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(i, (Object) y7e1Var, (Object) job1Var, (Object) iu30Var2, (Object) qim0Var, (byte) 24);
        }
    }

    public static final void f(job1 job1Var, Function0 function0, b0k b0kVar, int i) {
        hax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2147351688);
        int i2 = (x340Var.g(job1Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gbx gbxVar = new gbx(z50.c, function0);
            if ((job1Var instanceof lnb1) || job1Var.equals(amb1.a) || (job1Var instanceof enb1)) {
                x340Var.i0(776192977);
                x340Var.r(false);
                haxVar = jax.a;
            } else if (job1Var instanceof bmb1) {
                x340Var.i0(776195344);
                haxVar = new hax(cwl1.o0(x340Var, 2131955372));
                x340Var.r(false);
            } else if (job1Var instanceof rlb1) {
                x340Var.i0(776200524);
                haxVar = new hax(cwl1.o0(x340Var, 2131955369));
                x340Var.r(false);
            } else if (job1Var instanceof dmb1) {
                x340Var.i0(776205646);
                haxVar = new hax(cwl1.o0(x340Var, 2131955370));
                x340Var.r(false);
            } else if (job1Var instanceof mnb1) {
                x340Var.i0(776210929);
                haxVar = new hax(cwl1.o0(x340Var, 2131955373));
                x340Var.r(false);
            } else {
                if (!(job1Var instanceof fnb1)) {
                    throw p3d1.k(x340Var, 776190380, false);
                }
                x340Var.i0(776216013);
                haxVar = new hax(cwl1.o0(x340Var, 2131955371));
                x340Var.r(false);
            }
            foo1.c(gbxVar, ldx.c, (qim0) null, haxVar, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1041983769, new n2w(job1Var, (byte) 1), x340Var), x340Var, 0, 48, 1996);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o1t(job1Var, function0, i, (byte) 17);
        }
    }

    public static final void g(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1907655378);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131955376);
            String strO1 = cwl1.o0(x340Var, 2131955375);
            String strO2 = cwl1.o0(x340Var, 2131955374);
            z50 z50Var = z50.c;
            function2 = function1;
            mqo1.d(function2, (i3u) null, (hux) null, strO0, strO1, new zgx(strO2, new gbx(z50Var, function0)), new zgx(cwl1.o0(x340Var, 2131955377), new gbx(z50Var, function1)), x340Var, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function2, i, (byte) 21);
        }
    }

    public static final void h(job1 job1Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2045272690);
        int i2 = (b0kVar3.g(job1Var) ? 4 : 2) | i;
        if (!b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        } else if (job1Var instanceof mnb1) {
            b0kVar3.i0(1587968937);
            b0kVar2 = b0kVar3;
            xto1.e((qim0) null, 2, 0L, 0L, b0kVar2, 48, 13);
            b0kVar2.r(false);
        } else {
            b0kVar2 = b0kVar3;
            boolean z = job1Var instanceof lnb1;
            nim0 nim0Var = nim0.a;
            isl islVar = isl.a;
            if (z) {
                b0kVar2.i0(1587972080);
                jlx jlxVar = jlx.c;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar2).g;
                w0h1.a(jlxVar, islVar, u291.r(nim0Var, 16.0f), cbx.a(b0kVar2).b.f, 0L, false, b0kVar2, jlx.d | 48, 48);
                b0kVar2 = b0kVar2;
                b0kVar2.r(false);
            } else if (job1Var instanceof dmb1) {
                b0kVar2.i0(1587980473);
                cnx cnxVar = cnx.c;
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(b0kVar2).g;
                w0h1.a(cnxVar, islVar, u291.r(nim0Var, 16.0f), cbx.a(b0kVar2).b.d, 0L, false, b0kVar2, cnx.d | 48, 48);
                b0kVar2 = b0kVar2;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1982993202);
                b0kVar2.r(false);
            }
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n2w(job1Var, i);
        }
    }
}
