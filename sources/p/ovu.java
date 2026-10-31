package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ovu implements xpw {
    public final wxu a;
    public final List b;
    public final kly0 c;
    public final kly0 d;
    public final ljm0 e;
    public final ia00 f = n3o1.q(this).a(riu.Z, riu.N0);
    public final psw g;

    public ovu(wxu wxuVar, List list, o8n o8nVar, jly0 jly0Var, jly0 jly0Var2) {
        this.a = wxuVar;
        this.b = list;
        this.c = jly0Var;
        this.d = jly0Var2;
        this.e = h7w.B(new s20(this, (byte) 17), o8nVar, (iu30) null, new k9s(this, (byte) 11), 4);
        j2i j2iVarJ = apo.j(-2122441150, new m04(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVarJ, (byte) 0);
    }

    public static boolean g(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((qlq0) it.next()) instanceof plq0) {
                return true;
            }
        }
        return false;
    }

    @Override // p.avl1
    public final rqw a() {
        return this.f;
    }

    @Override // p.maa
    public final jsw c() {
        return this.g;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    public final void e(ivu ivuVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        iu30 iu30Var2;
        x340 x340Var;
        f1v f1vVar;
        f1v k1vVar;
        boolean zI;
        Object objT;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2045212639);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(ivuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var2.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(this) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            u601 u601VarC = gfe0.c(x340Var2);
            if (g(ivuVar.c())) {
                f1vVar = f1v.a;
            } else {
                e2v e2vVarD = ivuVar.d();
                if (e2vVarD.equals(c2v.a)) {
                    f1vVar = i1v.a;
                } else if (e2vVarD.equals(d2v.a)) {
                    f1vVar = l1v.a;
                } else {
                    if (e2vVarD instanceof e2v) {
                        k1vVar = new k1v(Float.valueOf(e2vVarD.a()));
                    } else if (e2vVarD.equals(f2v.a)) {
                        f1vVar = h1v.a;
                    } else {
                        if (!e2vVarD.equals(g2v.a)) {
                            eg.o();
                            return;
                        }
                        f1vVar = n1v.a;
                    }
                    sru sruVar = new sru(k1vVar, ivuVar.b(), (String) null, ivuVar.a(), 4);
                    qim0 qim0VarN = anm1.N("download_element_button", nim0.a);
                    zI = x340Var2.i(u601VarC) | x340Var2.i(this) | x340Var2.i(ivuVar) | ((i2 & 112) == 32);
                    objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        jzm jzmVar = new jzm(u601VarC, this, ivuVar, iu30Var2, (byte) 7);
                        x340Var2.s0(jzmVar);
                        objT = jzmVar;
                    }
                    x340Var = x340Var2;
                    hqq0.f(sruVar, smo1.C((Function0) objT), qim0VarN, x340Var, 0, 0);
                }
            }
            k1vVar = f1vVar;
            sru sruVar2 = new sru(k1vVar, ivuVar.b(), (String) null, ivuVar.a(), 4);
            qim0 qim0VarN2 = anm1.N("download_element_button", nim0.a);
            zI = x340Var2.i(u601VarC) | x340Var2.i(this) | x340Var2.i(ivuVar) | ((i2 & 112) == 32);
            objT = x340Var2.T();
            if (zI) {
                jzm jzmVar2 = new jzm(u601VarC, this, ivuVar, iu30Var2, (byte) 7);
                x340Var2.s0(jzmVar2);
                objT = jzmVar2;
            } else {
                jzm jzmVar3 = new jzm(u601VarC, this, ivuVar, iu30Var2, (byte) 7);
                x340Var2.s0(jzmVar3);
                objT = jzmVar3;
            }
            x340Var = x340Var2;
            hqq0.f(sruVar2, smo1.C((Function0) objT), qim0VarN2, x340Var, 0, 0);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(this, ivuVar, iu30Var, i, (byte) 6);
        }
    }

    public final slq0 f(ArrayList arrayList, mlq0 mlq0Var) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            nlq0 nlq0Var = (qlq0) it.next();
            if ((nlq0Var instanceof nlq0) && nlq0Var.a().contains(mlq0Var)) {
                return (slq0) o7h.t0(i, this.b);
            }
            i++;
        }
        i = -1;
        return (slq0) o7h.t0(i, this.b);
    }

    @Override // p.maa
    public final mqw getBehavior() {
        return this.e;
    }
}
