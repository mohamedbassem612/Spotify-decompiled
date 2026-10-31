package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class uui0 {
    public static final tui0 Companion = new tui0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ uui0(int i, String str, String str2, String str3, String str4, String str5) {
        if (27 != (i & 27)) {
            o6p1.t(i, 27, sui0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uui0)) {
            return false;
        }
        uui0 uui0Var = (uui0) obj;
        return u890.j(this.a, uui0Var.a) && u890.j(this.b, uui0Var.b) && u890.j(this.c, uui0Var.c) && u890.j(this.d, uui0Var.d) && u890.j(this.e, uui0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
