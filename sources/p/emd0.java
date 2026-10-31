package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class emd0 {
    public final int a;
    public final String b;

    public emd0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emd0)) {
            return false;
        }
        emd0 emd0Var = (emd0) obj;
        return this.a == emd0Var.a && this.b.equals(emd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
