package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k8i0 implements jsw {
    public final nrp a;
    public final orp b;
    public final u3i0 c;
    public final o2b1 d;
    public final swm0 e;
    public final b7i0 f;
    public final sm51 g;
    public final zge1 h;
    public final o6i0 i;

    public k8i0(nrp nrpVar, orp orpVar, u3i0 u3i0Var, o2b1 o2b1Var, swm0 swm0Var, b7i0 b7i0Var, sm51 sm51Var, zge1 zge1Var, o6i0 o6i0Var) {
        this.a = nrpVar;
        this.b = orpVar;
        this.c = u3i0Var;
        this.d = o2b1Var;
        this.e = swm0Var;
        this.f = b7i0Var;
        this.g = sm51Var;
        this.h = zge1Var;
        this.i = o6i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:85:0x0298  */
    /* JADX WARN: Code duplicated, block: B:86:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:89:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x032f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0331  */
    /* JADX WARN: Code duplicated, block: B:97:0x033a  */
    public final void c(u5i0 u5i0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        k8i0 k8i0Var;
        iu30 iu30Var2;
        boolean z;
        int i3;
        u5i0 u5i0Var2;
        o091 o091Var;
        iu30 iu30Var3;
        qim0 qim0Var;
        b0k b0kVar2;
        float f;
        u5i0 u5i0Var3;
        int i4;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        Object objT;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1122191679);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(u5i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(this) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zB = xoi1.b((Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b));
            boolean z5 = u5i0Var.h;
            boolean z6 = u5i0Var.i;
            boolean z7 = ((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).orientation == 1 || zB;
            if (z5) {
                if (this.i == o6i0.a && z7) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            boolean z8 = z || (z6 && z7);
            boolean zIsEmpty = u5i0Var.a.c.isEmpty();
            i091 i091Var = (i091) rwq.g(this.f.g, (Object) null, (o8n) null, b0kVar3, 48, 2).getValue();
            o091 o091Var2 = i091Var != null ? i091Var.h : null;
            boolean z9 = u5i0Var.Y;
            int i5 = i2 & 112;
            boolean zI = b0kVar3.i(o091Var2) | b0kVar3.i(u5i0Var) | (i5 == 32);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                o091 o091Var3 = o091Var2;
                i3 = 16;
                az80 az80Var = new az80(o091Var3, u5i0Var, iu30Var, (lnm) null, (byte) 21);
                u5i0Var2 = u5i0Var;
                o091Var = o091Var3;
                iu30Var3 = iu30Var;
                b0kVar3.s0(az80Var);
                objT2 = az80Var;
            } else {
                iu30Var3 = iu30Var;
                o091Var = o091Var2;
                i3 = 16;
                u5i0Var2 = u5i0Var;
            }
            qxd0.t(o091Var, b0kVar3, (vu30) objT2);
            iac0 iac0Var = (iac0) b0kVar3.k(jfe0.a);
            ven0 ven0VarS = v8r.s(iu30Var3, b0kVar3);
            boolean zI2 = b0kVar3.i(ven0VarS) | b0kVar3.i(iac0Var);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new svd(iac0Var, ven0VarS, (byte) 1);
                b0kVar3.s0(objT3);
            }
            qxd0.i(iac0Var, (iu30) objT3, b0kVar3);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarD, new bgc0(lhc.g(b0kVar3).p, i3));
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarY, cbx.a(b0kVar3).a.c, d4o1.a);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
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
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            qim0 qim0VarZ = uyn1.z(cbx.b(b0kVar3).b.a, 0.0f, 2, u291.f(qim0Var2, 1.0f));
            fno1.c(u5i0Var2.g, i5, b0kVar3, iu30Var3, uyn1.z(cbx.b(b0kVar3).b.a, 0.0f, 2, qim0Var2));
            pbh pbhVar = pbh.a;
            if (!z || zIsEmpty) {
                qim0Var = qim0Var2;
                b0kVar2 = b0kVar3;
                f = 1.0f;
                if (z) {
                    b0kVar2.i0(1966445326);
                    h(u5i0Var2.R0, zB, pbhVar.a(1.0f, u291.f(qim0Var, 1.0f), true), b0kVar2, (i2 << 3) & 7168);
                    b0kVar2.r(false);
                    u5i0Var3 = u5i0Var2;
                    i4 = 1;
                } else if (zIsEmpty) {
                    u5i0Var3 = u5i0Var2;
                    b0kVar2.i0(1966866895);
                    i4 = 1;
                    rpo1.a(0, u5i0Var3.O0, b0kVar2, pbhVar.a(1.0f, qim0VarZ, true));
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(1966671843);
                    int i6 = i2 << 3;
                    int i7 = (i2 & 14) | (i6 & 896) | (i6 & 7168);
                    u5i0Var3 = u5i0Var2;
                    d(u5i0Var3, i1p1.r(pbhVar.a(1.0f, qim0VarZ, true)), iu30Var, b0kVar2, i7);
                    b0kVar2.r(false);
                }
                if (z8) {
                    b0kVar2.i0(1967030017);
                    qim0 qim0VarH = u291.h(uyn1.z(0.0f, cbx.b(b0kVar2).b.b, i4, u291.f(qim0Var, f)), 46.0f);
                    int i8 = (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6));
                    b0k b0kVar4 = b0kVar2;
                    z2 = z9;
                    e(u5i0Var3, z2, iu30Var, qim0VarH, b0kVar4, i8);
                    k8i0Var = this;
                    iu30Var2 = iu30Var;
                    b0kVar2 = b0kVar4;
                    z3 = false;
                    b0kVar2.r(false);
                } else {
                    k8i0Var = this;
                    iu30Var2 = iu30Var;
                    z2 = z9;
                    z3 = false;
                    b0kVar2.i0(1967337785);
                    b0kVar2.r(false);
                }
                str = k8i0Var.c.e;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                qim0 qim0VarY2 = too1.y(uyn1.z(cbx.b(b0kVar2).b.a, 0.0f, 2, u291.f(qim0Var, f)), new bgc0(lhc.g(b0kVar2).o, 32));
                cvx cvxVar = cbx.b(b0kVar2).b;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                qim0 qim0VarB = uyn1.B(qim0VarY2, 0.0f, 16.0f, 0.0f, 16.0f, 5);
                if (i5 == 32) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                objT = b0kVar2.T();
                if (z4 || objT == m4cVar) {
                    objT = new msh0(iu30Var2, (byte) 10);
                    b0kVar2.s0(objT);
                }
                b0k b0kVar5 = b0kVar2;
                mth1.b(u5i0Var, str2, k8i0Var.b, qim0VarB, z8, z2, (Function0) objT, b0kVar5, i2 & 14);
                b0kVar3 = b0kVar5;
                b0kVar3.r(true);
            } else {
                b0kVar3.i0(1965807718);
                Bitmap bitmap = u5i0Var2.R0;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                qim0 qim0VarA = uyn1.A(qim0VarZ, cbx.b(b0kVar3).b.c, 16.0f, cbx.b(b0kVar3).b.c, cbx.b(b0kVar3).b.a);
                int i9 = i2 << 3;
                int i10 = i9 & 7168;
                b0kVar2 = b0kVar3;
                f = 1.0f;
                h(bitmap, zB, qim0VarA, b0kVar2, i10);
                u5i0Var3 = u5i0Var2;
                d(u5i0Var3, i1p1.r(pbhVar.a(1.0f, qim0VarZ, true)), iu30Var, b0kVar2, i10 | (i2 & 14) | (i9 & 896));
                b0kVar2.r(false);
                qim0Var = qim0Var2;
            }
            i4 = 1;
            if (z8) {
                b0kVar2.i0(1967030017);
                qim0 qim0VarH2 = u291.h(uyn1.z(0.0f, cbx.b(b0kVar2).b.b, i4, u291.f(qim0Var, f)), 46.0f);
                int i11 = (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6));
                b0k b0kVar6 = b0kVar2;
                z2 = z9;
                e(u5i0Var3, z2, iu30Var, qim0VarH2, b0kVar6, i11);
                k8i0Var = this;
                iu30Var2 = iu30Var;
                b0kVar2 = b0kVar6;
                z3 = false;
                b0kVar2.r(false);
            } else {
                k8i0Var = this;
                iu30Var2 = iu30Var;
                z2 = z9;
                z3 = false;
                b0kVar2.i0(1967337785);
                b0kVar2.r(false);
            }
            str = k8i0Var.c.e;
            if (str == null) {
                str = "";
            }
            String str3 = str;
            qim0 qim0VarY3 = too1.y(uyn1.z(cbx.b(b0kVar2).b.a, 0.0f, 2, u291.f(qim0Var, f)), new bgc0(lhc.g(b0kVar2).o, 32));
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarY3, 0.0f, 16.0f, 0.0f, 16.0f, 5);
            if (i5 == 32) {
                z4 = true;
            } else {
                z4 = z3;
            }
            objT = b0kVar2.T();
            if (z4) {
                objT = new msh0(iu30Var2, (byte) 10);
                b0kVar2.s0(objT);
            } else {
                objT = new msh0(iu30Var2, (byte) 10);
                b0kVar2.s0(objT);
            }
            b0k b0kVar7 = b0kVar2;
            mth1.b(u5i0Var, str3, k8i0Var.b, qim0VarB2, z8, z2, (Function0) objT, b0kVar7, i2 & 14);
            b0kVar3 = b0kVar7;
            b0kVar3.r(true);
        } else {
            k8i0Var = this;
            iu30Var2 = iu30Var;
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(k8i0Var, u5i0Var, iu30Var2, i, (byte) 18);
        }
    }

    public final void d(u5i0 u5i0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        fde1 fde1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-475266713);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(u5i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int iC = l1d.C(u5i0Var.f);
            if (iC == 0) {
                i3 = 1;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                i3 = 2;
            }
            String str = u5i0Var.d;
            v5i0 v5i0Var = u5i0Var.a;
            long j = v5i0Var.b;
            boolean z = u5i0Var.t;
            long j2 = u5i0Var.Q0;
            boolean z2 = u5i0Var.T0 instanceof r5i0;
            List list = v5i0Var.c;
            List list2 = u5i0Var.b;
            o5i0 o5i0Var = u5i0Var.e;
            uvg1 uvg1Var = o5i0Var.a;
            nde1 nde1Var = new nde1(uvg1Var);
            boolean z3 = v5i0Var.a;
            int i4 = v5i0Var.d;
            u5v u5vVar = o5i0Var.b;
            r5v r5vVar = u5vVar instanceof r5v ? (r5v) u5vVar : null;
            if (r5vVar == null) {
                fde1Var = null;
            } else {
                fde1Var = uvg1Var.a != r5vVar.a.a ? fde1.a : fde1.b;
            }
            mde1 mde1Var = new mde1(i3, str, j, new ode1(nde1Var, list, list2, z3, i4, fde1Var, v5i0Var.e, v5i0Var.f), z, j2, z2);
            bvn bvnVar = new bvn(iu30Var, (byte) 4);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                ggv ggvVar = (ggv) ((y6i0) ((qq) this.a.a.c).a).r.get();
                c8o.l(ggvVar);
                objT = new pde1(new rzj(ggvVar, (byte) 11), bvnVar);
                x340Var.s0(objT);
            }
            pde1 pde1Var = (pde1) objT;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            otw.c(pde1Var, mde1Var, (qim0) null, (ipb1) null, x340Var, 72, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(this, u5i0Var, qim0Var, iu30Var, i, (byte) 4);
        }
    }

    public final void e(u5i0 u5i0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        drr0 drr0Var;
        ArrayList arrayList;
        k8i0 k8i0Var = this;
        qim0 qim0Var2 = qim0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1537392251);
        int i2 = (i & 6) == 0 ? (x340Var.i(u5i0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(k8i0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            o5i0 o5i0Var = u5i0Var.e;
            boolean z2 = u5i0Var.t;
            v5i0 v5i0Var = u5i0Var.a;
            uvg1 uvg1Var = o5i0Var.a;
            boolean zG = x340Var.g(uvg1Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                m9r0 m9r0Var = new m9r0(((b7i0) k8i0Var.e.b).g, uvg1Var, (byte) 12);
                x340Var.s0(m9r0Var);
                objT = m9r0Var;
            }
            ven0 ven0VarG = rwq.g((mr20) objT, Float.valueOf(0.0f), (o8n) null, x340Var, 48, 2);
            ven0 ven0VarG2 = rwq.g(k8i0Var.f.g, (Object) null, (o8n) null, x340Var, 48, 2);
            i091 i091Var = (i091) ven0VarG2.getValue();
            boolean zJ = u890.j(i091Var != null ? i091Var.h : null, n091.a);
            i091 i091Var2 = (i091) ven0VarG2.getValue();
            float f = i091Var2 != null ? i091Var2.f : 1.0f;
            long j = uvg1Var.c;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var2 = (drr0) objT2;
            Object[] objArr = {Float.valueOf(((Number) ven0VarG.getValue()).floatValue()), Boolean.valueOf(zJ), Long.valueOf(j), Float.valueOf(f)};
            boolean zH = x340Var.h(zJ) | x340Var.f(j) | x340Var.i(drr0Var2) | x340Var.i(ven0VarG) | x340Var.d(f);
            Object objT3 = x340Var.T();
            if (zH || objT3 == m4cVar) {
                drr0Var = drr0Var2;
                objT3 = new j8i0(zJ, j, ven0VarG, drr0Var, f, null);
                x340Var.s0(objT3);
            } else {
                drr0Var = drr0Var2;
            }
            qxd0.u(objArr, (vu30) objT3, x340Var);
            float fS = drr0Var.s();
            boolean zG2 = x340Var.g(v5i0Var.c) | x340Var.h(z2);
            Object objT4 = x340Var.T();
            Object obj = objT4;
            if (zG2 || objT4 == m4cVar) {
                if (z2) {
                    arrayList = new ArrayList(q7h.U(v5i0Var.c, 10));
                    for (Iterator it = r2.iterator(); it.hasNext(); it = it) {
                        oce1 oce1Var = (oce1) it.next();
                        arrayList.add(new n5f0(oce1Var.a, oce1Var.b));
                    }
                } else {
                    arrayList = z6x.a;
                }
                x340Var.s0(arrayList);
                obj = arrayList;
            }
            List list = (List) obj;
            ss50 ss50Var = (ss50) x340Var.k(t4k.l);
            boolean z3 = o5i0Var.b instanceof r5v;
            uvg1 uvg1Var2 = o5i0Var.a;
            boolean zH2 = x340Var.h(z3) | x340Var.i(list) | x340Var.i(ss50Var);
            Object objT5 = x340Var.T();
            if (zH2 || objT5 == m4cVar) {
                objT5 = new d7i0(z3, list, ss50Var, (lnm) null);
                x340Var.s0(objT5);
            }
            qxd0.t(uvg1Var2, x340Var, (vu30) objT5);
            bue1 bue1Var = new bue1(u5i0Var.d, o5i0Var.a, v5i0Var.b, fS, z, list, u5i0Var.P0, u5i0Var.Q0);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                mhg0 mhg0Var = new mhg0(iu30Var, (byte) 16);
                k8i0Var = this;
                qq qqVar = (qq) ((prp) k8i0Var.d.b).a.c;
                qrp qrpVar = (qrp) ((jly0) qqVar.g).get();
                q8n q8nVar = (q8n) ((y6i0) qqVar.a).j.get();
                c8o.l(q8nVar);
                ecd1 ecd1Var = new ecd1(qrpVar, q8nVar, k8i0Var.g, k8i0Var.h, mhg0Var);
                x340Var.s0(ecd1Var);
                objT6 = ecd1Var;
            } else {
                k8i0Var = this;
            }
            xpw xpwVar = (xpw) objT6;
            qim0Var2 = qim0Var;
            qim0 qim0VarN = anm1.N("timeline_selector", qim0Var2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            otw.c(xpwVar, bue1Var, (qim0) null, (ipb1) null, x340Var, 64, 12);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1((byte) 24, i, k8i0Var, u5i0Var, iu30Var, qim0Var2, z);
        }
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void a(u5i0 u5i0Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1937219494);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(u5i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new msh0(iu30Var, (byte) 11);
                x340Var.s0(objT);
            }
            q3p1.b(0, 1, (Function0) objT, x340Var, false);
            boolean z2 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new mhg0(iu30Var, (byte) 17);
                x340Var.s0(objT2);
            }
            c(u5i0Var, (iu30) objT2, x340Var, (i2 & 14) | ((i2 >> 3) & 896));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(i, this, u5i0Var, iu30Var, kswVar, (byte) 5);
        }
    }

    public final void g(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        k8i0 k8i0Var;
        b0k b0kVar2;
        ven0 ven0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1318114571);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(this) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            b0kVar2 = b0kVar3;
            ven0 ven0VarG = rwq.g(this.f.g, (Object) null, (o8n) null, b0kVar2, 48, 2);
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = yv91.a(new bu2(ven0VarG, (byte) 12));
                b0kVar2.s0(objT2);
            }
            tob1 tob1Var = (tob1) objT2;
            Boolean bool = (Boolean) tob1Var.getValue();
            bool.booleanValue();
            vm70 vm70Var = (vm70) ven0Var2.getValue();
            boolean zI = b0kVar2.i(tob1Var) | b0kVar2.i(ven0Var2) | b0kVar2.i(this);
            Object objT3 = b0kVar2.T();
            if (zI || objT3 == m4cVar) {
                ven0Var = ven0Var2;
                az80 az80Var = new az80(this, tob1Var, ven0Var, (lnm) null, (byte) 22);
                b0kVar2.s0(az80Var);
                objT3 = az80Var;
            } else {
                ven0Var = ven0Var2;
            }
            qxd0.s(bool, vm70Var, (vu30) objT3, b0kVar2);
            boolean zI2 = b0kVar2.i(k8i0Var) | b0kVar2.i(ven0Var);
            Object objT4 = b0kVar2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new uah0(this, ven0Var, (byte) 6);
                b0kVar2.s0(objT4);
            }
            iu30 iu30Var = (iu30) objT4;
            qim0 qim0VarR = d7e.r(1.7777778f, qim0Var, false);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar2).f;
            dm5.a(iu30Var, dug.f(i1p1.q(qim0VarR, er31.b(4.0f)), u7h.b, d4o1.a), (iu30) null, b0kVar2, 0, 4);
        } else {
            k8i0Var = this;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(k8i0Var, qim0Var, i, (byte) 9);
        }
    }

    public final void h(Bitmap bitmap, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(676852769);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(bitmap) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarJ = z ? u291.j(0.0f, 160.0f, 1, nim0Var) : u291.f(nim0Var, 1.0f);
            qim0 qim0VarN = anm1.N("video_preview", qim0Var);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            g(qim0VarJ, x340Var, (i2 >> 6) & 112);
            if (bitmap == null) {
                x340Var.i0(1820993030);
                x340Var.r(false);
            } else {
                x340Var.i0(1820993031);
                boolean zG = x340Var.g(bitmap);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new yk4(bitmap);
                    x340Var.s0(objT);
                }
                h6m h6mVar = mif1.Q0;
                qim0 qim0VarR = d7e.r(1.7777778f, qim0VarJ, false);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cwl1.g((yk4) objT, (String) null, i1p1.q(qim0VarR, er31.b(4.0f)), h6mVar, 0, x340Var, 48, 232);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0(this, bitmap, z, qim0Var, i, (byte) 0);
        }
    }
}
