package p;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class r8a extends a1r {
    public final Paint X;
    public final RectF Y;
    public final q8a g;
    public final RectF h;
    public p8a[] i;
    public final Paint t;

    public r8a(q8a q8aVar, qne qneVar, zdk1 zdk1Var) {
        super(zdk1Var, (byte) 12);
        this.c = qneVar;
        Paint paint = new Paint(1);
        this.d = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(npi1.c(9.0f));
        Paint paint3 = new Paint(1);
        this.e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        this.e.setStrokeWidth(2.0f);
        this.e.setColor(Color.rgb(255, 187, 115));
        this.h = new RectF();
        this.Y = new RectF();
        this.g = q8aVar;
        Paint paint4 = new Paint(1);
        this.e = paint4;
        paint4.setStyle(style);
        this.e.setColor(Color.rgb(0, 0, 0));
        this.e.setAlpha(120);
        Paint paint5 = new Paint(1);
        this.t = paint5;
        paint5.setStyle(style);
        Paint paint6 = new Paint(1);
        this.X = paint6;
        paint6.setStyle(style2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f0  */
    @Override // p.a1r
    public final void v1(Canvas canvas) {
        qne qneVar;
        q8a q8aVar;
        ArrayList arrayList;
        float f;
        r8a r8aVar = this;
        Paint paint = r8aVar.f;
        qne qneVar2 = r8aVar.c;
        q8a q8aVar2 = r8aVar.g;
        float fD = q8aVar2.getData().d();
        float maxVisibleCount = q8aVar2.getMaxVisibleCount();
        zdk1 zdk1Var = (zdk1) r8aVar.b;
        if (fD < maxVisibleCount * zdk1Var.g) {
            ArrayList arrayList2 = q8aVar2.getBarData().i;
            float fC = npi1.c(4.5f);
            boolean z = q8aVar2.H1;
            int i = 0;
            while (i < q8aVar2.getBarData().c()) {
                u8a u8aVar = (u8a) arrayList2.get(i);
                boolean z2 = u8aVar.n;
                int i2 = u8aVar.d;
                if (z2 && (u8aVar.j || u8aVar.k)) {
                    paint.setTypeface(null);
                    paint.setTextSize(u8aVar.m);
                    q8aVar2.g(i2);
                    float fA = npi1.a(paint, "8");
                    float f2 = z ? -fC : fA + fC;
                    float f3 = z ? fA + fC : -fC;
                    p8a p8aVar = r8aVar.i[i];
                    qneVar2.getClass();
                    duf0 duf0Var = u8aVar.l;
                    duf0 duf0Var2 = (duf0) duf0.d.b();
                    float f4 = duf0Var.b;
                    duf0Var2.b = f4;
                    duf0Var2.c = duf0Var.c;
                    duf0Var2.b = npi1.c(f4);
                    duf0Var2.c = npi1.c(duf0Var2.c);
                    int i3 = 0;
                    while (true) {
                        float f5 = i3;
                        float[] fArr = (float[]) p8aVar.c;
                        qneVar = qneVar2;
                        if (f5 >= fArr.length * 1.0f) {
                            break;
                        }
                        float f6 = (fArr[i3] + fArr[i3 + 2]) / 2.0f;
                        if (!zdk1Var.b(f6)) {
                            break;
                        }
                        int i4 = i3 + 1;
                        float f7 = fArr[i4];
                        RectF rectF = zdk1Var.b;
                        q8a q8aVar3 = q8aVar2;
                        if (rectF.top <= f7) {
                            if (rectF.bottom >= ((int) (f7 * 100.0f)) / 100.0f && zdk1Var.a(f6)) {
                                int i5 = i3 / 4;
                                float f8 = ((rzy) ((v8a) ((rzy) u8aVar.o.get(i5)))).a;
                                if (u8aVar.j) {
                                    lk70 lk70Var = u8aVar.f;
                                    if (lk70Var == null) {
                                        lk70Var = npi1.g;
                                    }
                                    float f9 = f8 >= 0.0f ? fArr[i4] + f2 : fArr[i3 + 3] + f3;
                                    ArrayList arrayList3 = u8aVar.b;
                                    paint.setColor(((Integer) arrayList3.get(i5 % arrayList3.size())).intValue());
                                    canvas.drawText(lk70Var.b(f8), f6, f9, paint);
                                }
                            }
                        }
                        i3 += 4;
                        qneVar2 = qneVar;
                        arrayList2 = arrayList2;
                        q8aVar2 = q8aVar3;
                        fC = fC;
                    }
                    q8aVar = q8aVar2;
                    arrayList = arrayList2;
                    f = fC;
                    duf0.d.c(duf0Var2);
                } else {
                    qneVar = qneVar2;
                    q8aVar = q8aVar2;
                    arrayList = arrayList2;
                    f = fC;
                }
                i++;
                r8aVar = this;
                qneVar2 = qneVar;
                arrayList2 = arrayList;
                q8aVar2 = q8aVar;
                fC = f;
            }
        }
    }

    @Override // p.a1r
    public final void w1() {
        t8a barData = this.g.getBarData();
        this.i = new p8a[barData.c()];
        for (int i = 0; i < this.i.length; i++) {
            u8a u8aVar = (u8a) barData.b(i);
            p8a[] p8aVarArr = this.i;
            int size = u8aVar.o.size() * 4;
            barData.c();
            p8aVarArr[i] = new p8a(size, false);
        }
    }

    public void x1(Canvas canvas, u8a u8aVar, int i) {
        Paint paint = this.d;
        zdk1 zdk1Var = (zdk1) this.b;
        int i2 = u8aVar.d;
        ArrayList arrayList = u8aVar.o;
        q8a q8aVar = this.g;
        vi11 vi11VarF = q8aVar.f(i2);
        Paint paint2 = this.X;
        paint2.setColor(-16777216);
        paint2.setStrokeWidth(npi1.c(0.0f));
        this.c.getClass();
        if (q8aVar.I1) {
            int i3 = u8aVar.u;
            Paint paint3 = this.t;
            paint3.setColor(i3);
            float f = q8aVar.getBarData().j / 2.0f;
            int iMin = Math.min((int) Math.ceil(arrayList.size() * 1.0f), arrayList.size());
            for (int i4 = 0; i4 < iMin; i4++) {
                float f2 = ((rzy) ((v8a) ((rzy) arrayList.get(i4)))).c;
                RectF rectF = this.Y;
                rectF.left = f2 - f;
                rectF.right = f2 + f;
                ((Matrix) vi11VarF.b).mapRect(rectF);
                ((zdk1) vi11VarF.d).a.mapRect(rectF);
                ((Matrix) vi11VarF.c).mapRect(rectF);
                if (zdk1Var.a(rectF.right)) {
                    if (!zdk1Var.b(rectF.left)) {
                        break;
                    }
                    RectF rectF2 = zdk1Var.b;
                    rectF.top = rectF2.top;
                    rectF.bottom = rectF2.bottom;
                    canvas.drawRect(rectF, paint3);
                }
            }
        }
        p8a p8aVar = this.i[i];
        p8aVar.getClass();
        float[] fArr = (float[]) p8aVar.c;
        q8aVar.g(i2);
        p8aVar.b = q8aVar.getBarData().j;
        p8aVar.a(u8aVar);
        vi11VarF.I(fArr);
        boolean z = u8aVar.a.size() == 1;
        if (z) {
            paint.setColor(((Integer) u8aVar.a.get(0)).intValue());
        }
        for (int i5 = 0; i5 < fArr.length; i5 += 4) {
            int i6 = i5 + 2;
            if (zdk1Var.a(fArr[i6])) {
                if (!zdk1Var.b(fArr[i5])) {
                    return;
                }
                if (!z) {
                    ArrayList arrayList2 = u8aVar.a;
                    paint.setColor(((Integer) arrayList2.get((i5 / 4) % arrayList2.size())).intValue());
                }
                canvas.drawRect(fArr[i5], fArr[i5 + 1], fArr[i6], fArr[i5 + 3], paint);
            }
        }
    }
}
