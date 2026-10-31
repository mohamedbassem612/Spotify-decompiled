package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lem implements tey0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final iu30 d;

    public lem(String str, String str2, iu30 iu30Var) {
        this.a = str;
        this.b = true;
        this.c = str2;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lem)) {
            return false;
        }
        lem lemVar = (lem) obj;
        return u890.j(this.a, lemVar.a) && this.b == lemVar.b && u890.j(this.c, lemVar.c) && u890.j(this.d, lemVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return this.d.hashCode() + ((iG + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ lem(int i, String str, String str2) {
        this(str, (i & 4) != 0 ? null : str2, (iu30) rbm.a1);
    }
}
