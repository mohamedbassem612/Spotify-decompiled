package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kfs0 {
    public final String a;
    public final String b;
    public final int c;

    public kfs0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfs0)) {
            return false;
        }
        kfs0 kfs0Var = (kfs0) obj;
        return this.a.equals(kfs0Var.a) && this.b.equals(kfs0Var.b) && this.c == kfs0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
