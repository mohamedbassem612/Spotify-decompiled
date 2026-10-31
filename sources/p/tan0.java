package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tan0 {
    public final boolean a;
    public final int b;

    public tan0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tan0)) {
            return false;
        }
        tan0 tan0Var = (tan0) obj;
        return this.a == tan0Var.a && this.b == tan0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
