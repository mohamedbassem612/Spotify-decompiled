package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o601 extends hab0 implements xu30 {
    public final /* synthetic */ a101 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ a101 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ b0i0 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ fqm i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o601(a101 a101Var, String str, List list, a101 a101Var2, boolean z, b0i0 b0i0Var, String str2, iu30 iu30Var, fqm fqmVar) {
        super(3);
        this.a = a101Var;
        this.b = str;
        this.c = list;
        this.d = a101Var2;
        this.e = z;
        this.f = b0i0Var;
        this.g = str2;
        this.h = iu30Var;
        this.i = fqmVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        Object next;
        boolean z;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        gra graVar = een.d;
        era eraVar = een.R0;
        era eraVar2 = een.P0;
        Iterator it = this.a.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((gxz0) next).g());
        gxz0 gxz0Var = (gxz0) next;
        String str = this.b;
        List list = this.c;
        qim0 qim0VarH = ouo1.H(str, list);
        mbh mbhVarA = jbh.a(h36.c, eraVar2, b0kVar, 0);
        int iHashCode = Long.hashCode(tgp1.l(b0kVar));
        xos0 xos0VarM = ((x340) b0kVar).m();
        qim0 qim0VarE = zr7.E(b0kVar, qim0VarH);
        hzj.A.getClass();
        x340 x340Var = (x340) b0kVar;
        if (x340Var.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var.m0();
        boolean z2 = x340Var.S;
        n4k n4kVar = hmb0.t1;
        if (z2) {
            x340Var.l(n4kVar);
        } else {
            x340Var.v0();
        }
        nko1.H(mbhVarA, b0kVar, lljVar4);
        nko1.H(xos0VarM, b0kVar, lljVar3);
        i3a.l(iHashCode, b0kVar, lljVar2, b0kVar);
        nko1.H(qim0VarE, b0kVar, lljVar);
        a101 a101Var = this.d;
        era eraVar3 = a101Var.d() ? eraVar : eraVar2;
        pbh pbhVar = pbh.a;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarC = pbhVar.c(eraVar3, nim0Var);
        uwr uwrVar = cbx.a;
        qim0 qim0VarX = uyn1.x(d1u.E(1.0f, u7h.b(cbx.a(b0kVar).a.c, this.e ? 0.25f : 0.4f, 0.0f, 0.0f, 0.0f, 14), qim0VarC, er31.a), 1.0f);
        gfh0 gfh0VarC = t1c.c(graVar, false);
        int iHashCode2 = Long.hashCode(tgp1.l(b0kVar));
        xos0 xos0VarM2 = x340Var.m();
        qim0 qim0VarE2 = zr7.E(b0kVar, qim0VarX);
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(n4kVar);
        } else {
            x340Var.v0();
        }
        nko1.H(gfh0VarC, b0kVar, lljVar4);
        nko1.H(xos0VarM2, b0kVar, lljVar3);
        i3a.l(iHashCode2, b0kVar, lljVar2, b0kVar);
        nko1.H(qim0VarE2, b0kVar, lljVar);
        String strA = a101Var.a();
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((gxz0) it2.next()).b());
        }
        a401 a401Var = new a401(new z301(strA, mqo1.A(o7h.j0(arrayList)), list.size(), this.g, (String) null, false, 0, 240), 6);
        xgc xgcVar = new xgc((byte) 1);
        iu30 iu30Var = this.h;
        boolean zG = x340Var.g(iu30Var);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            z = false;
            objT = new n601(iu30Var, (byte) 0);
            x340Var.s0(objT);
        } else {
            z = false;
        }
        boolean z3 = z;
        this.f.g(a401Var, xgcVar, (iu30) objT, b0kVar, 0);
        x340Var.r(true);
        if (gxz0Var != null) {
            x340Var.i0(-931515354);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC2 = t1c.c(graVar, z3);
            int iHashCode3 = Long.hashCode(tgp1.l(b0kVar));
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(b0kVar, qim0VarB);
            hzj.A.getClass();
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, b0kVar, lljVar4);
            nko1.H(xos0VarM3, b0kVar, lljVar3);
            i3a.l(iHashCode3, b0kVar, lljVar2, b0kVar);
            nko1.H(qim0VarE3, b0kVar, lljVar);
            String strA2 = a101Var.a();
            era eraVar4 = a101Var.d() ? eraVar : eraVar2;
            int iC = l1d.C(a101Var.c());
            int i = 2;
            if (iC != 0) {
                if (iC == 1) {
                    i = 4;
                } else if (iC != 2) {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    i = 4;
                } else {
                    i = 6;
                }
            }
            boolean zG2 = x340Var.g(iu30Var) | x340Var.i(gxz0Var);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new zkz0(iu30Var, gxz0Var, (byte) 3);
                x340Var.s0(objT2);
            }
            otw.c(this.i, new eqm(strA2, eraVar4, i, (Function0) objT2), null, null, b0kVar, 0, 12);
            x340Var.r(true);
            x340Var.r(z3);
        } else {
            x340Var.i0(-930504382);
            x340Var.r(z3);
        }
        x340Var.r(true);
        return rih1.a;
    }
}
