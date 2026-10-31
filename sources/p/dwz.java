package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dwz implements y600 {
    public final rz21 a;

    public dwz(rz21 rz21Var) {
        this.a = rz21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwz) && u890.j(this.a, ((dwz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
