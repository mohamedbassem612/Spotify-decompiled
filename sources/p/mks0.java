package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mks0 {
    public final String a;
    public final int b;
    public final String c;

    public mks0(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mks0)) {
            return false;
        }
        mks0 mks0Var = (mks0) obj;
        return this.a.equals(mks0Var.a) && this.b == mks0Var.b && this.c.equals(mks0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
