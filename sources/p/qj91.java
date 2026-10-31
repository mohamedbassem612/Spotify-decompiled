package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qj91 extends bk91 {
    public final long a;

    public qj91(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qj91) && this.a == ((qj91) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
