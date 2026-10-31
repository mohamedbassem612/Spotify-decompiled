package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class flt {
    public final String a;
    public final String b;
    public final String c;

    public flt(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flt)) {
            return false;
        }
        flt fltVar = (flt) obj;
        return u890.j(this.a, fltVar.a) && u890.j(this.b, fltVar.b) && u890.j(this.c, fltVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
