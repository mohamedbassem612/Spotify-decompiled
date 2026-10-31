package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nn00 implements d6o0 {
    public final /* synthetic */ on00 a;

    public nn00(on00 on00Var) {
        this.a = on00Var;
    }

    public final long M(int i, long j) {
        on00 on00Var = this.a;
        b8f1 b8f1Var = on00Var.a;
        if (!((Boolean) on00Var.d.invoke()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) > 0.0f) {
            return 0L;
        }
        float fS = b8f1Var.c.s();
        b8f1Var.b(Float.intBitsToFloat(i2) + b8f1Var.c.s());
        if (fS == b8f1Var.c.s()) {
            return 0L;
        }
        return Offset.a(j, 2, 0.0f, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object Q0(long j, long j2, lnm lnmVar) {
        mn00 mn00Var;
        long j3;
        on00 on00Var = this.a;
        b8f1 b8f1Var = on00Var.a;
        if (lnmVar instanceof mn00) {
            mn00Var = (mn00) lnmVar;
            int i = mn00Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                mn00Var.d = i - os00.INVALID_ID;
            } else {
                mn00Var = new mn00(this, (onm) lnmVar);
            }
        } else {
            mn00Var = new mn00(this, (onm) lnmVar);
        }
        Object qui1Var = mn00Var.b;
        int i2 = mn00Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(qui1Var);
            if (qui1.e(j2) > 0.0f) {
                b8f1Var.b.t(0.0f);
            }
            mn00Var.a = j2;
            mn00Var.d = 1;
            qui1Var = new qui1(0L);
            if (qui1Var != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            j2 = mn00Var.a;
            hm5.M(qui1Var);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = mn00Var.a;
            hm5.M(qui1Var);
        }
        return new qui1(qui1.g(j3, ((qui1) qui1Var).a));
        long j4 = ((qui1) qui1Var).a;
        float fE = qui1.e(j2);
        e9r e9rVar = on00Var.c;
        n8b1 n8b1Var = on00Var.b;
        mn00Var.a = j4;
        mn00Var.d = 2;
        qui1Var = ti5.h(b8f1Var, fE, e9rVar, n8b1Var, mn00Var);
        if (qui1Var != obj) {
            j3 = j4;
            return new qui1(qui1.g(j3, ((qui1) qui1Var).a));
        }
        return obj;
    }

    public final long h0(int i, long j, long j2) {
        on00 on00Var = this.a;
        b8f1 b8f1Var = on00Var.a;
        if (!((Boolean) on00Var.d.invoke()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        b8f1Var.b.t(Float.intBitsToFloat(i2) + b8f1Var.b.s());
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < 0.0f || Float.intBitsToFloat(i2) < 0.0f) {
            float fS = b8f1Var.c.s();
            b8f1Var.b(Float.intBitsToFloat(i2) + b8f1Var.c.s());
            return (((long) Float.floatToRawIntBits(b8f1Var.c.s() - fS)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        if (Float.intBitsToFloat(i3) <= 0.0f) {
            return 0L;
        }
        float fS2 = b8f1Var.c.s();
        b8f1Var.b(Float.intBitsToFloat(i3) + b8f1Var.c.s());
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(b8f1Var.c.s() - fS2)) & 4294967295L);
    }
}
