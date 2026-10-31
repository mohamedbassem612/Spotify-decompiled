package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cm10 {
    public final hux a;
    public final String b;

    public cm10(String str, hux huxVar) {
        this.a = huxVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm10)) {
            return false;
        }
        cm10 cm10Var = (cm10) obj;
        return u890.j(this.a, cm10Var.a) && u890.j(this.b, cm10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
