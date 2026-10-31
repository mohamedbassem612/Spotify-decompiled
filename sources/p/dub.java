package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dub extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dub(float f, long j, long j2) {
        super(1);
        this.a = (byte) 0;
        this.b = j;
        this.d = f;
        this.c = j2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        float f = this.d;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f)) & 4294967295L);
                DrawScope.g0(drawScope, this.b, 0L, 0L, jFloatToRawIntBits, (DrawStyle) null, 0.0f, 0, 246);
                if (f > 0.0f) {
                    DrawScope.g0(drawScope, this.c, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) * f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), jFloatToRawIntBits, (DrawStyle) null, 0.0f, 0, 242);
                }
                return rih1Var;
            case 1:
                DrawScope drawScope2 = (DrawScope) obj;
                DrawScope.b0(drawScope2, this.b, hrt.f(drawScope2, 2.0f), 0L, 0.0f, (DrawStyle) null, 124);
                DrawScope.b0(drawScope2, this.c, hrt.f(drawScope2, 2.0f), 0L, 0.0f, new phc1(this.d, 0.0f, 0, 0, (uw4) null, 30), 108);
                return rih1Var;
            case 2:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                lslVar.h();
                float fX0 = lslVar.X0(f);
                lslVar.h();
                float fX1 = lslVar.X0(3.0f) + fX0;
                float fIntBitsToFloat = lslVar.getLayoutDirection() == flb0.b ? fX0 : Float.intBitsToFloat((int) (lslVar.j() >> 32)) - fX0;
                DrawScope.b0(lslVar, this.b, fX1, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), 0.0f, (DrawStyle) null, 120);
                DrawScope.b0(lslVar, this.c, fX0, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), 0.0f, (DrawStyle) null, 120);
                return rih1Var;
            case 3:
                return k5u0.b((k5u0) obj, this.b, Long.valueOf(this.c), (Long) null, false, this.d, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32729);
            default:
                DrawScope drawScope3 = (DrawScope) obj;
                DrawScope.g0(drawScope3, this.b, 0L, drawScope3.j(), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.j() & 4294967295L)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.j() & 4294967295L)) / 2.0f)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 242);
                DrawScope.g0(drawScope3, this.c, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.j() >> 32)) * f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.j() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.j() & 4294967295L)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.j() & 4294967295L)) / 2.0f)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 242);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dub(long j, long j2, float f, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = j2;
        this.d = f;
    }
}
