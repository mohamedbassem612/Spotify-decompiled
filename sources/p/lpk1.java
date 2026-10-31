package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lpk1 {
    public final String a;
    public final boolean b;

    public lpk1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpk1)) {
            return false;
        }
        lpk1 lpk1Var = (lpk1) obj;
        return this.a.equals(lpk1Var.a) && this.b == lpk1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
