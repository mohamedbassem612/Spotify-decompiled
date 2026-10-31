package p;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ys11 implements tyq, tmh0 {
    public final maa N0;
    public final maa O0;
    public final maa P0;
    public final ds11 Q0;
    public final ds11 R0;
    public final ds11 S0;
    public final ds11 T0;
    public final dnw0 U0;
    public final maa V0;
    public final ct11 W0;
    public final nu11 X;
    public final ppc1 X0;
    public final yt11 Y;
    public final cv11 Y0;
    public final maa Z;
    public final rru Z0;
    public final yqg a;
    public final au11 a1;
    public final d0r b;
    public final o8n b1;
    public final gw70 c;
    public final boolean c1;
    public final float d;
    public final o27 d1;
    public final float e;
    public final rzs0 e1;
    public final boolean f;
    public final w5w0 f1;
    public final gye1 g;
    public final o3r g1;
    public final sa30 h;
    public final n5r h1;
    public final boolean i;
    public final ia00 i1;
    public final o3r j1;
    public final h211 k1;
    public final iik0 l1;
    public final ruh0 m1;
    public final js20 n1;
    public final psw o1;
    public final int p1;
    public final int q1;
    public final boolean t;

    public ys11(yqg yqgVar, d0r d0rVar, gw70 gw70Var, int i, float f, float f2, boolean z, gye1 gye1Var, sa30 sa30Var, boolean z2, boolean z3, nu11 nu11Var, int i2, yt11 yt11Var, maa maaVar, maa maaVar2, maa maaVar3, maa maaVar4, ds11 ds11Var, ds11 ds11Var2, ds11 ds11Var3, ds11 ds11Var4, dnw0 dnw0Var, maa maaVar5, ct11 ct11Var, int i3, ppc1 ppc1Var, o3r o3rVar, o3r o3rVar2, o3r o3rVar3, o3r o3rVar4, o3r o3rVar5, o3r o3rVar6, cv11 cv11Var, sb2 sb2Var, rru rruVar, boolean z4, au11 au11Var, o8n o8nVar, o3r o3rVar7, boolean z5, o27 o27Var, ruh0 ruh0Var, rzs0 rzs0Var, w5w0 w5w0Var) {
        o3r o3rVarO;
        f4r data;
        f4r data2;
        f4r data3;
        f4r data4;
        f4r data5;
        f4r data6;
        f4r data7;
        this.a = yqgVar;
        this.b = d0rVar;
        this.c = gw70Var;
        this.p1 = i;
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = gye1Var;
        this.h = sa30Var;
        this.i = z2;
        this.t = z3;
        this.X = nu11Var;
        this.Y = yt11Var;
        this.Z = maaVar;
        this.N0 = maaVar2;
        this.O0 = maaVar3;
        this.P0 = maaVar4;
        this.Q0 = ds11Var;
        this.R0 = ds11Var2;
        this.S0 = ds11Var3;
        this.T0 = ds11Var4;
        this.U0 = dnw0Var;
        this.V0 = maaVar5;
        this.W0 = ct11Var;
        this.q1 = i3;
        this.X0 = ppc1Var;
        this.Y0 = cv11Var;
        this.Z0 = rruVar;
        this.a1 = au11Var;
        this.b1 = o8nVar;
        this.c1 = z5;
        this.d1 = o27Var;
        this.e1 = rzs0Var;
        this.f1 = w5w0Var;
        o3r o3rVarO2 = !sb2Var.equals(rb2.a) ? w3p1.o(new l4r(pwc0.r, 2, ss11.Z, new j4r(ss11.g), ss11.N0), ss11.h) : null;
        o3r o3rVarO3 = ct11Var instanceof bt11 ? w3p1.o(new l4r(hjx0.a, 2, ss11.O0, new j4r(ss11.X), ss11.P0), ss11.Y) : null;
        this.g1 = o3rVarO3;
        o3r o3rVarO4 = !rruVar.equals(qru.a) ? w3p1.o(new l4r(b2v.a, 2, ss11.Q0, new j4r(ss11.i), ss11.R0), ss11.t) : null;
        this.h1 = k4p1.E(i2);
        this.i1 = n3o1.q(this).a(ok11.Q0, new g001(this, (byte) 23));
        if (z4) {
            o3r o3rVar8 = js11.a;
            o3rVarO = w3p1.o(new l4r(pwc0.x, 2, br11.N0, new j4r(br11.P0), br11.O0), br11.Q0);
        } else {
            o3rVarO = null;
        }
        o3r o3rVarA = js11.a(o3rVar, null);
        o3r o3rVarA2 = js11.a(o3rVar2, null);
        Boolean bool = Boolean.TRUE;
        o3r o3rVarA3 = js11.a(o3rVar4, bool);
        o3r o3rVarA4 = js11.a(o3rVar5, bool);
        o3r o3rVarA5 = js11.a(o3rVarO3, null);
        o3r o3rVarA6 = js11.a(o3rVarO4, null);
        o3r o3rVarA7 = js11.a(o3rVarO2, null);
        Boolean bool2 = Boolean.FALSE;
        o3r o3rVarN = q3p1.n(p7h.M(new o3r[]{o3rVarA, o3rVarA2, o3rVarA3, o3rVarA4, o3rVarA5, o3rVarA6, o3rVarA7, js11.a(o3rVar3, bool2), js11.a(o3rVar6, r6g1.a), js11.a(o3rVar7, null), js11.a(o3rVarO, bool2)}), new qrk(1, (byte) 9));
        this.j1 = o3rVarN;
        this.k1 = h211.a1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o3rVarN);
        if (dnw0Var != null) {
            for (tyq tyqVar : dnw0Var.a()) {
                tyq tyqVar2 = tyqVar instanceof tyq ? tyqVar : null;
                if (tyqVar2 != null && (data7 = tyqVar2.getData()) != null) {
                    arrayList.add(data7);
                }
            }
        }
        tyq tyqVar3 = this.V0;
        tyq tyqVar4 = tyqVar3 instanceof tyq ? tyqVar3 : null;
        if (tyqVar4 != null && (data6 = tyqVar4.getData()) != null) {
            arrayList.add(data6);
        }
        tyq tyqVar5 = this.Z;
        tyq tyqVar6 = tyqVar5 instanceof tyq ? tyqVar5 : null;
        if (tyqVar6 != null && (data5 = tyqVar6.getData()) != null) {
            arrayList.add(data5);
        }
        tyq tyqVar7 = this.N0;
        tyq tyqVar8 = tyqVar7 instanceof tyq ? tyqVar7 : null;
        if (tyqVar8 != null && (data4 = tyqVar8.getData()) != null) {
            arrayList.add(data4);
        }
        tyq tyqVar9 = this.O0;
        tyq tyqVar10 = tyqVar9 instanceof tyq ? tyqVar9 : null;
        if (tyqVar10 != null && (data3 = tyqVar10.getData()) != null) {
            arrayList.add(data3);
        }
        tyq tyqVar11 = this.P0;
        tyq tyqVar12 = tyqVar11 instanceof tyq ? tyqVar11 : null;
        if (tyqVar12 != null && (data2 = tyqVar12.getData()) != null) {
            arrayList.add(data2);
        }
        Iterator it = f46.i0(new ds11[]{this.Q0, this.R0, this.S0, this.T0}).iterator();
        while (it.hasNext()) {
            tyq tyqVar13 = ((ds11) it.next()).a;
            tyq tyqVar14 = tyqVar13 instanceof tyq ? tyqVar13 : null;
            if (tyqVar14 != null && (data = tyqVar14.getData()) != null) {
                arrayList.add(data);
            }
        }
        this.l1 = new iik0(arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList), (byte) 15);
        this.m1 = ruh0Var == null ? new e7x() : ruh0Var;
        this.n1 = d1o1.o(new ak01(this, (byte) 23), new ps11(this, (byte) 1), this.b1, new wq01(this.Y, true, this.X, (byte) 2));
        j2i j2iVar = new j2i(-912375448, new dr01(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.o1 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i1;
    }

    public final jsw c() {
        return this.o1;
    }

    public final d0r e() {
        return this.b;
    }

    public final ruh0 f() {
        return this.m1;
    }

    public final void g(iix0 iix0Var, boolean z, b0k b0kVar, int i) {
        int i2;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(835991759);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iix0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            iix0 hix0Var = iix0Var == null ? new hix0(false, 0L) : iix0Var;
            int i3 = this.t ? 2 : 1;
            if (z) {
                x340Var.i0(229210550);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.b;
            } else {
                x340Var.i0(229211635);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.a;
            }
            x340Var.r(false);
            mue1.c(hix0Var, i3, j, (qim0) null, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, iix0Var, z, i, (byte) 28);
        }
    }

    public final mqw getBehavior() {
        return this.n1;
    }

    public final f4r getData() {
        return this.l1;
    }

    public final void h(maa maaVar, uv11 uv11Var, b0k b0kVar, int i) {
        maa maaVar2;
        uv11 uv11Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1462719030);
        int i2 = (x340Var.i(maaVar) ? 4 : 2) | i | (x340Var.g(uv11Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            maaVar2 = maaVar;
            uv11Var2 = uv11Var;
            x340Var.b0();
        } else if (maaVar == null) {
            x340Var.i0(875679047);
            x340Var.r(false);
            maaVar2 = maaVar;
            uv11Var2 = uv11Var;
        } else {
            x340Var.i0(875679048);
            maaVar2 = maaVar;
            uv11Var2 = uv11Var;
            otw.c(maaVar2, uv11Var2, (qim0) null, (ipb1) null, x340Var, i2 & 112, 12);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vs11(this, maaVar2, uv11Var2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:152:0x036b  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e1  */
    public final void i(jmb1 jmb1Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        boolean z;
        boolean z2;
        maa maaVar;
        zzq0 zzq0Var;
        Collection collection;
        boolean z3;
        int i2;
        boolean z4;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2049659463);
        int i3 = i | (x340Var2.i(jmb1Var) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(this) ? 256 : 128);
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            bv11 bv11Var = jmb1Var.b;
            boolean zG = x340Var2.g(bv11Var.c);
            yqg yqgVar = this.a;
            boolean zG2 = zG | x340Var2.g(yqgVar);
            Object objT = x340Var2.T();
            if (zG2 || objT == obj) {
                objT = this.h1.c(bv11Var.c, yqgVar, context);
                x340Var2.s0(objT);
            }
            Collection collectionK = xzo1.k(jmb1Var, (String) objT, yqgVar, x340Var2);
            c380 c380VarN = tgp1.n(jmb1Var, yqgVar, x340Var2);
            ktl ktlVar = bv11Var.y;
            boolean zE = x340Var2.e(ktlVar == null ? -1 : ktlVar.ordinal());
            Object objT2 = x340Var2.T();
            ktl ktlVar2 = ktl.b;
            if (zE || objT2 == obj) {
                dye1 dye1Var = dye1.a;
                gye1 gye1Var = this.g;
                if (!u890.j(gye1Var, dye1Var)) {
                    if (!u890.j(gye1Var, fye1.a)) {
                        if (!u890.j(gye1Var, eye1.a)) {
                            eg.o();
                            return;
                        }
                        z = ktlVar == ktlVar2;
                    }
                }
                objT2 = new uu11(z, this.f);
                x340Var2.s0(objT2);
            }
            uu11 uu11Var = (uu11) objT2;
            boolean z5 = ktlVar == ktlVar2;
            ct11 ct11Var = this.W0;
            boolean z6 = (ct11Var instanceof bt11) && (((bt11) ct11Var).a || ktlVar != ktlVar2);
            ra30 ra30Var = ra30.a;
            sa30 sa30Var = this.h;
            if (u890.j(sa30Var, ra30Var)) {
                z2 = true;
            } else if (!u890.j(sa30Var, qa30.a)) {
                eg.o();
                return;
            } else if (ktlVar != ktlVar2) {
                z2 = true;
            } else {
                z2 = false;
            }
            uv11 uv11Var = jmb1Var.a;
            String str = uv11Var.a;
            maa maaVar2 = this.Z;
            boolean zG3 = x340Var2.g(maaVar2) | x340Var2.g(str);
            c380 c380Var = c380VarN;
            Object objT3 = x340Var2.T();
            String strY0 = null;
            if (zG3 || objT3 == obj) {
                objT3 = maaVar2 != null ? new j2i(1150725223, new ws11(maaVar2, uv11Var, (byte) 0), true) : null;
                x340Var2.s0(objT3);
            } else {
                z2 = z2;
            }
            vu30 vu30Var = (vu30) objT3;
            maa maaVar3 = this.N0;
            boolean zG4 = x340Var2.g(maaVar3) | x340Var2.g(str);
            Object objT4 = x340Var2.T();
            if (zG4 || objT4 == obj) {
                objT4 = maaVar3 != null ? new j2i(632488670, new ws11(maaVar3, uv11Var, (byte) 1), true) : null;
                x340Var2.s0(objT4);
            } else {
                vu30Var = vu30Var;
            }
            vu30 vu30Var2 = (vu30) objT4;
            maa maaVar4 = this.O0;
            boolean zG5 = x340Var2.g(maaVar4) | x340Var2.g(str);
            Object objT5 = x340Var2.T();
            if (zG5 || objT5 == obj) {
                objT5 = maaVar4 != null ? new j2i(14743672, new ws11(maaVar4, uv11Var, (byte) 3), true) : null;
                x340Var2.s0(objT5);
            } else {
                vu30Var2 = vu30Var2;
            }
            vu30 vu30Var3 = (vu30) objT5;
            maa maaVar5 = this.P0;
            boolean zG6 = x340Var2.g(maaVar5) | x340Var2.g(str);
            Object objT6 = x340Var2.T();
            if (zG6 || objT6 == obj) {
                objT6 = maaVar5 != null ? new j2i(1614921009, new ws11(maaVar5, uv11Var, (byte) 2), true) : null;
                x340Var2.s0(objT6);
            }
            vu30 vu30Var4 = (vu30) objT6;
            dnw0 dnw0Var = this.U0;
            boolean zG7 = x340Var2.g(dnw0Var) | x340Var2.g(str) | x340Var2.h(z5);
            Object objT7 = x340Var2.T();
            if (zG7 || objT7 == obj) {
                if (dnw0Var != null) {
                    if (dnw0Var instanceof cnw0) {
                        maaVar = ((cnw0) dnw0Var).a;
                    } else if (!(dnw0Var instanceof bnw0)) {
                        eg.o();
                        return;
                    } else {
                        bnw0 bnw0Var = (bnw0) dnw0Var;
                        maaVar = z5 ? bnw0Var.b : bnw0Var.a;
                    }
                    objT7 = new j2i(-1586939346, new vs11(this, maaVar, uv11Var, (byte) 1), true);
                } else {
                    objT7 = null;
                }
                x340Var2.s0(objT7);
            }
            vu30 vu30Var5 = (vu30) objT7;
            maa maaVar6 = this.V0;
            boolean zG8 = x340Var2.g(maaVar6) | x340Var2.g(str);
            Object objT8 = x340Var2.T();
            if (zG8 || objT8 == obj) {
                objT8 = maaVar6 != null ? new j2i(-539264803, new vs11(this, maaVar6, uv11Var, (byte) 2), true) : null;
                x340Var2.s0(objT8);
            } else {
                vu30Var5 = vu30Var5;
            }
            vu30 vu30Var6 = (vu30) objT8;
            j2i j2iVarR = apo.r(162237939, new n8k0(z6, this, jmb1Var, (byte) 8), x340Var2);
            float f = this.d;
            nim0 nim0Var = nim0.a;
            boolean z7 = z6;
            qim0 qim0VarZ = uyn1.z(0.0f, f, 1, nim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            boolean z8 = z5;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            u5w0 u5w0Var = u5w0.a;
            w5w0 w5w0Var = this.f1;
            if (u890.j(w5w0Var, u5w0Var)) {
                zzq0Var = uyn1.h(2, this.e, 0.0f);
            } else {
                if (!u890.j(w5w0Var, t5w0.a)) {
                    eg.o();
                    return;
                }
                zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            }
            Collection collection2 = fg91.b;
            if (z2) {
                x340Var2.i0(-1316556954);
                boolean zG9 = x340Var2.g(str);
                Object objT9 = x340Var2.T();
                if (zG9 || objT9 == obj) {
                    List listI0 = f46.i0(new ds11[]{this.Q0, this.R0, this.S0, this.T0});
                    byte b = 10;
                    ArrayList arrayList = new ArrayList(q7h.U(listI0, 10));
                    Iterator it = listI0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new j2i(-1545716572, new tc11((ds11) it.next(), uv11Var, b), true));
                        it = it;
                        b = 10;
                    }
                    objT9 = mqo1.A(arrayList);
                    x340Var2.s0(objT9);
                }
                x340Var2.r(false);
                collection = (c380) objT9;
            } else {
                x340Var2.i0(-873751587);
                x340Var2.r(false);
                collection = collection2;
            }
            qim0 qim0VarF = u291.f(uyn1.w(nim0Var, zzq0Var), 1.0f);
            boolean z9 = !collection.isEmpty();
            Collection collection3 = z8 ? collection2 : collectionK;
            qru qruVar = qru.a;
            rru rruVar = this.Z0;
            if (u890.j(rruVar, qruVar)) {
                z3 = false;
            } else {
                if (!u890.j(rruVar, oru.a)) {
                    if (!u890.j(rruVar, pru.a)) {
                        eg.o();
                        return;
                    } else if (ktlVar != ktlVar2) {
                        z3 = false;
                    }
                }
                z3 = true;
            }
            boolean z10 = jmb1Var.q;
            if (this.e1 == null) {
                x340Var2.i0(-1315095119);
                x340Var2.r(false);
                collection3 = collection3;
                c380Var = c380Var;
            } else {
                x340Var2.i0(-873706416);
                if (!z8) {
                    collection2 = collectionK;
                }
                x340Var2.i0(-647852057);
                ArrayList arrayList2 = new ArrayList();
                int iOrdinal = jmb1Var.f.ordinal();
                if (iOrdinal == 0) {
                    x340Var2.i0(-1906461393);
                    arrayList2.add(cwl1.o0(x340Var2, 2131961276));
                    x340Var2.r(false);
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw p3d1.k(x340Var2, -1906469296, false);
                    }
                    x340Var2.i0(-1906461393);
                    arrayList2.add(cwl1.o0(x340Var2, 2131961276));
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1029371519);
                    x340Var2.r(false);
                }
                arrayList2.add(bv11Var.a);
                int iOrdinal2 = jmb1Var.h.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 0;
                    x340Var2.i0(-1906444395);
                    arrayList2.add(cwl1.o0(x340Var2, 2131959472));
                    x340Var2.r(false);
                } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                    i2 = 0;
                    x340Var2.i0(-1906451786);
                    arrayList2.add(cwl1.o0(x340Var2, 2131955840));
                    x340Var2.r(false);
                } else {
                    if (iOrdinal2 != 3) {
                        throw p3d1.k(x340Var2, -1906455176, false);
                    }
                    x340Var2.i0(1029970687);
                    i2 = 0;
                    x340Var2.r(false);
                }
                ListIterator listIterator = collection2.listIterator(i2);
                while (listIterator.hasNext()) {
                    eoj0 eoj0Var = (eoj0) listIterator.next();
                    String str2 = eoj0Var.b;
                    if (str2 == null) {
                        str2 = eoj0Var.a;
                    }
                    arrayList2.add(str2);
                }
                Resources resources = ((Context) x340Var2.k(AndroidCompositionLocals_androidKt.b)).getResources();
                gix0 gix0Var = jmb1Var.e;
                if (gix0Var == null) {
                    x340Var2.i0(1030144906);
                    z4 = false;
                    x340Var2.r(false);
                    collection3 = collection3;
                    c380Var = c380Var;
                } else {
                    x340Var2.i0(1030144907);
                    boolean z11 = gix0Var instanceof gix0;
                    ngv ngvVar = ngv.d;
                    if (z11) {
                        x340Var2.i0(1933810976);
                        x340Var2.r(false);
                        ytw0 ytw0Var = jfv.b;
                        gix0 gix0Var2 = gix0Var;
                        long jL0 = fdg1.l0(gix0Var2.b - gix0Var2.c, ngvVar);
                        resources.getClass();
                        arrayList2.add(((rle1) new ogv(resources, (byte) 0).invoke(new jfv(jL0))).b);
                        z4 = false;
                    } else {
                        if (!(gix0Var instanceof hix0)) {
                            throw p3d1.k(x340Var2, -1184546194, false);
                        }
                        x340Var2.i0(1934031975);
                        hix0 hix0Var = (hix0) gix0Var;
                        long j = hix0Var.b;
                        if (hix0Var.a) {
                            x340Var2.i0(1934071221);
                            arrayList2.add(cwl1.o0(x340Var2, 2131960577));
                            z4 = false;
                            x340Var2.r(false);
                        } else if (j > 0) {
                            x340Var2.i0(1934325793);
                            x340Var2.r(false);
                            resources.getClass();
                            ogv ogvVar = new ogv(resources, (byte) 1);
                            ytw0 ytw0Var2 = jfv.b;
                            arrayList2.add(((rle1) ogvVar.invoke(new jfv(fdg1.l0(j, ngvVar)))).b);
                            z4 = false;
                        } else {
                            x340Var2.i0(1934463216);
                            z4 = false;
                            x340Var2.r(false);
                        }
                        x340Var2.r(z4);
                    }
                    x340Var2.r(z4);
                }
                strY0 = o7h.y0(arrayList2, ", ", (String) null, (String) null, (iu30) null, 62);
                x340Var2.r(z4);
                x340Var2.r(z4);
            }
            u4p1.w(uu11Var, jmb1Var, collection3, c380Var, iu30Var, true, z7, vu30Var, vu30Var2, vu30Var5, vu30Var6, collection, this.c1, iu30Var, qim0VarF, this.d1, this.i, z9, z3, j2iVarR, this.q1, this.Y, this.X0, vu30Var3, vu30Var4, z10, strY0, this.f1, x340Var2, 200704, 0);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(this, jmb1Var, iu30Var, i, (byte) 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void j(int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        int i3 = (kk0.t(1951183667, i, x340Var) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            int iC = l1d.C(i);
            if (iC == 0) {
                x340Var.i0(-1813201052);
                l4p1.g((qim0) null, x340Var, 0);
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -1813202550, false);
                }
                x340Var.i0(-1813199580);
                l4p1.m((qim0) null, x340Var, 0);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(this, i, i2, (byte) 24);
        }
    }
}
