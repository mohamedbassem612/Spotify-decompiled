package p;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jr50 implements ytw {
    public final gt51 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public gtf1 j;
    public ir50 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final sin0 d = new sin0(7);
    public final sin0 e = new sin0(8);
    public final sin0 f = new sin0(6);
    public long m = -9223372036854775807L;
    public final izr0 o = new izr0();

    public jr50(gt51 gt51Var, boolean z, boolean z2) {
        this.a = gt51Var;
        this.b = z;
        this.c = z2;
    }

    @Override // p.ytw
    public final void a(izr0 izr0Var) {
        int i;
        this.j.getClass();
        String str = zoi1.a;
        int i2 = izr0Var.b;
        int i3 = izr0Var.c;
        byte[] bArr = izr0Var.a;
        this.g += (long) izr0Var.a();
        this.j.f(izr0Var.a(), izr0Var);
        while (true) {
            int iO = mqn1.o(bArr, i2, i3, this.h);
            if (iO == i3) {
                this.h(i2, bArr, i3);
                return;
            }
            int i4 = bArr[iO + 3] & 31;
            if (iO <= 0 || bArr[iO - 1] != 0) {
                i = 3;
            } else {
                iO--;
                i = 4;
            }
            int i5 = iO - i2;
            if (i5 > 0) {
                this.h(i2, bArr, iO);
            }
            int i6 = i3 - iO;
            long j = this.g - ((long) i6);
            jr50 jr50Var = this;
            jr50Var.g(j, this.m, i6, i5 < 0 ? -i5 : 0);
            jr50Var.i(i4, j, jr50Var.m);
            i2 = iO + i;
            this = jr50Var;
        }
    }

    @Override // p.ytw
    public final void b() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        mqn1.k(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.d.o(0);
        ir50 ir50Var = this.k;
        if (ir50Var != null) {
            ir50Var.k = false;
            ir50Var.o = false;
            hr50 hr50Var = ir50Var.n;
            hr50Var.b = false;
            hr50Var.a = false;
        }
    }

    @Override // p.ytw
    public final void c() {
        this.j.getClass();
        String str = zoi1.a;
        this.a.d.o(0);
        g(this.g, this.m, 0, 0);
        i(9, this.g, this.m);
        g(this.g, this.m, 0, 0);
    }

    @Override // p.ytw
    public final void d(gc10 gc10Var, wwg1 wwg1Var) {
        wwg1Var.a();
        wwg1Var.b();
        this.i = wwg1Var.e;
        wwg1Var.b();
        gtf1 gtf1VarW = gc10Var.w(wwg1Var.d, 2);
        this.j = gtf1VarW;
        this.k = new ir50(gtf1VarW, this.b, this.c);
        this.a.b(gc10Var, wwg1Var);
    }

    @Override // p.ytw
    public final void f(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0200  */
    /* JADX WARN: Code duplicated, block: B:92:0x023d  */
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
    public final void g(long j, long j2, int i, int i2) {
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        t01 t01Var = this.a.d;
        if (!this.l || this.k.c) {
            sin0 sin0Var = this.d;
            sin0Var.b(i2);
            sin0 sin0Var2 = this.e;
            sin0Var2.b(i2);
            boolean z4 = this.l;
            boolean z5 = sin0Var.c;
            if (z4) {
                if (z5) {
                    zin0 zin0VarB = mqn1.B(3, sin0Var.d, sin0Var.e);
                    t01Var.F(zin0VarB.s);
                    this.k.d.append(zin0VarB.d, zin0VarB);
                    sin0Var.c();
                } else if (sin0Var2.c) {
                    k4w k4wVar = new k4w(sin0Var2.d, 4, sin0Var2.e);
                    int iQ = k4wVar.q();
                    int iQ2 = k4wVar.q();
                    k4wVar.z();
                    this.k.e.append(iQ, new yin0(iQ, iQ2, k4wVar.o()));
                    sin0Var2.c();
                }
            } else if (z5 && sin0Var2.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(sin0Var.d, sin0Var.e));
                arrayList.add(Arrays.copyOf(sin0Var2.d, sin0Var2.e));
                zin0 zin0VarB2 = mqn1.B(3, sin0Var.d, sin0Var.e);
                int i8 = zin0VarB2.s;
                k4w k4wVar2 = new k4w(sin0Var2.d, 4, sin0Var2.e);
                int iQ3 = k4wVar2.q();
                int iQ4 = k4wVar2.q();
                k4wVar2.z();
                yin0 yin0Var = new yin0(iQ3, iQ4, k4wVar2.o());
                int i9 = zin0VarB2.a;
                int i10 = zin0VarB2.b;
                int i11 = zin0VarB2.c;
                byte[] bArr = kwg.a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
                gtf1 gtf1Var = this.j;
                ge30 ge30Var = new ge30();
                ge30Var.a = this.i;
                ge30Var.n = asj0.p("video/mp2t");
                ge30Var.o = asj0.p("video/avc");
                ge30Var.k = str;
                ge30Var.v = zin0VarB2.e;
                ge30Var.w = zin0VarB2.f;
                ge30Var.G = new x8h(zin0VarB2.f185p, zin0VarB2.q, zin0VarB2.r, null, zin0VarB2.h + 8, zin0VarB2.i + 8);
                ge30Var.D = zin0VarB2.g;
                ge30Var.r = arrayList;
                ge30Var.q = i8;
                xvj1.q(ge30Var, gtf1Var);
                this.l = true;
                t01Var.F(i8);
                this.k.d.append(zin0VarB2.d, zin0VarB2);
                this.k.e.append(iQ3, yin0Var);
                sin0Var.c();
                sin0Var2.c();
            }
        }
        sin0 sin0Var3 = this.f;
        if (sin0Var3.b(i2)) {
            int iK = mqn1.K(sin0Var3.d, sin0Var3.e);
            byte[] bArr2 = sin0Var3.d;
            izr0 izr0Var = this.o;
            izr0Var.P(bArr2, iK);
            izr0Var.R(4);
            t01Var.a(j2, izr0Var);
        }
        ir50 ir50Var = this.k;
        boolean z6 = this.l;
        if (ir50Var.i == 9) {
            if (z6 && ir50Var.o) {
                j3 = ir50Var.j;
                i3 = i + ((int) (j - j3));
                j4 = ir50Var.q;
                if (j4 != -9223372036854775807L) {
                    j5 = ir50Var.f73p;
                    if (j3 != j5) {
                        ir50Var.a.b(j4, ir50Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                    }
                }
            }
            ir50Var.f73p = ir50Var.j;
            ir50Var.q = ir50Var.l;
            ir50Var.r = false;
            ir50Var.o = true;
        } else if (ir50Var.c) {
            hr50 hr50Var = ir50Var.n;
            hr50 hr50Var2 = ir50Var.m;
            if (hr50Var.a) {
                if (hr50Var2.a) {
                    zin0 zin0Var = hr50Var.c;
                    zin0Var.getClass();
                    zin0 zin0Var2 = hr50Var2.c;
                    zin0Var2.getClass();
                    int i12 = zin0Var2.m;
                    if (hr50Var.f != hr50Var2.f || hr50Var.g != hr50Var2.g || hr50Var.h != hr50Var2.h || ((hr50Var.i && hr50Var2.i && hr50Var.j != hr50Var2.j) || (((i5 = hr50Var.d) != (i6 = hr50Var2.d) && (i5 == 0 || i6 == 0)) || (((i7 = zin0Var.m) == 0 && i12 == 0 && (hr50Var.m != hr50Var2.m || hr50Var.n != hr50Var2.n)) || ((i7 == 1 && i12 == 1 && (hr50Var.o != hr50Var2.o || hr50Var.f65p != hr50Var2.f65p)) || (z3 = hr50Var.k) != hr50Var2.k || (z3 && hr50Var.l != hr50Var2.l)))))) {
                        if (z6) {
                            j3 = ir50Var.j;
                            i3 = i + ((int) (j - j3));
                            j4 = ir50Var.q;
                            if (j4 != -9223372036854775807L) {
                                j5 = ir50Var.f73p;
                                if (j3 != j5) {
                                    ir50Var.a.b(j4, ir50Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                                }
                            }
                        }
                        ir50Var.f73p = ir50Var.j;
                        ir50Var.q = ir50Var.l;
                        ir50Var.r = false;
                        ir50Var.o = true;
                    }
                } else {
                    if (z6) {
                        j3 = ir50Var.j;
                        i3 = i + ((int) (j - j3));
                        j4 = ir50Var.q;
                        if (j4 != -9223372036854775807L) {
                            j5 = ir50Var.f73p;
                            if (j3 != j5) {
                                ir50Var.a.b(j4, ir50Var.r ? 1 : 0, (int) (j3 - j5), i3, null);
                            }
                        }
                    }
                    ir50Var.f73p = ir50Var.j;
                    ir50Var.q = ir50Var.l;
                    ir50Var.r = false;
                    ir50Var.o = true;
                }
            }
        }
        if (ir50Var.b) {
            hr50 hr50Var3 = ir50Var.n;
            z = hr50Var3.b && ((i4 = hr50Var3.e) == 7 || i4 == 2);
        } else {
            z = ir50Var.s;
        }
        boolean z7 = ir50Var.r;
        int i13 = ir50Var.i;
        if (i13 == 5) {
            z2 = true;
        } else if (z) {
            z2 = true;
            if (i13 != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z8 = z7 | z2;
        ir50Var.r = z8;
        ir50Var.i = 24;
        if (z8) {
            this.n = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    public final void h(int i, byte[] bArr, int i2) {
        boolean zO;
        boolean zO2;
        boolean z;
        boolean z2;
        int iQ;
        int i3;
        int iP;
        int i4;
        int iR;
        int iR2;
        if (!this.l || this.k.c) {
            this.d.a(i, bArr, i2);
            this.e.a(i, bArr, i2);
        }
        this.f.a(i, bArr, i2);
        ir50 ir50Var = this.k;
        SparseArray sparseArray = ir50Var.e;
        k4w k4wVar = ir50Var.f;
        if (ir50Var.k) {
            int i5 = i2 - i;
            byte[] bArrCopyOf = ir50Var.g;
            int length = bArrCopyOf.length;
            int i6 = ir50Var.h + i5;
            if (length < i6) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6 * 2);
                ir50Var.g = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, ir50Var.h, i5);
            int i7 = ir50Var.h + i5;
            ir50Var.h = i7;
            k4wVar.f = ir50Var.g;
            k4wVar.c = 0;
            k4wVar.d = 0;
            k4wVar.b = i7;
            k4wVar.e = 0;
            k4wVar.a();
            if (k4wVar.b(8)) {
                k4wVar.z();
                int iP2 = k4wVar.p(2);
                k4wVar.A(5);
                if (k4wVar.c()) {
                    k4wVar.q();
                    if (k4wVar.c()) {
                        int iQ2 = k4wVar.q();
                        if (!ir50Var.c) {
                            ir50Var.k = false;
                            hr50 hr50Var = ir50Var.n;
                            hr50Var.e = iQ2;
                            hr50Var.b = true;
                            return;
                        }
                        if (k4wVar.c()) {
                            int iQ3 = k4wVar.q();
                            if (sparseArray.indexOfKey(iQ3) < 0) {
                                ir50Var.k = false;
                                return;
                            }
                            yin0 yin0Var = (yin0) sparseArray.get(iQ3);
                            SparseArray sparseArray2 = ir50Var.d;
                            int i8 = yin0Var.a;
                            boolean z3 = yin0Var.b;
                            zin0 zin0Var = (zin0) sparseArray2.get(i8);
                            boolean z4 = zin0Var.j;
                            int i9 = zin0Var.n;
                            int i10 = zin0Var.l;
                            if (z4) {
                                if (!k4wVar.b(2)) {
                                    return;
                                } else {
                                    k4wVar.A(2);
                                }
                            }
                            if (k4wVar.b(i10)) {
                                int iP3 = k4wVar.p(i10);
                                if (!zin0Var.k) {
                                    if (k4wVar.b(1)) {
                                        zO = k4wVar.o();
                                        if (!zO) {
                                            zO2 = false;
                                        } else {
                                            if (!k4wVar.b(1)) {
                                                return;
                                            }
                                            zO2 = k4wVar.o();
                                            z = true;
                                        }
                                        if (ir50Var.i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iQ = 0;
                                        } else if (!k4wVar.c()) {
                                            return;
                                        } else {
                                            iQ = k4wVar.q();
                                        }
                                        i3 = zin0Var.m;
                                        if (i3 != 0) {
                                            if (k4wVar.b(i9)) {
                                                iP = k4wVar.p(i9);
                                                if (!z3 && !zO) {
                                                    if (!k4wVar.c()) {
                                                        return;
                                                    }
                                                    iR2 = k4wVar.r();
                                                    i4 = 0;
                                                }
                                                iR = 0;
                                                hr50 hr50Var2 = ir50Var.n;
                                                hr50Var2.c = zin0Var;
                                                hr50Var2.d = iP2;
                                                hr50Var2.e = iQ2;
                                                hr50Var2.f = iP3;
                                                hr50Var2.g = iQ3;
                                                hr50Var2.h = zO;
                                                hr50Var2.i = z;
                                                hr50Var2.j = zO2;
                                                hr50Var2.k = z2;
                                                hr50Var2.l = iQ;
                                                hr50Var2.m = iP;
                                                hr50Var2.n = iR2;
                                                hr50Var2.o = i4;
                                                hr50Var2.f65p = iR;
                                                hr50Var2.a = true;
                                                hr50Var2.b = true;
                                                ir50Var.k = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || zin0Var.o) {
                                            iP = 0;
                                        } else {
                                            if (!k4wVar.c()) {
                                                return;
                                            }
                                            int iR3 = k4wVar.r();
                                            if (!z3 || zO) {
                                                i4 = iR3;
                                                iP = 0;
                                                iR2 = 0;
                                                iR = 0;
                                            } else {
                                                if (!k4wVar.c()) {
                                                    return;
                                                }
                                                iR = k4wVar.r();
                                                iR2 = 0;
                                                i4 = iR3;
                                                iP = 0;
                                            }
                                        }
                                        hr50 hr50Var3 = ir50Var.n;
                                        hr50Var3.c = zin0Var;
                                        hr50Var3.d = iP2;
                                        hr50Var3.e = iQ2;
                                        hr50Var3.f = iP3;
                                        hr50Var3.g = iQ3;
                                        hr50Var3.h = zO;
                                        hr50Var3.i = z;
                                        hr50Var3.j = zO2;
                                        hr50Var3.k = z2;
                                        hr50Var3.l = iQ;
                                        hr50Var3.m = iP;
                                        hr50Var3.n = iR2;
                                        hr50Var3.o = i4;
                                        hr50Var3.f65p = iR;
                                        hr50Var3.a = true;
                                        hr50Var3.b = true;
                                        ir50Var.k = false;
                                        i4 = 0;
                                        iR2 = 0;
                                        iR = 0;
                                        hr50 hr50Var4 = ir50Var.n;
                                        hr50Var4.c = zin0Var;
                                        hr50Var4.d = iP2;
                                        hr50Var4.e = iQ2;
                                        hr50Var4.f = iP3;
                                        hr50Var4.g = iQ3;
                                        hr50Var4.h = zO;
                                        hr50Var4.i = z;
                                        hr50Var4.j = zO2;
                                        hr50Var4.k = z2;
                                        hr50Var4.l = iQ;
                                        hr50Var4.m = iP;
                                        hr50Var4.n = iR2;
                                        hr50Var4.o = i4;
                                        hr50Var4.f65p = iR;
                                        hr50Var4.a = true;
                                        hr50Var4.b = true;
                                        ir50Var.k = false;
                                    }
                                    return;
                                }
                                zO = false;
                                zO2 = false;
                                z = zO2;
                                if (ir50Var.i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iQ = 0;
                                } else if (!k4wVar.c()) {
                                    return;
                                } else {
                                    iQ = k4wVar.q();
                                }
                                i3 = zin0Var.m;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                    }
                                    iP = 0;
                                } else {
                                    if (k4wVar.b(i9)) {
                                        return;
                                    }
                                    iP = k4wVar.p(i9);
                                    if (!z3) {
                                    }
                                }
                                i4 = 0;
                                iR2 = 0;
                                iR = 0;
                                hr50 hr50Var5 = ir50Var.n;
                                hr50Var5.c = zin0Var;
                                hr50Var5.d = iP2;
                                hr50Var5.e = iQ2;
                                hr50Var5.f = iP3;
                                hr50Var5.g = iQ3;
                                hr50Var5.h = zO;
                                hr50Var5.i = z;
                                hr50Var5.j = zO2;
                                hr50Var5.k = z2;
                                hr50Var5.l = iQ;
                                hr50Var5.m = iP;
                                hr50Var5.n = iR2;
                                hr50Var5.o = i4;
                                hr50Var5.f65p = iR;
                                hr50Var5.a = true;
                                hr50Var5.b = true;
                                ir50Var.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void i(int i, long j, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        ir50 ir50Var = this.k;
        boolean z = this.n;
        ir50Var.i = i;
        ir50Var.l = j2;
        ir50Var.j = j;
        ir50Var.s = z;
        if (!ir50Var.b || i != 1) {
            if (!ir50Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        hr50 hr50Var = ir50Var.m;
        ir50Var.m = ir50Var.n;
        ir50Var.n = hr50Var;
        hr50Var.b = false;
        hr50Var.a = false;
        ir50Var.h = 0;
        ir50Var.k = true;
    }
}
