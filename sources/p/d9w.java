package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d9w {
    public final p950 a;

    public d9w(p950 p950Var) {
        this.a = p950Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9w) && u890.j(this.a, ((d9w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
