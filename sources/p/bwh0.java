package p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bwh0 {
    public final idd1 a;

    public bwh0(ynb0 ynb0Var) {
        this.a = new idd1(new dl3(ynb0Var, (byte) 5));
    }

    public final void a() {
        Iterator it = ((Set) this.a.getValue()).iterator();
        while (it.hasNext()) {
            ((awh0) it.next()).b();
        }
    }

    public final void b() {
        Iterator it = ((Set) this.a.getValue()).iterator();
        while (it.hasNext()) {
            ((awh0) it.next()).a();
        }
    }
}
