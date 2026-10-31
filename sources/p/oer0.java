package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oer0 implements qfr0 {
    public final String a;
    public final tfr0 b;

    public oer0(String str, tfr0 tfr0Var) {
        this.a = str;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oer0)) {
            return false;
        }
        oer0 oer0Var = (oer0) obj;
        return u890.j(this.a, oer0Var.a) && this.b.equals(oer0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
