package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c0o0 implements j0o0 {
    public final boolean a;

    public c0o0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0o0) && this.a == ((c0o0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
