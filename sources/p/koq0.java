package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class koq0 extends toq0 {
    public final c560 a;
    public final String b;

    public koq0(c560 c560Var, String str) {
        this.a = c560Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koq0)) {
            return false;
        }
        koq0 koq0Var = (koq0) obj;
        return this.a.equals(koq0Var.a) && this.b.equals(koq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
