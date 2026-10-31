package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qqe1 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public qqe1(int i, String str, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqe1)) {
            return false;
        }
        qqe1 qqe1Var = (qqe1) obj;
        return this.a == qqe1Var.a && this.b == qqe1Var.b && u890.j(this.c, qqe1Var.c) && u890.j(this.d, qqe1Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
