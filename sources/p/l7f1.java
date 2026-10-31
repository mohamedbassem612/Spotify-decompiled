package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l7f1 {
    public final String a;
    public final gsc1 b;
    public final c380 c;
    public final boolean d;

    public l7f1(String str, gsc1 gsc1Var, c380 c380Var, boolean z) {
        this.a = str;
        this.b = gsc1Var;
        this.c = c380Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l7f1) {
            l7f1 l7f1Var = (l7f1) obj;
            if (this.a.equals(l7f1Var.a) && this.b == l7f1Var.b && u890.j(this.c, l7f1Var.c) && this.d == l7f1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kk0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
