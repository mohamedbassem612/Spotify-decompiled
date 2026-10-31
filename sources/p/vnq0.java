package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vnq0 extends hoq0 {
    public final c560 a;
    public final String b;

    public vnq0(c560 c560Var, String str) {
        this.a = c560Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnq0)) {
            return false;
        }
        vnq0 vnq0Var = (vnq0) obj;
        return this.a.equals(vnq0Var.a) && this.b.equals(vnq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
