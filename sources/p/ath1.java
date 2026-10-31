package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ath1 implements gth1 {
    public final String a;
    public final String b;

    public ath1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ath1)) {
            return false;
        }
        ath1 ath1Var = (ath1) obj;
        return this.a.equals(ath1Var.a) && u890.j(this.b, ath1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
