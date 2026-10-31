package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oob0 extends a8d1 implements iu30 {
    public final /* synthetic */ float X;
    public final /* synthetic */ long Y;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public n511 f;
    public long g;
    public byte h;
    public final /* synthetic */ pob0 i;
    public final /* synthetic */ lbh t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oob0(pob0 pob0Var, lbh lbhVar, float f, long j, lnm lnmVar) {
        super(1, lnmVar);
        this.i = pob0Var;
        this.t = lbhVar;
        this.X = f;
        this.Y = j;
    }

    public final lnm create(lnm lnmVar) {
        return new oob0(this.i, this.t, this.X, this.Y, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        float f3;
        long jFloatToRawIntBits;
        n511 n511VarI;
        float fIntBitsToFloat;
        d9n d9nVar;
        float f4;
        o95 o95Var;
        Float f5;
        pob0 pob0Var = this.i;
        hrr0 hrr0Var = pob0Var.j;
        drr0 drr0Var = pob0Var.k;
        byte b = this.h;
        lbh lbhVar = this.t;
        rih1 rih1Var = rih1.a;
        d9n d9nVar2 = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            if (pob0Var.d() && lbhVar.b != 0) {
                float fS = drr0Var.s();
                float f6 = this.X * fS;
                float fO = yoi1.o(f6, pob0Var.a, pob0Var.b);
                if (fO != fS) {
                    pob0Var.e(rz20.a);
                    this.a = fS;
                    this.b = f6;
                    this.c = fO;
                    this.h = (byte) 1;
                    if (pob0Var.h(this) == d9nVar2) {
                        return d9nVar2;
                    }
                    f = f6;
                    f2 = fS;
                    f3 = fO;
                }
            }
            return rih1Var;
        }
        if (b == 1) {
            f3 = this.c;
            f = this.b;
            f2 = this.a;
            hm5.M(obj);
        } else {
            if (b != 2) {
                if (b == 3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f4 = this.e;
            float f7 = this.d;
            long j = this.g;
            float f8 = this.c;
            f = this.b;
            f2 = this.a;
            n511VarI = this.f;
            hm5.M(obj);
            f3 = f8;
            jFloatToRawIntBits = j;
            fIntBitsToFloat = f7;
            d9nVar = d9nVar2;
        }
        o95Var = pob0Var.h;
        f5 = new Float(yoi1.o(f4, n511VarI.b, n511VarI.d));
        this.f = null;
        this.a = f2;
        this.b = f;
        this.c = f3;
        this.g = jFloatToRawIntBits;
        this.d = fIntBitsToFloat;
        this.e = f4;
        this.h = (byte) 3;
        if (o95Var.g(f5, this) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
        float fFloatValue = ((Number) pob0Var.g.e()).floatValue();
        float fFloatValue2 = ((Number) pob0Var.h.e()).floatValue();
        long j2 = ((Size) hrr0Var.getValue()).a;
        long j3 = this.Y;
        int i = (int) (j3 >> 32);
        float fIntBitsToFloat2 = (Float.intBitsToFloat(i) / f2) + fFloatValue;
        int i2 = (int) (j3 & 4294967295L);
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i2) / f2) + fFloatValue2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        drr0Var.t(f3);
        n511VarI = pob0.i(lbhVar.k, ((Size) hrr0Var.getValue()).a, drr0Var.s());
        float f9 = n511VarI.c;
        float f10 = n511VarI.a;
        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) - (Float.intBitsToFloat(i) / f3);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) - (Float.intBitsToFloat(i2) / f3);
        pob0Var.g.i(new Float(f10), new Float(f9));
        pob0Var.h.i(new Float(n511VarI.b), new Float(n511VarI.d));
        o95 o95Var2 = pob0Var.g;
        Float f11 = new Float(yoi1.o(fIntBitsToFloat, f10, f9));
        this.f = n511VarI;
        this.a = f2;
        this.b = f;
        this.c = f3;
        this.g = jFloatToRawIntBits;
        this.d = fIntBitsToFloat;
        this.e = fIntBitsToFloat3;
        this.h = (byte) 2;
        Object objG = o95Var2.g(f11, this);
        d9nVar = d9nVar2;
        if (objG == d9nVar) {
            return d9nVar;
        }
        f4 = fIntBitsToFloat3;
        o95Var = pob0Var.h;
        f5 = new Float(yoi1.o(f4, n511VarI.b, n511VarI.d));
        this.f = null;
        this.a = f2;
        this.b = f;
        this.c = f3;
        this.g = jFloatToRawIntBits;
        this.d = fIntBitsToFloat;
        this.e = f4;
        this.h = (byte) 3;
        if (o95Var.g(f5, this) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }
}
