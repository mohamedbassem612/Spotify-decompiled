package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mrf implements PointerInputEventHandler {
    public final /* synthetic */ idn0 a;
    public final /* synthetic */ idn0 b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ tob1 e;
    public final /* synthetic */ tob1 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ tob1 h;
    public final /* synthetic */ tob1 i;
    public final /* synthetic */ ven0 j;

    public mrf(idn0 idn0Var, idn0 idn0Var2, tob1 tob1Var, ven0 ven0Var, tob1 tob1Var2, tob1 tob1Var3, ven0 ven0Var2, tob1 tob1Var4, tob1 tob1Var5, ven0 ven0Var3) {
        this.a = idn0Var;
        this.b = idn0Var2;
        this.c = tob1Var;
        this.d = ven0Var;
        this.e = tob1Var2;
        this.f = tob1Var3;
        this.g = ven0Var2;
        this.h = tob1Var4;
        this.i = tob1Var5;
        this.j = ven0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public static final boolean a(tob1 tob1Var, ven0 ven0Var, tob1 tob1Var2, tob1 tob1Var3, ven0 ven0Var2, tob1 tob1Var4, tob1 tob1Var5, long j) {
        boolean z;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((Number) tob1Var.getValue()).floatValue();
        int iOrdinal = ((flb0) ven0Var.getValue()).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                eg.o();
                return false;
            }
            if (fIntBitsToFloat <= ((Number) tob1Var3.getValue()).floatValue()) {
                z = true;
            } else {
                z = false;
            }
        } else if (fIntBitsToFloat >= ((Number) tob1Var2.getValue()).floatValue()) {
            z = true;
        } else {
            z = false;
        }
        if (ven0Var2.getValue() != null && z) {
            if (Float.intBitsToFloat((int) (4294967295L & j)) + ((Number) tob1Var4.getValue()).floatValue() >= ((Number) tob1Var5.getValue()).floatValue()) {
                return true;
            }
        }
        return false;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        tob1 tob1Var = this.i;
        idn0 idn0Var = this.a;
        idn0 idn0Var2 = this.b;
        tob1 tob1Var2 = this.c;
        ven0 ven0Var = this.d;
        tob1 tob1Var3 = this.e;
        tob1 tob1Var4 = this.f;
        ven0 ven0Var2 = this.g;
        Object objD = rqd1.d(nav0Var, (iu30) null, (iu30) null, new lrf(idn0Var, idn0Var2, tob1Var2, ven0Var, tob1Var3, tob1Var4, ven0Var2, this.h, tob1Var, null), new qi1(ven0Var2, this.j, this.c, ven0Var, this.e, this.f, this.h, this.i), lnmVar, 3);
        return objD == d9n.a ? objD : rih1.a;
    }
}
