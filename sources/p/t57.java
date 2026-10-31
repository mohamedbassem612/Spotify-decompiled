package p;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t57 {
    public final c67 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public t57(t380 t380Var, c67 c67Var) {
        this.a = c67Var;
        HashSet hashSet = new HashSet();
        Iterator it = t380Var.iterator();
        while (it.hasNext()) {
            q57 q57Var = (q57) it.next();
            String str = q57Var.a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (hashSet.contains(lowerCase)) {
                hhg1.f(f4i1.f("Assets with duplicate names are not allowed (", str, ")"));
                throw null;
            }
            hashSet.add(lowerCase);
            this.b.put(str, q57Var);
            this.c.put(str, i67.a);
        }
    }
}
