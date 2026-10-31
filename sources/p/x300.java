package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x300 implements y600 {
    public final String a;
    public final Throwable b;

    public x300(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x300)) {
            return false;
        }
        x300 x300Var = (x300) obj;
        return u890.j(this.a, x300Var.a) && u890.j(this.b, x300Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ x300(String str, Exception exc) {
        this(str, (Throwable) exc);
    }
}
