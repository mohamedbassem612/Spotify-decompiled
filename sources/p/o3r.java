package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o3r implements f4r {
    public final List a;
    public final iu30 b;
    public final boolean c;
    public final znb0 d = dm5.S(3, new z5o(this, (byte) 9));

    public o3r(List list, iu30 iu30Var, boolean z) {
        this.a = list;
        this.b = iu30Var;
        this.c = z;
    }

    @Override // p.f4r
    public final f1r a(Object obj) {
        int i;
        e1r e1rVar;
        fkj0 fkj0Var = fkj0.R0;
        List list = this.a;
        List<l4r> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (l4r l4rVar : list2) {
            k4r k4rVar = l4rVar.d;
            int i2 = l4rVar.b;
            int i3 = 1;
            if (k4rVar instanceof j4r) {
                zjd1 zjd1Var = l4rVar.a;
                Object objInvoke = ((j4r) k4rVar).c.invoke(obj);
                if (objInvoke == null) {
                    objInvoke = fkj0Var;
                }
                jh5 jh5Var = new jh5(zjd1Var, objInvoke);
                int iC = l1d.C(i2);
                if (iC != 0) {
                    if (iC == 1) {
                        i3 = 2;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i3 = 3;
                    }
                }
                e1rVar = new e1r(jh5Var, i3, l4rVar.c);
            } else {
                if (!(k4rVar instanceof k4r)) {
                    eg.o();
                    return null;
                }
                k4r k4rVar2 = k4rVar;
                zjd1 zjd1VarB = ((opa0) o7h.q0(k4rVar2.H().a())).b();
                Object objInvoke2 = k4rVar2.G().invoke(obj);
                if (objInvoke2 == null) {
                    objInvoke2 = fkj0Var;
                }
                jh5 jh5Var2 = new jh5(zjd1VarB, objInvoke2);
                int iC2 = l1d.C(i2);
                if (iC2 == 0) {
                    i = 1;
                } else if (iC2 == 1) {
                    i = 2;
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    i = 3;
                }
                e1rVar = new e1r(jh5Var2, i, k4rVar2.H(), l4rVar.a, l4rVar.c);
            }
            arrayList.add(e1rVar);
        }
        return new n4r(arrayList, this.c, list.size(), this.b);
    }

    public final List b() {
        return (List) this.d.getValue();
    }

    public final String toString() {
        return "DataStatement(items=" + o7h.y0(this.a, ", ", null, null, null, 62) + ", shouldFailOptionalOnError=" + this.c + ")";
    }
}
