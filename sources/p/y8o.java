package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class y8o {
    public static final x8o Companion = new x8o();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ y8o(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, w8o.a.getDescriptor());
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
        if (!(obj instanceof y8o)) {
            return false;
        }
        y8o y8oVar = (y8o) obj;
        return u890.j(this.a, y8oVar.a) && u890.j(this.b, y8oVar.b) && u890.j(this.c, y8oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
