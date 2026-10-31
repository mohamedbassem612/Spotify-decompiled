package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tvi0 implements vvi0 {
    public final String a;
    public final t2o0 b;

    public tvi0(String str, t2o0 t2o0Var) {
        this.a = str;
        this.b = t2o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tvi0) {
            tvi0 tvi0Var = (tvi0) obj;
            return u890.j(this.a, tvi0Var.a) && this.b == tvi0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
