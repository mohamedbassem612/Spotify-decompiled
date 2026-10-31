package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k7z extends yon1 {
    public final dlg1 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final h131 k;

    public k7z(dlg1 dlg1Var, String str, String str2, String str3, String str4, int i, int i2, h131 h131Var) {
        this.d = dlg1Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = i;
        this.j = i2;
        this.k = h131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k7z) {
            k7z k7zVar = (k7z) obj;
            if (this.d == k7zVar.d && this.e.equals(k7zVar.e) && this.f.equals(k7zVar.f) && this.g.equals(k7zVar.g) && this.h.equals(k7zVar.h) && this.i == k7zVar.i && this.j == k7zVar.j && this.k.equals(k7zVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() + ab80.k(this.j, kaa0.f(this.i, cy30.d(cy30.d(cy30.d(cy30.d(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 961, this.h), 31), 31);
    }
}
