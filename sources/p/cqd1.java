package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cqd1 {
    public final String a;
    public final String b;
    public final String c;

    public cqd1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqd1)) {
            return false;
        }
        cqd1 cqd1Var = (cqd1) obj;
        return u890.j(this.a, cqd1Var.a) && u890.j(this.b, cqd1Var.b) && u890.j(this.c, cqd1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
