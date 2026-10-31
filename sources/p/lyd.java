package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lyd extends qyd {
    public final po41 a;

    public lyd(po41 po41Var) {
        this.a = po41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lyd) && u890.j(this.a, ((lyd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
