package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dlg0 implements glg0 {
    public final String a;
    public final long b;

    public dlg0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlg0)) {
            return false;
        }
        dlg0 dlg0Var = (dlg0) obj;
        if (!u890.j(this.a, dlg0Var.a)) {
            return false;
        }
        long j = dlg0Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
