package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nmi1 implements xmi1 {
    public final String a;
    public final String b;

    public nmi1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmi1)) {
            return false;
        }
        nmi1 nmi1Var = (nmi1) obj;
        return u890.j(this.a, nmi1Var.a) && u890.j(this.b, nmi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
