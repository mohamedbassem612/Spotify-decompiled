package p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kke1 {
    public final long a;

    public kke1(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kke1) && this.a == ((kke1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a) + (TimeUnit.MILLISECONDS.hashCode() * 31);
    }
}
