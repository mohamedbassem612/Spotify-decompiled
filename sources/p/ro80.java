package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ro80 {
    public final String a;
    public final String b;

    public ro80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro80)) {
            return false;
        }
        ro80 ro80Var = (ro80) obj;
        return u890.j(this.a, ro80Var.a) && u890.j(this.b, ro80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
