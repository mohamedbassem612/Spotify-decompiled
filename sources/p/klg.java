package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class klg extends dlg {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final h290 e;

    public klg(String str, long j, long j2, String str2, h290 h290Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klg)) {
            return false;
        }
        klg klgVar = (klg) obj;
        return this.a.equals(klgVar.a) && this.b == klgVar.b && this.c == klgVar.c && this.d.equals(klgVar.d) && this.e.equals(klgVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d);
    }
}
