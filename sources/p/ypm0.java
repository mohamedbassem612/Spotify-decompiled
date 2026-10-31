package p;

import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.common.ParserException;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ypm0 implements ytw {
    public String e;
    public gtf1 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public byte d = 0;
    public final izr0 a = new izr0(new byte[15], 2);
    public final bae b = new bae();
    public final izr0 c = new izr0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sj7 f178p = new sj7();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c0, please report this as an issue */
    @Override // p.ytw
    public final void a(izr0 izr0Var) throws ParserException {
        int i;
        byte b;
        int iG;
        int iG2;
        int i2;
        char c;
        byte[] bArr;
        long j;
        long j2;
        bg11 bg11VarU;
        int iG3;
        long j3;
        boolean z;
        int i3;
        this.f.getClass();
        while (izr0Var.a() > 0) {
            byte b2 = this.d;
            int i4 = 8;
            int i5 = 3;
            int i6 = 1;
            if (b2 != 0) {
                izr0 izr0Var2 = this.c;
                sj7 sj7Var = this.f178p;
                if (b2 == 1) {
                    int iA = izr0Var.a();
                    izr0 izr0Var3 = this.a;
                    int iMin = Math.min(iA, izr0Var3.a());
                    izr0Var.o(izr0Var3.b, izr0Var3.a, iMin);
                    izr0Var3.S(iMin);
                    if (izr0Var3.a() == 0) {
                        int i7 = izr0Var3.c;
                        byte[] bArr2 = izr0Var3.a;
                        bae baeVar = this.b;
                        baeVar.l(bArr2, i7);
                        baeVar.d();
                        int iU = w2g0.u(baeVar, 3, 8, 8);
                        sj7Var.b = iU;
                        if (iU != -1) {
                            dm5.m(Math.max(Math.max(2, 8), 32) <= 63);
                            cwl1.n(cwl1.n(3L, 255L), 4294967296L);
                            if (baeVar.b() < 2) {
                                j3 = -1;
                            } else {
                                long jI = baeVar.i(2);
                                if (jI == 3) {
                                    if (baeVar.b() >= 8) {
                                        long jI2 = baeVar.i(8);
                                        jI += jI2;
                                        if (jI2 == 255) {
                                            if (baeVar.b() >= 32) {
                                                jI = baeVar.i(32) + jI;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jI;
                            }
                            sj7Var.c = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw ParserException.d("Contains sub-stream with an invalid packet label " + sj7Var.c);
                                }
                                if (j3 == 0) {
                                    int i8 = sj7Var.b;
                                    if (i8 == 1) {
                                        throw ParserException.a((RuntimeException) null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i8 == 2) {
                                        throw ParserException.a((RuntimeException) null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i8 == 17) {
                                        throw ParserException.a((RuntimeException) null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iU2 = w2g0.u(baeVar, 11, 24, 24);
                                sj7Var.d = iU2;
                                if (iU2 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i3 = 0;
                            this.n = 0;
                            this.o = sj7Var.d + i7 + this.o;
                        } else {
                            i3 = 0;
                        }
                        if (z) {
                            izr0Var3.R(i3);
                            this.f.f(izr0Var3.c, izr0Var3);
                            izr0Var3.O(2);
                            izr0Var2.O(sj7Var.d);
                            this.m = true;
                            this.d = (byte) 2;
                        } else {
                            int i9 = izr0Var3.c;
                            if (i9 < 15) {
                                izr0Var3.Q(i9 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (b2 != 2) {
                        bhn0.w();
                        return;
                    }
                    int i10 = sj7Var.b;
                    if (i10 == 1 || i10 == 17) {
                        int i11 = izr0Var.b;
                        int iMin2 = Math.min(izr0Var.a(), izr0Var2.a());
                        izr0Var.o(izr0Var2.b, izr0Var2.a, iMin2);
                        izr0Var2.S(iMin2);
                        izr0Var.R(i11);
                    }
                    int iMin3 = Math.min(izr0Var.a(), sj7Var.d - this.n);
                    this.f.f(iMin3, izr0Var);
                    int i12 = this.n + iMin3;
                    this.n = i12;
                    if (i12 != sj7Var.d) {
                        continue;
                    } else {
                        int i13 = sj7Var.b;
                        if (i13 == 1) {
                            byte[] bArr3 = izr0Var2.a;
                            bae baeVar2 = new bae(bArr3, bArr3.length);
                            int iG4 = baeVar2.g(8);
                            int iG5 = baeVar2.g(5);
                            if (iG5 != 31) {
                                switch (iG5) {
                                    case 0:
                                        iG2 = 96000;
                                        break;
                                    case 1:
                                        iG2 = 88200;
                                        break;
                                    case 2:
                                        iG2 = 64000;
                                        break;
                                    case 3:
                                        iG2 = 48000;
                                        break;
                                    case 4:
                                        iG2 = 44100;
                                        break;
                                    case 5:
                                        iG2 = 32000;
                                        break;
                                    case 6:
                                        iG2 = 24000;
                                        break;
                                    case 7:
                                        iG2 = 22050;
                                        break;
                                    case 8:
                                        iG2 = mpd.AUDIO_CONTENT_SAMPLING_RATE;
                                        break;
                                    case 9:
                                        iG2 = 12000;
                                        break;
                                    case 10:
                                        iG2 = 11025;
                                        break;
                                    case 11:
                                        iG2 = 8000;
                                        break;
                                    case 12:
                                        iG2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.d("Unsupported sampling rate index " + iG5);
                                    case 15:
                                        iG2 = 57600;
                                        break;
                                    case 16:
                                        iG2 = 51200;
                                        break;
                                    case 17:
                                        iG2 = 40000;
                                        break;
                                    case 18:
                                        iG2 = 38400;
                                        break;
                                    case 19:
                                        iG2 = 34150;
                                        break;
                                    case 20:
                                        iG2 = 28800;
                                        break;
                                    case 21:
                                        iG2 = 25600;
                                        break;
                                    case 22:
                                        iG2 = 20000;
                                        break;
                                    case 23:
                                        iG2 = 19200;
                                        break;
                                    case 24:
                                        iG2 = 17075;
                                        break;
                                    case 25:
                                        iG2 = 14400;
                                        break;
                                    case 26:
                                        iG2 = 12800;
                                        break;
                                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                        iG2 = 9600;
                                        break;
                                }
                            } else {
                                iG2 = baeVar2.g(24);
                            }
                            int iG6 = baeVar2.g(3);
                            if (iG6 == 0) {
                                i2 = 768;
                            } else if (iG6 == 1) {
                                i2 = SemanticState.ReadOnly;
                            } else if (iG6 == 2 || iG6 == 3) {
                                i2 = SemanticState.Modal;
                            } else {
                                if (iG6 != 4) {
                                    throw ParserException.d("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                i2 = SemanticState.Obscured;
                            }
                            int i14 = i2;
                            if (iG6 == 0 || iG6 == 1) {
                                c = 0;
                            } else if (iG6 == 2) {
                                c = 2;
                            } else if (iG6 == 3) {
                                c = 3;
                            } else {
                                if (iG6 != 4) {
                                    throw ParserException.d("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                c = 1;
                            }
                            baeVar2.o(2);
                            w2g0.y(baeVar2);
                            int iG7 = baeVar2.g(5);
                            int i15 = 0;
                            int iU3 = 0;
                            while (true) {
                                int i16 = i6;
                                int i17 = 16;
                                if (i15 < iG7 + 1) {
                                    int iG8 = baeVar2.g(3);
                                    iU3 = w2g0.u(baeVar2, 5, 8, 16) + 1 + iU3;
                                    if ((iG8 == 0 || iG8 == 2) && baeVar2.f()) {
                                        w2g0.y(baeVar2);
                                    }
                                    i15++;
                                    i6 = i16;
                                } else {
                                    int iU4 = w2g0.u(baeVar2, 4, 8, 16) + 1;
                                    baeVar2.n();
                                    int i18 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i18 < iU4) {
                                            int iG9 = baeVar2.g(2);
                                            if (iG9 == 0) {
                                                baeVar2.o(i5);
                                                if (baeVar2.f()) {
                                                    baeVar2.o(13);
                                                }
                                                if (c > 0) {
                                                    w2g0.x(baeVar2);
                                                }
                                            } else if (iG9 == i16) {
                                                baeVar2.o(i5);
                                                boolean zF = baeVar2.f();
                                                if (zF) {
                                                    baeVar2.o(13);
                                                }
                                                if (zF) {
                                                    baeVar2.n();
                                                }
                                                if (c > 0) {
                                                    w2g0.x(baeVar2);
                                                    iG3 = baeVar2.g(2);
                                                } else {
                                                    iG3 = 0;
                                                }
                                                if (iG3 > 0) {
                                                    baeVar2.o(6);
                                                    int iG10 = baeVar2.g(2);
                                                    baeVar2.o(4);
                                                    if (baeVar2.f()) {
                                                        baeVar2.o(5);
                                                    }
                                                    if (iG3 == 2 || iG3 == i5) {
                                                        baeVar2.o(6);
                                                    }
                                                    if (iG10 == 2) {
                                                        baeVar2.n();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iU3 - 1) / Math.log(2.0d))) + 1;
                                                int iG11 = baeVar2.g(2);
                                                if (iG11 > 0 && baeVar2.f()) {
                                                    baeVar2.o(iFloor);
                                                }
                                                if (baeVar2.f()) {
                                                    baeVar2.o(iFloor);
                                                }
                                                if (c == 0 && iG11 == 0) {
                                                    baeVar2.n();
                                                }
                                            } else if (iG9 == i5) {
                                                w2g0.u(baeVar2, 4, i4, i17);
                                                int iU5 = w2g0.u(baeVar2, 4, i4, i17);
                                                if (baeVar2.f()) {
                                                    w2g0.u(baeVar2, i4, i17, 0);
                                                }
                                                baeVar2.n();
                                                if (iU5 > 0) {
                                                    baeVar2.o(iU5 * 8);
                                                }
                                            }
                                            i18++;
                                            i4 = 8;
                                            i5 = 3;
                                            i17 = 16;
                                            i16 = 1;
                                        } else {
                                            if (baeVar2.f()) {
                                                int i19 = 8;
                                                int iU6 = w2g0.u(baeVar2, 2, 4, 8) + 1;
                                                int i20 = 0;
                                                bArr = null;
                                                while (i20 < iU6) {
                                                    int iU7 = w2g0.u(baeVar2, 4, i19, 16);
                                                    int iU8 = w2g0.u(baeVar2, 4, i19, 16);
                                                    if (iU7 == 7) {
                                                        int iG12 = baeVar2.g(4) + 1;
                                                        baeVar2.o(4);
                                                        byte[] bArr4 = new byte[iG12];
                                                        for (int i21 = 0; i21 < iG12; i21++) {
                                                            bArr4[i21] = (byte) baeVar2.g(i19);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        baeVar2.o(iU8 * i19);
                                                    }
                                                    i20++;
                                                    i19 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iG2) {
                                                case 14700:
                                                case mpd.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                                                    d = 3.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = sj7Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String strConcat = iG4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iG4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            bg11VarU = null;
                                                        } else {
                                                            bg11VarU = b380.u(zoi1.b, bArr);
                                                        }
                                                        ge30 ge30Var = new ge30();
                                                        ge30Var.a = this.e;
                                                        ge30Var.n = asj0.p("video/mp2t");
                                                        ge30Var.o = asj0.p("audio/mhm1");
                                                        ge30Var.K = this.q;
                                                        ge30Var.k = strConcat;
                                                        ge30Var.r = bg11VarU;
                                                        this.f.a(new ie30(ge30Var));
                                                    }
                                                    b = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = sj7Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            bg11VarU = null;
                                                        } else {
                                                            bg11VarU = null;
                                                        }
                                                        ge30 ge30Var2 = new ge30();
                                                        ge30Var2.a = this.e;
                                                        ge30Var2.n = asj0.p("video/mp2t");
                                                        ge30Var2.o = asj0.p("audio/mhm1");
                                                        ge30Var2.K = this.q;
                                                        ge30Var2.k = strConcat;
                                                        ge30Var2.r = bg11VarU;
                                                        this.f.a(new ie30(ge30Var2));
                                                    }
                                                    b = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = sj7Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            bg11VarU = null;
                                                        } else {
                                                            bg11VarU = null;
                                                        }
                                                        ge30 ge30Var3 = new ge30();
                                                        ge30Var3.a = this.e;
                                                        ge30Var3.n = asj0.p("video/mp2t");
                                                        ge30Var3.o = asj0.p("audio/mhm1");
                                                        ge30Var3.K = this.q;
                                                        ge30Var3.k = strConcat;
                                                        ge30Var3.r = bg11VarU;
                                                        this.f.a(new ie30(ge30Var3));
                                                    }
                                                    b = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i14) * d);
                                                    j = this.t;
                                                    j2 = sj7Var.c;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            bg11VarU = null;
                                                        } else {
                                                            bg11VarU = null;
                                                        }
                                                        ge30 ge30Var4 = new ge30();
                                                        ge30Var4.a = this.e;
                                                        ge30Var4.n = asj0.p("video/mp2t");
                                                        ge30Var4.o = asj0.p("audio/mhm1");
                                                        ge30Var4.K = this.q;
                                                        ge30Var4.k = strConcat;
                                                        ge30Var4.r = bg11VarU;
                                                        this.f.a(new ie30(ge30Var4));
                                                    }
                                                    b = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw ParserException.d("Unsupported sampling rate " + iG2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i13 == 17) {
                                byte[] bArr5 = izr0Var2.a;
                                bae baeVar3 = new bae(bArr5, bArr5.length);
                                if (baeVar3.f()) {
                                    baeVar3.o(2);
                                    iG = baeVar3.g(13);
                                } else {
                                    iG = 0;
                                }
                                this.s = iG;
                            } else if (i13 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.r - this.s)) * 1000000.0d) / ((double) this.q);
                                long jRound = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.b(jRound, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            b = 1;
                        }
                        this.d = b;
                    }
                }
            } else {
                int i22 = this.k;
                if ((i22 & 2) == 0) {
                    izr0Var.R(izr0Var.c);
                } else {
                    if ((i22 & 4) == 0) {
                        while (true) {
                            if (izr0Var.a() > 0) {
                                int i23 = this.l << 8;
                                this.l = i23;
                                int iE = i23 | izr0Var.E();
                                this.l = iE;
                                if ((iE & 16777215) == 12583333) {
                                    izr0Var.R(izr0Var.b - 3);
                                    this.l = 0;
                                }
                            }
                        }
                    }
                    this.d = (byte) 1;
                }
            }
        }
    }

    @Override // p.ytw
    public final void b() {
        this.d = (byte) 0;
        this.l = 0;
        this.a.O(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // p.ytw
    public final void d(gc10 gc10Var, wwg1 wwg1Var) {
        wwg1Var.a();
        wwg1Var.b();
        this.e = wwg1Var.e;
        wwg1Var.b();
        this.f = gc10Var.w(wwg1Var.d, 1);
    }

    @Override // p.ytw
    public final void f(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }
}
