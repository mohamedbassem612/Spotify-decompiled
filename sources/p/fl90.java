package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fl90 {
    public final yzc0 a;
    public final d0r b;
    public final koc0 c;
    public final bk90 d;
    public final xi90 e;
    public final yk90 f;

    public fl90(yzc0 yzc0Var, d0r d0rVar, koc0 koc0Var, ur00 ur00Var, xi90 xi90Var, List list, wmy wmyVar, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12) {
        this.a = yzc0Var;
        this.b = d0rVar;
        this.c = koc0Var;
        this.d = (bk90) ur00Var.c;
        this.e = xi90Var;
        j2i j2iVar = nti.a;
        Float fValueOf = null;
        if (list.isEmpty()) {
            hhg1.n("The title slot needs to be provided by at least one accepting plugin.");
            throw null;
        }
        xk90 xk90Var = new xk90(list, j2iVar, wmyVar);
        xk90 xk90VarE = ur00.E(list2, nti.b, wmyVar);
        xk90 xk90VarE2 = ur00.E(list3, nti.c, wmyVar);
        xk90 xk90VarE3 = ur00.E(list4, nti.d, wmyVar);
        xk90 xk90VarE4 = ur00.E(list5, nti.e, wmyVar);
        xk90 xk90VarE5 = ur00.E(list6, nti.f, wmyVar);
        xk90 xk90VarE6 = ur00.E(list7, nti.g, wmyVar);
        xk90 xk90VarE7 = ur00.E(list8, nti.h, wmyVar);
        xk90 xk90VarE8 = ur00.E(list9, nti.i, wmyVar);
        xk90 xk90VarE9 = ur00.E(list10, nti.j, wmyVar);
        xk90 xk90VarE10 = ur00.E(list11, nti.k, wmyVar);
        Iterator it = list5.iterator();
        if (it.hasNext()) {
            float fB = ((nk90) ((s1v0) it.next()).b).b();
            while (it.hasNext()) {
                fB = Math.max(fB, ((nk90) ((s1v0) it.next()).b).b());
            }
            fValueOf = Float.valueOf(fB);
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        List list13 = list12;
        ArrayList arrayList = new ArrayList(q7h.U(list13, 10));
        Iterator it2 = list13.iterator();
        while (it2.hasNext()) {
            arrayList.add(new xk90(Collections.singletonList((s1v0) it2.next()), nti.l, wmyVar));
            it2 = it2;
            fFloatValue = fFloatValue;
        }
        this.f = new yk90(xk90VarE, xk90VarE3, xk90Var, xk90VarE2, xk90VarE7, xk90VarE4, xk90VarE5, xk90VarE6, xk90VarE8, xk90VarE9, xk90VarE10, arrayList, fFloatValue);
    }
}
