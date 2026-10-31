package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x3j1 {
    public static final x3j1 d = new x3j1(256, 256, 256);
    public final int a;
    public final int b;
    public final int c;

    public x3j1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3j1)) {
            return false;
        }
        x3j1 x3j1Var = (x3j1) obj;
        return this.a == x3j1Var.a && this.b == x3j1Var.b && this.c == x3j1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append('.');
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i3);
        sb2.append('.');
        sb2.append(i);
        sb2.append('.');
        sb2.append(i2);
        return sb2.toString();
    }
}
