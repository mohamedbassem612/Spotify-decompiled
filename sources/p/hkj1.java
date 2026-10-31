package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hkj1 {
    public final boolean a;
    public final twj1 b;
    public final String c;

    public hkj1(boolean z, twj1 twj1Var, String str) {
        this.a = z;
        this.b = twj1Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkj1)) {
            return false;
        }
        hkj1 hkj1Var = (hkj1) obj;
        return this.a == hkj1Var.a && this.b.equals(hkj1Var.b) && this.c.equals(hkj1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
