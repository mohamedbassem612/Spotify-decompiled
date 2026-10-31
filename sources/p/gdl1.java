package p;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LruCache;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gdl1 extends View implements tlv {
    public final LruCache N0;
    public final idd1 O0;
    public final idd1 P0;
    public boolean Q0;
    public long R0;
    public final fza a;
    public final RectF[] b;
    public final RectF[] c;
    public final RectF[] d;
    public final RectF[] e;
    public final idd1 f;
    public final idd1 g;
    public final idd1 h;
    public final idd1 i;
    public final idd1 t;

    public gdl1(Context context, fza fzaVar) {
        super(context, null, 0);
        this.a = fzaVar;
        RectF[] rectFArr = new RectF[34];
        for (int i = 0; i < 34; i++) {
            rectFArr[i] = new RectF();
        }
        this.b = rectFArr;
        RectF[] rectFArr2 = new RectF[34];
        for (int i2 = 0; i2 < 34; i2++) {
            rectFArr2[i2] = new RectF();
        }
        this.c = rectFArr2;
        RectF[] rectFArr3 = new RectF[34];
        for (int i3 = 0; i3 < 34; i3++) {
            rectFArr3[i3] = new RectF();
        }
        this.d = rectFArr3;
        RectF[] rectFArr4 = new RectF[34];
        for (int i4 = 0; i4 < 34; i4++) {
            rectFArr4[i4] = new RectF();
        }
        this.e = rectFArr4;
        this.f = new idd1(new fdl1(this, (byte) 0));
        this.g = new idd1(new fdl1(this, (byte) 1));
        this.h = new idd1(new fdl1(this, (byte) 3));
        this.i = new idd1(new fdl1(this, (byte) 2));
        this.t = new idd1(new qnd0(this, context));
        this.N0 = new LruCache(5);
        this.O0 = new idd1(w3l1.Z);
        this.P0 = new idd1(w3l1.N0);
        addOnLayoutChangeListener(new fik1(this, (byte) 2));
    }

    private final Activity getActivity() {
        return (Activity) this.t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValueAnimator getAnimator() {
        return (ValueAnimator) this.O0.getValue();
    }

    private final Paint getDashPaint() {
        return (Paint) this.P0.getValue();
    }

    private final float getDashRectCorner() {
        return ((Number) this.f.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDashRectWidth() {
        return ((Number) this.g.getValue()).intValue();
    }

    private final float getMaxBarHeight() {
        return ((Number) this.i.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMinRectHeight() {
        return ((Number) this.h.getValue()).intValue();
    }

    public final void d() {
        RectF[] rectFArr = this.c;
        int length = rectFArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            RectF rectF = rectFArr[i];
            int i3 = i2 + 1;
            RectF rectF2 = this.b[i2];
            rectF2.left = rectF.left;
            rectF2.top = rectF.top;
            rectF2.right = rectF.right;
            rectF2.bottom = rectF.bottom;
            i++;
            i2 = i3;
        }
        long j = this.R0;
        this.R0 = 1 + j;
        hkm1 hkm1Var = new hkm1((int) j, (int) (j >> 32));
        int iE = e();
        for (int i4 = 0; i4 < 34; i4++) {
            float f = (i4 / 34.0f) - 0.5f;
            float fE = (1.0f - ((f * f) * 2.0f)) * ((hkm1Var.e() * 0.7f) + 0.3f) * getMaxBarHeight();
            float minRectHeight = getMinRectHeight();
            if (fE < minRectHeight) {
                fE = minRectHeight;
            }
            RectF rectF3 = this.d[i4];
            float dashRectWidth = (iE * i4) + (getDashRectWidth() * i4) + iE;
            rectF3.left = dashRectWidth;
            rectF3.right = dashRectWidth + getDashRectWidth();
            rectF3.top = (getHeight() / 2.0f) - fE;
            rectF3.bottom = (getHeight() / 2.0f) + fE;
        }
    }

    public final int e() {
        return (getWidth() - (getDashRectWidth() * 34)) / 34;
    }

    public final void f(Object obj) {
        edl1 edl1Var = (edl1) obj;
        if (this.Q0) {
            g(edl1Var);
        } else {
            post(new sjj1(this, edl1Var, (byte) 4));
        }
    }

    public final void g(edl1 edl1Var) {
        int iIntValue;
        edl1Var.getClass();
        LruCache lruCache = this.N0;
        Integer num = (Integer) lruCache.get("#ffffff");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            this.a.getClass();
            i8h i8hVarH = fza.h("#ffffff");
            int iD = uah.d(Color.parseColor(i8hVarH instanceof i8h ? i8hVarH.c : "#ffffffff"), -1, 0.25f);
            lruCache.put("#ffffff", Integer.valueOf(iD));
            iIntValue = iD;
        }
        if (getDashPaint().getColor() != iIntValue) {
            getDashPaint().setColor(iIntValue);
            invalidate();
        }
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new mqh1(this, edl1Var, (byte) 6));
        }
    }

    public final void h() {
        RectF[] rectFArr = this.d;
        int length = rectFArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            RectF rectF = rectFArr[i];
            int i3 = i2 + 1;
            RectF rectF2 = this.e[i2];
            rectF2.left = rectF.left;
            rectF2.top = rectF.top;
            rectF2.right = rectF.right;
            rectF2.bottom = rectF.bottom;
            i++;
            i2 = i3;
        }
        getAnimator().addUpdateListener(new kb5(this, (byte) 21));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        RectF[] rectFArr = this.c;
        int length = rectFArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            RectF rectF = rectFArr[i3];
            int i5 = i4 + 1;
            Paint dashPaint = getDashPaint();
            boolean z = i4 < 11;
            boolean z2 = i4 > 22;
            if (z) {
                i2 = (i4 * 255) / 33;
            } else {
                if (z2) {
                    i2 = ((33 - i4) * 255) / 34;
                } else {
                    i = 255;
                }
                dashPaint.setAlpha(i);
                canvas.drawRoundRect(rectF, getDashRectCorner(), getDashRectCorner(), getDashPaint());
                i3++;
                i4 = i5;
            }
            i = i2 * 4;
            dashPaint.setAlpha(i);
            canvas.drawRoundRect(rectF, getDashRectCorner(), getDashRectCorner(), getDashPaint());
            i3++;
            i4 = i5;
        }
    }
}
