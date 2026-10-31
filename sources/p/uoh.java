package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uoh implements iph {
    public final String a;
    public final String b;
    public final boolean c;
    public final Throwable d;

    public uoh(String str, String str2, boolean z, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoh)) {
            return false;
        }
        uoh uohVar = (uoh) obj;
        return u890.j(this.a, uohVar.a) && u890.j(this.b, uohVar.b) && this.c == uohVar.c && this.d.equals(uohVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
