package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lvi1 {
    public final String a;
    public final qvi1 b;

    public lvi1(String str, qvi1 qvi1Var) {
        this.a = str;
        this.b = qvi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvi1)) {
            return false;
        }
        lvi1 lvi1Var = (lvi1) obj;
        return this.a.equals(lvi1Var.a) && this.b.equals(lvi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }
}
