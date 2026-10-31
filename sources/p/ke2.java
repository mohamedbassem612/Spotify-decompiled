package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ke2 extends me2 {
    public final boolean a;
    public final int b;

    public ke2(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke2)) {
            return false;
        }
        ke2 ke2Var = (ke2) obj;
        return this.a == ke2Var.a && this.b == ke2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
