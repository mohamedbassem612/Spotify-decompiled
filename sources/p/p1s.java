package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p1s {
    public final String a;
    public final String b;
    public final String c;

    public p1s(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1s)) {
            return false;
        }
        p1s p1sVar = (p1s) obj;
        return this.a.equals(p1sVar.a) && u890.j(this.b, p1sVar.b) && this.c.equals(p1sVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
