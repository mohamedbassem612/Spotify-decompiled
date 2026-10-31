package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tpe implements bqe {
    public final String a;
    public final boolean b;
    public final String c;

    public tpe(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpe)) {
            return false;
        }
        tpe tpeVar = (tpe) obj;
        return u890.j(this.a, tpeVar.a) && this.b == tpeVar.b && u890.j(this.c, tpeVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
