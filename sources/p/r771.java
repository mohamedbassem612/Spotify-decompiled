package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r771 {
    public final z771 a;

    public r771(z771 z771Var) {
        this.a = z771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r771) && u890.j(this.a, ((r771) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
