package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ql3 {
    public static final ql3 c = new ql3(0, 0);
    public static final ql3 d = new ql3(1, 0);
    public static final ql3 e = new ql3(2, 0);
    public static final ql3 f = new ql3(0, 1);
    public static final ql3 g = new ql3(1, 1);
    public static final ql3 h = new ql3(2, 1);
    public static final ql3 i = new ql3(0, 2);
    public static final ql3 j = new ql3(1, 2);
    public static final ql3 k = new ql3(2, 2);
    public final byte a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ql3(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ql3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ql3 ql3Var = (ql3) obj;
        return this.a == ql3Var.a && this.b == ql3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) ml3.c(this.a)) + ", vertical=" + ((Object) ol3.c(this.b)) + ')';
    }
}
