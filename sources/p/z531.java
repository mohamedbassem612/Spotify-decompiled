package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z531 implements a631 {
    public final n531 a;

    public z531(n531 n531Var) {
        this.a = n531Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z531) && this.a.equals(((z531) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
