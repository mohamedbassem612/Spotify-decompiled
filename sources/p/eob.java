package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eob {
    public final iob a;
    public final String b;

    public eob(iob iobVar, String str) {
        this.a = iobVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eob)) {
            return false;
        }
        eob eobVar = (eob) obj;
        return u890.j(this.a, eobVar.a) && u890.j(this.b, eobVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ eob() {
        this(j561.N0, null);
    }
}
