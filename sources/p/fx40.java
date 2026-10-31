package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fx40 extends FrameLayout implements jw40 {
    public static final ex40 e = new ex40();
    public final FrameLayout a;
    public cx40 b;
    public int c;
    public zr41 d;

    public fx40(Context context) {
        super(context, null, 0);
        this.d = e;
        LayoutInflater.from(context).inflate(2131625032, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(2131429085);
        frameLayout.getClass();
        this.a = frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(float f, int i, Drawable drawable) {
        if (drawable instanceof xt41) {
            ((xt41) drawable).a(f, i);
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            for (int i2 = 0; i2 < layerDrawable.getNumberOfLayers(); i2++) {
                b(f, i, layerDrawable.getDrawable(i2));
            }
        }
    }

    private FrameLayout.LayoutParams getContentLayoutParams() {
        return (FrameLayout.LayoutParams) this.a.getLayoutParams();
    }

    @Override // p.xt41
    public final void a(float f, int i) {
        FrameLayout frameLayout = this.a;
        frameLayout.offsetTopAndBottom((i - frameLayout.getTop()) + getContentLayoutParams().topMargin);
        cx40 cx40Var = this.b;
        if (cx40Var instanceof g260) {
            ((g260) cx40Var).a(f);
        }
        b(f, i, getBackground());
        b(f, i, getForeground());
        this.d.a(f);
    }

    @Override // p.jw40
    public int getTotalScrollRange() {
        return getMeasuredHeight() - this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        cx40 cx40Var = this.b;
        if (cx40Var instanceof kw40) {
            ((kw40) cx40Var).b();
        }
    }

    public void setContentBottomMargin(int i) {
        getContentLayoutParams().bottomMargin = i;
        WeakHashMap weakHashMap = b8k1.a;
        if (!isLaidOut() || isInLayout()) {
            return;
        }
        requestLayout();
    }

    public void setContentTopMargin(int i) {
        getContentLayoutParams().topMargin = i;
        WeakHashMap weakHashMap = b8k1.a;
        if (!isLaidOut() || isInLayout()) {
            return;
        }
        requestLayout();
    }

    public void setContentViewBinder(cx40 cx40Var) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        cx40 cx40Var2 = this.b;
        FrameLayout frameLayout = this.a;
        if (cx40Var2 != null) {
            frameLayout.removeView(cx40Var2.getView());
        }
        this.b = cx40Var;
        if (cx40Var != null) {
            frameLayout.addView(cx40Var.getView(), layoutParams);
        }
    }

    public void setScrollObserver(zr41 zr41Var) {
        this.d = (zr41) cwl1.y(zr41Var, e);
    }

    public void setStickyAreaSize(int i) {
        this.c = i;
    }

    @Override // p.jw40
    public View getView() {
        return this;
    }
}
