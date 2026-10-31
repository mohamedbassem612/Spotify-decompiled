package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x1o implements b2o {
    public final String a;
    public final String b;
    public final String c;

    public x1o(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1o)) {
            return false;
        }
        x1o x1oVar = (x1o) obj;
        return this.a.equals(x1oVar.a) && u890.j(this.b, x1oVar.b) && this.c.equals(x1oVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
