package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class erf1 {
    public final drf1 a;
    public final srt0 b;

    public erf1(drf1 drf1Var, srt0 srt0Var) {
        this.a = drf1Var;
        this.b = srt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erf1)) {
            return false;
        }
        erf1 erf1Var = (erf1) obj;
        return u890.j(this.a, erf1Var.a) && u890.j(this.b, erf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public /* synthetic */ erf1(drf1 drf1Var) {
        this(drf1Var, ert0.a);
    }
}
