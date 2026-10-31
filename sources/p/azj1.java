package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class azj1 implements bzj1 {
    public final u380 a;

    public azj1(u380 u380Var) {
        this.a = u380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azj1) && u890.j(this.a, ((azj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
