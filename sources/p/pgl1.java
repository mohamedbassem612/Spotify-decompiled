package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pgl1 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public pgl1(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgl1)) {
            return false;
        }
        pgl1 pgl1Var = (pgl1) obj;
        return this.a.equals(pgl1Var.a) && this.b == pgl1Var.b && this.c == pgl1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
