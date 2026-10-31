package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ak9 {
    public final p900 a;
    public final epb b;

    public ak9(p900 p900Var, epb epbVar) {
        this.a = p900Var;
        this.b = epbVar;
    }

    public final void a(Set set) {
        set.toString();
        Set set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (((ee9) it.next()) instanceof ce9) {
                    if (this.b.isEnabled()) {
                        break;
                    }
                    n57.e("Attempted to register unified writable token characteristic while flag is disabled");
                    return;
                }
            }
        }
        this.a.accept(new pj9(set));
    }

    public final void b(Set set) {
        this.a.accept(new sj9(set));
    }
}
