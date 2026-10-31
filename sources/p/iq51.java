package p;

import app.p000rive.semantics.SemanticState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.InterruptedIOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iq51 {
    public final ptu a;
    public final fxu b;
    public final String c;
    public final URL[] d;
    public final jq51 e;
    public final ggx0 f;
    public final mgc g;
    public final Scheduler h;
    public long i;
    public final vku j = new vku();
    public h520 k;
    public int l;
    public Long m;
    public boolean n;
    public Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReentrantLock f71p;
    public final Condition q;
    public final n36 r;

    public iq51(ptu ptuVar, fxu fxuVar, String str, URL[] urlArr, jq51 jq51Var, long j, ggx0 ggx0Var, mgc mgcVar, Scheduler scheduler) {
        this.a = ptuVar;
        this.b = fxuVar;
        this.c = str;
        this.d = urlArr;
        this.e = jq51Var;
        this.f = ggx0Var;
        this.g = mgcVar;
        this.h = scheduler;
        this.i = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f71p = reentrantLock;
        this.q = reentrantLock.newCondition();
        this.r = new n36();
        if (mgcVar != null) {
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) mgcVar.c).readLock();
            lock.lock();
            try {
                mp51 mp51Var = (mp51) ((lp51) mgcVar.d).get(str);
                ArrayList<g1r> arrayList = null;
                if (mp51Var != null) {
                    Collection collectionValues = mp51Var.a.tailMap(Long.valueOf(j)).values();
                    collectionValues.getClass();
                    g1r g1rVar = (g1r) o7h.r0(collectionValues);
                    if (g1rVar != null) {
                        long size = g1rVar.a;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : collectionValues) {
                            g1r g1rVar2 = (g1r) obj;
                            long j2 = g1rVar2.a;
                            boolean z = j2 == size;
                            size = z ? j2 + ((long) g1rVar2.b.size()) : size;
                            if (!z) {
                                break;
                            } else {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = arrayList2;
                    }
                }
                lock.unlock();
                if (arrayList != null) {
                    this.f71p.lock();
                    try {
                        for (g1r g1rVar3 : arrayList) {
                            this.r.addLast(new h520(g1rVar3));
                            this.m = g1rVar3.c;
                        }
                        this.f71p.unlock();
                    } catch (Throwable th) {
                        this.f71p.unlock();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }
        b(this.e.a * SemanticState.ReadOnly);
        if (this.m == null) {
            a();
        }
    }

    public final void a() {
        n36 n36Var = this.r;
        ReentrantLock reentrantLock = this.f71p;
        reentrantLock.lock();
        try {
            try {
                b(this.e.b * SemanticState.ReadOnly);
                while (n36Var.isEmpty()) {
                    this.q.await();
                }
                h520 h520Var = (h520) n36Var.removeFirst();
                this.k = h520Var;
                h520Var.getClass();
                this.l = (int) h520Var.a.f;
                reentrantLock.unlock();
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(int i) {
        vku vkuVar = this.j;
        n36 n36Var = this.r;
        ReentrantLock reentrantLock = this.f71p;
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
                    long size = g1rVar.a + ((long) g1rVar.b.size());
                    Long l = this.m;
                    if (l != null && size == l.longValue()) {
                        reentrantLock.unlock();
                        return;
                    }
                }
                Iterator it = n36Var.iterator();
                int iAvailable = 0;
                while (it.hasNext()) {
                    iAvailable += ((h520) it.next()).b.available();
                }
                if (iAvailable > this.e.c * SemanticState.ReadOnly) {
                    reentrantLock.unlock();
                    return;
                }
                o811 o811Var = new o811();
                o811Var.a = this.i;
                h520 h520Var2 = (h520) n36Var.k();
                if (h520Var2 != null) {
                    g1r g1rVar2 = h520Var2.a;
                    o811Var.a = g1rVar2.a + ((long) g1rVar2.b.size());
                }
                long j = o811Var.a;
                long j2 = j + ((long) i);
                Disposable disposableSubscribe = c(this.c, this.d, j, j2).observeOn(this.h).onErrorComplete(vbx0.t).subscribe(new hq51(this, (byte) 1), new gdu0(this, o811Var, j2, (byte) 1));
                disposableSubscribe.getClass();
                vkuVar.a(disposableSubscribe);
                reentrantLock.unlock();
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable c(String str, URL[] urlArr, long j, long j2) {
        Single singleDoOnSuccess;
        Integer num = this.o;
        if (num == null || (singleDoOnSuccess = Single.just(Integer.valueOf(num.intValue()))) == null) {
            singleDoOnSuccess = ((Single) this.f.invoke()).doOnSuccess(new hq51(this, (byte) 0));
        }
        return singleDoOnSuccess.toObservable().flatMap(new m3t0(this, str, urlArr, j, j2));
    }
}
