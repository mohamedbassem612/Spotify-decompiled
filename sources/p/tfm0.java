package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tfm0 {
    public final mmr0 a;
    public final int b;

    public tfm0(mmr0 mmr0Var, int i) {
        this.a = mmr0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfm0)) {
            return false;
        }
        tfm0 tfm0Var = (tfm0) obj;
        return this.a.equals(tfm0Var.a) && this.b == tfm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
