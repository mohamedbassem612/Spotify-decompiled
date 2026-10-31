package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m2z implements n2z {
    public final long a;

    public m2z(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2z) && this.a == ((m2z) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
