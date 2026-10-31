package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class syw extends qgo1 {
    public final String c;
    public final int d;

    public syw(String str, int i) {
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syw)) {
            return false;
        }
        syw sywVar = (syw) obj;
        return u890.j(this.c, sywVar.c) && this.d == sywVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
