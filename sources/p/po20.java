package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class po20 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ bjg1 c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ tob1 e;
    public final /* synthetic */ jmr0 f;
    public final /* synthetic */ tob1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po20(long j, float f, bjg1 bjg1Var, fhg1 fhg1Var, fhg1 fhg1Var2, jmr0 jmr0Var, fhg1 fhg1Var3) {
        super(1);
        this.a = j;
        this.b = f;
        this.c = bjg1Var;
        this.d = fhg1Var;
        this.e = fhg1Var2;
        this.f = jmr0Var;
        this.g = fhg1Var3;
    }

    public final Object invoke(Object obj) {
        lsl lslVar = (lsl) obj;
        lslVar.s1();
        float fMin = Math.min(Float.intBitsToFloat((int) (lslVar.j() >> 32)) / 1.25f, Float.intBitsToFloat((int) (this.a >> 32)));
        float f = fMin / this.b;
        bjg1 bjg1Var = this.c;
        if (((Boolean) ((mhg1) bjg1Var).a.P0()).booleanValue() || ((Boolean) ((mhg1) bjg1Var).d.getValue()).booleanValue()) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() >> 32));
            tob1 tob1Var = this.d;
            float fFloatValue = ((Number) tob1Var.getValue()).floatValue() * fMin;
            float fFloatValue2 = ((Number) tob1Var.getValue()).floatValue() * f;
            float fFloatValue3 = (((fIntBitsToFloat / 2.0f) / 2.0f) * ((Number) this.e.getValue()).floatValue()) + ((fIntBitsToFloat - fFloatValue) / 2.0f);
            float fX0 = ((-fFloatValue2) / 2.0f) - lslVar.X0(0.75f);
            jmr0 jmr0Var = this.f;
            tob1 tob1Var2 = this.g;
            ((dg8) lslVar.a1().b).z(fFloatValue3, fX0);
            try {
                jmr0.g(jmr0Var, lslVar, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L), ((Number) tob1Var2.getValue()).floatValue(), (f2b) null, 4);
            } finally {
                ((dg8) lslVar.a1().b).z(-fFloatValue3, -fX0);
            }
        }
        return rih1.a;
    }
}
