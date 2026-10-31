package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gg21 {
    public final int a;
    public final c380 b;

    public gg21(int i, c380 c380Var) {
        this.a = i;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg21)) {
            return false;
        }
        gg21 gg21Var = (gg21) obj;
        return this.a == gg21Var.a && u890.j(this.b, gg21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
