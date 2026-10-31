package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qnu0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public qnu0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnu0)) {
            return false;
        }
        qnu0 qnu0Var = (qnu0) obj;
        return this.a.equals(qnu0Var.a) && this.b.equals(qnu0Var.b) && this.c.equals(qnu0Var.c) && this.d == qnu0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
