package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ysl extends hab0 implements zu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ List b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ maa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ysl(float f, List list, int i, maa maaVar) {
        super(4);
        this.a = f;
        this.b = list;
        this.c = i;
        this.d = maaVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        boolean z = false;
        mbh mbhVarA = jbh.a(new d36(this.a, true, new um5(false)), een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z2 = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z2) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, lljVar4);
        nko1.H(xos0VarM, x340Var, lljVar3);
        nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, lljVar);
        x340Var3.i0(418836711);
        Iterator it = ((Iterable) this.b.get(iIntValue)).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            qim0 qim0Var = ctl.a;
            int i3 = iIntValue2;
            gfh0 gfh0VarC = t1c.c(een.d, z);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            x340Var3.m0();
            Iterator it2 = it;
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar4);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
            nko1.F(x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar);
            boolean z3 = (((i3 & 112) ^ 48) > 32 && x340Var3.e(iIntValue)) || (i3 & 48) == 32;
            byte b = this.c;
            boolean zE = z3 | x340Var3.e(b) | x340Var3.e(i);
            Object objT = x340Var3.T();
            if (zE || objT == fkj0.X) {
                objT = new wsl(iIntValue, b, i);
                x340Var3.s0(objT);
            }
            dgo1.c(next, (iu30) objT, apo.r(859995866, new xsl(this.d, next, (byte) 0), x340Var), x340Var, 384);
            x340Var3.r(true);
            iIntValue2 = i3;
            z = false;
            it = it2;
            i = i2;
        }
        x340Var3.r(z);
        x340Var3.r(true);
        return rih1.a;
    }
}
