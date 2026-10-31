package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class c841 {
    public static final b841 Companion = new b841();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ c841(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, a841.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c841)) {
            return false;
        }
        c841 c841Var = (c841) obj;
        return u890.j(this.a, c841Var.a) && u890.j(this.b, c841Var.b) && u890.j(this.c, c841Var.c) && u890.j(this.d, c841Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + cy30.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public c841(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
