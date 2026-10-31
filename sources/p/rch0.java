package p;

import android.util.LongSparseArray;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.session.legacy.PlaybackStateCompat;
import app.p000rive.semantics.SemanticState;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rch0 implements ec10 {
    public static final byte[] q0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] r0;
    public static final byte[] s0;
    public static final byte[] t0;
    public static final UUID u0;
    public static final Map v0;
    public qch0 A;
    public boolean B;
    public int C;
    public long D;
    public final SparseArray E;
    public boolean F;
    public long G;
    public int H;
    public long I;
    public long J;
    public int K;
    public boolean L;
    public long M;
    public long N;
    public long O;
    public boolean P;
    public long Q;
    public boolean R;
    public long S;
    public boolean T;
    public byte U;
    public long V;
    public long W;
    public int X;
    public int Y;
    public int[] Z;
    public final hwr a;
    public int a0;
    public final iti1 b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final LongSparseArray d;
    public int d0;
    public final boolean e;
    public boolean e0;
    public final boolean f;
    public long f0;
    public final jqc1 g;
    public int g0;
    public final izr0 h;
    public int h0;
    public final izr0 i;
    public int i0;
    public final izr0 j;
    public boolean j0;
    public final izr0 k;
    public boolean k0;
    public final izr0 l;
    public boolean l0;
    public final izr0 m;
    public short m0;
    public final izr0 n;
    public byte n0;
    public final izr0 o;
    public boolean o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final izr0 f125p;
    public gc10 p0;
    public final izr0 q;
    public ByteBuffer r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public boolean x;
    public boolean y;
    public nch0 z;

    static {
        String str = zoi1.a;
        r0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        s0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        t0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        u0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        cy30.v(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        cy30.v(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        v0 = Collections.unmodifiableMap(map);
    }

    public rch0(jqc1 jqc1Var, int i) {
        hwr hwrVar = new hwr();
        this.t = -1L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.H = -1;
        this.I = -1L;
        this.J = -1L;
        this.K = -1;
        this.M = -1L;
        this.N = -1L;
        this.O = -1L;
        this.Q = -1L;
        this.S = -9223372036854775807L;
        this.a = hwrVar;
        hwrVar.d = new z8c0(this, (byte) 14);
        this.g = jqc1Var;
        this.E = new SparseArray();
        this.e = (i & 1) == 0;
        this.f = (i & 2) == 0;
        this.b = new iti1((byte) 0);
        this.d = new LongSparseArray();
        this.c = new SparseArray();
        this.j = new izr0(4);
        this.k = new izr0(ByteBuffer.allocate(4).putInt(-1).array());
        this.l = new izr0(4);
        this.h = new izr0(mqn1.a);
        this.i = new izr0(4);
        this.m = new izr0();
        this.n = new izr0();
        this.o = new izr0(8);
        this.f125p = new izr0();
        this.q = new izr0();
        this.Z = new int[1];
        this.y = true;
    }

    public static byte[] i(long j, long j2, String str) {
        dm5.m(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = zoi1.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        this.S = -9223372036854775807L;
        this.U = (byte) 0;
        hwr hwrVar = this.a;
        hwrVar.e = (byte) 0;
        hwrVar.b.clear();
        iti1 iti1Var = hwrVar.c;
        iti1Var.a = false;
        iti1Var.b = 0;
        iti1 iti1Var2 = this.b;
        iti1Var2.a = false;
        iti1Var2.b = 0;
        m();
        this.F = false;
        this.G = -9223372036854775807L;
        this.H = -1;
        this.I = -1L;
        this.J = -1L;
        if (!this.B) {
            this.E.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            bwg1 bwg1Var = ((qch0) sparseArray.valueAt(i)).W;
            if (bwg1Var != null) {
                bwg1Var.b = false;
                bwg1Var.c = 0;
            }
            i++;
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        if (this.f) {
            gc10Var = new wh41(gc10Var, this.g);
        }
        this.p0 = gc10Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        int i = 0;
        this.T = false;
        boolean zA = true;
        while (zA && !this.T) {
            zA = this.a.a(fc10Var);
            if (zA) {
                long position = fc10Var.getPosition();
                if (this.P) {
                    this.Q = position;
                    sfv0Var.a = this.O;
                    this.P = false;
                    return 1;
                }
                if (this.R) {
                    long j = this.Q;
                    if (j != -1) {
                        sfv0Var.a = j;
                        this.Q = -1L;
                        return 1;
                    }
                }
                long position2 = fc10Var.getPosition();
                if (this.L) {
                    this.N = position2;
                    sfv0Var.a = this.M;
                    this.L = false;
                    return 1;
                }
                if (this.B) {
                    long j2 = this.N;
                    if (j2 != -1) {
                        sfv0Var.a = j2;
                        this.N = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        if (zA) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return -1;
            }
            qch0 qch0Var = (qch0) sparseArray.valueAt(i);
            qch0Var.d0.getClass();
            bwg1 bwg1Var = qch0Var.W;
            if (bwg1Var != null) {
                bwg1Var.a(qch0Var.d0, qch0Var.l);
            }
            i++;
        }
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) throws InterruptedIOException {
        jw91 jw91Var = new jw91((byte) 0);
        izr0 izr0Var = (izr0) jw91Var.c;
        uyr uyrVar = (uyr) fc10Var;
        long j = uyrVar.c;
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j != -1 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i = (int) j2;
        uyrVar.d(izr0Var.a, 0, 4, false);
        jw91Var.b = 4;
        for (long jG = izr0Var.G(); jG != 440786851; jG = ((long) (izr0Var.a[0] & 255)) | ((jG << 8) & (-256))) {
            int i2 = jw91Var.b + 1;
            jw91Var.b = i2;
            if (i2 == i) {
                return false;
            }
            uyrVar.d(izr0Var.a, 0, 1, false);
        }
        long jC = jw91Var.c(uyrVar);
        long j3 = jw91Var.b;
        if (jC != Long.MIN_VALUE && (j == -1 || j3 + jC < j)) {
            while (true) {
                long j4 = jw91Var.b;
                long j5 = j3 + jC;
                if (j4 < j5) {
                    if (jw91Var.c(uyrVar) == Long.MIN_VALUE) {
                        break;
                    }
                    long jC2 = jw91Var.c(uyrVar);
                    if (jC2 < 0 || jC2 > 2147483647L) {
                        break;
                    }
                    if (jC2 != 0) {
                        int i3 = (int) jC2;
                        uyrVar.v(i3, false);
                        jw91Var.b += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(int i) {
        if (this.F) {
            return;
        }
        throw ParserException.a((RuntimeException) null, "Element " + i + " must be in a Cues");
    }

    public final void g(int i) {
        if (this.A != null) {
            return;
        }
        throw ParserException.a((RuntimeException) null, "Element " + i + " must be in a TrackEntry");
    }

    public final void h(qch0 qch0Var, long j, int i, int i2, int i3) {
        byte[] bArrI;
        int i4;
        int i5;
        bwg1 bwg1Var = qch0Var.W;
        if (bwg1Var != null) {
            bwg1Var.b(qch0Var.d0, j, i, i2, i3, qch0Var.l);
        } else {
            if ("S_TEXT/UTF8".equals(qch0Var.c) || "S_TEXT/ASS".equals(qch0Var.c) || "S_TEXT/SSA".equals(qch0Var.c) || "S_TEXT/WEBVTT".equals(qch0Var.c)) {
                if (this.Y > 1) {
                    oon1.H("Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.W;
                    if (j2 == -9223372036854775807L) {
                        oon1.H("Skipping subtitle sample with no duration.");
                    } else {
                        String str = qch0Var.c;
                        izr0 izr0Var = this.n;
                        byte[] bArr = izr0Var.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrI = i(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrI = i(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrI = i(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                bhn0.q();
                                return;
                        }
                        System.arraycopy(bArrI, 0, bArr, i4, bArrI.length);
                        for (int i6 = izr0Var.b; i6 < izr0Var.c; i6++) {
                            if (izr0Var.a[i6] == 0) {
                                izr0Var.Q(i6);
                                qch0Var.d0.f(izr0Var.c, izr0Var);
                                i5 = i2 + izr0Var.c;
                            }
                        }
                        qch0Var.d0.f(izr0Var.c, izr0Var);
                        i5 = i2 + izr0Var.c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.Y;
                izr0 izr0Var2 = this.q;
                if (i7 > 1) {
                    izr0Var2.O(0);
                } else {
                    int i8 = izr0Var2.c;
                    qch0Var.d0.c(izr0Var2, i8, 2);
                    i5 += i8;
                }
            }
            qch0Var.d0.b(j, i, i5, i3, qch0Var.l);
        }
        this.T = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public final nch0 j(int i) throws ParserException {
        nch0 nch0Var = this.z;
        if (nch0Var != null) {
            return nch0Var;
        }
        throw ParserException.a((RuntimeException) null, "Element " + i + " must be in an EditionEntry");
    }

    public final void k() {
        if (!this.y) {
            return;
        }
        if (this.O != -1 && !this.R) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                gc10 gc10Var = this.p0;
                gc10Var.getClass();
                gc10Var.s();
                this.y = false;
                return;
            }
            if (((qch0) sparseArray.valueAt(i)).X) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void l(fc10 fc10Var, int i) {
        izr0 izr0Var = this.j;
        if (izr0Var.c >= i) {
            return;
        }
        byte[] bArr = izr0Var.a;
        if (bArr.length < i) {
            izr0Var.d(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = izr0Var.a;
        int i2 = izr0Var.c;
        fc10Var.readFully(bArr2, i2, i - i2);
        izr0Var.Q(i);
    }

    public final void m() {
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.m0 = (short) 0;
        this.n0 = (byte) 0;
        this.o0 = false;
        this.m.O(0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public final long n(long j) throws ParserException {
        long j2 = this.u;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a((RuntimeException) null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = zoi1.a;
        return zoi1.g0(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public final void o(qch0 qch0Var) {
        long j;
        char c;
        long j2;
        long j3;
        long j4;
        long j5;
        hjj0 hjj0Var;
        eie1 eie1Var;
        boolean z;
        hjj0 hjj0VarA;
        long j6 = 0;
        int i = 1;
        char c2 = 0;
        if (!qch0Var.Y) {
            LongSparseArray longSparseArray = this.d;
            if (longSparseArray.size() != 0) {
                ArrayList arrayList = new ArrayList(longSparseArray.size());
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    nch0 nch0Var = (nch0) longSparseArray.valueAt(i2);
                    long j7 = nch0Var.e;
                    if (j7 == 0 || j7 == qch0Var.e) {
                        long j8 = nch0Var.b;
                        String str = zoi1.a;
                        if (j8 != -9223372036854775807L && j8 != Long.MIN_VALUE) {
                            j8 /= 1000000;
                        }
                        long j9 = j8;
                        long j10 = nch0Var.c;
                        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
                            j10 /= 1000000;
                        }
                        arrayList.add(new jhe(j9, j10, nch0Var.d, nch0Var.f != null ? new u9b0(nch0Var.g, nch0Var.f) : null));
                    }
                }
                if (!arrayList.isEmpty()) {
                    ie30 ie30Var = qch0Var.e0;
                    ie30Var.getClass();
                    ge30 ge30VarA = ie30Var.a();
                    hjj0 hjj0Var2 = qch0Var.e0.m;
                    ge30VarA.l = hjj0Var2 != null ? hjj0Var2.a((rij0[]) arrayList.toArray(new ehe[0])) : new hjj0(arrayList);
                    qch0Var.e0 = new ie30(ge30VarA);
                    qch0Var.Y = true;
                }
            }
        }
        long j11 = this.w;
        long j12 = this.t;
        long j13 = this.s;
        if (qch0Var.f != 2) {
            return;
        }
        List list = (List) this.E.get(qch0Var.d);
        if (qch0Var.Z || list == null || list.isEmpty()) {
            return;
        }
        if (!list.isEmpty()) {
            int iMin = Math.min(list.size(), 20);
            double d = 0.0d;
            j = -9223372036854775807L;
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (i3 >= iMin) {
                    c = c2;
                    break;
                }
                long j14 = j6;
                och0 och0Var = (och0) list.get(i3);
                char c3 = c2;
                long j15 = j11;
                long j16 = och0Var.a;
                c = c3;
                int i5 = i;
                long j17 = och0Var.c;
                long j18 = j12;
                long j19 = och0Var.b;
                if (j16 > 10000000) {
                    break;
                }
                if (i3 < list.size() - i5) {
                    och0 och0Var2 = (och0) list.get(i3 + 1);
                    j3 = j13;
                    j4 = (och0Var2.b + och0Var2.c) - (j19 + j17);
                    j5 = och0Var2.a - j16;
                } else {
                    j3 = j13;
                    j4 = (j18 + j3) - (j19 + j17);
                    j5 = j15 - j16;
                }
                if (j5 > j14) {
                    double d2 = j4 / j5;
                    if (d2 > d) {
                        i4 = i3;
                        d = d2;
                    }
                }
                i3++;
                c2 = c;
                j6 = j14;
                j11 = j15;
                j12 = j18;
                j13 = j3;
                i = 1;
            }
            if (i4 != -1) {
                j2 = ((och0) list.get(i4)).a;
            }
            if (j2 != j) {
                ie30 ie30Var2 = qch0Var.e0;
                ie30Var2.getClass();
                hjj0Var = ie30Var2.m;
                eie1Var = new eie1(j2);
                if (hjj0Var == null) {
                    z = true;
                    rij0[] rij0VarArr = new rij0[1];
                    rij0VarArr[c] = eie1Var;
                    hjj0VarA = new hjj0(rij0VarArr);
                } else {
                    z = true;
                    rij0[] rij0VarArr2 = new rij0[1];
                    rij0VarArr2[c] = eie1Var;
                    hjj0VarA = hjj0Var.a(rij0VarArr2);
                }
                ge30 ge30VarA2 = qch0Var.e0.a();
                ge30VarA2.l = hjj0VarA;
                qch0Var.e0 = new ie30(ge30VarA2);
                qch0Var.Z = z;
            }
        }
        j = -9223372036854775807L;
        c = 0;
        j2 = j;
        if (j2 != j) {
            ie30 ie30Var3 = qch0Var.e0;
            ie30Var3.getClass();
            hjj0Var = ie30Var3.m;
            eie1Var = new eie1(j2);
            if (hjj0Var == null) {
                z = true;
                rij0[] rij0VarArr3 = new rij0[1];
                rij0VarArr3[c] = eie1Var;
                hjj0VarA = new hjj0(rij0VarArr3);
            } else {
                z = true;
                rij0[] rij0VarArr4 = new rij0[1];
                rij0VarArr4[c] = eie1Var;
                hjj0VarA = hjj0Var.a(rij0VarArr4);
            }
            ge30 ge30VarA3 = qch0Var.e0.a();
            ge30VarA3.l = hjj0VarA;
            qch0Var.e0 = new ie30(ge30VarA3);
            qch0Var.Z = z;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Type inference failed for: r6v64, types: [int, short] */
    public final int p(fc10 fc10Var, qch0 qch0Var, int i, boolean z) throws ParserException {
        int iE;
        int iE2;
        int i2;
        boolean z2;
        short s;
        if ("S_TEXT/UTF8".equals(qch0Var.c)) {
            q(fc10Var, q0, i);
            int i3 = this.h0;
            m();
            return i3;
        }
        if ("S_TEXT/ASS".equals(qch0Var.c) || "S_TEXT/SSA".equals(qch0Var.c)) {
            q(fc10Var, s0, i);
            int i4 = this.h0;
            m();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(qch0Var.c)) {
            q(fc10Var, t0, i);
            int i5 = this.h0;
            m();
            return i5;
        }
        if (qch0Var.X) {
            qch0Var.e0.getClass();
            ie30 ie30VarX = pxd0.X(fc10Var, i, qch0Var.e0);
            qch0Var.e0 = ie30VarX;
            qch0Var.d0.a(ie30VarX);
            qch0Var.X = false;
            k();
        }
        gtf1 gtf1Var = qch0Var.d0;
        boolean z3 = this.j0;
        izr0 izr0Var = this.m;
        int i6 = 2;
        if (!z3) {
            boolean z4 = qch0Var.j;
            izr0 izr0Var2 = this.j;
            if (z4) {
                this.c0 &= -1073741825;
                boolean z5 = this.k0;
                int i7 = SemanticState.Focused;
                if (!z5) {
                    fc10Var.readFully(izr0Var2.a, 0, 1);
                    this.g0++;
                    byte b = izr0Var2.a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.a((RuntimeException) null, "Extension bit is set in signal byte");
                    }
                    this.n0 = b;
                    this.k0 = true;
                }
                byte b2 = this.n0;
                if ((b2 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z6 = (b2 & 2) == 2;
                    this.c0 |= 1073741824;
                    if (!this.o0) {
                        izr0 izr0Var3 = this.o;
                        fc10Var.readFully(izr0Var3.a, 0, 8);
                        this.g0 += 8;
                        this.o0 = true;
                        byte[] bArr = izr0Var2.a;
                        if (!z6) {
                            i7 = 0;
                        }
                        bArr[0] = (byte) (i7 | 8);
                        izr0Var2.R(0);
                        gtf1Var.c(izr0Var2, 1, 1);
                        this.h0++;
                        izr0Var3.R(0);
                        gtf1Var.c(izr0Var3, 8, 1);
                        this.h0 += 8;
                    }
                    if (z6) {
                        if (!this.l0) {
                            fc10Var.readFully(izr0Var2.a, 0, 1);
                            this.g0++;
                            izr0Var2.R(0);
                            this.m0 = izr0Var2.E();
                            this.l0 = true;
                        }
                        int i8 = this.m0 * 4;
                        izr0Var2.O(i8);
                        fc10Var.readFully(izr0Var2.a, 0, i8);
                        this.g0 += i8;
                        short s2 = (short) ((this.m0 / 2) + 1);
                        int i9 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.r;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.r = ByteBuffer.allocate(i9);
                        }
                        this.r.position(0);
                        this.r.putShort(s2);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            s = this.m0;
                            if (i10 >= s) {
                                break;
                            }
                            int I = izr0Var2.I();
                            int i12 = i10 % 2;
                            int i13 = i6;
                            ByteBuffer byteBuffer2 = this.r;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (I - i11));
                            } else {
                                byteBuffer2.putInt(I - i11);
                            }
                            i10++;
                            i11 = I;
                            i6 = i13;
                        }
                        i2 = i6;
                        int i14 = (i - this.g0) - i11;
                        int i15 = s % 2;
                        ByteBuffer byteBuffer3 = this.r;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.r.putInt(0);
                        }
                        byte[] bArrArray = this.r.array();
                        izr0 izr0Var4 = this.f125p;
                        izr0Var4.P(bArrArray, i9);
                        gtf1Var.c(izr0Var4, i9, 1);
                        this.h0 += i9;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr2 = qch0Var.k;
                if (bArr2 != null) {
                    izr0Var.P(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(qch0Var.c)) {
                z2 = z;
            } else {
                z2 = qch0Var.h > 0;
            }
            if (z2) {
                this.c0 |= 268435456;
                this.q.O(0);
                int i16 = (izr0Var.c + i) - this.g0;
                izr0Var2.O(4);
                byte[] bArr3 = izr0Var2.a;
                bArr3[0] = (byte) ((i16 >> 24) & 255);
                bArr3[1] = (byte) ((i16 >> 16) & 255);
                bArr3[i2] = (byte) ((i16 >> 8) & 255);
                bArr3[3] = (byte) (i16 & 255);
                gtf1Var.c(izr0Var2, 4, i2);
                this.h0 += 4;
            }
            this.j0 = true;
        }
        int i17 = i + izr0Var.c;
        if (!"V_MPEG4/ISO/AVC".equals(qch0Var.c) && !"V_MPEGH/ISO/HEVC".equals(qch0Var.c)) {
            if (qch0Var.W != null) {
                dm5.y(izr0Var.c == 0);
                qch0Var.W.c(fc10Var);
            }
            while (true) {
                int i18 = this.g0;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int iA = izr0Var.a();
                if (iA > 0) {
                    iE2 = Math.min(i19, iA);
                    gtf1Var.f(iE2, izr0Var);
                } else {
                    iE2 = gtf1Var.e(fc10Var, i19, false);
                }
                this.g0 += iE2;
                this.h0 += iE2;
            }
        } else {
            izr0 izr0Var5 = this.i;
            byte[] bArr4 = izr0Var5.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i20 = qch0Var.f0;
            int i21 = 4 - i20;
            while (this.g0 < i17) {
                int i22 = this.i0;
                if (i22 == 0) {
                    int iMin = Math.min(i20, izr0Var.a());
                    fc10Var.readFully(bArr4, i21 + iMin, i20 - iMin);
                    if (iMin > 0) {
                        izr0Var.o(i21, bArr4, iMin);
                    }
                    this.g0 += i20;
                    izr0Var5.R(0);
                    this.i0 = izr0Var5.I();
                    izr0 izr0Var6 = this.h;
                    izr0Var6.R(0);
                    gtf1Var.f(4, izr0Var6);
                    this.h0 += 4;
                } else {
                    int iA2 = izr0Var.a();
                    if (iA2 > 0) {
                        iE = Math.min(i22, iA2);
                        gtf1Var.f(iE, izr0Var);
                    } else {
                        iE = gtf1Var.e(fc10Var, i22, false);
                    }
                    this.g0 += iE;
                    this.h0 += iE;
                    this.i0 -= iE;
                }
            }
        }
        if ("A_VORBIS".equals(qch0Var.c)) {
            izr0 izr0Var7 = this.k;
            izr0Var7.R(0);
            gtf1Var.f(4, izr0Var7);
            this.h0 += 4;
        }
        int i23 = this.h0;
        m();
        return i23;
    }

    public final void q(fc10 fc10Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        izr0 izr0Var = this.n;
        byte[] bArr2 = izr0Var.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            izr0Var.getClass();
            izr0Var.P(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        fc10Var.readFully(izr0Var.a, bArr.length, i);
        izr0Var.R(0);
        izr0Var.Q(length);
    }

    @Override // p.ec10
    public final void release() {
    }
}
