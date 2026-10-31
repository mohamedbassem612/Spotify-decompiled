package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xxz implements y600 {
    public final String a;
    public final Throwable b;
    public final String c;

    public xxz(int i, String str, String str2, Throwable th) {
        th = (i & 2) != 0 ? null : th;
        str2 = (i & 4) != 0 ? null : str2;
        this.a = str;
        this.b = th;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxz)) {
            return false;
        }
        xxz xxzVar = (xxz) obj;
        return u890.j(this.a, xxzVar.a) && u890.j(this.b, xxzVar.b) && u890.j(this.c, xxzVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
