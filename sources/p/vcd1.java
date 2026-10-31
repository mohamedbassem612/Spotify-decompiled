package p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vcd1 {
    public final long a;

    public vcd1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vcd1) && this.a == ((vcd1) obj).a;
    }

    public final int hashCode() {
        return TimeUnit.MILLISECONDS.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
