package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yd40 {
    public final String a;
    public final h4d0 b;

    public yd40(String str, h4d0 h4d0Var) {
        this.a = str;
        this.b = h4d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd40)) {
            return false;
        }
        yd40 yd40Var = (yd40) obj;
        return u890.j(this.a, yd40Var.a) && this.b == yd40Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
