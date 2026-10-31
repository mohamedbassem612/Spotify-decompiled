package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c2w {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;

    public c2w(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2w)) {
            return false;
        }
        c2w c2wVar = (c2w) obj;
        return u890.j(this.a, c2wVar.a) && this.b == c2wVar.b && u890.j(this.c, c2wVar.c) && this.d == c2wVar.d;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iK + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ c2w(int i, String str, String str2) {
        this(2, str, str2, false);
    }
}
