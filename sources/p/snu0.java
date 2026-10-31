package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class snu0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public snu0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snu0)) {
            return false;
        }
        snu0 snu0Var = (snu0) obj;
        return this.a.equals(snu0Var.a) && this.b.equals(snu0Var.b) && this.c.equals(snu0Var.c) && this.d.equals(snu0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
