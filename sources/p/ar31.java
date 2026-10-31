package p;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ar31 extends r8a {
    public final int N0;
    public final RectF O0;
    public final q8a Z;

    public ar31(q8a q8aVar, qne qneVar, zdk1 zdk1Var, int i) {
        super(q8aVar, qneVar, zdk1Var);
        this.Z = q8aVar;
        this.N0 = i;
        this.O0 = new RectF();
    }

    @Override // p.r8a
    public final void x1(Canvas canvas, u8a u8aVar, int i) {
        Integer num;
        Paint paint = this.d;
        zdk1 zdk1Var = (zdk1) this.b;
        qne qneVar = this.c;
        int i2 = u8aVar.d;
        q8a q8aVar = this.Z;
        vi11 vi11VarF = q8aVar.f(i2);
        Paint paint2 = this.X;
        paint2.setColor(-16777216);
        paint2.setStrokeWidth(0.0f);
        p8a[] p8aVarArr = this.i;
        if (p8aVarArr == null) {
            return;
        }
        p8a p8aVar = p8aVarArr[i];
        qneVar.getClass();
        p8aVar.getClass();
        float[] fArr = (float[]) p8aVar.c;
        q8aVar.g(i2);
        p8aVar.b = q8aVar.getBarData().j;
        p8aVar.a(u8aVar);
        vi11VarF.I(fArr);
        rr80 rr80VarO = yoi1.O(yoi1.Q(0, fArr.length), 4);
        int i3 = rr80VarO.a;
        int i4 = rr80VarO.b;
        int i5 = rr80VarO.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return;
        }
        while (true) {
            float f = fArr[i3];
            float f2 = fArr[i3 + 1];
            float f3 = fArr[i3 + 2];
            float f4 = fArr[i3 + 3];
            if (zdk1Var.a(f3)) {
                if (!zdk1Var.b(f)) {
                    return;
                }
                RectF rectF = this.O0;
                if (f2 == f4) {
                    rectF.set(f, f2 - 5.0f, f3, f4);
                } else {
                    rectF.set(f, f2, f3, f4);
                }
                int i6 = i3 / 4;
                int size = u8aVar.a.size();
                ArrayList arrayList = u8aVar.a;
                if (size != 1) {
                    num = (Integer) arrayList.get(i6 / 4);
                } else {
                    num = (Integer) arrayList.get(0);
                    num.intValue();
                }
                int iC = l1d.C(this.N0);
                if (iC == 0) {
                    num.getClass();
                    float size2 = i6 / u8aVar.o.size();
                    paint.setShader(null);
                    paint.setColor(((Integer) v26.a.evaluate(size2, Integer.valueOf(uah.l(-1, 127)), num)).intValue());
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    num.getClass();
                    int iIntValue = num.intValue();
                    float f5 = rectF.left;
                    paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, new int[]{iIntValue, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                }
                canvas.drawRoundRect(rectF, 30.0f, 30.0f, paint);
            }
            if (i3 == i4) {
                return;
            } else {
                i3 += i5;
            }
        }
    }
}
