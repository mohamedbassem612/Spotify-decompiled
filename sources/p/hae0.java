package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hae0 {
    public final long a;
    public final float b;
    public final long c;

    public hae0(gae0 gae0Var) {
        this.a = gae0Var.a;
        this.b = gae0Var.b;
        this.c = gae0Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hae0)) {
            return false;
        }
        hae0 hae0Var = (hae0) obj;
        return this.a == hae0Var.a && this.b == hae0Var.b && this.c == hae0Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
