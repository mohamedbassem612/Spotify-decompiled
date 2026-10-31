package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class reo {
    public final String a;
    public final String b;
    public final String c;

    public reo(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reo)) {
            return false;
        }
        reo reoVar = (reo) obj;
        return this.a.equals(reoVar.a) && this.b.equals(reoVar.b) && this.c.equals(reoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
