package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ufs0 {
    public final String a;
    public final int b;

    public ufs0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufs0)) {
            return false;
        }
        ufs0 ufs0Var = (ufs0) obj;
        return this.a.equals(ufs0Var.a) && this.b == ufs0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
