package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eer0 implements qfr0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final tfr0 d;

    public eer0(String str, String str2, boolean z, tfr0 tfr0Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eer0)) {
            return false;
        }
        eer0 eer0Var = (eer0) obj;
        return u890.j(this.a, eer0Var.a) && u890.j(this.b, eer0Var.b) && this.c == eer0Var.c && this.d.equals(eer0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
