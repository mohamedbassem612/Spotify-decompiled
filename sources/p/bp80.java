package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bp80 implements nma0 {
    public static final bp80 a = new bp80();
    public static final qnw0 b = new qnw0("kotlin.time.Instant", knw0.o);

    /* JADX WARN: Code duplicated, block: B:194:0x0469  */
    /* JADX WARN: Code duplicated, block: B:195:0x047f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0 A[PHI: r3
      0x00e0: PHI (r3v20 p.az8) = (r3v4 p.az8), (r3v6 p.az8), (r3v8 p.az8), (r3v10 p.az8), (r3v12 p.az8) binds: [B:39:0x00de, B:42:0x00ef, B:45:0x0100, B:48:0x0112, B:51:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:195:0x047f, please report this as an issue */
    public final Object deserialize(dar darVar) {
        int i;
        int i2;
        int i3;
        az8 az8VarC;
        int i4;
        char cCharAt;
        char cCharAt2;
        lo80 lo80Var = lo80.c;
        String strV = darVar.V();
        if (strV.length() == 0) {
            az8VarC = new az8("An empty string is not a valid Instant", strV, (byte) 3);
        } else {
            char cCharAt3 = strV.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i5 = i;
            while (i5 < strV.length() && '0' <= (cCharAt2 = strV.charAt(i5)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strV.charAt(i5) - '0');
                i5++;
            }
            int i6 = i5 - i;
            if (i6 > 10) {
                az8VarC = hm5.C(strV, "Expected at most 10 digits for the year number, got " + i6 + " digits");
            } else if (i6 == 10 && u890.q(strV.charAt(i), 50) >= 0) {
                az8VarC = hm5.C(strV, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
            } else if (i6 < 4) {
                az8VarC = hm5.C(strV, "The year number must be padded to 4 digits, got " + i6 + " digits");
            } else if (cCharAt3 == '+' && i6 == 4) {
                az8VarC = hm5.C(strV, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i6 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i7 = i5 + 16;
                if (strV.length() < i7) {
                    az8VarC = hm5.C(strV, "The input string is too short");
                } else {
                    az8 az8VarB = hm5.B(i5, strV, "'-'", new pv40((byte) 5));
                    if (az8VarB == null && (az8VarB = hm5.B(i5 + 3, strV, "'-'", new pv40((byte) 6))) == null && (az8VarB = hm5.B(i5 + 6, strV, "'T' or 't'", new pv40((byte) 7))) == null && (az8VarB = hm5.B(i5 + 9, strV, "':'", new pv40((byte) 8))) == null) {
                        int i8 = 9;
                        az8VarB = hm5.B(i5 + 12, strV, "':'", new pv40((byte) 9));
                        if (az8VarB != null) {
                            az8VarC = az8VarB;
                        } else {
                            int[] iArr = hm5.b;
                            int i9 = 0;
                            while (i9 < 10) {
                                int i10 = i8;
                                az8VarC = hm5.B(iArr[i9] + i5, strV, "an ASCII digit", new pv40((byte) 10));
                                if (az8VarC == null) {
                                    i9++;
                                    i8 = i10;
                                }
                            }
                            int i11 = i8;
                            int iD = hm5.D(i5 + 1, strV);
                            int iD2 = hm5.D(i5 + 4, strV);
                            int iD3 = hm5.D(i5 + 7, strV);
                            int iD4 = hm5.D(i5 + 10, strV);
                            int iD5 = hm5.D(i5 + 13, strV);
                            int i12 = i5 + 15;
                            if (strV.charAt(i12) == '.') {
                                i12 = i7;
                                int iCharAt2 = 0;
                                while (i12 < strV.length() && '0' <= (cCharAt = strV.charAt(i12)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (strV.charAt(i12) - '0');
                                    i12++;
                                }
                                int i13 = i12 - i7;
                                if (1 > i13 || i13 >= 10) {
                                    az8VarC = hm5.C(strV, "1..9 digits are supported for the fraction of the second, got " + i13 + " digits");
                                } else {
                                    i2 = iCharAt2 * hm5.a[9 - i13];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i12 >= strV.length()) {
                                az8VarC = hm5.C(strV, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = strV.charAt(i12);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = strV.length() - i12;
                                    if (length > i11) {
                                        az8VarC = hm5.C(strV, "The UTC offset string \"" + hm5.Q(16, strV.subSequence(i12, strV.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        az8VarC = hm5.C(strV, "Invalid UTC offset string \"" + strV.subSequence(i12, strV.length()).toString() + '\"');
                                    } else {
                                        int[] iArr2 = hm5.c;
                                        int i14 = 0;
                                        for (int i15 = 2; i14 < i15; i15 = 2) {
                                            int i16 = i12 + iArr2[i14];
                                            if (i16 >= strV.length()) {
                                                break;
                                            }
                                            int[] iArr3 = iArr2;
                                            if (strV.charAt(i16) != ':') {
                                                StringBuilder sbR = cy30.r(i16, "Expected ':' at index ", ", got '");
                                                sbR.append(strV.charAt(i16));
                                                sbR.append('\'');
                                                az8VarC = hm5.C(strV, sbR.toString());
                                            } else {
                                                i14++;
                                                iArr2 = iArr3;
                                            }
                                        }
                                        int[] iArr4 = hm5.d;
                                        int i17 = 0;
                                        while (i17 < 6 && (i4 = iArr4[i17] + i12) < strV.length()) {
                                            char cCharAt5 = strV.charAt(i4);
                                            int[] iArr5 = iArr4;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbR2 = cy30.r(i4, "Expected an ASCII digit at index ", ", got '");
                                                sbR2.append(strV.charAt(i4));
                                                sbR2.append('\'');
                                                az8VarC = hm5.C(strV, sbR2.toString());
                                            } else {
                                                i17++;
                                                iArr4 = iArr5;
                                            }
                                        }
                                        int iD6 = hm5.D(i12 + 1, strV);
                                        int iD7 = length > 3 ? hm5.D(i12 + 4, strV) : 0;
                                        int iD8 = length > 6 ? hm5.D(i12 + 7, strV) : 0;
                                        if (iD7 > 59) {
                                            az8VarC = hm5.C(strV, "Expected offset-minute-of-hour in 0..59, got " + iD7);
                                        } else if (iD8 > 59) {
                                            az8VarC = hm5.C(strV, "Expected offset-second-of-minute in 0..59, got " + iD8);
                                        } else if (iD6 <= 17 || (iD6 == 18 && iD7 == 0 && iD8 == 0)) {
                                            i3 = ((iD7 * 60) + (iD6 * 3600) + iD8) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iD || iD >= 13) {
                                                az8VarC = hm5.C(strV, "Expected a month number in 1..12, got " + iD);
                                            } else if (1 > iD2) {
                                                StringBuilder sbQ = cy30.q(iD, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                sbQ.append(iD2);
                                                az8VarC = hm5.C(strV, sbQ.toString());
                                            } else {
                                                int i18 = iCharAt & 3;
                                                if (iD2 > (iD != 2 ? (iD == 4 || iD == 6 || iD == 9 || iD == 11) ? 30 : 31 : i18 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    StringBuilder sbQ2 = cy30.q(iD, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                    sbQ2.append(iD2);
                                                    az8VarC = hm5.C(strV, sbQ2.toString());
                                                } else if (iD3 > 23) {
                                                    az8VarC = hm5.C(strV, "Expected hour in 0..23, got " + iD3);
                                                } else if (iD4 > 59) {
                                                    az8VarC = hm5.C(strV, "Expected minute-of-hour in 0..59, got " + iD4);
                                                } else if (iD5 > 59) {
                                                    az8VarC = hm5.C(strV, "Expected second-of-minute in 0..59, got " + iD5);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = 365 * j;
                                                    long j3 = (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iD * 367) - 362) / 12)) + ((long) (iD2 - 1));
                                                    if (iD > 2) {
                                                        j3 = (i18 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                    }
                                                    az8VarC = new yo80((((j3 - 719528) * 86400) + ((long) (((iD4 * 60) + (iD3 * 3600)) + iD5))) - ((long) i3), i2);
                                                }
                                            }
                                        } else {
                                            az8VarC = hm5.C(strV, "Expected an offset in -18:00..+18:00, got " + strV.subSequence(i12, strV.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i19 = i12 + 1;
                                    if (strV.length() == i19) {
                                        i3 = 0;
                                        if (1 <= iD) {
                                            az8VarC = hm5.C(strV, "Expected a month number in 1..12, got " + iD);
                                        } else {
                                            az8VarC = hm5.C(strV, "Expected a month number in 1..12, got " + iD);
                                        }
                                    } else {
                                        az8VarC = hm5.C(strV, "Extra text after the instant at position " + i19);
                                    }
                                } else {
                                    az8VarC = hm5.C(strV, "Expected the UTC offset at position " + i12 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    } else {
                        az8VarC = az8VarB;
                    }
                }
            } else {
                az8VarC = hm5.C(strV, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return az8VarC.toInstant();
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.h0(((lo80) obj).toString());
    }
}
