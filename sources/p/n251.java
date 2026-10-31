package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n251 {
    public final iu30 a;

    public n251(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n251) && u890.j(this.a, ((n251) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(2131953777) * 31);
    }
}
