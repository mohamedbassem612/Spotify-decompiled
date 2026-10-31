package p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j4d0 implements l4d0 {
    public final long a;

    public j4d0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j4d0) && this.a == ((j4d0) obj).a;
    }

    public final int hashCode() {
        return TimeUnit.MILLISECONDS.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
