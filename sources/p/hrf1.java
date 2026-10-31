package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hrf1 extends mrf1 {
    public final String a;
    public final int b;
    public final String c;

    public hrf1(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrf1)) {
            return false;
        }
        hrf1 hrf1Var = (hrf1) obj;
        return this.a.equals(hrf1Var.a) && this.b == hrf1Var.b && u890.j(this.c, hrf1Var.c);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
