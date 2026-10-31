package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ic80 implements d9j1 {
    public final fq0 a;

    public ic80(fq0 fq0Var) {
        this.a = fq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic80) && u890.j(this.a, ((ic80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
