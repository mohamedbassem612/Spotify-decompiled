package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kuj1 extends muj1 {
    public final int a;
    public final String b;
    public final String c;

    public kuj1(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuj1)) {
            return false;
        }
        kuj1 kuj1Var = (kuj1) obj;
        return this.a == kuj1Var.a && u890.j(this.b, kuj1Var.b) && this.c.equals(kuj1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
