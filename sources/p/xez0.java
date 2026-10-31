package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class xez0 {
    public static final vez0 Companion = new vez0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ xez0(String str, String str2, int i, String str3) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, pez0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xez0)) {
            return false;
        }
        xez0 xez0Var = (xez0) obj;
        return u890.j(this.a, xez0Var.a) && u890.j(this.b, xez0Var.b) && u890.j(this.c, xez0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
