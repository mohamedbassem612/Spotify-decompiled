package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zxh1 extends dyh1 {
    public final lk7 a;
    public final String b;

    public zxh1(lk7 lk7Var, String str) {
        this.a = lk7Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxh1)) {
            return false;
        }
        zxh1 zxh1Var = (zxh1) obj;
        return this.a.equals(zxh1Var.a) && this.b.equals(zxh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
