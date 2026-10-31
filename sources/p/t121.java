package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t121 extends j6p1 {
    public final String c;
    public final m0u d;

    public t121(String str, m0u m0uVar) {
        this.c = str;
        this.d = m0uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t121)) {
            return false;
        }
        t121 t121Var = (t121) obj;
        return u890.j(this.c, t121Var.c) && u890.j(this.d, t121Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
