package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class b6b {
    public static final a6b Companion = new a6b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public /* synthetic */ b6b(String str, int i, String str2, String str3, boolean z, String str4) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, z5b.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6b)) {
            return false;
        }
        b6b b6bVar = (b6b) obj;
        return u890.j(this.a, b6bVar.a) && u890.j(this.b, b6bVar.b) && u890.j(this.c, b6bVar.c) && u890.j(this.d, b6bVar.d) && this.e == b6bVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
