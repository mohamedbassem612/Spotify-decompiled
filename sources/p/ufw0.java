package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ufw0 {
    public final String a;
    public final String b;
    public final aru0 c;

    public ufw0(String str, String str2, aru0 aru0Var) {
        this.a = str;
        this.b = str2;
        this.c = aru0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ufw0) {
            ufw0 ufw0Var = (ufw0) obj;
            return this.a.equals(ufw0Var.a) && this.b.equals(ufw0Var.b) && this.c == ufw0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(1, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
