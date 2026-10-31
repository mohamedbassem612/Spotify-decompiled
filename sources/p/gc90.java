package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gc90 {
    public final String a;
    public final boolean b;

    public gc90(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc90)) {
            return false;
        }
        gc90 gc90Var = (gc90) obj;
        return this.a.equals(gc90Var.a) && this.b == gc90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
