package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class wlf0 {
    public static final d261 a = new d261("LyricsLineIndex");
    public static final d261 b = new d261("LyricsLineActive");

    public static final void a(bmf0 bmf0Var, boolean z, boolean z2, float f, int i, boolean z3, qim0 qim0Var, boolean z4, boolean z5, Boolean bool, boolean z6, iu30 iu30Var, b0k b0kVar, int i2, int i3) {
        int i4;
        boolean z7;
        boolean z8;
        boolean z9;
        int i5;
        lee1 lee1Var;
        long j;
        qim0 qim0VarB;
        Boolean bool2;
        amf0 amf0Var = bmf0Var.j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-993624405);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.g(bmf0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.d(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var.e(i) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= x340Var.h(z3) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= x340Var.g(qim0Var) ? 1048576 : 524288;
        }
        int i6 = i3 & 128;
        if (i6 != 0) {
            i4 |= 12582912;
            z7 = z4;
        } else {
            z7 = z4;
            if ((i2 & 12582912) == 0) {
                i4 |= x340Var.h(z7) ? 8388608 : 4194304;
            }
        }
        int i7 = i3 & 256;
        if (i7 != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i4 |= x340Var.h(z5) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= x340Var.g(bool) ? 536870912 : 268435456;
        }
        if (x340Var.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (((x340Var.h(z6) ? (char) 4 : (char) 2) | (x340Var.i(iu30Var) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            boolean z10 = i6 != 0 ? false : z7;
            boolean z11 = i7 != 0 ? false : z5;
            boolean z12 = z10;
            tob1 tob1VarB = z95.b(f, (fe5) null, "fontScale", (iu30) null, x340Var, ((i4 >> 9) & 14) | 3072, 22);
            int iC = l1d.C(bmf0Var.l);
            if (iC == 0) {
                i5 = 0;
                x340Var.i0(-1390288906);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(x340Var).d;
                x340Var.r(false);
            } else if (iC == 1) {
                i5 = 0;
                x340Var.i0(-1390287307);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(x340Var).e;
                x340Var.r(false);
            } else if (iC == 2) {
                i5 = 0;
                x340Var.i0(-1390285607);
                uwr uwrVar3 = cbx.a;
                lee1Var = cbx.d(x340Var).h;
                x340Var.r(false);
            } else {
                if (iC != 3) {
                    throw p3d1.k(x340Var, -1390290690, false);
                }
                x340Var.i0(-1390283783);
                uwr uwrVar4 = cbx.a;
                lee1Var = cbx.d(x340Var).b;
                i5 = 0;
                x340Var.r(false);
            }
            lee1 lee1Var2 = lee1Var;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z13 = amf0Var instanceof ylf0;
            if (z13) {
                j = u7h.j;
            } else {
                if (!(amf0Var instanceof zlf0)) {
                    eg.o();
                    return;
                }
                j = ((zlf0) amf0Var).a;
            }
            int i8 = i5;
            tob1 tob1VarA = w191.a(j, (fe5) null, "", x340Var, 384, 10);
            tob1 tob1VarA2 = z95.a((z2 && z) ? 16.0f : 0.0f, irn1.o0(400, i8, ((jhx) cbx.c(x340Var).a.d).b, 2), "lyrics line extra vertical spacing", x340Var, 384, 8);
            tob1 tob1VarB2 = z95.b((!z2 || z) ? 1.0f : 0.83f, irn1.o0(400, i8, ((jhx) cbx.c(x340Var).a.d).b, 2), "lyrics line scale", (iu30) null, x340Var, 3072, 20);
            boolean zG = x340Var.g(tob1VarA2);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new bu2(tob1VarA2, (byte) 10);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            boolean zG2 = x340Var.g(tob1VarB2);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new bu2(tob1VarB2, (byte) 11);
                x340Var.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            tob1 tob1VarA3 = w191.a(z ? bmf0Var.i : bmf0Var.h, irn1.o0(400, 0, (dlv) null, 6), "lyrics line color", x340Var, 432, 8);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            int i9 = bmf0Var.a;
            qim0 qim0VarY = nim0.a;
            if (z11 != 0) {
                qim0VarB = j9k1.x(qim0VarY, new xy30(function0, i9 != 0, (byte) 3));
            } else {
                qim0VarB = uyn1.B(qim0VarY, 0.0f, i9 == 0 ? 0.0f : ((p3v) tob1VarA2.getValue()).a, 0.0f, ((p3v) tob1VarA2.getValue()).a, 5);
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarB);
            if (!z13) {
                if (!(amf0Var instanceof zlf0)) {
                    eg.o();
                    return;
                }
                qim0VarY = uyn1.y(dug.f(qim0VarY, ((u7h) tob1VarA.getValue()).a, er31.b(16.0f)), 16.0f, 8.0f);
            }
            qim0 qim0VarThen2 = qim0VarThen.then(qim0VarY);
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen2);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean z14 = z11;
            mod.b(t4k.n.a(bmf0Var.c), apo.r(-1126719519, new olf0(bmf0Var, z, z2, ven0Var, z3, tob1VarB2, z6, iu30Var, lee1Var2, z12, i, tob1VarA3, z14, function1, tob1VarB), x340Var), x340Var, 56);
            if (bmf0Var.e.length() > 0) {
                bool2 = bool;
            } else {
                bool2 = bool;
                boolean z15 = u890.j(bool2, Boolean.TRUE) && bmf0Var.g;
                fq7.b(pbh.a, z15, (qim0) null, xay.p(3, (iu30) null).a(xay.d((ni20) null, (fra) null, 15)).a(xay.e(3, (ni20) null)), xay.t(3, (iu30) null).a(xay.l(15, (ni20) null)).a(xay.f(3, (ni20) null)), (String) null, apo.r(-1333012487, new qf6(bmf0Var, bool2, z2, z14, function1, tob1VarB2, i, tob1VarB), x340Var), x340Var, 1600518, 18);
                x340Var = x340Var;
                x340Var.r(true);
                z8 = z14;
                z9 = z12;
            }
            fq7.b(pbh.a, z15, (qim0) null, xay.p(3, (iu30) null).a(xay.d((ni20) null, (fra) null, 15)).a(xay.e(3, (ni20) null)), xay.t(3, (iu30) null).a(xay.l(15, (ni20) null)).a(xay.f(3, (ni20) null)), (String) null, apo.r(-1333012487, new qf6(bmf0Var, bool2, z2, z14, function1, tob1VarB2, i, tob1VarB), x340Var), x340Var, 1600518, 18);
            x340Var = x340Var;
            x340Var.r(true);
            z8 = z14;
            z9 = z12;
        } else {
            x340Var.b0();
            z8 = z5;
            z9 = z7;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new plf0(bmf0Var, z, z2, f, i, z3, qim0Var, z9, z8, bool, z6, iu30Var, i2, i3);
        }
    }

    public static final void b(bmf0 bmf0Var, Boolean bool, boolean z, float f, Function0 function0, boolean z2, boolean z3, b0k b0kVar, int i) {
        h311 h311VarV;
        qlf0 qlf0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-306774884);
        int i2 = (x340Var.h(z3) ? 1048576 : 524288) | i | (x340Var.g(bmf0Var) ? 4 : 2) | (x340Var.g(bool) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = v8r.q(bmf0Var);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (bmf0Var.e.length() > 0) {
                ven0Var.setValue(bmf0Var);
            }
            if (bool == null) {
                x340Var.i0(560423662);
                c((bmf0) ven0Var.getValue(), z, f, function0, z2, z3, x340Var, 524272 & (i2 >> 3));
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    qlf0Var = new qlf0(bmf0Var, bool, z, f, function0, z2, z3, i, (byte) 0);
                }
            } else {
                x340Var.i0(560784998);
                x340Var.r(false);
                eth.a(bool, u291.f(nim0.a, 1.0f), (ni20) null, "translationCrossfade", apo.r(-1238044325, new rlf0(bmf0Var, ven0Var, z, f, function0, z2, z3), x340Var), x340Var, ((i2 >> 3) & 14) | 27696, 4);
            }
            h311VarV.d = qlf0Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            qlf0Var = new qlf0(bmf0Var, bool, z, f, function0, z2, z3, i, (byte) 1);
            h311VarV.d = qlf0Var;
        }
    }

    public static final void c(bmf0 bmf0Var, boolean z, float f, Function0 function0, boolean z2, boolean z3, b0k b0kVar, int i) {
        int i2;
        boolean z4;
        boolean z5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-454434848);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(bmf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i2 |= x340Var.h(z4) ? 16384 : 8192;
        } else {
            z4 = z2;
        }
        if ((196608 & i) == 0) {
            z5 = z3;
            i2 |= x340Var.h(z5) ? 131072 : 65536;
        } else {
            z5 = z3;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            mod.b(t4k.n.a(bmf0Var.f), apo.r(-959384416, new hck(z, bmf0Var, z5, f, function0, z4), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new slf0(bmf0Var, z, f, function0, z2, z3, i);
        }
    }
}
