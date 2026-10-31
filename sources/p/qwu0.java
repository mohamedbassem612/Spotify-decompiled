package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qwu0 {
    public final String a;
    public final String b;
    public final lwu0 c;
    public final int d;

    public qwu0(String str, String str2, lwu0 lwu0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = lwu0Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwu0)) {
            return false;
        }
        qwu0 qwu0Var = (qwu0) obj;
        return this.a.equals(qwu0Var.a) && this.b.equals(qwu0Var.b) && this.c == qwu0Var.c && this.d == qwu0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
