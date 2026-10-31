package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class scu implements vcu {
    public final String a;
    public final String b;

    public scu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scu)) {
            return false;
        }
        scu scuVar = (scu) obj;
        return u890.j(this.a, scuVar.a) && this.b.equals(scuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
