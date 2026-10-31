package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p4g1 implements r4g1 {
    public final UUID a;
    public final long b;
    public final xz21 c;

    public p4g1(UUID uuid, long j, xz21 xz21Var) {
        this.a = uuid;
        this.b = j;
        this.c = xz21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4g1)) {
            return false;
        }
        p4g1 p4g1Var = (p4g1) obj;
        return this.a.equals(p4g1Var.a) && this.b == p4g1Var.b && this.c.equals(p4g1Var.c);
    }

    @Override // p.r4g1
    public final UUID getId() {
        return this.a;
    }

    @Override // p.r4g1
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
