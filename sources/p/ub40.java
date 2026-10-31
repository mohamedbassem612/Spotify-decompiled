package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ub40 implements Update {
    public final Next a(Object obj, Object obj2) {
        lc40 lc40Var;
        wb40 wb40Var = (wb40) obj;
        rb40 rb40Var = (rb40) obj2;
        Map map = wb40Var.d;
        int i = wb40Var.b;
        boolean z = rb40Var instanceof ob40;
        wa40 wa40Var = wa40.e;
        if (z) {
            return Next.a(f46.S0(new v8r[]{new ya40(i), wa40Var}));
        }
        if (rb40Var.equals(jb40.a)) {
            return Next.a(Collections.singleton(wa40Var));
        }
        if (rb40Var.equals(mb40.a)) {
            LinkedHashMap linkedHashMapA = va20.a(wb40Var);
            return linkedHashMapA.isEmpty() ? Next.a(Collections.singleton(wa40Var)) : Next.i(wb40.a(wb40Var, null, 47), Collections.singleton(new ab40(wb40Var.a, linkedHashMapA)));
        }
        if (rb40Var.equals(pb40.a)) {
            return Next.a(Collections.singleton(new xa40(wb40Var.f)));
        }
        if (rb40Var instanceof lb40) {
            xkg0 xkg0Var = new xkg0();
            xkg0Var.putAll(map);
            xkg0Var.put(((lb40) rb40Var).b, Boolean.TRUE);
            return Next.h(wb40.a(wb40Var, xkg0Var.b(), 55));
        }
        if (rb40Var instanceof qb40) {
            xkg0 xkg0Var2 = new xkg0();
            xkg0Var2.putAll(map);
            xkg0Var2.put(((qb40) rb40Var).b, Boolean.FALSE);
            return Next.h(wb40.a(wb40Var, xkg0Var2.b(), 55));
        }
        if (!rb40Var.equals(kb40.a)) {
            if (rb40Var.equals(nb40.a)) {
                return Next.a(Collections.singleton(wa40Var));
            }
            eg.o();
            return null;
        }
        LinkedHashMap linkedHashMapA2 = va20.a(wb40Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(linkedHashMapA2.size()));
        for (Map.Entry entry : linkedHashMapA2.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = wb40Var.c.iterator();
            do {
                if (!it.hasNext()) {
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
                lc40Var = (lc40) it.next();
            } while (!lc40Var.a.equals(str));
            linkedHashMap.put(lc40Var.b, entry.getValue());
        }
        return Next.a(f46.S0(new v8r[]{new za40(i, linkedHashMap), wa40Var}));
    }
}
