package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yv40 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv40(bor0 bor0Var, float f, Paint paint, Bitmap bitmap) {
        super(1);
        this.a = (byte) 0;
        this.c = bor0Var;
        this.b = f;
        this.d = paint;
        this.e = bitmap;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                Paint paint = (Paint) obj2;
                eqc eqcVar = (eqc) obj;
                bor0 bor0Var = (bor0) obj3;
                float fH = eqcVar.h() * bor0Var.e;
                float fH2 = bor0Var.d * eqcVar.h();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) - fH;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)) - fH;
                n511 n511Var = new n511(fH, fH, fIntBitsToFloat, fIntBitsToFloat2);
                float f2 = fIntBitsToFloat - fH;
                if (f2 > 0.0f) {
                    float f3 = fIntBitsToFloat2 - fH;
                    if (f3 > 0.0f) {
                        float fMin = Math.min(f2, f3);
                        float fMin2 = Math.min(bor0Var.c * eqcVar.h(), fMin / f);
                        if (Build.VERSION.SDK_INT >= 33 && paint != null) {
                            ol10.a(paint, n511Var, fMin2, fH2, fH, bor0Var.a, (Bitmap) obj4);
                            return eqcVar.a(new u830(paint, (byte) 21));
                        }
                        float f4 = fMin < eqcVar.h() * 60.0f ? 1.0f : 0.25f;
                        Bitmap bitmapY = suo1.y(n511Var, fMin2 * f4, 0.0f, fH2 * f4, fH * f4, bor0Var.a, f4);
                        float f5 = fH * 3.0f;
                        float f6 = f5 * 2.0f;
                        int iCeil = (int) Math.ceil(f2 + f6);
                        if (iCeil < 1) {
                            iCeil = 1;
                        }
                        int iCeil2 = (int) Math.ceil(f3 + f6);
                        int i = iCeil2 >= 1 ? iCeil2 : 1;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, i, Bitmap.Config.ARGB_8888);
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapY, (Rect) null, new RectF(0.0f, 0.0f, iCeil, i), new Paint(2));
                        bitmapY.recycle();
                        suo1.t(bitmapCreateBitmap, (Bitmap) obj4);
                        return eqcVar.a(new xv40(bitmapCreateBitmap, n511Var, f5, (byte) 0));
                    }
                }
                return eqcVar.a(vc40.Q0);
            case 1:
                lsl lslVar = (lsl) obj;
                jz71 jz71Var = (jz71) obj4;
                float fFloatValue = ((Number) ((o95) obj3).e()).floatValue();
                if (fFloatValue <= 0.0f) {
                    lslVar.s1();
                } else {
                    zje1 zje1Var = (zje1) ((tob1) obj2).getValue();
                    long jNanoTime = System.nanoTime();
                    long j = jz71Var.c;
                    float f7 = j > 0 ? (jNanoTime - j) / 1.0E9f : 0.016f;
                    jz71Var.c = jNanoTime;
                    float fExp = 1.0f - ((float) Math.exp((-f7) / 0.45f));
                    float f8 = jz71Var.a;
                    float fE = l1d.e(zje1Var.a, f8, fExp, f8);
                    float f9 = jz71Var.b;
                    float fE2 = l1d.e(zje1Var.b, f9, fExp, f9);
                    jz71Var.a = fE;
                    jz71Var.b = fE2;
                    long j2 = lslVar.j();
                    int i2 = (int) (j2 >> 32);
                    float fP = c13.p(-fE, 0.6f, 0.1f, Float.intBitsToFloat(i2));
                    int i3 = (int) (j2 & 4294967295L);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fP)) << 32) | (((long) Float.floatToRawIntBits(c13.p(-fE2, 0.6f, 0.05f, Float.intBitsToFloat(i3)))) & 4294967295L);
                    float fIntBitsToFloat3 = (Float.intBitsToFloat(i2) * 0.75f) / 2.0f;
                    float fIntBitsToFloat4 = (Float.intBitsToFloat(i3) * 1.1f) / 2.0f;
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    lslVar.s1();
                    u84 u84VarP = lslVar.a1().p();
                    Canvas canvas = v84.a;
                    u84VarP.a.save();
                    u84VarP.a.scale(1.0f, fIntBitsToFloat4 / fIntBitsToFloat3, fIntBitsToFloat5, fIntBitsToFloat6);
                    DrawScope.o(lslVar, v9c.p(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(u7h.f, this.b, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.j))}, (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32), fIntBitsToFloat3, 8), fIntBitsToFloat3, (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L), fFloatValue, (phc1) null, 112);
                    lslVar.a1().p().a.restore();
                }
                return rih1Var;
            case 2:
                c380 c380Var = (c380) obj3;
                vu30 vu30Var = (vu30) obj2;
                ((rtb0) obj).e(c380Var.size(), vu30Var != null ? new svb0(vu30Var, c380Var, (byte) 6) : null, new nt(c380Var, (byte) 10), new j2i(2039820996, new kf60(c380Var, (j2i) obj4, f), true));
                return rih1Var;
            case 3:
                List list = (List) ((ven0) obj3).getValue();
                ((rtb0) obj).e(list.size(), new rw11(list, (byte) 21), new rw11(list, (byte) 22), new j2i(2039820996, new zwc1(list, (axc1) obj2, f, (iu30) obj4), true));
                return rih1Var;
            case 4:
                ((Number) obj).longValue();
                vcu0 vcu0Var = (vcu0) ((ycu0) obj2);
                ((frr0) obj4).t(vcu0Var.b + ((long) ((((yqg) obj3).b() - vcu0Var.a) * f)));
                return rih1Var;
            default:
                fem1 fem1Var = (fem1) obj;
                fem1Var.setYaw(((Number) ((tob1) obj3).getValue()).floatValue());
                fem1Var.setZoom(((Number) ((tob1) obj2).getValue()).floatValue());
                fem1Var.setFallbackAlpha(f);
                fem1Var.setFallbackBitmap((Bitmap) obj4);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv40(Object obj, Object obj2, Object obj3, float f, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv40(Object obj, Object obj2, float f, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = f;
        this.e = obj3;
    }
}
