package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x2b0 extends c3b0 {
    public final double a;

    public x2b0(double d) {
        this.a = d;
    }

    @Override // p.c3b0
    public final Object a() {
        return Double.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2b0) && Double.compare(this.a, ((x2b0) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }
}
