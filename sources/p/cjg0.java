package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cjg0 extends ern1 {
    public final boolean c;
    public final q560 d;

    public cjg0(boolean z, q560 q560Var) {
        this.c = z;
        this.d = q560Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjg0)) {
            return false;
        }
        cjg0 cjg0Var = (cjg0) obj;
        return this.c == cjg0Var.c && this.d.equals(cjg0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Boolean.hashCode(this.c) * 31);
    }
}
