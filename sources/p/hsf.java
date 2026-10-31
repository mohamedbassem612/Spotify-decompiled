package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hsf {
    public final vba0 a;

    public hsf(vba0 vba0Var) {
        this.a = vba0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hsf) && this.a.equals(((hsf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
