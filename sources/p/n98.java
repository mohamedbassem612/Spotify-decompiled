package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n98 {
    public final mmr0 a;
    public final boolean b;

    public n98(mmr0 mmr0Var, boolean z) {
        this.a = mmr0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n98)) {
            return false;
        }
        n98 n98Var = (n98) obj;
        return this.a.equals(n98Var.a) && this.b == n98Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
