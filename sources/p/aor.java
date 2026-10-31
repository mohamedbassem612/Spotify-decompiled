package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class aor implements cvl1, xpw {
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final ynb0 d;
    public final js20 e = x3p1.n(new znr(this, (byte) 0), r5r.Z0, ido.X0, (o8n) null, new znr(this, (byte) 1), 8);
    public final hy00 f = n3o1.r(this).c(zho.R0, zho.S0);
    public final psw g;

    public aor(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
        this.d = ynb0Var4;
        j2i j2iVar = new j2i(-1544871398, new i6r(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e(g3l g3lVar, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        zzq0 zzq0Var;
        f3l f3lVar = g3lVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2092154626);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(g3lVar) : x340Var.i(g3lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131954222);
            int iC = l1d.C(f3lVar.b);
            if (iC == 0) {
                x340Var.i0(-751402315);
                x340Var.r(false);
                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -751403558, false);
                }
                x340Var.i0(-751400588);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
                x340Var.r(false);
            }
            zzq0 zzq0Var2 = zzq0Var;
            if (f3lVar.i && f3lVar.c) {
                x340Var.i0(1187247628);
                int i3 = (i2 & 14) | 8;
                int i4 = i2 << 6;
                h(g3lVar, strO0, zzq0Var2, function0, x340Var, i3 | (i4 & 7168) | (i4 & 57344));
                x340Var.r(false);
            } else {
                x340Var.i0(1187435922);
                int i5 = (i2 & 14) | 8;
                int i6 = i2 << 6;
                g(g3lVar, strO0, zzq0Var2, function0, x340Var, i5 | (i6 & 7168) | (i6 & 57344));
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(this, g3lVar, function0, i, (byte) 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public final void f(g3l g3lVar, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        f3l f3lVar;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-628982766);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(g3lVar) : x340Var.i(g3lVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (x340Var.i(this)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                fra fraVar = een.N0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                jw31VarA = ew31.a(new d36(2.0f, true, new um5(false)), fraVar, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var4);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                maa maaVar = (maa) this.a.get();
                f3lVar = g3lVar.a;
                otw.c(maaVar, new w1l(f3lVar.d, f3lVar.e, false, f3lVar.f, false, f3lVar.j), (qim0) null, (ipb1) null, x340Var, 64, 12);
                if (f3lVar.g) {
                    x340Var.i0(-827031823);
                    otw.c((maa) this.b.get(), new u3l(f3lVar.h, true, f3lVar.j), (qim0) null, (ipb1) null, x340Var, 64, 12);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-826721420);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1((byte) 7, i, i2, this, g3lVar, qim0Var3);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if (x340Var.i(this)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i5 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            fra fraVar2 = een.N0;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31VarA = ew31.a(new d36(2.0f, true, new um5(false)), fraVar2, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var4);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            maa maaVar2 = (maa) this.a.get();
            f3lVar = g3lVar.a;
            otw.c(maaVar2, new w1l(f3lVar.d, f3lVar.e, false, f3lVar.f, false, f3lVar.j), (qim0) null, (ipb1) null, x340Var, 64, 12);
            if (f3lVar.g) {
                x340Var.i0(-827031823);
                otw.c((maa) this.b.get(), new u3l(f3lVar.h, true, f3lVar.j), (qim0) null, (ipb1) null, x340Var, 64, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(-826721420);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((byte) 7, i, i2, this, g3lVar, qim0Var3);
        }
    }

    public final void g(g3l g3lVar, String str, zzq0 zzq0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        f3l f3lVar = g3lVar.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1558240086);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(g3lVar) : x340Var.i(g3lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(zzq0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = f3lVar.i;
            qim0 qim0VarX = nim0.a;
            if (z) {
                x340Var.i0(1524075986);
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new i3o(str, (byte) 8);
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) objT);
                boolean z3 = (i2 & 7168) == 2048;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new j3n(function0, (byte) 21);
                    x340Var.s0(objT2);
                }
                qim0VarX = bin.x(qim0VarB, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15);
                x340Var.r(false);
            } else {
                x340Var.i0(1524261490);
                x340Var.r(false);
            }
            f(g3lVar, uyn1.w(f3lVar.a.then(qim0VarX), zzq0Var), x340Var, ((i2 >> 6) & 896) | (i2 & 14) | 8, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xnr(this, g3lVar, str, zzq0Var, function0, i, (byte) 0);
        }
    }

    public final mqw getBehavior() {
        return this.e;
    }

    public final void h(g3l g3lVar, String str, zzq0 zzq0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1420386516);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(g3lVar) : b0kVar3.i(g3lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(zzq0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(this) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new j3n(function0, (byte) 22);
                b0kVar3.s0(objT);
            }
            int i3 = i2;
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            ldx ldxVar = ldx.c;
            gdx gdxVarR = yla.r(b0kVar3);
            qim0 qim0Var = g3lVar.a.a;
            boolean z2 = (i3 & 112) == 32;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new i3o(str, (byte) 9);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, ldxVar, s161.b(qim0Var, true, (iu30) objT2), (max) null, gdxVarR, zzq0Var, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1336412523, new g1o(this, g3lVar, (byte) 12), b0kVar3), b0kVar2, (i3 << 12) & 3670016, 48, 1944);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xnr(this, g3lVar, str, zzq0Var, function0, i, (byte) 1);
        }
    }
}
