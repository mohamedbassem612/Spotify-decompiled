package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ijh {
    public final int a;
    public final uge1 b;
    public final int c;
    public final tuw d;
    public final String e;
    public final String f;

    public ijh(int i, uge1 uge1Var, int i2, tuw tuwVar, String str, String str2) {
        this.a = i;
        this.b = uge1Var;
        this.c = i2;
        this.d = tuwVar;
        this.e = str;
        this.f = str2;
    }

    public static ijh a(ijh ijhVar, uge1 uge1Var, int i, tuw tuwVar, String str, String str2, int i2) {
        int i3 = i;
        int i4 = ijhVar.a;
        if ((i2 & 4) != 0) {
            i3 = ijhVar.c;
        }
        if ((i2 & 8) != 0) {
            tuwVar = ijhVar.d;
        }
        if ((i2 & 16) != 0) {
            str = ijhVar.e;
        }
        if ((i2 & 32) != 0) {
            str2 = ijhVar.f;
        }
        String str3 = str2;
        ijhVar.getClass();
        String str4 = str;
        return new ijh(i4, uge1Var, i3, tuwVar, str4, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijh)) {
            return false;
        }
        ijh ijhVar = (ijh) obj;
        return this.a == ijhVar.a && u890.j(this.b, ijhVar.b) && this.c == ijhVar.c && this.d == ijhVar.d && u890.j(this.e, ijhVar.e) && u890.j(this.f, ijhVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d((this.d.hashCode() + kaa0.f(this.c, f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b.a), 31)) * 31, 31, this.e);
        String str = this.f;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
