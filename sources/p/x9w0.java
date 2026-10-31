package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x9w0 {
    public final String a;
    public final hux b;
    public final boolean c;

    public /* synthetic */ x9w0(int i, String str, hux huxVar, boolean z) {
        this((i & 2) != 0 ? null : huxVar, str, (i & 4) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9w0)) {
            return false;
        }
        x9w0 x9w0Var = (x9w0) obj;
        return u890.j(this.a, x9w0Var.a) && u890.j(this.b, x9w0Var.b) && this.c == x9w0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hux huxVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (huxVar == null ? 0 : huxVar.hashCode())) * 31);
    }

    public x9w0(hux huxVar, String str, boolean z) {
        this.a = str;
        this.b = huxVar;
        this.c = z;
    }
}
