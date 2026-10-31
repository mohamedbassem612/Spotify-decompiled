package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gqi1 implements nma0 {
    public static final gqi1 a = new gqi1();
    public static final qnw0 b = new qnw0("kotlin.uuid.Uuid", knw0.o);

    public final Object deserialize(dar darVar) {
        String strV = darVar.V();
        int length = strV.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strV.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = a860.d[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                fc11.m0(i, strV, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strV.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = a860.d[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                fc11.m0(i2, strV, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new eqi1(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strV.length() <= 64 ? strV : strV.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strV.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strV.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = a860.d[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                fc11.m0(i, strV, "a hexadecimal digit");
                throw null;
            }
            if (strV.charAt(8) != '-') {
                fc11.m0(8, strV, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strV.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = a860.d[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                fc11.m0(i3, strV, "a hexadecimal digit");
                throw null;
            }
            if (strV.charAt(13) != '-') {
                fc11.m0(13, strV, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strV.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = a860.d[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                fc11.m0(i4, strV, "a hexadecimal digit");
                throw null;
            }
            if (strV.charAt(18) != '-') {
                fc11.m0(18, strV, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strV.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = a860.d[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                fc11.m0(i5, strV, "a hexadecimal digit");
                throw null;
            }
            if (strV.charAt(23) != '-') {
                fc11.m0(23, strV, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strV.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = a860.d[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                fc11.m0(i6, strV, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new eqi1(j22, j23);
            }
        }
        return eqi1.c;
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.h0(((eqi1) obj).toString());
    }
}
