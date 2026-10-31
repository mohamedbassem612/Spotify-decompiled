package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sw0 {
    public final String a;
    public final boolean b;

    public sw0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0)) {
            return false;
        }
        sw0 sw0Var = (sw0) obj;
        return this.a.equals(sw0Var.a) && this.b == sw0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
