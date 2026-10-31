package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oi90 {
    public final String a;
    public final h290 b;

    public oi90(String str, h290 h290Var) {
        this.a = str;
        this.b = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi90)) {
            return false;
        }
        oi90 oi90Var = (oi90) obj;
        return this.a.equals(oi90Var.a) && this.b.equals(oi90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
