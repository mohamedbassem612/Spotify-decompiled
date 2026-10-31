package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k291 {
    public static final k291 c;
    public final c5u a;
    public final c5u b;

    static {
        y4u y4uVar = y4u.a;
        c = new k291(y4uVar, y4uVar);
    }

    public k291(c5u c5uVar, c5u c5uVar2) {
        this.a = c5uVar;
        this.b = c5uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k291)) {
            return false;
        }
        k291 k291Var = (k291) obj;
        return this.a.equals(k291Var.a) && this.b.equals(k291Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
