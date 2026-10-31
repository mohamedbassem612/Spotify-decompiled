package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class no3 implements oo3 {
    public final bx51 a;
    public final int b;

    public no3(bx51 bx51Var, int i) {
        this.a = bx51Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no3)) {
            return false;
        }
        no3 no3Var = (no3) obj;
        return this.a == no3Var.a && this.b == no3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
