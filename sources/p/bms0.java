package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bms0 {
    public final String a;
    public final boolean b;
    public final String c;

    public bms0(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bms0)) {
            return false;
        }
        bms0 bms0Var = (bms0) obj;
        return this.a.equals(bms0Var.a) && this.b == bms0Var.b && u890.j(this.c, bms0Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
