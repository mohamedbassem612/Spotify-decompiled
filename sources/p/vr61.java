package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vr61 implements tr61 {
    public final jr61 b;
    public final qs61 c;
    public final opq d;
    public final ppq e;
    public final qpq f;
    public final rpq g;
    public final spq h;
    public final v9b0 i;
    public final ylu j;
    public final n881 k;

    public vr61(jr61 jr61Var, qs61 qs61Var, opq opqVar, ppq ppqVar, qpq qpqVar, rpq rpqVar, spq spqVar, v9b0 v9b0Var, ylu yluVar, n881 n881Var) {
        this.b = jr61Var;
        this.c = qs61Var;
        this.d = opqVar;
        this.e = ppqVar;
        this.f = qpqVar;
        this.g = rpqVar;
        this.h = spqVar;
        this.i = v9b0Var;
        this.j = yluVar;
        this.k = n881Var;
    }

    public final uqz0 a(mr61 mr61Var) {
        tr61.a.getClass();
        tqz0 tqz0Var = sr61.b;
        this.b.getClass();
        zq61 zq61Var = mr61Var.d;
        List list = zq61Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                int i2 = zq61Var.b;
                int i3 = zq61Var.a;
                ArrayList arrayListI = pqo.i(new ur61(this, mr61Var, (byte) 0));
                ArrayList arrayListI2 = pqo.i(new ur61(this, mr61Var, (byte) 1));
                uqz0 uqz0Var = uqz0.t;
                return new uqz0(arrayList, yoi1.Q(i3, arrayList.size() + i3), i2, arrayListI, arrayListI2, c6t0.a, tqz0Var);
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            i281 i281Var = (i281) next;
            if (!i281Var.g || mr61Var.c.b || i281Var.e) {
                z = false;
            }
            arrayList.add(new a781(i281Var, z, i));
            i = i4;
        }
    }
}
