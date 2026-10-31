package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gs2 extends upf {
    public final String d;
    public final String e;
    public final String f;

    public gs2(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs2)) {
            return false;
        }
        gs2 gs2Var = (gs2) obj;
        return u890.j(this.d, gs2Var.d) && this.e.equals(gs2Var.e) && this.f.equals(gs2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(this.d.hashCode() * 31, 31, this.e);
    }
}
