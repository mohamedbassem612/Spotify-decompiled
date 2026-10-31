package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pv90 {
    public final String a;
    public final int b;
    public final String c;

    public pv90(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv90)) {
            return false;
        }
        pv90 pv90Var = (pv90) obj;
        return u890.j(this.a, pv90Var.a) && this.b == pv90Var.b && this.c.equals(pv90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
