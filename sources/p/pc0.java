package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pc0 {
    public final String a;
    public final boolean b;

    public pc0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc0)) {
            return false;
        }
        pc0 pc0Var = (pc0) obj;
        return u890.j(this.a, pc0Var.a) && this.b == pc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
