package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gd2 implements id2 {
    public final boolean a;
    public final int b;

    public gd2(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd2)) {
            return false;
        }
        gd2 gd2Var = (gd2) obj;
        return this.a == gd2Var.a && this.b == gd2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
