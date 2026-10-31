package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d2w0 extends h2w0 {
    public final String a;
    public final boolean b;

    public d2w0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2w0)) {
            return false;
        }
        d2w0 d2w0Var = (d2w0) obj;
        return u890.j(this.a, d2w0Var.a) && this.b == d2w0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
