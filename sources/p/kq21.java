package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kq21 implements nq21 {
    public final String a;
    public final irn0 b;

    public kq21(String str, irn0 irn0Var) {
        this.a = str;
        this.b = irn0Var;
    }

    public final String a() {
        return this.a;
    }

    public final irn0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq21)) {
            return false;
        }
        kq21 kq21Var = (kq21) obj;
        return this.a.equals(kq21Var.a) && this.b.equals(kq21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
