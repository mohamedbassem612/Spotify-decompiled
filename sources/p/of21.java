package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class of21 implements d9j1 {
    public final fq0 a;

    public of21(fq0 fq0Var) {
        this.a = fq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of21) && u890.j(this.a, ((of21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
