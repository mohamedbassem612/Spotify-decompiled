package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fb30 {
    public final String a;
    public final int b;
    public final String c;

    public fb30(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb30)) {
            return false;
        }
        fb30 fb30Var = (fb30) obj;
        return this.a.equals(fb30Var.a) && this.b == fb30Var.b && this.c.equals(fb30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
