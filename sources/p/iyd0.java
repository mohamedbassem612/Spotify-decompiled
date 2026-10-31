package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iyd0 implements azd0 {
    public final String a;
    public final boolean b;

    public iyd0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyd0)) {
            return false;
        }
        iyd0 iyd0Var = (iyd0) obj;
        return this.a.equals(iyd0Var.a) && this.b == iyd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
