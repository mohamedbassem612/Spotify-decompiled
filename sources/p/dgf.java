package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dgf extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgf(xtb0 xtb0Var, c380 c380Var, m8w0 m8w0Var, iu30 iu30Var, boolean z, boolean z2, List list, boolean z3, boolean z4, iu30 iu30Var2, Function0 function0, int i) {
        super(2);
        this.h = xtb0Var;
        this.b = c380Var;
        this.i = m8w0Var;
        this.c = iu30Var;
        this.d = z;
        this.e = z2;
        this.t = list;
        this.f = z3;
        this.g = z4;
        this.X = iu30Var2;
        this.Y = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object trfVar;
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        switch (b) {
            case 0:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    Object objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = c97.b(0.0f);
                        x340Var2.s0(objT);
                    }
                    o95 o95Var = (o95) objT;
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = bb00.h(0, x340Var2);
                    }
                    err0 err0Var = (hdn0) objT2;
                    nyn1.w(((Boolean) ((ven0) obj7).getValue()).booleanValue(), o95Var, err0Var.s(), x340Var2, 64);
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarX = lrn1.x(nim0Var, 1.0f);
                    Object objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = new tu9(err0Var, (byte) 3);
                        x340Var2.s0(objT3);
                    }
                    qim0 qim0VarX2 = ern1.x(qim0VarX, (iu30) objT3);
                    boolean zI = x340Var2.i(o95Var);
                    Object objT4 = x340Var2.T();
                    if (zI || objT4 == m4cVar) {
                        objT4 = new wqe(o95Var, (byte) 2);
                        x340Var2.s0(objT4);
                    }
                    qim0 qim0VarB = eqr0.B(qim0VarX2, (iu30) objT4);
                    asf asfVar = (asf) obj6;
                    uef uefVar = (uef) obj5;
                    jkr0 jkr0Var = (jkr0) obj4;
                    cbd0 cbd0Var = (cbd0) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var == null) {
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
                    nko1.H(gfh0VarC, x340Var2, lljVar4);
                    nko1.H(xos0VarM, x340Var2, lljVar3);
                    x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
                    nko1.H(qim0VarE, x340Var2, lljVar);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, lljVar4);
                    nko1.H(xos0VarM2, x340Var2, lljVar3);
                    x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar);
                    btf btfVar = uefVar.c;
                    List list = uefVar.h;
                    boolean z3 = btfVar instanceof btf;
                    boolean z4 = this.e;
                    boolean z5 = this.f;
                    if (z3) {
                        if (this.d) {
                            String str = btfVar.a;
                            w4i1 w4i1Var = uefVar.f.a;
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((jwm) it.next()).a);
                            }
                            trfVar = new vrf(str, w4i1Var, arrayList);
                            list = list;
                        } else {
                            trfVar = new urf(btfVar.a, uefVar.f, list, z4, z5);
                        }
                    } else {
                        if (!u890.j(btfVar, atf.a)) {
                            eg.o();
                            return null;
                        }
                        w4i1 w4i1Var2 = uefVar.j;
                        if (w4i1Var2 != null) {
                            trfVar = new srf(w4i1Var2, uefVar.m);
                        } else {
                            jwm jwmVar = (jwm) o7h.s0(list);
                            w4i1 w4i1Var3 = jwmVar != null ? jwmVar.a : null;
                            if (w4i1Var3 == null) {
                                n57.s("DM Chat has no other contributors");
                            }
                            if (w4i1Var3 == null) {
                                w4i1Var3 = w4i1.f;
                            }
                            trfVar = new trf(w4i1Var3, z4, z5);
                        }
                    }
                    otw.c(asfVar, trfVar, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    if (jkr0Var != null) {
                        x340Var2.i0(-1773513034);
                        int iIntValue2 = ((Number) jkr0Var.t.getValue()).intValue();
                        c380 c380Var = this.b;
                        boolean zG = x340Var2.g(c380Var);
                        iu30 iu30Var = this.c;
                        boolean zG2 = zG | x340Var2.g(iu30Var);
                        Object objT5 = x340Var2.T();
                        if (zG2 || objT5 == m4cVar) {
                            objT5 = new li1((byte) 2, iu30Var, c380Var);
                            x340Var2.s0(objT5);
                        }
                        dm5.e(c380Var, iIntValue2, (iu30) objT5, (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1773218007);
                        x340Var2.r(false);
                    }
                    if (this.g) {
                        x340Var2.i0(-1773141065);
                        qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                        uwr uwrVar = cbx.a;
                        cua cuaVar = cbx.b(x340Var2).f;
                        cua cuaVar2 = cbx.b(x340Var2).f;
                        qim0 qim0VarF = dug.f(i1p1.q(qim0VarZ, er31.d(0.0f, 0.0f, 8.0f, 8.0f, 3)), ((yex) zex.a.d).c, d4o1.a);
                        Object objT6 = x340Var2.T();
                        if (objT6 == m4cVar) {
                            objT6 = ktd.n(x340Var2);
                        }
                        idn0 idn0Var = (idn0) objT6;
                        Object objT7 = x340Var2.T();
                        if (objT7 == m4cVar) {
                            objT7 = xrc.Z0;
                            x340Var2.s0(objT7);
                        }
                        qim0 qim0VarV = bin.v(qim0VarF, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT7, 28);
                        gfh0 gfh0VarC2 = t1c.c(een.h, false);
                        int iHashCode3 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM3 = x340Var2.m();
                        qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarV);
                        hzj.A.getClass();
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var2, lljVar4);
                        nko1.H(xos0VarM3, x340Var2, lljVar3);
                        x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                        nko1.H(qim0VarE3, x340Var2, lljVar);
                        List list3 = list;
                        int iS = zno1.s(q7h.U(list3, 10));
                        if (iS < 16) {
                            iS = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            w4i1 w4i1Var4 = ((jwm) it2.next()).a;
                            linkedHashMap.put(w4i1Var4.a, w4i1Var4.b);
                        }
                        otw.c(cbd0Var, new xad0(linkedHashMap), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        z = true;
                        x340Var2.r(true);
                        x340Var2.r(false);
                    } else {
                        z = true;
                        x340Var2.i0(-1772108951);
                        x340Var2.r(false);
                    }
                    x340Var2.r(z);
                    x340Var2.r(z);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                nln.i((xtb0) obj7, this.b, (m8w0) obj6, this.c, this.d, this.e, (List) obj5, this.f, this.g, (iu30) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgf(ven0 ven0Var, asf asfVar, uef uefVar, boolean z, boolean z2, boolean z3, kes kesVar, c380 c380Var, iu30 iu30Var, boolean z4, cbd0 cbd0Var) {
        super(2);
        this.h = ven0Var;
        this.i = asfVar;
        this.t = uefVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.X = kesVar;
        this.b = c380Var;
        this.c = iu30Var;
        this.g = z4;
        this.Y = cbd0Var;
    }
}
