package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pfv0 {
    public final String a;
    public final int b;

    public pfv0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfv0)) {
            return false;
        }
        pfv0 pfv0Var = (pfv0) obj;
        return this.a.equals(pfv0Var.a) && this.b == pfv0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
