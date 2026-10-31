package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fh90 implements ai90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final w281 e;

    public fh90(String str, String str2, String str3, String str4, w281 w281Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = w281Var;
    }

    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh90)) {
            return false;
        }
        fh90 fh90Var = (fh90) obj;
        return this.a.equals(fh90Var.a) && this.b.equals(fh90Var.b) && this.c.equals(fh90Var.c) && u890.j(this.d, fh90Var.d) && this.e.equals(fh90Var.e);
    }

    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
