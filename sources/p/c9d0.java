package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c9d0 {
    public final Object a;
    public final String b;

    public c9d0(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9d0)) {
            return false;
        }
        c9d0 c9d0Var = (c9d0) obj;
        return this.a == c9d0Var.a && this.b.equals(c9d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
