package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qci1 implements vci1 {
    public final int a;
    public final int b;
    public final int c;

    public qci1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qci1)) {
            return false;
        }
        qci1 qci1Var = (qci1) obj;
        return this.a == qci1Var.a && this.b == qci1Var.b && this.c == qci1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
