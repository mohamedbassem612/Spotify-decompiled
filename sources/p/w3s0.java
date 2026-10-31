package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w3s0 implements x3s0 {
    public final List a;
    public final long b;
    public final long c;
    public final String d;

    public w3s0(long j, long j2, String str, List list) {
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = str;
    }

    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3s0)) {
            return false;
        }
        w3s0 w3s0Var = (w3s0) obj;
        return this.a.equals(w3s0Var.a) && this.b == w3s0Var.b && this.c == w3s0Var.c && u890.j(this.d, w3s0Var.d);
    }

    public final String getEventId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }
}
