package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mlf1 implements olf1 {
    public final long a;

    public mlf1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mlf1) && this.a == ((mlf1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
