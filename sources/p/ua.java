package p;

import app.p000rive.semantics.SemanticState;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ua implements ytw {
    public final /* synthetic */ byte a;
    public final bae b;
    public final izr0 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public gtf1 h;
    public byte i;
    public int j;
    public boolean k;
    public long l;
    public ie30 m;
    public int n;
    public long o;

    public ua(byte b, int i, String str, String str2) {
        this.a = b;
        switch (b) {
            case 1:
                bae baeVar = new bae(new byte[16], 16);
                this.b = baeVar;
                this.c = new izr0(baeVar.b);
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                bae baeVar2 = new bae(new byte[SemanticState.Focused], SemanticState.Focused);
                this.b = baeVar2;
                this.c = new izr0(baeVar2.b);
                this.i = (byte) 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:186:0x0371  */
    /* JADX WARN: Code duplicated, block: B:188:0x0379  */
    /* JADX WARN: Code duplicated, block: B:195:0x038d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0391  */
    /* JADX WARN: Code duplicated, block: B:198:0x0396  */
    /* JADX WARN: Code duplicated, block: B:200:0x0399  */
    /* JADX WARN: Code duplicated, block: B:202:0x039f  */
    /* JADX WARN: Code duplicated, block: B:204:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:332:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13261. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:61)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:298)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
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
        int i;
        int i2;
        int i3;
        String str;
        int iG;
        int i4;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j;
        izr0Var = izr0Var;
        byte b2 = this.a;
        int i18 = this.e;
        String str2 = this.d;
        String str3 = this.f;
        bae baeVar = this.b;
        long j2 = -9223372036854775807L;
        byte b3 = 0;
        byte b4 = 1;
        byte b5 = 2;
        izr0 izr0Var2 = this.c;
        int i19 = 16;
        switch (b2) {
            case 0:
                this.h.getClass();
                while (izr0Var.a() > 0) {
                    byte b6 = this.i;
                    if (b6 == 0) {
                        while (true) {
                            if (izr0Var.a() <= 0) {
                                b3 = 0;
                                b4 = 1;
                                b5 = 2;
                            } else if (this.k) {
                                int iE = izr0Var.E();
                                if (iE == 119) {
                                    this.k = false;
                                    this.i = (byte) 1;
                                    byte[] bArr = izr0Var2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                    b5 = 2;
                                    b3 = 0;
                                    b4 = 1;
                                } else {
                                    this.k = iE == 11;
                                }
                            } else {
                                this.k = izr0Var.E() == 11;
                            }
                        }
                    } else if (b6 == b4) {
                        byte[] bArr2 = izr0Var2.a;
                        int iMin = Math.min(izr0Var.a(), 128 - this.j);
                        izr0Var.o(this.j, bArr2, iMin);
                        int i20 = this.j + iMin;
                        this.j = i20;
                        if (i20 == 128) {
                            baeVar.m(b3);
                            int iE2 = baeVar.e();
                            baeVar.o(40);
                            byte b7 = baeVar.g(5) > 10 ? b4 : b3;
                            baeVar.m(iE2);
                            int[] iArr = sj1.d;
                            int[] iArr2 = sj1.b;
                            if (b7 != 0) {
                                baeVar.o(i19);
                                int iG2 = baeVar.g(b5);
                                if (iG2 == 0) {
                                    b = 0;
                                } else if (iG2 != b4) {
                                    b = iG2 != b5 ? (byte) -1 : b5;
                                } else {
                                    b = b4;
                                }
                                baeVar.o(3);
                                iG = (baeVar.g(11) + b4) * b5;
                                int iG3 = baeVar.g(b5);
                                if (iG3 == 3) {
                                    i6 = sj1.c[baeVar.g(b5)];
                                    i7 = 3;
                                    i8 = 6;
                                } else {
                                    int iG4 = baeVar.g(b5);
                                    int i21 = sj1.a[iG4];
                                    i6 = iArr2[iG3];
                                    i7 = iG4;
                                    i8 = i21;
                                }
                                i3 = i8 * SemanticState.Hidden;
                                int i22 = (iG * i6) / (i8 * 32);
                                int iG5 = baeVar.g(3);
                                boolean zF = baeVar.f();
                                i2 = iArr[iG5] + (zF ? 1 : 0);
                                baeVar.o(10);
                                if (baeVar.f()) {
                                    i9 = 8;
                                    baeVar.o(8);
                                } else {
                                    i9 = 8;
                                }
                                if (iG5 == 0) {
                                    baeVar.o(5);
                                    if (baeVar.f()) {
                                        baeVar.o(i9);
                                    }
                                }
                                if (b == 1 && baeVar.f()) {
                                    baeVar.o(16);
                                }
                                if (baeVar.f()) {
                                    if (iG5 > 2) {
                                        baeVar.o(2);
                                    }
                                    if ((iG5 & 1) == 0 || iG5 <= 2) {
                                        i13 = 6;
                                    } else {
                                        i13 = 6;
                                        baeVar.o(6);
                                    }
                                    if ((iG5 & 4) != 0) {
                                        baeVar.o(i13);
                                    }
                                    if (zF && baeVar.f()) {
                                        baeVar.o(5);
                                    }
                                    if (b != 0) {
                                        i10 = i7;
                                    } else {
                                        if (baeVar.f()) {
                                            i14 = 6;
                                            baeVar.o(6);
                                        } else {
                                            i14 = 6;
                                        }
                                        if (iG5 == 0 && baeVar.f()) {
                                            baeVar.o(i14);
                                        }
                                        if (baeVar.f()) {
                                            baeVar.o(i14);
                                        }
                                        int iG6 = baeVar.g(2);
                                        if (iG6 == 1) {
                                            baeVar.o(5);
                                        } else if (iG6 == 2) {
                                            baeVar.o(12);
                                        } else {
                                            if (iG6 == 3) {
                                                int iG7 = baeVar.g(5);
                                                if (baeVar.f()) {
                                                    baeVar.o(5);
                                                    if (baeVar.f()) {
                                                        i16 = 4;
                                                        baeVar.o(4);
                                                    } else {
                                                        i16 = 4;
                                                    }
                                                    if (baeVar.f()) {
                                                        baeVar.o(i16);
                                                    }
                                                    if (baeVar.f()) {
                                                        baeVar.o(i16);
                                                    }
                                                    if (baeVar.f()) {
                                                        baeVar.o(i16);
                                                    }
                                                    if (baeVar.f()) {
                                                        baeVar.o(i16);
                                                    }
                                                    if (baeVar.f()) {
                                                        baeVar.o(i16);
                                                    }
                                                    if (baeVar.f()) {
                                                        baeVar.o(i16);
                                                    }
                                                    if (baeVar.f()) {
                                                        if (baeVar.f()) {
                                                            baeVar.o(i16);
                                                        }
                                                        if (baeVar.f()) {
                                                            baeVar.o(i16);
                                                        }
                                                    }
                                                }
                                                if (baeVar.f()) {
                                                    baeVar.o(5);
                                                    if (baeVar.f()) {
                                                        baeVar.o(7);
                                                        if (baeVar.f()) {
                                                            baeVar.o(8);
                                                            i15 = 2;
                                                        } else {
                                                            i15 = 2;
                                                        }
                                                    } else {
                                                        i15 = 2;
                                                    }
                                                } else {
                                                    i15 = 2;
                                                }
                                                baeVar.o((iG7 + i15) * 8);
                                                baeVar.c();
                                            }
                                            if (iG5 < i15) {
                                                if (baeVar.f()) {
                                                    baeVar.o(14);
                                                }
                                                if (iG5 == 0 && baeVar.f()) {
                                                    baeVar.o(14);
                                                }
                                            }
                                            if (baeVar.f()) {
                                                i10 = i7;
                                                if (i10 == 0) {
                                                    baeVar.o(5);
                                                } else {
                                                    for (i17 = 0; i17 < i8; i17++) {
                                                        if (baeVar.f()) {
                                                            baeVar.o(5);
                                                        }
                                                    }
                                                }
                                            } else {
                                                i10 = i7;
                                            }
                                        }
                                        i15 = 2;
                                        if (iG5 < i15) {
                                            if (baeVar.f()) {
                                                baeVar.o(14);
                                            }
                                            if (iG5 == 0) {
                                                baeVar.o(14);
                                            }
                                        }
                                        if (baeVar.f()) {
                                            i10 = i7;
                                            if (i10 == 0) {
                                                baeVar.o(5);
                                            } else {
                                                while (i17 < i8) {
                                                    if (baeVar.f()) {
                                                        baeVar.o(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i10 = i7;
                                        }
                                    }
                                } else {
                                    i10 = i7;
                                }
                                if (baeVar.f()) {
                                    baeVar.o(5);
                                    if (iG5 == 2) {
                                        baeVar.o(4);
                                    }
                                    if (iG5 >= 6) {
                                        baeVar.o(2);
                                    }
                                    if (baeVar.f()) {
                                        baeVar.o(8);
                                    }
                                    if (iG5 == 0 && baeVar.f()) {
                                        baeVar.o(8);
                                    }
                                    i11 = 3;
                                    if (iG3 < 3) {
                                        baeVar.n();
                                    }
                                } else {
                                    i11 = 3;
                                }
                                if (b == 0 && i10 != i11) {
                                    baeVar.n();
                                }
                                if (b == 2 && (i10 == i11 || baeVar.f())) {
                                    i12 = 6;
                                    baeVar.o(6);
                                } else {
                                    i12 = 6;
                                }
                                str = (baeVar.f() && baeVar.g(i12) == 1 && baeVar.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i5 = i6;
                                i4 = i22;
                            } else {
                                baeVar.o(32);
                                int iG8 = baeVar.g(2);
                                String str4 = iG8 == 3 ? null : "audio/ac3";
                                int iG9 = baeVar.g(6);
                                int i23 = sj1.e[iG9 / 2] * 1000;
                                int iS = sj1.s(iG8, iG9);
                                baeVar.o(8);
                                int iG10 = baeVar.g(3);
                                if ((iG10 & 1) == 0 || iG10 == 1) {
                                    i = 2;
                                } else {
                                    i = 2;
                                    baeVar.o(2);
                                }
                                if ((iG10 & 4) != 0) {
                                    baeVar.o(i);
                                }
                                if (iG10 == i) {
                                    baeVar.o(i);
                                }
                                int i24 = iG8 < 3 ? iArr2[iG8] : -1;
                                i2 = iArr[iG10] + (baeVar.f() ? 1 : 0);
                                i3 = 1536;
                                str = str4;
                                iG = iS;
                                i4 = i23;
                                i5 = i24;
                            }
                            int i25 = i2;
                            ie30 ie30Var = this.m;
                            if (ie30Var == null || i25 != ie30Var.J || i5 != ie30Var.L || !Objects.equals(str, ie30Var.f66p)) {
                                ge30 ge30Var = new ge30();
                                ge30Var.a = this.g;
                                ge30Var.n = asj0.p(str3);
                                ge30Var.o = asj0.p(str);
                                ge30Var.I = i25;
                                ge30Var.K = i5;
                                ge30Var.d = str2;
                                ge30Var.f = i18;
                                ge30Var.j = i4;
                                if ("audio/ac3".equals(str)) {
                                    ge30Var.i = i4;
                                }
                                ie30 ie30Var2 = new ie30(ge30Var);
                                this.m = ie30Var2;
                                this.h.a(ie30Var2);
                            }
                            this.n = iG;
                            this.l = (((long) i3) * 1000000) / ((long) this.m.L);
                            izr0Var2.R(0);
                            this.h.f(SemanticState.Focused, izr0Var2);
                            this.i = (byte) 2;
                            b5 = 2;
                            b3 = 0;
                            b4 = 1;
                        } else {
                            izr0Var = izr0Var;
                        }
                    } else if (b6 == b5) {
                        int iMin2 = Math.min(izr0Var.a(), this.n - this.j);
                        this.h.f(iMin2, izr0Var);
                        int i26 = this.j + iMin2;
                        this.j = i26;
                        if (i26 == this.n) {
                            dm5.y(this.o != -9223372036854775807L ? b4 : b3);
                            this.h.b(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = b3;
                        }
                    }
                    i19 = 16;
                }
                break;
            default:
                this.h.getClass();
                while (izr0Var.a() > 0) {
                    byte b8 = this.i;
                    if (b8 == 0) {
                        j = j2;
                        while (izr0Var.a() > 0) {
                            if (this.k) {
                                int iE3 = izr0Var.E();
                                this.k = iE3 == 172;
                                if (iE3 == 64 || iE3 == 65) {
                                    Object[] objArr = iE3 == 65;
                                    this.i = (byte) 1;
                                    byte[] bArr3 = izr0Var2.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = izr0Var.E() == 172;
                            }
                        }
                    } else if (b8 == 1) {
                        j = j2;
                        byte[] bArr4 = izr0Var2.a;
                        int iMin3 = Math.min(izr0Var.a(), 16 - this.j);
                        izr0Var.o(this.j, bArr4, iMin3);
                        int i27 = this.j + iMin3;
                        this.j = i27;
                        if (i27 == 16) {
                            baeVar.m(0);
                            xa xaVarJ = j82.J(baeVar);
                            int i28 = xaVarJ.a;
                            ie30 ie30Var3 = this.m;
                            if (ie30Var3 == null || 2 != ie30Var3.J || i28 != ie30Var3.L || !"audio/ac4".equals(ie30Var3.f66p)) {
                                ge30 ge30Var2 = new ge30();
                                ge30Var2.a = this.g;
                                ge30Var2.n = asj0.p(str3);
                                ge30Var2.o = asj0.p("audio/ac4");
                                ge30Var2.I = 2;
                                ge30Var2.K = i28;
                                ge30Var2.d = str2;
                                ge30Var2.f = i18;
                                ie30 ie30Var4 = new ie30(ge30Var2);
                                this.m = ie30Var4;
                                this.h.a(ie30Var4);
                            }
                            this.n = xaVarJ.b;
                            this.l = (((long) xaVarJ.c) * 1000000) / ((long) this.m.L);
                            izr0Var2.R(0);
                            this.h.f(16, izr0Var2);
                            this.i = (byte) 2;
                        }
                    } else if (b8 == 2) {
                        int iMin4 = Math.min(izr0Var.a(), this.n - this.j);
                        this.h.f(iMin4, izr0Var);
                        int i29 = this.j + iMin4;
                        this.j = i29;
                        if (i29 == this.n) {
                            dm5.y(this.o != j2);
                            j = j2;
                            this.h.b(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = (byte) 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // p.ytw
    public final void b() {
        switch (this.a) {
            case 0:
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // p.ytw
    public final void d(gc10 gc10Var, wwg1 wwg1Var) {
        switch (this.a) {
            case 0:
                wwg1Var.a();
                wwg1Var.b();
                this.g = wwg1Var.e;
                wwg1Var.b();
                this.h = gc10Var.w(wwg1Var.d, 1);
                break;
            default:
                wwg1Var.a();
                wwg1Var.b();
                this.g = wwg1Var.e;
                wwg1Var.b();
                this.h = gc10Var.w(wwg1Var.d, 1);
                break;
        }
    }

    @Override // p.ytw
    public final void f(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ua(String str) {
        this((byte) 0, 0, null, str);
        this.a = (byte) 0;
    }
}
