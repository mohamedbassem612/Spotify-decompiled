package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pc30 {
    public final boolean a;
    public final boolean b;
    public final Integer c;

    public pc30(boolean z, boolean z2, Integer num) {
        this.a = z;
        this.b = z2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc30)) {
            return false;
        }
        pc30 pc30Var = (pc30) obj;
        return this.a == pc30Var.a && this.b == pc30Var.b && u890.j(this.c, pc30Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return iG + (num == null ? 0 : num.hashCode());
    }
}
