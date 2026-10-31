package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class guo0 extends puo0 {
    public final boolean a;
    public final int b;

    public guo0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guo0)) {
            return false;
        }
        guo0 guo0Var = (guo0) obj;
        return this.a == guo0Var.a && this.b == guo0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
