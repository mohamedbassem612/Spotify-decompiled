package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pci1 implements vci1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public pci1(int i, int i2, int i3, int i4, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pci1)) {
            return false;
        }
        pci1 pci1Var = (pci1) obj;
        return this.a.equals(pci1Var.a) && this.b.equals(pci1Var.b) && this.c == pci1Var.c && this.d == pci1Var.d && this.e == pci1Var.e && this.f == pci1Var.f;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
        int i = this.f;
        return iF + (i == 0 ? 0 : l1d.C(i));
    }
}
