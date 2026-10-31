package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class suc0 implements n8d0 {
    public ArrayList a;
    public ArrayList b;
    public final boolean c;
    public final AtomicInteger d;
    public final pzc e = upn1.t(new ruc0(this, (byte) 0));
    public mzc f;

    public suc0(ArrayList arrayList, boolean z, n5u n5uVar) {
        this.a = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.c = z;
        this.d = new AtomicInteger(arrayList.size());
        b(new an90(this, (byte) 4), n5u.a());
        if (this.a.isEmpty()) {
            this.f.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add(null);
        }
        ArrayList arrayList2 = this.a;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            n8d0 n8d0Var = (n8d0) arrayList2.get(i2);
            n8d0Var.b(new wr3(this, i2, n8d0Var, (byte) 7, false), n5uVar);
        }
    }

    public final void b(Runnable runnable, Executor executor) {
        this.e.b.b(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n8d0) it.next()).cancel(z);
            }
        }
        return this.e.cancel(z);
    }

    public final Object get() throws InterruptedException {
        ArrayList<n8d0> arrayList = this.a;
        if (arrayList != null && !isDone()) {
            loop0: for (n8d0 n8d0Var : arrayList) {
                while (!n8d0Var.isDone()) {
                    try {
                        n8d0Var.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.c) {
                            return (List) this.e.b.get();
                        }
                    }
                }
            }
        }
        return (List) this.e.b.get();
    }

    public final boolean isCancelled() {
        return this.e.isCancelled();
    }

    public final boolean isDone() {
        return this.e.b.isDone();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.e.b.get(j, timeUnit);
    }
}
