package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qpc1 {
    public final String a;
    public final String b;
    public final d13 c;

    public qpc1(String str, String str2, d13 d13Var) {
        this.a = str;
        this.b = str2;
        this.c = d13Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpc1)) {
            return false;
        }
        qpc1 qpc1Var = (qpc1) obj;
        return u890.j(this.a, qpc1Var.a) && u890.j(this.b, qpc1Var.b) && this.c == qpc1Var.c;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        d13 d13Var = this.c;
        return iD + (d13Var == null ? 0 : d13Var.hashCode());
    }
}
