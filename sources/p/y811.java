package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y811 implements z811 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public y811(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y811)) {
            return false;
        }
        y811 y811Var = (y811) obj;
        return this.a.equals(y811Var.a) && this.b.equals(y811Var.b) && this.c.equals(y811Var.c) && this.d.equals(y811Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
