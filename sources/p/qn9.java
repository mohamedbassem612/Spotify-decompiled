package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qn9 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public qn9(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn9)) {
            return false;
        }
        qn9 qn9Var = (qn9) obj;
        return u890.j(this.a, qn9Var.a) && this.b.equals(qn9Var.b) && this.c == qn9Var.c && this.d.equals(qn9Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        int i = this.c;
        return this.d.hashCode() + ((iD + (i == 0 ? 0 : l1d.C(i))) * 31);
    }
}
