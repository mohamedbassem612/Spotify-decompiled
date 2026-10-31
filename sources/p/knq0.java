package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class knq0 extends poz0 {
    public final c560 b;

    public knq0(c560 c560Var) {
        this.b = c560Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knq0) && this.b.equals(((knq0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
