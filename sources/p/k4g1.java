package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k4g1 implements r4g1 {
    public final UUID a;
    public final long b;
    public final long c;

    public k4g1(UUID uuid, long j, long j2) {
        this.a = uuid;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4g1)) {
            return false;
        }
        k4g1 k4g1Var = (k4g1) obj;
        return this.a.equals(k4g1Var.a) && this.b == k4g1Var.b && this.c == k4g1Var.c;
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
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
