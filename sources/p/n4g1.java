package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n4g1 implements r4g1 {
    public final UUID a;
    public final long b;
    public final ep21 c;
    public final xz21 d;
    public final j4g1 e;

    public n4g1(UUID uuid, long j, ep21 ep21Var, xz21 xz21Var, j4g1 j4g1Var) {
        this.a = uuid;
        this.b = j;
        this.c = ep21Var;
        this.d = xz21Var;
        this.e = j4g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4g1)) {
            return false;
        }
        n4g1 n4g1Var = (n4g1) obj;
        return this.a.equals(n4g1Var.a) && this.b == n4g1Var.b && this.c.equals(n4g1Var.c) && this.d.equals(n4g1Var.d) && this.e.equals(n4g1Var.e);
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
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }
}
