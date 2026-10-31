package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class apc {
    public final String a;
    public final String b;
    public final String c;

    public apc(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apc)) {
            return false;
        }
        apc apcVar = (apc) obj;
        return u890.j(this.a, apcVar.a) && u890.j(this.b, apcVar.b) && u890.j(this.c, apcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
