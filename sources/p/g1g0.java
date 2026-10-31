package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g1g0 implements d6o0 {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ l811 c;
    public final /* synthetic */ i0g0 d;
    public final /* synthetic */ l811 e;
    public final /* synthetic */ lbc0 f;

    public g1g0(lbc0 lbc0Var, i0g0 i0g0Var, l811 l811Var, l811 l811Var2, l811 l811Var3, p811 p811Var) {
        this.a = p811Var;
        this.b = l811Var;
        this.c = l811Var2;
        this.d = i0g0Var;
        this.e = l811Var3;
        this.f = lbc0Var;
    }

    public final long M(int i, long j) {
        p811 p811Var = this.a;
        v5v v5vVar = (v5v) p811Var.a;
        if (!this.b.a) {
            if (!this.c.a || v5vVar == null) {
                return 0L;
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j)) + v5vVar.b;
            if (fIntBitsToFloat <= 0.0f) {
                v5vVar = null;
            }
            v5v v5vVar2 = v5vVar != null ? new v5v(v5vVar.a, fIntBitsToFloat) : null;
            p811Var.a = v5vVar2;
            this.d.f(v5vVar2 != null ? new e0g0(yoi1.o(v5vVar2.b / v5vVar2.a, 0.0f, 1.0f)) : new d0g0(c7p0.a, true));
            if (fIntBitsToFloat <= 0.0f) {
                return Offset.a(j, 1, 0.0f, -fIntBitsToFloat);
            }
        }
        return j;
    }

    public final long h0(int i, long j, long j2) {
        if (this.c.a) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            l811 l811Var = this.e;
            if (fIntBitsToFloat != 0.0f || l811Var.a) {
                l811Var.a = true;
                return 0L;
            }
            int i2 = (int) (4294967295L & j2);
            if (Float.intBitsToFloat(i2) > 0.0f) {
                i0g0 i0g0Var = this.d;
                ce0 ce0Var = i0g0Var.f;
                mma0 mma0Var = i0g0.i[0];
                f0g0 f0g0Var = (f0g0) ((sgp0) ce0Var).a;
                v5v v5vVar = null;
                d0g0 d0g0Var = f0g0Var instanceof d0g0 ? (d0g0) f0g0Var : null;
                if ((d0g0Var != null ? d0g0Var.a : null) == c7p0.a) {
                    p811 p811Var = this.a;
                    if (p811Var.a == null) {
                        int iD = i0g0Var.d();
                        Integer numValueOf = Integer.valueOf(iD);
                        if (iD <= 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i2) + i0g0Var.b.c.getTranslationY();
                            v5vVar = new v5v(iIntValue, fIntBitsToFloat2);
                            i0g0Var.f(new e0g0(yoi1.o(fIntBitsToFloat2 / iIntValue, 0.0f, 1.0f)));
                        }
                        p811Var.a = v5vVar;
                    }
                    return j2;
                }
            }
        }
        return 0L;
    }

    public final Object k0(long j, lnm lnmVar) {
        p811 p811Var = this.a;
        v5v v5vVar = (v5v) p811Var.a;
        if (v5vVar != null) {
            mth1.G(p811Var, this.b, this.d, this.f, v5vVar, qui1.e(j));
        } else {
            j = 0;
        }
        return new qui1(j);
    }
}
