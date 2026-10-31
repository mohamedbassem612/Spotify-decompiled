package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rer0 implements qfr0 {
    public final String a;
    public final String b;
    public final tfr0 c;

    public rer0(String str, String str2, tfr0 tfr0Var) {
        this.a = str;
        this.b = str2;
        this.c = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rer0)) {
            return false;
        }
        rer0 rer0Var = (rer0) obj;
        return u890.j(this.a, rer0Var.a) && u890.j(this.b, rer0Var.b) && this.c.equals(rer0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
