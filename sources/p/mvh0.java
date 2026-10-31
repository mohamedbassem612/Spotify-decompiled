package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class mvh0 extends nvh0 {
    public final Object a = new Object();
    public Executor b;
    public lvh0 c;
    public gvh0 d;
    public ArrayList e;

    public final void k(gvh0 gvh0Var, Collection collection) {
        if (gvh0Var == null) {
            bhn0.i("groupRoute must not be null");
            return;
        }
        if (collection == null) {
            bhn0.i("dynamicRoutes must not be null");
            return;
        }
        synchronized (this.a) {
            try {
                Executor executor = this.b;
                if (executor != null) {
                    executor.execute(new ivh0(this, this.c, gvh0Var, collection, (byte) 1));
                } else {
                    this.d = gvh0Var;
                    this.e = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(Executor executor, lvh0 lvh0Var) {
        synchronized (this.a) {
            try {
                if (executor == null) {
                    throw new NullPointerException("Executor shouldn't be null");
                }
                if (lvh0Var == null) {
                    throw new NullPointerException("Listener shouldn't be null");
                }
                this.b = executor;
                this.c = lvh0Var;
                ArrayList arrayList = this.e;
                if (arrayList != null && !arrayList.isEmpty()) {
                    gvh0 gvh0Var = this.d;
                    ArrayList arrayList2 = this.e;
                    this.d = null;
                    this.e = null;
                    this.b.execute(new ivh0(this, lvh0Var, gvh0Var, arrayList2, (byte) 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(String str) {
    }

    public void m(String str) {
    }

    public void n(List list) {
    }
}
