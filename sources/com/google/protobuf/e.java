package com.google.protobuf;

import java.util.List;
import java.util.Map;
import p.er80;
import p.hhg1;
import p.kul1;
import p.l290;
import p.lwg;
import p.nvb0;
import p.oiy0;
import p.phc;
import p.poz0;
import p.sm41;
import p.t4f0;
import p.uqu;
import p.uz00;
import p.w6e0;
import p.yq20;
import p.zb01;
import p.zob;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e implements zb01 {
    public final lwg a;
    public int b;
    public int c;
    public int d = 0;

    public e(lwg lwgVar) {
        l290.a(lwgVar, "input");
        this.a = lwgVar;
        lwgVar.c = this;
    }

    public static void V(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void W(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // p.zb01
    public final void A(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(list, false);
    }

    @Override // p.zb01
    public final void B(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof yq20;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 2) {
                int iA = lwgVar.A();
                V(iA);
                int iD = lwgVar.d() + iA;
                do {
                    list.add(Float.valueOf(lwgVar.p()));
                } while (lwgVar.d() < iD);
                return;
            }
            if (iX != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Float.valueOf(lwgVar.p()));
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ = lwgVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        yq20 yq20Var = (yq20) list;
        int iX2 = poz0.x(i);
        if (iX2 == 2) {
            int iA2 = lwgVar.A();
            V(iA2);
            int iD2 = lwgVar.d() + iA2;
            do {
                yq20Var.c(lwgVar.p());
            } while (lwgVar.d() < iD2);
            return;
        }
        if (iX2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            yq20Var.c(lwgVar.p());
            if (lwgVar.e()) {
                return;
            } else {
                iZ2 = lwgVar.z();
            }
        } while (iZ2 == this.b);
        this.d = iZ2;
    }

    @Override // p.zb01
    public final int C() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(5);
        return this.a.t();
    }

    @Override // p.zb01
    public final void D(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZ;
        if (poz0.x(this.b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(n());
            lwg lwgVar = this.a;
            if (lwgVar.e()) {
                return;
            } else {
                iZ = lwgVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    @Override // p.zb01
    public final void E(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof uqu;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 1) {
                do {
                    list.add(Double.valueOf(lwgVar.l()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iA = lwgVar.A();
            W(iA);
            int iD = lwgVar.d() + iA;
            do {
                list.add(Double.valueOf(lwgVar.l()));
            } while (lwgVar.d() < iD);
            return;
        }
        uqu uquVar = (uqu) list;
        int iX2 = poz0.x(i);
        if (iX2 == 1) {
            do {
                uquVar.c(lwgVar.l());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iA2 = lwgVar.A();
        W(iA2);
        int iD2 = lwgVar.d() + iA2;
        do {
            uquVar.c(lwgVar.l());
        } while (lwgVar.d() < iD2);
    }

    @Override // p.zb01
    public final long F() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.a.r();
    }

    @Override // p.zb01
    public final String G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(2);
        return this.a.y();
    }

    @Override // p.zb01
    public final void H(List list, sm41 sm41Var, uz00 uz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZ;
        if (poz0.x(this.b) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        int i = this.b;
        do {
            Object objC = sm41Var.c();
            P(objC, sm41Var, uz00Var);
            sm41Var.a(objC);
            list.add(objC);
            lwg lwgVar = this.a;
            if (lwgVar.e() || this.d != 0) {
                return;
            } else {
                iZ = lwgVar.z();
            }
        } while (iZ == i);
        this.d = iZ;
    }

    @Override // p.zb01
    public final void I(Object obj, sm41 sm41Var, uz00 uz00Var) throws InvalidProtocolBufferException {
        U(2);
        Q(obj, sm41Var, uz00Var);
    }

    @Override // p.zb01
    public final void J(Object obj, sm41 sm41Var, uz00 uz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(3);
        P(obj, sm41Var, uz00Var);
    }

    @Override // p.zb01
    public final void K(List list, sm41 sm41Var, uz00 uz00Var) throws InvalidProtocolBufferException {
        int iZ;
        if (poz0.x(this.b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int i = this.b;
        do {
            Object objC = sm41Var.c();
            Q(objC, sm41Var, uz00Var);
            sm41Var.a(objC);
            list.add(objC);
            lwg lwgVar = this.a;
            if (lwgVar.e() || this.d != 0) {
                return;
            } else {
                iZ = lwgVar.z();
            }
        } while (iZ == i);
        this.d = iZ;
    }

    @Override // p.zb01
    public final void L(Map map, w6e0 w6e0Var, uz00 uz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(2);
        lwg lwgVar = this.a;
        int i = lwgVar.i(lwgVar.A());
        Object objR = w6e0Var.b;
        Object obj = w6e0Var.c;
        Object objR2 = obj;
        while (true) {
            try {
                int iZ = z();
                if (iZ == Integer.MAX_VALUE || lwgVar.e()) {
                    break;
                }
                if (iZ == 1) {
                    objR = R((kul1) w6e0Var.d, null, null);
                } else if (iZ != 2) {
                    try {
                        if (!O()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException e) {
                        if (!O()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objR2 = R((kul1) w6e0Var.e, obj.getClass(), uz00Var);
                }
            } catch (Throwable th) {
                lwgVar.h(i);
                throw th;
            }
        }
        map.put(objR, objR2);
        lwgVar.h(i);
    }

    @Override // p.zb01
    public final Object M(Class cls, uz00 uz00Var) throws InvalidProtocolBufferException {
        U(2);
        sm41 sm41VarA = oiy0.c.a(cls);
        Object objC = sm41VarA.c();
        Q(objC, sm41VarA, uz00Var);
        sm41VarA.a(objC);
        return objC;
    }

    @Override // p.zb01
    public final Object N(Class cls, uz00 uz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(3);
        sm41 sm41VarA = oiy0.c.a(cls);
        Object objC = sm41VarA.c();
        P(objC, sm41VarA, uz00Var);
        sm41VarA.a(objC);
        return objC;
    }

    @Override // p.zb01
    public final boolean O() {
        int i;
        lwg lwgVar = this.a;
        if (lwgVar.e() || (i = this.b) == this.c) {
            return false;
        }
        return lwgVar.C(i);
    }

    public final void P(Object obj, sm41 sm41Var, uz00 uz00Var) {
        int i = this.c;
        this.c = poz0.E(poz0.w(this.b), 4);
        try {
            sm41Var.j(obj, this, uz00Var);
            if (this.b != this.c) {
                throw InvalidProtocolBufferException.g();
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final void Q(Object obj, sm41 sm41Var, uz00 uz00Var) throws InvalidProtocolBufferException {
        lwg lwgVar = this.a;
        int iA = lwgVar.A();
        if (lwgVar.a + lwgVar.b >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = lwgVar.i(iA);
        lwgVar.a++;
        sm41Var.j(obj, this, uz00Var);
        lwgVar.a(0);
        lwgVar.a--;
        lwgVar.h(i);
    }

    public final Object R(kul1 kul1Var, Class cls, uz00 uz00Var) {
        switch (kul1Var.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(F());
            case 3:
                return Long.valueOf(r());
            case 4:
                return Integer.valueOf(o());
            case 5:
                return Long.valueOf(a());
            case 6:
                return Integer.valueOf(t());
            case 7:
                return Boolean.valueOf(d());
            case 8:
                return G();
            case 9:
            default:
                hhg1.n("unsupported field type.");
                return null;
            case 10:
                return M(cls, uz00Var);
            case 11:
                return n();
            case 12:
                return Integer.valueOf(g());
            case 13:
                return Integer.valueOf(j());
            case 14:
                return Integer.valueOf(C());
            case 15:
                return Long.valueOf(e());
            case 16:
                return Integer.valueOf(k());
            case 17:
                return Long.valueOf(x());
        }
    }

    public final void S(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iZ;
        int iZ2;
        if (poz0.x(this.b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        boolean z2 = list instanceof nvb0;
        lwg lwgVar = this.a;
        if (!z2 || z) {
            do {
                list.add(z ? G() : y());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ = lwgVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        nvb0 nvb0Var = (nvb0) list;
        do {
            nvb0Var.g0(n());
            if (lwgVar.e()) {
                return;
            } else {
                iZ2 = lwgVar.z();
            }
        } while (iZ2 == this.b);
        this.d = iZ2;
    }

    public final void T(int i) throws InvalidProtocolBufferException {
        if (this.a.d() != i) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void U(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (poz0.x(this.b) != i) {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // p.zb01
    public final long a() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(1);
        return this.a.o();
    }

    @Override // p.zb01
    public final void b(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof er80;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 2) {
                int iA = lwgVar.A();
                V(iA);
                int iD = lwgVar.d() + iA;
                do {
                    list.add(Integer.valueOf(lwgVar.t()));
                } while (lwgVar.d() < iD);
                return;
            }
            if (iX != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(lwgVar.t()));
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ = lwgVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        er80 er80Var = (er80) list;
        int iX2 = poz0.x(i);
        if (iX2 == 2) {
            int iA2 = lwgVar.A();
            V(iA2);
            int iD2 = lwgVar.d() + iA2;
            do {
                er80Var.c(lwgVar.t());
            } while (lwgVar.d() < iD2);
            return;
        }
        if (iX2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            er80Var.c(lwgVar.t());
            if (lwgVar.e()) {
                return;
            } else {
                iZ2 = lwgVar.z();
            }
        } while (iZ2 == this.b);
        this.d = iZ2;
    }

    @Override // p.zb01
    public final void c(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof t4f0;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 0) {
                do {
                    list.add(Long.valueOf(lwgVar.w()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = lwgVar.d() + lwgVar.A();
            do {
                list.add(Long.valueOf(lwgVar.w()));
            } while (lwgVar.d() < iD);
            T(iD);
            return;
        }
        t4f0 t4f0Var = (t4f0) list;
        int iX2 = poz0.x(i);
        if (iX2 == 0) {
            do {
                t4f0Var.c(lwgVar.w());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = lwgVar.d() + lwgVar.A();
        do {
            t4f0Var.c(lwgVar.w());
        } while (lwgVar.d() < iD2);
        T(iD2);
    }

    @Override // p.zb01
    public final boolean d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.a.j();
    }

    @Override // p.zb01
    public final long e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(1);
        return this.a.u();
    }

    @Override // p.zb01
    public final void f(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof t4f0;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 0) {
                do {
                    list.add(Long.valueOf(lwgVar.B()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = lwgVar.d() + lwgVar.A();
            do {
                list.add(Long.valueOf(lwgVar.B()));
            } while (lwgVar.d() < iD);
            T(iD);
            return;
        }
        t4f0 t4f0Var = (t4f0) list;
        int iX2 = poz0.x(i);
        if (iX2 == 0) {
            do {
                t4f0Var.c(lwgVar.B());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = lwgVar.d() + lwgVar.A();
        do {
            t4f0Var.c(lwgVar.B());
        } while (lwgVar.d() < iD2);
        T(iD2);
    }

    @Override // p.zb01
    public final int g() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.a.A();
    }

    @Override // p.zb01
    public final int getTag() {
        return this.b;
    }

    @Override // p.zb01
    public final void h(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof t4f0;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 0) {
                do {
                    list.add(Long.valueOf(lwgVar.r()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = lwgVar.d() + lwgVar.A();
            do {
                list.add(Long.valueOf(lwgVar.r()));
            } while (lwgVar.d() < iD);
            T(iD);
            return;
        }
        t4f0 t4f0Var = (t4f0) list;
        int iX2 = poz0.x(i);
        if (iX2 == 0) {
            do {
                t4f0Var.c(lwgVar.r());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = lwgVar.d() + lwgVar.A();
        do {
            t4f0Var.c(lwgVar.r());
        } while (lwgVar.d() < iD2);
        T(iD2);
    }

    @Override // p.zb01
    public final void i(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof er80;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 0) {
                do {
                    list.add(Integer.valueOf(lwgVar.m()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = lwgVar.d() + lwgVar.A();
            do {
                list.add(Integer.valueOf(lwgVar.m()));
            } while (lwgVar.d() < iD);
            T(iD);
            return;
        }
        er80 er80Var = (er80) list;
        int iX2 = poz0.x(i);
        if (iX2 == 0) {
            do {
                er80Var.c(lwgVar.m());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = lwgVar.d() + lwgVar.A();
        do {
            er80Var.c(lwgVar.m());
        } while (lwgVar.d() < iD2);
        T(iD2);
    }

    @Override // p.zb01
    public final int j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.a.m();
    }

    @Override // p.zb01
    public final int k() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.a.v();
    }

    @Override // p.zb01
    public final void l(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof zob;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 0) {
                do {
                    list.add(Boolean.valueOf(lwgVar.j()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = lwgVar.d() + lwgVar.A();
            do {
                list.add(Boolean.valueOf(lwgVar.j()));
            } while (lwgVar.d() < iD);
            T(iD);
            return;
        }
        zob zobVar = (zob) list;
        int iX2 = poz0.x(i);
        if (iX2 == 0) {
            do {
                zobVar.c(lwgVar.j());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = lwgVar.d() + lwgVar.A();
        do {
            zobVar.c(lwgVar.j());
        } while (lwgVar.d() < iD2);
        T(iD2);
    }

    @Override // p.zb01
    public final void m(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(list, true);
    }

    @Override // p.zb01
    public final phc n() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(2);
        return this.a.k();
    }

    @Override // p.zb01
    public final int o() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.a.q();
    }

    @Override // p.zb01
    public final void p(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof t4f0;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 1) {
                do {
                    list.add(Long.valueOf(lwgVar.o()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iA = lwgVar.A();
            W(iA);
            int iD = lwgVar.d() + iA;
            do {
                list.add(Long.valueOf(lwgVar.o()));
            } while (lwgVar.d() < iD);
            return;
        }
        t4f0 t4f0Var = (t4f0) list;
        int iX2 = poz0.x(i);
        if (iX2 == 1) {
            do {
                t4f0Var.c(lwgVar.o());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iA2 = lwgVar.A();
        W(iA2);
        int iD2 = lwgVar.d() + iA2;
        do {
            t4f0Var.c(lwgVar.o());
        } while (lwgVar.d() < iD2);
    }

    @Override // p.zb01
    public final void q(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof er80;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 0) {
                do {
                    list.add(Integer.valueOf(lwgVar.v()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = lwgVar.d() + lwgVar.A();
            do {
                list.add(Integer.valueOf(lwgVar.v()));
            } while (lwgVar.d() < iD);
            T(iD);
            return;
        }
        er80 er80Var = (er80) list;
        int iX2 = poz0.x(i);
        if (iX2 == 0) {
            do {
                er80Var.c(lwgVar.v());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = lwgVar.d() + lwgVar.A();
        do {
            er80Var.c(lwgVar.v());
        } while (lwgVar.d() < iD2);
        T(iD2);
    }

    @Override // p.zb01
    public final long r() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.a.B();
    }

    @Override // p.zb01
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(1);
        return this.a.l();
    }

    @Override // p.zb01
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(5);
        return this.a.p();
    }

    @Override // p.zb01
    public final void s(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof er80;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 0) {
                do {
                    list.add(Integer.valueOf(lwgVar.A()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = lwgVar.d() + lwgVar.A();
            do {
                list.add(Integer.valueOf(lwgVar.A()));
            } while (lwgVar.d() < iD);
            T(iD);
            return;
        }
        er80 er80Var = (er80) list;
        int iX2 = poz0.x(i);
        if (iX2 == 0) {
            do {
                er80Var.c(lwgVar.A());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = lwgVar.d() + lwgVar.A();
        do {
            er80Var.c(lwgVar.A());
        } while (lwgVar.d() < iD2);
        T(iD2);
    }

    @Override // p.zb01
    public final int t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(5);
        return this.a.n();
    }

    @Override // p.zb01
    public final void u(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof t4f0;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 1) {
                do {
                    list.add(Long.valueOf(lwgVar.u()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iA = lwgVar.A();
            W(iA);
            int iD = lwgVar.d() + iA;
            do {
                list.add(Long.valueOf(lwgVar.u()));
            } while (lwgVar.d() < iD);
            return;
        }
        t4f0 t4f0Var = (t4f0) list;
        int iX2 = poz0.x(i);
        if (iX2 == 1) {
            do {
                t4f0Var.c(lwgVar.u());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iA2 = lwgVar.A();
        W(iA2);
        int iD2 = lwgVar.d() + iA2;
        do {
            t4f0Var.c(lwgVar.u());
        } while (lwgVar.d() < iD2);
    }

    @Override // p.zb01
    public final void v(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof er80;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 0) {
                do {
                    list.add(Integer.valueOf(lwgVar.q()));
                    if (lwgVar.e()) {
                        return;
                    } else {
                        iZ = lwgVar.z();
                    }
                } while (iZ == this.b);
                this.d = iZ;
                return;
            }
            if (iX != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = lwgVar.d() + lwgVar.A();
            do {
                list.add(Integer.valueOf(lwgVar.q()));
            } while (lwgVar.d() < iD);
            T(iD);
            return;
        }
        er80 er80Var = (er80) list;
        int iX2 = poz0.x(i);
        if (iX2 == 0) {
            do {
                er80Var.c(lwgVar.q());
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ2 = lwgVar.z();
                }
            } while (iZ2 == this.b);
            this.d = iZ2;
            return;
        }
        if (iX2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = lwgVar.d() + lwgVar.A();
        do {
            er80Var.c(lwgVar.q());
        } while (lwgVar.d() < iD2);
        T(iD2);
    }

    @Override // p.zb01
    public final void w(List list) throws InvalidProtocolBufferException {
        int iZ;
        int iZ2;
        boolean z = list instanceof er80;
        int i = this.b;
        lwg lwgVar = this.a;
        if (!z) {
            int iX = poz0.x(i);
            if (iX == 2) {
                int iA = lwgVar.A();
                V(iA);
                int iD = lwgVar.d() + iA;
                do {
                    list.add(Integer.valueOf(lwgVar.n()));
                } while (lwgVar.d() < iD);
                return;
            }
            if (iX != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(lwgVar.n()));
                if (lwgVar.e()) {
                    return;
                } else {
                    iZ = lwgVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        er80 er80Var = (er80) list;
        int iX2 = poz0.x(i);
        if (iX2 == 2) {
            int iA2 = lwgVar.A();
            V(iA2);
            int iD2 = lwgVar.d() + iA2;
            do {
                er80Var.c(lwgVar.n());
            } while (lwgVar.d() < iD2);
            return;
        }
        if (iX2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            er80Var.c(lwgVar.n());
            if (lwgVar.e()) {
                return;
            } else {
                iZ2 = lwgVar.z();
            }
        } while (iZ2 == this.b);
        this.d = iZ2;
    }

    @Override // p.zb01
    public final long x() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(0);
        return this.a.w();
    }

    @Override // p.zb01
    public final String y() throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(2);
        return this.a.x();
    }

    @Override // p.zb01
    public final int z() {
        int iZ = this.d;
        if (iZ != 0) {
            this.b = iZ;
            this.d = 0;
        } else {
            iZ = this.a.z();
            this.b = iZ;
        }
        if (iZ == 0 || iZ == this.c) {
            return Integer.MAX_VALUE;
        }
        return poz0.w(iZ);
    }
}
