package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class val1 {
    public final acl1 a;

    public val1(acl1 acl1Var) {
        this.a = acl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof val1) && this.a.equals(((val1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
