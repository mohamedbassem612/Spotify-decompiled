package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ea5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l4g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea5(l4g l4gVar, byte b) {
        super(1);
        this.a = b;
        this.b = l4gVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l4g l4gVar = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                float fFloatValue = ((Number) l4gVar.b.e()).floatValue();
                kd31Var.b(((Number) l4gVar.e.e()).floatValue() * yoi1.o(1.0f - (fFloatValue / 0.8f), 0.0f, 1.0f));
                kd31Var.f(true);
                kd31Var.w(new c8h0(fFloatValue));
                float fFloatValue2 = ((Number) l4gVar.d.e()).floatValue();
                kd31Var.q(fFloatValue2);
                kd31Var.r(fFloatValue2);
                break;
            default:
                kd31 kd31Var2 = (kd31) obj;
                o95 o95Var = l4gVar.b;
                o95 o95Var2 = l4gVar.c;
                kd31Var2.b(((Number) o95Var.e()).floatValue() >= 0.85f ? 1.0f : 0.0f);
                kd31Var2.q(((Number) o95Var2.e()).floatValue());
                kd31Var2.r(((Number) o95Var2.e()).floatValue());
                break;
        }
        return rih1Var;
    }
}
