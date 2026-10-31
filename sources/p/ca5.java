package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ca5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca5(float f, long j, long j2, phc1 phc1Var) {
        super(1);
        this.a = (byte) 3;
        this.c = f;
        this.b = j;
        this.d = j2;
        this.e = phc1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.d;
        long jLongValue = this.b;
        float f = this.c;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float fFloatValue = ((Number) ((l4g) obj2).b.e()).floatValue();
                if (fFloatValue < 0.85f) {
                    ceo ceoVar = ka5.a;
                    float f2 = fFloatValue / 0.8f;
                    float fO = yoi1.o(f2, 0.0f, 1.0f);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                    float fIntBitsToFloat2 = ((Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fIntBitsToFloat) * fO) + fIntBitsToFloat;
                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (drawScope.j() >> 32)) - fIntBitsToFloat2) / 2.0f;
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                    float fO2 = yoi1.o(f2, 0.0f, 1.0f);
                    float f3 = fO2 * fO2 * fO2 * fO2;
                    float fIntBitsToFloat5 = (((Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f) - f) * f3) + f;
                    long jA = z4p1.A(f3, j, u7h.b(u7h.f, 1.0f, 0.0f, 0.0f, 0.0f, 14));
                    DrawScope.g0(drawScope, this.b, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), jFloatToRawIntBits, (DrawStyle) null, 0.0f, 0, 240);
                    float f4 = fIntBitsToFloat5 / 2.0f;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3 + f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fIntBitsToFloat5)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - fIntBitsToFloat5)) << 32);
                    float fIntBitsToFloat6 = (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fIntBitsToFloat5) / 2.0f;
                    DrawScope.g0(drawScope, jA, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L), new phc1(fIntBitsToFloat5, 0.0f, 0, 0, (uw4) null, 30), 0.0f, 0, 224);
                }
                return rih1Var;
            case 1:
                z590 z590Var = (z590) obj;
                Long l = (Long) ((p811) obj2).a;
                if (l != null) {
                    jLongValue = l.longValue();
                }
                return z590.a(z590Var, (lsm0) null, false, (o091) null, false, jLongValue, 0L, this.c, this.d, (y1k1) null, 303);
            case 2:
                drr0 drr0Var = (drr0) obj2;
                float fLongValue = (((((Number) obj).longValue() - jLongValue) / 1000000.0f) / j) + f;
                float f5 = fLongValue <= 1.0f ? fLongValue : 1.0f;
                ceo ceoVar2 = kub.a;
                drr0Var.t(f5);
                return rih1Var;
            default:
                DrawScope drawScope2 = (DrawScope) obj;
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) / 2.0f;
                float f6 = f / 360.0f;
                long jA2 = z4p1.A(1.0f - f6, jLongValue, j);
                mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), new u7h(jA2));
                mmr0 mmr0Var2 = new mmr0(Float.valueOf(f6), new u7h(j));
                float f7 = f6 + 0.001f;
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                mmr0[] mmr0VarArr = {mmr0Var, mmr0Var2, new mmr0(Float.valueOf(f7), new u7h(jLongValue)), new mmr0(Float.valueOf(1.0f), new u7h(jA2))};
                long jG1 = drawScope2.g1();
                ArrayList arrayList = new ArrayList(4);
                for (int i = 0; i < 4; i++) {
                    u7h u7hVar = (u7h) mmr0VarArr[i].b;
                    long j2 = u7hVar.a;
                    arrayList.add(u7hVar);
                }
                ArrayList arrayList2 = new ArrayList(4);
                for (int i2 = 0; i2 < 4; i2++) {
                    arrayList2.add(Float.valueOf(((Number) mmr0VarArr[i2].a).floatValue()));
                }
                DrawScope.c0(drawScope2, new l9d1(jG1, arrayList, arrayList2), 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat7)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat7)) & 4294967295L), 0.0f, (phc1) obj2, 214);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca5(long j, float f, long j2, Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = f;
        this.d = j2;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca5(l4g l4gVar, float f, long j, long j2) {
        super(1);
        this.a = (byte) 0;
        this.e = l4gVar;
        this.c = f;
        this.b = j;
        this.d = j2;
    }
}
