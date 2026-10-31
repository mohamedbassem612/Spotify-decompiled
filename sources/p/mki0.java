package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mki0 extends hso1 {
    public final String b;
    public final boolean c;

    public mki0(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mki0)) {
            return false;
        }
        mki0 mki0Var = (mki0) obj;
        return u890.j(this.b, mki0Var.b) && this.c == mki0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
