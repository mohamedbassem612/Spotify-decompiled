package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g181 extends h181 {
    public final String a;
    public final x360 b;

    public g181(String str, x360 x360Var) {
        this.a = str;
        this.b = x360Var;
    }

    public final x360 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g181)) {
            return false;
        }
        g181 g181Var = (g181) obj;
        return this.a.equals(g181Var.a) && u890.j(this.b, g181Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return iHashCode + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
