package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class avr0 extends rjo1 {
    public final String b;
    public final tv80 c;

    public avr0(String str, tv80 tv80Var) {
        this.b = str;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avr0)) {
            return false;
        }
        avr0 avr0Var = (avr0) obj;
        return u890.j(this.b, avr0Var.b) && u890.j(this.c, avr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
