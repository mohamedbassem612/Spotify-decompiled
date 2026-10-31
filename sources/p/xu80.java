package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xu80 extends lm5 {
    public final String d;
    public final int e;

    public xu80(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu80)) {
            return false;
        }
        xu80 xu80Var = (xu80) obj;
        return u890.j(this.d, xu80Var.d) && this.e == xu80Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
