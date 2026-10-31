package p;

import android.util.Log;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class que0 implements amo1 {
    public final /* synthetic */ byte a;
    public int b;
    public Serializable c;
    public Object d;

    public que0(String str, String[] strArr) {
        String string;
        this.a = (byte) 0;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.d = string;
        this.c = str;
        zod.l(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", new Object[]{str, 23});
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.c, i)) {
            i++;
        }
        this.b = i;
    }

    public byte a(tdp1 tdp1Var, int i) {
        byte[] bArr = (byte[]) this.c;
        int i2 = i >>> 3;
        if (i2 != this.b) {
            ((h4u) this.d).k(bArr, i2);
            this.b = i2;
        }
        return (byte) (((tdp1Var.b(i) ^ bArr[i % 8]) << 24) >> 24);
    }

    public void b(String str, Object... objArr) {
        if (this.b <= 3) {
            d(str, objArr);
        }
    }

    public tdp1 c(tdp1 tdp1Var, int i, int i2) {
        if (i < 0 || i > i2 || i2 > tdp1Var.a.length) {
            tw20.p();
            return null;
        }
        byte[] bArr = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            bArr[i3] = a(tdp1Var, i);
            i++;
            i3++;
        }
        return tdp1.e(bArr);
    }

    public void d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        ((String) this.d).concat(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.Serializable, long[]] */
    public int e(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i9 = this.b;
        int i10 = i9 + 3;
        this.b = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length * 2, i10);
            this.c = Arrays.copyOf(jArr, iMax);
            this.d = Arrays.copyOf((long[]) this.d, iMax);
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            qf80.c("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            qf80.c("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = o511.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    public void f(long j, int i, int i2, int i3) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = o511.b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.c;
            long[] jArr2 = (long[]) this.d;
            int i7 = this.b;
            jArr2[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i15] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = o511.b;
                            jArr2[i8] = (j5 & j2) | (((long) ((i10 + 3) & i14)) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    i6 = i14;
                    c3 = c;
                    c2 = c4;
                    j3 = j2;
                }
                i6 = i6;
                c3 = c3;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Object[]] */
    public void g(Object obj, Object obj2) {
        int i = this.b + 1;
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.c = Arrays.copyOf(objArr, e3p1.c(length, i2));
        }
        eqr0.W(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i3 = this.b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.b = i3 + 1;
    }

    public c6p1 h() {
        u3p1 u3p1Var = (u3p1) this.d;
        if (u3p1Var != null) {
            throw u3p1Var.a();
        }
        c6p1 c6p1VarC = c6p1.c(this.b, (Object[]) this.c, this);
        u3p1 u3p1Var2 = (u3p1) this.d;
        if (u3p1Var2 == null) {
            return c6p1VarC;
        }
        throw u3p1Var2.a();
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                if (((bjy0) this.d) == bjy0.b) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.c);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* bridge */ /* synthetic */ amo1 zzc() {
        return new que0((h4u) this.d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public que0(byte b) {
        this(4);
        this.a = b;
        switch (b) {
            case 4:
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [byte[], java.io.Serializable] */
    public que0(h4u h4uVar) {
        this.a = (byte) 3;
        this.b = -1;
        this.c = new byte[8];
        this.d = h4uVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Object[]] */
    public que0(int i) {
        this.a = (byte) 4;
        this.c = new Object[i + i];
        this.b = 0;
    }

    public que0(bjy0 bjy0Var, int i, String str) {
        this.a = (byte) 2;
        this.d = bjy0Var;
        this.b = i;
        this.c = str;
    }
}
