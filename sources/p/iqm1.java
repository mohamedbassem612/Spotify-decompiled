package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iqm1 {
    public final String a;
    public final String b;
    public final boolean c;

    public iqm1(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqm1)) {
            return false;
        }
        iqm1 iqm1Var = (iqm1) obj;
        return this.a.equals(iqm1Var.a) && this.b.equals(iqm1Var.b) && this.c == iqm1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
