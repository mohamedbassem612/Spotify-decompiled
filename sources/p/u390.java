package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u390 {
    public final vy71 a;

    public u390(vy71 vy71Var) {
        this.a = vy71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u390) && u890.j(this.a, ((u390) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
