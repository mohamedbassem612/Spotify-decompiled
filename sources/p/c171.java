package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c171 implements e171 {
    public final long a;

    public c171(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c171) && this.a == ((c171) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
