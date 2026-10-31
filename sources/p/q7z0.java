package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q7z0 extends z8z0 {
    public final boolean a;
    public final boolean b;

    public q7z0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7z0)) {
            return false;
        }
        q7z0 q7z0Var = (q7z0) obj;
        return this.a == q7z0Var.a && this.b == q7z0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
