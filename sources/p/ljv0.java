package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ljv0 {
    public final boolean a;
    public final boolean b;

    public ljv0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljv0)) {
            return false;
        }
        ljv0 ljv0Var = (ljv0) obj;
        return this.a == ljv0Var.a && this.b == ljv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
