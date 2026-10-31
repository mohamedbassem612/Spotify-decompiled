package p;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rgc {
    public final AtomicLong a;
    public final AtomicLong b;

    public rgc() {
        AtomicLong atomicLong = new AtomicLong(0L);
        AtomicLong atomicLong2 = new AtomicLong(0L);
        this.a = atomicLong;
        this.b = atomicLong2;
    }

    public final AtomicLong a() {
        return this.b;
    }

    public final AtomicLong b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgc)) {
            return false;
        }
        rgc rgcVar = (rgc) obj;
        return this.a.equals(rgcVar.a) && this.b.equals(rgcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
