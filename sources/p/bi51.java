package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class bi51 {
    public static final wh51 Companion = new wh51();
    public final zp70 a;
    public final wlc0 b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ bi51(int i, zp70 zp70Var, wlc0 wlc0Var, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, vh51.a.getDescriptor());
            throw null;
        }
        this.a = zp70Var;
        this.b = wlc0Var;
        this.c = str;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi51)) {
            return false;
        }
        bi51 bi51Var = (bi51) obj;
        return u890.j(this.a, bi51Var.a) && u890.j(this.b, bi51Var.b) && u890.j(this.c, bi51Var.c) && u890.j(this.d, bi51Var.d) && u890.j(this.e, bi51Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
