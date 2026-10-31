package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dag0 extends ton1 {
    public final String c;
    public final boolean d;

    public dag0(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dag0)) {
            return false;
        }
        dag0 dag0Var = (dag0) obj;
        return this.c.equals(dag0Var.c) && this.d == dag0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
