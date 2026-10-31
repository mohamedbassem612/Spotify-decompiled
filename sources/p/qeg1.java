package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qeg1 {
    public final int a;
    public final int b;
    public final int c;

    public qeg1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qeg1)) {
            return false;
        }
        qeg1 qeg1Var = (qeg1) obj;
        return this.a == qeg1Var.a && this.b == qeg1Var.b && this.c == qeg1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(8388611) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
