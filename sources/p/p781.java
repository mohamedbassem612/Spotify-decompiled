package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p781 implements q781 {
    public final g281 a;

    public p781(g281 g281Var) {
        this.a = g281Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p781) && u890.j(this.a, ((p781) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
