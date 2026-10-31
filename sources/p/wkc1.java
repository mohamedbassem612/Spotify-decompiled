package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wkc1 {
    public final String a;
    public final String b;
    public final String c;

    public wkc1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkc1)) {
            return false;
        }
        wkc1 wkc1Var = (wkc1) obj;
        return u890.j(this.a, wkc1Var.a) && u890.j(this.b, wkc1Var.b) && poo1.C(this.c, wkc1Var.c);
    }

    public final int hashCode() {
        return poo1.E(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
