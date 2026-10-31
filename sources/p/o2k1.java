package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o2k1 implements q2k1 {
    public final String a;
    public final boolean b;

    public o2k1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2k1)) {
            return false;
        }
        o2k1 o2k1Var = (o2k1) obj;
        return this.a.equals(o2k1Var.a) && this.b == o2k1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
