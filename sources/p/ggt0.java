package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ggt0 extends xzo1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final h131 i;

    public ggt0(String str, String str2, String str3, String str4, int i, int i2, h131 h131Var) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i;
        this.h = i2;
        this.i = h131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggt0)) {
            return false;
        }
        ggt0 ggt0Var = (ggt0) obj;
        return this.c.equals(ggt0Var.c) && this.d.equals(ggt0Var.d) && this.e.equals(ggt0Var.e) && this.f.equals(ggt0Var.f) && this.g == ggt0Var.g && this.h == ggt0Var.h && this.i.equals(ggt0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ab80.k(this.h, kaa0.f(this.g, cy30.d(cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31);
    }
}
