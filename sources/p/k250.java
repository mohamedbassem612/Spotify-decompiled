package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k250 extends m250 {
    public final long a;

    public k250(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k250) && this.a == ((k250) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public /* synthetic */ k250() {
        this(0L);
    }
}
