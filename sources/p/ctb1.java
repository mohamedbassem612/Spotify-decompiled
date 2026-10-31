package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ctb1 {
    public final String a;
    public final String b;

    public ctb1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctb1)) {
            return false;
        }
        ctb1 ctb1Var = (ctb1) obj;
        return this.a.equals(ctb1Var.a) && this.b.equals(ctb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
