package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dt30 {
    public final Executor a;
    public final d0i b;
    public int d;
    public boolean e;
    public boolean f;
    public final Object c = new Object();
    public final ArrayList g = new ArrayList();
    public final fss h = new fss(this, (byte) 26);

    public dt30(Executor executor, d0i d0iVar) {
        this.a = executor;
        this.b = d0iVar;
    }

    public final void a() {
        synchronized (this.c) {
            if (!this.f) {
                this.d++;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.f = true;
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.f;
        }
        return z;
    }

    public final void d() {
        int i;
        synchronized (this.c) {
            if (!this.f && (i = this.d) > 0) {
                int i2 = i - 1;
                this.d = i2;
                if (!this.e && i2 == 0) {
                    this.e = true;
                    this.a.execute(this.h);
                }
            }
        }
    }
}
