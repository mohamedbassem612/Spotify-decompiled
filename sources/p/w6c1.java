package p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w6c1 extends oho1 {
    public final long c;
    public final TimeUnit d;

    public w6c1(long j, TimeUnit timeUnit) {
        this.c = j;
        this.d = timeUnit;
    }

    public final long B() {
        return this.c;
    }

    public final TimeUnit C() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6c1)) {
            return false;
        }
        w6c1 w6c1Var = (w6c1) obj;
        return this.c == w6c1Var.c && this.d == w6c1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (Long.hashCode(this.c) * 31);
    }
}
