package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cqm0 {
    public final String a;
    public final String b;
    public final String c;

    public cqm0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqm0)) {
            return false;
        }
        cqm0 cqm0Var = (cqm0) obj;
        return u890.j(this.a, cqm0Var.a) && this.b.equals(cqm0Var.b) && this.c.equals(cqm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
