package p;

import androidx.media3.common.ParserException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uw20 implements ec10 {
    public final izr0 a = new izr0(4);
    public final izr0 b = new izr0(9);
    public final izr0 c = new izr0(11);
    public final izr0 d = new izr0();
    public final mq41 e;
    public gc10 f;
    public byte g;
    public boolean h;
    public long i;
    public int j;
    public short k;
    public int l;
    public long m;
    public boolean n;
    public h58 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d3k1 f156p;

    public uw20() {
        mq41 mq41Var = new mq41(new x6u(), (byte) 17);
        mq41Var.c = -9223372036854775807L;
        mq41Var.d = new long[0];
        mq41Var.e = new long[0];
        this.e = mq41Var;
        this.g = (byte) 1;
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        if (j == 0) {
            this.g = (byte) 1;
            this.h = false;
        } else {
            this.g = (byte) 3;
        }
        this.j = 0;
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.f = gc10Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:101:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:184:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x029d  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b2  */
    /* JADX WARN: Type inference failed for: r3v45, types: [int, short] */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        long j;
        long j2;
        short s;
        boolean z;
        boolean z2;
        long j3;
        byte b;
        this.f.getClass();
        while (true) {
            byte b2 = this.g;
            boolean z3 = true;
            if (b2 == 1) {
                izr0 izr0Var = this.b;
                if (!fc10Var.g(izr0Var.a, 0, 9, true)) {
                    return -1;
                }
                izr0Var.R(0);
                izr0Var.S(4);
                int iE = izr0Var.E();
                boolean z4 = (iE & 4) != 0;
                boolean z5 = (iE & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new h58(this.f.w(8, 1), (byte) 17);
                }
                if (z5 && this.f156p == null) {
                    b = 2;
                    this.f156p = new d3k1(this.f.w(9, 2));
                } else {
                    b = 2;
                }
                this.f.s();
                this.j = izr0Var.q() - 5;
                this.g = b;
            } else if (b2 == 2) {
                fc10Var.u(this.j);
                this.j = 0;
                this.g = (byte) 3;
            } else if (b2 == 3) {
                izr0 izr0Var2 = this.c;
                if (!fc10Var.g(izr0Var2.a, 0, 11, true)) {
                    return -1;
                }
                izr0Var2.R(0);
                this.k = izr0Var2.E();
                this.l = izr0Var2.H();
                this.m = izr0Var2.H();
                this.m = (((long) (izr0Var2.E() << 24)) | this.m) * 1000;
                izr0Var2.S(3);
                this.g = (byte) 4;
            } else {
                if (b2 != 4) {
                    bhn0.w();
                    return 0;
                }
                boolean z6 = this.h;
                mq41 mq41Var = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else {
                    if (mq41Var.c == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.m;
                    }
                    s = this.k;
                    if (s == 8 || this.o == null) {
                        int i = 4;
                        if (s != 9 && this.f156p != null) {
                            if (!this.n) {
                                this.f.c(new bc9(-9223372036854775807L));
                                this.n = true;
                            }
                            d3k1 d3k1Var = this.f156p;
                            izr0 izr0VarF = f(fc10Var);
                            d3k1Var.getClass();
                            int iE2 = izr0VarF.E();
                            int i2 = (iE2 >> 4) & 15;
                            int i3 = iE2 & 15;
                            if (i3 != 7) {
                                final String strC = f4i1.c(i3, "Video format not supported: ");
                                throw new ParserException(strC) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            d3k1Var.h = i2;
                            if (i2 != 5) {
                                izr0 izr0Var3 = d3k1Var.c;
                                gtf1 gtf1Var = (gtf1) d3k1Var.b;
                                izr0 izr0Var4 = d3k1Var.d;
                                int iE3 = izr0VarF.E();
                                izr0VarF.j(3);
                                byte[] bArr = izr0VarF.a;
                                int i4 = izr0VarF.b;
                                int i5 = i4 + 1;
                                izr0VarF.b = i5;
                                int i6 = ((bArr[i4] & 255) << 24) >> 8;
                                int i7 = i4 + 2;
                                izr0VarF.b = i7;
                                int i8 = ((bArr[i5] & 255) << 8) | i6;
                                izr0VarF.b = i4 + 3;
                                long j4 = (((long) (i8 | (bArr[i7] & 255))) * 1000) + j2;
                                if (iE3 != 0 || d3k1Var.f) {
                                    if (iE3 == 1 && d3k1Var.f) {
                                        int i9 = d3k1Var.h == 1 ? 1 : 0;
                                        if (d3k1Var.g || i9 != 0) {
                                            byte[] bArr2 = izr0Var4.a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i10 = 4 - d3k1Var.e;
                                            int i11 = 0;
                                            while (izr0VarF.a() > 0) {
                                                izr0VarF.o(i10, izr0Var4.a, d3k1Var.e);
                                                izr0Var4.R(0);
                                                int I = izr0Var4.I();
                                                izr0Var3.R(0);
                                                gtf1Var.f(i, izr0Var3);
                                                gtf1Var.f(I, izr0VarF);
                                                i11 = i11 + 4 + I;
                                                i = 4;
                                            }
                                            ((gtf1) d3k1Var.b).b(j4, i9, i11, 0, null);
                                            d3k1Var.g = true;
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                    z3 = true;
                                } else {
                                    byte[] bArr3 = new byte[izr0VarF.a()];
                                    izr0 izr0Var5 = new izr0(bArr3);
                                    izr0VarF.o(0, bArr3, izr0VarF.a());
                                    yb9 yb9VarA = yb9.a(izr0Var5);
                                    d3k1Var.e = yb9VarA.b;
                                    ge30 ge30Var = new ge30();
                                    ge30Var.n = asj0.p("video/x-flv");
                                    ge30Var.o = asj0.p("video/avc");
                                    ge30Var.k = yb9VarA.l;
                                    ge30Var.v = yb9VarA.c;
                                    ge30Var.w = yb9VarA.d;
                                    ge30Var.D = yb9VarA.k;
                                    ge30Var.r = yb9VarA.a;
                                    xvj1.q(ge30Var, gtf1Var);
                                    d3k1Var.f = true;
                                }
                                z2 = false;
                                if (z2) {
                                }
                                z3 = true;
                            }
                        } else if (s == 18 || this.n) {
                            fc10Var.u(this.l);
                            z = false;
                            z3 = false;
                        } else {
                            izr0 izr0VarF2 = f(fc10Var);
                            if (izr0VarF2.E() == 2 && "onMetaData".equals(mq41.x1(izr0VarF2)) && izr0VarF2.a() != 0 && izr0VarF2.E() == 8) {
                                HashMap mapW1 = mq41.w1(izr0VarF2);
                                Object obj = mapW1.get("duration");
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        mq41Var.c = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapW1.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        mq41Var.d = new long[size];
                                        mq41Var.e = new long[size];
                                        for (int i12 = 0; i12 < size; i12++) {
                                            Object obj5 = list.get(i12);
                                            Object obj6 = list2.get(i12);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                mq41Var.d = new long[0];
                                                mq41Var.e = new long[0];
                                                break;
                                            }
                                            mq41Var.d[i12] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            mq41Var.e[i12] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j5 = mq41Var.c;
                            if (j5 != -9223372036854775807L) {
                                this.f.c(new u980(j5, mq41Var.e, mq41Var.d));
                                this.n = true;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!this.n) {
                            this.f.c(new bc9(-9223372036854775807L));
                            this.n = true;
                        }
                        h58 h58Var = this.o;
                        izr0 izr0VarF3 = f(fc10Var);
                        gtf1 gtf1Var2 = (gtf1) h58Var.b;
                        if (h58Var.c) {
                            izr0VarF3.S(1);
                        } else {
                            int iE4 = izr0VarF3.E();
                            int i13 = (iE4 >> 4) & 15;
                            h58Var.e = i13;
                            if (i13 == 2) {
                                int i14 = h58.f[(iE4 >> 2) & 3];
                                ge30 ge30Var2 = new ge30();
                                ge30Var2.n = asj0.p("video/x-flv");
                                ge30Var2.o = asj0.p("audio/mpeg");
                                ge30Var2.I = 1;
                                ge30Var2.K = i14;
                                xvj1.q(ge30Var2, gtf1Var2);
                                h58Var.d = true;
                            } else if (i13 == 7 || i13 == 8) {
                                String str = i13 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                ge30 ge30Var3 = new ge30();
                                ge30Var3.n = asj0.p("video/x-flv");
                                ge30Var3.o = asj0.p(str);
                                ge30Var3.I = 1;
                                ge30Var3.K = 8000;
                                xvj1.q(ge30Var3, gtf1Var2);
                                h58Var.d = true;
                            } else if (i13 != 10) {
                                final String str2 = "Audio format not supported: " + h58Var.e;
                                throw new ParserException(str2) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            h58Var.c = true;
                        }
                        gtf1 gtf1Var3 = (gtf1) h58Var.b;
                        if (h58Var.e == 2) {
                            int iA = izr0VarF3.a();
                            gtf1Var3.f(iA, izr0VarF3);
                            ((gtf1) h58Var.b).b(j2, 1, iA, 0, null);
                        } else {
                            int iE5 = izr0VarF3.E();
                            if (iE5 == 0 && !h58Var.d) {
                                int iA2 = izr0VarF3.a();
                                byte[] bArr4 = new byte[iA2];
                                izr0VarF3.o(0, bArr4, iA2);
                                v vVarV = c8o.v(new bae(bArr4, iA2), false);
                                ge30 ge30Var4 = new ge30();
                                ge30Var4.n = asj0.p("video/x-flv");
                                ge30Var4.o = asj0.p("audio/mp4a-latm");
                                ge30Var4.k = vVarV.c;
                                ge30Var4.I = vVarV.b;
                                ge30Var4.K = vVarV.a;
                                ge30Var4.r = Collections.singletonList(bArr4);
                                xvj1.q(ge30Var4, gtf1Var3);
                                h58Var.d = true;
                            } else if (h58Var.e != 10 || iE5 == 1) {
                                int iA3 = izr0VarF3.a();
                                gtf1Var3.f(iA3, izr0VarF3);
                                ((gtf1) h58Var.b).b(j2, 1, iA3, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        if (mq41Var.c == -9223372036854775807L) {
                            j3 = -this.m;
                        } else {
                            j3 = 0;
                        }
                        this.i = j3;
                    }
                    this.j = 4;
                    this.g = (byte) 2;
                    if (z3) {
                        return 0;
                    }
                }
                j2 = j;
                s = this.k;
                if (s == 8) {
                    int i15 = 4;
                    if (s != 9) {
                        if (s == 18) {
                        }
                        fc10Var.u(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (s == 18) {
                        }
                        fc10Var.u(this.l);
                        z = false;
                        z3 = false;
                    }
                } else {
                    int i16 = 4;
                    if (s != 9) {
                        if (s == 18) {
                        }
                        fc10Var.u(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (s == 18) {
                        }
                        fc10Var.u(this.l);
                        z = false;
                        z3 = false;
                    }
                }
                if (!this.h) {
                    this.h = true;
                    if (mq41Var.c == -9223372036854775807L) {
                        j3 = -this.m;
                    } else {
                        j3 = 0;
                    }
                    this.i = j3;
                }
                this.j = 4;
                this.g = (byte) 2;
                if (z3) {
                    return 0;
                }
            }
        }
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) throws InterruptedIOException {
        izr0 izr0Var = this.a;
        uyr uyrVar = (uyr) fc10Var;
        uyrVar.d(izr0Var.a, 0, 3, false);
        izr0Var.R(0);
        if (izr0Var.H() == 4607062) {
            uyrVar.d(izr0Var.a, 0, 2, false);
            izr0Var.R(0);
            if ((izr0Var.L() & 250) == 0) {
                uyrVar.d(izr0Var.a, 0, 4, false);
                izr0Var.R(0);
                int iQ = izr0Var.q();
                uyrVar.f = 0;
                uyrVar.v(iQ, false);
                uyrVar.d(izr0Var.a, 0, 4, false);
                izr0Var.R(0);
                if (izr0Var.q() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final izr0 f(fc10 fc10Var) {
        int i = this.l;
        izr0 izr0Var = this.d;
        byte[] bArr = izr0Var.a;
        if (i > bArr.length) {
            izr0Var.P(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            izr0Var.R(0);
        }
        izr0Var.Q(this.l);
        fc10Var.readFully(izr0Var.a, 0, this.l);
        return izr0Var;
    }

    @Override // p.ec10
    public final void release() {
    }
}
