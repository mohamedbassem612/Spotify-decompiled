package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class krf1 extends mrf1 {
    public final String a;
    public final int b;
    public final String c;

    public krf1(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krf1)) {
            return false;
        }
        krf1 krf1Var = (krf1) obj;
        return this.a.equals(krf1Var.a) && this.b == krf1Var.b && u890.j(this.c, krf1Var.c);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
