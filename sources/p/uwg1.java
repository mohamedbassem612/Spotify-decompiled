package p;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uwg1 implements ec10 {
    public final byte a;
    public final int b;
    public final List c;
    public final izr0 d;
    public final SparseIntArray e;
    public final yxs f;
    public final jqc1 g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final bmy0 k;
    public un20 l;
    public gc10 m;
    public int n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f157p;
    public boolean q;
    public xwg1 r;
    public int s;
    public int t;

    /* JADX WARN: Multi-variable type inference failed */
    public uwg1(int i, int i2, jqc1 jqc1Var, yve1 yve1Var, yxs yxsVar) {
        this.f = yxsVar;
        this.a = i;
        this.b = i2;
        this.g = jqc1Var;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(yve1Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(yve1Var);
        }
        this.d = new izr0(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new bmy0((byte) 1);
        this.m = gc10.G;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (xwg1) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new ni51(new ptf1(this)));
        this.r = null;
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        un20 un20Var;
        long j3;
        SparseArray sparseArray = this.h;
        List list = this.c;
        dm5.y(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yve1 yve1Var = (yve1) list.get(i);
            synchronized (yve1Var) {
                j3 = yve1Var.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jD = yve1Var.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                yve1Var.f(j2);
            }
        }
        if (j2 != 0 && (un20Var = this.l) != null) {
            un20Var.c(j2);
        }
        this.d.O(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((xwg1) sparseArray.valueAt(i2)).b();
        }
        this.s = 0;
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        if ((this.b & 1) == 0) {
            gc10Var = new wh41(gc10Var, this.g);
        }
        this.m = gc10Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p.xwg1] */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        fc10 fc10Var2;
        int i;
        byte b;
        byte b2;
        byte b3;
        xwg1 xwg1Var;
        long jU;
        long length = fc10Var.getLength();
        byte b4 = 0;
        byte b5 = this.a;
        byte b6 = b5 == 2 ? (byte) 1 : b4;
        if (this.o) {
            long j = -9223372036854775807L;
            bmy0 bmy0Var = this.k;
            if (length != -1 && b6 == 0 && !bmy0Var.d) {
                int i2 = this.t;
                yve1 yve1Var = bmy0Var.b;
                izr0 izr0Var = bmy0Var.c;
                if (i2 <= 0) {
                    bmy0Var.a(fc10Var);
                    return b4;
                }
                if (bmy0Var.f) {
                    if (bmy0Var.h == -9223372036854775807L) {
                        bmy0Var.a(fc10Var);
                        return b4;
                    }
                    if (bmy0Var.e) {
                        long j2 = bmy0Var.g;
                        if (j2 == -9223372036854775807L) {
                            bmy0Var.a(fc10Var);
                            return b4;
                        }
                        bmy0Var.i = yve1Var.c(bmy0Var.h) - yve1Var.b(j2);
                        bmy0Var.a(fc10Var);
                        return b4;
                    }
                    int iMin = (int) Math.min(112800L, fc10Var.getLength());
                    if (fc10Var.getPosition() != 0) {
                        sfv0Var.a = 0L;
                        return 1;
                    }
                    izr0Var.O(iMin);
                    fc10Var.f();
                    fc10Var.h(b4, izr0Var.a, iMin);
                    int i3 = izr0Var.c;
                    for (int i4 = izr0Var.b; i4 < i3; i4++) {
                        if (izr0Var.a[i4] == 71) {
                            jU = kqn1.u(izr0Var, i4, i2);
                            if (jU != -9223372036854775807L) {
                                bmy0Var.g = jU;
                                bmy0Var.e = true;
                                return b4;
                            }
                        }
                    }
                    jU = -9223372036854775807L;
                    bmy0Var.g = jU;
                    bmy0Var.e = true;
                    return b4;
                }
                long length2 = fc10Var.getLength();
                int iMin2 = (int) Math.min(112800L, length2);
                long j3 = length2 - ((long) iMin2);
                if (fc10Var.getPosition() != j3) {
                    sfv0Var.a = j3;
                    return 1;
                }
                izr0Var.O(iMin2);
                fc10Var.f();
                fc10Var.h(b4, izr0Var.a, iMin2);
                int i5 = izr0Var.b;
                int i6 = izr0Var.c;
                for (int i7 = i6 - 188; i7 >= i5; i7--) {
                    byte[] bArr = izr0Var.a;
                    int i8 = b4;
                    for (int i9 = -4; i9 <= 4; i9++) {
                        int i10 = (i9 * 188) + i7;
                        if (i10 >= i5 && i10 < i6 && bArr[i10] == 71) {
                            i8++;
                            if (i8 == 5) {
                                long jU2 = kqn1.u(izr0Var, i7, i2);
                                if (jU2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jU2;
                                break;
                            }
                        } else {
                            i8 = b4;
                        }
                    }
                }
                bmy0Var.h = j;
                bmy0Var.f = true;
                return b4;
            }
            if (this.f157p) {
                i = 1;
                b = b5;
            } else {
                this.f157p = true;
                long j4 = bmy0Var.i;
                if (j4 != -9223372036854775807L) {
                    yve1 yve1Var2 = bmy0Var.b;
                    int i11 = this.t;
                    sua suaVar = new sua(b4);
                    dna1 dna1Var = new dna1();
                    dna1Var.a = i11;
                    dna1Var.b = yve1Var2;
                    dna1Var.c = new izr0();
                    i = 1;
                    b = b5;
                    un20 un20Var = new un20(suaVar, dna1Var, j4, j4 + 1, 0L, length, 188L, 940);
                    this.l = un20Var;
                    this.m.c(((xua) un20Var).a);
                } else {
                    i = 1;
                    b = b5;
                    this.m.c(new bc9(j4));
                }
            }
            if (this.q) {
                this.q = b4;
                a(0L, 0L);
                if (fc10Var.getPosition() != 0) {
                    sfv0Var.a = 0L;
                    return i;
                }
            }
            un20 un20Var2 = this.l;
            if (un20Var2 != null && ((xua) un20Var2).c != null) {
                return un20Var2.a(fc10Var, sfv0Var);
            }
            fc10Var2 = fc10Var;
        } else {
            fc10Var2 = fc10Var;
            b4 = b4;
            i = 1;
            b = b5;
        }
        izr0 izr0Var2 = this.d;
        byte[] bArr2 = izr0Var2.a;
        if (9400 - izr0Var2.b < 188) {
            int iA = izr0Var2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, izr0Var2.b, bArr2, b4, iA);
            }
            izr0Var2.P(bArr2, iA);
        }
        while (true) {
            int iA2 = izr0Var2.a();
            ?? r7 = this.h;
            if (iA2 >= 188) {
                int i12 = izr0Var2.b;
                int i13 = izr0Var2.c;
                byte[] bArr3 = izr0Var2.a;
                int i14 = i12;
                while (i14 < i13 && bArr3[i14] != 71) {
                    i14++;
                }
                izr0Var2.R(i14);
                int i15 = i14 + 188;
                ?? r8 = 0;
                if (i15 > i13) {
                    int i16 = (i14 - i12) + this.s;
                    this.s = i16;
                    b2 = b;
                    b3 = 2;
                    if (b2 == 2 && i16 > 376) {
                        throw ParserException.a((RuntimeException) null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    b2 = b;
                    b3 = 2;
                    this.s = b4;
                }
                int i17 = izr0Var2.c;
                if (i15 > i17) {
                    return b4;
                }
                int iQ = izr0Var2.q();
                if ((8388608 & iQ) != 0) {
                    izr0Var2.R(i15);
                    return b4;
                }
                ?? r10 = (4194304 & iQ) != 0 ? 1 : b4;
                int i18 = (2096896 & iQ) >> 8;
                ?? r14 = (iQ & 32) != 0 ? 1 : b4;
                if ((iQ & 16) != 0) {
                    xwg1Var = (xwg1) r7.get(i18);
                }
                if (r8 == 0) {
                    r8 = xwg1Var;
                    izr0Var2.R(i15);
                    return b4;
                }
                if (b2 != b3) {
                    int i19 = iQ & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i20 = sparseIntArray.get(i18, i19 - 1);
                    sparseIntArray.put(i18, i19);
                    if (i20 == i19) {
                        izr0Var2.R(i15);
                        return b4;
                    }
                    if (i19 != ((i20 + 1) & 15)) {
                        r8.b();
                    }
                }
                if (r14 != 0) {
                    int iE = izr0Var2.E();
                    r10 = (r10 == true ? 1 : 0) | ((izr0Var2.E() & 64) != 0 ? b3 : b4);
                    izr0Var2.S(iE - 1);
                }
                boolean z = this.o;
                if (b2 == b3 || z || !this.j.get(i18, b4)) {
                    izr0Var2.Q(i15);
                    r8.a(r10, izr0Var2);
                    izr0Var2.Q(i17);
                }
                if (b2 != b3 && !z && this.o && length != -1) {
                    this.q = true;
                }
                izr0Var2.R(i15);
                return b4;
            }
            int i21 = izr0Var2.c;
            int i22 = fc10Var2.read(bArr2, i21, 9400 - i21);
            if (i22 == -1) {
                for (?? r4 = b4; r4 < r7.size(); r4++) {
                    xwg1 xwg1Var2 = (xwg1) r7.valueAt(r4);
                    if (xwg1Var2 instanceof kts0) {
                        kts0 kts0Var = (kts0) xwg1Var2;
                        ?? r3 = (b6 == 0 || kts0Var.e()) ? i : b4;
                        int i23 = kts0Var.c;
                        if (((i23 == 3 && kts0Var.j == -1) || i23 == i) && ((b6 == 0 || !(kts0Var.a instanceof dr50)) && r3 != 0)) {
                            kts0Var.a(1, new izr0());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            izr0Var2.Q(i21 + i22);
            i = 1;
        }
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) throws InterruptedIOException {
        byte[] bArr = this.d.a;
        uyr uyrVar = (uyr) fc10Var;
        uyrVar.d(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    uyrVar.b(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // p.ec10
    public final void release() {
    }
}
