package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class jji0 {
    public static final bji0 Companion = new bji0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ jji0(int i, String str, String str2, String str3, String str4) {
        if (11 != (i & 11)) {
            o6p1.t(i, 11, aji0.a.getDescriptor());
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jji0)) {
            return false;
        }
        jji0 jji0Var = (jji0) obj;
        return u890.j(this.a, jji0Var.a) && u890.j(this.b, jji0Var.b) && u890.j(this.c, jji0Var.c) && u890.j(this.d, jji0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
