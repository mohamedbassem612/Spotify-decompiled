package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dph0 {
    public final woh0 a;
    public final yxh1 b;
    public final boolean c;

    public dph0(woh0 woh0Var, yxh1 yxh1Var, boolean z) {
        this.a = woh0Var;
        this.b = yxh1Var;
        this.c = z;
    }

    public static dph0 a(dph0 dph0Var, yxh1 yxh1Var, boolean z, int i) {
        woh0 woh0Var = dph0Var.a;
        if ((i & 2) != 0) {
            yxh1Var = dph0Var.b;
        }
        if ((i & 4) != 0) {
            z = dph0Var.c;
        }
        dph0Var.getClass();
        return new dph0(woh0Var, yxh1Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dph0)) {
            return false;
        }
        dph0 dph0Var = (dph0) obj;
        return u890.j(this.a, dph0Var.a) && this.b.equals(dph0Var.b) && this.c == dph0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
