package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class m2b {
    public static final l2b Companion = new l2b();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ m2b(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, k2b.a.getDescriptor());
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
        if (!(obj instanceof m2b)) {
            return false;
        }
        m2b m2bVar = (m2b) obj;
        return u890.j(this.a, m2bVar.a) && u890.j(this.b, m2bVar.b) && u890.j(this.c, m2bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public m2b(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
