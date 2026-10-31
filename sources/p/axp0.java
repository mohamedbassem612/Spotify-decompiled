package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class axp0 {
    public final String a;
    public final xwp0 b;

    public axp0(String str, xwp0 xwp0Var) {
        this.a = str;
        this.b = xwp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axp0)) {
            return false;
        }
        axp0 axp0Var = (axp0) obj;
        return this.a.equals(axp0Var.a) && this.b.equals(axp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
