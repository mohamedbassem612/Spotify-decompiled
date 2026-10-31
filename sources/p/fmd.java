package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fmd extends f611 {
    public final Function0 a;
    public final int b;
    public final Paint c = new Paint();
    public float d = Float.NaN;
    public float e = Float.NaN;
    public int f;
    public boolean g;

    public fmd(Context context, Function0 function0) {
        this.a = function0;
        this.b = ago1.o(context, 2130968768, -16777216);
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        int iIntValue;
        a layoutManager;
        View viewD;
        Integer numI = i(recyclerView);
        if (numI == null || RecyclerView.R(view) != (iIntValue = numI.intValue()) || (layoutManager = recyclerView.getLayoutManager()) == null || (viewD = layoutManager.D(iIntValue - 1)) == null) {
            return;
        }
        this.f = viewD.getHeight();
        rect.top = -((int) (viewD.getHeight() * 0.55f));
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        View viewD;
        a layoutManager;
        View viewD2;
        Integer numI = i(recyclerView);
        if (numI != null) {
            int iIntValue = numI.intValue();
            a layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 == null || (viewD = layoutManager2.D(iIntValue)) == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewD2 = layoutManager.D(iIntValue - 1)) == null) {
                return;
            }
            if (viewD2.getHeight() != this.f && !this.g) {
                this.g = true;
                recyclerView.post(new xwn1(this, recyclerView, (byte) 7));
            }
            RectF rectF = new RectF(viewD2.getLeft(), viewD2.getY(), viewD2.getRight(), viewD.getY());
            if (rectF.bottom <= rectF.top) {
                rectF = null;
            }
            if (rectF == null) {
                return;
            }
            float f = rectF.top;
            float f2 = rectF.bottom;
            float f3 = this.d;
            Paint paint = this.c;
            if (f != f3 || f2 != this.e) {
                this.d = f;
                this.e = f2;
                paint.setShader(new LinearGradient(0.0f, f, 0.0f, f2, 0, this.b, Shader.TileMode.CLAMP));
            }
            canvas.drawRect(rectF, paint);
        }
    }

    public final Integer i(RecyclerView recyclerView) {
        z511 adapter;
        if (!((Boolean) this.a.invoke()).booleanValue() || (adapter = recyclerView.getAdapter()) == null) {
            return null;
        }
        int iE = adapter.e() - 1;
        Integer numValueOf = Integer.valueOf(iE);
        if (iE > 0) {
            return numValueOf;
        }
        return null;
    }
}
