package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pdc1 {
    public final String a;
    public final String b;

    public pdc1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdc1)) {
            return false;
        }
        pdc1 pdc1Var = (pdc1) obj;
        return u890.j(this.a, pdc1Var.a) && this.b.equals(pdc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
