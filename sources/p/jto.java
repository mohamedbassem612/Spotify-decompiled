package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jto implements kku {
    public final ArrayList a;
    public final kdn0 b;
    public final iu30 c;
    public final int d;

    public jto(ArrayList arrayList, kdn0 kdn0Var, qwc1 qwc1Var, int i) {
        this.a = arrayList;
        this.b = kdn0Var;
        this.c = qwc1Var;
        this.d = i;
    }

    public final void dispose() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ito) it.next()).c.destroy();
        }
    }
}
