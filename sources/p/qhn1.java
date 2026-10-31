package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qhn1 {
    public int a;
    public long b;
    public Object c;
    public int d;

    public static /* synthetic */ String b(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public static /* synthetic */ String c(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public long a() {
        int i;
        long j = this.b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        xpm0 xpm0Var = (xpm0) this.c;
        long j2 = j * ((long) xpm0Var.g);
        int i2 = this.a;
        if (i2 != -1 && (i = this.d) != -1) {
            j2 -= (long) (i2 + i);
        }
        if (j2 <= 0) {
            return -9223372036854775807L;
        }
        return zoi1.e0(xpm0Var.d, j2 - 1);
    }
}
