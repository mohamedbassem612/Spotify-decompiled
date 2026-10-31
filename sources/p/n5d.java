package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n5d implements u5d {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;

    public n5d(String str, String str2, String str3, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5d)) {
            return false;
        }
        n5d n5dVar = (n5d) obj;
        return this.a == n5dVar.a && this.b.equals(n5dVar.b) && this.c.equals(n5dVar.c) && u890.j(this.d, n5dVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
