package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yqa0 implements d6o0 {
    public final /* synthetic */ mqa0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ pxg1 e;
    public final /* synthetic */ n8b1 f;
    public final /* synthetic */ ven0 g;

    public yqa0(mqa0 mqa0Var, float f, float f2, float f3, pxg1 pxg1Var, n8b1 n8b1Var, ven0 ven0Var) {
        this.a = mqa0Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = pxg1Var;
        this.f = n8b1Var;
        this.g = ven0Var;
    }

    public final long M(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        mqa0 mqa0Var = this.a;
        if (!mqa0Var.a()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) == 0.0f) {
            return 0L;
        }
        float fB = mqa0Var.b(Float.intBitsToFloat(i2), this.b);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object Q0(long j, long j2, lnm lnmVar) throws Throwable {
        wqa0 wqa0Var;
        if (lnmVar instanceof wqa0) {
            wqa0Var = (wqa0) lnmVar;
            int i = wqa0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wqa0Var.d = i - Integer.MIN_VALUE;
            } else {
                wqa0Var = new wqa0(this, (onm) lnmVar);
            }
        } else {
            wqa0Var = new wqa0(this, (onm) lnmVar);
        }
        wqa0 wqa0Var2 = wqa0Var;
        Object obj = wqa0Var2.b;
        int i2 = wqa0Var2.d;
        if (i2 == 0) {
            hm5.M(obj);
            mqa0 mqa0Var = this.a;
            if (!mqa0Var.a() && mqa0Var.a.s() == 0.0f) {
                return new qui1(0L);
            }
            float fE = qui1.e(j2);
            Function0 function0 = (Function0) this.g.getValue();
            wqa0Var2.a = j2;
            wqa0Var2.d = 1;
            Object objC = mqa0Var.c(fE, this.c, this.d, this.e, this.f, function0, wqa0Var2);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = wqa0Var2.a;
            hm5.M(obj);
        }
        return new qui1(j2);
    }

    public final long h0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == 0.0f) {
            return 0L;
        }
        mqa0 mqa0Var = this.a;
        if (!mqa0Var.a()) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(mqa0Var.b(Float.intBitsToFloat(i2), this.b))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object k0(long j, lnm lnmVar) throws Throwable {
        xqa0 xqa0Var;
        if (lnmVar instanceof xqa0) {
            xqa0Var = (xqa0) lnmVar;
            int i = xqa0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xqa0Var.d = i - Integer.MIN_VALUE;
            } else {
                xqa0Var = new xqa0(this, (onm) lnmVar);
            }
        } else {
            xqa0Var = new xqa0(this, (onm) lnmVar);
        }
        xqa0 xqa0Var2 = xqa0Var;
        Object obj = xqa0Var2.b;
        int i2 = xqa0Var2.d;
        if (i2 == 0) {
            hm5.M(obj);
            mqa0 mqa0Var = this.a;
            if (!mqa0Var.a() && mqa0Var.a.s() == 0.0f) {
                return new qui1(0L);
            }
            float fE = qui1.e(j);
            Function0 function0 = (Function0) this.g.getValue();
            xqa0Var2.a = j;
            xqa0Var2.d = 1;
            Object objC = mqa0Var.c(fE, this.c, this.d, this.e, this.f, function0, xqa0Var2);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = xqa0Var2.a;
            hm5.M(obj);
        }
        return new qui1(j);
    }
}
