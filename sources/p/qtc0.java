package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qtc0 implements otc0 {
    public static final Class a = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, int i, long j) {
        ivb0 ivb0VarH;
        pjh1 pjh1Var = (List) dlh1.j(j, obj);
        if (pjh1Var.isEmpty()) {
            if (pjh1Var instanceof nvb0) {
                ivb0VarH = new ivb0(i);
            } else {
                ivb0VarH = ((pjh1Var instanceof onw0) && (pjh1Var instanceof h290)) ? ((h290) pjh1Var).h(i) : new ArrayList(i);
            }
            dlh1.q(obj, j, ivb0VarH);
            return ivb0VarH;
        }
        if (a.isAssignableFrom(pjh1Var.getClass())) {
            ArrayList arrayList = new ArrayList(pjh1Var.size() + i);
            arrayList.addAll(pjh1Var);
            dlh1.q(obj, j, arrayList);
            return arrayList;
        }
        if (pjh1Var instanceof pjh1) {
            pjh1 pjh1Var2 = pjh1Var;
            ivb0 ivb0Var = new ivb0(pjh1Var2.size() + i);
            ivb0Var.addAll(pjh1Var2);
            dlh1.q(obj, j, ivb0Var);
            return ivb0Var;
        }
        if ((pjh1Var instanceof onw0) && (pjh1Var instanceof h290)) {
            h290 h290Var = (h290) pjh1Var;
            if (!((i9) h290Var).a) {
                h290 h290VarH = h290Var.h(pjh1Var.size() + i);
                dlh1.q(obj, j, h290VarH);
                return h290VarH;
            }
        }
        return pjh1Var;
    }

    @Override // p.otc0
    public final void a(Object obj, long j, Object obj2) {
        List list = (List) dlh1.j(j, obj2);
        List listD = d(obj, list.size(), j);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        dlh1.q(obj, j, list);
    }

    @Override // p.otc0
    public final List b(long j, Object obj) {
        return d(obj, 10, j);
    }

    @Override // p.otc0
    public final void c(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) dlh1.j(j, obj);
        if (list instanceof nvb0) {
            objUnmodifiableList = ((nvb0) list).g();
        } else {
            if (a.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof onw0) && (list instanceof h290)) {
                i9 i9Var = (i9) ((h290) list);
                boolean z = i9Var.a;
                if (z && z) {
                    i9Var.a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        dlh1.q(obj, j, objUnmodifiableList);
    }
}
