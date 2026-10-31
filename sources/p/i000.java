package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i000 implements y600 {
    public final String a;
    public final Throwable b;

    public i000(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i000)) {
            return false;
        }
        i000 i000Var = (i000) obj;
        return u890.j(this.a, i000Var.a) && u890.j(this.b, i000Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public /* synthetic */ i000(String str, IllegalStateException illegalStateException) {
        this(str, (Throwable) illegalStateException);
    }
}
