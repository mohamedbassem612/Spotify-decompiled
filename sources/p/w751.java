package p;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w751 extends FrameLayout {
    public final mn41 a;
    public xb51 b;
    public final LinkedHashSet c;

    public w751(plm plmVar, mn41 mn41Var) {
        super(plmVar);
        this.a = mn41Var;
        this.c = new LinkedHashSet();
    }

    public static /* synthetic */ void b(w751 w751Var) {
        w751Var.a(w751Var.getWindowVisibility() == 0);
    }

    public final void a(boolean z) {
        if (this.b == null || !isAttachedToWindow() || !isShown() || !z || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xb51 xb51Var = this.b;
        if (xb51Var != null) {
            this.b = null;
            this.a.invoke(xb51Var);
        }
        for (v751 v751Var : this.c) {
            u751 u751Var = v751Var.i;
            if (u751Var != null) {
                int i = u751Var.c;
                if (!((Boolean) v751Var.c.invoke(new xb51(i))).booleanValue()) {
                    v751Var.i = null;
                } else if (u751Var.a == v751Var.e && u751Var.b == v751Var.f && u751Var.e) {
                    if (((Boolean) u751Var.d.invoke()).booleanValue() && ((Boolean) v751Var.d.invoke(new xb51(i))).booleanValue()) {
                        v751Var.i = null;
                    } else if (!u751Var.f) {
                        u751Var.f = true;
                        v751Var.b.invoke();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b(this);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        b(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        a(i == 0);
    }
}
