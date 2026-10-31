package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yys0 implements czs0 {
    public final int a;
    public final char b;

    public yys0(char c, int i) {
        this.a = i;
        this.b = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yys0)) {
            return false;
        }
        yys0 yys0Var = (yys0) obj;
        return this.a == yys0Var.a && this.b == yys0Var.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
