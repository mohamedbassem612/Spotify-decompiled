package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class njj1 {
    public final String a;
    public final boolean b;

    public njj1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njj1)) {
            return false;
        }
        njj1 njj1Var = (njj1) obj;
        return u890.j(this.a, njj1Var.a) && this.b == njj1Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
