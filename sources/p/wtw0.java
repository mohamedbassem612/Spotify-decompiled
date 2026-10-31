package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wtw0 {
    public final boolean a;
    public final boolean b;

    public wtw0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtw0)) {
            return false;
        }
        wtw0 wtw0Var = (wtw0) obj;
        return this.a == wtw0Var.a && this.b == wtw0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
