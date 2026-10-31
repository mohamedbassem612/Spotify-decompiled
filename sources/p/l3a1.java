package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l3a1 implements h4a1 {
    public final String a;
    public final boolean b;

    public l3a1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3a1)) {
            return false;
        }
        l3a1 l3a1Var = (l3a1) obj;
        return u890.j(this.a, l3a1Var.a) && this.b == l3a1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
