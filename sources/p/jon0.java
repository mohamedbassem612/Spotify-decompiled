package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jon0 implements nku {
    public final /* synthetic */ tob1 a;
    public final /* synthetic */ uvj b;

    public jon0(tob1 tob1Var, uvj uvjVar) {
        this.a = tob1Var;
        this.b = uvjVar;
    }

    @Override // p.nku
    public final void dispose() {
        Iterator it = ((List) this.a.getValue()).iterator();
        while (it.hasNext()) {
            this.b.m((hnn0) it.next());
        }
    }
}
