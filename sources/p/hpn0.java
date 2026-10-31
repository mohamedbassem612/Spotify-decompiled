package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hpn0 extends zpn1 {
    public final String c;
    public final String d;

    public hpn0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final String A() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpn0)) {
            return false;
        }
        hpn0 hpn0Var = (hpn0) obj;
        return u890.j(this.c, hpn0Var.c) && this.d.equals(hpn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String z() {
        return this.c;
    }
}
