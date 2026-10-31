package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hqm1 {
    public final String a;
    public final boolean b;

    public hqm1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqm1)) {
            return false;
        }
        hqm1 hqm1Var = (hqm1) obj;
        return this.a.equals(hqm1Var.a) && this.b == hqm1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
