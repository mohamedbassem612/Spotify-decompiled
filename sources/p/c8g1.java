package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c8g1 {
    public final AtomicReference a;
    public final AtomicReference b;

    public c8g1() {
        AtomicReference atomicReference = new AtomicReference(null);
        AtomicReference atomicReference2 = new AtomicReference(null);
        this.a = atomicReference;
        this.b = atomicReference2;
    }

    public final AtomicReference a() {
        return this.b;
    }

    public final AtomicReference b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8g1)) {
            return false;
        }
        c8g1 c8g1Var = (c8g1) obj;
        return this.a.equals(c8g1Var.a) && this.b.equals(c8g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
