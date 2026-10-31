package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i3b0 extends c3b0 {
    public final long a;

    public i3b0(long j) {
        this.a = j;
    }

    @Override // p.c3b0
    public final Object a() {
        return new z4h1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3b0) && this.a == ((i3b0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
