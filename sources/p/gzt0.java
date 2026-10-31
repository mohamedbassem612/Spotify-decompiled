package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gzt0 implements lzt0 {
    public final long a;

    public gzt0(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzt0) && this.a == ((gzt0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
