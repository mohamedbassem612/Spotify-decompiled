package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ty50 implements uy50 {
    public final String a;
    public final String b;

    public ty50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty50)) {
            return false;
        }
        ty50 ty50Var = (ty50) obj;
        return u890.j(this.a, ty50Var.a) && u890.j(this.b, ty50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
