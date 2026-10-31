package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fca1 implements gca1 {
    public final String a;
    public final String b;
    public final int c;

    public fca1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fca1)) {
            return false;
        }
        fca1 fca1Var = (fca1) obj;
        return this.a.equals(fca1Var.a) && u890.j(this.b, fca1Var.b) && this.c == fca1Var.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
