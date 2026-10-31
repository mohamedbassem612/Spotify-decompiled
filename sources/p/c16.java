package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class c16 {
    public static final b16 Companion = new b16();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ c16(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, a16.a.getDescriptor());
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
        if (!(obj instanceof c16)) {
            return false;
        }
        c16 c16Var = (c16) obj;
        return u890.j(this.a, c16Var.a) && u890.j(this.b, c16Var.b) && u890.j(this.c, c16Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
