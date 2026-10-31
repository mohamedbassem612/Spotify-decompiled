package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class feg {
    public final heg a;
    public final ydg b;

    public feg(heg hegVar, ydg ydgVar) {
        this.a = hegVar;
        this.b = ydgVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof feg) {
            return u890.j(this.a, ((feg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
