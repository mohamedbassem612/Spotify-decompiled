package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kqh1 {
    public final String a;
    public final zgo1 b;

    public kqh1(String str, zgo1 zgo1Var) {
        this.a = str;
        this.b = zgo1Var;
    }

    public final String a() {
        return this.a;
    }

    public final zgo1 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqh1)) {
            return false;
        }
        kqh1 kqh1Var = (kqh1) obj;
        return u890.j(this.a, kqh1Var.a) && u890.j(this.b, kqh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
