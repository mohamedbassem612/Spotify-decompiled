package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x1s0 implements z1s0 {
    public final gax a;

    public x1s0(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1s0) && this.a.equals(((x1s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
