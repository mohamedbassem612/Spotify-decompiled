package p;

import app.p000rive.semantics.SemanticState;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q72 implements ytw {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public gtf1 h;
    public gtf1 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public gtf1 v;
    public long w;
    public final bae b = new bae(new byte[7], 7);
    public final izr0 c = new izr0(Arrays.copyOf(x, 10));
    public int o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f118p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public byte j = 0;
    public int k = 0;
    public short l = 256;

    public q72(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.ytw
    public final void a(izr0 izr0Var) {
        byte b;
        int i;
        byte b2;
        char c;
        int i2;
        char c2;
        int i3;
        int i4;
        int i5;
        this.h.getClass();
        String str = zoi1.a;
        while (izr0Var.a() > 0) {
            byte b3 = this.j;
            byte b4 = -1;
            izr0 izr0Var2 = this.c;
            byte b5 = 3;
            bae baeVar = this.b;
            int i6 = 0;
            int i7 = 4;
            int i8 = 1;
            if (b3 == 0) {
                byte[] bArr = izr0Var.a;
                int i9 = izr0Var.b;
                int i10 = izr0Var.c;
                while (true) {
                    if (i9 < i10) {
                        int i11 = i9 + 1;
                        byte b6 = b5;
                        byte b7 = bArr[i9];
                        int i12 = b7 & 255;
                        if (this.l == 512 && ((65280 | (((byte) i12) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.n) {
                                int i13 = i9 - 1;
                                izr0Var.R(i9);
                                byte[] bArr2 = baeVar.b;
                                if (izr0Var.a() < i8) {
                                    b = -1;
                                } else {
                                    izr0Var.o(i6, bArr2, i8);
                                    baeVar.m(i7);
                                    int iG = baeVar.g(i8);
                                    int i14 = this.o;
                                    if (i14 == -1 || iG == i14) {
                                        if (this.f118p != -1) {
                                            byte[] bArr3 = baeVar.b;
                                            if (izr0Var.a() >= i8) {
                                                izr0Var.o(i6, bArr3, i8);
                                                baeVar.m(2);
                                                i3 = 4;
                                                if (baeVar.g(4) != this.f118p) {
                                                    b = -1;
                                                } else {
                                                    izr0Var.R(i11);
                                                }
                                            }
                                        } else {
                                            i3 = 4;
                                        }
                                        byte[] bArr4 = baeVar.b;
                                        if (izr0Var.a() >= i3) {
                                            izr0Var.o(i6, bArr4, i3);
                                            baeVar.m(14);
                                            int iG2 = baeVar.g(13);
                                            if (iG2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = izr0Var.a;
                                                int i15 = izr0Var.c;
                                                int i16 = i13 + iG2;
                                                if (i16 < i15) {
                                                    byte b8 = bArr5[i16];
                                                    b = -1;
                                                    if (b8 == -1) {
                                                        int i17 = i16 + 1;
                                                        if (i17 != i15) {
                                                            byte b9 = bArr5[i17];
                                                            if (((65280 | (b9 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b9 & 8) >> 3) == iG) {
                                                            }
                                                        }
                                                    } else if (b8 == 73 && ((i4 = i16 + 1) == i15 || (bArr5[i4] == 68 && ((i5 = i16 + 2) == i15 || bArr5[i5] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.q = (b7 & 8) >> 3;
                            this.m = (b7 & 1) == 0;
                            if (this.n) {
                                this.j = b6;
                                this.k = 0;
                            } else {
                                this.j = (byte) 1;
                                this.k = 0;
                            }
                            izr0Var.R(i11);
                        } else {
                            b = b4;
                            i = i8;
                        }
                        short s = this.l;
                        int i18 = i12 | s;
                        if (i18 == 329) {
                            b2 = 3;
                            c = 256;
                            i2 = 0;
                            c2 = 2;
                            this.l = (short) 768;
                        } else if (i18 == 511) {
                            b2 = 3;
                            c = 256;
                            i2 = 0;
                            c2 = 2;
                            this.l = (short) 512;
                        } else if (i18 == 836) {
                            b2 = 3;
                            c = 256;
                            i2 = 0;
                            c2 = 2;
                            this.l = (short) 1024;
                        } else if (i18 != 1075) {
                            c = 256;
                            if (s != 256) {
                                this.l = (short) 256;
                                b2 = 3;
                                i2 = 0;
                                c2 = 2;
                            } else {
                                b2 = 3;
                                i2 = 0;
                                c2 = 2;
                            }
                            i8 = i;
                            b4 = b;
                            i7 = 4;
                            i6 = i2;
                            b5 = b2;
                        } else {
                            this.j = (byte) 2;
                            this.k = 3;
                            this.t = 0;
                            izr0Var2.R(0);
                            izr0Var.R(i11);
                        }
                        i9 = i11;
                        i8 = i;
                        b4 = b;
                        i7 = 4;
                        i6 = i2;
                        b5 = b2;
                    } else {
                        izr0Var.R(i9);
                    }
                }
            } else if (b3 != 1) {
                if (b3 == 2) {
                    byte[] bArr6 = izr0Var2.a;
                    int iMin = Math.min(izr0Var.a(), 10 - this.k);
                    izr0Var.o(this.k, bArr6, iMin);
                    int i19 = this.k + iMin;
                    this.k = i19;
                    if (i19 == 10) {
                        this.i.f(10, izr0Var2);
                        izr0Var2.R(6);
                        gtf1 gtf1Var = this.i;
                        int iD = izr0Var2.D() + 10;
                        this.j = (byte) 4;
                        this.k = 10;
                        this.v = gtf1Var;
                        this.w = 0L;
                        this.t = iD;
                    }
                } else if (b3 == 3) {
                    int i20 = this.m ? 7 : 5;
                    byte[] bArr7 = baeVar.b;
                    int iMin2 = Math.min(izr0Var.a(), i20 - this.k);
                    izr0Var.o(this.k, bArr7, iMin2);
                    int i21 = this.k + iMin2;
                    this.k = i21;
                    if (i21 == i20) {
                        baeVar.m(0);
                        if (this.r) {
                            baeVar.o(10);
                        } else {
                            int iG3 = baeVar.g(2) + 1;
                            if (iG3 != 2) {
                                oon1.H("Detected audio object type: " + iG3 + ", but assuming AAC LC.");
                                iG3 = 2;
                            }
                            baeVar.o(5);
                            int iG4 = baeVar.g(3);
                            int i22 = this.f118p;
                            byte[] bArr8 = {(byte) (((iG3 << 3) & 248) | ((i22 >> 1) & 7)), (byte) (((iG4 << 3) & 120) | ((i22 << 7) & SemanticState.Focused))};
                            v vVarV = c8o.v(new bae(bArr8, 2), false);
                            ge30 ge30Var = new ge30();
                            ge30Var.a = this.g;
                            ge30Var.n = asj0.p(this.f);
                            ge30Var.o = asj0.p("audio/mp4a-latm");
                            ge30Var.k = vVarV.c;
                            ge30Var.I = vVarV.b;
                            ge30Var.K = vVarV.a;
                            ge30Var.r = Collections.singletonList(bArr8);
                            ge30Var.d = this.d;
                            ge30Var.f = this.e;
                            ie30 ie30Var = new ie30(ge30Var);
                            this.s = 1024000000 / ((long) ie30Var.L);
                            this.h.a(ie30Var);
                            this.r = true;
                        }
                        baeVar.o(4);
                        int iG5 = baeVar.g(13);
                        int i23 = iG5 - 7;
                        if (this.m) {
                            i23 = iG5 - 9;
                        }
                        gtf1 gtf1Var2 = this.h;
                        long j = this.s;
                        this.j = (byte) 4;
                        this.k = 0;
                        this.v = gtf1Var2;
                        this.w = j;
                        this.t = i23;
                    }
                } else {
                    if (b3 != 4) {
                        bhn0.w();
                        return;
                    }
                    int iMin3 = Math.min(izr0Var.a(), this.t - this.k);
                    this.v.f(iMin3, izr0Var);
                    int i24 = this.k + iMin3;
                    this.k = i24;
                    if (i24 == this.t) {
                        dm5.y(this.u != -9223372036854775807L);
                        this.v.b(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = (byte) 0;
                        this.k = 0;
                        this.l = (short) 256;
                    }
                }
            } else if (izr0Var.a() != 0) {
                baeVar.b[0] = izr0Var.a[izr0Var.b];
                baeVar.m(2);
                int iG6 = baeVar.g(4);
                int i25 = this.f118p;
                if (i25 == -1 || iG6 == i25) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.f118p = iG6;
                    }
                    this.j = (byte) 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = (byte) 0;
                    this.k = 0;
                    this.l = (short) 256;
                }
            }
        }
    }

    @Override // p.ytw
    public final void b() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = (byte) 0;
        this.k = 0;
        this.l = (short) 256;
    }

    @Override // p.ytw
    public final void d(gc10 gc10Var, wwg1 wwg1Var) {
        wwg1Var.a();
        wwg1Var.b();
        this.g = wwg1Var.e;
        wwg1Var.b();
        gtf1 gtf1VarW = gc10Var.w(wwg1Var.d, 1);
        this.h = gtf1VarW;
        this.v = gtf1VarW;
        if (!this.a) {
            this.i = new x6u();
            return;
        }
        wwg1Var.a();
        wwg1Var.b();
        gtf1 gtf1VarW2 = gc10Var.w(wwg1Var.d, 5);
        this.i = gtf1VarW2;
        ge30 ge30Var = new ge30();
        wwg1Var.b();
        ge30Var.a = wwg1Var.e;
        ge30Var.n = asj0.p(this.f);
        ge30Var.o = asj0.p("application/id3");
        xvj1.q(ge30Var, gtf1VarW2);
    }

    @Override // p.ytw
    public final void f(int i, long j) {
        this.u = j;
    }
}
