package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class joi0 {
    public final ioi0 a;
    public final boolean b;

    public joi0(ioi0 ioi0Var, boolean z) {
        this.a = ioi0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joi0)) {
            return false;
        }
        joi0 joi0Var = (joi0) obj;
        return this.a.equals(joi0Var.a) && this.b == joi0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }
}
