package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z1w0 extends h2w0 {
    public final boolean a;

    public z1w0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1w0) && this.a == ((z1w0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
