package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gde1 implements lde1 {
    public final fde1 a;
    public final int b;

    public gde1(fde1 fde1Var, int i) {
        this.a = fde1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gde1)) {
            return false;
        }
        gde1 gde1Var = (gde1) obj;
        return this.a == gde1Var.a && this.b == gde1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
