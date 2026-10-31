package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q190 implements r190 {
    public final vba0 a;

    public q190(vba0 vba0Var) {
        this.a = vba0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q190) && this.a.equals(((q190) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
