package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vnb1 {
    public final boolean a;
    public final boolean b;

    public vnb1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnb1)) {
            return false;
        }
        vnb1 vnb1Var = (vnb1) obj;
        return this.a == vnb1Var.a && this.b == vnb1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
