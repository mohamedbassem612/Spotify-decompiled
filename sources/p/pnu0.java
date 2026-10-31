package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pnu0 {
    public final String a;
    public final String b;

    public pnu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnu0)) {
            return false;
        }
        pnu0 pnu0Var = (pnu0) obj;
        return u890.j(this.a, pnu0Var.a) && u890.j(this.b, pnu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
