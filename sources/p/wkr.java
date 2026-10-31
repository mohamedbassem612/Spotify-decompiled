package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wkr implements y2e {
    public final Set a;
    public final y2g0 b;
    public final n0s c;

    public wkr(Set set, y2g0 y2g0Var, n0s n0sVar) {
        this.a = set;
        this.b = y2g0Var;
        this.c = n0sVar;
    }

    public final void start() {
        if (this.c.a() instanceof c450) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.a(new z5o((x2e) it.next(), (byte) 26));
            }
        }
    }

    public final void stop() {
        if (this.c.a() instanceof c450) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.a(new d4e((x2e) it.next(), (byte) 13));
            }
        }
    }
}
