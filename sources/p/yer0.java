package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yer0 implements qfr0 {
    public final String a;
    public final String b;
    public final String c;
    public final tfr0 d;

    public yer0(String str, String str2, String str3, tfr0 tfr0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yer0)) {
            return false;
        }
        yer0 yer0Var = (yer0) obj;
        return this.a.equals(yer0Var.a) && this.b.equals(yer0Var.b) && this.c.equals(yer0Var.c) && this.d.equals(yer0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
