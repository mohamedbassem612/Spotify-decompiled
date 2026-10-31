package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a9u extends d9u {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public a9u(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9u)) {
            return false;
        }
        a9u a9uVar = (a9u) obj;
        return u890.j(this.a, a9uVar.a) && this.b.equals(a9uVar.b) && u890.j(this.c, a9uVar.c) && this.d.equals(a9uVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
