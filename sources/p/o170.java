package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class o170 {
    public static final rhc a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        rhc rhcVar = new rhc(ryn1.m("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"));
        rhcVar.c = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        a = rhcVar;
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = z4n1.d("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = l1d.n(strArr2[i2], "|PADDED", new StringBuilder());
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = l1d.n(strArr3[i4], "|PADDED", sb);
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(int i) {
        String[] strArr = b;
        return i < strArr.length ? strArr[i] : z4n1.d("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0055  */
    public static String b(boolean z, int i, int i2, int i3, int i4) {
        String strW;
        String str;
        String strA = a(i3);
        if (i4 == 0) {
            strW = "";
        } else {
            String[] strArr = d;
            if (i3 == 2 || i3 == 3) {
                strW = strArr[i4];
            } else if (i3 == 4 || i3 == 6) {
                strW = i4 == 1 ? "ACK" : strArr[i4];
            } else if (i3 == 7 || i3 == 8) {
                strW = strArr[i4];
            } else {
                String[] strArr2 = c;
                if (i4 < strArr2.length) {
                    str = strArr2[i4];
                    str.getClass();
                } else {
                    str = strArr[i4];
                }
                if (i3 != 5 || (i4 & 4) == 0) {
                    strW = (i3 != 0 || (i4 & 32) == 0) ? str : nhc1.W(str, "PRIORITY", "COMPRESSED");
                } else {
                    strW = nhc1.W(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return z4n1.d("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strA, strW);
    }

    public static String c(int i, int i2, long j, boolean z) {
        return z4n1.d("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a(8), Long.valueOf(j));
    }
}
