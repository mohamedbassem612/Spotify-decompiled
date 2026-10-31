package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class afm1 {
    public final String a;
    public final etw0 b;

    public afm1(String str, etw0 etw0Var) {
        this.a = str;
        this.b = etw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afm1)) {
            return false;
        }
        afm1 afm1Var = (afm1) obj;
        return this.a.equals(afm1Var.a) && this.b.equals(afm1Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
