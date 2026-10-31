package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hnu0 {
    public final String a;
    public final String b;

    public hnu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnu0)) {
            return false;
        }
        hnu0 hnu0Var = (hnu0) obj;
        return u890.j(this.a, hnu0Var.a) && this.b.equals(hnu0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
