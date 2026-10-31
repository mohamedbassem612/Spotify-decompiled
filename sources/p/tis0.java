package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tis0 extends bro1 {
    public final boolean b;
    public final boolean c;

    public tis0(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tis0)) {
            return false;
        }
        tis0 tis0Var = (tis0) obj;
        return this.b == tis0Var.b && this.c == tis0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }
}
