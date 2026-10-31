package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ua7 implements za7 {
    public final i a;
    public final tv80 b;

    public ua7(i iVar, tv80 tv80Var) {
        this.a = iVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua7)) {
            return false;
        }
        ua7 ua7Var = (ua7) obj;
        return this.a.equals(ua7Var.a) && this.b.equals(ua7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
