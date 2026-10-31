package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jtl {
    public final boolean a;

    public jtl(boolean z) {
        this.a = z;
    }

    public final boolean a(an01 an01Var) {
        return this.a && an01Var.u && an01Var.h.length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jtl) && this.a == ((jtl) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
