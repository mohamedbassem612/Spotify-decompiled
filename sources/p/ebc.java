package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ebc {
    public final g520 a;
    public Long b;
    public final c4z c;
    public final Scheduler d;
    public long e;
    public final vku f = new vku();
    public h520 g;
    public int h;
    public final ReentrantLock i;
    public final Condition j;
    public final n36 k;
    public boolean l;

    public ebc(long j, g520 g520Var, Long l, c4z c4zVar, Scheduler scheduler) {
        this.a = g520Var;
        this.b = l;
        this.c = c4zVar;
        this.d = scheduler;
        this.e = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.i = reentrantLock;
        this.j = reentrantLock.newCondition();
        this.k = new n36();
        b(g520Var.a * 1024);
        if (this.b == null) {
            a();
        }
    }

    public final void a() {
        n36 n36Var = this.k;
        ReentrantLock reentrantLock = this.i;
        reentrantLock.lock();
        try {
            try {
                b(this.a.b * 1024);
                while (n36Var.isEmpty()) {
                    this.j.await();
                }
                h520 h520Var = (h520) n36Var.removeFirst();
                this.g = h520Var;
                h520Var.getClass();
                this.h = (int) h520Var.a.f;
                reentrantLock.unlock();
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(int i) {
        long size;
        vku vkuVar = this.f;
        n36 n36Var = this.k;
        ReentrantLock reentrantLock = this.i;
        reentrantLock.lock();
        try {
            try {
                if (vkuVar.a.i() == 1) {
                    reentrantLock.unlock();
                    return;
                }
                h520 h520Var = (h520) n36Var.k();
                if (h520Var != null) {
                    g1r g1rVar = h520Var.a;
                    long size2 = g1rVar.a + ((long) g1rVar.b.size());
                    Long l = this.b;
                    if (l != null && size2 == l.longValue()) {
                        reentrantLock.unlock();
                        return;
                    }
                }
                Iterator it = n36Var.iterator();
                int iAvailable = 0;
                while (it.hasNext()) {
                    iAvailable += ((h520) it.next()).b.available();
                }
                if (iAvailable > this.a.c * 1024) {
                    reentrantLock.unlock();
                    return;
                }
                h520 h520Var2 = (h520) n36Var.k();
                if (h520Var2 != null) {
                    g1r g1rVar2 = h520Var2.a;
                    size = g1rVar2.a + ((long) g1rVar2.b.size());
                } else {
                    size = this.e;
                }
                Disposable disposableSubscribe = ((Observable) this.c.invoke(Long.valueOf(size), Long.valueOf(((long) i) + size))).observeOn(this.d).onErrorComplete(vap1.Z).subscribe(new mba(this, (byte) 10));
                disposableSubscribe.getClass();
                vkuVar.a(disposableSubscribe);
                reentrantLock.unlock();
                return;
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
        reentrantLock.unlock();
        throw th;
    }

    public final rb01 c(int i, byte[] bArr, int i2) throws IOException {
        long j = this.e;
        Long l = this.b;
        if (j >= (l != null ? l.longValue() : Long.MAX_VALUE)) {
            return new rb01(-1, 0, 0, this.l);
        }
        if (this.g == null) {
            a();
        }
        h520 h520Var = this.g;
        h520Var.getClass();
        int i3 = h520Var.a.e;
        h520 h520Var2 = this.g;
        if (i3 != 1) {
            h520Var2.getClass();
            k220.i("File streamer error: ".concat(eqq.x(h520Var2.a.e)));
            return null;
        }
        h520Var2.getClass();
        int i4 = h520Var2.b.read(bArr, i, i2);
        int iMin = Math.min(this.h, i4);
        this.h -= iMin;
        this.e += (long) i4;
        h520 h520Var3 = this.g;
        h520Var3.getClass();
        if (h520Var3.b.available() == 0) {
            this.g = null;
        }
        return new rb01(i4, i4 - iMin, iMin, this.l);
    }
}
