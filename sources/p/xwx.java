package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xwx extends hab0 implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zwx c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ksg e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ swx h;
    public final /* synthetic */ List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwx(float f, int i, zwx zwxVar, float f2, ksg ksgVar, long j, long j2, swx swxVar, List list) {
        super(1);
        this.a = f;
        this.b = i;
        this.c = zwxVar;
        this.d = f2;
        this.e = ksgVar;
        this.f = j;
        this.g = j2;
        this.h = swxVar;
        this.i = list;
    }

    public final Object invoke(Object obj) {
        long jFloatToRawIntBits;
        DrawScope drawScope = (DrawScope) obj;
        float fX0 = drawScope.X0(this.a);
        int iC = l1d.C(this.b);
        if (iC == 0) {
            float f = fX0 / 2.0f;
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            jFloatToRawIntBits = 0;
        }
        long j = jFloatToRawIntBits;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fX0) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() >> 32)) + 0.0f;
        float f2 = this.d;
        ksg ksgVar = this.e;
        float F = guo1.F(f2, ksgVar);
        float F2 = guo1.F(0.0f, ksgVar);
        DrawScope.g0(drawScope, this.f, (((long) Float.floatToRawIntBits(-0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), j, (DrawStyle) null, 0.0f, 0, 240);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.j() >> 32)) * F;
        if (F > 0.0f) {
            DrawScope.g0(drawScope, this.g, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(-0.0f)) << 32), (((long) Float.floatToRawIntBits(fX0)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3 - (-0.0f))) << 32), j, (DrawStyle) null, 0.0f, 0, 240);
        }
        float fMax = F2 > F ? Math.max((Float.intBitsToFloat((int) (drawScope.j() >> 32)) * F2) - fIntBitsToFloat3, 0.0f) : 0.0f;
        swx swxVar = this.h;
        if (fMax > 0.0f) {
            DrawScope.g0(drawScope, swxVar.g, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), j, (DrawStyle) null, 0.0f, 0, 240);
        }
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            DrawScope.d0(drawScope, swxVar.h, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) * ((Number) it.next()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(drawScope.X0(this.c.c))) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), 0.0f, (phc1) null, (ColorFilter) null, 120);
        }
        return rih1.a;
    }
}
