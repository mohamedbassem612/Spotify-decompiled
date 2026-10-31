package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ib8 {
    public final String a;
    public final String b;
    public final String c;

    public ib8(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib8)) {
            return false;
        }
        ib8 ib8Var = (ib8) obj;
        return u890.j(this.a, ib8Var.a) && this.b.equals(ib8Var.b) && this.c.equals(ib8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
