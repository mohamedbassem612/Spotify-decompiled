package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r7w {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final iu30 e;

    public r7w(String str, String str2, String str3, String str4, iu30 iu30Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7w)) {
            return false;
        }
        r7w r7wVar = (r7w) obj;
        return this.a.equals(r7wVar.a) && u890.j(this.b, r7wVar.b) && this.c.equals(r7wVar.c) && this.d.equals(r7wVar.d) && u890.j(this.e, r7wVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }
}
