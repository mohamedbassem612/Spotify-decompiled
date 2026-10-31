package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jql1 {
    public final String a;
    public final String b;
    public final String c;
    public final f0u d;

    public jql1(String str, String str2, String str3, f0u f0uVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f0uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jql1)) {
            return false;
        }
        jql1 jql1Var = (jql1) obj;
        return this.a.equals(jql1Var.a) && this.b.equals(jql1Var.b) && this.c.equals(jql1Var.c) && this.d == jql1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
