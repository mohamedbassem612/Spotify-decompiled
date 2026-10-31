package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mum0 {
    public final String a;
    public final String b;

    public mum0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mum0)) {
            return false;
        }
        mum0 mum0Var = (mum0) obj;
        return u890.j(this.a, mum0Var.a) && u890.j(this.b, mum0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
