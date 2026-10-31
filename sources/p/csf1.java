package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class csf1 {
    public final String a;
    public final boolean b;

    public csf1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csf1)) {
            return false;
        }
        csf1 csf1Var = (csf1) obj;
        return this.a.equals(csf1Var.a) && this.b == csf1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
