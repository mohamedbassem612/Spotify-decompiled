package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rr9 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr9(float f, j8d1 j8d1Var, hdn0 hdn0Var, drr0 drr0Var, ven0 ven0Var) {
        super(0);
        this.b = f;
        this.d = j8d1Var;
        this.e = hdn0Var;
        this.f = drr0Var;
        this.c = ven0Var;
    }

    public final Object invoke() {
        hjn hjnVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.f;
        Object obj2 = this.c;
        float f = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((or9) obj3).c(f, (c9n) obj, qui1.e(((tui1) obj4).b()), (Function0) ((ven0) obj2).getValue());
                break;
            case 1:
                ydh.m((hdn0) obj3, 1);
                ven0 ven0Var = (ven0) obj2;
                drr0 drr0Var = (drr0) obj;
                if (Math.abs(drr0Var.s()) < f) {
                    hjnVar = new hjn(drr0Var.s(), 0.0f, false);
                } else {
                    float fS = drr0Var.s();
                    long j = ((j8d1) obj4).Y0;
                    hjnVar = new hjn(drr0Var.s(), fS < 0.0f ? -((int) (j >> 32)) : (int) (j >> 32), true);
                }
                ven0Var.setValue(hjnVar);
                break;
            default:
                o95 o95Var = (o95) obj4;
                float fFloatValue = ((Number) o95Var.e()).floatValue();
                o95 o95Var2 = (o95) obj3;
                float fFloatValue2 = ((Number) o95Var2.e()).floatValue();
                if (((float) Math.sqrt((fFloatValue2 * fFloatValue2) + (fFloatValue * fFloatValue))) <= f) {
                    fn31.T((c9n) obj, (o8n) null, 0, new qz71(o95Var, o95Var2, (lnm) null, (byte) 1), 3);
                } else {
                    ((Function0) obj2).invoke();
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr9(o95 o95Var, o95 o95Var2, float f, Function0 function0, c9n c9nVar) {
        super(0);
        this.d = o95Var;
        this.e = o95Var2;
        this.b = f;
        this.c = function0;
        this.f = c9nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr9(tui1 tui1Var, or9 or9Var, float f, c9n c9nVar, ven0 ven0Var) {
        super(0);
        this.d = tui1Var;
        this.e = or9Var;
        this.b = f;
        this.f = c9nVar;
        this.c = ven0Var;
    }
}
