package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rv30 extends xw81 {
    public rv30(n9r n9rVar, rv30 rv30Var, int i, boolean z) {
        super(n9rVar, rv30Var, rzs0.g, dmq0.g, i, mka1.m0);
        this.N0 = true;
        this.V0 = z;
        this.W0 = false;
    }

    @Override // p.qv30, p.ov30
    public final boolean A() {
        return false;
    }

    @Override // p.qv30, p.zji0
    public final boolean isExternal() {
        return false;
    }

    @Override // p.qv30, p.ov30
    public final boolean isInline() {
        return false;
    }

    @Override // p.xw81, p.qv30
    public final qv30 y1(int i, fg5 fg5Var, n9r n9rVar, ov30 ov30Var, ajn0 ajn0Var, mka1 mka1Var) {
        return new rv30(n9rVar, (rv30) ov30Var, i, this.V0);
    }

    @Override // p.qv30
    public final qv30 z1(pv30 pv30Var) {
        ajn0 ajn0Var;
        rv30 rv30Var = (rv30) super.z1(pv30Var);
        if (rv30Var == null) {
            return null;
        }
        List listF = rv30Var.F();
        if ((listF instanceof Collection) && listF.isEmpty()) {
            return rv30Var;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            if (kbb.x(((tsi1) it.next()).getType()) != null) {
                List listF2 = rv30Var.F();
                ArrayList arrayList = new ArrayList(q7h.U(listF2, 10));
                Iterator it2 = listF2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(kbb.x(((tsi1) it2.next()).getType()));
                }
                int size = rv30Var.F().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    ArrayList<mmr0> arrayListV1 = o7h.v1(arrayList, rv30Var.F());
                    if (arrayListV1.isEmpty()) {
                        return rv30Var;
                    }
                    for (mmr0 mmr0Var : arrayListV1) {
                        if (!u890.j((ajn0) mmr0Var.a, ((tsi1) mmr0Var.b).getName())) {
                        }
                    }
                    return rv30Var;
                }
                List<tsi1> listF3 = rv30Var.F();
                ArrayList arrayList2 = new ArrayList(q7h.U(listF3, 10));
                for (tsi1 tsi1Var : listF3) {
                    ajn0 name = tsi1Var.getName();
                    int i = tsi1Var.g;
                    int i2 = i - size;
                    if (i2 >= 0 && (ajn0Var = (ajn0) arrayList.get(i2)) != null) {
                        name = ajn0Var;
                    }
                    arrayList2.add(tsi1Var.x1(rv30Var, name, i));
                }
                pv30 pv30VarC1 = rv30Var.C1(l1h1.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((ajn0) it3.next()) == null) {
                        }
                    }
                    z = false;
                }
                pv30VarC1.V0 = Boolean.valueOf(z);
                pv30VarC1.g = arrayList2;
                pv30VarC1.e = rv30Var.a();
                qv30 qv30VarZ1 = super.z1(pv30VarC1);
                qv30VarZ1.getClass();
                return qv30VarZ1;
            }
        }
        return rv30Var;
    }
}
