package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d171 implements e171 {
    public final long a;

    public d171(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d171) && this.a == ((d171) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
