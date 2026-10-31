package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lij1 {
    public final boolean a;
    public final boolean b;

    public lij1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lij1)) {
            return false;
        }
        lij1 lij1Var = (lij1) obj;
        return this.a == lij1Var.a && this.b == lij1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
