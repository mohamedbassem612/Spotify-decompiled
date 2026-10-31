package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mul implements cwl {
    public final pn8 a;

    public mul(pn8 pn8Var) {
        this.a = pn8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mul) && this.a.equals(((mul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
