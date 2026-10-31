package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jbg implements lbg {
    public final boolean a;

    public jbg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbg) && this.a == ((jbg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
