package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cga0 extends hso1 {
    public final y6 b;
    public final kl1 c;

    public cga0(y6 y6Var, nfa0 nfa0Var) {
        this.b = y6Var;
        this.c = nfa0Var.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final short C() throws SerializationException {
        n5h1 n5h1Var;
        y6 y6Var = this.b;
        String strP = y6Var.p();
        try {
            u4h1 u4h1VarB = zno1.B(strP);
            if (u4h1VarB != null) {
                int i = u4h1VarB.a;
                n5h1Var = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new n5h1((short) i);
            }
            if (n5h1Var != null) {
                return n5h1Var.a;
            }
            nhc1.U(strP);
            throw null;
        } catch (IllegalArgumentException unused) {
            y6.v(y6Var, cy30.n("Failed to parse type 'UShort' for input '", strP, '\''), 0, null, 6);
            throw null;
        }
    }

    public final kl1 c() {
        return this.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final byte c0() throws SerializationException {
        p3h1 p3h1Var;
        y6 y6Var = this.b;
        String strP = y6Var.p();
        try {
            u4h1 u4h1VarB = zno1.B(strP);
            if (u4h1VarB != null) {
                int i = u4h1VarB.a;
                p3h1Var = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new p3h1((byte) i);
            }
            if (p3h1Var != null) {
                return p3h1Var.a;
            }
            nhc1.U(strP);
            throw null;
        } catch (IllegalArgumentException unused) {
            y6.v(y6Var, cy30.n("Failed to parse type 'UByte' for input '", strP, '\''), 0, null, 6);
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final int n() throws SerializationException {
        y6 y6Var = this.b;
        String strP = y6Var.p();
        try {
            u4h1 u4h1VarB = zno1.B(strP);
            if (u4h1VarB != null) {
                return u4h1VarB.a;
            }
            nhc1.U(strP);
            throw null;
        } catch (IllegalArgumentException unused) {
            y6.v(y6Var, cy30.n("Failed to parse type 'UInt' for input '", strP, '\''), 0, null, 6);
            throw null;
        }
    }

    public final int p(h661 h661Var) {
        throw new IllegalStateException("unsupported");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final long u() throws SerializationException {
        y6 y6Var = this.b;
        String strP = y6Var.p();
        try {
            z4h1 z4h1VarC = zno1.C(strP);
            if (z4h1VarC != null) {
                return z4h1VarC.a;
            }
            nhc1.U(strP);
            throw null;
        } catch (IllegalArgumentException unused) {
            y6.v(y6Var, cy30.n("Failed to parse type 'ULong' for input '", strP, '\''), 0, null, 6);
            throw null;
        }
    }
}
