package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class g7p1 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public int a() {
        return 64;
    }

    public abstract byte[] b();

    public abstract int c();

    public abstract long d();

    public byte[] e() {
        return b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g7p1)) {
            return false;
        }
        g7p1 g7p1Var = (g7p1) obj;
        return a() == g7p1Var.a() && f(g7p1Var);
    }

    public abstract boolean f(g7p1 g7p1Var);

    public final int hashCode() {
        if (a() >= 32) {
            return c();
        }
        byte[] bArrE = e();
        int i = bArrE[0] & 255;
        for (int i2 = 1; i2 < bArrE.length; i2++) {
            i |= (bArrE[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrE = e();
        int length = bArrE.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArrE) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
