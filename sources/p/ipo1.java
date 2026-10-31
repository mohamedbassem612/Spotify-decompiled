package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ipo1 {
    public final int a;
    public final b380 b;

    public ipo1(int i, b380 b380Var) {
        this.a = i;
        this.b = b380Var;
    }

    public static iti1 a() {
        return new iti1();
    }

    public final int b() {
        return this.a;
    }

    public final b380 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ipo1) {
            ipo1 ipo1Var = (ipo1) obj;
            if (this.a == ipo1Var.a) {
                b380 b380Var = ipo1Var.b;
                b380 b380Var2 = this.b;
                b380Var2.getClass();
                if (z1p1.j(b380Var2, b380Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientQueue{currentIndex=" + this.a + ", entries=" + this.b.toString() + "}";
    }
}
