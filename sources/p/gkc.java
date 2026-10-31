package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gkc extends ikc {
    public final String b;
    public final String c;

    public gkc(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkc)) {
            return false;
        }
        gkc gkcVar = (gkc) obj;
        return u890.j(this.b, gkcVar.b) && u890.j(this.c, gkcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
