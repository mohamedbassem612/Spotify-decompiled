package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class wt50 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public abstract byte[] a();

    public abstract int b();

    public int c() {
        return 32;
    }

    public abstract boolean d(wt50 wt50Var);

    public byte[] e() {
        return a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wt50)) {
            return false;
        }
        wt50 wt50Var = (wt50) obj;
        return c() == wt50Var.c() && d(wt50Var);
    }

    public final int hashCode() {
        if (c() >= 32) {
            return b();
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
        StringBuilder sb = new StringBuilder(bArrE.length * 2);
        for (byte b : bArrE) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
