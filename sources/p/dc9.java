package p;

import androidx.media3.common.ParserException;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dc9 implements ec10 {
    public final izr0 a;
    public final cc9 b;
    public final boolean c;
    public final sjb d;
    public byte e;
    public gc10 f;
    public ec9 g;
    public long h;
    public bbg[] i;
    public long j;
    public bbg k;
    public int l;
    public long m;
    public long n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f33p;

    public dc9(int i, sjb sjbVar) {
        this.d = sjbVar;
        this.c = (i & 1) == 0;
        this.a = new izr0(12);
        this.b = new cc9();
        this.f = new pob((byte) 17, false);
        this.i = new bbg[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (bbg bbgVar : this.i) {
            if (bbgVar.l == 0) {
                bbgVar.j = 0;
            } else {
                bbgVar.j = bbgVar.o[zoi1.f(bbgVar.n, j, true)];
            }
        }
        if (j != 0) {
            this.e = (byte) 6;
        } else if (this.i.length == 0) {
            this.e = (byte) 0;
        } else {
            this.e = (byte) 3;
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.e = (byte) 0;
        if (this.c) {
            gc10Var = new wh41(gc10Var, this.d);
        }
        this.f = gc10Var;
        this.j = -1L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:183:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x011a  */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        boolean z;
        int i;
        bbg bbgVar;
        long j;
        int i2;
        bbg bbgVar2;
        int i3 = 0;
        if (this.j != -1) {
            long position = fc10Var.getPosition();
            long j2 = this.j;
            if (j2 < position || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                sfv0Var.a = j2;
                z = true;
            } else {
                fc10Var.u((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.j = -1L;
        if (z) {
            return 1;
        }
        byte b = this.e;
        int i4 = 4;
        bbg bbgVar3 = null;
        cc9 cc9Var = this.b;
        int i5 = 2;
        izr0 izr0Var = this.a;
        switch (b) {
            case 0:
                if (!d(fc10Var)) {
                    throw ParserException.a((RuntimeException) null, "AVI Header List not found");
                }
                fc10Var.u(12);
                this.e = (byte) 1;
                return 0;
            case 1:
                fc10Var.readFully(izr0Var.a, 0, 12);
                izr0Var.R(0);
                cc9Var.a = izr0Var.s();
                cc9Var.b = izr0Var.s();
                cc9Var.c = 0;
                if (cc9Var.a != 1414744396) {
                    throw ParserException.a((RuntimeException) null, "LIST expected, found: " + cc9Var.a);
                }
                int iS = izr0Var.s();
                cc9Var.c = iS;
                if (iS == 1819436136) {
                    this.l = cc9Var.b;
                    this.e = (byte) 2;
                    return 0;
                }
                throw ParserException.a((RuntimeException) null, "hdrl expected, found: " + cc9Var.c);
            case 2:
                int i6 = this.l - 4;
                izr0 izr0Var2 = new izr0(i6);
                fc10Var.readFully(izr0Var2.a, 0, i6);
                wmc0 wmc0VarB = wmc0.b(1819436136, izr0Var2);
                int i7 = wmc0VarB.b;
                if (i7 != 1819436136) {
                    throw ParserException.a((RuntimeException) null, "Unexpected header list type " + i7);
                }
                ec9 ec9Var = (ec9) wmc0VarB.a(ec9.class);
                if (ec9Var == null) {
                    throw ParserException.a((RuntimeException) null, "AviHeader not found");
                }
                this.g = ec9Var;
                this.h = ((long) ec9Var.c) * ((long) ec9Var.a);
                ArrayList arrayList = new ArrayList();
                w280 w280VarR = wmc0VarB.a.r(0);
                int i8 = 0;
                while (w280VarR.hasNext()) {
                    ac9 ac9Var = (ac9) w280VarR.next();
                    if (ac9Var.getType() == 1819440243) {
                        wmc0 wmc0Var = (wmc0) ac9Var;
                        int i9 = i8 + 1;
                        fc9 fc9Var = (fc9) wmc0Var.a(fc9.class);
                        udc1 udc1Var = (udc1) wmc0Var.a(udc1.class);
                        if (fc9Var == null) {
                            oon1.H("Missing Stream Header");
                        } else {
                            if (udc1Var == null) {
                                oon1.H("Missing Stream Format");
                            } else {
                                long j3 = fc9Var.d;
                                long j4 = ((long) fc9Var.b) * 1000000;
                                i = i9;
                                long j5 = fc9Var.c;
                                String str = zoi1.a;
                                long jG0 = zoi1.g0(j3, j4, j5, RoundingMode.DOWN);
                                ie30 ie30Var = udc1Var.a;
                                ge30 ge30VarA = ie30Var.a();
                                ge30VarA.a = Integer.toString(i8);
                                int i10 = fc9Var.e;
                                if (i10 != 0) {
                                    ge30VarA.f52p = i10;
                                }
                                wdc1 wdc1Var = (wdc1) wmc0Var.a(wdc1.class);
                                if (wdc1Var != null) {
                                    ge30VarA.b = wdc1Var.a;
                                }
                                int i11 = asj0.i(ie30Var.f66p);
                                if (i11 == 1 || i11 == i5) {
                                    gtf1 gtf1VarW = this.f.w(i8, i11);
                                    ie30 ie30Var2 = new ie30(ge30VarA);
                                    gtf1VarW.a(ie30Var2);
                                    gtf1VarW.g(jG0);
                                    this.h = Math.max(this.h, jG0);
                                    bbgVar = new bbg(i8, fc9Var, gtf1VarW, asj0.a(ie30Var2.f66p, ie30Var2.l));
                                } else {
                                    bbgVar = null;
                                }
                            }
                            if (bbgVar != null) {
                                arrayList.add(bbgVar);
                            }
                            i8 = i;
                        }
                        i = i9;
                        bbgVar = null;
                        if (bbgVar != null) {
                            arrayList.add(bbgVar);
                        }
                        i8 = i;
                    }
                    i3 = 0;
                    i5 = 2;
                }
                int i12 = i3;
                this.i = (bbg[]) arrayList.toArray(new bbg[i12]);
                this.f.s();
                this.e = (byte) 3;
                return i12;
            case 3:
                if (this.m != -1) {
                    long position2 = fc10Var.getPosition();
                    long j6 = this.m;
                    if (position2 != j6) {
                        this.j = j6;
                        return 0;
                    }
                }
                fc10Var.h(0, izr0Var.a, 12);
                fc10Var.f();
                izr0Var.R(0);
                cc9Var.a = izr0Var.s();
                cc9Var.b = izr0Var.s();
                cc9Var.c = 0;
                int iS2 = izr0Var.s();
                int i13 = cc9Var.a;
                if (i13 == 1179011410) {
                    fc10Var.u(12);
                    return 0;
                }
                if (i13 != 1414744396 || iS2 != 1769369453) {
                    this.j = fc10Var.getPosition() + ((long) cc9Var.b) + 8;
                    return 0;
                }
                long position3 = fc10Var.getPosition();
                this.m = position3;
                this.n = position3 + ((long) cc9Var.b) + 8;
                if (!this.f33p) {
                    ec9 ec9Var2 = this.g;
                    ec9Var2.getClass();
                    if ((ec9Var2.b & 16) == 16) {
                        this.e = (byte) 4;
                        this.j = this.n;
                        return 0;
                    }
                    this.f.c(new bc9(this.h));
                    this.f33p = true;
                }
                this.j = fc10Var.getPosition() + 12;
                this.e = (byte) 6;
                return 0;
            case 4:
                fc10Var.readFully(izr0Var.a, 0, 8);
                izr0Var.R(0);
                int iS3 = izr0Var.s();
                int iS4 = izr0Var.s();
                if (iS3 != 829973609) {
                    this.j = fc10Var.getPosition() + ((long) iS4);
                    return 0;
                }
                this.e = (byte) 5;
                this.o = iS4;
                return 0;
            case 5:
                izr0 izr0Var3 = new izr0(this.o);
                fc10Var.readFully(izr0Var3.a, 0, this.o);
                if (izr0Var3.a() < 16) {
                    j = 0;
                } else {
                    int i14 = izr0Var3.b;
                    izr0Var3.S(8);
                    long jS = izr0Var3.s();
                    long j7 = this.m;
                    j = jS > j7 ? 0L : j7 + 8;
                    izr0Var3.R(i14);
                }
                while (izr0Var3.a() >= 16) {
                    int iS5 = izr0Var3.s();
                    int iS6 = izr0Var3.s();
                    long jS2 = ((long) izr0Var3.s()) + j;
                    izr0Var3.S(i4);
                    bbg[] bbgVarArr = this.i;
                    int length = bbgVarArr.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length) {
                            bbgVar2 = bbgVarArr[i15];
                            if (bbgVar2.c != iS5 && bbgVar2.d != iS5) {
                                i15++;
                            }
                        } else {
                            bbgVar2 = null;
                        }
                    }
                    if (bbgVar2 != null) {
                        boolean z2 = (iS6 & 16) == 16;
                        if (bbgVar2.m == -1) {
                            bbgVar2.m = jS2;
                        }
                        if (z2 || bbgVar2.f) {
                            int i16 = bbgVar2.l;
                            int[] iArrCopyOf = bbgVar2.o;
                            if (i16 == iArrCopyOf.length) {
                                long[] jArr = bbgVar2.n;
                                bbgVar2.n = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = bbgVar2.o;
                                iArrCopyOf = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                bbgVar2.o = iArrCopyOf;
                            }
                            long[] jArr2 = bbgVar2.n;
                            int i17 = bbgVar2.l;
                            jArr2[i17] = jS2;
                            iArrCopyOf[i17] = bbgVar2.k;
                            bbgVar2.l = i17 + 1;
                        }
                        bbgVar2.k++;
                    }
                    i4 = 4;
                }
                for (bbg bbgVar4 : this.i) {
                    bbgVar4.n = Arrays.copyOf(bbgVar4.n, bbgVar4.l);
                    bbgVar4.o = Arrays.copyOf(bbgVar4.o, bbgVar4.l);
                    if (bbgVar4.f && bbgVar4.a.f != 0 && (i2 = bbgVar4.l) > 0) {
                        bbgVar4.g = i2;
                    }
                }
                this.f33p = true;
                int length2 = this.i.length;
                gc10 gc10Var = this.f;
                long j8 = this.h;
                if (length2 == 0) {
                    gc10Var.c(new bc9(j8));
                } else {
                    gc10Var.c(new bc9(this, j8, (byte) 0));
                }
                this.e = (byte) 6;
                this.j = this.m;
                return 0;
            case 6:
                if (fc10Var.getPosition() >= this.n) {
                    return -1;
                }
                bbg bbgVar5 = this.k;
                if (bbgVar5 != null) {
                    gtf1 gtf1Var = bbgVar5.b;
                    int i18 = bbgVar5.i;
                    int iE = i18 - gtf1Var.e(fc10Var, i18, false);
                    bbgVar5.i = iE;
                    boolean z3 = iE == 0;
                    if (z3) {
                        if (bbgVar5.h > 0) {
                            int i19 = bbgVar5.j;
                            gtf1Var.b((bbgVar5.e * ((long) i19)) / ((long) bbgVar5.g), (bbgVar5.f || Arrays.binarySearch(bbgVar5.o, i19) >= 0) ? 1 : 0, bbgVar5.h, 0, null);
                        }
                        bbgVar5.j++;
                    }
                    if (z3) {
                        this.k = null;
                    }
                    return 0;
                }
                if ((fc10Var.getPosition() & 1) == 1) {
                    fc10Var.u(1);
                }
                fc10Var.h(0, izr0Var.a, 12);
                izr0Var.R(0);
                int iS7 = izr0Var.s();
                if (iS7 == 1414744396) {
                    izr0Var.R(8);
                    fc10Var.u(izr0Var.s() == 1769369453 ? 12 : 8);
                    fc10Var.f();
                    return 0;
                }
                int iS8 = izr0Var.s();
                if (iS7 == 1263424842) {
                    this.j = fc10Var.getPosition() + ((long) iS8) + 8;
                    return 0;
                }
                fc10Var.u(8);
                fc10Var.f();
                for (bbg bbgVar6 : this.i) {
                    if (bbgVar6.c == iS7 || bbgVar6.d == iS7) {
                        bbgVar3 = bbgVar6;
                        if (bbgVar3 == null) {
                            this.j = fc10Var.getPosition() + ((long) iS8);
                            return 0;
                        }
                        bbgVar3.h = iS8;
                        bbgVar3.i = iS8;
                        this.k = bbgVar3;
                        return 0;
                    }
                }
                if (bbgVar3 == null) {
                    this.j = fc10Var.getPosition() + ((long) iS8);
                    return 0;
                }
                bbgVar3.h = iS8;
                bbgVar3.i = iS8;
                this.k = bbgVar3;
                return 0;
            default:
                hhg1.c();
                return 0;
        }
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        izr0 izr0Var = this.a;
        fc10Var.h(0, izr0Var.a, 12);
        izr0Var.R(0);
        if (izr0Var.s() == 1179011410) {
            izr0Var.S(4);
            if (izr0Var.s() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // p.ec10
    public final void release() {
    }
}
