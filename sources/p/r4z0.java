package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r4z0 {
    public final String a;
    public final long b;
    public final List c;

    public r4z0(String str, long j, List list) {
        this.a = str;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4z0)) {
            return false;
        }
        r4z0 r4z0Var = (r4z0) obj;
        return this.a.equals(r4z0Var.a) && this.b == r4z0Var.b && this.c.equals(r4z0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
