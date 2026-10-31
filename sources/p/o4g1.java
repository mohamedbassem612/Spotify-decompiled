package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o4g1 implements r4g1 {
    public final UUID a;
    public final long b;
    public final ep21 c;
    public final x8l d;

    public o4g1(UUID uuid, long j, ep21 ep21Var, x8l x8lVar) {
        this.a = uuid;
        this.b = j;
        this.c = ep21Var;
        this.d = x8lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4g1)) {
            return false;
        }
        o4g1 o4g1Var = (o4g1) obj;
        return this.a.equals(o4g1Var.a) && this.b == o4g1Var.b && this.c.equals(o4g1Var.c) && this.d.equals(o4g1Var.d);
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
        return this.d.a.hashCode() + ((this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31)) * 31);
    }
}
