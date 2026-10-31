package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d3b0 extends c3b0 {
    public final long a;

    public d3b0(long j) {
        this.a = j;
    }

    @Override // p.c3b0
    public final Object a() {
        return Long.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3b0) && this.a == ((d3b0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
