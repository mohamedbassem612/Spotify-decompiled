package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uri0 {
    public final int a;
    public final String b;

    public uri0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uri0)) {
            return false;
        }
        uri0 uri0Var = (uri0) obj;
        return this.a == uri0Var.a && this.b.equals(uri0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
