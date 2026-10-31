package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a2w0 extends h2w0 {
    public final boolean a;

    public a2w0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2w0) && this.a == ((a2w0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
