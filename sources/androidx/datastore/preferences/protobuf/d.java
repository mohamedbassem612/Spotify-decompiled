package androidx.datastore.preferences.protobuf;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.List;
import p.ac01;
import p.apb;
import p.bhn0;
import p.fr80;
import p.ihc;
import p.jah;
import p.jme;
import p.mul1;
import p.n290;
import p.piy0;
import p.pvb0;
import p.rng0;
import p.tm41;
import p.u4f0;
import p.uo5;
import p.vqu;
import p.wz00;
import p.zq20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d implements ac01 {
    public final jme a;
    public int b;
    public int c;
    public int d = 0;

    public d(jme jmeVar) {
        Charset charset = n290.a;
        this.a = jmeVar;
        jmeVar.b = this;
    }

    public static d M(jme jmeVar) {
        d dVar = (d) jmeVar.b;
        return dVar != null ? dVar : new d(jmeVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public static void U(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public static void V(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.e();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void A(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        Q(list, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void B(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof zq20) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 2) {
            int iQ0 = jmeVar.Q0();
            U(iQ0);
            int iN0 = jmeVar.n0() + iQ0;
            do {
                list.add(Float.valueOf(jmeVar.G0()));
            } while (jmeVar.n0() < iN0);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Float.valueOf(jmeVar.G0()));
            if (jmeVar.o0()) {
                return;
            } else {
                iP0 = jmeVar.P0();
            }
        } while (iP0 == this.b);
        this.d = iP0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final int C() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(5);
        return this.a.J0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void D(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(n());
            jme jmeVar = this.a;
            if (jmeVar.o0()) {
                return;
            } else {
                iP0 = jmeVar.P0();
            }
        } while (iP0 == this.b);
        this.d = iP0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void E(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof vqu) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 1) {
            do {
                list.add(Double.valueOf(jmeVar.C0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iQ0 = jmeVar.Q0();
        V(iQ0);
        int iN0 = jmeVar.n0() + iQ0;
        do {
            list.add(Double.valueOf(jmeVar.C0()));
        } while (jmeVar.n0() < iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final long F() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.I0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final String G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(2);
        return this.a.O0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final Object H(tm41 tm41Var, wz00 wz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(3);
        return O(tm41Var, wz00Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final Object I(tm41 tm41Var, wz00 wz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(2);
        return P(tm41Var, wz00Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void J(List list, tm41 tm41Var, wz00 wz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        int i = this.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(O(tm41Var, wz00Var));
            jme jmeVar = this.a;
            if (jmeVar.o0() || this.d != 0) {
                return;
            } else {
                iP0 = jmeVar.P0();
            }
        } while (iP0 == i);
        this.d = iP0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void K(List list, tm41 tm41Var, wz00 wz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        int i = this.b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(P(tm41Var, wz00Var));
            jme jmeVar = this.a;
            if (jmeVar.o0() || this.d != 0) {
                return;
            } else {
                iP0 = jmeVar.P0();
            }
        } while (iP0 == i);
        this.d = iP0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void L(rng0 rng0Var, uo5 uo5Var, wz00 wz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(2);
        jme jmeVar = this.a;
        int iY0 = jmeVar.y0(jmeVar.Q0());
        Object obj = uo5Var.d;
        Object objN = "";
        Object objN2 = obj;
        while (true) {
            try {
                int iZ = z();
                if (iZ == Integer.MAX_VALUE || jmeVar.o0()) {
                    break;
                }
                if (iZ == 1) {
                    objN = N((mul1) uo5Var.b, null, null);
                } else if (iZ != 2) {
                    try {
                        if (!T()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!T()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objN2 = N((mul1) uo5Var.c, obj.getClass(), wz00Var);
                }
            } catch (Throwable th) {
                jmeVar.v0(iY0);
                throw th;
            }
        }
        rng0Var.put(objN, objN2);
        jmeVar.v0(iY0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    public final Object N(mul1 mul1Var, Class cls, wz00 wz00Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        switch (mul1Var.ordinal()) {
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
                jah.g("unsupported field type.");
                return null;
            case 10:
                S(2);
                return P(piy0.c.a(cls), wz00Var);
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

    public final Object O(tm41 tm41Var, wz00 wz00Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object objC = tm41Var.c();
            tm41Var.i(objC, this, wz00Var);
            tm41Var.a(objC);
            if (this.b != this.c) {
                throw InvalidProtocolBufferException.e();
            }
            this.c = i;
            return objC;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final Object P(tm41 tm41Var, wz00 wz00Var) throws InvalidProtocolBufferException {
        jme jmeVar = this.a;
        int iQ0 = jmeVar.Q0();
        if (jmeVar.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iY0 = jmeVar.y0(iQ0);
        Object objC = tm41Var.c();
        jmeVar.a++;
        tm41Var.i(objC, this, wz00Var);
        tm41Var.a(objC);
        jmeVar.j0(0);
        jmeVar.a--;
        jmeVar.v0(iY0);
        return objC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    public final void Q(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        int iP1;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        boolean z2 = list instanceof pvb0;
        jme jmeVar = this.a;
        if (!z2 || z) {
            do {
                list.add(z ? G() : y());
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        pvb0 pvb0Var = (pvb0) list;
        do {
            pvb0Var.H0(n());
            if (jmeVar.o0()) {
                return;
            } else {
                iP1 = jmeVar.P0();
            }
        } while (iP1 == this.b);
        this.d = iP1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public final void R(int i) throws InvalidProtocolBufferException {
        if (this.a.n0() != i) {
            throw InvalidProtocolBufferException.f();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    public final void S(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean T() {
        int i;
        jme jmeVar = this.a;
        if (jmeVar.o0() || (i = this.b) == this.c) {
            return false;
        }
        return jmeVar.T0(i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final long a() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(1);
        return this.a.F0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void b(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof fr80) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 2) {
            int iQ0 = jmeVar.Q0();
            U(iQ0);
            int iN0 = jmeVar.n0() + iQ0;
            do {
                list.add(Integer.valueOf(jmeVar.J0()));
            } while (jmeVar.n0() < iN0);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Integer.valueOf(jmeVar.J0()));
            if (jmeVar.o0()) {
                return;
            } else {
                iP0 = jmeVar.P0();
            }
        } while (iP0 == this.b);
        this.d = iP0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void c(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof u4f0) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(jmeVar.M0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iN0 = jmeVar.n0() + jmeVar.Q0();
        do {
            list.add(Long.valueOf(jmeVar.M0()));
        } while (jmeVar.n0() < iN0);
        R(iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final boolean d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.A0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final long e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(1);
        return this.a.K0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void f(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof u4f0) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(jmeVar.R0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iN0 = jmeVar.n0() + jmeVar.Q0();
        do {
            list.add(Long.valueOf(jmeVar.R0()));
        } while (jmeVar.n0() < iN0);
        R(iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final int g() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.Q0();
    }

    @Override // p.ac01
    public final int getTag() {
        return this.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void h(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof u4f0) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(jmeVar.I0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iN0 = jmeVar.n0() + jmeVar.Q0();
        do {
            list.add(Long.valueOf(jmeVar.I0()));
        } while (jmeVar.n0() < iN0);
        R(iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void i(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof fr80) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(jmeVar.D0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iN0 = jmeVar.n0() + jmeVar.Q0();
        do {
            list.add(Integer.valueOf(jmeVar.D0()));
        } while (jmeVar.n0() < iN0);
        R(iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final int j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.D0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final int k() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.L0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void l(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof apb) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(jmeVar.A0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iN0 = jmeVar.n0() + jmeVar.Q0();
        do {
            list.add(Boolean.valueOf(jmeVar.A0()));
        } while (jmeVar.n0() < iN0);
        R(iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void m(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        Q(list, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final ihc n() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(2);
        return this.a.B0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final int o() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.H0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void p(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof u4f0) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 1) {
            do {
                list.add(Long.valueOf(jmeVar.F0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iQ0 = jmeVar.Q0();
        V(iQ0);
        int iN0 = jmeVar.n0() + iQ0;
        do {
            list.add(Long.valueOf(jmeVar.F0()));
        } while (jmeVar.n0() < iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void q(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof fr80) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(jmeVar.L0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iN0 = jmeVar.n0() + jmeVar.Q0();
        do {
            list.add(Integer.valueOf(jmeVar.L0()));
        } while (jmeVar.n0() < iN0);
        R(iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final long r() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.R0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(1);
        return this.a.C0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(5);
        return this.a.G0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void s(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof fr80) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(jmeVar.Q0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iN0 = jmeVar.n0() + jmeVar.Q0();
        do {
            list.add(Integer.valueOf(jmeVar.Q0()));
        } while (jmeVar.n0() < iN0);
        R(iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final int t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(5);
        return this.a.E0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void u(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof u4f0) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 1) {
            do {
                list.add(Long.valueOf(jmeVar.K0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iQ0 = jmeVar.Q0();
        V(iQ0);
        int iN0 = jmeVar.n0() + iQ0;
        do {
            list.add(Long.valueOf(jmeVar.K0()));
        } while (jmeVar.n0() < iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void v(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof fr80) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(jmeVar.H0()));
                if (jmeVar.o0()) {
                    return;
                } else {
                    iP0 = jmeVar.P0();
                }
            } while (iP0 == this.b);
            this.d = iP0;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iN0 = jmeVar.n0() + jmeVar.Q0();
        do {
            list.add(Integer.valueOf(jmeVar.H0()));
        } while (jmeVar.n0() < iN0);
        R(iN0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final void w(List list) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int iP0;
        if (list instanceof fr80) {
            bhn0.d();
            return;
        }
        int i = this.b & 7;
        jme jmeVar = this.a;
        if (i == 2) {
            int iQ0 = jmeVar.Q0();
            U(iQ0);
            int iN0 = jmeVar.n0() + iQ0;
            do {
                list.add(Integer.valueOf(jmeVar.E0()));
            } while (jmeVar.n0() < iN0);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Integer.valueOf(jmeVar.E0()));
            if (jmeVar.o0()) {
                return;
            } else {
                iP0 = jmeVar.P0();
            }
        } while (iP0 == this.b);
        this.d = iP0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final long x() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(0);
        return this.a.M0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    @Override // p.ac01
    public final String y() throws InvalidProtocolBufferException.InvalidWireTypeException {
        S(2);
        return this.a.N0();
    }

    @Override // p.ac01
    public final int z() {
        int iP0 = this.d;
        if (iP0 != 0) {
            this.b = iP0;
            this.d = 0;
        } else {
            iP0 = this.a.P0();
            this.b = iP0;
        }
        return (iP0 == 0 || iP0 == this.c) ? Alert.DURATION_SHOW_INDEFINITELY : iP0 >>> 3;
    }
}
