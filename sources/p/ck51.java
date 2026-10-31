package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ck51 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ck51(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck51)) {
            return false;
        }
        ck51 ck51Var = (ck51) obj;
        return u890.j(this.a, ck51Var.a) && u890.j(this.b, ck51Var.b) && u890.j(this.c, ck51Var.c) && u890.j(this.d, ck51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
