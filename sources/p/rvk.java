package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rvk {
    public final String a;
    public final String b;
    public final sxk c;
    public final String d;

    public rvk(String str, String str2, sxk sxkVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = sxkVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvk)) {
            return false;
        }
        rvk rvkVar = (rvk) obj;
        return u890.j(this.a, rvkVar.a) && u890.j(this.b, rvkVar.b) && this.c.equals(rvkVar.c) && u890.j(this.d, rvkVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
