package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wxd0 implements azd0 {
    public final boolean a;

    public wxd0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wxd0) && this.a == ((wxd0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
