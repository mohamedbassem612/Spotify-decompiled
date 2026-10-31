package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ke91 implements le91 {
    public final ef91 a;
    public final Throwable b;
    public final ice0 c;

    public ke91(ef91 ef91Var, Throwable th, ice0 ice0Var) {
        this.a = ef91Var;
        this.b = th;
        this.c = ice0Var;
    }

    @Override // p.le91
    public final String breadcrumb() {
        return "SlotFailed: " + this.a + ", error=" + this.b + ", strategy=" + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke91)) {
            return false;
        }
        ke91 ke91Var = (ke91) obj;
        return this.a == ke91Var.a && this.b.equals(ke91Var.b) && this.c == ke91Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
