package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jer0 implements qfr0 {
    public final String a;
    public final String b;
    public final tfr0 c;

    public jer0(String str, String str2, tfr0 tfr0Var) {
        this.a = str;
        this.b = str2;
        this.c = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jer0)) {
            return false;
        }
        jer0 jer0Var = (jer0) obj;
        return u890.j(this.a, jer0Var.a) && this.b.equals(jer0Var.b) && this.c.equals(jer0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
