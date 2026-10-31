package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fof1 {
    public final String a;
    public final String b;
    public final String c;

    public fof1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fof1)) {
            return false;
        }
        fof1 fof1Var = (fof1) obj;
        return u890.j(this.a, fof1Var.a) && this.b.equals(fof1Var.b) && this.c.equals(fof1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
