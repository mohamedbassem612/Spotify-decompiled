package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class swb1 {
    public final String a;
    public final boolean b;

    public swb1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swb1)) {
            return false;
        }
        swb1 swb1Var = (swb1) obj;
        return u890.j(this.a, swb1Var.a) && this.b == swb1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
