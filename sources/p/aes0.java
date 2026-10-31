package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aes0 implements ces0 {
    public final String a;
    public final String b;

    public aes0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aes0)) {
            return false;
        }
        aes0 aes0Var = (aes0) obj;
        return this.a.equals(aes0Var.a) && u890.j(this.b, aes0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
