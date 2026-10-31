package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class het {
    public final String a;
    public final String b;
    public final byte c;
    public final ziz0 d;
    public final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public het(String str, String str2, int i, ziz0 ziz0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = ziz0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof het) {
            het hetVar = (het) obj;
            if (u890.j(this.a, hetVar.a) && this.b.equals(hetVar.b) && this.c == hetVar.c && this.d == hetVar.d && this.e == hetVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }
}
