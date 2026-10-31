package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wxi1 {
    public final String a;
    public final String b;
    public final int c;

    public wxi1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxi1)) {
            return false;
        }
        wxi1 wxi1Var = (wxi1) obj;
        return this.a.equals(wxi1Var.a) && u890.j(this.b, wxi1Var.b) && this.c == wxi1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
