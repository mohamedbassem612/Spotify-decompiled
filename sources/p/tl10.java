package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tl10 extends vl10 {
    public final String a;
    public final td b;

    public tl10(String str, td tdVar) {
        this.a = str;
        this.b = tdVar;
    }

    public final td a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl10)) {
            return false;
        }
        tl10 tl10Var = (tl10) obj;
        return u890.j(this.a, tl10Var.a) && this.b.equals(tl10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
