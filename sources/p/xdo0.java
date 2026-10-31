package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xdo0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xdo0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdo0)) {
            return false;
        }
        xdo0 xdo0Var = (xdo0) obj;
        return this.a.equals(xdo0Var.a) && this.b.equals(xdo0Var.b) && this.c.equals(xdo0Var.c) && this.d.equals(xdo0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
