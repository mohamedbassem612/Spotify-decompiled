package p;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qlu extends x6 {
    public final Iterator c;
    public final iu30 d;
    public final HashSet e = new HashSet();

    public qlu(Iterator it, iu30 iu30Var) {
        this.c = it;
        this.d = iu30Var;
    }

    @Override // p.x6
    public final void a() {
        Object next;
        do {
            Iterator it = this.c;
            if (!it.hasNext()) {
                this.a = (byte) 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.e.add(this.d.invoke(next)));
        this.b = next;
        this.a = (byte) 1;
    }
}
