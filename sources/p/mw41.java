package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mw41 {
    public final boolean a;
    public final boolean b;

    public mw41(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw41)) {
            return false;
        }
        mw41 mw41Var = (mw41) obj;
        return this.a == mw41Var.a && this.b == mw41Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
