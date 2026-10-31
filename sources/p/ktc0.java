package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ktc0 extends ptc0 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, int i, long j) {
        kvb0 kvb0VarH;
        i290 i290Var = (List) elh1.j(j, obj);
        if (i290Var.isEmpty()) {
            if (i290Var instanceof pvb0) {
                kvb0VarH = new kvb0(i);
            } else {
                kvb0VarH = ((i290Var instanceof pnw0) && (i290Var instanceof i290)) ? i290Var.h(i) : new ArrayList(i);
            }
            elh1.p(obj, j, kvb0VarH);
            return kvb0VarH;
        }
        if (c.isAssignableFrom(i290Var.getClass())) {
            ArrayList arrayList = new ArrayList(i290Var.size() + i);
            arrayList.addAll(i290Var);
            elh1.p(obj, j, arrayList);
            return arrayList;
        }
        if (i290Var instanceof rjh1) {
            rjh1 rjh1Var = (rjh1) i290Var;
            kvb0 kvb0Var = new kvb0(rjh1Var.size() + i);
            kvb0Var.addAll(rjh1Var);
            elh1.p(obj, j, kvb0Var);
            return kvb0Var;
        }
        if ((i290Var instanceof pnw0) && (i290Var instanceof i290)) {
            i290 i290Var2 = i290Var;
            if (!((j9) i290Var2).c()) {
                i290 i290VarH = i290Var2.h(i290Var.size() + i);
                elh1.p(obj, j, i290VarH);
                return i290VarH;
            }
        }
        return i290Var;
    }
}
