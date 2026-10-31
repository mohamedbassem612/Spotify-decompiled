package p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hsi0 implements dsi0 {
    public final ec80 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public hsi0(ec80 ec80Var) {
        this.a = ec80Var;
    }

    public final void a(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        if (i == 10) {
            b(copyOnWriteArrayList);
        } else {
            if (i != 15) {
                return;
            }
            b(copyOnWriteArrayList);
            b(this.c);
        }
    }

    public final void b(CopyOnWriteArrayList copyOnWriteArrayList) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((isi0) it.next()).a();
            } catch (Exception e) {
                this.a.a.a(e);
            }
        }
    }
}
