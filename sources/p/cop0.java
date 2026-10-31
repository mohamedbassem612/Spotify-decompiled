package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cop0 {
    public final String a;
    public final String b;

    public cop0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cop0)) {
            return false;
        }
        cop0 cop0Var = (cop0) obj;
        return u890.j(this.a, cop0Var.a) && this.b.equals(cop0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
