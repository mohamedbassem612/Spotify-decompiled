package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class avc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public avc0(int i, String str, String str2, String str3, String str4) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "#FFFFFF" : str2;
        str4 = (i & 8) != 0 ? "" : str4;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avc0)) {
            return false;
        }
        avc0 avc0Var = (avc0) obj;
        return this.a.equals(avc0Var.a) && this.b.equals(avc0Var.b) && this.c.equals(avc0Var.c) && this.d.equals(avc0Var.d) && this.e.equals(avc0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
