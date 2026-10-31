package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class l061 {
    public static final bby a;
    public static final ln00 b;

    static {
        bby bbyVarE = xay.e(3, (ni20) null);
        era eraVar = een.P0;
        a = bbyVarE.a(xay.b((pxg1) null, eraVar, (iu30) null, 13));
        b = xay.f(3, (ni20) null).a(xay.i((ni20) null, eraVar, (iu30) null, 13));
    }

    public static final void a(String str, int i, String str2, String str3, String str4, boolean z, tob1 tob1Var, w061 w061Var, vu30 vu30Var, b0k b0kVar, int i2) {
        int i3;
        String str5;
        boolean z2;
        b0k b0kVar2;
        int i4;
        boolean z3;
        long j;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-378306689);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            str5 = str2;
            i3 |= b0kVar3.g(str5) ? 256 : 128;
        } else {
            str5 = str2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.g(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.g(str4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            z2 = z;
            i3 |= b0kVar3.h(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= b0kVar3.g(tob1Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= b0kVar3.i(w061Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= b0kVar3.i(vu30Var) ? 67108864 : 33554432;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 38347923) != 38347922)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new zen0(Boolean.valueOf(z2));
                b0kVar3.s0(objT);
            }
            zen0 zen0Var = (zen0) objT;
            zen0Var.w1(Boolean.valueOf(z2));
            int i5 = i3 & 14;
            boolean z4 = i5 == 4;
            Object objT2 = b0kVar3.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = yv91.a(new yd6(tob1Var, str, (byte) 4));
                b0kVar3.s0(objT2);
            }
            tob1 tob1Var2 = (tob1) objT2;
            boolean z5 = (i3 & 7168) == 2048;
            Object objT3 = b0kVar3.T();
            if (z5 || objT3 == m4cVar) {
                objT3 = yv91.a(new yd6(str3, tob1Var, (byte) 2));
                b0kVar3.s0(objT3);
            }
            tob1 tob1Var3 = (tob1) objT3;
            boolean z6 = (57344 & i3) == 16384;
            Object objT4 = b0kVar3.T();
            if (z6 || objT4 == m4cVar) {
                objT4 = yv91.a(new yd6(str4, tob1Var, (byte) 3));
                b0kVar3.s0(objT4);
            }
            tob1 tob1Var4 = (tob1) objT4;
            ven0 ven0VarS = v8r.s(w061Var, b0kVar3);
            boolean z7 = ((i3 & 112) == 32) | (i5 == 4) | ((i3 & 896) == 256);
            Object objT5 = b0kVar3.T();
            if (z7 || objT5 == m4cVar) {
                String str6 = str5;
                i4 = i3;
                z3 = false;
                fu fuVar = new fu((Object) str6, (Object) str, i, (Object) ven0VarS, (byte) 17);
                b0kVar3.s0(fuVar);
                objT5 = fuVar;
            } else {
                i4 = i3;
                z3 = false;
            }
            iu30 iu30Var = (iu30) objT5;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            float f = ((Boolean) tob1Var4.getValue()).booleanValue() ? 0.0f : 6.0f;
            float f2 = ((Boolean) tob1Var3.getValue()).booleanValue() ? 0.0f : 6.0f;
            if (((Boolean) tob1Var2.getValue()).booleanValue()) {
                b0kVar3.i0(1519545416);
                j = cbx.a(b0kVar3).a.d;
                b0kVar3.r(z3);
            } else {
                b0kVar3.i0(1519546378);
                b0kVar3.r(z3);
                j = u7h.j;
            }
            boolean zBooleanValue = ((Boolean) tob1Var2.getValue()).booleanValue();
            hw61 hw61VarC = d4o1.a;
            if (zBooleanValue && (!p3v.c(f, 0.0f) || !p3v.c(f2, 0.0f))) {
                hw61VarC = er31.c(f, f, f2, f2);
            }
            hw61 hw61Var = hw61VarC;
            float f3 = cbx.b(b0kVar3).e.b;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            float f4 = f3 + 16.0f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(u291.f(nim0Var, 1.0f), j, hw61Var);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z8 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z8) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 48);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, nim0Var);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            b0kVar2 = b0kVar3;
            int i6 = i4;
            b(zen0Var, null, apo.r(-1835225184, new n5h((byte) 12, f4), b0kVar3), b0kVar2, 384, 2);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, wnb0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            us71.k((i6 >> 24) & 14, vu30Var, b0kVar2, true, true);
            qim0 qim0VarB = h2c.a.b(nim0Var);
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM4 = b0kVar2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarB);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC3, b0kVar2, lljVar);
            nko1.H(xos0VarM4, b0kVar2, lljVar2);
            x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar4);
            b(zen0Var, u291.c(nim0Var, 1.0f), apo.r(-320715586, new jt41(iu30Var, tob1Var2, (byte) 9), b0kVar2), b0kVar2, 432, 0);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new k061(str, i, str2, str3, str4, z, tob1Var, w061Var, vu30Var, i2);
        }
    }

    public static final void b(zen0 zen0Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        j2i j2iVar2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1302161818);
        int i3 = i | (x340Var.g(zen0Var) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = i4 != 0 ? nim0.a : qim0Var;
            j2iVar2 = j2iVar;
            fq7.d(zen0Var, qim0Var3, a, b, (String) null, apo.r(1106019442, new rv71(j2iVar2, (byte) 23), x340Var), x340Var, (i3 & 14) | 200064 | (i3 & 112), 16);
            qim0Var2 = qim0Var3;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6(zen0Var, qim0Var2, j2iVar2, i, i2, (byte) 7);
        }
    }
}
