package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cfn implements ugn {
    public final long a;

    public cfn(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfn) && this.a == ((cfn) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
