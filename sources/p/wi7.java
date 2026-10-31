package p;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wi7 {
    public static final vi7 h = new vi7((byte) 0);
    public final x5j1 a;
    public final ow3 b;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;
    public final Executor c = h;

    public wi7(x5j1 x5j1Var, ow3 ow3Var) {
        this.a = x5j1Var;
        this.b = ow3Var;
    }

    public final void a(List list, Runnable runnable) {
        for (dmc0 dmc0Var : this.d) {
            dmc0Var.a.B(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f;
        x5j1 x5j1Var = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            x5j1Var.c(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.b.h().execute(new ui7(this, list2, list, i, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        x5j1Var.b(0, list.size());
        a(list3, runnable);
    }
}
