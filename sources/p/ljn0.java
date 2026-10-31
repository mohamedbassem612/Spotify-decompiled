package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ljn0 extends qjn0 {
    public final boolean a;
    public final int b;

    public ljn0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljn0)) {
            return false;
        }
        ljn0 ljn0Var = (ljn0) obj;
        return this.a == ljn0Var.a && this.b == ljn0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
