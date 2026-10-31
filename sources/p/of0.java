package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class of0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of0(float f, z1a1 z1a1Var, long j) {
        super(1);
        this.a = (byte) 4;
        this.c = f;
        this.d = z1a1Var;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        float f = this.c;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fFloatValue = ((Number) ((tob1) obj2).getValue()).floatValue();
                DrawScope.b0(drawScope, this.b, (drawScope.X0(6.0f) * fFloatValue) + (drawScope.X0(f) / 2.0f), 0L, fFloatValue < 0.7f ? dm5.T(0.5f, 0.3f, fFloatValue / 0.7f) : dm5.T(0.3f, 0.0f, (fFloatValue - 0.7f) / 0.3f), (DrawStyle) null, 116);
                return rih1Var;
            case 1:
                q5t0 q5t0Var = (q5t0) obj2;
                long j = this.b;
                p5t0.u((p5t0) obj, q5t0Var, (hjl.i(j) - ((int) (q5t0Var.a * f))) / 2, (hjl.h(j) - ((int) (q5t0Var.b * f))) / 2, new jc5((byte) 8, f), 4);
                return rih1Var;
            case 2:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                drr0 drr0Var = (drr0) obj2;
                if (drr0Var.s() > 0.0f) {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits((1.0f - drr0Var.s()) * Float.intBitsToFloat((int) (lslVar.j() >> 32)))) << 32);
                    DrawScope.o(lslVar, v9c.p(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(this.b, 0.7f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.25f), new u7h(u7h.b(this.b, 0.21f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.5f), new u7h(u7h.b(this.b, 0.07f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.j))}, jFloatToRawIntBits, f, 8), this.c, jFloatToRawIntBits, 0.0f, (phc1) null, 120);
                }
                return rih1Var;
            case 3:
                DrawScope drawScope2 = (DrawScope) obj;
                y9e1 y9e1Var = (y9e1) ((ven0) obj2).getValue();
                if (y9e1Var != null) {
                    nb51.w(drawScope2, y9e1Var, this.b, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), false, 0.0f, 16);
                }
                return rih1Var;
            default:
                lsl lslVar2 = (lsl) obj;
                float f2 = -f;
                z1a1 z1a1Var = (z1a1) obj2;
                long j2 = this.b;
                ((dg8) lslVar2.a1().b).z(f2, f2);
                try {
                    vpb1.v(lslVar2, z1a1Var, j2, z520.a, 0);
                    float f3 = -f2;
                    ((dg8) lslVar2.a1().b).z(f3, f3);
                    lslVar2.s1();
                    return rih1Var;
                } catch (Throwable th) {
                    float f4 = -f2;
                    ((dg8) lslVar2.a1().b).z(f4, f4);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of0(long j, float f, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = f;
        this.d = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of0(Object obj, long j, float f, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = f;
    }
}
