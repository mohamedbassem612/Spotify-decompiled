package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pod0 {
    public final String a;
    public final i2p1 b;
    public final int c;
    public final String d;

    public pod0(String str, i2p1 i2p1Var, int i, String str2, int i2) {
        i = (i2 & 4) != 0 ? 0 : i;
        str2 = (i2 & 8) != 0 ? null : str2;
        this.a = str;
        this.b = i2p1Var;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pod0)) {
            return false;
        }
        pod0 pod0Var = (pod0) obj;
        return u890.j(this.a, pod0Var.a) && this.b.equals(pod0Var.b) && this.c == pod0Var.c && u890.j(this.d, pod0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = this.c;
        int iC = (iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31;
        String str = this.d;
        return Boolean.hashCode(false) + xcg1.g((iC + (str == null ? 0 : str.hashCode())) * 31, 31, false);
    }
}
