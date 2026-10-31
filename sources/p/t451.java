package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t451 {
    public final String a = "";
    public final String b = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t451)) {
            return false;
        }
        t451 t451Var = (t451) obj;
        return this.a.equals(t451Var.a) && this.b.equals(t451Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
