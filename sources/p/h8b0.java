package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h8b0 implements Comparable {
    public static final h8b0 e = h4o1.m();
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public h8b0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.d = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.d - ((h8b0) obj).d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h8b0 h8b0Var = obj instanceof h8b0 ? (h8b0) obj : null;
        return h8b0Var != null && this.d == h8b0Var.d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((int) this.a);
        sb.append('.');
        sb.append((int) this.b);
        sb.append('.');
        sb.append((int) this.c);
        return sb.toString();
    }
}
