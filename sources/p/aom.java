package p;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aom implements nif1 {
    public final String a;
    public final aip0 b;
    public final bk20 c;
    public final long e;
    public final UUID d = UUID.randomUUID();
    public final ReentrantLock f = new ReentrantLock();
    public final ArrayList g = new ArrayList();

    public aom(String str, aip0 aip0Var, bk20 bk20Var) {
        this.a = str;
        this.b = aip0Var;
        this.c = bk20Var;
        this.e = aip0Var.a();
    }

    @Override // p.nif1
    public final long b() {
        return this.e;
    }

    @Override // p.nif1
    public final wma1 c(Long l, String str) {
        aip0 aip0Var = this.b;
        bk20 bk20Var = this.c;
        xma1 xma1Var = l != null ? new xma1(str, aip0Var, l.longValue(), 0L, bk20Var, this.a, 8) : new xma1(str, aip0Var, 0L, 0L, bk20Var, this.a, 12);
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.g.add(xma1Var);
            return xma1Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p.nif1
    public final wma1 d(long j, long j2, String str) {
        xma1 xma1Var = new xma1(str, this.b, j, j2, null, null, 112);
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.g.add(xma1Var);
            return xma1Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p.nif1
    public final void e(String str) {
        Object objPrevious;
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            ArrayList arrayList = this.g;
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

    @Override // p.nif1
    public final UUID getId() {
        return this.d;
    }

    @Override // p.nif1
    public final String getKey() {
        return this.a;
    }

    @Override // p.nif1
    public final void stop() {
    }

    @Override // p.nif1
    public final void a(long j) {
    }

    @Override // p.nif1
    public final void setAttribute(String str, String str2) {
    }
}
