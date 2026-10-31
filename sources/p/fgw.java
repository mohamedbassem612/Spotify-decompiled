package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fgw implements niw {
    public final String a;
    public final String b;
    public final Throwable c;

    public fgw(String str, String str2, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgw)) {
            return false;
        }
        fgw fgwVar = (fgw) obj;
        return u890.j(this.a, fgwVar.a) && u890.j(this.b, fgwVar.b) && u890.j(this.c, fgwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
