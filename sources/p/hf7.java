package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hf7 extends iqo1 {
    public final String d;
    public final r620 e;

    public hf7(String str, r620 r620Var) {
        this.d = str;
        this.e = r620Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf7)) {
            return false;
        }
        hf7 hf7Var = (hf7) obj;
        return u890.j(this.d, hf7Var.d) && this.e == hf7Var.e;
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        r620 r620Var = this.e;
        return iHashCode + (r620Var != null ? r620Var.hashCode() : 0);
    }
}
