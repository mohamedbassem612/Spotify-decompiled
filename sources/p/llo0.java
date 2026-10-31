package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class llo0 extends xio1 {
    public final String c;
    public final boolean d;

    public llo0(String str, boolean z) {
        super((byte) 11);
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llo0)) {
            return false;
        }
        llo0 llo0Var = (llo0) obj;
        return this.c.equals(llo0Var.c) && this.d == llo0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
