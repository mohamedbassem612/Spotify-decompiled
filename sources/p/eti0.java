package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class eti0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ eti0(qr50 qr50Var, o811 o811Var, o811 o811Var2, r7e1 r7e1Var, boolean z) {
        this.c = o811Var;
        this.d = r7e1Var;
        this.b = z;
        this.e = qr50Var;
        this.f = o811Var2;
    }

    public final Object invoke(Object obj) {
        float fFloatValue;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        boolean z = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                hrr0 hrr0Var = ((zen0) obj5).d;
                ven0 ven0Var = (ven0) obj4;
                tob1 tob1Var = (tob1) obj3;
                tob1 tob1Var2 = (tob1) obj2;
                kd31 kd31Var = (kd31) obj;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                if (z) {
                    fFloatValue = ((Boolean) hrr0Var.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) tob1Var.getValue()).floatValue();
                }
                kd31Var.q(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) tob1Var.getValue()).floatValue();
                } else if (((Boolean) hrr0Var.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                kd31Var.r(fFloatValue2);
                if (!z) {
                    fFloatValue3 = ((Number) tob1Var2.getValue()).floatValue();
                } else if (!((Boolean) hrr0Var.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                kd31Var.b(fFloatValue3);
                kd31Var.A(((ofg1) ven0Var.getValue()).a);
                break;
            default:
                r7e1 r7e1Var = (r7e1) obj4;
                long jA = px51.a(r7e1Var.o(z));
                ((o811) obj5).a = jA;
                r7e1Var.A((qr50) obj3, jA);
                ((o811) obj2).a = 0L;
                r7e1Var.w = -1;
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ eti0(boolean z, zen0 zen0Var, ven0 ven0Var, fhg1 fhg1Var, fhg1 fhg1Var2) {
        this.b = z;
        this.c = zen0Var;
        this.d = ven0Var;
        this.e = fhg1Var;
        this.f = fhg1Var2;
    }
}
