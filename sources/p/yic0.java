package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yic0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f148p = false;
    public static int q = 1000;
    public final znw0 c;
    public c46[] f;
    public final cab l;
    public c46 o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public p6a1[] m = new p6a1[q];
    public int n = 0;

    public yic0() {
        this.f = null;
        this.f = new c46[32];
        s();
        cab cabVar = new cab();
        this.l = cabVar;
        znw0 znw0Var = new znw0(cabVar);
        znw0Var.f = new p6a1[128];
        znw0Var.g = 0;
        znw0Var.h = new yqu0(znw0Var);
        this.c = znw0Var;
        this.o = new c46(cabVar);
    }

    public static int n(Object obj) {
        p6a1 p6a1Var = ((lhl) obj).i;
        if (p6a1Var != null) {
            return (int) (p6a1Var.e + 0.5f);
        }
        return 0;
    }

    public final p6a1 a(int i) {
        p6a1 p6a1Var = (p6a1) ((sw9) this.l.c).t();
        if (p6a1Var == null) {
            p6a1Var = new p6a1(i);
            p6a1Var.Y = i;
        } else {
            p6a1Var.c();
            p6a1Var.Y = i;
        }
        int i2 = this.n;
        int i3 = q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            q = i4;
            this.m = (p6a1[]) Arrays.copyOf(this.m, i4);
        }
        p6a1[] p6a1VarArr = this.m;
        int i5 = this.n;
        this.n = i5 + 1;
        p6a1VarArr[i5] = p6a1Var;
        return p6a1Var;
    }

    public final void b(p6a1 p6a1Var, p6a1 p6a1Var2, int i, float f, p6a1 p6a1Var3, p6a1 p6a1Var4, int i2, int i3) {
        c46 c46VarL = l();
        if (p6a1Var2 == p6a1Var3) {
            c46VarL.d.g(p6a1Var, 1.0f);
            c46VarL.d.g(p6a1Var4, 1.0f);
            c46VarL.d.g(p6a1Var2, -2.0f);
        } else {
            o36 o36Var = c46VarL.d;
            if (f == 0.5f) {
                o36Var.g(p6a1Var, 1.0f);
                c46VarL.d.g(p6a1Var2, -1.0f);
                c46VarL.d.g(p6a1Var3, -1.0f);
                c46VarL.d.g(p6a1Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    c46VarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                o36Var.g(p6a1Var, -1.0f);
                c46VarL.d.g(p6a1Var2, 1.0f);
                c46VarL.b = i;
            } else if (f >= 1.0f) {
                o36Var.g(p6a1Var4, -1.0f);
                c46VarL.d.g(p6a1Var3, 1.0f);
                c46VarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                o36Var.g(p6a1Var, f2 * 1.0f);
                c46VarL.d.g(p6a1Var2, f2 * (-1.0f));
                c46VarL.d.g(p6a1Var3, (-1.0f) * f);
                c46VarL.d.g(p6a1Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c46VarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            c46VarL.a(this, i3);
        }
        c(c46VarL);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    public final void c(c46 c46Var) {
        boolean z;
        boolean z2;
        p6a1 p6a1VarF;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            o();
        }
        if (c46Var.e) {
            z = false;
        } else {
            ArrayList arrayList = c46Var.c;
            if (this.f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iD = c46Var.d.d();
                    for (int i = 0; i < iD; i++) {
                        p6a1 p6a1VarE = c46Var.d.e(i);
                        if (p6a1VarE.c != -1 || p6a1VarE.f) {
                            arrayList.add(p6a1VarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            p6a1 p6a1Var = (p6a1) arrayList.get(i2);
                            if (p6a1Var.f) {
                                c46Var.h(this, p6a1Var, true);
                            } else {
                                c46Var.i(this, this.f[p6a1Var.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (c46Var.a != null && c46Var.d.d() == 0) {
                    c46Var.e = true;
                    this.a = true;
                }
            }
            if (c46Var.e()) {
                return;
            }
            float f = c46Var.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                c46Var.b = f * (-1.0f);
                o36 o36Var = c46Var.d;
                int i3 = o36Var.h;
                for (int i4 = 0; i3 != -1 && i4 < o36Var.a; i4++) {
                    float[] fArr = o36Var.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = o36Var.f[i3];
                }
            }
            int iD2 = c46Var.d.d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            p6a1 p6a1Var2 = null;
            p6a1 p6a1Var3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iD2) {
                float f5 = c46Var.d.f(i5);
                p6a1 p6a1VarE2 = c46Var.d.e(i5);
                float f6 = f2;
                if (p6a1VarE2.Y == 1) {
                    if (p6a1Var2 == null) {
                        if (p6a1VarE2.X <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        p6a1Var2 = p6a1VarE2;
                        f3 = f5;
                    } else {
                        if (f3 > f5) {
                            if (p6a1VarE2.X > 1) {
                                z4 = false;
                            }
                            p6a1Var2 = p6a1VarE2;
                            f3 = f5;
                        } else if (z4 || p6a1VarE2.X > 1) {
                        }
                        z4 = true;
                        p6a1Var2 = p6a1VarE2;
                        f3 = f5;
                    }
                } else if (p6a1Var2 == null && f5 < f6) {
                    if (p6a1Var3 == null) {
                        if (p6a1VarE2.X <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        p6a1Var3 = p6a1VarE2;
                        f4 = f5;
                    } else {
                        if (f4 > f5) {
                            if (p6a1VarE2.X > 1) {
                                z5 = false;
                            }
                            p6a1Var3 = p6a1VarE2;
                            f4 = f5;
                        } else if (z5 || p6a1VarE2.X > 1) {
                        }
                        z5 = true;
                        p6a1Var3 = p6a1VarE2;
                        f4 = f5;
                    }
                }
                i5++;
                f2 = f6;
            }
            float f7 = f2;
            if (p6a1Var2 == null) {
                p6a1Var2 = p6a1Var3;
            }
            if (p6a1Var2 == null) {
                z2 = true;
            } else {
                c46Var.g(p6a1Var2);
                z2 = false;
            }
            if (c46Var.d.d() == 0) {
                c46Var.e = true;
            }
            if (z2) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                p6a1 p6a1VarA = a(3);
                int i6 = this.b + 1;
                this.b = i6;
                this.i++;
                p6a1VarA.b = i6;
                cab cabVar = this.l;
                ((p6a1[]) cabVar.d)[i6] = p6a1VarA;
                c46Var.a = p6a1VarA;
                int i7 = this.j;
                h(c46Var);
                if (this.j == i7 + 1) {
                    c46 c46Var2 = this.o;
                    c46Var2.a = null;
                    c46Var2.d.b();
                    for (int i8 = 0; i8 < c46Var.d.d(); i8++) {
                        c46Var2.d.a(c46Var.d.e(i8), c46Var.d.f(i8), true);
                    }
                    r(this.o);
                    if (p6a1VarA.c == -1) {
                        if (c46Var.a == p6a1VarA && (p6a1VarF = c46Var.f(null, p6a1VarA)) != null) {
                            c46Var.g(p6a1VarF);
                        }
                        if (!c46Var.e) {
                            c46Var.a.e(this, c46Var);
                        }
                        ((sw9) cabVar.b).F(c46Var);
                        this.j--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            p6a1 p6a1Var4 = c46Var.a;
            if (p6a1Var4 == null) {
                return;
            }
            if (p6a1Var4.Y != 1 && c46Var.b < f7) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(c46Var);
    }

    public final void d(p6a1 p6a1Var, int i) {
        int i2 = p6a1Var.c;
        if (i2 == -1) {
            p6a1Var.d(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                p6a1 p6a1Var2 = ((p6a1[]) this.l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            c46 c46VarL = l();
            c46VarL.a = p6a1Var;
            float f = i;
            p6a1Var.e = f;
            c46VarL.b = f;
            c46VarL.e = true;
            c(c46VarL);
            return;
        }
        c46 c46Var = this.f[i2];
        if (c46Var.e) {
            c46Var.b = i;
            return;
        }
        if (c46Var.d.d() == 0) {
            c46Var.e = true;
            c46Var.b = i;
            return;
        }
        c46 c46VarL2 = l();
        if (i < 0) {
            c46VarL2.b = i * (-1);
            c46VarL2.d.g(p6a1Var, 1.0f);
        } else {
            c46VarL2.b = i;
            c46VarL2.d.g(p6a1Var, -1.0f);
        }
        c(c46VarL2);
    }

    public final void e(p6a1 p6a1Var, p6a1 p6a1Var2, int i, int i2) {
        if (i2 == 8 && p6a1Var2.f && p6a1Var.c == -1) {
            p6a1Var.d(this, p6a1Var2.e + i);
            return;
        }
        c46 c46VarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c46VarL.b = i;
        }
        o36 o36Var = c46VarL.d;
        if (z) {
            o36Var.g(p6a1Var, 1.0f);
            c46VarL.d.g(p6a1Var2, -1.0f);
        } else {
            o36Var.g(p6a1Var, -1.0f);
            c46VarL.d.g(p6a1Var2, 1.0f);
        }
        if (i2 != 8) {
            c46VarL.a(this, i2);
        }
        c(c46VarL);
    }

    public final void f(p6a1 p6a1Var, p6a1 p6a1Var2, int i, int i2) {
        c46 c46VarL = l();
        p6a1 p6a1VarM = m();
        p6a1VarM.d = 0;
        c46VarL.b(p6a1Var, p6a1Var2, p6a1VarM, i);
        if (i2 != 8) {
            c46VarL.d.g(j(i2), (int) (c46VarL.d.c(p6a1VarM) * (-1.0f)));
        }
        c(c46VarL);
    }

    public final void g(p6a1 p6a1Var, p6a1 p6a1Var2, int i, int i2) {
        c46 c46VarL = l();
        p6a1 p6a1VarM = m();
        p6a1VarM.d = 0;
        c46VarL.c(p6a1Var, p6a1Var2, p6a1VarM, i);
        if (i2 != 8) {
            c46VarL.d.g(j(i2), (int) (c46VarL.d.c(p6a1VarM) * (-1.0f)));
        }
        c(c46VarL);
    }

    public final void h(c46 c46Var) {
        int i;
        if (c46Var.e) {
            c46Var.a.d(this, c46Var.b);
        } else {
            c46[] c46VarArr = this.f;
            int i2 = this.j;
            c46VarArr[i2] = c46Var;
            p6a1 p6a1Var = c46Var.a;
            p6a1Var.c = i2;
            this.j = i2 + 1;
            p6a1Var.e(this, c46Var);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                c46 c46Var2 = this.f[i3];
                if (c46Var2 != null && c46Var2.e) {
                    c46Var2.a.d(this, c46Var2.b);
                    ((sw9) this.l.b).F(c46Var2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        c46[] c46VarArr2 = this.f;
                        int i6 = i4 - 1;
                        c46 c46Var3 = c46VarArr2[i4];
                        c46VarArr2[i6] = c46Var3;
                        p6a1 p6a1Var2 = c46Var3.a;
                        if (p6a1Var2.c == i4) {
                            p6a1Var2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            c46 c46Var = this.f[i];
            c46Var.a.e = c46Var.b;
        }
    }

    public final p6a1 j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        p6a1 p6a1VarA = a(4);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        p6a1VarA.b = i2;
        p6a1VarA.d = i;
        ((p6a1[]) this.l.d)[i2] = p6a1VarA;
        znw0 znw0Var = this.c;
        yqu0 yqu0Var = znw0Var.h;
        yqu0Var.g(p6a1VarA);
        yqu0Var.k();
        p6a1VarA.h[p6a1VarA.d] = 1.0f;
        znw0Var.j(p6a1VarA);
        return p6a1VarA;
    }

    public final p6a1 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof lhl)) {
            return null;
        }
        lhl lhlVar = (lhl) obj;
        p6a1 p6a1Var = lhlVar.i;
        if (p6a1Var == null) {
            lhlVar.k();
            p6a1Var = lhlVar.i;
        }
        int i = p6a1Var.b;
        cab cabVar = this.l;
        if (i != -1 && i <= this.b && ((p6a1[]) cabVar.d)[i] != null) {
            return p6a1Var;
        }
        if (i != -1) {
            p6a1Var.c();
        }
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        p6a1Var.b = i2;
        p6a1Var.Y = 1;
        ((p6a1[]) cabVar.d)[i2] = p6a1Var;
        return p6a1Var;
    }

    public final c46 l() {
        cab cabVar = this.l;
        c46 c46Var = (c46) ((sw9) cabVar.b).t();
        if (c46Var == null) {
            return new c46(cabVar);
        }
        c46Var.a = null;
        c46Var.d.b();
        c46Var.b = 0.0f;
        c46Var.e = false;
        return c46Var;
    }

    public final p6a1 m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        p6a1 p6a1VarA = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        p6a1VarA.b = i;
        ((p6a1[]) this.l.d)[i] = p6a1VarA;
        return p6a1VarA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (c46[]) Arrays.copyOf(this.f, i);
        cab cabVar = this.l;
        cabVar.d = (p6a1[]) Arrays.copyOf((p6a1[]) cabVar.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        znw0 znw0Var = this.c;
        if (znw0Var.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(znw0Var);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(znw0Var);
                return;
            }
        }
        i();
    }

    public final void q(znw0 znw0Var) {
        for (int i = 0; i < this.j; i++) {
            c46 c46Var = this.f[i];
            int i2 = 1;
            if (c46Var.a.Y != 1) {
                float f = 0.0f;
                if (c46Var.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.j) {
                            c46 c46Var2 = this.f[i6];
                            if (c46Var2.a.Y != i2 && !c46Var2.e && c46Var2.b < f) {
                                int iD = c46Var2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    p6a1 p6a1VarE = c46Var2.d.e(i8);
                                    float fC = c46Var2.d.c(p6a1VarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = p6a1VarE.g[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = p6a1VarE.b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            c46 c46Var3 = this.f[i4];
                            c46Var3.a.c = -1;
                            c46Var3.g(((p6a1[]) this.l.d)[i5]);
                            p6a1 p6a1Var = c46Var3.a;
                            p6a1Var.c = i4;
                            p6a1Var.e(this, c46Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(znw0Var);
        i();
    }

    public final void r(c46 c46Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.i * 2) {
                return;
            }
            p6a1 p6a1Var = c46Var.a;
            if (p6a1Var != null) {
                this.h[p6a1Var.b] = true;
            }
            p6a1 p6a1VarD = c46Var.d(this.h);
            if (p6a1VarD != null) {
                boolean[] zArr = this.h;
                int i4 = p6a1VarD.b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (p6a1VarD != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.j) {
                    c46 c46Var2 = this.f[i5];
                    if (c46Var2.a.Y != 1 && !c46Var2.e) {
                        o36 o36Var = c46Var2.d;
                        int i7 = o36Var.h;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= o36Var.a) {
                                z = false;
                                break;
                            } else if (o36Var.e[i7] == p6a1VarD.b) {
                                z = true;
                                break;
                            } else {
                                i7 = o36Var.f[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fC = c46Var2.d.c(p6a1VarD);
                            if (fC < 0.0f) {
                                float f2 = (-c46Var2.b) / fC;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    c46 c46Var3 = this.f[i6];
                    c46Var3.a.c = -1;
                    c46Var3.g(p6a1VarD);
                    p6a1 p6a1Var2 = c46Var3.a;
                    p6a1Var2.c = i6;
                    p6a1Var2.e(this, c46Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            c46 c46Var = this.f[i];
            if (c46Var != null) {
                ((sw9) this.l.b).F(c46Var);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        cab cabVar;
        int i = 0;
        while (true) {
            cabVar = this.l;
            p6a1[] p6a1VarArr = (p6a1[]) cabVar.d;
            if (i >= p6a1VarArr.length) {
                break;
            }
            p6a1 p6a1Var = p6a1VarArr[i];
            if (p6a1Var != null) {
                p6a1Var.c();
            }
            i++;
        }
        ((sw9) cabVar.c).G(this.n, this.m);
        this.n = 0;
        Arrays.fill((p6a1[]) cabVar.d, (Object) null);
        this.b = 0;
        znw0 znw0Var = this.c;
        znw0Var.g = 0;
        znw0Var.b = 0.0f;
        this.i = 1;
        for (int i2 = 0; i2 < this.j; i2++) {
            c46 c46Var = this.f[i2];
        }
        s();
        this.j = 0;
        this.o = new c46(cabVar);
    }
}
