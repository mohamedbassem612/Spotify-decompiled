package p;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jog0 implements Iterator {
    public int a;
    public int b = -1;
    public nog0 c;
    public AtomicReferenceArray d;
    public log0 e;
    public hpg0 f;
    public hpg0 g;
    public final /* synthetic */ ipg0 h;
    public final /* synthetic */ byte i;

    public jog0(ipg0 ipg0Var, byte b) {
        this.i = b;
        this.h = ipg0Var;
        this.a = ipg0Var.c.length - 1;
        a();
    }

    public final void a() {
        this.f = null;
        if (e() || f()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            nog0[] nog0VarArr = this.h.c;
            this.a = i - 1;
            nog0 nog0Var = nog0VarArr[i];
            this.c = nog0Var;
            if (nog0Var.b != 0) {
                AtomicReferenceArray atomicReferenceArray = this.c.e;
                this.d = atomicReferenceArray;
                this.b = atomicReferenceArray.length() - 1;
                if (f()) {
                    return;
                }
            }
        }
    }

    public final boolean b(log0 log0Var) {
        nog0 nog0Var;
        ipg0 ipg0Var = this.h;
        try {
            Object key = log0Var.getKey();
            Object value = log0Var.getKey() == null ? null : log0Var.getValue();
            if (value == null) {
                return false;
            }
            this.f = new hpg0(ipg0Var, key, value);
            return true;
        } finally {
            this.c.g();
        }
    }

    public final Object c() {
        return d();
    }

    public final hpg0 d() {
        hpg0 hpg0Var = this.f;
        if (hpg0Var == null) {
            hhg1.k();
            return null;
        }
        this.g = hpg0Var;
        a();
        return this.g;
    }

    public final boolean e() {
        log0 log0Var = this.e;
        if (log0Var == null) {
            return false;
        }
        while (true) {
            this.e = log0Var.c();
            log0 log0Var2 = this.e;
            if (log0Var2 == null) {
                return false;
            }
            if (b(log0Var2)) {
                return true;
            }
            log0Var = this.e;
        }
    }

    public final boolean f() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            log0 log0Var = (log0) atomicReferenceArray.get(i);
            this.e = log0Var;
            if (log0Var != null && (b(log0Var) || e())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.i) {
            case 1:
                return d().b;
            case 2:
                return d().c;
            default:
                return c();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        dm5.z(this.g != null, "no calls to next() since the last call to remove()");
        this.h.remove(this.g.b);
        this.g = null;
    }
}
