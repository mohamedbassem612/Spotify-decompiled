package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class avf implements d9j1 {
    public final fq0 a;

    public avf(fq0 fq0Var) {
        this.a = fq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avf) && u890.j(this.a, ((avf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
