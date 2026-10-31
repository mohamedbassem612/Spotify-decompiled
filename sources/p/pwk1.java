package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pwk1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public pwk1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwk1)) {
            return false;
        }
        pwk1 pwk1Var = (pwk1) obj;
        return this.a.equals(pwk1Var.a) && this.b.equals(pwk1Var.b) && this.c.equals(pwk1Var.c) && this.d.equals(pwk1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
