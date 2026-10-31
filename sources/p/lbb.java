package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lbb implements vbb {
    public final fjt a;
    public final String b;

    public lbb(fjt fjtVar, String str) {
        this.a = fjtVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbb)) {
            return false;
        }
        lbb lbbVar = (lbb) obj;
        return this.a == lbbVar.a && u890.j(this.b, lbbVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
