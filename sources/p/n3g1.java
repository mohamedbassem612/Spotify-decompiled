package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n3g1 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final pnf1 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = zoi1.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public n3g1(pnf1 pnf1Var, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = pnf1Var.a;
        this.a = i2;
        boolean z2 = false;
        dm5.m(i2 == iArr.length && i2 == zArr.length);
        this.b = pnf1Var;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3g1.class != obj.getClass()) {
            return false;
        }
        n3g1 n3g1Var = (n3g1) obj;
        return this.c == n3g1Var.c && this.b.equals(n3g1Var.b) && Arrays.equals(this.d, n3g1Var.d) && Arrays.equals(this.e, n3g1Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
