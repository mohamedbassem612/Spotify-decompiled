package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kcw0 implements pcw0 {
    public final long a;

    public kcw0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcw0) && this.a == ((kcw0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
