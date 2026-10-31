package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalField;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public class j implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final TemporalField a;
    public final int b;
    public final int c;
    public final c0 d;
    public final int e;

    public j(TemporalField temporalField, int i, int i2, c0 c0Var) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = c0Var;
        this.e = 0;
    }

    public boolean b(v vVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == c0.NOT_NEGATIVE;
        }
        return true;
    }

    public int c(v vVar, long j, int i, int i2) {
        return vVar.g(this.a, j, i, i2);
    }

    public j d() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    public j e(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean p(w wVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long lA = wVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        long jA = a(wVar, lA.longValue());
        wVar.b.getClass();
        int i = a0.a;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i2 = this.c;
        if (length > i2) {
            throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i2);
        }
        int i3 = this.b;
        c0 c0Var = this.d;
        if (jA >= 0) {
            int i4 = b.a[c0Var.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    sb.append('+');
                }
            } else if (i3 < 19 && jA >= f[i3]) {
                sb.append('+');
            }
        } else {
            int i5 = b.a[c0Var.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                sb.append('-');
            } else if (i5 == 4) {
                throw new DateTimeException("Field " + temporalField + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i6 = 0; i6 < i3 - string.length(); i6++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public String toString() {
        int i = this.c;
        TemporalField temporalField = this.a;
        c0 c0Var = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && c0Var == c0.NORMAL) {
            return "Value(" + temporalField + ")";
        }
        if (i2 == i && c0Var == c0.NOT_NEGATIVE) {
            return "Value(" + temporalField + "," + i2 + ")";
        }
        return "Value(" + temporalField + "," + i2 + "," + i + "," + c0Var + ")";
    }

    @Override // j$.time.format.e
    public int x(v vVar, CharSequence charSequence, int i) {
        int i2;
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        boolean z3;
        int i3;
        long j;
        boolean z4;
        int length = charSequence.length();
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        int i4 = a0.a;
        int i5 = this.c;
        c0 c0Var = this.d;
        int i6 = this.b;
        int i7 = 0;
        boolean z5 = true;
        if (cCharAt == '+') {
            boolean z6 = vVar.c;
            boolean z7 = i6 == i5;
            int iOrdinal = c0Var.ordinal();
            if (iOrdinal == 0 ? z6 : !(iOrdinal == 1 || iOrdinal == 4 || (!z6 && !z7))) {
                return ~i;
            }
            i2 = i + 1;
            z = false;
            z2 = true;
        } else if (cCharAt == '-') {
            boolean z8 = vVar.c;
            boolean z9 = i6 == i5;
            int iOrdinal2 = c0Var.ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z8 || z9)) {
                return ~i;
            }
            i2 = i + 1;
            z2 = false;
            z = true;
        } else {
            if (c0Var == c0.ALWAYS && vVar.c) {
                return ~i;
            }
            i2 = i;
            z = false;
            z2 = false;
        }
        int i8 = (vVar.c || b(vVar)) ? i6 : 1;
        int i9 = i2 + i8;
        if (i9 > length) {
            return ~i2;
        }
        int i10 = 9;
        if (!vVar.c && !b(vVar)) {
            i5 = 9;
        }
        int i11 = this.e;
        int iMax = Math.max(i11, 0) + i5;
        while (true) {
            bigIntegerAdd = null;
            if (i7 >= 2) {
                z3 = z;
                i3 = i2;
                j = 0;
                break;
            }
            int iMin = Math.min(iMax + i2, length);
            i3 = i2;
            long j2 = 0;
            while (true) {
                if (i3 >= iMin) {
                    z4 = z5;
                    break;
                }
                int i12 = i3 + 1;
                z4 = z5;
                char cCharAt2 = charSequence.charAt(i3);
                int i13 = a0.a;
                int i14 = cCharAt2 - '0';
                if (i14 < 0 || i14 > i10) {
                    i14 = -1;
                }
                if (i14 < 0) {
                    if (i3 >= i9) {
                        break;
                    }
                    return ~i2;
                }
                if (i12 - i2 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j2);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(i14));
                } else {
                    j2 = (j2 * 10) + ((long) i14);
                }
                i3 = i12;
                z5 = z4;
                length = length;
                z = z;
                i10 = 9;
            }
            z3 = z;
            int i15 = length;
            if (i11 <= 0 || i7 != 0) {
                j = j2;
                break;
            }
            iMax = Math.max(i8, (i3 - i2) - i11);
            i7++;
            z5 = z4;
            length = i15;
            z = z3;
            i10 = 9;
        }
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z3) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && vVar.c) {
                    return ~(i2 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j == 0 && vVar.c) {
                    return ~(i2 - 1);
                }
                j = -j;
            }
        } else if (c0Var == c0.EXCEEDS_PAD && vVar.c) {
            int i16 = i3 - i2;
            if (z2) {
                if (i16 <= i6) {
                    return ~(i2 - 1);
                }
            } else if (i16 > i6) {
                return ~i2;
            }
        }
        if (bigIntegerDivide == null) {
            return c(vVar, j, i2, i3);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i3--;
        }
        return c(vVar, bigIntegerDivide.longValue(), i2, i3);
    }

    public j(TemporalField temporalField, int i, int i2, c0 c0Var, int i3) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = c0Var;
        this.e = i3;
    }

    public long a(w wVar, long j) {
        return j;
    }
}
