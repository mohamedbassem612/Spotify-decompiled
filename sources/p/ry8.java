package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ry8 extends vyh {
    public final w09 a;

    public ry8(w09 w09Var) {
        uyh uyhVar = uyh.a;
        this.a = w09Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vyh)) {
            return false;
        }
        if (!this.a.equals(((ry8) ((vyh) obj)).a)) {
            return false;
        }
        Object obj2 = uyh.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ uyh.a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + uyh.a + "}";
    }
}
