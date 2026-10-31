package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ghi0 extends hab0 implements vu30 {
    public final /* synthetic */ j2i N0;
    public final /* synthetic */ float X;
    public final /* synthetic */ byte Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ hdn0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ igi0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ qim0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ j2i t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ghi0(boolean z, hdn0 hdn0Var, float f, hdn0 hdn0Var2, iu30 iu30Var, igi0 igi0Var, int i, qim0 qim0Var, int i2, j2i j2iVar, float f2, int i3, int i4, j2i j2iVar2) {
        super(2);
        this.a = z;
        this.b = hdn0Var;
        this.c = f;
        this.d = hdn0Var2;
        this.e = iu30Var;
        this.f = igi0Var;
        this.g = i;
        this.h = qim0Var;
        this.i = i2;
        this.t = j2iVar;
        this.X = f2;
        this.Y = i3;
        this.Z = i4;
        this.N0 = j2iVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        z6x arrayList;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        igi0 igi0Var = this.f;
        ArrayList arrayList2 = igi0Var.b;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            if (this.a) {
                x340Var2.i0(-348033349);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-349799667);
                Object objT = x340Var2.T();
                if (objT == m4cVar) {
                    if (arrayList2.size() == 1) {
                        arrayList = z6x.a;
                    } else {
                        arrayList = new ArrayList(q7h.U(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((mey0) it.next()).a);
                        }
                    }
                    objT = v8r.q(arrayList);
                    x340Var2.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                Boolean boolValueOf = Boolean.valueOf(xtb0VarA.j.b());
                boolean zI = x340Var2.i(xtb0VarA) | x340Var2.i(this.b) | x340Var2.d(this.c);
                hdn0 hdn0Var = this.d;
                boolean zI2 = zI | x340Var2.i(hdn0Var);
                iu30 iu30Var = this.e;
                boolean zG = zI2 | x340Var2.g(iu30Var);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new rjb0(xtb0VarA, this.c, this.b, this.d, this.e, (lnm) null);
                    x340Var2.s0(objT2);
                }
                qxd0.t(boolValueOf, x340Var2, (vu30) objT2);
                boolean zI3 = x340Var2.i(igi0Var) | x340Var2.i(ven0Var) | x340Var2.i(xtb0VarA) | x340Var2.i(hdn0Var) | x340Var2.g(iu30Var);
                Object objT3 = x340Var2.T();
                if (zI3 || objT3 == m4cVar) {
                    chi0 chi0Var = new chi0(igi0Var, xtb0VarA, ven0Var, this.e, this.d, (lnm) null);
                    x340Var2.s0(chi0Var);
                    objT3 = chi0Var;
                }
                qxd0.t(arrayList2, x340Var2, (vu30) objT3);
                x340Var2.r(false);
            }
            float fW = upo1.w(x340Var2, this.g);
            qim0 qim0VarB = uyn1.B(this.h, 0.0f, 0.0f, 0.0f, this.i, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarZ = uyn1.z(fW, 0.0f, 2, nim0.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            this.t.invoke(x340Var2, 0);
            x340Var2.r(true);
            w2g0.c((qim0) null, (tl3) null, apo.r(1381350419, new fhi0(this.X, fW, this.Y, xtb0VarA, this.a, igi0Var, this.Z, this.b, this.N0), x340Var2), x340Var2, 3072, 7);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
