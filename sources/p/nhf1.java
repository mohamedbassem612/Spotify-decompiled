package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nhf1 {
    public final String a;
    public final boolean b;

    public nhf1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhf1)) {
            return false;
        }
        nhf1 nhf1Var = (nhf1) obj;
        return this.a.equals(nhf1Var.a) && this.b == nhf1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
