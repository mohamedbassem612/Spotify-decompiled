package p;

import androidx.media3.common.ParserException;
import androidx.media3.session.legacy.PlaybackStateCompat;
import app.p000rive.semantics.SemanticState;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qpm0 implements ec10 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public long E;
    public gc10 F;
    public ppm0[] G;
    public long[][] H;
    public int I;
    public final jqc1 a;
    public final int b;
    public final boolean c;
    public final izr0 d;
    public final izr0 e;
    public final izr0 f;
    public final izr0 g;
    public final ArrayDeque h;
    public final ep51 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public bg11 m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f122p;
    public int q;
    public izr0 r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public qpm0(jqc1 jqc1Var, int i) {
        this.a = jqc1Var;
        this.b = i;
        this.c = (i & SemanticState.Hidden) != 0;
        w280 w280Var = b380.b;
        this.m = bg11.e;
        this.n = (i & 4) != 0 ? 3 : 0;
        this.i = new ep51();
        this.j = new ArrayList();
        this.g = new izr0(16);
        this.h = new ArrayDeque();
        this.d = new izr0(mqn1.a);
        this.e = new izr0(6);
        this.f = new izr0();
        this.s = -1;
        this.F = gc10.G;
        this.G = new ppm0[0];
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        this.h.clear();
        this.q = 0;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.B = false;
        this.C = 0;
        this.D = 0;
        this.k.clear();
        this.l.clear();
        if (j == 0) {
            if (this.n != 3) {
                this.n = 0;
                this.q = 0;
                return;
            } else {
                ep51 ep51Var = this.i;
                ep51Var.a.clear();
                ep51Var.b = (byte) 0;
                this.j.clear();
                return;
            }
        }
        for (ppm0 ppm0Var : this.G) {
            uzf1 uzf1Var = ppm0Var.b;
            int iA = uzf1Var.a(j2);
            if (iA == -1) {
                iA = uzf1Var.b(j2);
            }
            ppm0Var.g = iA;
            bwg1 bwg1Var = ppm0Var.d;
            if (bwg1Var != null) {
                bwg1Var.b = false;
                bwg1Var.c = 0;
            }
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        if ((this.b & 16) == 0) {
            gc10Var = new wh41(gc10Var, this.a);
        }
        this.F = gc10Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:232:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:233:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:340:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:341:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01dc  */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        long j;
        boolean zEquals;
        char c;
        int i;
        int iV;
        int i2;
        long j2;
        long j3;
        long position;
        long j4;
        izr0 izr0Var;
        char c2;
        ppm0[] ppm0VarArr;
        int i3;
        rij0 rij0Var;
        boolean z;
        boolean z2;
        mpm0 mpm0Var;
        if (!this.c || !this.B) {
            while (true) {
                int i4 = this.n;
                ArrayDeque arrayDeque = this.h;
                izr0 izr0Var2 = this.f;
                int i5 = 0;
                boolean z3 = true;
                if (i4 != 0) {
                    int i6 = 4;
                    if (i4 == 1) {
                        long j5 = this.f122p - ((long) this.q);
                        long position2 = fc10Var.getPosition() + j5;
                        izr0 izr0Var3 = this.r;
                        if (izr0Var3 == null) {
                            if (!this.x && this.o == 1835295092) {
                                this.I = 1;
                            }
                            if (j5 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                                fc10Var.u((int) j5);
                            } else {
                                sfv0Var.a = fc10Var.getPosition() + j5;
                                z = true;
                            }
                            f(position2);
                            i2 = 1;
                            if (this.y) {
                                this.A = true;
                                sfv0Var.a = this.z;
                                this.y = false;
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (z2 && this.n != 2) {
                                break;
                            }
                        } else {
                            fc10Var.readFully(izr0Var3.a, this.q, (int) j5);
                            if (this.o == 1718909296) {
                                this.x = true;
                                izr0Var3.R(8);
                                int i7 = izr0Var3.q() != 1903435808 ? 0 : 1;
                                if (i7 == 0) {
                                    izr0Var3.S(4);
                                    do {
                                        if (izr0Var3.a() <= 0) {
                                            i7 = 0;
                                            break;
                                        }
                                        i7 = izr0Var3.q() != 1903435808 ? 0 : 1;
                                    } while (i7 == 0);
                                }
                                this.I = i7;
                            } else if (!arrayDeque.isEmpty()) {
                                ((mpm0) arrayDeque.peek()).f.add(new npm0(this.o, izr0Var3));
                            }
                        }
                        z = false;
                        f(position2);
                        i2 = 1;
                        if (this.y) {
                            this.A = true;
                            sfv0Var.a = this.z;
                            this.y = false;
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (z2) {
                            continue;
                        }
                    } else {
                        if (i4 == 2) {
                            long position3 = fc10Var.getPosition();
                            int i8 = this.s;
                            if (i8 == -1) {
                                long jMin = Long.MAX_VALUE;
                                boolean z4 = true;
                                boolean z5 = true;
                                int i9 = 0;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                long j6 = Long.MAX_VALUE;
                                long j7 = Long.MAX_VALUE;
                                long j8 = Long.MAX_VALUE;
                                long j9 = Long.MAX_VALUE;
                                while (true) {
                                    ppm0[] ppm0VarArr2 = this.G;
                                    j = position3;
                                    if (i9 >= ppm0VarArr2.length) {
                                        break;
                                    }
                                    ppm0 ppm0Var = ppm0VarArr2[i9];
                                    int i13 = ppm0Var.g;
                                    uzf1 uzf1Var = ppm0Var.b;
                                    boolean z6 = z4;
                                    if (i13 == uzf1Var.b) {
                                        z4 = z6;
                                    } else {
                                        int i14 = i11;
                                        int i15 = i12;
                                        long j10 = uzf1Var.f[i13];
                                        if (ppm0Var.e) {
                                            jMin = Math.min(jMin, j10);
                                        } else if (ppm0Var.f && j10 < j6) {
                                            i10 = i9;
                                            j6 = j10;
                                        }
                                        long j11 = uzf1Var.c[i13];
                                        long[][] jArr = this.H;
                                        jArr.getClass();
                                        long j12 = jArr[i9][i13];
                                        long j13 = j11 - j;
                                        boolean z7 = j13 < 0 || j13 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                        if ((z7 || !z5) && (z7 != z5 || j13 >= j9)) {
                                            i12 = i15;
                                        } else {
                                            z5 = z7;
                                            j9 = j13;
                                            j7 = j12;
                                            i12 = i9;
                                        }
                                        if (j12 < j8) {
                                            z4 = z7;
                                            i11 = i9;
                                            j8 = j12;
                                        } else {
                                            z4 = z6;
                                            i11 = i14;
                                        }
                                    }
                                    i9++;
                                    position3 = j;
                                }
                                i8 = (jMin == Long.MAX_VALUE || i10 == -1 || j6 > jMin) ? (j8 == Long.MAX_VALUE || !z4 || j7 < j8 + 10485760) ? i12 : i11 : i10;
                                this.s = i8;
                                if (i8 == -1) {
                                    return -1;
                                }
                            } else {
                                j = position3;
                            }
                            ppm0 ppm0Var2 = this.G[i8];
                            gtf1 gtf1Var = ppm0Var2.c;
                            uzf1 uzf1Var2 = ppm0Var2.b;
                            ljf1 ljf1Var = ppm0Var2.a;
                            int i16 = ppm0Var2.g;
                            long[] jArr2 = uzf1Var2.c;
                            int[] iArr = uzf1Var2.d;
                            long j14 = jArr2[i16] + this.E;
                            int i17 = iArr[i16];
                            bwg1 bwg1Var = ppm0Var2.d;
                            long j15 = (j14 - j) + ((long) this.t);
                            if (j15 < 0 || j15 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                                sfv0Var.a = j14;
                                return 1;
                            }
                            boolean z8 = ljf1Var.h;
                            int i18 = ljf1Var.k;
                            ie30 ie30Var = ljf1Var.g;
                            if (z8) {
                                j15 += 8;
                                i17 -= 8;
                            }
                            fc10Var.u((int) j15);
                            String str = ie30Var.f66p;
                            String str2 = ie30Var.f66p;
                            boolean zEquals2 = Objects.equals(str, "video/avc");
                            int i19 = this.b;
                            if (zEquals2) {
                                if ((i19 & 32) != 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (!Objects.equals(str, "video/hevc")) {
                                zEquals = Objects.equals(str, "video/apv");
                            } else if ((i19 & SemanticState.Focused) != 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                c = 1;
                            } else {
                                c = 1;
                                this.w = true;
                            }
                            if (i18 == 0) {
                                ie30 ie30Var2 = ppm0Var2.h;
                                if ("audio/ac4".equals(str2)) {
                                    if (this.u == 0) {
                                        j82.F(i17, izr0Var2);
                                        gtf1Var.f(7, izr0Var2);
                                        this.u += 7;
                                    }
                                    i17 += 7;
                                } else if (ie30Var2 != null && Objects.equals(str2, "audio/mpeg")) {
                                    izr0Var2.O(4);
                                    fc10Var.h(0, izr0Var2.a, 4);
                                    fc10Var.f();
                                    xpm0 xpm0Var = new xpm0();
                                    if (xpm0Var.a(izr0Var2.q()) && !Objects.equals(ie30Var2.f66p, xpm0Var.b)) {
                                        ge30 ge30VarA = ie30Var2.a();
                                        String str3 = xpm0Var.b;
                                        str3.getClass();
                                        ge30VarA.o = asj0.p(str3);
                                        ie30Var2 = new ie30(ge30VarA);
                                    }
                                    gtf1Var.a(ie30Var2);
                                    ppm0Var2.h = null;
                                } else if (ie30Var2 != null && pxd0.H(str2)) {
                                    gtf1Var.a(pxd0.X(fc10Var, i17, ie30Var2));
                                    ppm0Var2.h = null;
                                } else if (bwg1Var != null) {
                                    bwg1Var.c(fc10Var);
                                }
                                while (true) {
                                    int i20 = this.u;
                                    if (i20 >= i17) {
                                        break;
                                    }
                                    int iE = gtf1Var.e(fc10Var, i17 - i20, false);
                                    this.t += iE;
                                    this.u += iE;
                                    this.v -= iE;
                                }
                            } else {
                                izr0 izr0Var4 = this.e;
                                byte[] bArr = izr0Var4.a;
                                bArr[0] = 0;
                                bArr[c] = 0;
                                bArr[2] = 0;
                                int i21 = 4 - i18;
                                i17 += i21;
                                while (this.u < i17) {
                                    int i22 = this.v;
                                    if (i22 == 0) {
                                        if (this.w || mqn1.v(ie30Var) + i18 > iArr[i16] - this.t) {
                                            i = i18;
                                            iV = 0;
                                        } else {
                                            iV = mqn1.v(ie30Var);
                                            i = i18 + iV;
                                        }
                                        fc10Var.readFully(bArr, i21, i);
                                        this.t += i;
                                        izr0Var4.R(0);
                                        int iQ = izr0Var4.q();
                                        if (iQ < 0) {
                                            throw ParserException.a((RuntimeException) null, "Invalid NAL length");
                                        }
                                        this.v = iQ - iV;
                                        izr0 izr0Var5 = this.d;
                                        izr0Var5.R(0);
                                        gtf1Var.f(4, izr0Var5);
                                        this.u += 4;
                                        if (iV > 0) {
                                            gtf1Var.f(iV, izr0Var4);
                                            this.u += iV;
                                            if (mqn1.u(iV, ie30Var, bArr)) {
                                                this.w = true;
                                            }
                                        }
                                    } else {
                                        int iE2 = gtf1Var.e(fc10Var, i22, false);
                                        this.t += iE2;
                                        this.u += iE2;
                                        this.v -= iE2;
                                    }
                                }
                            }
                            int i23 = i17;
                            long j16 = uzf1Var2.f[i16];
                            int i24 = uzf1Var2.g[i16];
                            if (!this.w) {
                                i24 |= 67108864;
                            }
                            int i25 = i24;
                            if (bwg1Var != null) {
                                bwg1Var.b(gtf1Var, j16, i25, i23, 0, null);
                                if (i16 + 1 == uzf1Var2.b) {
                                    bwg1Var.a(gtf1Var, null);
                                }
                            } else {
                                gtf1Var.b(j16, i25, i23, 0, null);
                            }
                            ppm0Var2.g++;
                            this.s = -1;
                            this.t = 0;
                            this.u = 0;
                            this.v = 0;
                            this.w = false;
                            return 0;
                        }
                        if (i4 != 3) {
                            if (i4 != 4) {
                                bhn0.w();
                                return 0;
                            }
                            int i26 = this.C;
                            ArrayList arrayList = this.k;
                            uzf1 uzf1Var3 = (uzf1) arrayList.get(i26);
                            int i27 = this.D;
                            int i28 = uzf1Var3.b;
                            long[] jArr3 = uzf1Var3.f;
                            ArrayList arrayList2 = this.l;
                            if (i27 < i28) {
                                long j17 = uzf1Var3.c[i27];
                                if (fc10Var.getPosition() != j17) {
                                    sfv0Var.a = j17;
                                    return 1;
                                }
                                int i29 = uzf1Var3.d[this.D];
                                izr0Var2.O(i29);
                                fc10Var.readFully(izr0Var2.a, 0, i29);
                                String strC = izr0Var2.C(Math.min(izr0Var2.L(), izr0Var2.a()), StandardCharsets.UTF_8);
                                long jN0 = zoi1.n0(jArr3[this.D]);
                                int i30 = this.D + 1;
                                arrayList2.add(new jhe(jN0, i30 < uzf1Var3.b ? zoi1.n0(jArr3[i30]) : zoi1.n0(uzf1Var3.i), false, new u9b0(null, strC)));
                                this.D++;
                                return 0;
                            }
                            ppm0[] ppm0VarArr3 = this.G;
                            int length = ppm0VarArr3.length;
                            int i31 = 0;
                            while (i31 < length) {
                                ppm0 ppm0Var3 = ppm0VarArr3[i31];
                                if (ppm0Var3.a.l == uzf1Var3.a.a) {
                                    ie30 ie30Var3 = ppm0Var3.h;
                                    ie30Var3.getClass();
                                    hjj0 hjj0Var = ie30Var3.m;
                                    ArrayList arrayList3 = new ArrayList();
                                    if (hjj0Var != null) {
                                        v280 v280VarM = b380.m();
                                        rij0[] rij0VarArr = hjj0Var.a;
                                        int length2 = rij0VarArr.length;
                                        while (i5 < length2) {
                                            rij0 rij0Var2 = rij0VarArr[i5];
                                            ppm0[] ppm0VarArr4 = ppm0VarArr3;
                                            int i32 = length;
                                            if (rij0.class.isAssignableFrom(rij0Var2.getClass())) {
                                                rij0Var = (rij0) rij0.class.cast(rij0Var2);
                                                if (rij0Var instanceof ehe) {
                                                    rij0Var = null;
                                                }
                                            } else {
                                                rij0Var = null;
                                            }
                                            if (rij0Var != null) {
                                                v280VarM.c(rij0Var);
                                            }
                                            i5++;
                                            ppm0VarArr3 = ppm0VarArr4;
                                            length = i32;
                                        }
                                        ppm0VarArr = ppm0VarArr3;
                                        i3 = length;
                                        arrayList3.addAll(v280VarM.g());
                                    } else {
                                        ppm0VarArr = ppm0VarArr3;
                                        i3 = length;
                                    }
                                    arrayList3.addAll(arrayList2);
                                    ge30 ge30VarA2 = ie30Var3.a();
                                    ge30VarA2.l = new hjj0(arrayList3);
                                    ie30 ie30Var4 = new ie30(ge30VarA2);
                                    String str4 = ie30Var4.f66p;
                                    if (Objects.equals(str4, "audio/mpeg") || pxd0.H(str4)) {
                                        ppm0Var3.h = ie30Var4;
                                    } else {
                                        ppm0Var3.c.a(ie30Var4);
                                        ppm0Var3.h = null;
                                    }
                                } else {
                                    ppm0VarArr = ppm0VarArr3;
                                    i3 = length;
                                    z3 = z3;
                                }
                                i31++;
                                ppm0VarArr3 = ppm0VarArr;
                                length = i3;
                                z3 = z3;
                                i5 = 0;
                            }
                            this.C++;
                            this.D = 0;
                            arrayList2.clear();
                            if (this.C == arrayList.size()) {
                                this.n = 2;
                            }
                            return 0;
                        }
                        ep51 ep51Var = this.i;
                        ArrayList arrayList4 = ep51Var.a;
                        byte b = ep51Var.b;
                        if (b != 0) {
                            if (b != 1) {
                                short s = 2817;
                                short s2 = 2820;
                                if (b == 2) {
                                    long length3 = fc10Var.getLength();
                                    int i33 = ep51Var.c - 20;
                                    izr0 izr0Var6 = new izr0(i33);
                                    fc10Var.readFully(izr0Var6.a, 0, i33);
                                    int i34 = 0;
                                    while (i34 < i33 / 12) {
                                        izr0Var6.S(2);
                                        short sU = izr0Var6.u();
                                        if (sU == 2192 || sU == 2816 || sU == s || sU == 2819 || sU == s2) {
                                            izr0Var = izr0Var6;
                                            arrayList4.add(new dp51((length3 - ((long) ep51Var.c)) - ((long) izr0Var6.s()), izr0Var.s()));
                                        } else {
                                            izr0Var6.S(8);
                                            izr0Var = izr0Var6;
                                        }
                                        i34++;
                                        izr0Var6 = izr0Var;
                                        s = 2817;
                                        s2 = 2820;
                                    }
                                    if (arrayList4.isEmpty()) {
                                        sfv0Var.a = 0L;
                                        j4 = 0;
                                    } else {
                                        ep51Var.b = (byte) 3;
                                        j4 = ((dp51) arrayList4.get(0)).a;
                                        sfv0Var.a = j4;
                                    }
                                    j2 = j4;
                                } else {
                                    if (b != 3) {
                                        bhn0.w();
                                        return 0;
                                    }
                                    long position4 = fc10Var.getPosition();
                                    int length4 = (int) ((fc10Var.getLength() - fc10Var.getPosition()) - ((long) ep51Var.c));
                                    izr0 izr0Var7 = new izr0(length4);
                                    fc10Var.readFully(izr0Var7.a, 0, length4);
                                    int i35 = 0;
                                    while (i35 < arrayList4.size()) {
                                        dp51 dp51Var = (dp51) arrayList4.get(i35);
                                        izr0Var7.R((int) (dp51Var.a - position4));
                                        izr0Var7.S(i6);
                                        int iS = izr0Var7.s();
                                        Charset charset = StandardCharsets.UTF_8;
                                        switch (izr0Var7.C(iS, charset)) {
                                            case "SlowMotion_Data":
                                                c2 = 2192;
                                                break;
                                            case "Super_SlowMotion_Edit_Data":
                                                c2 = 2819;
                                                break;
                                            case "Super_SlowMotion_Data":
                                                c2 = 2816;
                                                break;
                                            case "Super_SlowMotion_Deflickering_On":
                                                c2 = 2820;
                                                break;
                                            case "Super_SlowMotion_BGM":
                                                c2 = 2817;
                                                break;
                                            default:
                                                throw ParserException.a((RuntimeException) null, "Invalid SEF name");
                                        }
                                        int i36 = dp51Var.b - (iS + 8);
                                        if (c2 == 2192) {
                                            ArrayList arrayList5 = new ArrayList();
                                            List listC = ep51.e.c(izr0Var7.C(i36, charset));
                                            for (int i37 = 0; i37 < listC.size(); i37++) {
                                                List listC2 = ep51.d.c((CharSequence) listC.get(i37));
                                                if (listC2.size() != 3) {
                                                    throw ParserException.a((RuntimeException) null, (String) null);
                                                }
                                                try {
                                                    arrayList5.add(new rf91(1 << (Integer.parseInt((String) listC2.get(2)) - 1), Long.parseLong((String) listC2.get(0)), Long.parseLong((String) listC2.get(1))));
                                                } catch (NumberFormatException e) {
                                                    throw ParserException.a(e, (String) null);
                                                }
                                            }
                                            this.j.add(new sf91(arrayList5));
                                        } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                            bhn0.w();
                                            return 0;
                                        }
                                        i35++;
                                        i6 = 4;
                                    }
                                    sfv0Var.a = 0L;
                                    j3 = 0;
                                    i2 = 1;
                                    j2 = 0;
                                }
                            } else {
                                izr0 izr0Var8 = new izr0(8);
                                fc10Var.readFully(izr0Var8.a, 0, 8);
                                ep51Var.c = izr0Var8.s() + 8;
                                if (izr0Var8.q() != 1397048916) {
                                    sfv0Var.a = 0L;
                                    position = 0;
                                } else {
                                    position = fc10Var.getPosition() - ((long) (ep51Var.c - 12));
                                    sfv0Var.a = position;
                                    ep51Var.b = (byte) 2;
                                }
                                j2 = position;
                            }
                            j3 = 0;
                            i2 = 1;
                        } else {
                            long length5 = fc10Var.getLength();
                            long j18 = (length5 == -1 || length5 < 8) ? 0L : length5 - 8;
                            sfv0Var.a = j18;
                            i2 = 1;
                            ep51Var.b = (byte) 1;
                            j2 = j18;
                            j3 = 0;
                        }
                        if (j2 == j3) {
                            this.n = 0;
                            this.q = 0;
                            return i2;
                        }
                    }
                } else {
                    int i38 = this.q;
                    izr0 izr0Var9 = this.g;
                    if (i38 == 0) {
                        if (fc10Var.g(izr0Var9.a, 0, 8, true)) {
                            this.q = 8;
                            izr0Var9.R(0);
                            this.f122p = izr0Var9.G();
                            this.o = izr0Var9.q();
                        }
                    }
                    long j19 = this.f122p;
                    if (j19 == 1) {
                        fc10Var.readFully(izr0Var9.a, 8, 8);
                        this.q += 8;
                        this.f122p = izr0Var9.K();
                    } else if (j19 == 0) {
                        long length6 = fc10Var.getLength();
                        if (length6 == -1 && (mpm0Var = (mpm0) arrayDeque.peek()) != null) {
                            length6 = mpm0Var.e;
                        }
                        if (length6 != -1) {
                            this.f122p = (length6 - fc10Var.getPosition()) + ((long) this.q);
                        }
                    }
                    long j20 = this.f122p;
                    int i39 = this.q;
                    long j21 = i39;
                    if (j20 < j21) {
                        if (this.o != 1718773093 || i39 != 8) {
                            throw ParserException.d("Atom size less than header length (unsupported).");
                        }
                        this.f122p = j21;
                    }
                    int i40 = this.o;
                    if (i40 == 1836019574 || i40 == 1953653099 || i40 == 1835297121 || i40 == 1835626086 || i40 == 1937007212 || i40 == 1701082227 || i40 == 1835365473 || i40 == 1635284069 || i40 == 1953654118) {
                        long position5 = fc10Var.getPosition();
                        long j22 = this.f122p;
                        long j23 = this.q;
                        long j24 = (position5 + j22) - j23;
                        if (j22 != j23 && this.o == 1835365473) {
                            izr0Var2.O(8);
                            fc10Var.h(0, izr0Var2.a, 8);
                            e2c.a(izr0Var2);
                            fc10Var.u(izr0Var2.b);
                            fc10Var.f();
                        }
                        arrayDeque.push(new mpm0(this.o, j24));
                        if (this.f122p == this.q) {
                            f(j24);
                        } else {
                            this.n = 0;
                            this.q = 0;
                        }
                    } else if (i40 == 1835296868 || i40 == 1836476516 || i40 == 1751411826 || i40 == 1937011556 || i40 == 1937011827 || i40 == 1937011571 || i40 == 1668576371 || i40 == 1701606260 || i40 == 1937011555 || i40 == 1937011578 || i40 == 1937013298 || i40 == 1937007471 || i40 == 1668232756 || i40 == 1953196132 || i40 == 1718909296 || i40 == 1969517665 || i40 == 1801812339 || i40 == 1768715124 || i40 == 1667785072) {
                        dm5.y(i39 == 8);
                        dm5.y(this.f122p <= 2147483647L);
                        izr0 izr0Var10 = new izr0((int) this.f122p);
                        System.arraycopy(izr0Var9.a, 0, izr0Var10.a, 0, 8);
                        this.r = izr0Var10;
                        this.n = 1;
                    } else {
                        this.r = null;
                        this.n = 1;
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        bg11 bg11VarT;
        iw91 iw91VarJ = zho1.J(fc10Var, false);
        if (iw91VarJ != null) {
            bg11VarT = b380.t(iw91VarJ);
        } else {
            w280 w280Var = b380.b;
            bg11VarT = bg11.e;
        }
        this.m = bg11VarT;
        return iw91VarJ == null;
    }

    @Override // p.ec10
    public final List e() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x0370  */
    /* JADX WARN: Code duplicated, block: B:186:0x0380  */
    /* JADX WARN: Code duplicated, block: B:195:0x039b  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:204:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:214:0x03ed A[EDGE_INSN: B:214:0x03ed->B:215:0x03ef BREAK  A[LOOP:8: B:209:0x03d9->B:315:?]] */
    /* JADX WARN: Code duplicated, block: B:217:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[LOOP:1: B:14:0x004d->B:24:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:285:0x007d A[EDGE_INSN: B:285:0x007d->B:26:0x007d BREAK  A[LOOP:1: B:14:0x004d->B:24:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(long j) {
        int i;
        ArrayList arrayList;
        hjj0 hjj0VarF;
        ArrayList arrayList2;
        boolean z;
        hjj0 hjj0VarK;
        long[][] jArr;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        ppm0 ppm0Var;
        long j2;
        int i3;
        hjj0 hjj0Var;
        ArrayList arrayList5;
        hjj0 hjj0Var2;
        hjj0 hjj0Var3;
        hjj0 hjj0Var4;
        hjj0 hjj0Var5;
        ie30 ie30Var;
        int i4;
        int i5;
        ppm0 ppm0Var2;
        int size;
        ArrayList arrayList6;
        int i6;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList7;
        rij0 rij0Var;
        rij0 rij0Var2;
        rij0 rij0Var3;
        int i10;
        while (true) {
            ArrayDeque arrayDeque = this.h;
            if (arrayDeque.isEmpty() || ((mpm0) arrayDeque.peek()).e != j) {
                break;
            }
            mpm0 mpm0Var = (mpm0) arrayDeque.pop();
            if (mpm0Var.b == 1836019574) {
                mpm0 mpm0VarM = mpm0Var.m(1835365473);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = this.k;
                boolean z2 = this.c;
                long j3 = 0;
                int i11 = this.b;
                if (mpm0VarM != null) {
                    hjj0VarF = e2c.f(mpm0VarM);
                    if (this.A) {
                        hjj0VarF.getClass();
                        rij0[] rij0VarArr = hjj0VarF.a;
                        int length = rij0VarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                i = 0;
                                rij0Var2 = null;
                                break;
                            }
                            rij0 rij0Var4 = rij0VarArr[i12];
                            if (yeh0.class.isAssignableFrom(rij0Var4.getClass())) {
                                rij0Var2 = (rij0) yeh0.class.cast(rij0Var4);
                                i = 0;
                                if (!((yeh0) rij0Var2).a.equals("auxiliary.tracks.interleaved")) {
                                }
                                if (rij0Var2 != null) {
                                    break;
                                } else {
                                    i12++;
                                }
                            } else {
                                i = 0;
                            }
                            rij0Var2 = null;
                            if (rij0Var2 != null) {
                                break;
                                break;
                            }
                            i12++;
                        }
                        yeh0 yeh0Var = (yeh0) rij0Var2;
                        if (yeh0Var != null && yeh0Var.b[i] == 0) {
                            this.E = this.z + 16;
                        }
                        int length2 = rij0VarArr.length;
                        int i13 = i;
                        while (true) {
                            if (i13 >= length2) {
                                rij0Var3 = null;
                                break;
                            }
                            rij0 rij0Var5 = rij0VarArr[i13];
                            if (yeh0.class.isAssignableFrom(rij0Var5.getClass())) {
                                rij0Var3 = (rij0) yeh0.class.cast(rij0Var5);
                                if (!((yeh0) rij0Var3).a.equals("auxiliary.tracks.map")) {
                                    rij0Var3 = null;
                                }
                            } else {
                                rij0Var3 = null;
                            }
                            if (rij0Var3 != null) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        yeh0 yeh0Var2 = (yeh0) rij0Var3;
                        yeh0Var2.getClass();
                        ArrayList arrayListD = yeh0Var2.d();
                        arrayList8 = new ArrayList(arrayListD.size());
                        for (int i14 = i; i14 < arrayListD.size(); i14++) {
                            int iIntValue = ((Integer) arrayListD.get(i14)).intValue();
                            if (iIntValue == 0) {
                                i10 = 1;
                            } else if (iIntValue != 1) {
                                i10 = 3;
                                if (iIntValue != 2) {
                                    i10 = iIntValue != 3 ? i : 4;
                                }
                            } else {
                                i10 = 2;
                            }
                            arrayList8.add(Integer.valueOf(i10));
                        }
                    } else {
                        i = 0;
                        if (hjj0VarF != null && (i11 & 64) != 0) {
                            rij0[] rij0VarArr2 = hjj0VarF.a;
                            int length3 = rij0VarArr2.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length3) {
                                    rij0Var = null;
                                    break;
                                }
                                rij0 rij0Var6 = rij0VarArr2[i15];
                                if (yeh0.class.isAssignableFrom(rij0Var6.getClass())) {
                                    rij0Var = (rij0) yeh0.class.cast(rij0Var6);
                                    if (!((yeh0) rij0Var).a.equals("auxiliary.tracks.offset")) {
                                        rij0Var = null;
                                    }
                                } else {
                                    rij0Var = null;
                                }
                                if (rij0Var != null) {
                                    break;
                                } else {
                                    i15++;
                                }
                            }
                            yeh0 yeh0Var3 = (yeh0) rij0Var;
                            if (yeh0Var3 != null) {
                                long jK = new izr0(yeh0Var3.b).K();
                                if (jK > 0) {
                                    this.z = jK;
                                    this.y = true;
                                    arrayList2 = arrayList9;
                                    z = z2;
                                }
                                arrayDeque.clear();
                                this.B = true;
                                if (this.y && !z) {
                                    this.n = !arrayList2.isEmpty() ? 4 : 2;
                                }
                            }
                        }
                    }
                    arrayList = arrayList8;
                } else {
                    i = 0;
                    arrayList = arrayList8;
                    hjj0VarF = null;
                }
                ArrayList arrayList10 = new ArrayList();
                boolean z3 = this.I == 1 ? 1 : i;
                e440 e440Var = new e440();
                npm0 npm0VarN = mpm0Var.n(1969517665);
                if (npm0VarN != null) {
                    hjj0VarK = e2c.k(npm0VarN, (i11 & 512) != 0 ? 1 : i);
                    e440Var.b(hjj0VarK);
                } else {
                    hjj0VarK = null;
                }
                npm0 npm0VarN2 = mpm0Var.n(1836476516);
                npm0VarN2.getClass();
                rij0[] rij0VarArr3 = new rij0[1];
                rij0VarArr3[i] = e2c.g(npm0VarN2.e);
                hjj0 hjj0Var6 = new hjj0(rij0VarArr3);
                ArrayList arrayList11 = arrayList9;
                z = z2;
                ArrayList<uzf1> arrayListJ = e2c.j(mpm0Var, e440Var, -9223372036854775807L, null, (i11 & 1) != 0 ? 1 : i, z3, new cwa((byte) 21), this.c);
                if (this.A) {
                    boolean z4 = arrayList.size() == arrayListJ.size() ? 1 : i;
                    Locale locale = Locale.US;
                    dm5.z(z4, l1d.j(arrayList.size(), arrayListJ.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")"));
                }
                ArrayList arrayList12 = new ArrayList();
                for (uzf1 uzf1Var : arrayListJ) {
                    int i16 = uzf1Var.a.l;
                    if (i16 != -1 && !arrayList12.contains(Integer.valueOf(i16))) {
                        arrayList12.add(Integer.valueOf(uzf1Var.a.l));
                    }
                }
                arrayList11.clear();
                for (uzf1 uzf1Var2 : arrayListJ) {
                    if (arrayList12.contains(Integer.valueOf(uzf1Var2.a.a))) {
                        arrayList7 = arrayList11;
                        arrayList7.add(uzf1Var2);
                    } else {
                        arrayList7 = arrayList11;
                    }
                    arrayList11 = arrayList7;
                }
                ArrayList arrayList13 = arrayList11;
                String strN = u0p1.n(arrayListJ);
                int i17 = -1;
                int i18 = i;
                int i19 = i18;
                long j4 = -9223372036854775807L;
                while (i18 < arrayListJ.size()) {
                    uzf1 uzf1Var3 = (uzf1) arrayListJ.get(i18);
                    ArrayList arrayList14 = arrayListJ;
                    int i20 = uzf1Var3.b;
                    long[] jArr2 = uzf1Var3.f;
                    String str = strN;
                    ljf1 ljf1Var = uzf1Var3.a;
                    if (i20 == 0) {
                        arrayList4 = arrayList10;
                        arrayList3 = arrayList13;
                    } else {
                        arrayList3 = arrayList13;
                        boolean z5 = ljf1Var.m;
                        ie30 ie30Var2 = ljf1Var.g;
                        arrayList4 = arrayList10;
                        int i21 = ljf1Var.l;
                        int i22 = ljf1Var.b;
                        if (z5) {
                            hjj0 hjj0Var7 = hjj0VarF;
                            hjj0 hjj0Var8 = hjj0VarK;
                            int i23 = i19 + 1;
                            gtf1 gtf1VarW = this.F.w(i19, i22);
                            ppm0 ppm0Var3 = new ppm0(ljf1Var, uzf1Var3, gtf1VarW);
                            hjj0 hjj0Var9 = hjj0Var6;
                            long j5 = ljf1Var.e;
                            if (j5 == -9223372036854775807L) {
                                j5 = uzf1Var3.i;
                            }
                            gtf1VarW.g(j5);
                            long jMax = Math.max(j4, j5);
                            String str2 = ie30Var2.f66p;
                            boolean zEquals = "audio/true-hd".equals(str2);
                            int i24 = uzf1Var3.e;
                            int i25 = zEquals ? i24 * 16 : i24 + 30;
                            ge30 ge30VarA = ie30Var2.a();
                            ge30VarA.f52p = i25;
                            if (i22 == 2) {
                                int i26 = ie30Var2.f;
                                if ((i11 & 8) != 0) {
                                    i26 |= i17 == -1 ? 1 : 2;
                                }
                                if (this.A) {
                                    i26 |= 32768;
                                    ge30VarA.h = ((Integer) arrayList.get(i18)).intValue();
                                }
                                ge30VarA.f = i26;
                            }
                            int[] iArr = uzf1Var3.h;
                            boolean z6 = uzf1Var3.j;
                            if (!asj0.o(ie30Var2.f66p) || jArr2.length <= 0) {
                                i2 = i17;
                                ppm0Var = ppm0Var3;
                            } else {
                                int iMin = Math.min(z6 ? uzf1Var3.b : iArr.length, 20);
                                dm5.y(j5 != -9223372036854775807L ? 1 : i);
                                i2 = i17;
                                ppm0Var = ppm0Var3;
                                long jMin = Math.min(j5, 10000000L);
                                int i27 = i;
                                int i28 = i27;
                                int i29 = -1;
                                while (i27 < iMin) {
                                    int i30 = z6 ? i27 : iArr[i27];
                                    long j6 = jArr2[i30];
                                    if (j6 > jMin) {
                                        break;
                                    }
                                    if (j6 >= 0 && (i9 = uzf1Var3.d[(i8 = i30)]) > i28) {
                                        i28 = i9;
                                        i29 = i8;
                                    }
                                    i27++;
                                }
                                if (i29 != -1) {
                                    j2 = jArr2[i29];
                                }
                                if (j2 != -9223372036854775807L) {
                                    eie1 eie1Var = new eie1(j2);
                                    i3 = 1;
                                    rij0[] rij0VarArr4 = new rij0[1];
                                    rij0VarArr4[i] = eie1Var;
                                    hjj0Var = new hjj0(rij0VarArr4);
                                } else {
                                    i3 = 1;
                                    hjj0Var = null;
                                }
                                if (i22 == i3 && (i6 = e440Var.a) != -1 && (i7 = e440Var.b) != -1) {
                                    ge30VarA.M = i6;
                                    ge30VarA.N = i7;
                                }
                                hjj0 hjj0Var10 = ie30Var2.m;
                                arrayList5 = this.j;
                                if (arrayList5.isEmpty()) {
                                    hjj0Var2 = null;
                                } else {
                                    hjj0Var2 = new hjj0(arrayList5);
                                }
                                hjj0Var3 = hjj0Var8;
                                hjj0Var4 = hjj0Var9;
                                hjj0[] hjj0VarArr = {hjj0Var2, hjj0Var3, hjj0Var4, hjj0Var};
                                hjj0Var5 = hjj0Var7;
                                zzo1.s(i22, hjj0Var5, ge30VarA, hjj0Var10, hjj0VarArr);
                                ge30VarA.n = asj0.p(str);
                                ie30Var = new ie30(ge30VarA);
                                if (!Objects.equals(str2, "audio/mpeg") || pxd0.H(str2)) {
                                    i4 = 1;
                                } else {
                                    i4 = i;
                                }
                                if (z && i21 != -1) {
                                    Iterator it = arrayList3.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((uzf1) it.next()).a.a == i21) {
                                                i5 = 1;
                                                break;
                                            }
                                        } else {
                                            i5 = i;
                                            break;
                                        }
                                    }
                                } else {
                                    i5 = i;
                                    break;
                                }
                                if (i4 == 0 || i5 != 0) {
                                    ppm0Var2 = ppm0Var;
                                    ppm0Var2.h = ie30Var;
                                } else {
                                    ppm0Var2 = ppm0Var;
                                    ppm0Var2.c.a(ie30Var);
                                }
                                size = (i22 == 2 || i2 != -1) ? i2 : arrayList4.size();
                                arrayList6 = arrayList4;
                                arrayList6.add(ppm0Var2);
                                i19 = i23;
                                j4 = jMax;
                            }
                            j2 = -9223372036854775807L;
                            if (j2 != -9223372036854775807L) {
                                eie1 eie1Var2 = new eie1(j2);
                                i3 = 1;
                                rij0[] rij0VarArr5 = new rij0[1];
                                rij0VarArr5[i] = eie1Var2;
                                hjj0Var = new hjj0(rij0VarArr5);
                            } else {
                                i3 = 1;
                                hjj0Var = null;
                            }
                            if (i22 == i3) {
                                ge30VarA.M = i6;
                                ge30VarA.N = i7;
                            }
                            hjj0 hjj0Var11 = ie30Var2.m;
                            arrayList5 = this.j;
                            if (arrayList5.isEmpty()) {
                                hjj0Var2 = null;
                            } else {
                                hjj0Var2 = new hjj0(arrayList5);
                            }
                            hjj0Var3 = hjj0Var8;
                            hjj0Var4 = hjj0Var9;
                            hjj0[] hjj0VarArr2 = {hjj0Var2, hjj0Var3, hjj0Var4, hjj0Var};
                            hjj0Var5 = hjj0Var7;
                            zzo1.s(i22, hjj0Var5, ge30VarA, hjj0Var11, hjj0VarArr2);
                            ge30VarA.n = asj0.p(str);
                            ie30Var = new ie30(ge30VarA);
                            if (Objects.equals(str2, "audio/mpeg")) {
                                i4 = 1;
                            } else {
                                i4 = 1;
                            }
                            if (z) {
                                i5 = i;
                                break;
                            } else {
                                i5 = i;
                                break;
                            }
                            if (i4 == 0) {
                                ppm0Var2 = ppm0Var;
                                ppm0Var2.h = ie30Var;
                            } else {
                                ppm0Var2 = ppm0Var;
                                ppm0Var2.h = ie30Var;
                            }
                            if (i22 == 2) {
                            }
                            arrayList6 = arrayList4;
                            arrayList6.add(ppm0Var2);
                            i19 = i23;
                            j4 = jMax;
                        }
                        i18++;
                        i17 = size;
                        arrayList10 = arrayList6;
                        hjj0Var6 = hjj0Var4;
                        arrayListJ = arrayList14;
                        arrayList13 = arrayList3;
                        arrayList = arrayList;
                        hjj0VarK = hjj0Var3;
                        hjj0VarF = hjj0Var5;
                        strN = str;
                    }
                    size = i17;
                    hjj0Var5 = hjj0VarF;
                    hjj0Var3 = hjj0VarK;
                    hjj0Var4 = hjj0Var6;
                    arrayList6 = arrayList4;
                    i18++;
                    i17 = size;
                    arrayList10 = arrayList6;
                    hjj0Var6 = hjj0Var4;
                    arrayListJ = arrayList14;
                    arrayList13 = arrayList3;
                    arrayList = arrayList;
                    hjj0VarK = hjj0Var3;
                    hjj0VarF = hjj0Var5;
                    strN = str;
                }
                int i31 = i17;
                arrayList2 = arrayList13;
                int i32 = -1;
                ppm0[] ppm0VarArr = (ppm0[]) arrayList10.toArray(new ppm0[i]);
                this.G = ppm0VarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[ppm0VarArr.length][];
                    int[] iArr2 = new int[ppm0VarArr.length];
                    long[] jArr3 = new long[ppm0VarArr.length];
                    boolean[] zArr = new boolean[ppm0VarArr.length];
                    for (int i33 = 0; i33 < ppm0VarArr.length; i33++) {
                        jArr[i33] = new long[ppm0VarArr[i33].b.b];
                        jArr3[i33] = ppm0VarArr[i33].b.f[0];
                    }
                    int i34 = 0;
                    while (i34 < ppm0VarArr.length) {
                        long j7 = Long.MAX_VALUE;
                        int i35 = i32;
                        for (int i36 = 0; i36 < ppm0VarArr.length; i36++) {
                            if (!zArr[i36]) {
                                long j8 = jArr3[i36];
                                if (j8 <= j7) {
                                    i35 = i36;
                                    j7 = j8;
                                }
                            }
                        }
                        int i37 = iArr2[i35];
                        long[] jArr4 = jArr[i35];
                        jArr4[i37] = j3;
                        uzf1 uzf1Var4 = ppm0VarArr[i35].b;
                        ppm0[] ppm0VarArr2 = ppm0VarArr;
                        j3 += (long) uzf1Var4.d[i37];
                        int i38 = i37 + 1;
                        iArr2[i35] = i38;
                        if (i38 < jArr4.length) {
                            jArr3[i35] = uzf1Var4.f[i38];
                        } else {
                            zArr[i35] = true;
                            i34++;
                        }
                        ppm0VarArr = ppm0VarArr2;
                        i32 = -1;
                    }
                }
                this.H = jArr;
                this.F.s();
                this.F.c(new opm0(j4, this.G, i31));
                arrayDeque.clear();
                this.B = true;
                if (this.y) {
                }
            } else if (!arrayDeque.isEmpty()) {
                ((mpm0) arrayDeque.peek()).g.add(mpm0Var);
            }
        }
        int i39 = this.n;
        if (i39 == 4 || i39 == 2) {
            return;
        }
        this.n = 0;
        this.q = 0;
    }

    @Override // p.ec10
    public final void release() {
    }
}
