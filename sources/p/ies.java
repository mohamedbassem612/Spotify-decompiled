package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ies implements d6o0 {
    public final jkr0 a;
    public final qqq0 b;
    public final flb0 c;

    public ies(jkr0 jkr0Var, qqq0 qqq0Var, flb0 flb0Var) {
        this.a = jkr0Var;
        this.b = qqq0Var;
        this.c = flb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    @Override // p.d6o0
    public final long M(int i, long j) {
        float fIntBitsToFloat;
        if (!q1o1.g(i, 1)) {
            return 0L;
        }
        jkr0 jkr0Var = this.a;
        kl1 kl1Var = jkr0Var.d;
        jns jnsVar = jkr0Var.k;
        kl1 kl1Var2 = jkr0Var.d;
        if (Math.abs(kl1Var.q()) <= 1.0E-6d) {
            return 0L;
        }
        qqq0 qqq0Var = this.b;
        qqq0 qqq0Var2 = qqq0.b;
        if (Math.abs(Float.intBitsToFloat((int) (qqq0Var == qqq0Var2 ? j >> 32 : j & 4294967295L))) <= 0.0f) {
            return 0L;
        }
        xjr0 xjr0VarK = jkr0Var.k();
        float fQ = kl1Var2.q() * jkr0Var.m();
        float f = ((xjr0VarK.b + xjr0VarK.c) * (-Math.signum(kl1Var2.q()))) + fQ;
        if (kl1Var2.q() > 0.0f) {
            fQ = f;
            f = fQ;
        }
        float fO = yoi1.o(Float.intBitsToFloat((int) (qqq0Var == qqq0Var2 ? j >> 32 : j & 4294967295L)), fQ, f);
        if (qqq0Var != qqq0Var2) {
            fIntBitsToFloat = -jnsVar.e(-fO);
        } else {
            if (this.c == flb0.b) {
                fIntBitsToFloat = jnsVar.e(fO);
            } else {
                fIntBitsToFloat = -jnsVar.e(-fO);
            }
        }
        float fIntBitsToFloat2 = qqq0Var == qqq0Var2 ? fIntBitsToFloat : Float.intBitsToFloat((int) (j >> 32));
        if (qqq0Var != qqq0.a) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
    }

    @Override // p.d6o0
    public final Object Q0(long j, long j2, lnm lnmVar) {
        return qui1.a(this.b == qqq0.a ? qui1.b(j2, 2, 0.0f, 0.0f) : qui1.b(j2, 1, 0.0f, 0.0f));
    }

    @Override // p.d6o0
    public final long h0(int i, long j, long j2) {
        if (!q1o1.g(i, 2)) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.b == qqq0.b ? j2 >> 32 : 4294967295L & j2)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
