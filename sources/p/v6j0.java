package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v6j0 extends x6j0 {
    public final String a;
    public final String b;
    public final String c;

    public v6j0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6j0)) {
            return false;
        }
        v6j0 v6j0Var = (v6j0) obj;
        return u890.j(this.a, v6j0Var.a) && u890.j(this.b, v6j0Var.b) && u890.j(this.c, v6j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
