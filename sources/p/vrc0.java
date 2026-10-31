package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vrc0 {
    public final String a;
    public final int b;

    public vrc0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrc0)) {
            return false;
        }
        vrc0 vrc0Var = (vrc0) obj;
        return this.a.equals(vrc0Var.a) && this.b == vrc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
