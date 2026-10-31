package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h3k implements i3k {
    public final wj41 a;

    public h3k(wj41 wj41Var) {
        this.a = wj41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3k) && u890.j(this.a, ((h3k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
