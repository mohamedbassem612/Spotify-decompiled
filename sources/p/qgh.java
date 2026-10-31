package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qgh extends f611 {
    public final float a;
    public final float b;
    public final float c;
    public final Paint d;
    public final int e;
    public final float f;
    public final boolean g;

    public qgh(Context context) {
        this.a = context.getResources().getDimensionPixelSize(2131165521);
        this.b = context.getResources().getDimensionPixelSize(2131165523);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165520);
        this.c = dimensionPixelSize;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(x74.D(context, 2131101168));
        paint.setStrokeWidth(dimensionPixelSize);
        this.d = paint;
        this.e = context.getResources().getDimensionPixelSize(2131165904) + (context.getResources().getDimensionPixelSize(2131165897) * 2);
        this.f = context.getResources().getDimensionPixelSize(2131166926);
        this.g = context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        Object tag = view.getTag(2131428138);
        fkh fkhVar = tag instanceof fkh ? (fkh) tag : null;
        int i = fkhVar == null ? -1 : pgh.a[fkhVar.ordinal()];
        int i2 = this.e;
        boolean z = this.g;
        float f = this.b;
        switch (i) {
            case -1:
            case 8:
            case 9:
            case 10:
                break;
            case 0:
            default:
                eg.o();
                break;
            case 1:
                int iR = RecyclerView.R(view);
                rect.top = iR == 0 ? ((int) f) / 2 : (int) f;
                if (iR == s611Var.b() - 1) {
                    rect.bottom = (int) f;
                }
                break;
            case 2:
                rect.top = (int) this.f;
                break;
            case 3:
                if (RecyclerView.R(view) == s611Var.b() - 1) {
                    rect.bottom = ((int) f) / 2;
                }
                if (!z) {
                    rect.left = i2;
                } else {
                    rect.right = i2;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                if (!z) {
                    rect.left = i2;
                } else {
                    rect.right = i2;
                }
                break;
        }
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        Canvas canvas2;
        int iR;
        d7 it = new i46(recyclerView, (byte) 8).iterator();
        pkh pkhVar = null;
        while (true) {
            d7 d7Var = it;
            if (!d7Var.hasNext()) {
                return;
            }
            View view = (View) d7Var.next();
            kjh adapter = recyclerView.getAdapter();
            kjh kjhVar = adapter instanceof kjh ? adapter : null;
            mmr0 mmr0Var = (kjhVar == null || (iR = RecyclerView.R(view)) == -1) ? null : new mmr0((pkh) kjhVar.A(iR), Integer.valueOf(iR));
            pkh pkhVar2 = mmr0Var != null ? (pkh) mmr0Var.a : null;
            if (!(pkhVar2 instanceof ekh)) {
                canvas2 = canvas;
                if (!(pkhVar2 instanceof hkh) && !(pkhVar2 instanceof ikh) && !(pkhVar2 instanceof kkh) && !(pkhVar2 instanceof mkh) && !(pkhVar2 instanceof nkh) && !(pkhVar2 instanceof okh) && !(pkhVar2 instanceof gkh) && !u890.j(pkhVar2, jkh.b) && !u890.j(pkhVar2, lkh.b) && pkhVar2 != null) {
                    eg.o();
                    return;
                }
            } else if (((Number) mmr0Var.b).intValue() <= 0 || (pkhVar instanceof lkh)) {
                canvas2 = canvas;
            } else {
                float top = view.getTop() - ((this.b + this.c) / 2.0f);
                canvas2 = canvas;
                canvas2.drawLine(this.a, top, view.getRight() - this.a, top, this.d);
            }
            pkhVar = pkhVar2;
            canvas = canvas2;
        }
    }
}
