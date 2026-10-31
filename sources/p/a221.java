package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a221 implements xpw {
    public final iu30 a;
    public final yqg b;
    public final rey0 c = new rey0(new lw11(this, (byte) 4));
    public final ia00 d = n3o1.q(this).a(ok11.U0, ok11.V0);
    public final psw e;

    public a221(yqg yqgVar, iu30 iu30Var) {
        this.a = iu30Var;
        this.b = yqgVar;
        j2i j2iVar = new j2i(-422244052, new dr01(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final void e(m0u m0uVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1700030582);
        int i2 = (x340Var.i(m0uVar) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int iC = l1d.C(m0uVar.d.b);
            if (iC == 1 || iC == 2) {
                x340Var.i0(1641823233);
                h(cwl1.o0(x340Var, 2131961105), x340Var, i2 & 112);
                x340Var.r(false);
            } else if (iC == 3) {
                x340Var.i0(1641827109);
                h(cwl1.o0(x340Var, 2131961104), x340Var, i2 & 112);
                x340Var.r(false);
            } else if (iC != 5) {
                x340Var.i0(1641836952);
                if (m0uVar.f) {
                    x340Var.i0(-642567860);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-642625520);
                    f(m0uVar, x340Var, i2 & 126);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(1641830976);
                h(cwl1.o0(x340Var, 2131961103), x340Var, i2 & 112);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y121(this, m0uVar, i, (byte) 0);
        }
    }

    public final void f(m0u m0uVar, b0k b0kVar, int i) {
        String strU;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(485995232);
        int i2 = (x340Var.i(m0uVar) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            long jB = this.b.b() - m0uVar.g;
            long j = jB / 60000;
            long j2 = jB / 3600000;
            long j3 = jB / 86400000;
            if (j < 60) {
                x340Var.i0(-668512681);
                strU = cwl1.n0(2131961074, new Object[]{Long.valueOf(j)}, x340Var);
                x340Var.r(false);
            } else if (j2 < 24) {
                x340Var.i0(-668509098);
                strU = cwl1.n0(2131961073, new Object[]{Long.valueOf(j2)}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-668506103);
                strU = cwl1.U(2131820882, (int) j3, new Object[]{Long.valueOf(j3)}, x340Var);
                x340Var.r(false);
            }
            h(strU, x340Var, i3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y121(this, m0uVar, i, (byte) 1);
        }
    }

    public final void g(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-577194772);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            h(cwl1.o0(x340Var, 2131961089), x340Var, (i2 << 3) & 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ps11(this, i, (byte) 7);
        }
    }

    public final mqw getBehavior() {
        return this.c;
    }

    public final void h(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1681111938);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, i2 & 14, 0, 1722);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(this, str, i, (byte) 9);
        }
    }

    public final void i(m0u m0uVar, iu30 iu30Var, px31 px31Var, uvx uvxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        String strK;
        jax haxVar;
        int i3;
        int i4;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(63801468);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(m0uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(px31Var) : b0kVar3.i(px31Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? b0kVar3.g(uvxVar) : b0kVar3.i(uvxVar) ? 2048 : 1024;
        }
        int i5 = i2 | 24576;
        if ((196608 & i) == 0) {
            i5 |= b0kVar3.i(this) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i5 & 1, (74899 & i5) != 74898)) {
            boolean z = px31Var instanceof nx31;
            kx31 kx31Var = kx31.a;
            mx31 mx31Var = mx31.a;
            lx31 lx31Var = lx31.a;
            if (z) {
                b0kVar3.i0(-1960696528);
                nx31 nx31Var = (nx31) px31Var;
                if (nx31Var.equals(lx31Var)) {
                    i3 = 1074515277;
                    i4 = 2131961087;
                } else {
                    if (!nx31Var.equals(mx31Var) && !nx31Var.equals(kx31Var)) {
                        throw p3d1.k(b0kVar3, 1074513371, false);
                    }
                    i3 = 1074520526;
                    i4 = 2131961088;
                }
                strK = x0d.k(b0kVar3, i3, i4, b0kVar3, false);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1960638062);
                b0kVar3.r(false);
                strK = "";
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = pqo.h(qim0Var3, px31Var instanceof lx31);
            boolean zG = ((i5 & 896) == 256 || ((i5 & 512) != 0 && b0kVar3.i(px31Var))) | b0kVar3.g(strK);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new nt01(px31Var, strK, (byte) 14);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarH, false, (iu30) objT);
            if (u890.j(px31Var, kx31Var) || u890.j(px31Var, mx31Var)) {
                haxVar = new hax(strK);
            } else {
                if (!u890.j(px31Var, lx31Var) && !u890.j(px31Var, ox31.a)) {
                    eg.o();
                    return;
                }
                haxVar = jax.a;
            }
            boolean z2 = (i5 & 112) == 32;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new dv11(iu30Var, (byte) 9);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, uvxVar, haxVar, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT2), (gbx) null, (xu30) null, apo.r(1762987173, new z121(this, m0uVar, (byte) 0), b0kVar3), (xu30) null, apo.r(-1052237756, new hho0(px31Var, this, m0uVar, (byte) 26), b0kVar3), apo.r(-606700445, new rt11(this, m0uVar, uvxVar), b0kVar3), (xu30) null, (xu30) null, apo.r(729911488, new z121(this, m0uVar, (byte) 1), b0kVar3), b0kVar2, 805306432 | ((i5 >> 6) & 112), 197040, 26040);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((Object) this, (Object) m0uVar, iu30Var, (Object) px31Var, (Object) uvxVar, qim0Var2, i, (byte) 24);
        }
    }
}
