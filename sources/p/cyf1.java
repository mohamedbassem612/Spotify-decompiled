package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cyf1 {
    public final String a;
    public final boolean b;
    public final c380 c;

    public cyf1(String str, c380 c380Var, boolean z) {
        this.a = str;
        this.b = z;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyf1)) {
            return false;
        }
        cyf1 cyf1Var = (cyf1) obj;
        return this.a.equals(cyf1Var.a) && this.b == cyf1Var.b && this.c.equals(cyf1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
