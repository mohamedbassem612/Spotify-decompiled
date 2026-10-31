package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fod1 {
    public final String a;
    public final String b;
    public final wv1 c;

    public fod1(String str, String str2, wv1 wv1Var) {
        this.a = str;
        this.b = str2;
        this.c = wv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fod1) {
            fod1 fod1Var = (fod1) obj;
            return this.a.equals(fod1Var.a) && u890.j(this.b, fod1Var.b) && this.c == fod1Var.c;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
