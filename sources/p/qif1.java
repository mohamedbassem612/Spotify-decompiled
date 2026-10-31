package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qif1 implements nif1 {
    public final aip0 a;
    public final ocp0 b;
    public final bk20 c;
    public final ReentrantLock d = new ReentrantLock();
    public final wny0 e;
    public final ArrayList f;
    public boolean g;
    public boolean h;
    public final String i;
    public final int j;

    public qif1(String str, aip0 aip0Var, Long l, ocp0 ocp0Var, bk20 bk20Var) {
        this.a = aip0Var;
        this.b = ocp0Var;
        this.c = bk20Var;
        this.e = new wny0(UUID.randomUUID(), str, l != null ? l.longValue() : aip0Var.a(), 0L, (CopyOnWriteArrayList) null, 56);
        this.f = new ArrayList();
        String strConcat = "oops:".concat(str);
        this.i = strConcat;
        this.j = bk20Var.a(strConcat);
    }

    @Override // p.nif1
    public final void a(long j) {
        f(Long.valueOf(j));
    }

    @Override // p.nif1
    public final long b() {
        return this.e.c;
    }

    @Override // p.nif1
    public final wma1 c(Long l, String str) {
        wny0 wny0Var = this.e;
        if (u890.j(wny0Var.b, "app.start") && w8p1.p().contains(str)) {
            return uco0.a;
        }
        xma1 xma1Var = new xma1(str, this.a, 0L, 0L, this.c, wny0Var.b, 12);
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.f.add(xma1Var);
            return xma1Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p.nif1
    public final wma1 d(long j, long j2, String str) {
        xma1 xma1Var = new xma1(str, this.a, j, j2, null, null, 112);
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.f.add(xma1Var);
            return xma1Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p.nif1
    public final void e(String str) {
        Object objPrevious;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.f;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!u890.j(((xma1) objPrevious).a, str));
            xma1 xma1Var = (xma1) objPrevious;
            if (xma1Var != null) {
                xma1Var.a(null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(Long l) {
        if (this.g) {
            return;
        }
        this.g = true;
        this.c.b(this.i, this.j);
        this.b.invoke();
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.f;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((xma1) it.next()).f);
            }
            reentrantLock.unlock();
            if (this.h) {
                aip0 aip0Var = this.a;
                long jLongValue = l != null ? l.longValue() : aip0Var.a();
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(arrayList2);
                wny0 wny0Var = this.e;
                aip0Var.b(new wny0(wny0Var.a, wny0Var.b, wny0Var.c, jLongValue, wny0Var.e, copyOnWriteArrayList));
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p.nif1
    public final UUID getId() {
        return this.e.a;
    }

    @Override // p.nif1
    public final String getKey() {
        return this.e.b;
    }

    @Override // p.nif1
    public final void setAttribute(String str, String str2) {
        this.e.e.put(str, str2);
    }

    @Override // p.nif1
    public final void stop() {
        f(null);
    }
}
