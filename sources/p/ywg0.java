package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ywg0 extends z0o1 {
    public final String c;
    public final String d;
    public final String e;

    public ywg0(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywg0)) {
            return false;
        }
        ywg0 ywg0Var = (ywg0) obj;
        return u890.j(this.c, ywg0Var.c) && u890.j(this.d, ywg0Var.d) && u890.j(this.e, ywg0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }
}
