package p;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nce extends Property {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nce(byte b) {
        super(PointF.class, "topLeft");
        this.a = b;
        switch (b) {
            case 1:
                super(PointF.class, "bottomRight");
                break;
            case 2:
                super(PointF.class, "bottomRight");
                break;
            case 3:
                super(PointF.class, "topLeft");
                break;
            case 4:
                super(PointF.class, "position");
                break;
            case 11:
                super(Float.class, "thumbPos");
                break;
            case 12:
                super(Rect.class, "clipBounds");
                break;
            default:
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((ncg) obj).t);
            case 6:
                return Float.valueOf(((ncg) obj).X);
            case 7:
                return Float.valueOf(((c8v) obj).b());
            case 8:
                return Float.valueOf(((oic0) obj).t);
            case 9:
                return Float.valueOf(((qic0) obj).X);
            case 10:
                return Integer.valueOf(((sv41) obj).getLevel());
            case 11:
                return Float.valueOf(((SwitchCompat) obj).c1);
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        boolean z = false;
        switch (this.a) {
            case 0:
                qce qceVar = (qce) obj;
                PointF pointF = (PointF) obj2;
                qceVar.getClass();
                qceVar.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                qceVar.b = iRound;
                int i = qceVar.f + 1;
                qceVar.f = i;
                if (i == qceVar.g) {
                    rik1.a(qceVar.e, qceVar.a, iRound, qceVar.c, qceVar.d);
                    qceVar.f = 0;
                    qceVar.g = 0;
                }
                break;
            case 1:
                qce qceVar2 = (qce) obj;
                PointF pointF2 = (PointF) obj2;
                qceVar2.getClass();
                qceVar2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                qceVar2.d = iRound2;
                int i2 = qceVar2.g + 1;
                qceVar2.g = i2;
                if (qceVar2.f == i2) {
                    rik1.a(qceVar2.e, qceVar2.a, qceVar2.b, qceVar2.c, iRound2);
                    qceVar2.f = 0;
                    qceVar2.g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                rik1.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                rik1.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                rik1.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                ncg ncgVar = (ncg) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                ncgVar.t = fFloatValue;
                int i3 = (int) (5400.0f * fFloatValue);
                hl10 hl10Var = ncgVar.g;
                float[] fArr = (float[]) ncgVar.c;
                float f = fFloatValue * 1520.0f;
                fArr[0] = (-20.0f) + f;
                fArr[1] = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    fArr[1] = (hl10Var.getInterpolation((i3 - ncg.Z[i4]) / 667.0f) * 250.0f) + fArr[1];
                    fArr[0] = (hl10Var.getInterpolation((i3 - ncg.N0[i4]) / 667.0f) * 250.0f) + fArr[0];
                }
                float f2 = fArr[0];
                float f3 = fArr[1];
                float f4 = ((f3 - f2) * ncgVar.X) + f2;
                fArr[0] = f4;
                fArr[0] = f4 / 360.0f;
                fArr[1] = f3 / 360.0f;
                ucg ucgVar = ncgVar.h;
                int i5 = 0;
                while (i5 < 4) {
                    float f5 = (i3 - ncg.O0[i5]) / 333.0f;
                    if (f5 >= 0.0f && f5 <= 1.0f) {
                        int i6 = i5 + ncgVar.i;
                        int[] iArr = ((eca) ucgVar).c;
                        int length = i6 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int iM = ago1.m(iArr[length], ((c8v) ((s980) ncgVar.b)).t);
                        int iM2 = ago1.m(((eca) ucgVar).c[length2], ((c8v) ((s980) ncgVar.b)).t);
                        float interpolation = hl10Var.getInterpolation(f5);
                        int[] iArr2 = (int[]) ncgVar.d;
                        Integer numValueOf = Integer.valueOf(iM);
                        Integer numValueOf2 = Integer.valueOf(iM2);
                        int iIntValue = numValueOf.intValue();
                        float f6 = ((iIntValue >> 24) & 255) / 255.0f;
                        int iIntValue2 = numValueOf2.intValue();
                        float f7 = ((iIntValue2 >> 24) & 255) / 255.0f;
                        boolean z2 = z;
                        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
                        float fE = l1d.e(f7, f6, interpolation, f6);
                        float fE2 = l1d.e(fPow4, fPow, interpolation, fPow);
                        float fE3 = l1d.e(fPow5, fPow2, interpolation, fPow2);
                        float fE4 = l1d.e(fPow6, fPow3, interpolation, fPow3);
                        float fPow7 = ((float) Math.pow(fE2, 0.45454545454545453d)) * 255.0f;
                        float fPow8 = ((float) Math.pow(fE3, 0.45454545454545453d)) * 255.0f;
                        iArr2[z2 ? 1 : 0] = Integer.valueOf(Math.round(((float) Math.pow(fE4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fE * 255.0f) << 24) | (Math.round(fPow8) << 8)).intValue();
                        ((s980) ncgVar.b).invalidateSelf();
                    } else {
                        i5++;
                        z = z;
                    }
                    break;
                }
                ((s980) ncgVar.b).invalidateSelf();
                break;
            case 6:
                ((ncg) obj).X = ((Float) obj2).floatValue();
                break;
            case 7:
                c8v c8vVar = (c8v) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (c8vVar.h != fFloatValue2) {
                    c8vVar.h = fFloatValue2;
                    c8vVar.invalidateSelf();
                }
                break;
            case 8:
                oic0 oic0Var = (oic0) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                oic0Var.t = fFloatValue3;
                int i7 = (int) (fFloatValue3 * 333.0f);
                float[] fArr2 = (float[]) oic0Var.c;
                fArr2[0] = 0.0f;
                float f8 = i7 / 667.0f;
                hl10 hl10Var2 = oic0Var.f;
                float interpolation2 = hl10Var2.getInterpolation(f8);
                fArr2[2] = interpolation2;
                fArr2[1] = interpolation2;
                float interpolation3 = hl10Var2.getInterpolation(f8 + 0.49925038f);
                fArr2[4] = interpolation3;
                fArr2[3] = interpolation3;
                fArr2[5] = 1.0f;
                if (oic0Var.i && interpolation3 < 1.0f) {
                    int[] iArr3 = (int[]) oic0Var.d;
                    iArr3[2] = iArr3[1];
                    iArr3[1] = iArr3[0];
                    iArr3[0] = ago1.m(((eca) oic0Var.g).c[oic0Var.h], ((c8v) ((s980) oic0Var.b)).t);
                    oic0Var.i = false;
                }
                ((s980) oic0Var.b).invalidateSelf();
                break;
            case 9:
                qic0 qic0Var = (qic0) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                qic0Var.X = fFloatValue4;
                int i8 = (int) (fFloatValue4 * 1800.0f);
                for (int i9 = 0; i9 < 4; i9++) {
                    ((float[]) qic0Var.c)[i9] = Math.max(0.0f, Math.min(1.0f, qic0Var.g[i9].getInterpolation((i8 - qic0.N0[i9]) / qic0.Z[i9])));
                }
                if (qic0Var.t) {
                    Arrays.fill((int[]) qic0Var.d, ago1.m(((eca) qic0Var.h).c[qic0Var.i], ((c8v) ((s980) qic0Var.b)).t));
                    qic0Var.t = false;
                }
                ((s980) qic0Var.b).invalidateSelf();
                break;
            case 10:
                ((sv41) obj).setLevel(((Integer) obj2).intValue());
                break;
            case 11:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nce(Class cls, String str, byte b) {
        super(cls, str);
        this.a = b;
    }
}
