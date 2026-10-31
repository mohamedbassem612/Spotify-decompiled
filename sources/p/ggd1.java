package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ggd1 {
    public final int a;
    public final kyo1 b;

    public ggd1(int i, kyo1 kyo1Var) {
        this.a = i;
        this.b = kyo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggd1)) {
            return false;
        }
        ggd1 ggd1Var = (ggd1) obj;
        return this.a == ggd1Var.a && this.b.equals(ggd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
