package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o7f1 extends hab0 implements xu30 {
    public final /* synthetic */ m63 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ce6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7f1(m63 m63Var, float f, c380 c380Var, float f2, iu30 iu30Var, boolean z, ce6 ce6Var) {
        super(3);
        this.a = m63Var;
        this.b = f;
        this.c = c380Var;
        this.d = f2;
        this.e = iu30Var;
        this.f = z;
        this.g = ce6Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        iu30 iu30Var;
        Function0 function0;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        gra graVar = een.d;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
        j06 j06Var = x340Var2.a;
        if (zY) {
            float fD = i2cVar.d();
            List list = this.a.a;
            p3v p3vVar = new p3v(fD / 0.9735099f);
            float fC = i2cVar.c();
            float f = this.b;
            float f2 = zjy.j(fC - f, p3vVar).a;
            float f3 = 0.9735099f * f2;
            c380 c380Var = this.c;
            List listD1 = o7h.d1(list, c380Var.size());
            if (!listD1.isEmpty()) {
                List list2 = listD1;
                Iterator it = list2.iterator();
                if (!it.hasNext()) {
                    hhg1.k();
                    return null;
                }
                sdn sdnVar = (sdn) it.next();
                p3v p3vVar2 = new p3v((sdnVar.b * f2) - ((sdnVar.c * f3) / 2.0f));
                while (it.hasNext()) {
                    sdn sdnVar2 = (sdn) it.next();
                    p3v p3vVar3 = new p3v((sdnVar2.b * f2) - ((sdnVar2.c * f3) / 2.0f));
                    if (p3vVar2.compareTo(p3vVar3) > 0) {
                        p3vVar2 = p3vVar3;
                    }
                }
                Iterator it2 = list2.iterator();
                if (!it2.hasNext()) {
                    hhg1.k();
                    return null;
                }
                sdn sdnVar3 = (sdn) it2.next();
                p3v p3vVar4 = new p3v(((sdnVar3.c * f3) / 2.0f) + (sdnVar3.b * f2));
                while (it2.hasNext()) {
                    sdn sdnVar4 = (sdn) it2.next();
                    p3v p3vVar5 = new p3v(((sdnVar4.c * f3) / 2.0f) + (sdnVar4.b * f2));
                    if (p3vVar4.compareTo(p3vVar5) < 0) {
                        p3vVar4 = p3vVar5;
                    }
                }
                float f4 = p3vVar4.a;
                float f5 = p3vVar2.a;
                float f6 = f4 - f5;
                if (p3v.b(f6, this.d * 0.15f) >= 0) {
                    x340Var2.i0(-1382698147);
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new p3v(((sdn) it3.next()).c * f3));
                    }
                    uwr uwrVar = cbx.a;
                    mta mtaVar = cbx.b(x340Var2).d;
                    if (c380Var.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it4 = c380Var.iterator();
                        i = 0;
                        while (it4.hasNext()) {
                            if (((k7f1) it4.next()).f != null && (i = i + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = 0;
                    for (Object obj4 : c380Var) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        j06 j06Var2 = j06Var;
                        k7f1 k7f1Var = (k7f1) obj4;
                        p3v p3vVar6 = (p3v) o7h.t0(i2, arrayList);
                        if (p3vVar6 == null || k7f1Var.f == null) {
                            p3vVar6 = null;
                        }
                        if (p3vVar6 != null) {
                            arrayList2.add(p3vVar6);
                        }
                        i2 = i3;
                        j06Var = j06Var2;
                    }
                    j06 j06Var3 = j06Var;
                    if (arrayList2.isEmpty() || arrayList2.size() != i) {
                        z = false;
                    } else {
                        if (!arrayList2.isEmpty()) {
                            Iterator it5 = arrayList2.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    if (p3v.b(((p3v) it5.next()).a, 48.0f) < 0) {
                                        z = false;
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    iu30 iu30Var2 = z ? this.e : null;
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 48);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                    hzj.A.getClass();
                    if (j06Var3 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    boolean z2 = x340Var2.S;
                    n4k n4kVar = hmb0.t1;
                    if (z2) {
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
                    qim0 qim0VarS = u291.s(nim0Var, f3, f6);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    iu30 iu30Var3 = iu30Var2;
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarS);
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
                    x340Var2.i0(-1386202826);
                    int i4 = 0;
                    for (Object obj5 : c380Var) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            p7h.T();
                            throw null;
                        }
                        k7f1 k7f1Var2 = (k7f1) obj5;
                        x340 x340Var3 = x340Var2;
                        nim0 nim0Var2 = nim0Var;
                        ven0 ven0VarU = xto.u(f4i1.c(i4, "ta_cover_"), (i4 * 100) + 200, this.f, this.g.b, (Function0) null, x340Var3, 0, 16);
                        sdn sdnVar5 = (sdn) o7h.t0(i4, list);
                        if (sdnVar5 == null) {
                            iu30Var = iu30Var3;
                        } else {
                            float f7 = f3 * sdnVar5.c;
                            float f8 = f7 / 2.0f;
                            qim0 qim0VarC = eqr0.C(h2c.a.a(nim0Var2, graVar), (sdnVar5.a * f3) - f8, ((sdnVar5.b * f2) - f8) - f5);
                            boolean zG = x340Var3.g(sdnVar5) | x340Var3.g(ven0VarU);
                            Object objT = x340Var3.T();
                            if (zG || objT == m4cVar) {
                                objT = new cmd1(sdnVar5, ven0VarU, (byte) 19);
                                x340Var3.s0(objT);
                            }
                            qim0 qim0VarX = lrn1.x(i541.C(qim0VarC, (iu30) objT), sdnVar5.e);
                            if (iu30Var3 == null) {
                                x340Var3.i0(-171947850);
                                x340Var3.r(false);
                                function0 = null;
                                iu30Var = iu30Var3;
                            } else {
                                x340Var3.i0(-171947849);
                                iu30Var = iu30Var3;
                                boolean zI = x340Var3.i(k7f1Var2) | x340Var3.g(iu30Var);
                                Object objT2 = x340Var3.T();
                                if (zI || objT2 == m4cVar) {
                                    objT2 = new n7f1(k7f1Var2, iu30Var);
                                    x340Var3.s0(objT2);
                                }
                                x340Var3.r(false);
                                function0 = (Function0) objT2;
                            }
                            mym.g(k7f1Var2, f7, qim0VarX, function0, x340Var3, 8);
                            x340Var3 = x340Var3;
                        }
                        i4 = i5;
                        nim0Var = nim0Var2;
                        iu30Var3 = iu30Var;
                        x340Var2 = x340Var3;
                    }
                    x340 x340Var4 = x340Var2;
                    x340Var4.r(false);
                    x340Var4.r(true);
                    op71.g(x340Var4, u291.h(nim0Var, f));
                    x340Var4.r(true);
                    x340Var4.r(false);
                } else {
                    x340Var2.i0(-1380793445);
                    x340Var2.r(false);
                }
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
