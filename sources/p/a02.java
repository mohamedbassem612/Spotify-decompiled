package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a02 implements c02 {
    public final String a;
    public final p60 b;

    public a02(String str, p60 p60Var) {
        this.a = str;
        this.b = p60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a02)) {
            return false;
        }
        a02 a02Var = (a02) obj;
        return this.a.equals(a02Var.a) && this.b.equals(a02Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
