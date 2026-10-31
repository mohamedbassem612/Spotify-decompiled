package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class dil implements u811 {
    public Object a;
    public final ynb1 b;
    public float b0;
    public float c0;
    public a5u d0;
    public a5u e0;
    public afh0 f0;
    public cjl g0;
    public final HashMap h0;
    public final HashMap i0;
    public od10 c = null;
    public byte d = 0;
    public byte e = 0;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = 0.5f;
    public float i = 0.5f;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f36p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public byte I = 0;
    public Object J = null;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public dil T = null;
    public Object U = null;
    public Object V = null;
    public dil W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;
    public Object a0 = null;
    public int j0 = 0;

    public dil(ynb1 ynb1Var) {
        String str = a5u.h;
        a5u a5uVar = new a5u(str);
        String str2 = a5u.i;
        a5uVar.g = str2;
        this.d0 = a5uVar;
        a5u a5uVar2 = new a5u(str);
        a5uVar2.g = str2;
        this.e0 = a5uVar2;
        this.h0 = new HashMap();
        this.i0 = new HashMap();
        this.b = ynb1Var;
    }

    public final void A(Float f) {
        z(this.b.c(f));
    }

    public final void B(float f) {
        this.x = f;
    }

    public final void C(float f) {
        this.y = f;
    }

    public final void D(dil dilVar) {
        this.j0 = 3;
        this.L = dilVar;
    }

    public final void E(dil dilVar) {
        this.j0 = 4;
        this.M = dilVar;
    }

    public final void F(float f) {
        this.z = f;
    }

    public final void G(float f) {
        this.A = f;
    }

    public final void H(float f) {
        this.B = f;
    }

    public final void I(float f) {
        this.G = f;
    }

    public final void J(float f) {
        this.H = f;
    }

    public final void K(a5u a5uVar) {
        this.e0 = a5uVar;
    }

    public final void L(float f) {
        this.f = f;
    }

    public final void M(float f) {
        this.g = f;
    }

    public final void N(a5u a5uVar) {
        this.d0 = a5uVar;
    }

    public final void O(Object obj) {
        this.j0 = 5;
        this.N = obj;
    }

    public final void P(dil dilVar) {
        this.j0 = 11;
        this.T = dilVar;
    }

    public final void Q(Object obj) {
        this.j0 = 10;
        this.S = obj;
    }

    public final void R(Object obj) {
        this.j0 = 9;
        this.R = obj;
    }

    public final void S(float f) {
        this.C = f;
    }

    public final void T(float f) {
        this.D = f;
    }

    public final void U(float f) {
        this.E = f;
    }

    public final void V(float f) {
        this.i = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(int i) {
        this.I = i;
    }

    @Override // p.u811
    public final void a(cjl cjlVar) {
        if (cjlVar == null) {
            return;
        }
        this.g0 = cjlVar;
        cjlVar.h0 = this.f0;
    }

    @Override // p.u811, p.od10
    public void apply() {
        if (this.g0 == null) {
            return;
        }
        od10 od10Var = this.c;
        if (od10Var != null) {
            od10Var.apply();
        }
        this.d0.a(this.g0, 0);
        this.e0.a(this.g0, 1);
        this.J = s(this.J);
        this.K = s(this.K);
        this.L = s(this.L);
        this.M = s(this.M);
        this.N = s(this.N);
        this.O = s(this.O);
        this.P = s(this.P);
        this.Q = s(this.Q);
        this.R = s(this.R);
        this.S = s(this.S);
        this.U = s(this.U);
        this.V = s(this.V);
        this.X = s(this.X);
        this.Y = s(this.Y);
        this.Z = s(this.Z);
        g(this.g0, this.J, 1);
        g(this.g0, this.K, 2);
        g(this.g0, this.L, 3);
        g(this.g0, this.M, 4);
        g(this.g0, this.N, 5);
        g(this.g0, this.O, 6);
        g(this.g0, this.P, 7);
        g(this.g0, this.Q, 8);
        g(this.g0, this.R, 9);
        g(this.g0, this.S, 10);
        g(this.g0, this.T, 11);
        g(this.g0, this.U, 12);
        g(this.g0, this.V, 13);
        g(this.g0, this.W, 14);
        g(this.g0, this.X, 15);
        g(this.g0, this.Y, 16);
        g(this.g0, this.Z, 17);
        g(this.g0, this.a0, 20);
        byte b = this.d;
        if (b != 0) {
            this.g0.l0 = b;
        }
        byte b2 = this.e;
        if (b2 != 0) {
            this.g0.m0 = b2;
        }
        float f = this.f;
        if (f != -1.0f) {
            this.g0.n0[0] = f;
        }
        float f2 = this.g;
        if (f2 != -1.0f) {
            this.g0.n0[1] = f2;
        }
        cjl cjlVar = this.g0;
        cjlVar.f0 = this.h;
        cjlVar.g0 = this.i;
        xol1 xol1Var = cjlVar.j;
        xol1Var.d = this.x;
        xol1Var.e = this.y;
        xol1Var.f = this.z;
        xol1Var.g = this.A;
        xol1Var.h = this.B;
        xol1Var.i = this.C;
        xol1Var.j = this.D;
        xol1Var.k = this.E;
        xol1Var.l = this.G;
        xol1Var.m = this.H;
        xol1Var.n = this.F;
        byte b3 = this.I;
        xol1Var.o = b3;
        cjlVar.i0 = b3;
        HashMap map = this.h0;
        for (String str : map.keySet()) {
            Integer num = (Integer) map.get(str);
            xol1 xol1Var2 = this.g0.j;
            int iIntValue = num.intValue();
            HashMap map2 = xol1Var2.p;
            if (map2.containsKey(str)) {
                ((zro) map2.get(str)).c = iIntValue;
            } else {
                zro zroVar = new zro();
                zroVar.d = Float.NaN;
                zroVar.a = str;
                zroVar.b = (short) 902;
                zroVar.c = iIntValue;
                map2.put(str, zroVar);
            }
        }
        HashMap map3 = this.i0;
        for (String str2 : map3.keySet()) {
            float fFloatValue = ((Float) map3.get(str2)).floatValue();
            HashMap map4 = this.g0.j.p;
            if (map4.containsKey(str2)) {
                ((zro) map4.get(str2)).d = fFloatValue;
            } else {
                zro zroVar2 = new zro();
                zroVar2.c = os00.INVALID_ID;
                zroVar2.a = str2;
                zroVar2.b = (short) 901;
                zroVar2.d = fFloatValue;
                map4.put(str2, zroVar2);
            }
        }
    }

    @Override // p.u811
    public cjl b() {
        cjl cjlVar = this.g0;
        if (cjlVar != null) {
            return cjlVar;
        }
        cjl cjlVar2 = new cjl(this.d0.f, this.e0.f);
        this.g0 = cjlVar2;
        cjlVar2.h0 = this.f0;
        return cjlVar2;
    }

    @Override // p.u811
    public final od10 c() {
        return this.c;
    }

    public final void d(int i, String str) {
        this.h0.put(str, Integer.valueOf(i));
    }

    public final void e(String str, float f) {
        this.i0.put(str, Float.valueOf(f));
    }

    public final void f(float f) {
        this.F = f;
    }

    public final void g(cjl cjlVar, Object obj, int i) {
        cjl cjlVarB = obj instanceof u811 ? ((u811) obj).b() : null;
        if (cjlVarB == null) {
            return;
        }
        int i2 = cil.a[l1d.C(i)];
        int iC = l1d.C(i);
        if (iC == 19) {
            float f = this.b0;
            cjlVar.x(7, 7, (int) this.c0, 0, cjlVarB);
            cjlVar.E = f;
            return;
        }
        switch (iC) {
            case 0:
                cjlVar.k(2).b(cjlVarB.k(2), this.j, this.f36p, false);
                break;
            case 1:
                cjlVar.k(2).b(cjlVarB.k(4), this.j, this.f36p, false);
                break;
            case 2:
                cjlVar.k(4).b(cjlVarB.k(2), this.k, this.q, false);
                break;
            case 3:
                cjlVar.k(4).b(cjlVarB.k(4), this.k, this.q, false);
                break;
            case 4:
                cjlVar.k(2).b(cjlVarB.k(2), this.l, this.r, false);
                break;
            case 5:
                cjlVar.k(2).b(cjlVarB.k(4), this.l, this.r, false);
                break;
            case 6:
                cjlVar.k(4).b(cjlVarB.k(2), this.m, this.s, false);
                break;
            case 7:
                cjlVar.k(4).b(cjlVarB.k(4), this.m, this.s, false);
                break;
            case 8:
                cjlVar.k(3).b(cjlVarB.k(3), this.n, this.t, false);
                break;
            case 9:
                cjlVar.k(3).b(cjlVarB.k(5), this.n, this.t, false);
                break;
            case 10:
                cjlVar.x(3, 6, this.n, this.t, cjlVarB);
                break;
            case 11:
                cjlVar.k(5).b(cjlVarB.k(3), this.o, this.u, false);
                break;
            case 12:
                cjlVar.k(5).b(cjlVarB.k(5), this.o, this.u, false);
                break;
            case 13:
                cjlVar.x(5, 6, this.o, this.u, cjlVarB);
                break;
            case 14:
                cjlVar.x(6, 6, this.v, this.w, cjlVarB);
                break;
            case 15:
                cjlVar.x(6, 3, this.v, this.w, cjlVarB);
                break;
            case 16:
                cjlVar.x(6, 5, this.v, this.w, cjlVarB);
                break;
        }
    }

    @Override // p.u811
    public final Object getKey() {
        return this.a;
    }

    public final void h(dil dilVar) {
        this.j0 = 15;
        this.X = dilVar;
    }

    public final void i(dil dilVar) {
        this.j0 = 17;
        this.Z = dilVar;
    }

    public final void j(dil dilVar) {
        this.j0 = 16;
        this.Y = dilVar;
    }

    public final void k(dil dilVar) {
        this.j0 = 14;
        this.W = dilVar;
    }

    public final void l(Object obj) {
        this.j0 = 13;
        this.V = obj;
    }

    public final void m(Object obj) {
        this.j0 = 12;
        this.U = obj;
    }

    public final void n(dil dilVar, float f, float f2) {
        this.a0 = s(dilVar);
        this.b0 = f;
        this.c0 = f2;
        this.j0 = 20;
    }

    public final void o() {
        int i = this.j0;
        if (i == 0) {
            this.J = null;
            this.K = null;
            this.j = 0;
            this.L = null;
            this.M = null;
            this.k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.m = 0;
            this.R = null;
            this.S = null;
            this.n = 0;
            this.U = null;
            this.V = null;
            this.o = 0;
            this.X = null;
            this.a0 = null;
            this.h = 0.5f;
            this.i = 0.5f;
            this.f36p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            return;
        }
        int iC = l1d.C(i);
        if (iC == 19) {
            this.a0 = null;
            return;
        }
        switch (iC) {
            case 0:
            case 1:
                this.J = null;
                this.K = null;
                this.j = 0;
                this.f36p = 0;
                break;
            case 2:
            case 3:
                this.L = null;
                this.M = null;
                this.k = 0;
                this.q = 0;
                break;
            case 4:
            case 5:
                this.N = null;
                this.O = null;
                this.l = 0;
                this.r = 0;
                break;
            case 6:
            case 7:
                this.P = null;
                this.Q = null;
                this.m = 0;
                this.s = 0;
                break;
            case 8:
            case 9:
            case 10:
                this.R = null;
                this.S = null;
                this.T = null;
                this.n = 0;
                this.t = 0;
                break;
            case 11:
            case 12:
            case 13:
                this.U = null;
                this.V = null;
                this.W = null;
                this.o = 0;
                this.u = 0;
                break;
            case 14:
                this.X = null;
                break;
        }
    }

    public final void p() {
        if (this.N != null) {
            this.j0 = 5;
        } else {
            this.j0 = 6;
        }
        o();
        if (this.P != null) {
            this.j0 = 7;
        } else {
            this.j0 = 8;
        }
        o();
        if (this.J != null) {
            this.j0 = 1;
        } else {
            this.j0 = 2;
        }
        o();
        if (this.L != null) {
            this.j0 = 3;
        } else {
            this.j0 = 4;
        }
        o();
    }

    public final void q() {
        if (this.R != null) {
            this.j0 = 9;
        } else {
            this.j0 = 10;
        }
        o();
        this.j0 = 15;
        o();
        if (this.U != null) {
            this.j0 = 12;
        } else {
            this.j0 = 13;
        }
        o();
    }

    public final void r(Object obj) {
        this.j0 = 8;
        this.Q = obj;
    }

    public final Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof dil) ? (u811) this.b.c.get(obj) : obj;
    }

    public final a5u t() {
        return this.d0;
    }

    public final void u(float f) {
        this.h = f;
    }

    public final void v(dil dilVar) {
        this.j0 = 1;
        this.J = dilVar;
    }

    public final void w(dil dilVar) {
        this.j0 = 2;
        this.K = dilVar;
    }

    public dil x(int i) {
        int i2 = this.j0;
        if (i2 == 0) {
            this.j = i;
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            return this;
        }
        int iC = l1d.C(i2);
        if (iC == 19) {
            this.c0 = i;
            return this;
        }
        switch (iC) {
            case 0:
            case 1:
                this.j = i;
                break;
            case 2:
            case 3:
                this.k = i;
                break;
            case 4:
            case 5:
                this.l = i;
                break;
            case 6:
            case 7:
                this.m = i;
                break;
            case 8:
            case 9:
            case 10:
                this.n = i;
                break;
            case 11:
            case 12:
            case 13:
                this.o = i;
                break;
            case 14:
            case 15:
            case 16:
                this.v = i;
                break;
        }
        return this;
    }

    public dil y(Float f) {
        return x(this.b.c(f));
    }

    public final void z(int i) {
        int i2 = this.j0;
        if (i2 == 0) {
            this.f36p = i;
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            return;
        }
        switch (l1d.C(i2)) {
            case 0:
            case 1:
                this.f36p = i;
                break;
            case 2:
            case 3:
                this.q = i;
                break;
            case 4:
            case 5:
                this.r = i;
                break;
            case 6:
            case 7:
                this.s = i;
                break;
            case 8:
            case 9:
            case 10:
                this.t = i;
                break;
            case 11:
            case 12:
            case 13:
                this.u = i;
                break;
            case 14:
            case 15:
            case 16:
                this.w = i;
                break;
        }
    }
}
