package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class le61 {
    public final qf61 a;
    public final xz5 b;

    public le61(qf61 qf61Var, xz5 xz5Var) {
        this.a = qf61Var;
        this.b = xz5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le61)) {
            return false;
        }
        le61 le61Var = (le61) obj;
        return this.a.equals(le61Var.a) && this.b.equals(le61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (xd00.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + xd00.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
