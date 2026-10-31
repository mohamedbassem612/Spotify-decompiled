package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cl11 {
    public final String a;
    public final h290 b;
    public final fl11 c;

    public cl11(String str, h290 h290Var, fl11 fl11Var) {
        this.a = str;
        this.b = h290Var;
        this.c = fl11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl11)) {
            return false;
        }
        cl11 cl11Var = (cl11) obj;
        return this.a.equals(cl11Var.a) && this.b.equals(cl11Var.b) && this.c.equals(cl11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.g(this.b, this.a.hashCode() * 31, 31);
    }
}
