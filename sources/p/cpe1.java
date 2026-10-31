package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class cpe1 {
    public static final bpe1 Companion = new bpe1();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ cpe1(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, ape1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpe1)) {
            return false;
        }
        cpe1 cpe1Var = (cpe1) obj;
        return u890.j(this.a, cpe1Var.a) && u890.j(this.b, cpe1Var.b) && u890.j(this.c, cpe1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
