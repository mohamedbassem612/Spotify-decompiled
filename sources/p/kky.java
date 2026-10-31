package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kky {
    public final String a;
    public final String b;
    public final jky c;

    public kky(String str, String str2, jky jkyVar) {
        this.a = str;
        this.b = str2;
        this.c = jkyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kky)) {
            return false;
        }
        kky kkyVar = (kky) obj;
        return u890.j(this.a, kkyVar.a) && u890.j(this.b, kkyVar.b) && u890.j(this.c, kkyVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ kky(String str) {
        this(str, null, gky.a);
    }
}
