package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lo80 implements Comparable, Serializable {
    public static final lo80 c = new lo80(-31557014167219200L, 0);
    public static final lo80 d = new lo80(31556889864403199L, 999999999);
    public final long a;
    public final int b;

    public lo80(long j, int i) {
        this.a = j;
        this.b = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            hhg1.n("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i = po80.a;
        ap80 ap80Var = new ap80();
        ap80Var.a = this.a;
        ap80Var.b = this.b;
        return ap80Var;
    }

    public final long a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        lo80 lo80Var = (lo80) obj;
        int iR = u890.r(this.a, lo80Var.a);
        return iR != 0 ? iR : u890.q(this.b, lo80Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo80)) {
            return false;
        }
        lo80 lo80Var = (lo80) obj;
        return this.a == lo80Var.a && this.b == lo80Var.b;
    }

    public final int hashCode() {
        return (this.b * 51) + Long.hashCode(this.a);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.a;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0);
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1);
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        hm5.u(sb, sb, i4);
        sb.append('-');
        hm5.u(sb, sb, i5);
        sb.append('T');
        hm5.u(sb, sb, i7);
        sb.append(':');
        hm5.u(sb, sb, i9);
        sb.append(':');
        hm5.u(sb, sb, i10);
        int i12 = this.b;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = hm5.a;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            sb.append(String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]).substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
