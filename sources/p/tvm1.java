package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tvm1 {
    public final boolean a;
    public final boolean b;

    public tvm1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvm1)) {
            return false;
        }
        tvm1 tvm1Var = (tvm1) obj;
        return this.a == tvm1Var.a && this.b == tvm1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
