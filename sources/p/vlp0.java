package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vlp0 {
    public final String a;
    public final String b;

    public vlp0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlp0)) {
            return false;
        }
        vlp0 vlp0Var = (vlp0) obj;
        return u890.j(this.a, vlp0Var.a) && u890.j(this.b, vlp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
