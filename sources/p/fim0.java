package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fim0 {
    public final String a;
    public final k9 b;

    public fim0(String str, k9 k9Var) {
        this.a = str;
        this.b = k9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fim0)) {
            return false;
        }
        fim0 fim0Var = (fim0) obj;
        return u890.j(this.a, fim0Var.a) && u890.j(this.b, fim0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
