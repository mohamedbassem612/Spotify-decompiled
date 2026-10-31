package p;

import android.util.Pair;
import android.util.SparseArray;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import androidx.media3.common.ParserException;
import app.p000rive.semantics.SemanticState;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pj30 implements ec10 {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final ie30 P;
    public long A;
    public oj30 B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public gc10 H;
    public gtf1[] I;
    public gtf1[] J;
    public boolean K;
    public boolean L;
    public long M;
    public long N;
    public final jqc1 a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final izr0 i;
    public final yve1 j;
    public final t01 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final abg f113p;
    public bg11 q;
    public byte r;
    public int s;
    public long t;
    public int u;
    public izr0 v;
    public long w;
    public int x;
    public long y;
    public long z;
    public final otu k = new otu((byte) 28);
    public final izr0 l = new izr0(16);
    public final izr0 e = new izr0(mqn1.a);
    public final izr0 f = new izr0(6);
    public final izr0 g = new izr0();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        ge30 ge30Var = new ge30();
        ge30Var.o = asj0.p("application/x-emsg");
        P = new ie30(ge30Var);
    }

    public pj30(jqc1 jqc1Var, int i, yve1 yve1Var, List list) {
        this.a = jqc1Var;
        this.b = i;
        this.j = yve1Var;
        this.c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new izr0(bArr);
        w280 w280Var = b380.b;
        this.q = bg11.e;
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.H = gc10.G;
        this.I = new gtf1[0];
        this.J = new gtf1[0];
        this.o = new t01((se21) new nay(this, (byte) 19));
        this.f113p = new abg((byte) 0);
        this.M = -1L;
        this.N = -1L;
    }

    public static int f(int i) {
        int i2 = (i & 1) != 0 ? 64 : 0;
        return (i & 2) != 0 ? i2 | SemanticState.Focused : i2;
    }

    public static x8v h(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            npm0 npm0Var = (npm0) arrayList.get(i);
            if (npm0Var.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = npm0Var.e.a;
                hmy0 hmy0VarU = n3o1.u(bArr);
                UUID uuid = hmy0VarU == null ? null : hmy0VarU.a;
                if (uuid == null) {
                    oon1.H("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new w8v(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new x8v(null, false, (w8v[]) arrayList2.toArray(new w8v[0]));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void j(izr0 izr0Var, int i, onf1 onf1Var) throws ParserException {
        izr0Var.R(i + 8);
        int iQ = izr0Var.q();
        byte[] bArr = e2c.a;
        if ((iQ & 1) != 0) {
            throw ParserException.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iQ & 2) != 0;
        int I = izr0Var.I();
        if (I == 0) {
            Arrays.fill(onf1Var.l, 0, onf1Var.e, false);
            return;
        }
        int i2 = onf1Var.e;
        izr0 izr0Var2 = onf1Var.n;
        if (I != i2) {
            StringBuilder sbR = cy30.r(I, "Senc sample count ", " is different from fragment sample count");
            sbR.append(onf1Var.e);
            throw ParserException.a((RuntimeException) null, sbR.toString());
        }
        Arrays.fill(onf1Var.l, 0, I, z);
        izr0Var2.O(izr0Var.a());
        onf1Var.k = true;
        onf1Var.o = true;
        izr0Var.o(0, izr0Var2.a, izr0Var2.c);
        izr0Var2.R(0);
        onf1Var.o = false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static Pair k(long j, izr0 izr0Var) throws ParserException {
        long jK;
        long jK2;
        izr0 izr0Var2 = izr0Var;
        izr0Var2.R(8);
        int iE = e2c.e(izr0Var2.q());
        izr0Var2.S(4);
        long jG = izr0Var2.G();
        if (iE == 0) {
            jK = izr0Var2.G();
            jK2 = izr0Var2.G();
        } else {
            jK = izr0Var2.K();
            jK2 = izr0Var2.K();
        }
        long j2 = jK2 + j;
        String str = zoi1.a;
        long jG0 = zoi1.g0(jK, 1000000L, jG, RoundingMode.DOWN);
        izr0Var2.S(2);
        int iL = izr0Var2.L();
        int[] iArr = new int[iL];
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        long[] jArr3 = new long[iL];
        long j3 = j2;
        long j4 = jG0;
        int i = 0;
        while (i < iL) {
            int iQ = izr0Var2.q();
            if ((Integer.MIN_VALUE & iQ) != 0) {
                throw ParserException.a((RuntimeException) null, "Unhandled indirect reference");
            }
            long jG2 = izr0Var2.G();
            iArr[i] = iQ & Alert.DURATION_SHOW_INDEFINITELY;
            jArr[i] = j3;
            jArr3[i] = j4;
            jK += jG2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jG1 = zoi1.g0(jK, 1000000L, jG, RoundingMode.DOWN);
            jArr4[i] = jG1 - jArr5[i];
            izr0Var2.S(4);
            j3 += (long) iArr[i];
            i++;
            iL = iL;
            izr0Var2 = izr0Var;
            j4 = jG1;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jG0), new zag(iArr, jArr, jArr2, jArr3));
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((oj30) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.x = 0;
        ((PriorityQueue) this.o.e).clear();
        this.y = j2;
        this.m.clear();
        this.N = -1L;
        g();
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            gc10Var = new wh41(gc10Var, this.a);
        }
        this.H = gc10Var;
        g();
        gtf1[] gtf1VarArr = new gtf1[2];
        this.I = gtf1VarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            gtf1VarArr[0] = this.H.w(100, 5);
            i = 1;
            i3 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        } else {
            i = 0;
        }
        gtf1[] gtf1VarArr2 = (gtf1[]) zoi1.Y(i, this.I);
        this.I = gtf1VarArr2;
        for (gtf1 gtf1Var : gtf1VarArr2) {
            gtf1Var.a(P);
        }
        List list = this.c;
        this.J = new gtf1[list.size()];
        while (i4 < this.J.length) {
            gtf1 gtf1VarW = this.H.w(i3, 3);
            gtf1VarW.a((ie30) list.get(i4));
            this.J[i4] = gtf1VarW;
            i4++;
            i3++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x021b  */
    /* JADX WARN: Code duplicated, block: B:123:0x025b  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:430:0x0919  */
    /* JADX WARN: Code duplicated, block: B:437:0x0931  */
    /* JADX WARN: Code duplicated, block: B:440:0x0939  */
    /* JADX WARN: Code duplicated, block: B:442:0x0940  */
    /* JADX WARN: Code duplicated, block: B:443:0x096a  */
    /* JADX WARN: Code duplicated, block: B:445:0x0976  */
    /* JADX WARN: Code duplicated, block: B:452:0x0996  */
    /* JADX WARN: Code duplicated, block: B:460:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:462:0x09ca A[LOOP:2: B:461:0x09c8->B:462:0x09ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:465:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:466:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:468:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:562:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:564:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:569:0x0b3c  */
    /* JADX WARN: Code duplicated, block: B:570:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b4b  */
    /* JADX WARN: Code duplicated, block: B:584:0x05cb A[SYNTHETIC] */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        ArrayDeque arrayDeque;
        t01 t01Var;
        abg abgVar;
        int i;
        izr0 izr0Var;
        ArrayDeque arrayDeque2;
        yve1 yve1Var;
        String strZ;
        String strZ2;
        long jG;
        long j;
        long jG0;
        long jA;
        int i2;
        char c;
        oj30 oj30Var;
        boolean z;
        ArrayDeque arrayDeque3;
        int iE;
        int i3;
        boolean z2;
        String strQ;
        byte b;
        int i4;
        int iD;
        int i5;
        int i6;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long position;
        int i7;
        int i8;
        long j7;
        long j8;
        int size;
        int i9;
        fc10 fc10Var2 = fc10Var;
        loop0: while (true) {
            sfv0 sfv0Var2 = sfv0Var;
            while (true) {
                byte b2 = this.r;
                arrayDeque = this.m;
                t01Var = this.o;
                abgVar = this.f113p;
                i = this.b;
                SparseArray sparseArray = this.d;
                izr0Var = this.i;
                boolean z3 = true;
                if (b2 != 0) {
                    arrayDeque2 = this.n;
                    yve1Var = this.j;
                    if (b2 != 1) {
                        if (b2 != 2) {
                            int i10 = 2;
                            c = 6;
                            if (b2 == 5) {
                                izr0Var.O(16);
                                if (fc10Var2.g(izr0Var.a, 0, 16, true)) {
                                    izr0Var.R(0);
                                    int iQ = izr0Var.q();
                                    int iQ2 = izr0Var.q();
                                    if (iQ == 16 && iQ2 == 1835430511) {
                                        izr0Var.S(4);
                                        long jG2 = izr0Var.G();
                                        long length = fc10Var2.getLength() - jG2;
                                        if (jG2 <= 0 || jG2 > 2147483647L || length < 0 || length < this.N) {
                                            i(new bc9(this.z, this.N), sfv0Var2);
                                        } else {
                                            sfv0Var2.a = length;
                                            this.r = (byte) 6;
                                        }
                                    } else {
                                        i(new bc9(this.z, this.N), sfv0Var2);
                                    }
                                } else {
                                    i(new bc9(this.z, this.N), sfv0Var2);
                                }
                                byte b3 = this.r;
                                if (b3 == 6 || b3 == 0) {
                                    return 1;
                                }
                            } else if (b2 != 6) {
                                oj30Var = this.B;
                                if (oj30Var != null) {
                                    z = true;
                                    break loop0;
                                }
                                int size2 = sparseArray.size();
                                int i11 = 0;
                                oj30 oj30Var2 = null;
                                long j9 = Long.MAX_VALUE;
                                while (i11 < size2) {
                                    oj30 oj30Var3 = (oj30) sparseArray.valueAt(i11);
                                    boolean z4 = z3;
                                    boolean z5 = oj30Var3.n;
                                    onf1 onf1Var = oj30Var3.b;
                                    if (z5) {
                                        i5 = size2;
                                    } else {
                                        i5 = size2;
                                        if (oj30Var3.f != oj30Var3.d.b) {
                                        }
                                        i11++;
                                        size2 = i5;
                                        z3 = z4;
                                    }
                                    if (!z5 || oj30Var3.h != onf1Var.d) {
                                        long j10 = !z5 ? oj30Var3.d.c[oj30Var3.f] : onf1Var.f[oj30Var3.h];
                                        if (j10 < j9) {
                                            oj30Var2 = oj30Var3;
                                            j9 = j10;
                                        }
                                    }
                                    i11++;
                                    size2 = i5;
                                    z3 = z4;
                                }
                                z = z3;
                                if (oj30Var2 != null) {
                                    int position2 = (int) ((!oj30Var2.n ? oj30Var2.d.c[oj30Var2.f] : oj30Var2.b.f[oj30Var2.h]) - fc10Var2.getPosition());
                                    if (position2 < 0) {
                                        oon1.H("Ignoring negative offset to sample data.");
                                        position2 = 0;
                                    }
                                    fc10Var2.u(position2);
                                    this.B = oj30Var2;
                                    oj30Var = oj30Var2;
                                    break loop0;
                                }
                                int position3 = (int) (this.w - fc10Var2.getPosition());
                                if (position3 < 0) {
                                    throw ParserException.a((RuntimeException) null, "Offset to end of mdat was negative.");
                                }
                                fc10Var2.u(position3);
                                g();
                            } else {
                                long length2 = fc10Var2.getLength() - fc10Var2.getPosition();
                                izr0Var.O(8);
                                if (fc10Var2.d(izr0Var.a, 0, 8, true)) {
                                    izr0Var.R(0);
                                    int iQ3 = izr0Var.q();
                                    if (izr0Var.q() != 1835430497) {
                                        i(new bc9(this.z, this.N), sfv0Var2);
                                    } else {
                                        int i12 = (int) length2;
                                        izr0 izr0Var2 = new izr0(i12);
                                        fc10Var2.readFully(izr0Var2.a, 0, i12);
                                        izr0Var2.R(iQ3 == 1 ? 16 : 8);
                                        SparseArray sparseArray2 = new SparseArray();
                                        SparseArray sparseArray3 = new SparseArray();
                                        while (izr0Var2.a() >= 8) {
                                            int i13 = izr0Var2.b;
                                            long jG3 = izr0Var2.G();
                                            int iQ4 = izr0Var2.q();
                                            if (jG3 == 1) {
                                                if (izr0Var2.a() < 8) {
                                                    break;
                                                }
                                                jG3 = izr0Var2.y();
                                            } else if (jG3 == 0) {
                                                jG3 = ((long) izr0Var2.c) - ((long) i13);
                                            }
                                            int i14 = jG3 == 1 ? 16 : 8;
                                            if (jG3 < i14) {
                                                break;
                                            }
                                            long j11 = i13;
                                            if (jG3 > ((long) izr0Var2.c) - j11) {
                                                break;
                                            }
                                            if (iQ4 != 1952871009) {
                                                j2 = jG3;
                                                j3 = j11;
                                            } else if (jG3 < i14 + 16) {
                                                izr0Var2.R((int) (j11 + jG3));
                                            } else {
                                                int iE2 = e2c.e(izr0Var2.q());
                                                int iQ5 = izr0Var2.q();
                                                oj30 oj30Var4 = (oj30) sparseArray.get(iQ5);
                                                if (oj30Var4 == null) {
                                                    izr0Var2.R((int) (j11 + jG3));
                                                } else {
                                                    long j12 = oj30Var4.d.a.c;
                                                    int iQ6 = izr0Var2.q();
                                                    int i15 = (iQ6 >> 4) & 3;
                                                    int i16 = (iQ6 >> 2) & 3;
                                                    int i17 = iQ6 & 3;
                                                    j2 = jG3;
                                                    long jG4 = izr0Var2.G();
                                                    int i18 = i15 + 1;
                                                    int i19 = i16 + 1;
                                                    j3 = j11;
                                                    int i20 = i17 + 1;
                                                    if (((iE2 == 1 ? 16L : 8L) + ((long) i18) + ((long) i19) + ((long) i20)) * jG4 > izr0Var2.a()) {
                                                        izr0Var2.R((int) (j3 + j2));
                                                    } else {
                                                        int i21 = (int) jG4;
                                                        long[] jArr = new long[i21];
                                                        long[] jArr2 = new long[i21];
                                                        int i22 = 0;
                                                        while (i22 < i21) {
                                                            int i23 = i21;
                                                            long jK = iE2 == 1 ? izr0Var2.K() : izr0Var2.G();
                                                            long jK2 = iE2 == 1 ? izr0Var2.K() : izr0Var2.G();
                                                            izr0Var2.S(i18 + i19 + i20);
                                                            if (j12 != -9223372036854775807L) {
                                                                jK = zoi1.g0(jK, 1000000L, j12, RoundingMode.DOWN);
                                                            }
                                                            jArr[i22] = jK;
                                                            jArr2[i22] = jK2;
                                                            i22++;
                                                            i21 = i23;
                                                        }
                                                        sparseArray2.put(iQ5, jArr);
                                                        sparseArray3.put(iQ5, jArr2);
                                                    }
                                                }
                                            }
                                            izr0Var2.R((int) (j3 + j2));
                                        }
                                        if (sparseArray2.size() == 0) {
                                            i(new bc9(this.z, this.N), sfv0Var2);
                                        } else {
                                            int iKeyAt = -1;
                                            int i24 = -1;
                                            int i25 = 0;
                                            while (i25 < sparseArray2.size()) {
                                                int iKeyAt2 = sparseArray2.keyAt(i25);
                                                oj30 oj30Var5 = (oj30) sparseArray.get(iKeyAt2);
                                                if (oj30Var5 != null) {
                                                    int i26 = oj30Var5.d.a.b;
                                                    if (iKeyAt == -1 && i26 == i10) {
                                                        iKeyAt = iKeyAt2;
                                                    } else if (i24 == -1 && i26 == 1) {
                                                        i24 = iKeyAt2;
                                                    }
                                                }
                                                i25++;
                                                i10 = 2;
                                            }
                                            if (iKeyAt != -1) {
                                                i6 = iKeyAt;
                                            } else if (i24 != -1) {
                                                i6 = i24;
                                            } else {
                                                iKeyAt = sparseArray2.keyAt(0);
                                                i6 = iKeyAt;
                                            }
                                            i(new nj30(sparseArray2, sparseArray3, this.z, this.N, i6), sfv0Var2);
                                        }
                                    }
                                } else {
                                    i(new bc9(this.z, this.N), sfv0Var2);
                                }
                                if (this.r == 0) {
                                    return 1;
                                }
                            }
                        } else {
                            int size3 = sparseArray.size();
                            oj30 oj30Var6 = null;
                            long j13 = Long.MAX_VALUE;
                            for (int i27 = 0; i27 < size3; i27++) {
                                onf1 onf1Var2 = ((oj30) sparseArray.valueAt(i27)).b;
                                if (onf1Var2.o) {
                                    long j14 = onf1Var2.c;
                                    if (j14 < j13) {
                                        oj30Var6 = (oj30) sparseArray.valueAt(i27);
                                        j13 = j14;
                                    }
                                }
                            }
                            if (oj30Var6 == null) {
                                this.r = (byte) 3;
                            } else {
                                int position4 = (int) (j13 - fc10Var2.getPosition());
                                if (position4 < 0) {
                                    throw ParserException.a((RuntimeException) null, "Offset to encryption data was negative.");
                                }
                                fc10Var2.u(position4);
                                onf1 onf1Var3 = oj30Var6.b;
                                izr0 izr0Var3 = onf1Var3.n;
                                fc10Var2.readFully(izr0Var3.a, 0, izr0Var3.c);
                                izr0Var3.R(0);
                                onf1Var3.o = false;
                            }
                        }
                    }
                } else {
                    int i28 = this.u;
                    izr0 izr0Var4 = this.l;
                    if (i28 == 0) {
                        if (!fc10Var2.g(izr0Var4.a, 0, 8, true)) {
                            long j15 = this.M;
                            if (j15 == -1) {
                                t01Var.o(0);
                                return -1;
                            }
                            sfv0Var.a = j15;
                            this.M = -1L;
                            this.H.c(abgVar.d());
                            this.L = true;
                            return 1;
                        }
                        this.u = 8;
                        izr0Var4.R(0);
                        this.t = izr0Var4.G();
                        this.s = izr0Var4.q();
                    }
                    long j16 = this.t;
                    if (j16 == 1) {
                        fc10Var2.readFully(izr0Var4.a, 8, 8);
                        this.u += 8;
                        this.t = izr0Var4.K();
                    } else {
                        if (j16 == 0) {
                            long length3 = fc10Var2.getLength();
                            if (length3 == -1 && !arrayDeque.isEmpty()) {
                                length3 = ((mpm0) arrayDeque.peek()).e;
                            }
                            if (length3 != -1) {
                                this.t = (length3 - fc10Var2.getPosition()) + ((long) this.u);
                            }
                        }
                        j4 = this.t;
                        int i29 = this.u;
                        j5 = i29;
                        if (j4 >= j5) {
                            j6 = j5;
                        } else {
                            if (this.s == 1718773093 || i29 != 8) {
                                throw ParserException.d("Atom size less than header length (unsupported).");
                            }
                            this.t = j5;
                            j4 = j5;
                            j6 = j4;
                        }
                        if (this.M != r3) {
                            if (this.s == 1936286840) {
                                izr0Var.O((int) j4);
                                System.arraycopy(izr0Var4.a, 0, izr0Var.a, 0, 8);
                                fc10Var2.readFully(izr0Var.a, 8, (int) (this.t - ((long) this.u)));
                                abgVar.a((zag) k(fc10Var2.j(), izr0Var).second);
                            } else {
                                fc10Var2.b((int) (j4 - j6), true);
                            }
                            g();
                        } else {
                            position = fc10Var2.getPosition() - ((long) this.u);
                            i7 = this.s;
                            if ((i7 == 1836019558 && i7 != 1835295092) || this.K) {
                                if (this.s == 1836019558) {
                                    size = sparseArray.size();
                                    for (i9 = 0; i9 < size; i9++) {
                                        onf1 onf1Var4 = ((oj30) sparseArray.valueAt(i9)).b;
                                        onf1Var4.getClass();
                                        onf1Var4.c = position;
                                        onf1Var4.b = position;
                                    }
                                }
                                i8 = this.s;
                                if (i8 == 1835295092) {
                                    this.B = null;
                                    this.w = position + this.t;
                                    this.r = (byte) 2;
                                } else if (i8 != 1836019574) {
                                    long position5 = fc10Var2.getPosition();
                                    j7 = this.t;
                                    j8 = (position5 + j7) - 8;
                                    if (j7 != this.u) {
                                        izr0Var.O(8);
                                        fc10Var2.h(0, izr0Var.a, 8);
                                        e2c.a(izr0Var);
                                        fc10Var2.u(izr0Var.b);
                                        fc10Var2.f();
                                    }
                                    arrayDeque.push(new mpm0(this.s, j8));
                                    if (this.t == this.u) {
                                        l(j8);
                                    } else {
                                        g();
                                    }
                                } else {
                                    long position6 = fc10Var2.getPosition();
                                    j7 = this.t;
                                    j8 = (position6 + j7) - 8;
                                    if (j7 != this.u) {
                                        izr0Var.O(8);
                                        fc10Var2.h(0, izr0Var.a, 8);
                                        e2c.a(izr0Var);
                                        fc10Var2.u(izr0Var.b);
                                        fc10Var2.f();
                                    }
                                    arrayDeque.push(new mpm0(this.s, j8));
                                    if (this.t == this.u) {
                                        l(j8);
                                    } else {
                                        g();
                                    }
                                }
                            } else if (fc10Var2.getLength() == r3 && this.N == -1 && (i & 512) != 0) {
                                this.N = position;
                                sfv0Var.a = fc10Var2.getLength() - 16;
                                this.r = (byte) 5;
                            } else {
                                this.H.c(new bc9(this.z, position));
                                this.K = true;
                                if (this.s == 1836019558) {
                                    size = sparseArray.size();
                                    while (i9 < size) {
                                        onf1 onf1Var5 = ((oj30) sparseArray.valueAt(i9)).b;
                                        onf1Var5.getClass();
                                        onf1Var5.c = position;
                                        onf1Var5.b = position;
                                    }
                                }
                                i8 = this.s;
                                if (i8 == 1835295092) {
                                    this.B = null;
                                    this.w = position + this.t;
                                    this.r = (byte) 2;
                                } else if (i8 != 1836019574 || i8 == 1953653099 || i8 == 1835297121 || i8 == 1835626086 || i8 == 1937007212 || i8 == 1836019558 || i8 == 1953653094 || i8 == 1836475768 || i8 == 1701082227 || i8 == 1835365473) {
                                    long position7 = fc10Var2.getPosition();
                                    j7 = this.t;
                                    j8 = (position7 + j7) - 8;
                                    if (j7 != this.u && this.s == 1835365473) {
                                        izr0Var.O(8);
                                        fc10Var2.h(0, izr0Var.a, 8);
                                        e2c.a(izr0Var);
                                        fc10Var2.u(izr0Var.b);
                                        fc10Var2.f();
                                    }
                                    arrayDeque.push(new mpm0(this.s, j8));
                                    if (this.t == this.u) {
                                        l(j8);
                                    } else {
                                        g();
                                    }
                                } else if (i8 == 1751411826 || i8 == 1835296868 || i8 == 1836476516 || i8 == 1936286840 || i8 == 1937011556 || i8 == 1937011827 || i8 == 1668576371 || i8 == 1937011555 || i8 == 1937011578 || i8 == 1937013298 || i8 == 1937007471 || i8 == 1668232756 || i8 == 1937011571 || i8 == 1952867444 || i8 == 1952868452 || i8 == 1953196132 || i8 == 1953654136 || i8 == 1953658222 || i8 == 1886614376 || i8 == 1935763834 || i8 == 1935763823 || i8 == 1936027235 || i8 == 1970628964 || i8 == 1935828848 || i8 == 1936158820 || i8 == 1701606260 || i8 == 1835362404 || i8 == 1701671783 || i8 == 1969517665 || i8 == 1801812339 || i8 == 1768715124) {
                                    if (this.u != 8) {
                                        throw ParserException.d("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    if (this.t > 2147483647L) {
                                        throw ParserException.d("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    izr0 izr0Var5 = new izr0((int) this.t);
                                    System.arraycopy(izr0Var4.a, 0, izr0Var5.a, 0, 8);
                                    this.v = izr0Var5;
                                    this.r = (byte) 1;
                                } else {
                                    if (this.t > 2147483647L) {
                                        throw ParserException.d("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    this.v = null;
                                    this.r = (byte) 1;
                                }
                            }
                        }
                        if (this.r == 5) {
                            return 1;
                        }
                        sfv0Var2 = sfv0Var;
                    }
                    j4 = this.t;
                    int i210 = this.u;
                    j5 = i210;
                    if (j4 >= j5) {
                        if (this.s == 1718773093) {
                        }
                        throw ParserException.d("Atom size less than header length (unsupported).");
                    }
                    j6 = j5;
                    if (this.M != r3) {
                        if (this.s == 1936286840) {
                            izr0Var.O((int) j4);
                            System.arraycopy(izr0Var4.a, 0, izr0Var.a, 0, 8);
                            fc10Var2.readFully(izr0Var.a, 8, (int) (this.t - ((long) this.u)));
                            abgVar.a((zag) k(fc10Var2.j(), izr0Var).second);
                        } else {
                            fc10Var2.b((int) (j4 - j6), true);
                        }
                        g();
                    } else {
                        position = fc10Var2.getPosition() - ((long) this.u);
                        i7 = this.s;
                        if (i7 == 1836019558) {
                            if (fc10Var2.getLength() == r3) {
                            }
                            this.H.c(new bc9(this.z, position));
                            this.K = true;
                            if (this.s == 1836019558) {
                                size = sparseArray.size();
                                while (i9 < size) {
                                    onf1 onf1Var6 = ((oj30) sparseArray.valueAt(i9)).b;
                                    onf1Var6.getClass();
                                    onf1Var6.c = position;
                                    onf1Var6.b = position;
                                }
                            }
                            i8 = this.s;
                            if (i8 == 1835295092) {
                                this.B = null;
                                this.w = position + this.t;
                                this.r = (byte) 2;
                            } else if (i8 != 1836019574) {
                                long position8 = fc10Var2.getPosition();
                                j7 = this.t;
                                j8 = (position8 + j7) - 8;
                                if (j7 != this.u) {
                                    izr0Var.O(8);
                                    fc10Var2.h(0, izr0Var.a, 8);
                                    e2c.a(izr0Var);
                                    fc10Var2.u(izr0Var.b);
                                    fc10Var2.f();
                                }
                                arrayDeque.push(new mpm0(this.s, j8));
                                if (this.t == this.u) {
                                    l(j8);
                                } else {
                                    g();
                                }
                            } else {
                                long position9 = fc10Var2.getPosition();
                                j7 = this.t;
                                j8 = (position9 + j7) - 8;
                                if (j7 != this.u) {
                                    izr0Var.O(8);
                                    fc10Var2.h(0, izr0Var.a, 8);
                                    e2c.a(izr0Var);
                                    fc10Var2.u(izr0Var.b);
                                    fc10Var2.f();
                                }
                                arrayDeque.push(new mpm0(this.s, j8));
                                if (this.t == this.u) {
                                    l(j8);
                                } else {
                                    g();
                                }
                            }
                        } else {
                            if (fc10Var2.getLength() == r3) {
                            }
                            this.H.c(new bc9(this.z, position));
                            this.K = true;
                            if (this.s == 1836019558) {
                                size = sparseArray.size();
                                while (i9 < size) {
                                    onf1 onf1Var7 = ((oj30) sparseArray.valueAt(i9)).b;
                                    onf1Var7.getClass();
                                    onf1Var7.c = position;
                                    onf1Var7.b = position;
                                }
                            }
                            i8 = this.s;
                            if (i8 == 1835295092) {
                                this.B = null;
                                this.w = position + this.t;
                                this.r = (byte) 2;
                            } else if (i8 != 1836019574) {
                                long position10 = fc10Var2.getPosition();
                                j7 = this.t;
                                j8 = (position10 + j7) - 8;
                                if (j7 != this.u) {
                                    izr0Var.O(8);
                                    fc10Var2.h(0, izr0Var.a, 8);
                                    e2c.a(izr0Var);
                                    fc10Var2.u(izr0Var.b);
                                    fc10Var2.f();
                                }
                                arrayDeque.push(new mpm0(this.s, j8));
                                if (this.t == this.u) {
                                    l(j8);
                                } else {
                                    g();
                                }
                            } else {
                                long position11 = fc10Var2.getPosition();
                                j7 = this.t;
                                j8 = (position11 + j7) - 8;
                                if (j7 != this.u) {
                                    izr0Var.O(8);
                                    fc10Var2.h(0, izr0Var.a, 8);
                                    e2c.a(izr0Var);
                                    fc10Var2.u(izr0Var.b);
                                    fc10Var2.f();
                                }
                                arrayDeque.push(new mpm0(this.s, j8));
                                if (this.t == this.u) {
                                    l(j8);
                                } else {
                                    g();
                                }
                            }
                        }
                    }
                    if (this.r == 5) {
                        return 1;
                    }
                    sfv0Var2 = sfv0Var;
                }
            }
            int i30 = (int) (this.t - ((long) this.u));
            izr0 izr0Var6 = this.v;
            if (izr0Var6 != null) {
                fc10Var2.readFully(izr0Var6.a, 8, i30);
                int i31 = this.s;
                npm0 npm0Var = new npm0(i31, izr0Var6);
                if (!arrayDeque.isEmpty()) {
                    ((mpm0) arrayDeque.peek()).f.add(npm0Var);
                } else if (i31 == 1936286840) {
                    Pair pairK = k(fc10Var2.getPosition(), izr0Var6);
                    abgVar.a((zag) pairK.second);
                    LinkedHashMap linkedHashMap = abgVar.a;
                    this.A = ((Long) pairK.first).longValue();
                    if (this.L) {
                        i2 = 1;
                    } else {
                        i2 = 1;
                        this.H.c(linkedHashMap.size() == 1 ? (fn51) pairK.second : abgVar.d());
                        this.K = true;
                    }
                    if ((i & SemanticState.Hidden) != 0 && !this.L && linkedHashMap.size() > i2) {
                        this.M = fc10Var2.getPosition();
                    }
                } else if (i31 == 1701671783 && this.I.length != 0) {
                    izr0Var6.R(8);
                    int iE3 = e2c.e(izr0Var6.q());
                    if (iE3 == 0) {
                        strZ = izr0Var6.z();
                        strZ.getClass();
                        strZ2 = izr0Var6.z();
                        strZ2.getClass();
                        long jG5 = izr0Var6.G();
                        long jG6 = izr0Var6.G();
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long jG1 = zoi1.g0(jG6, 1000000L, jG5, roundingMode);
                        long j17 = this.A;
                        long j18 = j17 != -9223372036854775807L ? j17 + jG1 : -9223372036854775807L;
                        long jG7 = zoi1.g0(izr0Var6.G(), 1000L, jG5, roundingMode);
                        jG = izr0Var6.G();
                        long j19 = j18;
                        j = jG1;
                        jG0 = jG7;
                        jA = j19;
                    } else if (iE3 != 1) {
                        td6.p(iE3, "Skipping unsupported emsg version: ");
                    } else {
                        long jG8 = izr0Var6.G();
                        long jK3 = izr0Var6.K();
                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                        long jG9 = zoi1.g0(jK3, 1000000L, jG8, roundingMode2);
                        jG0 = zoi1.g0(izr0Var6.G(), 1000L, jG8, roundingMode2);
                        long jG10 = izr0Var6.G();
                        strZ = izr0Var6.z();
                        strZ.getClass();
                        strZ2 = izr0Var6.z();
                        strZ2.getClass();
                        jA = jG9;
                        jG = jG10;
                        j = -9223372036854775807L;
                    }
                    byte[] bArr = new byte[izr0Var6.a()];
                    izr0Var6.o(0, bArr, izr0Var6.a());
                    otu otuVar = this.k;
                    DataOutputStream dataOutputStream = (DataOutputStream) otuVar.c;
                    ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) otuVar.b;
                    byteArrayOutputStream.reset();
                    try {
                        dataOutputStream.writeBytes(strZ);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeBytes(strZ2);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeLong(jG0);
                        dataOutputStream.writeLong(jG);
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        izr0 izr0Var7 = new izr0(byteArrayOutputStream.toByteArray());
                        int iA = izr0Var7.a();
                        for (gtf1 gtf1Var : this.I) {
                            izr0Var7.R(0);
                            gtf1Var.f(iA, izr0Var7);
                        }
                        if (jA == -9223372036854775807L) {
                            arrayDeque2.addLast(new mj30(j, true, iA));
                            this.x += iA;
                        } else if (!arrayDeque2.isEmpty()) {
                            arrayDeque2.addLast(new mj30(jA, false, iA));
                            this.x += iA;
                        } else if (yve1Var == null || yve1Var.e()) {
                            if (yve1Var != null) {
                                jA = yve1Var.a(jA);
                            }
                            long j20 = jA;
                            for (gtf1 gtf1Var2 : this.I) {
                                gtf1Var2.b(j20, 1, iA, 0, null);
                            }
                        } else {
                            arrayDeque2.addLast(new mj30(jA, false, iA));
                            this.x += iA;
                        }
                    } catch (IOException e) {
                        eg.j(e);
                        return 0;
                    }
                }
                fc10Var2 = fc10Var;
            } else {
                fc10Var2.u(i30);
            }
            l(fc10Var2.getPosition());
        }
        gtf1 gtf1Var3 = oj30Var.a;
        onf1 onf1Var8 = oj30Var.b;
        String str = "video/hevc";
        if (this.r == 3) {
            this.C = !oj30Var.n ? oj30Var.d.d[oj30Var.f] : onf1Var8.h[oj30Var.f];
            ie30 ie30Var = oj30Var.d.a.g;
            this.F = !((!Objects.equals(ie30Var.f66p, "video/avc") ? !(!Objects.equals(ie30Var.f66p, "video/hevc") || (i & SemanticState.Focused) == 0) : (i & 64) != 0) ? false : z);
            if (oj30Var.f < oj30Var.i) {
                fc10Var2.u(this.C);
                dnf1 dnf1VarB = oj30Var.b();
                if (dnf1VarB != null) {
                    izr0 izr0Var8 = onf1Var8.n;
                    short s = dnf1VarB.d;
                    if (s != 0) {
                        izr0Var8.S(s);
                    }
                    int i32 = oj30Var.f;
                    if (onf1Var8.k && onf1Var8.l[i32]) {
                        izr0Var8.S(izr0Var8.L() * 6);
                    }
                }
                if (!oj30Var.c()) {
                    this.B = null;
                }
                this.r = (byte) 3;
                return 0;
            }
            if (oj30Var.d.a.h == z) {
                this.C -= 8;
                fc10Var2.u(8);
            }
            boolean zEquals = "audio/ac4".equals(oj30Var.d.a.g.f66p);
            int i33 = this.C;
            if (zEquals) {
                this.D = oj30Var.d(i33, 7);
                j82.F(this.C, izr0Var);
                gtf1Var3.f(7, izr0Var);
                iD = this.D + 7;
                this.D = iD;
                i4 = 0;
            } else {
                i4 = 0;
                iD = oj30Var.d(i33, 0);
                this.D = iD;
            }
            this.C += iD;
            this.r = (byte) 4;
            this.E = i4;
        }
        uzf1 uzf1Var = oj30Var.d;
        ljf1 ljf1Var = uzf1Var.a;
        long jA2 = !oj30Var.n ? uzf1Var.f[oj30Var.f] : onf1Var8.i[oj30Var.f];
        if (yve1Var != null) {
            jA2 = yve1Var.a(jA2);
        }
        int i34 = ljf1Var.k;
        ie30 ie30Var2 = ljf1Var.g;
        if (i34 == 0) {
            arrayDeque3 = arrayDeque2;
            ie30 ie30Var3 = oj30Var.l;
            if (ie30Var3 != null && pxd0.H(ie30Var2.f66p)) {
                ie30 ie30VarX = pxd0.X(fc10Var2, this.C, oj30Var.m);
                oj30Var.m = ie30VarX;
                ge30 ge30VarA = ie30VarX.a();
                ge30VarA.s = ie30Var3.t;
                xvj1.q(ge30VarA, gtf1Var3);
                oj30Var.l = null;
            }
            while (true) {
                int i35 = this.D;
                int i36 = this.C;
                if (i35 >= i36) {
                    break;
                }
                this.D += gtf1Var3.e(fc10Var2, i36 - i35, false);
            }
        } else {
            izr0 izr0Var9 = this.f;
            byte[] bArr2 = izr0Var9.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i37 = 4 - i34;
            while (true) {
                arrayDeque3 = arrayDeque2;
                if (this.D < this.C) {
                    int i38 = this.E;
                    if (i38 == 0) {
                        if (this.J.length > 0 || !this.F) {
                            int iV = mqn1.v(ie30Var2);
                            if (i34 + iV <= this.C - this.D) {
                                i3 = iV;
                            } else {
                                i3 = 0;
                            }
                        } else {
                            i3 = 0;
                        }
                        fc10Var2.readFully(bArr2, i37, i34 + i3);
                        izr0Var9.R(0);
                        int iQ7 = izr0Var9.q();
                        if (iQ7 < 0) {
                            throw ParserException.a((RuntimeException) null, "Invalid NAL length");
                        }
                        this.E = iQ7 - i3;
                        izr0 izr0Var10 = this.e;
                        int i39 = i37;
                        izr0Var10.R(0);
                        gtf1Var3.f(4, izr0Var10);
                        this.D += 4;
                        this.C += i39;
                        if (this.J.length > 0 && i3 > 0 && (strQ = mqn1.q(ie30Var2)) != null) {
                            switch (strQ.hashCode()) {
                                case -1662541442:
                                    if (strQ.equals(str)) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1331836730:
                                    if (strQ.equals("video/avc")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1331856911:
                                    if (strQ.equals("video/vvc")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    if (((bArr2[4] & 126) >> 1) == 39) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    break;
                                case 1:
                                    if ((bArr2[4] & 31) == c) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    break;
                                case 2:
                                    if (((bArr2[5] & 248) >> 3) == 23) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    break;
                                default:
                                    z2 = false;
                                    break;
                            }
                        } else {
                            z2 = false;
                        }
                        this.G = z2;
                        gtf1Var3.f(i3, izr0Var9);
                        this.D += i3;
                        if (i3 > 0 && !this.F && mqn1.u(i3, ie30Var2, bArr2)) {
                            this.F = true;
                        }
                        i37 = i39;
                    } else {
                        int i40 = i37;
                        if (this.G) {
                            izr0 izr0Var11 = this.g;
                            izr0Var11.O(i38);
                            fc10Var2.readFully(izr0Var11.a, 0, this.E);
                            gtf1Var3.f(this.E, izr0Var11);
                            int i41 = this.E;
                            int iK = mqn1.K(izr0Var11.a, izr0Var11.c);
                            izr0Var11.R(0);
                            izr0Var11.Q(iK);
                            int i42 = ie30Var2.r;
                            if (i42 == -1) {
                                if (t01Var.a != 0) {
                                    t01Var.F(0);
                                }
                            } else if (t01Var.a != i42) {
                                t01Var.F(i42);
                            }
                            t01Var.a(jA2, izr0Var11);
                            if ((oj30Var.a() & 4) != 0) {
                                t01Var.o(0);
                            }
                            iE = i41;
                        } else {
                            iE = gtf1Var3.e(fc10Var2, i38, false);
                        }
                        this.D += iE;
                        this.E -= iE;
                        i37 = i40;
                        str = str;
                    }
                    arrayDeque2 = arrayDeque3;
                    c = 6;
                }
            }
        }
        int iA2 = oj30Var.a();
        if (!this.F) {
            iA2 |= 67108864;
        }
        int i43 = iA2;
        dnf1 dnf1VarB2 = oj30Var.b();
        long j21 = jA2;
        gtf1Var3.b(j21, i43, this.C, 0, dnf1VarB2 != null ? dnf1VarB2.c : null);
        while (!arrayDeque3.isEmpty()) {
            mj30 mj30Var = (mj30) arrayDeque3.removeFirst();
            this.x -= mj30Var.c;
            long jA3 = mj30Var.a;
            if (mj30Var.b) {
                jA3 += j21;
            }
            if (yve1Var != null) {
                jA3 = yve1Var.a(jA3);
            }
            long j22 = jA3;
            for (gtf1 gtf1Var4 : this.I) {
                gtf1Var4.b(j22, 1, mj30Var.c, this.x, null);
            }
        }
        if (!oj30Var.c()) {
            this.B = null;
        }
        this.r = (byte) 3;
        return 0;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        bg11 bg11VarT;
        iw91 iw91VarJ = zho1.J(fc10Var, true);
        if (iw91VarJ != null) {
            bg11VarT = b380.t(iw91VarJ);
        } else {
            w280 w280Var = b380.b;
            bg11VarT = bg11.e;
        }
        this.q = bg11VarT;
        return iw91VarJ == null;
    }

    @Override // p.ec10
    public final List e() {
        return this.q;
    }

    public final void g() {
        this.r = (byte) 0;
        this.u = 0;
    }

    public final void i(fn51 fn51Var, sfv0 sfv0Var) {
        this.H.c(fn51Var);
        this.K = true;
        sfv0Var.a = this.N;
        g();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:194:0x047c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0491 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x0493  */
    /* JADX WARN: Code duplicated, block: B:200:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:203:0x04a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:205:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:207:0x04ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:209:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:212:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:214:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:216:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:219:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:220:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:226:0x0513  */
    /* JADX WARN: Code duplicated, block: B:302:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:393:0x053a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x0528 A[SYNTHETIC] */
    public final void l(long j) throws ParserException {
        hjj0 hjj0Var;
        long j2;
        xks xksVar;
        int i;
        xks xksVar2;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i3;
        byte[] bArr;
        int i4;
        boolean z;
        oj30 oj30Var;
        int i5;
        izr0 izr0Var;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z2;
        int i6;
        oj30 oj30Var2;
        long j3;
        long j4;
        int i7;
        int iQ;
        long[] jArr2;
        int iQ2;
        int iQ3;
        int iQ4;
        long jG0;
        oj30 oj30Var3;
        boolean z3;
        int i8;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((mpm0) arrayDeque.peek()).e != j) {
                break;
            }
            mpm0 mpm0Var = (mpm0) arrayDeque.pop();
            int i9 = mpm0Var.b;
            ArrayList arrayList4 = mpm0Var.g;
            ArrayList arrayList5 = mpm0Var.f;
            int i10 = 12;
            SparseArray sparseArray = this.d;
            int i11 = this.b;
            if (i9 == 1836019574) {
                x8v x8vVarH = h(arrayList5);
                mpm0 mpm0VarM = mpm0Var.m(1836475768);
                mpm0VarM.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = mpm0VarM.f;
                int size = arrayList6.size();
                int i12 = 0;
                long jG = -9223372036854775807L;
                while (i12 < size) {
                    npm0 npm0Var = (npm0) arrayList6.get(i12);
                    int i13 = npm0Var.b;
                    izr0 izr0Var2 = npm0Var.e;
                    if (i13 == 1953654136) {
                        izr0Var2.R(i10);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(izr0Var2.q()), new xks(izr0Var2.q() - 1, izr0Var2.q(), izr0Var2.q(), izr0Var2.q()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (xks) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i13 == 1835362404) {
                            izr0Var2.R(8);
                            jG = e2c.e(izr0Var2.q()) == 0 ? izr0Var2.G() : izr0Var2.K();
                        }
                    }
                    i12++;
                    arrayList6 = arrayList;
                    i10 = 12;
                }
                int i14 = 0;
                mpm0 mpm0VarM2 = mpm0Var.m(1835365473);
                hjj0 hjj0VarF = mpm0VarM2 != null ? e2c.f(mpm0VarM2) : null;
                e440 e440Var = new e440();
                npm0 npm0VarN = mpm0Var.n(1969517665);
                if (npm0VarN != null) {
                    hjj0 hjj0VarK = e2c.k(npm0VarN, (i11 & SemanticState.ReadOnly) != 0);
                    e440Var.b(hjj0VarK);
                    hjj0Var = hjj0VarK;
                } else {
                    hjj0Var = null;
                }
                npm0 npm0VarN2 = mpm0Var.n(1836476516);
                npm0VarN2.getClass();
                hjj0 hjj0Var2 = new hjj0(e2c.g(npm0VarN2.e));
                ArrayList arrayListJ = e2c.j(mpm0Var, e440Var, jG, x8vVarH, (i11 & 16) != 0, false, new cwa(this), false);
                int size2 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strN = u0p1.n(arrayListJ);
                    int i15 = 0;
                    while (i15 < size2) {
                        uzf1 uzf1Var = (uzf1) arrayListJ.get(i15);
                        ljf1 ljf1Var = uzf1Var.a;
                        boolean z4 = ljf1Var.m;
                        int i16 = ljf1Var.a;
                        ie30 ie30Var = ljf1Var.g;
                        int i17 = size2;
                        String str = strN;
                        long j5 = ljf1Var.e;
                        int i18 = ljf1Var.b;
                        if (z4) {
                            gtf1 gtf1VarW = this.H.w(i15, i18);
                            gtf1VarW.g(j5);
                            ge30 ge30VarA = ie30Var.a();
                            ge30VarA.n = asj0.p(str);
                            if (i18 == 1) {
                                int i19 = e440Var.a;
                                j2 = j5;
                                if (i19 != -1 && (i = e440Var.b) != -1) {
                                    ge30VarA.M = i19;
                                    ge30VarA.N = i;
                                }
                            } else {
                                j2 = j5;
                            }
                            zzo1.s(i18, hjj0VarF, ge30VarA, ie30Var.m, new hjj0[]{hjj0Var, hjj0Var2});
                            if (sparseArray2.size() == 1) {
                                xksVar = (xks) sparseArray2.valueAt(i14);
                            } else {
                                xksVar = (xks) sparseArray2.get(i16);
                                xksVar.getClass();
                            }
                            sparseArray.put(i16, new oj30(gtf1VarW, uzf1Var, xksVar, new ie30(ge30VarA)));
                            this.z = Math.max(this.z, j2);
                        }
                        i15++;
                        size2 = i17;
                        strN = str;
                        arrayListJ = arrayListJ;
                        i14 = 0;
                    }
                    this.H.s();
                } else {
                    ArrayList arrayList7 = arrayListJ;
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < size2) {
                        ArrayList arrayList8 = arrayList7;
                        if (((uzf1) arrayList8.get(i20)).a.m) {
                            i21++;
                        }
                        i20++;
                        arrayList7 = arrayList8;
                    }
                    ArrayList arrayList9 = arrayList7;
                    dm5.y(sparseArray.size() == i21);
                    for (int i22 = 0; i22 < size2; i22++) {
                        uzf1 uzf1Var2 = (uzf1) arrayList9.get(i22);
                        ljf1 ljf1Var2 = uzf1Var2.a;
                        boolean z5 = ljf1Var2.m;
                        int i23 = ljf1Var2.a;
                        if (z5) {
                            oj30 oj30Var4 = (oj30) sparseArray.get(i23);
                            if (sparseArray2.size() == 1) {
                                xksVar2 = (xks) sparseArray2.valueAt(0);
                            } else {
                                xksVar2 = (xks) sparseArray2.get(i23);
                                xksVar2.getClass();
                            }
                            oj30Var4.d = uzf1Var2;
                            oj30Var4.e = xksVar2;
                            if (oj30Var4.l == null) {
                                oj30Var4.a.a(oj30Var4.m);
                            }
                            oj30Var4.e();
                        }
                    }
                }
            } else if (i9 == 1836019558) {
                int size3 = arrayList4.size();
                int i24 = 0;
                while (i24 < size3) {
                    mpm0 mpm0Var2 = (mpm0) arrayList4.get(i24);
                    if (mpm0Var2.b == 1953653094) {
                        npm0 npm0VarN3 = mpm0Var2.n(1952868452);
                        ArrayList arrayList10 = mpm0Var2.f;
                        npm0VarN3.getClass();
                        izr0 izr0Var3 = npm0VarN3.e;
                        izr0Var3.R(8);
                        int iQ5 = izr0Var3.q();
                        byte[] bArr2 = e2c.a;
                        oj30 oj30Var5 = (oj30) sparseArray.get(izr0Var3.q());
                        if (oj30Var5 == null) {
                            size3 = size3;
                            oj30Var5 = null;
                        } else {
                            onf1 onf1Var = oj30Var5.b;
                            if ((iQ5 & 1) != 0) {
                                long jK = izr0Var3.K();
                                onf1Var.b = jK;
                                onf1Var.c = jK;
                            }
                            xks xksVar3 = oj30Var5.e;
                            onf1Var.a = new xks((iQ5 & 2) != 0 ? izr0Var3.q() - 1 : xksVar3.a, (iQ5 & 8) != 0 ? izr0Var3.q() : xksVar3.b, (iQ5 & 16) != 0 ? izr0Var3.q() : xksVar3.c, (iQ5 & 32) != 0 ? izr0Var3.q() : xksVar3.d);
                        }
                        if (oj30Var5 != null) {
                            onf1 onf1Var2 = oj30Var5.b;
                            long j6 = onf1Var2.f107p;
                            boolean z6 = onf1Var2.q;
                            oj30Var5.e();
                            oj30Var5.n = true;
                            npm0 npm0VarN4 = mpm0Var2.n(1952867444);
                            if (npm0VarN4 == null || (i11 & 2) != 0) {
                                onf1Var2.f107p = j6;
                                onf1Var2.q = z6;
                            } else {
                                izr0 izr0Var4 = npm0VarN4.e;
                                izr0Var4.R(8);
                                onf1Var2.f107p = e2c.e(izr0Var4.q()) == 1 ? izr0Var4.K() : izr0Var4.G();
                                onf1Var2.q = true;
                            }
                            int size4 = arrayList10.size();
                            int i25 = 0;
                            int i26 = 0;
                            int i27 = 0;
                            while (true) {
                                i3 = 1953658222;
                                if (i25 >= size4) {
                                    break;
                                }
                                npm0 npm0Var2 = (npm0) arrayList10.get(i25);
                                int i28 = i24;
                                if (npm0Var2.b == 1953658222) {
                                    izr0 izr0Var5 = npm0Var2.e;
                                    izr0Var5.R(12);
                                    int I = izr0Var5.I();
                                    if (I > 0) {
                                        i27 += I;
                                        i26++;
                                    }
                                }
                                i25++;
                                i24 = i28;
                            }
                            i2 = i24;
                            oj30Var5.h = 0;
                            oj30Var5.g = 0;
                            oj30Var5.f = 0;
                            onf1Var2.d = i26;
                            onf1Var2.e = i27;
                            if (onf1Var2.g.length < i26) {
                                onf1Var2.f = new long[i26];
                                onf1Var2.g = new int[i26];
                            }
                            if (onf1Var2.h.length < i27) {
                                int i29 = (i27 * 125) / 100;
                                onf1Var2.h = new int[i29];
                                onf1Var2.i = new long[i29];
                                onf1Var2.j = new boolean[i29];
                                onf1Var2.l = new boolean[i29];
                            }
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                long jA = 0;
                                if (i30 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    ljf1 ljf1Var3 = oj30Var5.d.a;
                                    xks xksVar4 = onf1Var2.a;
                                    xksVar4.getClass();
                                    int i33 = xksVar4.a;
                                    dnf1[] dnf1VarArr = ljf1Var3.n;
                                    dnf1 dnf1Var = dnf1VarArr == null ? null : dnf1VarArr[i33];
                                    npm0 npm0VarN5 = mpm0Var2.n(1935763834);
                                    if (npm0VarN5 != null) {
                                        dnf1Var.getClass();
                                        izr0 izr0Var6 = npm0VarN5.e;
                                        short s = dnf1Var.d;
                                        izr0Var6.R(8);
                                        int iQ6 = izr0Var6.q();
                                        byte[] bArr3 = e2c.a;
                                        if ((iQ6 & 1) == 1) {
                                            izr0Var6.S(8);
                                        }
                                        int iE = izr0Var6.E();
                                        int I2 = izr0Var6.I();
                                        if (I2 > onf1Var2.e) {
                                            StringBuilder sbR = cy30.r(I2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbR.append(onf1Var2.e);
                                            throw ParserException.a((RuntimeException) null, sbR.toString());
                                        }
                                        if (iE == 0) {
                                            boolean[] zArr2 = onf1Var2.l;
                                            i4 = 0;
                                            for (int i34 = 0; i34 < I2; i34++) {
                                                int iE2 = izr0Var6.E();
                                                i4 += iE2;
                                                zArr2[i34] = iE2 > s;
                                            }
                                            z = false;
                                        } else {
                                            boolean z7 = iE > s;
                                            i4 = iE * I2;
                                            z = false;
                                            Arrays.fill(onf1Var2.l, 0, I2, z7);
                                        }
                                        Arrays.fill(onf1Var2.l, I2, onf1Var2.e, z);
                                        if (i4 > 0) {
                                            onf1Var2.n.O(i4);
                                            onf1Var2.k = true;
                                            onf1Var2.o = true;
                                        }
                                    }
                                    npm0 npm0VarN6 = mpm0Var2.n(1935763823);
                                    if (npm0VarN6 != null) {
                                        izr0 izr0Var7 = npm0VarN6.e;
                                        izr0Var7.R(8);
                                        int iQ7 = izr0Var7.q();
                                        byte[] bArr4 = e2c.a;
                                        if ((iQ7 & 1) == 1) {
                                            izr0Var7.S(8);
                                        }
                                        int I3 = izr0Var7.I();
                                        if (I3 != 1) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected saio entry count: " + I3);
                                        }
                                        onf1Var2.c += e2c.e(iQ7) == 0 ? izr0Var7.G() : izr0Var7.K();
                                    }
                                    npm0 npm0VarN7 = mpm0Var2.n(1936027235);
                                    if (npm0VarN7 != null) {
                                        j(npm0VarN7.e, 0, onf1Var2);
                                    }
                                    String str2 = dnf1Var != null ? dnf1Var.b : null;
                                    izr0 izr0Var8 = null;
                                    izr0 izr0Var9 = null;
                                    for (int i35 = 0; i35 < arrayList10.size(); i35++) {
                                        npm0 npm0Var3 = (npm0) arrayList10.get(i35);
                                        izr0 izr0Var10 = npm0Var3.e;
                                        int i36 = npm0Var3.b;
                                        if (i36 == 1935828848) {
                                            izr0Var10.R(12);
                                            if (izr0Var10.q() == 1936025959) {
                                                izr0Var9 = izr0Var10;
                                            }
                                        } else if (i36 == 1936158820) {
                                            izr0Var10.R(12);
                                            if (izr0Var10.q() == 1936025959) {
                                                izr0Var8 = izr0Var10;
                                            }
                                        }
                                    }
                                    if (izr0Var9 != null && izr0Var8 != null) {
                                        izr0Var9.R(8);
                                        int iE3 = e2c.e(izr0Var9.q());
                                        izr0Var9.S(4);
                                        if (iE3 == 1) {
                                            izr0Var9.S(4);
                                        }
                                        if (izr0Var9.q() != 1) {
                                            throw ParserException.d("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        izr0Var8.R(8);
                                        int iE4 = e2c.e(izr0Var8.q());
                                        izr0Var8.S(4);
                                        long jG2 = iE4 >= 1 ? izr0Var8.G() : 0L;
                                        if (iE4 >= 2) {
                                            izr0Var8.S(4);
                                        }
                                        if (izr0Var8.G() != 1) {
                                            throw ParserException.d("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        if (iE4 >= 1 && jG2 == 0) {
                                            izr0Var8.S(4);
                                        }
                                        izr0Var8.S(1);
                                        int iE5 = izr0Var8.E();
                                        int i37 = (iE5 & 240) >> 4;
                                        int i38 = iE5 & 15;
                                        boolean z8 = izr0Var8.E() == 1;
                                        if (z8) {
                                            int iE6 = izr0Var8.E();
                                            byte[] bArr5 = new byte[16];
                                            izr0Var8.o(0, bArr5, 16);
                                            if (iE6 == 0) {
                                                int iE7 = izr0Var8.E();
                                                byte[] bArr6 = new byte[iE7];
                                                izr0Var8.o(0, bArr6, iE7);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            onf1Var2.k = true;
                                            onf1Var2.m = new dnf1(z8, str2, iE6, bArr5, i37, i38, bArr);
                                        }
                                    }
                                    int size5 = arrayList10.size();
                                    for (int i39 = 0; i39 < size5; i39++) {
                                        npm0 npm0Var4 = (npm0) arrayList10.get(i39);
                                        if (npm0Var4.b == 1970628964) {
                                            izr0 izr0Var11 = npm0Var4.e;
                                            izr0Var11.R(8);
                                            byte[] bArr7 = this.h;
                                            izr0Var11.o(0, bArr7, 16);
                                            if (Arrays.equals(bArr7, O)) {
                                                j(izr0Var11, 16, onf1Var2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                npm0 npm0Var5 = (npm0) arrayList10.get(i30);
                                if (npm0Var5.b == i3) {
                                    int i40 = i31 + 1;
                                    izr0 izr0Var12 = npm0Var5.e;
                                    izr0Var12.R(8);
                                    int iQ8 = izr0Var12.q();
                                    byte[] bArr8 = e2c.a;
                                    ljf1 ljf1Var4 = oj30Var5.d.a;
                                    xks xksVar5 = onf1Var2.a;
                                    String str3 = zoi1.a;
                                    onf1Var2.g[i31] = izr0Var12.I();
                                    long[] jArr3 = onf1Var2.f;
                                    long j7 = onf1Var2.b;
                                    jArr3[i31] = j7;
                                    if ((iQ8 & 1) != 0) {
                                        jArr3[i31] = j7 + ((long) izr0Var12.q());
                                    }
                                    boolean z9 = (iQ8 & 4) != 0;
                                    int iQ9 = xksVar5.d;
                                    if (z9) {
                                        iQ9 = izr0Var12.q();
                                    }
                                    boolean z10 = z9;
                                    boolean z11 = (iQ8 & SemanticState.Hidden) != 0;
                                    boolean z12 = (iQ8 & 512) != 0;
                                    boolean z13 = (iQ8 & SemanticState.ReadOnly) != 0;
                                    boolean z14 = (iQ8 & SemanticState.Modal) != 0;
                                    boolean z15 = z13;
                                    f380 f380Var = ljf1Var4.i;
                                    int i41 = iQ9;
                                    f380 f380Var2 = ljf1Var4.j;
                                    int i42 = i31;
                                    if (f380Var != null) {
                                        i5 = i32;
                                        if (f380Var.b == 1 && f380Var2 != null) {
                                            if (f380Var.a(0) == 0) {
                                                oj30Var5 = oj30Var5;
                                                izr0Var = izr0Var12;
                                            } else {
                                                long jA2 = f380Var.a(0);
                                                oj30Var5 = oj30Var5;
                                                long j8 = ljf1Var4.d;
                                                RoundingMode roundingMode = RoundingMode.DOWN;
                                                long jG1 = zoi1.g0(jA2, 1000000L, j8, roundingMode);
                                                izr0Var = izr0Var12;
                                                i8 = jG1 + zoi1.g0(f380Var2.a(0), 1000000L, ljf1Var4.c, roundingMode) >= ljf1Var4.e ? 0 : 0;
                                            }
                                            jA = f380Var2.a(i8);
                                        }
                                        iArr = onf1Var2.h;
                                        jArr = onf1Var2.i;
                                        zArr = onf1Var2.j;
                                        if (ljf1Var4.b == 2 || (i11 & 1) == 0) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        i6 = i5 + onf1Var2.g[i42];
                                        oj30Var2 = oj30Var5;
                                        j3 = ljf1Var4.c;
                                        j4 = onf1Var2.f107p;
                                        i7 = i5;
                                        while (i7 < i6) {
                                            if (z11) {
                                                iQ = izr0Var.q();
                                            } else {
                                                iQ = xksVar5.b;
                                            }
                                            jArr2 = jArr;
                                            if (iQ >= 0) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected negative value: " + iQ);
                                            }
                                            if (z12) {
                                                iQ2 = izr0Var.q();
                                            } else {
                                                iQ2 = xksVar5.c;
                                            }
                                            if (iQ2 >= 0) {
                                                throw ParserException.a((RuntimeException) null, "Unexpected negative value: " + iQ2);
                                            }
                                            if (z15) {
                                                iQ3 = izr0Var.q();
                                            } else if (i7 == 0 || !z10) {
                                                iQ3 = xksVar5.d;
                                            } else {
                                                iQ3 = i41;
                                            }
                                            if (z14) {
                                                iQ4 = izr0Var.q();
                                            } else {
                                                iQ4 = 0;
                                            }
                                            boolean z16 = z2;
                                            int i43 = i6;
                                            jG0 = zoi1.g0((((long) iQ4) + j4) - jA, 1000000L, j3, RoundingMode.DOWN);
                                            jArr2[i7] = jG0;
                                            if (onf1Var2.q) {
                                                oj30Var3 = oj30Var2;
                                            } else {
                                                oj30Var3 = oj30Var2;
                                                jArr2[i7] = jG0 + oj30Var3.d.i;
                                            }
                                            iArr[i7] = iQ2;
                                            if (((iQ3 >> 16) & 1) == 0 || (z16 && i7 != 0)) {
                                                z3 = false;
                                            } else {
                                                z3 = true;
                                            }
                                            zArr[i7] = z3;
                                            j4 += (long) iQ;
                                            i7++;
                                            oj30Var2 = oj30Var3;
                                            jArr = jArr2;
                                            zArr = zArr;
                                            xksVar5 = xksVar5;
                                            z2 = z16;
                                            i6 = i43;
                                        }
                                        oj30Var = oj30Var2;
                                        onf1Var2.f107p = j4;
                                        i31 = i40;
                                        i32 = i6;
                                    } else {
                                        i5 = i32;
                                    }
                                    izr0Var = izr0Var12;
                                    iArr = onf1Var2.h;
                                    jArr = onf1Var2.i;
                                    zArr = onf1Var2.j;
                                    if (ljf1Var4.b == 2) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    i6 = i5 + onf1Var2.g[i42];
                                    oj30Var2 = oj30Var5;
                                    j3 = ljf1Var4.c;
                                    j4 = onf1Var2.f107p;
                                    i7 = i5;
                                    while (i7 < i6) {
                                        if (z11) {
                                            iQ = izr0Var.q();
                                        } else {
                                            iQ = xksVar5.b;
                                        }
                                        jArr2 = jArr;
                                        if (iQ >= 0) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected negative value: " + iQ);
                                        }
                                        if (z12) {
                                            iQ2 = izr0Var.q();
                                        } else {
                                            iQ2 = xksVar5.c;
                                        }
                                        if (iQ2 >= 0) {
                                            throw ParserException.a((RuntimeException) null, "Unexpected negative value: " + iQ2);
                                        }
                                        if (z15) {
                                            iQ3 = izr0Var.q();
                                        } else if (i7 == 0) {
                                            iQ3 = xksVar5.d;
                                        } else {
                                            iQ3 = xksVar5.d;
                                        }
                                        if (z14) {
                                            iQ4 = izr0Var.q();
                                        } else {
                                            iQ4 = 0;
                                        }
                                        boolean z17 = z2;
                                        int i44 = i6;
                                        jG0 = zoi1.g0((((long) iQ4) + j4) - jA, 1000000L, j3, RoundingMode.DOWN);
                                        jArr2[i7] = jG0;
                                        if (onf1Var2.q) {
                                            oj30Var3 = oj30Var2;
                                            jArr2[i7] = jG0 + oj30Var3.d.i;
                                        } else {
                                            oj30Var3 = oj30Var2;
                                        }
                                        iArr[i7] = iQ2;
                                        if (((iQ3 >> 16) & 1) == 0) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        zArr[i7] = z3;
                                        j4 += (long) iQ;
                                        i7++;
                                        oj30Var2 = oj30Var3;
                                        jArr = jArr2;
                                        zArr = zArr;
                                        xksVar5 = xksVar5;
                                        z2 = z17;
                                        i6 = i44;
                                    }
                                    oj30Var = oj30Var2;
                                    onf1Var2.f107p = j4;
                                    i31 = i40;
                                    i32 = i6;
                                } else {
                                    oj30Var = oj30Var5;
                                }
                                i30++;
                                oj30Var5 = oj30Var;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                size4 = size4;
                                i3 = 1953658222;
                            }
                        } else {
                            i2 = i24;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                        }
                    } else {
                        size3 = size3;
                        i2 = i24;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                    }
                    i24 = i2 + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                }
                x8v x8vVarH2 = h(arrayList5);
                if (x8vVarH2 != null) {
                    int size6 = sparseArray.size();
                    for (int i45 = 0; i45 < size6; i45++) {
                        oj30 oj30Var6 = (oj30) sparseArray.valueAt(i45);
                        ljf1 ljf1Var5 = oj30Var6.d.a;
                        xks xksVar6 = oj30Var6.b.a;
                        String str4 = zoi1.a;
                        int i46 = xksVar6.a;
                        dnf1[] dnf1VarArr2 = ljf1Var5.n;
                        dnf1 dnf1Var2 = dnf1VarArr2 == null ? null : dnf1VarArr2[i46];
                        x8v x8vVarA = x8vVarH2.a(dnf1Var2 != null ? dnf1Var2.b : null);
                        ge30 ge30VarA2 = oj30Var6.m.a();
                        ge30VarA2.s = x8vVarA;
                        ie30 ie30Var2 = new ie30(ge30VarA2);
                        if (oj30Var6.l != null) {
                            oj30Var6.l = ie30Var2;
                        } else {
                            oj30Var6.a.a(ie30Var2);
                        }
                    }
                }
                if (this.y != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i47 = 0; i47 < size7; i47++) {
                        oj30 oj30Var7 = (oj30) sparseArray.valueAt(i47);
                        long j9 = this.y;
                        int i48 = oj30Var7.f;
                        while (true) {
                            onf1 onf1Var3 = oj30Var7.b;
                            if (i48 >= onf1Var3.e || onf1Var3.i[i48] > j9) {
                                break;
                            }
                            if (onf1Var3.j[i48]) {
                                oj30Var7.i = i48;
                            }
                            i48++;
                        }
                    }
                    this.y = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((mpm0) arrayDeque.peek()).g.add(mpm0Var);
            }
        }
        g();
    }

    @Override // p.ec10
    public final void release() {
    }
}
