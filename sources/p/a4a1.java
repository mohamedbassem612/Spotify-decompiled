package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a4a1 implements h4a1 {
    public final String a;
    public final boolean b;

    public a4a1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4a1)) {
            return false;
        }
        a4a1 a4a1Var = (a4a1) obj;
        return u890.j(this.a, a4a1Var.a) && this.b == a4a1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
