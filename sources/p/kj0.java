package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kj0 implements lj0 {
    public final String a;
    public final String b;

    public kj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj0)) {
            return false;
        }
        kj0 kj0Var = (kj0) obj;
        return this.a.equals(kj0Var.a) && this.b.equals(kj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
