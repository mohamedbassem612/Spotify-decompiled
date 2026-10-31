package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vxo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1269108004);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfx.b(15, apo.r(1933305361, new ql(str, function0), x340Var), x340Var, 54);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(String str, long j, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(613056702);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfx.a(j, 0L, apo.r(1537854278, new z0o(qim0Var, j, str), x340Var), x340Var, ((i2 >> 3) & 14) | 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new je3((Object) str, j, (Object) qim0Var, i, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(so10 so10Var, Function0 function0, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        Function0 function1;
        j2i j2iVarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1155258733);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(so10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = x340Var.k(t4k.n) == flb0.b;
            String strF = so10Var.g;
            qo10 qo10Var = so10Var.t;
            String str = so10Var.h;
            if (str.length() != 0) {
                strF = z2 ? f4i1.f(str, " · ", strF) : f4i1.f(strF, " · ", str);
            }
            boolean z3 = z && (qo10Var instanceof po10);
            String str2 = strF;
            String str3 = so10Var.d;
            if (u890.j(qo10Var, po10.a)) {
                x340Var.i0(740982495);
                j2iVarR = apo.r(381950804, new z3y(str2, (byte) 3), x340Var);
                x340Var.r(false);
            } else {
                if (!(qo10Var instanceof oo10)) {
                    throw p3d1.k(x340Var, 2102111277, false);
                }
                x340Var.i0(741508813);
                j2iVarR = apo.r(2081653003, new z3y(str2, b2), x340Var);
                x340Var.r(false);
            }
            function1 = function0;
            lgo1.c(apo.r(-1060859474, new zw2((Object) so10Var, z3, (byte) 7), x340Var), function1, str3, nim0Var, 0, j2iVarR, x340Var, (i2 & 112) | 6 | (i2 & 7168), 16);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(so10Var, function1, z, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(vo10 vo10Var, Function0 function0, qim0 qim0Var, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-578341984);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vo10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = vo10Var instanceof to10;
            qim0 qim0Var3 = nim0.a;
            if (z2) {
                x340Var.i0(2022947214);
                x340Var.r(false);
            } else if (vo10Var instanceof uo10) {
                x340Var.i0(-1735856504);
                x4p1.f((i3 >> 6) & 14, 0, x340Var, qim0Var3);
                x340Var.r(false);
            } else {
                if (!(vo10Var instanceof so10)) {
                    throw p3d1.k(x340Var, -1735859852, false);
                }
                x340Var.i0(2023097099);
                c((so10) vo10Var, function0, z, x340Var, ((i3 << 3) & 7168) | (i3 & 126) | ((i3 >> 3) & 896));
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(vo10Var, function0, qim0Var2, z, i, (byte) 19);
        }
    }

    public static final void e(yj41 yj41Var, mdm1 mdm1Var, mdm1 mdm1Var2, tob1 tob1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1681253603);
        int i2 = (x340Var.i(yj41Var) ? 4 : 2) | i | (x340Var.i(mdm1Var) ? 32 : 16) | (x340Var.i(mdm1Var2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(tob1Var) ? 2048 : 1024;
        }
        int i3 = i2 | (x340Var.g(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            cr31 cr31VarB = er31.b(10.0f);
            uwr uwrVar = cbx.a;
            gfx.b(18, apo.r(967800072, new y6t0(tob1Var, qim0Var, cr31VarB, cbx.a(x340Var).a.b.a(), yj41Var, mdm1Var, mdm1Var2), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z6t0(yj41Var, mdm1Var, mdm1Var2, tob1Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void f(j171 j171Var, r171 r171Var, b0k b0kVar, int i) {
        j171 j171Var2;
        r171 r171Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1009767672);
        int i2 = (x340Var.g(j171Var) ? 4 : 2) | i | (x340Var.i(r171Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            j171Var2 = j171Var;
            r171Var2 = r171Var;
            otw.c(r171Var2, j171Var2, (qim0) null, (ipb1) null, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 12);
        } else {
            j171Var2 = j171Var;
            r171Var2 = r171Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(j171Var2, r171Var2, i, (byte) 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0118  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void g(String str, if5 if5Var, boolean z, gbx gbxVar, iu30 iu30Var, qim0 qim0Var, if5 if5Var2, lax laxVar, b0k b0kVar, int i, int i2) {
        int i3;
        lax laxVar2;
        int i4;
        boolean z2;
        if5 if5Var3;
        lax laxVar3;
        qim0 qim0Var2;
        h311 h311VarV;
        int i5;
        qim0 qim0Var3;
        if5 if5Var4 = if5Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1875798852);
        int i6 = (x340Var.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i6 |= (i & 64) == 0 ? x340Var.g(if5Var) : x340Var.i(if5Var) ? 32 : 16;
        }
        int i7 = i6 | (x340Var.h(z) ? 256 : 128) | (x340Var.i(gbxVar) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i7 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        int i8 = 196608 | i7;
        int i9 = i2 & 64;
        if (i9 != 0) {
            i3 = i7 | 1769472;
        } else {
            i3 = ((2097152 & i) == 0 ? x340Var.g(if5Var4) : x340Var.i(if5Var4) ? 1048576 : 524288) | i8;
        }
        if ((i2 & 128) == 0) {
            laxVar2 = laxVar;
            int i10 = x340Var.g(laxVar2) ? 8388608 : 4194304;
            i4 = i3 | i10;
            if ((4793491 & i4) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i4 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if (i9 != 0) {
                        if5Var4 = null;
                    }
                    i5 = i2 & 128;
                    qim0Var3 = nim0.a;
                    if (i5 != 0) {
                        i4 &= -29360129;
                        laxVar2 = iax.a;
                    }
                } else {
                    x340Var.b0();
                    if ((i2 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    qim0Var3 = qim0Var;
                }
                lax laxVar4 = laxVar2;
                if5 if5Var5 = if5Var4;
                x340Var.s();
                qim0 qim0Var4 = qim0Var3;
                h(str, if5Var, z, gbxVar, iu30Var, qim0Var4, if5Var5, laxVar4, null, x340Var, (i4 & 14) | 100663360 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | 2293760 | (3670016 & i4) | (i4 & 29360128), 512);
                laxVar3 = laxVar4;
                if5Var3 = if5Var5;
                qim0Var2 = qim0Var4;
            } else {
                x340Var.b0();
                if5Var3 = if5Var4;
                laxVar3 = laxVar2;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new s2g(str, if5Var, z, gbxVar, iu30Var, qim0Var2, if5Var3, laxVar3, i, i2);
            }
        }
        laxVar2 = laxVar;
        i4 = i3 | i10;
        if ((4793491 & i4) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i4 & 1, z2)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    if5Var4 = null;
                }
                i5 = i2 & 128;
                qim0Var3 = nim0.a;
                if (i5 != 0) {
                    i4 &= -29360129;
                    laxVar2 = iax.a;
                }
            } else {
                if (i9 != 0) {
                    if5Var4 = null;
                }
                i5 = i2 & 128;
                qim0Var3 = nim0.a;
                if (i5 != 0) {
                    i4 &= -29360129;
                    laxVar2 = iax.a;
                }
            }
            lax laxVar5 = laxVar2;
            if5 if5Var6 = if5Var4;
            x340Var.s();
            qim0 qim0Var5 = qim0Var3;
            h(str, if5Var, z, gbxVar, iu30Var, qim0Var5, if5Var6, laxVar5, null, x340Var, (i4 & 14) | 100663360 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | 2293760 | (3670016 & i4) | (i4 & 29360128), 512);
            laxVar3 = laxVar5;
            if5Var3 = if5Var6;
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            if5Var3 = if5Var4;
            laxVar3 = laxVar2;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s2g(str, if5Var, z, gbxVar, iu30Var, qim0Var2, if5Var3, laxVar3, i, i2);
        }
    }

    public static final void h(String str, if5 if5Var, boolean z, gbx gbxVar, iu30 iu30Var, qim0 qim0Var, if5 if5Var2, lax laxVar, lbd1 lbd1Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        if5 if5Var3;
        lbd1 lbd1Var2;
        if5 if5Var4;
        int i4;
        int i5;
        j2i j2iVarA;
        b0k b0kVar2;
        int i6;
        j2i j2iVar;
        lbd1 lbd1Var3 = lbd1Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1315478124);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? b0kVar3.g(if5Var) : b0kVar3.i(if5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(gbxVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 |= 196608;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            if ((i & 196608) == 0) {
                i3 |= b0kVar3.i(qim0Var2) ? 131072 : 65536;
            }
        }
        int i8 = i2 & 64;
        int i9 = 1572864;
        if (i8 != 0) {
            i3 |= i9;
        } else if ((i & 1572864) == 0) {
            i9 = (i & 2097152) == 0 ? b0kVar3.g(if5Var2) : b0kVar3.i(if5Var2) ? 1048576 : 524288;
            i3 |= i9;
        }
        if ((i & 12582912) == 0) {
            i3 |= (i & 16777216) == 0 ? b0kVar3.g(laxVar) : b0kVar3.i(laxVar) ? 8388608 : 4194304;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= (134217728 & i) == 0 ? b0kVar3.g((Object) null) : b0kVar3.i((Object) null) ? 67108864 : 33554432;
        }
        int i10 = i2 & 512;
        int i11 = 805306368;
        if (i10 != 0) {
            i3 |= i11;
        } else if ((i & 805306368) == 0) {
            i11 = (i & 1073741824) == 0 ? b0kVar3.g(lbd1Var3) : b0kVar3.i(lbd1Var3) ? 536870912 : 268435456;
            i3 |= i11;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            b0kVar3.d0();
            int i12 = i & 1;
            qim0 qim0Var3 = nim0.a;
            if (i12 == 0 || b0kVar3.E()) {
                if (i7 != 0) {
                    qim0Var2 = qim0Var3;
                }
                if5 if5Var5 = i8 != 0 ? null : if5Var2;
                if (i10 != 0) {
                    lbd1Var3 = kbd1.a;
                }
                if5Var4 = if5Var5;
            } else {
                b0kVar3.b0();
                if5Var4 = if5Var2;
            }
            lbd1 lbd1Var4 = lbd1Var3;
            b0kVar3.s();
            boolean zA = ef.b(b0kVar3).a();
            if (if5Var == null) {
                b0kVar3.i0(-2126630184);
                b0kVar3.r(false);
                i5 = 0;
                i4 = i3;
                j2iVarA = null;
                b0kVar2 = b0kVar3;
            } else {
                b0kVar3.i0(-1454074295);
                uwr uwrVar = cbx.a;
                i4 = i3;
                i5 = 0;
                j2iVarA = if5Var.a((qim0) null, cbx.d(b0kVar3).j, new u7h(cbx.a(b0kVar3).b.b), (ib60) null, b0kVar3, 1);
                b0kVar2 = b0kVar3;
                b0kVar2.r(false);
            }
            int i13 = i4 >> 15;
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, i5);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var2);
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
            uvx uvxVarB = uvx.b((uvx) b0kVar2.k(vvx.a), i5, (tvx) null, (p3v) null, 30);
            if (j2iVarA == null || zA) {
                i6 = 536870912;
                j2iVar = null;
            } else {
                j2iVar = j2iVarA;
                i6 = 536870912;
            }
            j2i j2iVar2 = (j2iVarA == null || !zA) ? null : j2iVarA;
            max maxVarZ = mmo1.z(laxVar, b0kVar2);
            qim0 qim0VarQ = m0p1.q(u291.f(qim0Var3, 1.0f), laxVar, iu30Var);
            int i14 = (((1879048192 & i4) == i6 || ((i4 & 1073741824) != 0 && b0kVar2.i(lbd1Var4))) ? 1 : i5) | ((i4 & 896) == 256 ? 1 : i5);
            if ((((29360128 & i4) ^ 12582912) > 8388608 && b0kVar2.i(laxVar)) || (i4 & 12582912) == 8388608) {
                i5 = 1;
            }
            int i15 = i14 | i5;
            Object objT = b0kVar2.T();
            if (i15 != 0 || objT == fkj0.X) {
                objT = new wq01(lbd1Var4, z, laxVar, (byte) 4);
                b0kVar2.s0(objT);
            }
            b0k b0kVar4 = b0kVar2;
            qim0 qim0Var4 = qim0Var2;
            jto1.b(anm1.N("SwitchSettingRow", s161.b(qim0VarQ, true, (iu30) objT)), uvxVarB, maxVarZ, false, null, null, gbxVar, null, null, null, null, j2iVar, apo.r(-103133839, new tf((Object) lbd1Var4, z, (Object) laxVar, (Object) gbxVar, (byte) 27), b0kVar2), j2iVar2, null, apo.r(1702886478, new dba1(str, (byte) 2), b0kVar2), b0kVar4, 64 | (3670016 & (i4 << 9)), 196992, 18360);
            b0kVar3 = b0kVar4;
            cso1.s(if5Var4 == null ? new if5((Integer) null, (String) null, (b2i) null, (hf5) null, 15) : if5Var4, null, laxVar, null, b0kVar3, 8 | (i13 & 896), 10);
            b0kVar3.r(true);
            qim0Var2 = qim0Var4;
            lbd1Var2 = lbd1Var4;
            if5Var3 = if5Var4;
        } else {
            b0kVar3.b0();
            if5Var3 = if5Var2;
            lbd1Var2 = lbd1Var3;
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new e0e(str, if5Var, z, gbxVar, iu30Var, qim0Var2, if5Var3, laxVar, lbd1Var2, i, i2);
        }
    }

    public static final void k(long j, qqq0 qqq0Var) {
        if (qqq0Var == qqq0.a) {
            if (hjl.h(j) != Integer.MAX_VALUE) {
                return;
            }
            tf80.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (hjl.i(j) != Integer.MAX_VALUE) {
                return;
            }
            tf80.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final ay8 l(d0r d0rVar, String str) {
        return d3p1.F(d0rVar, w3p1.o(new l4r(jd0.D, 1, xdc0.e1, new j4r(puc0.c), puc0.b), puc0.d), str);
    }

    public static final io80 m(klm klmVar, hbp0 hbp0Var, hbp0 hbp0Var2, fdp0 fdp0Var) {
        return klmVar.b("DownloadVideoService", new iyo0(hbp0Var, hbp0Var2, fdp0Var, (byte) 15));
    }

    public static final ez00 n(hoj0 hoj0Var) {
        goj0 goj0VarA = hoj0Var.a();
        if (goj0VarA != null) {
            return (ez00) goj0VarA.a;
        }
        return null;
    }

    public static final ez00 o(hoj0 hoj0Var) {
        if (hoj0Var == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        goj0 goj0VarA = hoj0Var.a();
        goj0VarA.getClass();
        return (ez00) goj0VarA.a;
    }

    public abstract vxo1 i(HubsImmutableComponentBundle hubsImmutableComponentBundle);

    public abstract ld70 j();
}
