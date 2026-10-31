package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kva1 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public kva1(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kva1)) {
            return false;
        }
        kva1 kva1Var = (kva1) obj;
        return u890.j(this.a, kva1Var.a) && this.b == kva1Var.b && this.c == kva1Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
