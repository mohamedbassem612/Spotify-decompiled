package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v1w0 extends h2w0 {
    public final String a;
    public final boolean b;

    public v1w0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1w0)) {
            return false;
        }
        v1w0 v1w0Var = (v1w0) obj;
        return this.a.equals(v1w0Var.a) && this.b == v1w0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
