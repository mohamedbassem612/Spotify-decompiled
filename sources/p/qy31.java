package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class qy31 {
    public static final float a = 2.0f + 0.75f;

    public static final void a(DrawScope drawScope, float f, Float f2) {
        float fX0 = drawScope.X0(8.0f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) - (2.0f * fX0);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - 0.0f;
        float fX1 = drawScope.X0(5.0f);
        float f3 = f * 0.05f;
        float fE = e(f2, fIntBitsToFloat2, 0.0f);
        fid fidVarP = drawScope.a1().p();
        lw4 lw4VarL = fdg1.l();
        lw4VarL.g(0);
        long j = u7h.f;
        lw4VarL.c(u7h.b(j, f3, 0.0f, 0.0f, 0.0f, 14));
        Paint paint = lw4VarL.a;
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(10.0f, blur));
        float f4 = fX0 + fIntBitsToFloat;
        float f5 = fIntBitsToFloat2 + 0.0f;
        fidVarP.l(fX0, 0.0f, f4, f5, fE, fE, lw4VarL);
        lw4 lw4VarL2 = fdg1.l();
        lw4VarL2.g(1);
        lw4VarL2.e(v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(j, 0.1f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(j, 1.0f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 6).c(drawScope.j()));
        lw4VarL2.f(fX1);
        lw4VarL2.a(f3);
        lw4VarL2.a.setMaskFilter(new BlurMaskFilter(10.0f, blur));
        fidVarP.l(fX0, 0.0f, f4, f5, fE, fE, lw4VarL2);
    }

    public static final void b(DrawScope drawScope, float f, Float f2) {
        float f3 = -drawScope.X0(2.0f);
        float f4 = f3 * 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) - f4;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - f4;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        uwr uwrVar = cbx.a;
        long j = ((yex) zex.a.d).a;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fE = e(f2, fIntBitsToFloat2, f3);
        DrawScope.g0(drawScope, j, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE)) & 4294967295L), (DrawStyle) null, f, 0, 208);
        float fX0 = drawScope.X0(0.75f);
        float f5 = f3 - (fX0 / 2.0f);
        float f6 = fIntBitsToFloat + fX0;
        float f7 = fIntBitsToFloat2 + fX0;
        Float fValueOf = Float.valueOf(0.0f);
        long j2 = u7h.f;
        mmr0[] mmr0VarArr = {new mmr0(fValueOf, new u7h(u7h.b(j2, 0.6f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.15f), new u7h(u7h.b(j2, 0.15f, 0.0f, 0.0f, 0.0f, 14)))};
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L);
        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            u7h u7hVar = (u7h) mmr0VarArr[i].b;
            long j3 = u7hVar.a;
            arrayList.add(u7hVar);
        }
        ArrayList arrayList2 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList2.add(Float.valueOf(((Number) mmr0VarArr[i2].a).floatValue()));
        }
        mic0 mic0Var = new mic0(0, jFloatToRawIntBits3, jFloatToRawIntBits4, arrayList, arrayList2);
        long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        float fE2 = e(f2, f7, f5);
        DrawScope.c0(drawScope, mic0Var, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), jFloatToRawIntBits5, (((long) Float.floatToRawIntBits(fE2)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L), f, new phc1(fX0, 0.0f, 0, 0, null, 30), 192);
    }

    public static final void c(DrawScope drawScope, float f, Float f2) {
        float fX0 = drawScope.X0(0.5f);
        float f3 = fX0 / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) - fX0;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - fX0;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fE = e(f2, fIntBitsToFloat2, f3);
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE)) & 4294967295L);
        phc1 phc1Var = new phc1(fX0, 0.0f, 0, 0, null, 30);
        Float fValueOf = Float.valueOf(0.0f);
        long j = u7h.f;
        mmr0[] mmr0VarArr = {new mmr0(fValueOf, new u7h(u7h.b(j, 1.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.11f), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.85f), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(j, 1.0f, 0.0f, 0.0f, 0.0f, 14)))};
        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 0.05f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 0.8f)) & 4294967295L);
        long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 0.75f)) & 4294967295L);
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
        DrawScope.c0(drawScope, new mic0(0, jFloatToRawIntBits4, jFloatToRawIntBits5, arrayList, arrayList2), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, f * 0.5f, phc1Var, 192);
    }

    public static final void d(DrawScope drawScope, float f, Float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
        float fX0 = drawScope.X0(3.0f);
        float f3 = fX0 / 2.0f;
        float f4 = fIntBitsToFloat - fX0;
        float f5 = fIntBitsToFloat2 - fX0;
        float fE = e(f2, f5, f3);
        fid fidVarP = drawScope.a1().p();
        lw4 lw4VarL = fdg1.l();
        lw4VarL.g(1);
        long j = u7h.f;
        lw4VarL.c(u7h.b(j, f * 0.6f, 0.0f, 0.0f, 0.0f, 14));
        lw4VarL.f(fX0);
        lw4VarL.a.setMaskFilter(new BlurMaskFilter(4.0f, BlurMaskFilter.Blur.NORMAL));
        fidVarP.l(f3, f3, f3 + f4, f3 + f5, fE, fE, lw4VarL);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        uwr uwrVar = cbx.a;
        long j2 = ((yex) zex.a.d).a;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fE2 = e(f2, fIntBitsToFloat2, 0.0f);
        DrawScope.g0(drawScope, j2, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fE2)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L), (DrawStyle) null, f, 0, 208);
        DrawScope.c0(drawScope, v9c.k(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(z4p1.g(4284374622L))), new mmr0(Float.valueOf(0.4f), new u7h(j)), new mmr0(Float.valueOf(0.6f), new u7h(j)), new mmr0(Float.valueOf(1.0f), new u7h(z4p1.g(4284374622L)))}, 0.0f, 0.0f, 6), (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE)) & 4294967295L), f, new phc1(fX0, 0.0f, 0, 0, null, 30), 192);
    }

    public static final float e(Float f, float f2, float f3) {
        if (f == null) {
            return f2 / 2.0f;
        }
        float fFloatValue = f.floatValue() - f3;
        if (fFloatValue < 0.0f) {
            return 0.0f;
        }
        return fFloatValue;
    }
}
