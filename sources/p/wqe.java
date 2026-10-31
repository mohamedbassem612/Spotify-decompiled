package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wqe extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o95 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wqe(o95 o95Var, byte b) {
        super(1);
        this.a = b;
        this.b = o95Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o95 o95Var = this.b;
        switch (b) {
            case 0:
                ((kd31) obj).b(((Number) o95Var.e()).floatValue());
                return rih1Var;
            case 1:
                return new qr80(((long) jch0.U(((Number) o95Var.e()).floatValue())) & 4294967295L);
            case 2:
                return new qr80(((long) jch0.U(((Number) o95Var.e()).floatValue())) & 4294967295L);
            case 3:
                ((kd31) obj).b(((Number) o95Var.e()).floatValue());
                return rih1Var;
            case 4:
                return new qr80(((long) jch0.U(((Number) o95Var.e()).floatValue())) & 4294967295L);
            case 5:
                return new qr80(((long) jch0.U(((Number) o95Var.e()).floatValue())) & 4294967295L);
            case 6:
                kd31 kd31Var = (kd31) obj;
                kd31Var.A(sgc1.u(1.0f, 1.0f));
                kd31Var.p(((Number) o95Var.e()).floatValue());
                return rih1Var;
            case 7:
                DrawScope drawScope = (DrawScope) obj;
                float fX0 = drawScope.X0(72.0f);
                float fX1 = drawScope.X0(0.4f);
                float fFloatValue = ((Number) o95Var.e()).floatValue();
                tw4 tw4VarA = ww4.a();
                float f = fX1 / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) - f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L);
                tw4VarA.e(ila0.e(f, f, fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), 1);
                Float fValueOf = Float.valueOf(0.0f);
                long j = u7h.j;
                mmr0 mmr0Var = new mmr0(fValueOf, new u7h(j));
                Float fValueOf2 = Float.valueOf(0.45f);
                long j2 = u7h.f;
                mmr0[] mmr0VarArr = {mmr0Var, new mmr0(fValueOf2, new u7h(u7h.b(j2, 0.8f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.55f), new u7h(u7h.b(j2, 0.8f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(j))};
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) * (fFloatValue - 0.3f))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.j() >> 32)) * (fFloatValue + 0.3f);
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                DrawScope.j1(drawScope, tw4VarA, v9c.l(mmr0VarArr, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), 0), 0.0f, new phc1(fX1, 0.0f, 0, 0, (uw4) null, 30), 52);
                return rih1Var;
            case 8:
                ((kd31) obj).b(((Number) o95Var.e()).floatValue());
                return rih1Var;
            case 9:
                wat watVar = (wat) obj;
                return new qr80((((long) watVar.i0(0.0f)) << 32) | (((long) watVar.i0(((Number) o95Var.e()).floatValue())) & 4294967295L));
            case 10:
                ((kd31) obj).b(((Number) o95Var.e()).floatValue());
                return rih1Var;
            case 11:
                wat watVar2 = (wat) obj;
                return new qr80((((long) watVar2.i0(0.0f)) << 32) | (((long) watVar2.i0(((Number) o95Var.e()).floatValue())) & 4294967295L));
            case 12:
                return new qr80(((long) jch0.U(((Number) o95Var.e()).floatValue())) & 4294967295L);
            case 13:
                return new qr80(((long) jch0.U(((Number) o95Var.e()).floatValue())) & 4294967295L);
            case 14:
                zjy.m((Number) o95Var.e(), (kd31) obj, 2);
                return rih1Var;
            case 15:
                zjy.m((Number) o95Var.e(), (kd31) obj, 2);
                return rih1Var;
            default:
                return new qr80(((long) jch0.U(((Number) o95Var.e()).floatValue())) & 4294967295L);
        }
    }
}
