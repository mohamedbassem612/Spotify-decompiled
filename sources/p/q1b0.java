package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q1b0 extends s1b0 {
    public final String a;
    public final String b;
    public final String c;

    public q1b0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1b0)) {
            return false;
        }
        q1b0 q1b0Var = (q1b0) obj;
        return this.a.equals(q1b0Var.a) && this.b.equals(q1b0Var.b) && this.c.equals(q1b0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
