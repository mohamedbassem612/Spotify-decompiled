package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class he21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pe21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he21(pe21 pe21Var, byte b) {
        super(0);
        this.a = b;
        this.b = pe21Var;
    }

    public final Object invoke() {
        long jG;
        long j;
        byte b = this.a;
        float fR = 0.0f;
        pe21 pe21Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(pe21Var.m.getValue() != null);
            case 1:
                return pe21Var.a.d();
            case 2:
                oe21 oe21VarB = pe21Var.b();
                if (oe21VarB != null) {
                    ptb0 ptb0Var = (ptb0) pe21Var.a.d().b;
                    int iOrdinal = ptb0Var.q.ordinal();
                    if (iOrdinal == 0) {
                        jG = ptb0Var.g() & 4294967295L;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        jG = ptb0Var.g() >> 32;
                    }
                    long jA = oe21VarB.a();
                    fR = (((int) jG) - yto1.r((((long) Float.floatToRawIntBits((int) (jA >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (jA & 4294967295L)))), pe21Var.d())) - 1.0f;
                }
                return Float.valueOf(fR);
            case 3:
                oe21 oe21VarB2 = pe21Var.b();
                if (oe21VarB2 != null) {
                    long jA2 = oe21VarB2.a();
                    float fR2 = yto1.r((((long) Float.floatToRawIntBits((int) (jA2 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jA2 & 4294967295L))) & 4294967295L), pe21Var.d());
                    long jB = oe21VarB2.b();
                    int iOrdinal2 = pe21Var.d().ordinal();
                    if (iOrdinal2 == 0) {
                        j = jB & 4294967295L;
                    } else {
                        if (iOrdinal2 != 1) {
                            eg.o();
                            return null;
                        }
                        j = jB >> 32;
                    }
                    fR = (fR2 + ((int) j)) - 1.0f;
                }
                return Float.valueOf(fR);
            default:
                return pe21Var.d();
        }
    }
}
