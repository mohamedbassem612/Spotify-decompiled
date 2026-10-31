package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v0e {
    public final String a;
    public final String b;
    public final String c;

    public v0e(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0e)) {
            return false;
        }
        v0e v0eVar = (v0e) obj;
        return u890.j(this.a, v0eVar.a) && u890.j(this.b, v0eVar.b) && this.c.equals(v0eVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
