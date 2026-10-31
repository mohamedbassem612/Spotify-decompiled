package j$.time.format;

import j$.time.temporal.TemporalField;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class f extends j {
    public final boolean g;

    public f(TemporalField temporalField, int i, int i2, boolean z) {
        this(temporalField, i, i2, z, 0);
        Objects.requireNonNull(temporalField, "field");
        j$.time.temporal.o oVarRange = temporalField.range();
        if (oVarRange.a != oVarRange.b || oVarRange.c != oVarRange.d) {
            j$.nio.file.r.a(j$.time.b.a("Field must have a fixed set of values: ", temporalField));
            throw null;
        }
        if (i < 0 || i > 9) {
            j$.nio.file.r.m("Minimum width must be from 0 to 9 inclusive but was ", i);
            throw null;
        }
        if (i2 < 1 || i2 > 9) {
            j$.nio.file.r.m("Maximum width must be from 1 to 9 inclusive but was ", i2);
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.j
    public final boolean b(v vVar) {
        return vVar.c && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean p(w wVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long lA = wVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        wVar.b.getClass();
        int i = a0.a;
        long jLongValue = lA.longValue();
        j$.time.temporal.o oVarRange = temporalField.range();
        oVarRange.b(temporalField, jLongValue);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(oVarRange.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(oVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i2 = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i2), this.c), roundingMode).toPlainString().substring(2);
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i2 > 0) {
            if (z) {
                sb.append('.');
            }
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final int x(v vVar, CharSequence charSequence, int i) {
        int i2 = (vVar.c || b(vVar)) ? this.b : 0;
        int i3 = (vVar.c || b(vVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                char cCharAt = charSequence.charAt(i);
                int i4 = a0.a;
                if (cCharAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i5 = i;
            int i6 = i2 + i5;
            if (i6 > length) {
                return ~i5;
            }
            int iMin = Math.min(i3 + i5, length);
            int i7 = 0;
            int i8 = i5;
            while (i8 < iMin) {
                int i9 = i8 + 1;
                char cCharAt2 = charSequence.charAt(i8);
                int i10 = a0.a;
                int i11 = cCharAt2 - '0';
                if (i11 < 0 || i11 > 9) {
                    i11 = -1;
                }
                if (i11 < 0) {
                    if (i9 >= i6) {
                        break;
                    }
                    return ~i5;
                }
                i7 = (i7 * 10) + i11;
                i8 = i9;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i7).movePointLeft(i8 - i5);
            j$.time.temporal.o oVarRange = this.a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(oVarRange.a);
            return vVar.g(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(oVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i5, i8);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    public f(TemporalField temporalField, int i, int i2, boolean z, int i3) {
        super(temporalField, i, i2, c0.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
