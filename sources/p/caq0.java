package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class caq0 extends jaq0 {
    public final String a;
    public final boolean b;

    public caq0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof caq0)) {
            return false;
        }
        caq0 caq0Var = (caq0) obj;
        return u890.j(this.a, caq0Var.a) && this.b == caq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
