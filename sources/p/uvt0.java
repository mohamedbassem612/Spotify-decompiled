package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uvt0 implements gwt0 {
    public final String a;
    public final boolean b;

    public uvt0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvt0)) {
            return false;
        }
        uvt0 uvt0Var = (uvt0) obj;
        return u890.j(this.a, uvt0Var.a) && this.b == uvt0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
