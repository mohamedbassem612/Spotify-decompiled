package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class lzj {
    public static final se11 a = new se11("<highlight>(.*?)</highlight>");

    public static final void a(String str, rgn0 rgn0Var, sfn0 sfn0Var, b0k b0kVar, int i) {
        String str2;
        rgn0 rgn0Var2;
        sfn0 sfn0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-986531390);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(rgn0Var) ? 32 : 16) | (x340Var.i(sfn0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(rgn0Var) | ((i2 & 14) == 4) | x340Var.i(sfn0Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                str2 = str;
                rgn0Var2 = rgn0Var;
                sfn0Var2 = sfn0Var;
                zfe zfeVar = new zfe(str2, rgn0Var2, sfn0Var2, (lnm) null, (byte) 3);
                x340Var.s0(zfeVar);
                objT = zfeVar;
            } else {
                str2 = str;
                rgn0Var2 = rgn0Var;
                sfn0Var2 = sfn0Var;
            }
            qxd0.t(str2, x340Var, (vu30) objT);
            boolean zI2 = x340Var.i(sfn0Var2);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new mwh(sfn0Var2, (byte) 9);
                x340Var.s0(objT2);
            }
            qxd0.i(rih1.a, (iu30) objT2, x340Var);
        } else {
            str2 = str;
            rgn0Var2 = rgn0Var;
            sfn0Var2 = sfn0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(str2, rgn0Var2, sfn0Var2, i, (byte) 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    public static final void b(int i, int i2, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        String str2;
        int i3;
        qim0 qim0Var2;
        boolean z2;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        lee1 lee1Var;
        int i4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(720931556);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (b0kVar3.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (b0kVar3.h(z)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b0kVar3.Y(i3 & 1, z2)) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (z) {
                    b0kVar3.i0(1325495247);
                    uwr uwrVar = cbx.a;
                    lee1Var = cbx.d(b0kVar3).d;
                } else {
                    b0kVar3.i0(1325496366);
                    uwr uwrVar2 = cbx.a;
                    lee1Var = cbx.d(b0kVar3).c;
                }
                b0kVar3.r(false);
                b0kVar2 = b0kVar3;
                uwo1.e(str2, u291.f(qim0Var4, 1.0f), lee1Var, cbx.a(b0kVar3).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, i3 & 14, 0, 2016);
                qim0Var3 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new nj8(str, qim0Var3, z, i, i2, (byte) 1);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if (b0kVar3.h(z)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b0kVar3.Y(i3 & 1, z2)) {
            if (i5 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (z) {
                b0kVar3.i0(1325495247);
                uwr uwrVar3 = cbx.a;
                lee1Var = cbx.d(b0kVar3).d;
            } else {
                b0kVar3.i0(1325496366);
                uwr uwrVar4 = cbx.a;
                lee1Var = cbx.d(b0kVar3).c;
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            uwo1.e(str2, u291.f(qim0Var4, 1.0f), lee1Var, cbx.a(b0kVar3).b.a, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, i3 & 14, 0, 2016);
            qim0Var3 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nj8(str, qim0Var3, z, i, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:69:0x0152  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a1  */
    public static final void c(Integer num, vzq0 vzq0Var, jlz0 jlz0Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        u7h u7hVar;
        u7h u7hVar2;
        mmr0[] mmr0VarArr;
        boolean z;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Float fValueOf = Float.valueOf(1.0f);
        long j = jlz0Var.b;
        long j2 = jlz0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1759345933);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(num) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(jlz0Var) : x340Var.i(jlz0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (num != null && num.intValue() == 0) {
                u7hVar2 = new u7h(jlz0Var.f);
            } else if (num != null && num.intValue() == 1) {
                u7hVar2 = new u7h(jlz0Var.g);
            } else {
                if (num != null && num.intValue() == 2) {
                    u7hVar2 = new u7h(jlz0Var.h);
                } else {
                    u7hVar = null;
                }
                if (u7hVar != null) {
                    mmr0VarArr = new mmr0[]{new mmr0(Float.valueOf(0.65f), new u7h(j2)), new mmr0(Float.valueOf(0.83f), new u7h(j)), new mmr0(fValueOf, u7hVar)};
                    z = true;
                } else {
                    z = true;
                    mmr0VarArr = new mmr0[]{new mmr0(Float.valueOf(0.84f), new u7h(j2)), new mmr0(fValueOf, new u7h(j))};
                }
                qim0 qim0VarE2 = dug.e(qim0Var, v9c.t((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), Float.POSITIVE_INFINITY, 0.0f, 8), (hw61) null, 0.0f, 6);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarE2);
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                w2g0.c(uyn1.w(nim0.a, vzq0Var), (tl3) null, apo.r(-1202681623, new rv71(j2iVar, (byte) 7), x340Var), x340Var, 3072, 6);
                x340Var.r(z);
            }
            u7hVar = u7hVar2;
            if (u7hVar != null) {
                mmr0VarArr = new mmr0[]{new mmr0(Float.valueOf(0.65f), new u7h(j2)), new mmr0(Float.valueOf(0.83f), new u7h(j)), new mmr0(fValueOf, u7hVar)};
                z = true;
            } else {
                z = true;
                mmr0VarArr = new mmr0[]{new mmr0(Float.valueOf(0.84f), new u7h(j2)), new mmr0(fValueOf, new u7h(j))};
            }
            qim0 qim0VarE3 = dug.e(qim0Var, v9c.t((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), Float.POSITIVE_INFINITY, 0.0f, 8), (hw61) null, 0.0f, 6);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarE3);
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            w2g0.c(uyn1.w(nim0.a, vzq0Var), (tl3) null, apo.r(-1202681623, new rv71(j2iVar, (byte) 7), x340Var), x340Var, 3072, 6);
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(num, vzq0Var, jlz0Var, qim0Var, j2iVar, i, (byte) 22);
        }
    }

    public static final hdx d(jlz0 jlz0Var) {
        return new hdx(6, (vu30) null, new boj(jlz0Var, (byte) 9), (vu30) null, (hw61) null, 26);
    }
}
