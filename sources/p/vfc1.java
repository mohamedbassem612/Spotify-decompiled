package p;

import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vfc1 extends hso1 implements bga0 {
    public final nfa0 b;
    public final rjm1 c;
    public final y6 d;
    public final kl1 e;
    public int f = -1;
    public t4o g;
    public final vfa0 h;
    public final gga0 i;

    public vfc1(nfa0 nfa0Var, rjm1 rjm1Var, y6 y6Var, h661 h661Var, t4o t4oVar) {
        this.b = nfa0Var;
        this.c = rjm1Var;
        this.d = y6Var;
        this.e = nfa0Var.b;
        this.g = t4oVar;
        vfa0 vfa0Var = nfa0Var.a;
        this.h = vfa0Var;
        this.i = vfa0Var.f ? null : new gga0(h661Var);
    }

    @Override // p.x1k
    public final Object A(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        yga0 yga0Var = (yga0) this.d.d;
        boolean z = this.c == rjm1.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) yga0Var.e;
            int i2 = yga0Var.b;
            if (iArr[i2] == -2) {
                ((Object[]) yga0Var.d)[i2] = wdu0.U0;
            }
        }
        Object objA = super.A(h661Var, i, nma0Var, obj);
        if (z) {
            int[] iArr2 = (int[]) yga0Var.e;
            int i3 = yga0Var.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                yga0Var.b = i4;
                if (i4 == ((Object[]) yga0Var.d).length) {
                    yga0Var.b();
                }
            }
            Object[] objArr = (Object[]) yga0Var.d;
            int i5 = yga0Var.b;
            objArr[i5] = ((vfa0) yga0Var.c).m ? objA : ud20.h;
            ((int[]) yga0Var.e)[i5] = -2;
        }
        return objA;
    }

    @Override // p.dar
    public final short C() {
        y6 y6Var = this.d;
        long jL = y6Var.l();
        short s = (short) jL;
        if (jL == s) {
            return s;
        }
        y6.v(y6Var, "Failed to parse short for input '" + jL + '\'', 0, (String) null, 6);
        throw null;
    }

    @Override // p.dar
    public final float F() {
        y6 y6Var = this.d;
        String strP = y6Var.p();
        try {
            float f = Float.parseFloat(strP);
            if (this.b.a.j || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            vvm1.G(y6Var, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            y6.v(y6Var, cy30.n("Failed to parse type 'float' for input '", strP, '\''), 0, (String) null, 6);
            throw null;
        }
    }

    @Override // p.dar
    public final double H() {
        y6 y6Var = this.d;
        String strP = y6Var.p();
        try {
            double d = Double.parseDouble(strP);
            if (this.b.a.j || Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            vvm1.G(y6Var, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            y6.v(y6Var, cy30.n("Failed to parse type 'double' for input '", strP, '\''), 0, (String) null, 6);
            throw null;
        }
    }

    @Override // p.dar
    public final boolean K() {
        return this.d.f();
    }

    @Override // p.dar
    public final char N() {
        y6 y6Var = this.d;
        String strP = y6Var.p();
        if (strP.length() == 1) {
            return strP.charAt(0);
        }
        y6.v(y6Var, cy30.n("Expected single char, but got '", strP, '\''), 0, (String) null, 6);
        throw null;
    }

    @Override // p.dar
    public final int T(h661 h661Var) {
        return mue1.F(h661Var, this.b, V(), " at path ".concat(((yga0) this.d.d).a()));
    }

    @Override // p.dar
    public final String V() {
        boolean z = this.h.c;
        y6 y6Var = this.d;
        return z ? y6Var.q() : y6Var.n();
    }

    @Override // p.dar
    public final boolean X() {
        gga0 gga0Var = this.i;
        return ((gga0Var != null ? gga0Var.b() : false) || y6.K(this.d)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0132  */
    /* JADX WARN: Code duplicated, block: B:42:0x0133  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x0133, please report this as an issue */
    @Override // p.dar
    public final Object Y(nma0 nma0Var) {
        String message;
        nfa0 nfa0Var = this.b;
        y6 y6Var = this.d;
        yga0 yga0Var = (yga0) y6Var.d;
        try {
            if (!(nma0Var instanceof f9)) {
                return nma0Var.deserialize(this);
            }
            vfa0 vfa0Var = nfa0Var.a;
            String strV = i9p1.v(nfa0Var, ((f9) nma0Var).getDescriptor());
            String strA = y6Var.A(strV, this.h.c);
            if (strA != null) {
                try {
                    nma0 nma0VarN = n9p1.n((f9) nma0Var, this, strA);
                    this.g = new t4o(strV, (byte) 11);
                    return nma0VarN.deserialize(this);
                } catch (SerializationException e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    String strJ0 = ihc1.J0(ihc1.Y0(message2, '\n'), ".");
                    String message3 = e.getMessage();
                    message3.getClass();
                    y6.v(y6Var, strJ0, 0, ihc1.T0(message3, '\n', ""), 2);
                    throw null;
                }
            }
            vfa0 vfa0Var2 = nfa0Var.a;
            String strV2 = i9p1.v(nfa0Var, ((f9) nma0Var).getDescriptor());
            uga0 uga0VarM = m();
            String strH = ((f9) nma0Var).getDescriptor().h();
            if (uga0VarM instanceof uga0) {
                uga0 uga0Var = uga0VarM;
                ega0 ega0Var = (ega0) uga0Var.get(strV2);
                try {
                    return hon1.A(nfa0Var, strV2, uga0Var, n9p1.n((f9) nma0Var, this, ega0Var != null ? fga0.g(fga0.m(ega0Var)) : null));
                } catch (SerializationException e2) {
                    String message4 = e2.getMessage();
                    message4.getClass();
                    throw new JsonDecodingException(vvm1.t(message4, (String) null, nfa0Var.a.m ? vvm1.D(uga0Var.toString()).toString() : null));
                }
            }
            StringBuilder sb = new StringBuilder("Expected ");
            jd11 jd11Var = rc11.a;
            sb.append(jd11Var.b(uga0.class).r());
            sb.append(", but had ");
            sb.append(jd11Var.b(uga0VarM.getClass()).r());
            sb.append(" as the serialized body of ");
            sb.append(strH);
            throw new JsonDecodingException(vvm1.t(sb.toString(), yga0Var.a(), nfa0Var.a.m ? vvm1.D(uga0VarM.toString()).toString() : null));
            message = e.getMessage();
            message.getClass();
            if (ihc1.h0(message, "at path", false)) {
                throw e;
            }
            throw t4n1.w(e, e.getMessage() + " at path: " + yga0Var.a());
        } catch (MissingFieldException e3) {
            message = e3.getMessage();
            message.getClass();
            if (ihc1.h0(message, "at path", false)) {
                throw e3;
            }
            throw t4n1.w(e3, e3.getMessage() + " at path: " + yga0Var.a());
        }
    }

    @Override // p.x1k
    public final void a(h661 h661Var) {
        int iD = h661Var.d();
        nfa0 nfa0Var = this.b;
        if (iD == 0 && mue1.J(nfa0Var, h661Var)) {
            while (p(h661Var) != -1) {
            }
        }
        y6 y6Var = this.d;
        if (y6Var.I()) {
            vfa0 vfa0Var = nfa0Var.a;
            vvm1.z(y6Var, "");
            throw null;
        }
        y6Var.k(this.c.b);
        yga0 yga0Var = (yga0) y6Var.d;
        int i = yga0Var.b;
        int[] iArr = (int[]) yga0Var.e;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            yga0Var.b = i;
        }
        if (i != -1) {
            yga0Var.b = i - 1;
        }
    }

    @Override // p.dar
    public final x1k b(h661 h661Var) {
        nfa0 nfa0Var = this.b;
        rjm1 rjm1VarM = anm1.M(nfa0Var, h661Var);
        y6 y6Var = this.d;
        yga0 yga0Var = (yga0) y6Var.d;
        int i = yga0Var.b + 1;
        yga0Var.b = i;
        if (i == ((Object[]) yga0Var.d).length) {
            yga0Var.b();
        }
        ((Object[]) yga0Var.d)[i] = h661Var;
        y6Var.k(rjm1VarM.a);
        if (y6Var.B() == 4) {
            y6.v(y6Var, "Unexpected leading comma", 0, (String) null, 6);
            throw null;
        }
        int iOrdinal = rjm1VarM.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new vfc1(this.b, rjm1VarM, y6Var, h661Var, this.g);
        }
        return (this.c == rjm1VarM && nfa0Var.a.f) ? this : new vfc1(this.b, rjm1VarM, y6Var, h661Var, this.g);
    }

    @Override // p.x1k
    public final kl1 c() {
        return this.e;
    }

    @Override // p.dar
    public final byte c0() {
        y6 y6Var = this.d;
        long jL = y6Var.l();
        byte b = (byte) jL;
        if (jL == b) {
            return b;
        }
        y6.v(y6Var, "Failed to parse byte for input '" + jL + '\'', 0, (String) null, 6);
        throw null;
    }

    @Override // p.bga0
    public final nfa0 d() {
        return this.b;
    }

    @Override // p.bga0
    public final ega0 m() {
        return new mha0(this.b.a, this.d).a();
    }

    @Override // p.dar
    public final int n() {
        y6 y6Var = this.d;
        long jL = y6Var.l();
        int i = (int) jL;
        if (jL == i) {
            return i;
        }
        y6.v(y6Var, "Failed to parse int for input '" + jL + '\'', 0, (String) null, 6);
        throw null;
    }

    @Override // p.x1k
    public final int p(h661 h661Var) {
        boolean z;
        String strC;
        y6 y6Var = this.d;
        yga0 yga0Var = (yga0) y6Var.d;
        rjm1 rjm1Var = this.c;
        int iOrdinal = rjm1Var.ordinal();
        char c = ':';
        boolean zI = false;
        nfa0 nfa0Var = this.b;
        boolean z2 = true;
        int iD = -1;
        if (iOrdinal == 0) {
            boolean zI2 = y6Var.I();
            while (true) {
                boolean zE = y6Var.e();
                gga0 gga0Var = this.i;
                if (zE) {
                    vfa0 vfa0Var = this.h;
                    boolean z3 = vfa0Var.c;
                    String strQ = z3 ? y6Var.q() : y6Var.h();
                    y6Var.k(c);
                    int iE = mue1.E(h661Var, nfa0Var, strQ);
                    if (iE != -3) {
                        if (vfa0Var.h) {
                            boolean zI3 = h661Var.i(iE);
                            h661 h661VarG = h661Var.g(iE);
                            if (!zI3 || h661VarG.b() || !y6Var.J(z2)) {
                                if (u890.j(h661VarG.getKind(), l661.h) && ((!h661VarG.b() || !y6Var.J(false)) && (strC = y6Var.C(z3)) != null)) {
                                    int iE2 = mue1.E(h661VarG, nfa0Var, strC);
                                    boolean z4 = !nfa0Var.a.f && h661VarG.b();
                                    if (iE2 == -3 && (zI3 || z4)) {
                                        y6Var.n();
                                    }
                                }
                            }
                            zI2 = y6Var.I();
                            z = false;
                        }
                        if (gga0Var != null) {
                            gga0Var.c(iE);
                        }
                        iD = iE;
                    } else {
                        zI2 = false;
                        z = true;
                    }
                    if (z) {
                        if (!mue1.J(nfa0Var, h661Var)) {
                            t4o t4oVar = this.g;
                            if (t4oVar == null || !u890.j(t4oVar.b, strQ)) {
                                int i = yga0Var.b;
                                int[] iArr = (int[]) yga0Var.e;
                                if (iArr[i] == -2) {
                                    iArr[i] = iD;
                                    i--;
                                    yga0Var.b = i;
                                }
                                int i2 = iD;
                                if (i != i2) {
                                    yga0Var.b = i + i2;
                                }
                                y6Var.w(strQ);
                                throw null;
                            }
                            t4oVar.b = null;
                        }
                        int i3 = iD;
                        y6Var.E(z3);
                        zI2 = y6Var.I();
                        iD = i3;
                    } else {
                        iD = iD;
                    }
                    c = ':';
                    z2 = true;
                } else {
                    int i4 = iD;
                    if (zI2) {
                        vfa0 vfa0Var2 = nfa0Var.a;
                        vvm1.A(y6Var);
                        throw null;
                    }
                    iD = gga0Var != null ? gga0Var.d() : i4;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zI4 = y6Var.I();
            if (y6Var.e()) {
                int i5 = this.f;
                if (i5 != -1 && !zI4) {
                    y6.v(y6Var, "Expected end of the array or comma", 0, (String) null, 6);
                    throw null;
                }
                iD = i5 + 1;
                this.f = iD;
            } else if (zI4) {
                vfa0 vfa0Var3 = nfa0Var.a;
                vvm1.z(y6Var, "array");
                throw null;
            }
        } else {
            int i6 = this.f;
            boolean z5 = i6 % 2 != 0;
            if (!z5) {
                y6Var.k(':');
            } else if (i6 != -1) {
                zI = y6Var.I();
            }
            if (y6Var.e()) {
                if (z5) {
                    int i7 = this.f;
                    int i8 = y6Var.b;
                    if (i7 == -1) {
                        if (zI) {
                            y6.v(y6Var, "Unexpected leading comma", i8, (String) null, 4);
                            throw null;
                        }
                    } else if (!zI) {
                        y6.v(y6Var, "Expected comma after the key-value pair", i8, (String) null, 4);
                        throw null;
                    }
                }
                iD = this.f + 1;
                this.f = iD;
            } else if (zI) {
                vfa0 vfa0Var4 = nfa0Var.a;
                vvm1.A(y6Var);
                throw null;
            }
        }
        if (rjm1Var != rjm1.MAP) {
            ((int[]) yga0Var.e)[yga0Var.b] = iD;
        }
        return iD;
    }

    @Override // p.dar
    public final long u() {
        return this.d.l();
    }

    @Override // p.dar
    public final dar w(h661 h661Var) {
        return xfc1.b(h661Var) ? new cga0(this.d, this.b) : this;
    }
}
