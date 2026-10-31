package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class onj0 extends snj0 {
    public final long b;

    public onj0(long j) {
        super(false);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onj0) && this.b == ((onj0) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }
}
