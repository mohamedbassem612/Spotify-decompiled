package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kgg0 {
    public final String a;
    public final boolean b;

    public kgg0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgg0)) {
            return false;
        }
        kgg0 kgg0Var = (kgg0) obj;
        return this.a.equals(kgg0Var.a) && this.b == kgg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
