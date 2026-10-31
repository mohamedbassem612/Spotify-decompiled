package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jsb1 {
    public final boolean a;
    public final int b;

    public jsb1(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsb1)) {
            return false;
        }
        jsb1 jsb1Var = (jsb1) obj;
        return this.a == jsb1Var.a && this.b == jsb1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
