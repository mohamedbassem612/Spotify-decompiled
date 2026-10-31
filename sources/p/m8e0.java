package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m8e0 extends h4p1 {
    public final Object c;
    public final Throwable d;

    public m8e0(Object obj, Throwable th) {
        this.c = obj;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8e0)) {
            return false;
        }
        m8e0 m8e0Var = (m8e0) obj;
        return u890.j(this.c, m8e0Var.c) && this.d.equals(m8e0Var.d);
    }

    public final int hashCode() {
        Object obj = this.c;
        return this.d.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
