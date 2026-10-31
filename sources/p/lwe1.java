package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lwe1 extends mwe1 {
    public final long a;

    public lwe1(long j) {
        this.a = j;
    }

    @Override // p.mwe1
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwe1) && this.a == ((lwe1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
