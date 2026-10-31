package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jtc0 extends ntc0 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, int i, long j) {
        hvb0 hvb0VarH;
        ojh1 ojh1Var = (List) clh1.j(j, obj);
        if (ojh1Var.isEmpty()) {
            if (ojh1Var instanceof mvb0) {
                hvb0VarH = new hvb0(i);
            } else {
                hvb0VarH = ((ojh1Var instanceof nnw0) && (ojh1Var instanceof g290)) ? ((g290) ojh1Var).h(i) : new ArrayList(i);
            }
            clh1.p(obj, j, hvb0VarH);
            return hvb0VarH;
        }
        if (c.isAssignableFrom(ojh1Var.getClass())) {
            ArrayList arrayList = new ArrayList(ojh1Var.size() + i);
            arrayList.addAll(ojh1Var);
            clh1.p(obj, j, arrayList);
            return arrayList;
        }
        if (ojh1Var instanceof ojh1) {
            ojh1 ojh1Var2 = ojh1Var;
            hvb0 hvb0Var = new hvb0(ojh1Var2.size() + i);
            hvb0Var.addAll(ojh1Var2);
            clh1.p(obj, j, hvb0Var);
            return hvb0Var;
        }
        if ((ojh1Var instanceof nnw0) && (ojh1Var instanceof g290)) {
            g290 g290Var = (g290) ojh1Var;
            if (!((h9) g290Var).a) {
                g290 g290VarH = g290Var.h(ojh1Var.size() + i);
                clh1.p(obj, j, g290VarH);
                return g290VarH;
            }
        }
        return ojh1Var;
    }
}
