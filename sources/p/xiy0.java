package p;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class xiy0 extends jme implements uax, z1k {
    public int c;
    public final ghy0 d;
    public final vyq0 e;
    public final h661 f;

    public xiy0(ghy0 ghy0Var, vyq0 vyq0Var, h661 h661Var) {
        super((byte) 2);
        this.c = 5;
        this.d = ghy0Var;
        this.e = vyq0Var;
        this.f = h661Var;
    }

    @Override // p.z1k
    public final void E(h661 h661Var, int i, boolean z) {
        V0(z ? 1 : 0, Y0(h661Var, i));
    }

    @Override // p.z1k
    public final void G(h661 h661Var, int i, String str) {
        W0(Y0(h661Var, i), str);
    }

    @Override // p.z1k
    public final void I(inw0 inw0Var, int i, byte b) {
        V0(b, Y0(inw0Var, i));
    }

    @Override // p.uax
    public final void J() {
        String str;
        int i = this.c;
        if (i != 1) {
            int iC = l1d.C(i);
            if (iC == 1) {
                str = "'null' is not supported for optional properties in ProtoBuf";
            } else if (iC == 2) {
                str = "'null' is not supported as the value of collection types in ProtoBuf";
            } else if (iC != 3) {
                str = iC != 4 ? "'null' is not supported in ProtoBuf" : "'null' is not allowed for not-null properties";
            } else {
                str = "'null' is not supported as the value of a list element in ProtoBuf";
            }
            uh61.j(str);
        }
    }

    @Override // p.z1k
    public final uax L(inw0 inw0Var, int i) {
        long jY0 = Y0(inw0Var, i);
        inw0Var.g(i);
        z0(jY0);
        return this;
    }

    @Override // p.uax
    public final void O(short s) {
        V0(s, x0());
    }

    @Override // p.uax
    public final void P(boolean z) {
        V0(z ? 1 : 0, x0());
    }

    @Override // p.uax
    public final void S(float f) {
        long jX0 = x0();
        vyq0 vyq0Var = this.e;
        if (jX0 == 19500) {
            vyq0Var.q(f);
        } else {
            vyq0Var.r(f, (int) (jX0 & 2147483647L));
        }
    }

    @Override // p.uax
    public final void U(char c) {
        V0(c, x0());
    }

    public final void V0(int i, long j) {
        vyq0 vyq0Var = this.e;
        if (j == 19500) {
            vyq0Var.s(i);
        } else {
            vyq0Var.t(i, (int) (2147483647L & j), sio1.v(j));
        }
    }

    public void W0(long j, String str) {
        vyq0 vyq0Var = this.e;
        if (j == 19500) {
            vyq0Var.A(str);
        } else {
            vyq0Var.z((int) (j & 2147483647L), str);
        }
    }

    public long Y0(h661 h661Var, int i) {
        return sio1.s(h661Var, i);
    }

    @Override // p.z1k
    public final void Z(h661 h661Var, int i, float f) {
        long jY0 = Y0(h661Var, i);
        vyq0 vyq0Var = this.e;
        if (jY0 == 19500) {
            vyq0Var.q(f);
        } else {
            vyq0Var.r(f, (int) (jY0 & 2147483647L));
        }
    }

    @Override // p.z1k
    public final void a(h661 h661Var) {
        if (((jme) this).a >= 0) {
            w0();
        }
        X0(h661Var);
    }

    @Override // p.uax
    public final void a0(int i) {
        V0(i, x0());
    }

    public z1k b(h661 h661Var) {
        yoi1 kind = h661Var.getKind();
        boolean zJ = u890.j(kind, uic1.i);
        ghy0 ghy0Var = this.d;
        vyq0 vyq0Var = this.e;
        if (zJ) {
            return (sio1.x(h661Var.g(0)) && sio1.y(l0())) ? new ozq0(l0(), vyq0Var, ghy0Var, h661Var) : new ff21(l0(), vyq0Var, ghy0Var, h661Var);
        }
        if (!u890.j(kind, uic1.h) && !u890.j(kind, uic1.j) && !(kind instanceof scv0)) {
            if (u890.j(kind, vic1.h)) {
                return new lpg0(l0(), vyq0Var, ghy0Var, h661Var);
            }
            tw20.w(h661Var, "This serial kind is not supported as structure: ");
            return null;
        }
        long jL0 = l0();
        if (jL0 == 19500 && h661Var.equals(this.f)) {
            return this;
        }
        return sio1.w(jL0) ? new whq0(ghy0Var, vyq0Var, h661Var) : new hfp0(l0(), vyq0Var, ghy0Var, h661Var);
    }

    @Override // p.uax
    public final kl1 c() {
        return j761.a;
    }

    @Override // p.z1k
    public final boolean d0() {
        return false;
    }

    @Override // p.z1k
    public final void e(int i, int i2, h661 h661Var) {
        V0(i2, Y0(h661Var, i));
    }

    @Override // p.z1k
    public final void f0(inw0 inw0Var, int i, char c) {
        V0(c, Y0(inw0Var, i));
    }

    @Override // p.z1k
    public final void g(h661 h661Var, int i, double d) {
        long jY0 = Y0(h661Var, i);
        vyq0 vyq0Var = this.e;
        if (jY0 == 19500) {
            vyq0Var.o(d);
        } else {
            vyq0Var.p(d, (int) (jY0 & 2147483647L));
        }
    }

    @Override // p.uax
    public z1k g0(h661 h661Var, int i) {
        yoi1 kind = h661Var.getKind();
        uic1 uic1Var = uic1.i;
        boolean zJ = u890.j(kind, uic1Var);
        ghy0 ghy0Var = this.d;
        vyq0 vyq0Var = this.e;
        if (!zJ) {
            if (u890.j(kind, vic1.h)) {
                return new lpg0(k0(), vyq0Var, ghy0Var, h661Var);
            }
            tw20.w(h661Var, "This serial kind is not supported as collection: ");
            return null;
        }
        long jL0 = l0();
        if (sio1.y(jL0) && sio1.x(h661Var.g(0))) {
            return new ozq0(l0(), vyq0Var, ghy0Var, h661Var);
        }
        if (jL0 == 19500) {
            vyq0Var.s(i);
        }
        h661 h661Var2 = this.f;
        return (!u890.j(h661Var2.getKind(), uic1Var) || jL0 == 19500 || h661Var2.equals(h661Var)) ? new ff21(jL0, vyq0Var, ghy0Var, h661Var) : new c6o0(jL0, vyq0Var, ghy0Var, h661Var);
    }

    @Override // p.uax
    public final void h(double d) {
        long jX0 = x0();
        vyq0 vyq0Var = this.e;
        if (jX0 == 19500) {
            vyq0Var.o(d);
        } else {
            vyq0Var.p(d, (int) (jX0 & 2147483647L));
        }
    }

    @Override // p.uax
    public final void h0(String str) {
        W0(x0(), str);
    }

    @Override // p.uax
    public final void i(nma0 nma0Var, Object obj) {
        if (nma0Var instanceof dog0) {
            dog0 dog0Var = (dog0) nma0Var;
            hng0 hng0Var = new hng0(dog0Var.i(), dog0Var.j(), (byte) 0);
            p36 p36Var = new p36(hng0Var.getDescriptor(), (byte) 2);
            Set setEntrySet = ((Map) obj).entrySet();
            int size = setEntrySet.size();
            z1k z1kVarG0 = g0(p36Var, size);
            Iterator it = setEntrySet.iterator();
            for (int i = 0; i < size; i++) {
                z1kVarG0.k(p36Var, i, hng0Var, it.next());
            }
            z1kVarG0.a(p36Var);
            return;
        }
        boolean zJ = u890.j(nma0Var.getDescriptor(), ogc.c.b);
        vyq0 vyq0Var = this.e;
        if (zJ) {
            byte[] bArr = (byte[]) obj;
            long jX0 = x0();
            if (jX0 == 19500) {
                vyq0Var.m(bArr);
                return;
            } else {
                vyq0Var.n(bArr, (int) (jX0 & 2147483647L));
                return;
            }
        }
        if (!u890.j(nma0Var.getDescriptor(), s3h1.c.b)) {
            nma0Var.serialize(this, obj);
            return;
        }
        byte[] bArrC = ((q3h1) obj).c();
        long jX1 = x0();
        if (jX1 == 19500) {
            vyq0Var.m(bArrC);
        } else {
            vyq0Var.n(bArrC, (int) (jX1 & 2147483647L));
        }
    }

    @Override // p.uax
    public final void j(byte b) {
        V0(b, x0());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    @Override // p.z1k
    public final void k(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        int i2;
        if (h661Var.i(i)) {
            i2 = 2;
        } else {
            h661 h661VarG = h661Var.g(i);
            if (h661VarG.b()) {
                yoi1 kind = h661VarG.getKind();
                if (u890.j(kind, vic1.h)) {
                    i2 = 3;
                } else {
                    uic1 uic1Var = uic1.i;
                    if (u890.j(kind, uic1Var)) {
                        i2 = 3;
                    } else {
                        i2 = u890.j(h661Var.getKind(), uic1Var) ? 4 : 1;
                    }
                }
            } else {
                i2 = 5;
            }
        }
        this.c = i2;
        z0(Y0(h661Var, i));
        i(nma0Var, obj);
    }

    @Override // p.z1k
    public final void l(h661 h661Var, int i, long j) {
        long jY0 = Y0(h661Var, i);
        vyq0 vyq0Var = this.e;
        if (jY0 == 19500) {
            vyq0Var.u(j);
        } else {
            vyq0Var.w(j, (int) (2147483647L & jY0), sio1.v(jY0));
        }
    }

    @Override // p.uax
    public final void r(h661 h661Var, int i) {
        long jX0 = x0();
        int iT = sio1.t(h661Var, i, true);
        vyq0 vyq0Var = this.e;
        if (jX0 == 19500) {
            vyq0Var.s(iT);
        } else {
            vyq0Var.t(iT, (int) (jX0 & 2147483647L), uhy0.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    @Override // p.z1k
    public final void s(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        int i2;
        if (h661Var.i(i)) {
            i2 = 2;
        } else {
            yoi1 kind = h661Var.g(i).getKind();
            if (u890.j(kind, vic1.h)) {
                i2 = 3;
            } else {
                uic1 uic1Var = uic1.i;
                if (u890.j(kind, uic1Var)) {
                    i2 = 3;
                } else {
                    i2 = u890.j(h661Var.getKind(), uic1Var) ? 4 : 1;
                }
            }
        }
        this.c = i2;
        z0(Y0(h661Var, i));
        W(nma0Var, obj);
    }

    public uax v(h661 h661Var) {
        z0(x0());
        return this;
    }

    @Override // p.z1k
    public final void y(inw0 inw0Var, int i, short s) {
        V0(s, Y0(inw0Var, i));
    }

    @Override // p.uax
    public final void z(long j) {
        long jX0 = x0();
        vyq0 vyq0Var = this.e;
        if (jX0 == 19500) {
            vyq0Var.u(j);
        } else {
            vyq0Var.w(j, (int) (2147483647L & jX0), sio1.v(jX0));
        }
    }

    public void X0(h661 h661Var) {
    }
}
