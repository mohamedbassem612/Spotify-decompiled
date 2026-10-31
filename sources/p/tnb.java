package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tnb {
    public final String a;
    public final String b;
    public final boolean c;

    public tnb(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnb)) {
            return false;
        }
        tnb tnbVar = (tnb) obj;
        return u890.j(this.a, tnbVar.a) && u890.j(this.b, tnbVar.b) && this.c == tnbVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ tnb() {
        this("", null, false);
    }
}
