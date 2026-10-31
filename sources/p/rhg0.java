package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rhg0 {
    public final d0r a;
    public final ukj0 b;
    public int d;
    public final HashMap c = new HashMap();
    public final Object e = new Object();

    public rhg0(d0r d0rVar, ukj0 ukj0Var) {
        this.a = d0rVar;
        this.b = ukj0Var;
    }

    public final void a(Set set, ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.e) {
            try {
                if (this.b != null) {
                    set.size();
                }
                int i = this.d + 1;
                this.d = i;
                if (arrayList != null) {
                    arrayList.clear();
                }
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                this.a.f(new qhg0(set, this, i, arrayList, arrayList2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
