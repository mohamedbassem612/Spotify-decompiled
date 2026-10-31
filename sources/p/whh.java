package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class whh implements xhh {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public whh(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whh)) {
            return false;
        }
        whh whhVar = (whh) obj;
        return u890.j(this.a, whhVar.a) && u890.j(this.b, whhVar.b) && u890.j(this.c, whhVar.c) && this.d == whhVar.d;
    }

    @Override // p.xhh
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public /* synthetic */ whh() {
        this("", "", "", false);
    }
}
