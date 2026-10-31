package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q4g1 implements r4g1 {
    public final UUID a;
    public final long b;
    public final String c;

    public q4g1(UUID uuid, String str, long j) {
        this.a = uuid;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4g1)) {
            return false;
        }
        q4g1 q4g1Var = (q4g1) obj;
        return this.a.equals(q4g1Var.a) && this.b == q4g1Var.b && this.c.equals(q4g1Var.c);
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
