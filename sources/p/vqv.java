package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vqv {
    public final String a;
    public final s061 b;
    public final jut c;
    public final ocp d;
    public final ttm0 e;
    public final tjq f;
    public final r6h1 g;
    public final qcp h;

    public vqv(String str, s061 s061Var, jut jutVar, ocp ocpVar, ttm0 ttm0Var, tjq tjqVar, r6h1 r6h1Var, qcp qcpVar) {
        this.a = str;
        this.b = s061Var;
        this.c = jutVar;
        this.d = ocpVar;
        this.e = ttm0Var;
        this.f = tjqVar;
        this.g = r6h1Var;
        this.h = qcpVar;
    }

    public final void a(boolean z, htv htvVar, Function0 function0, Function0 function1, u380 u380Var, c380 c380Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        boolean z2;
        htv htvVar2 = htvVar;
        iu30 iu30Var3 = iu30Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-63879919);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.h(z) ? 4 : 2) | (b0kVar2.g(htvVar2) ? 32 : 16) | (b0kVar2.i(function0) ? 256 : 128) | (b0kVar2.i(function1) ? 2048 : 1024) | (b0kVar2.g(u380Var) ? 16384 : 8192) | (b0kVar2.g(c380Var) ? 131072 : 65536) | (b0kVar2.i(iu30Var) ? 1048576 : 524288) | (b0kVar2.i(iu30Var3) ? 8388608 : 4194304) | (b0kVar2.i(this) ? 67108864 : 33554432);
        if (b0kVar2.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            gfh0 gfh0VarC = t1c.c(een.X, false);
            int iHashCode = Long.hashCode(tgp1.l(b0kVar2));
            xos0 xos0VarM = b0kVar2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z3 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            int i3 = (i2 >> 15) & 7168;
            f(u291.h(u291.f(nim0Var, 1.0f), poo1.x(cev0.A(b0kVar2), b0kVar2).a()), null, null, b0kVar2, i3, 6);
            if (c380Var.isEmpty()) {
                htvVar2 = htvVar;
                iu30Var3 = iu30Var2;
                z2 = true;
                b0kVar2.i0(-1696810313);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1699541475);
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                int iHashCode2 = Long.hashCode(tgp1.l(b0kVar2));
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, nim0Var);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(mbhVarA, b0kVar2, lljVar);
                nko1.H(xos0VarM2, b0kVar2, lljVar2);
                x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar4);
                f(null, zki.b, null, b0kVar2, i3 | 48, 5);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarG = dug.g(cbx.a(b0kVar2).a.c, qim0VarF);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(tgp1.l(b0kVar2));
                xos0 xos0VarM3 = b0kVar2.m();
                qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarG);
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
                iu30Var3 = iu30Var2;
                htvVar2 = htvVar;
                j2i j2iVarR = apo.r(-470710732, new bqv(z, c380Var, this, htvVar, function0, function1, u380Var, iu30Var, iu30Var3), b0kVar2);
                int i4 = ((i2 >> 18) & 896) | 48;
                b0kVar2 = b0kVar2;
                b(i4, 1, j2iVarR, b0kVar2, null);
                b(i4, 1, apo.r(104765277, new cqv(this, htvVar2, iu30Var3, (byte) 0), b0kVar2), b0kVar2, null);
                z2 = true;
                us71.m(b0kVar2, true, true, false);
            }
            b0kVar2.r(z2);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bqv(this, z, htvVar2, function0, function1, u380Var, c380Var, iu30Var, iu30Var3, i);
        }
    }

    public final void b(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1430830434);
        j06 j06Var = x340Var.a;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else if ((i & 6) == 0) {
            qim0Var2 = qim0Var;
            i3 = i | (x340Var.g(qim0Var2) ? 4 : 2);
        } else {
            qim0Var2 = qim0Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            if (i4 != 0) {
                qim0Var2 = qim0Var3;
            }
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.e, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF2 = u291.f(u291.x(0.0f, iro1.x(x340Var), 1, qim0Var3), 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            k4s0.i((i3 >> 3) & 14, j2iVar, x340Var, true, true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var4 = qim0Var2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(this, qim0Var4, j2iVar, i, i2);
        }
    }

    public final void c(de21 de21Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1180999556);
        int i2 = (x340Var.g(de21Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            vq60 vq60Var = jw80.a;
            qim0 qim0VarA = de21.a(de21Var, tsj0.a);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = mia.k;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = f8d1.b(qim0VarA, rih1.a, (PointerInputEventHandler) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            tox toxVar = tox.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            zro1.s(x340Var);
            w0h1.a(toxVar, isl.a, anm1.N("edit_playlist_items_item_drag_n_drop_handle", u291.r(nim0.a, 16.0f)), j, 0L, false, x340Var, tox.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dqv(this, de21Var, i);
        }
    }

    public final void d(de21 de21Var, ftv ftvVar, int i, ftv ftvVar2, boolean z, ru31 ru31Var, boolean z2, boolean z3, boolean z4, eu31 eu31Var, cqs0 cqs0Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1733849852);
        int i3 = i2 | (x340Var.g(de21Var) ? 4 : 2) | (x340Var.g(ftvVar) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.g(ftvVar2) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.g(ru31Var) ? 131072 : 65536) | (x340Var.h(z2) ? 1048576 : 524288) | (x340Var.h(z3) ? 8388608 : 4194304) | (x340Var.h(z4) ? 67108864 : 33554432) | (x340Var.g(eu31Var) ? 536870912 : 268435456);
        if (x340Var.Y(i3 & 1, ((306783379 & i3) == 306783378 && (((x340Var.g(cqs0Var) ? (char) 4 : (char) 2) | (x340Var.i(this) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String id = ftvVar.getId();
            boolean z5 = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z5 || objT == fkj0.X) {
                objT = new uv4(i, (byte) 20);
                x340Var.s0(objT);
            }
            dgo1.c(id, (iu30) objT, apo.r(-2137604034, new eqv(ru31Var, i, ftvVar, ftvVar2, z, z2, z4, eu31Var, z3, cqs0Var, this, de21Var), x340Var), x340Var, 384);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eqv(this, de21Var, ftvVar, i, ftvVar2, z, ru31Var, z2, z3, z4, eu31Var, cqs0Var, i2);
        }
    }

    public final void e(vzq0 vzq0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-857092637);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vzq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            b((i2 & 896) | 48, 0, zki.c, x340Var, uyn1.w(qim0Var, vzq0Var));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(this, vzq0Var, qim0Var, i, (byte) 15);
        }
    }

    public final void f(qim0 qim0Var, vu30 vu30Var, mmr0[] mmr0VarArr, b0k b0kVar, int i, int i2) {
        int i3;
        vu30 vu30Var2;
        mmr0[] mmr0VarArr2;
        vu30 vu30Var3;
        mmr0[] mmr0VarArr3;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1007186946);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if (i5 != 0) {
                    qim0Var = nim0.a;
                }
                vu30Var3 = i6 != 0 ? zki.d : vu30Var;
                Float fValueOf = Float.valueOf(0.0f);
                int i7 = u7h.l;
                Float fValueOf2 = Float.valueOf(1.0f);
                uwr uwrVar = cbx.a;
                mmr0VarArr3 = new mmr0[]{oqn1.n(fValueOf, new u7h(nfb.o())), oqn1.n(fValueOf2, new u7h(cbx.a(x340Var).a.c))};
                i4 = i3 & (-897);
            } else {
                x340Var.b0();
                mmr0VarArr3 = mmr0VarArr;
                i4 = i3 & (-897);
                vu30Var3 = vu30Var;
            }
            x340Var.s();
            qim0 qim0VarE = dug.e(qim0Var, v9c.t((mmr0[]) Arrays.copyOf(mmr0VarArr3, mmr0VarArr3.length), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
            nko1.H(qim0VarE2, x340Var, y580.Y);
            us71.j((i4 >> 3) & 14, vu30Var3, x340Var, true);
            vu30Var2 = vu30Var3;
            mmr0VarArr2 = mmr0VarArr3;
        } else {
            x340Var.b0();
            vu30Var2 = vu30Var;
            mmr0VarArr2 = mmr0VarArr;
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2(this, qim0Var2, vu30Var2, mmr0VarArr2, i, i2, (byte) 7);
        }
    }

    public final void g(boolean z, xtb0 xtb0Var, c380 c380Var, vzq0 vzq0Var, boolean z2, nqm0 nqm0Var, iu30 iu30Var, pe21 pe21Var, cqs0 cqs0Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        nqm0 nqm0Var2;
        int i4;
        b0k b0kVar2;
        qim0 qim0Var2;
        int i5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-955816854);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(xtb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(c380Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.g(vzq0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            nqm0Var2 = nqm0Var;
            i3 |= b0kVar3.g(nqm0Var2) ? 131072 : 65536;
        } else {
            nqm0Var2 = nqm0Var;
        }
        if ((i & 1572864) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= b0kVar3.g(pe21Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= b0kVar3.g(cqs0Var) ? 67108864 : 33554432;
        }
        int i6 = i3 | 805306368;
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar3.i(this) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (b0kVar3.Y(i6 & 1, ((i6 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = this.e.c(false);
                b0kVar3.s0(objT);
            }
            zau0 zau0Var = (zau0) objT;
            tob1 tob1VarB = qxy0.B(zau0Var, b0kVar3);
            boolean zI = b0kVar3.i(this) | b0kVar3.i(zau0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == obj) {
                objT2 = new nnu(this, zau0Var, (lnm) null, (byte) 13);
                b0kVar3.s0(objT2);
            }
            qxd0.t(zau0Var, b0kVar3, (vu30) objT2);
            boolean zI2 = b0kVar3.i(this) | b0kVar3.i(zau0Var);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == obj) {
                objT3 = new wrs(this, zau0Var, (byte) 27);
                b0kVar3.s0(objT3);
            }
            qxd0.i(zau0Var, (iu30) objT3, b0kVar3);
            r091 r091Var = (r091) tob1VarB.getValue();
            ven0 ven0VarV = xto.v(c380Var, b0kVar3);
            ven0 ven0VarV2 = xto.v(iu30Var, b0kVar3);
            int i7 = i6 & 29360128;
            boolean zG = (i7 == 8388608) | b0kVar3.g(r091Var);
            Object objT4 = b0kVar3.T();
            if (zG || objT4 == obj) {
                objT4 = this.d.a(r091Var, new m3n(this, ven0VarV2, ven0VarV, (byte) 21), new dqu(ven0VarV2, (byte) 4), pe21Var);
                b0kVar3.s0(objT4);
            }
            ru31 ru31Var = (ru31) objT4;
            ven0 ven0VarJ = xto.j(this.b.b, b0kVar3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(u291.d(qim0Var3, 1.0f), k1o1.q(b0kVar3), (g6o0) null);
            boolean zG2 = ((i6 & 896) == 256) | b0kVar3.g(ven0VarJ) | (i7 == 8388608) | b0kVar3.i(this) | ((458752 & i6) == 131072) | ((i6 & 14) == 4) | b0kVar3.i(ru31Var) | ((57344 & i6) == 16384) | ((234881024 & i6) == 67108864);
            Object objT5 = b0kVar3.T();
            if (zG2 || objT5 == obj) {
                nqm0 nqm0Var3 = nqm0Var2;
                i5 = i6;
                iqv iqvVar = new iqv(c380Var, pe21Var, this, ven0VarJ, nqm0Var3, z, ru31Var, z2, cqs0Var);
                b0kVar3.s0(iqvVar);
                objT5 = iqvVar;
            } else {
                i5 = i6;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarL, xtb0Var, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT5, b0kVar2, (i5 & 112) | ((i5 >> 3) & 896), 504);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jqv(this, z, xtb0Var, c380Var, vzq0Var, z2, nqm0Var, iu30Var, pe21Var, cqs0Var, qim0Var2, i, i2);
        }
    }

    public final void h(ftv ftvVar, int i, ftv ftvVar2, boolean z, ru31 ru31Var, boolean z2, boolean z3, boolean z4, cqs0 cqs0Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(384682554);
        int i3 = i2 | (x340Var.g(ftvVar) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.g(ftvVar2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.g(ru31Var) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536) | (x340Var.h(z3) ? 1048576 : 524288) | (x340Var.h(z4) ? 8388608 : 4194304) | (x340Var.g(cqs0Var) ? 67108864 : 33554432);
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            String id = ftvVar.getId();
            boolean z5 = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z5 || objT == fkj0.X) {
                objT = new uv4(i, (byte) 21);
                x340Var.s0(objT);
            }
            dgo1.c(id, (iu30) objT, apo.r(1583503734, new kqv(ru31Var, i, ftvVar, ftvVar2, z, z2, z4, z3, cqs0Var), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gqv(this, ftvVar, i, ftvVar2, z, ru31Var, z2, z3, z4, cqs0Var, i2);
        }
    }

    public final void i(htv htvVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        List listM;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(445499875);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(htvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= b0kVar3.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            s061 s061Var = this.b;
            ven0 ven0VarJ = xto.j(s061Var.b, b0kVar3);
            ven0 ven0VarJ2 = xto.j(s061Var.d, b0kVar3);
            boolean z = !((Set) ven0VarJ.getValue()).isEmpty();
            Object[] objArr = new Object[0];
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xzu.O0;
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, b0kVar3, 48);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = b0kVar3.h(z) | b0kVar3.i(this);
            Object objT2 = b0kVar3.T();
            if (zH || objT2 == m4cVar) {
                objT2 = new ett(z, this, (lnm) null);
                b0kVar3.s0(objT2);
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT2);
            boolean zG = b0kVar3.g(ven0Var) | b0kVar3.i(this);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new f2t(this, ven0Var, (byte) 22);
                b0kVar3.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            bek0 bek0VarT = mqn1.t(htvVar);
            if (((Boolean) ven0VarJ2.getValue()).booleanValue() && ((Boolean) ven0Var.getValue()).booleanValue()) {
                listM = p7h.M(ctb.a, jtb.a, itb.a);
            } else if (((Boolean) ven0VarJ2.getValue()).booleanValue()) {
                listM = p7h.M(dtb.a, etb.a, ftb.a);
            } else {
                ktb ktbVar = gtb.a;
                listM = bek0VarT != null ? p7h.M(ktbVar, new htb(bek0VarT)) : k4p1.x(ktbVar);
            }
            c380 c380VarA = mqo1.A(listM);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(b0kVar3));
            xos0 xos0VarM = b0kVar3.m();
            qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var2);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            u85 u85VarE = cev0.E(b0kVar3);
            j2i j2iVarR = apo.r(2033895068, new sxj(this, htvVar, iu30Var2, ven0VarJ, ven0VarJ2, (byte) 21), b0kVar3);
            j2i j2iVarR2 = apo.r(-1612844771, new q3(this, z, htvVar, function0, c380VarA, ven0Var, iu30Var, ven0VarJ), b0kVar3);
            j2i j2iVarR3 = apo.r(1387211362, new jb1(this, htvVar, function0, iu30Var, ven0VarJ2, (byte) 14), b0kVar3);
            b0kVar2 = b0kVar3;
            irn1.u((qim0) null, j2iVarR, j2iVarR2, u85VarE, j2iVarR3, b0kVar2, 25008, 1);
            z5p1.e(0, b0kVar2, (qim0) null, htvVar.g().f() || htvVar.k(), htvVar.g().e());
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, htvVar, iu30Var, qim0Var2, (byte) 6);
        }
    }

    public final void j(htv htvVar, vzq0 vzq0Var, Function0 function0, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        Object obj;
        int i3;
        m4c m4cVar;
        int i4;
        bw91 bw91Var;
        iu30 iu30Var2;
        xtb0 xtb0Var;
        m4c m4cVar2;
        pe21 pe21Var;
        vzq0 vzq0Var2;
        int i5;
        ven0 ven0Var;
        bw91 bw91Var2;
        vqv vqvVar;
        pe21 pe21VarQ;
        int i6;
        bw91 bw91Var3;
        vqv vqvVar2 = this;
        iu30 iu30Var3 = iu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-591058520);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(htvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(vqvVar2) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            m4c m4cVar3 = fkj0.X;
            if (objT == m4cVar3) {
                obj = objT;
                bw91 bw91VarP = xto.p();
                bw91VarP.addAll(htvVar.e());
                x340Var.s0(bw91VarP);
                obj = bw91VarP;
            }
            obj = objT;
            bw91 bw91Var4 = (bw91) obj;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar3) {
                objT2 = xto.t((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar3) {
                objT3 = xto.t(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            c380 c380VarE = htvVar.e();
            Boolean boolValueOf = Boolean.valueOf(htvVar.g().e());
            int i7 = i2 & 14;
            int i8 = i2 & 57344;
            boolean z2 = (i7 == 4) | (i8 == 16384);
            Object objT4 = x340Var.T();
            if (z2 || objT4 == m4cVar3) {
                i3 = i7;
                m4cVar = m4cVar3;
                i4 = 16384;
                rzu rzuVar = new rzu(htvVar, bw91Var4, iu30Var3, ven0Var3, (lnm) null, (byte) 4);
                bw91Var = bw91Var4;
                x340Var.s0(rzuVar);
                objT4 = rzuVar;
            } else {
                m4cVar = m4cVar3;
                i3 = i7;
                i4 = 16384;
                bw91Var = bw91Var4;
            }
            qxd0.s(c380VarE, boolValueOf, (vu30) objT4, x340Var);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            if (htvVar.c() instanceof hbr) {
                x340Var.i0(1143559096);
                String strA = htvVar.c().a();
                boolean zG = x340Var.g(strA) | (i3 == 4) | x340Var.g(xtb0VarA) | (i8 == i4);
                Object objT5 = x340Var.T();
                m4cVar2 = m4cVar;
                if (zG || objT5 == m4cVar2) {
                    lqv lqvVar = new lqv(htvVar, xtb0VarA, iu30Var, strA, (lnm) null, (byte) 0);
                    xtb0Var = xtb0VarA;
                    iu30Var2 = iu30Var;
                    x340Var.s0(lqvVar);
                    objT5 = lqvVar;
                } else {
                    xtb0Var = xtb0VarA;
                    iu30Var2 = iu30Var;
                }
                qxd0.t(strA, x340Var, (vu30) objT5);
                x340Var.r(false);
            } else {
                iu30Var2 = iu30Var;
                xtb0Var = xtb0VarA;
                m4cVar2 = m4cVar;
                x340Var.i0(1143837786);
                x340Var.r(false);
            }
            boolean zG2 = x340Var.g(xtb0Var) | (i8 == i4);
            Object objT6 = x340Var.T();
            if (zG2 || objT6 == m4cVar2) {
                pe21Var = null;
                objT6 = new mqv(xtb0Var, iu30Var2, (lnm) null, (byte) 0);
                x340Var.s0(objT6);
            } else {
                pe21Var = null;
            }
            qxd0.t(xtb0Var, x340Var, (vu30) objT6);
            if (htvVar.j()) {
                x340Var.i0(1144384533);
                ss50 ss50Var = (ss50) x340Var.k(t4k.l);
                boolean zI = x340Var.i(ss50Var) | x340Var.i(vqvVar2);
                Object objT7 = x340Var.T();
                if (zI || objT7 == m4cVar2) {
                    i6 = i2;
                    bw91 bw91Var5 = bw91Var;
                    ggh gghVar = new ggh(ss50Var, vqvVar2, bw91Var5, ven0Var2, (byte) 24);
                    ss50Var = ss50Var;
                    vqvVar2 = vqvVar2;
                    bw91Var3 = bw91Var5;
                    ven0Var = ven0Var2;
                    x340Var.s0(gghVar);
                    objT7 = gghVar;
                } else {
                    i6 = i2;
                    ven0Var = ven0Var2;
                    bw91Var3 = bw91Var;
                }
                iu30 iu30Var4 = (iu30) objT7;
                boolean zI2 = x340Var.i(vqvVar2) | x340Var.i(ss50Var);
                Object objT8 = x340Var.T();
                if (zI2 || objT8 == m4cVar2) {
                    sv8 sv8Var = new sv8(vqvVar2, bw91Var3, ss50Var, pe21Var, (byte) 2);
                    x340Var.s0(sv8Var);
                    objT8 = sv8Var;
                }
                zu30 zu30Var = (zu30) objT8;
                boolean zI3 = (i3 == 4) | ((i6 & 896) == 256) | x340Var.i(vqvVar2) | (i8 == i4) | x340Var.i(ss50Var);
                Object objT9 = x340Var.T();
                if (zI3 || objT9 == m4cVar2) {
                    i5 = i6;
                    vqv vqvVar3 = vqvVar2;
                    bw91 bw91Var6 = bw91Var3;
                    oqv oqvVar = new oqv(bw91Var6, htvVar, function0, vqvVar3, iu30Var2, ss50Var, ven0Var, (lnm) null);
                    bw91Var2 = bw91Var6;
                    vqvVar = vqvVar3;
                    x340Var.s0(oqvVar);
                    objT9 = oqvVar;
                } else {
                    i5 = i6;
                    vqvVar = vqvVar2;
                    bw91Var2 = bw91Var3;
                }
                vzq0Var2 = vzq0Var;
                pe21VarQ = t8p1.q(xtb0Var, iu30Var4, zu30Var, (xu30) objT9, vzq0Var2, x340Var, (i5 << 9) & 57344);
                x340Var.r(false);
            } else {
                vzq0Var2 = vzq0Var;
                i5 = i2;
                pe21 pe21Var2 = pe21Var;
                ven0Var = ven0Var2;
                bw91Var2 = bw91Var;
                vqvVar = vqvVar2;
                x340Var.i0(1146856132);
                x340Var.r(false);
                pe21VarQ = pe21Var2;
            }
            Object objT10 = x340Var.T();
            if (objT10 == m4cVar2) {
                objT10 = xto.l(new v7v(bw91Var2, (byte) 8));
                x340Var.s0(objT10);
            }
            tob1 tob1Var = (tob1) objT10;
            if (((c380) tob1Var.getValue()).isEmpty()) {
                x340Var.i0(1147189041);
                vqvVar.e(vzq0Var2, u291.d(nim0.a, 1.0f), x340Var, ((i5 >> 3) & 14) | 48 | ((i5 >> 9) & 896));
                x340Var.r(false);
                iu30Var3 = iu30Var;
                vqvVar2 = vqvVar;
            } else {
                x340Var.i0(1147292953);
                int i9 = i5 << 6;
                xtb0 xtb0Var2 = xtb0Var;
                vqv vqvVar4 = vqvVar;
                vqvVar4.g(htvVar.g().d(), xtb0Var2, (c380) tob1Var.getValue(), vzq0Var2, z, (nqm0) ven0Var.getValue(), iu30Var, pe21VarQ, mqo1.B(htvVar.f()), null, x340Var, (i9 & 7168) | ((i5 << 3) & 57344) | (i9 & 3670016), (i5 >> 15) & 14);
                vqvVar2 = vqvVar4;
                iu30Var3 = iu30Var;
                x340Var.r(false);
            }
            int i10 = i5 >> 9;
            int i11 = i10 & 112;
            vqvVar2.o(htvVar.h(), iu30Var3, x340Var, i10 & 1008);
            boolean zC = htvVar.g().c();
            tjq tjqVar = vqvVar2.f;
            tjqVar.c(zC, iu30Var3, x340Var, i11);
            tjqVar.a(htvVar.g().b(), iu30Var3, x340Var, i11);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(vqvVar2, htvVar, vzq0Var, function0, z, iu30Var3, i);
        }
    }

    public final void k(htv htvVar, iu30 iu30Var, b0k b0kVar, int i) {
        jax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-89407694);
        int i2 = i | (x340Var.g(htvVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (htvVar.b()) {
                x340Var.i0(-21441690);
                x340Var.r(false);
                haxVar = jax.a;
            } else if (htvVar.i()) {
                x340Var.i0(-21438522);
                haxVar = new hax(cwl1.o0(x340Var, 2131955241));
                x340Var.r(false);
            } else {
                x340Var.i0(-21433397);
                haxVar = new hax(cwl1.o0(x340Var, 2131955240));
                x340Var.r(false);
            }
            gdx gdxVarS = yla.s(x340Var);
            ldx ldxVar = ldx.c;
            qim0 qim0VarN = anm1.N("edit_playlist_items_save_button", nim0.a);
            boolean zI = x340Var.i(this) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new pqv(this, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            foo1.c(smo1.C((Function0) objT), ldxVar, qim0VarN, haxVar, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, zki.a, x340Var, 432, 48, 1992);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cqv(this, htvVar, iu30Var, i, (byte) 1);
        }
    }

    public final void l(int i, htv htvVar, boolean z, iu30 iu30Var, b0k b0kVar, int i2) {
        j2i j2iVarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1243053003);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2) | (x340Var.g(htvVar) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(this) ? 16384 : 8192);
        if (!x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-583776792);
            bzn1.e((qim0) null, apo.r(1500226586, new vx1(i, (byte) 13), x340Var), false, (vu30) null, (sgr0) null, (ngr0) null, (ygr0) null, (Function0) null, x340Var, 48, 253);
            x340Var.r(false);
        } else {
            x340Var.i0(-583385200);
            if (htvVar.d().g() || htvVar.d().b()) {
                x340Var.i0(-583244398);
                j2iVarR = apo.r(-1117844724, new cqv(this, htvVar, iu30Var, (byte) 2), x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-583150065);
                x340Var.r(false);
                j2iVarR = null;
            }
            bzn1.e((qim0) null, j2iVarR, false, apo.r(-1311126605, new cqv(this, htvVar, iu30Var, (byte) 3), x340Var), (sgr0) null, (ngr0) null, (ygr0) null, (Function0) null, x340Var, 3072, 245);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(this, i, htvVar, z, iu30Var, i2);
        }
    }

    public final void m(htv htvVar, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-884153723);
        int i2 = i | (x340Var.g(htvVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(u291.h(nim0Var, 32.0f), cbx.a(x340Var).a.b.a(), er31.a(50));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qtx qtxVar = qtx.c;
            boolean zG = htvVar.d().g();
            qim0 qim0VarN = anm1.N("edit_playlist_items_undo_button", nim0Var);
            String strO0 = cwl1.o0(x340Var, 2131955243);
            String strO1 = cwl1.o0(x340Var, 2131955244);
            int i3 = i2 & 112;
            boolean zI = x340Var.i(this) | (i3 == 32);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new pqv(this, iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            byte b = qtx.d;
            int i4 = (i2 << 15) & 29360128;
            n(qtxVar, zG, (Function0) objT, strO1, strO0, qim0VarN, false, x340Var, b | 196608 | i4, 64);
            boolean zB = htvVar.d().b();
            qim0 qim0VarN2 = anm1.N("edit_playlist_items_redo_button", nim0Var);
            String strO2 = cwl1.o0(x340Var, 2131955236);
            String strO3 = cwl1.o0(x340Var, 2131955237);
            boolean zI2 = x340Var.i(this) | (i3 == 32);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new pqv(this, iu30Var, (byte) 2);
                x340Var.s0(objT2);
            }
            n(qtxVar, zB, (Function0) objT2, strO3, strO2, qim0VarN2, true, x340Var, b | 1769472 | i4, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cqv(this, htvVar, iu30Var, i, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x0104  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public final void n(hux huxVar, boolean z, Function0 function0, String str, String str2, qim0 qim0Var, boolean z2, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z3;
        boolean z4;
        b0k b0kVar2;
        boolean z5;
        h311 h311VarV;
        ldx ldxVar;
        gdx gdxVarA;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1586558639);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            qim0Var2 = qim0Var;
            i3 |= b0kVar3.g(qim0Var2) ? 131072 : 65536;
        } else {
            qim0Var2 = qim0Var;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                z3 = z2;
                i3 |= b0kVar3.h(z3) ? 1048576 : 524288;
            }
            if ((599187 & i3) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i3 & 1, z4)) {
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                ldxVar = ldx.c;
                gdxVarA = yla.s(b0kVar3).a();
                if (!ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(str2), function0);
                if (z) {
                    haxVar = jax.a;
                } else {
                    haxVar = new hax(str);
                }
                b0kVar2 = b0kVar3;
                wro1.h(gbxVar, ldxVar, qim0Var2, haxVar, gdxVarA, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-2056698982, new yvb(huxVar, str2, z5), b0kVar3), b0kVar2, ((i3 >> 9) & 896) | 48, 6, 968);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z5 = z3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new qqv(this, huxVar, z, function0, str, str2, qim0Var, z5, i, i2);
            }
        }
        i3 |= 1572864;
        z3 = z2;
        if ((599187 & i3) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b0kVar3.Y(i3 & 1, z4)) {
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            ldxVar = ldx.c;
            gdxVarA = yla.s(b0kVar3).a();
            if (!ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar2 = new gbx(new y50(str2), function0);
            if (z) {
                haxVar = jax.a;
            } else {
                haxVar = new hax(str);
            }
            b0kVar2 = b0kVar3;
            wro1.h(gbxVar2, ldxVar, qim0Var2, haxVar, gdxVarA, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(-2056698982, new yvb(huxVar, str2, z5), b0kVar3), b0kVar2, ((i3 >> 9) & 896) | 48, 6, 968);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z5 = z3;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qqv(this, huxVar, z, function0, str, str2, qim0Var, z5, i, i2);
        }
    }

    public final void o(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1070904476);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-297986151);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = this.h.a(new hws(iu30Var, (byte) 16));
                x340Var.s0(objT);
            }
            glh1 glh1Var = (glh1) objT;
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new rqv(this, (byte) 1);
                x340Var.s0(objT2);
            }
            dgo1.c("unsaved-changes-dialog", (iu30) objT2, apo.r(-2075451205, new sqv(glh1Var, (byte) 0), x340Var), x340Var, 390);
            x340Var.r(false);
        } else {
            x340Var.i0(-297212546);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, z, iu30Var, i, (byte) 12);
        }
    }

    public final void p(List list, String str, String str2, Set set, List list2, iu30 iu30Var) {
        int i;
        Object next;
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (u890.j(((ftv) it.next()).getId(), str)) {
                break;
            } else {
                i3++;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (u890.j(((ftv) it2.next()).getId(), str)) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i3 < 0 || i < 0) {
            return;
        }
        this.c.i(i, str2);
        Iterator it3 = o7h.k0(list, i3 + 1).iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (set.contains(((ftv) next).getId()));
        ftv ftvVar = (ftv) next;
        iu30Var.invoke(new nsv(ftvVar != null ? ftvVar.getId() : null, set));
    }
}
