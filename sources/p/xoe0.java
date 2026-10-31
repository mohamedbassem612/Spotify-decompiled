package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xoe0 {
    public final String a;
    public final cpe0 b;
    public final moe0 c;

    public xoe0(String str, cpe0 cpe0Var, moe0 moe0Var) {
        this.a = str;
        this.b = cpe0Var;
        this.c = moe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoe0)) {
            return false;
        }
        xoe0 xoe0Var = (xoe0) obj;
        return this.a.equals(xoe0Var.a) && this.b.equals(xoe0Var.b) && this.c.equals(xoe0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
