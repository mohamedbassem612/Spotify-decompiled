package p;

import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fik1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fik1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vik1 vik1Var = (vik1) obj;
                if (vik1Var.c != null) {
                    vik1Var.a();
                }
                break;
            case 1:
                view.getClass();
                ((jkk1) obj).e(view);
                break;
            default:
                gdl1 gdl1Var = (gdl1) obj;
                if (gdl1Var.getHeight() > 0 && !gdl1Var.Q0) {
                    int iE = gdl1Var.e();
                    RectF[] rectFArr = gdl1Var.c;
                    int length = rectFArr.length;
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < length) {
                        RectF rectF = rectFArr[i9];
                        int i11 = i10 + 1;
                        float fB = (i10 * iE) + (gdl1.b(gdl1Var) * i10) + iE;
                        rectF.left = fB;
                        rectF.right = fB + gdl1.b(gdl1Var);
                        rectF.top = (gdl1Var.getHeight() / 2.0f) - gdl1.c(gdl1Var);
                        rectF.bottom = (gdl1Var.getHeight() / 2.0f) + gdl1.c(gdl1Var);
                        i9++;
                        i10 = i11;
                    }
                    gdl1Var.Q0 = true;
                    break;
                }
                break;
        }
    }
}
