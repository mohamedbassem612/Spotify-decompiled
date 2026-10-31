package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kkm0 implements lkm0 {
    public final String a;
    public final int b;

    public kkm0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkm0)) {
            return false;
        }
        kkm0 kkm0Var = (kkm0) obj;
        return u890.j(this.a, kkm0Var.a) && this.b == kkm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
