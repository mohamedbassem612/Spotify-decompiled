package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yff1 {
    public final wff1 a;
    public final srt0 b;
    public final boolean c;
    public final boolean d;

    public yff1(wff1 wff1Var, srt0 srt0Var, boolean z, boolean z2) {
        this.a = wff1Var;
        this.b = srt0Var;
        this.c = z;
        this.d = z2;
    }

    public static yff1 a(yff1 yff1Var, srt0 srt0Var, boolean z, boolean z2, int i) {
        wff1 wff1Var = yff1Var.a;
        if ((i & 2) != 0) {
            srt0Var = yff1Var.b;
        }
        if ((i & 4) != 0) {
            z = yff1Var.c;
        }
        if ((i & 8) != 0) {
            z2 = yff1Var.d;
        }
        return new yff1(wff1Var, srt0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yff1)) {
            return false;
        }
        yff1 yff1Var = (yff1) obj;
        return this.a.equals(yff1Var.a) && this.b.equals(yff1Var.b) && this.c == yff1Var.c && this.d == yff1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
