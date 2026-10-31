package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mlo0 extends xio1 {
    public final String c;
    public final boolean d;

    public mlo0(String str, boolean z) {
        super((byte) 11);
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlo0)) {
            return false;
        }
        mlo0 mlo0Var = (mlo0) obj;
        return this.c.equals(mlo0Var.c) && this.d == mlo0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
