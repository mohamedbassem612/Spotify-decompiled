package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m4g1 implements r4g1 {
    public final UUID a;
    public final long b;
    public final ep21 c;
    public final String d;
    public final int e;
    public final j4g1 f;

    public m4g1(UUID uuid, long j, ep21 ep21Var, String str, int i, j4g1 j4g1Var) {
        this.a = uuid;
        this.b = j;
        this.c = ep21Var;
        this.d = str;
        this.e = i;
        this.f = j4g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4g1)) {
            return false;
        }
        m4g1 m4g1Var = (m4g1) obj;
        return this.a.equals(m4g1Var.a) && this.b == m4g1Var.b && this.c.equals(m4g1Var.c) && u890.j(this.d, m4g1Var.d) && this.e == m4g1Var.e && u890.j(this.f, m4g1Var.f);
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
        int iK = ab80.k(this.e, cy30.d((this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31)) * 31, 31, this.d), 31);
        j4g1 j4g1Var = this.f;
        return iK + (j4g1Var == null ? 0 : j4g1Var.hashCode());
    }
}
