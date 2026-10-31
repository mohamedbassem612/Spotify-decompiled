package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class m0z {
    public static final l0z Companion = new l0z();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ m0z(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, k0z.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0z)) {
            return false;
        }
        m0z m0zVar = (m0z) obj;
        return u890.j(this.a, m0zVar.a) && u890.j(this.b, m0zVar.b) && u890.j(this.c, m0zVar.c) && u890.j(this.d, m0zVar.d) && u890.j(this.e, m0zVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
