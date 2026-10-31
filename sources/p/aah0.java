package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aah0 implements cah0 {
    public final bbh0 a;

    public aah0(bbh0 bbh0Var) {
        this.a = bbh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aah0) && this.a == ((aah0) obj).a;
    }

    public final int hashCode() {
        bbh0 bbh0Var = this.a;
        if (bbh0Var == null) {
            return 0;
        }
        return bbh0Var.hashCode();
    }
}
