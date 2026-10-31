package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class frt0 implements hrt0 {
    public final String a;
    public final String b;

    public frt0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frt0)) {
            return false;
        }
        frt0 frt0Var = (frt0) obj;
        return u890.j(this.a, frt0Var.a) && u890.j(this.b, frt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
