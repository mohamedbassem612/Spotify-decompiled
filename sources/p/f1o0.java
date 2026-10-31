package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f1o0 {
    public final boolean a;

    public f1o0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1o0) && this.a == ((f1o0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
