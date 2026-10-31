package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c200 extends d600 {
    public final znb1 a;

    public c200(znb1 znb1Var) {
        this.a = znb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c200) && u890.j(this.a, ((c200) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
