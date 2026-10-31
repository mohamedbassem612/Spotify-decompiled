package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jgj0 extends pgj0 {
    public final boolean a;

    public jgj0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgj0) && this.a == ((jgj0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
