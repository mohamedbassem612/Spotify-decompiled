package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yzk extends cbp1 {
    public final long c;

    public yzk(long j) {
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yzk) && this.c == ((yzk) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public /* synthetic */ yzk() {
        this(0L);
    }
}
