package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tom0 implements xom0 {
    public final String a;
    public final String b;
    public final int c;

    public tom0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tom0)) {
            return false;
        }
        tom0 tom0Var = (tom0) obj;
        return this.a.equals(tom0Var.a) && this.b.equals(tom0Var.b) && this.c == tom0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
