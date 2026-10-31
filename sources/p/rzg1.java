package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rzg1 implements d6o0 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ es41 c;
    public final /* synthetic */ Function0 d;

    public rzg1(Function0 function0, Function0 function1, es41 es41Var, Function0 function2) {
        this.a = function0;
        this.b = function1;
        this.c = es41Var;
        this.d = function2;
    }

    public final long M(int i, long j) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        long j2;
        long j3;
        if (((Boolean) this.a.invoke()).booleanValue()) {
            int iIntValue = ((Number) this.b.invoke()).intValue();
            if (iIntValue <= 0) {
                return 0L;
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            if (fIntBitsToFloat >= 0.0f) {
                return 0L;
            }
            float fS = iIntValue - this.c.a.s();
            if (fS <= 0.0f) {
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            } else {
                if ((-fIntBitsToFloat) <= fS) {
                    return 0L;
                }
                float f = fIntBitsToFloat + fS;
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                iFloatToRawIntBits = Float.floatToRawIntBits(f);
            }
            j2 = jFloatToRawIntBits << 32;
            j3 = ((long) iFloatToRawIntBits) & 4294967295L;
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat2);
            j2 = jFloatToRawIntBits2 << 32;
            j3 = jFloatToRawIntBits3 & 4294967295L;
        }
        return j2 | j3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q0(long j, long j2, lnm lnmVar) {
        qzg1 qzg1Var;
        if (lnmVar instanceof qzg1) {
            qzg1Var = (qzg1) lnmVar;
            int i = qzg1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qzg1Var.c = i - Integer.MIN_VALUE;
            } else {
                qzg1Var = new qzg1(this, (onm) lnmVar);
            }
        } else {
            qzg1Var = new qzg1(this, (onm) lnmVar);
        }
        Object obj = qzg1Var.a;
        int i2 = qzg1Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            int iIntValue = ((Number) this.d.invoke()).intValue();
            es41 es41Var = this.c;
            int iS = es41Var.a.s();
            if (iIntValue > 0 && iS > 0 && iS < iIntValue) {
                if (iS <= iIntValue / 2) {
                    iIntValue = 0;
                }
                n8b1 n8b1VarL0 = irn1.l0(0.8f, 400.0f, (Object) null, 4);
                qzg1Var.c = 1;
                Object objF = es41Var.f(iIntValue, n8b1VarL0, qzg1Var);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new qui1(0L);
    }
}
