package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bg0 {
    public final String a;
    public final w8c0 b;

    public bg0(String str, w8c0 w8c0Var) {
        this.a = str;
        this.b = w8c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg0)) {
            return false;
        }
        bg0 bg0Var = (bg0) obj;
        return u890.j(this.a, bg0Var.a) && this.b == bg0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
