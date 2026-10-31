package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fu90 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ o95 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu90(float f, o95 o95Var) {
        super(1);
        this.b = f;
        this.c = o95Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        float f = this.b;
        switch (b) {
            case 0:
                kd31 kd31Var = (kd31) obj;
                o95 o95Var = this.c;
                kd31Var.b(yoi1.o(((Number) o95Var.e()).floatValue(), 0.0f, 1.0f));
                kd31Var.E((1.0f - ((Number) o95Var.e()).floatValue()) * f);
                return rih1.a;
            default:
                eqc eqcVar = (eqc) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * 0.2f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) * 0.5f;
                float fMax = Math.max(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)), Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L))) * 0.55f;
                Float fValueOf = Float.valueOf(0.0f);
                long j = u7h.f;
                return eqcVar.b(new zrb1(this.c, v9c.p(new mmr0[]{new mmr0(fValueOf, new u7h(u7h.b(j, f * 0.65f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.15f), new u7h(u7h.b(j, f * 0.42f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.35f), new u7h(u7h.b(j, f * 0.18f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.55f), new u7h(u7h.b(j, f * 0.05f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.75f), new u7h(u7h.b(j, f * 0.005f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.j))}, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), fMax, 8), fMax, fIntBitsToFloat, fIntBitsToFloat2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu90(o95 o95Var, float f) {
        super(1);
        this.c = o95Var;
        this.b = f;
    }
}
