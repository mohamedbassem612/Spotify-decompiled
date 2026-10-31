package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ldg1 implements ez00 {
    public final String a;
    public final String b;

    public ldg1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldg1)) {
            return false;
        }
        ldg1 ldg1Var = (ldg1) obj;
        return this.a.equals(ldg1Var.a) && u890.j(this.b, ldg1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
