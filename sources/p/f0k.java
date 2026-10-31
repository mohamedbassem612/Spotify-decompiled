package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f0k extends fjs0 {
    public final boolean e;

    public f0k(o490 o490Var, boolean z) {
        super(o490Var);
        this.e = z;
    }

    public final void e(byte b) {
        if (this.e) {
            k(String.valueOf(b & 255));
        } else {
            i(String.valueOf(b & 255));
        }
    }

    public final void g(int i) {
        if (this.e) {
            k(Long.toString(((long) i) & 4294967295L, 10));
        } else {
            i(Long.toString(((long) i) & 4294967295L, 10));
        }
    }

    public final void h(long j) {
        int i = 63;
        String str = "0";
        if (this.e) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            k(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        i(str);
    }

    public final void j(short s) {
        if (this.e) {
            k(String.valueOf(s & 65535));
        } else {
            i(String.valueOf(s & 65535));
        }
    }
}
