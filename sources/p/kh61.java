package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kh61 {
    public final xm41 a;

    public kh61(xm41 xm41Var) {
        this.a = xm41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh61) && u890.j(this.a, ((kh61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
