package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hob0 extends a8d1 implements iu30 {
    public float a;
    public float b;
    public float c;
    public float d;
    public byte e;
    public final /* synthetic */ pob0 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hob0(pob0 pob0Var, long j, lnm lnmVar) {
        super(1, lnmVar);
        this.f = pob0Var;
        this.g = j;
    }

    public final lnm create(lnm lnmVar) {
        return new hob0(this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c4  */
    public final Object invokeSuspend(Object obj) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        o95 o95Var;
        Float f4;
        float f5;
        float f6;
        pob0 pob0Var = this.f;
        drr0 drr0Var = pob0Var.k;
        byte b = this.e;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            this.e = (byte) 1;
            if (pob0Var.h(this) != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
        } else {
            if (b == 2) {
                f3 = this.d;
                f = this.c;
                f2 = this.b;
                float f7 = this.a;
                hm5.M(obj);
                fFloatValue = f7;
                o95Var = pob0Var.h;
                f4 = new Float(f3);
                this.a = fFloatValue;
                this.b = f2;
                this.c = f;
                this.d = f3;
                this.e = (byte) 3;
                if (o95Var.g(f4, this) != d9nVar) {
                    f5 = fFloatValue;
                    f6 = f2;
                }
                return d9nVar;
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f6 = this.b;
            f5 = this.a;
            hm5.M(obj);
        }
        float fS = drr0Var.s() * (f5 - ((Number) pob0Var.g.e()).floatValue());
        return new Offset((((long) Float.floatToRawIntBits(drr0Var.s() * (f6 - ((Number) pob0Var.h.e()).floatValue()))) & 4294967295L) | (Float.floatToRawIntBits(fS) << 32));
        pob0Var.e(rz20.a);
        if (!pob0Var.d()) {
            return new Offset(0L);
        }
        fFloatValue = ((Number) pob0Var.g.e()).floatValue();
        float fFloatValue2 = ((Number) pob0Var.h.e()).floatValue();
        long j = this.g;
        float fIntBitsToFloat = fFloatValue - (Float.intBitsToFloat((int) (j >> 32)) / drr0Var.s());
        float fIntBitsToFloat2 = fFloatValue2 - (Float.intBitsToFloat((int) (j & 4294967295L)) / drr0Var.s());
        o95 o95Var2 = pob0Var.g;
        Float f8 = new Float(fIntBitsToFloat);
        this.a = fFloatValue;
        this.b = fFloatValue2;
        this.c = fIntBitsToFloat;
        this.d = fIntBitsToFloat2;
        this.e = (byte) 2;
        if (o95Var2.g(f8, this) != d9nVar) {
            f = fIntBitsToFloat;
            f2 = fFloatValue2;
            f3 = fIntBitsToFloat2;
            o95Var = pob0Var.h;
            f4 = new Float(f3);
            this.a = fFloatValue;
            this.b = f2;
            this.c = f;
            this.d = f3;
            this.e = (byte) 3;
            if (o95Var.g(f4, this) != d9nVar) {
                f5 = fFloatValue;
                f6 = f2;
                float fS2 = drr0Var.s() * (f5 - ((Number) pob0Var.g.e()).floatValue());
                return new Offset((((long) Float.floatToRawIntBits(drr0Var.s() * (f6 - ((Number) pob0Var.h.e()).floatValue()))) & 4294967295L) | (Float.floatToRawIntBits(fS2) << 32));
            }
        }
        return d9nVar;
    }
}
