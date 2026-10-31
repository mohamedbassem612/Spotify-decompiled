package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pn21 {
    public final boolean a;
    public final String b;

    public pn21(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn21)) {
            return false;
        }
        pn21 pn21Var = (pn21) obj;
        return this.a == pn21Var.a && u890.j(this.b, pn21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
