package p;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class hmw0 {
    public Size a;
    public final FrameLayout b;
    public final ylw0 c;
    public boolean d = false;

    public hmw0(FrameLayout frameLayout, ylw0 ylw0Var) {
        this.b = frameLayout;
        this.c = ylw0Var;
    }

    public abstract View a();

    public abstract Bitmap b();

    public abstract void e(j4d1 j4d1Var, k65 k65Var);

    public final void f() {
        View viewA = a();
        if (viewA == null || !this.d) {
            return;
        }
        FrameLayout frameLayout = this.b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        ylw0 ylw0Var = this.c;
        ylw0Var.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            j2h1.M("PreviewTransform");
            return;
        }
        if (ylw0Var.f()) {
            if (viewA instanceof TextureView) {
                ((TextureView) viewA).setTransform(ylw0Var.d());
            } else {
                Display display = viewA.getDisplay();
                boolean z = false;
                boolean z2 = (!ylw0Var.g || display == null || display.getRotation() == ylw0Var.e) ? false : true;
                boolean z3 = ylw0Var.g;
                if (!z3) {
                    if ((!z3 ? ylw0Var.c : -mqn1.G(ylw0Var.e)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    j2h1.p("PreviewTransform");
                }
            }
            RectF rectFE = ylw0Var.e(size, layoutDirection);
            viewA.setPivotX(0.0f);
            viewA.setPivotY(0.0f);
            viewA.setScaleX(rectFE.width() / ylw0Var.a.getWidth());
            viewA.setScaleY(rectFE.height() / ylw0Var.a.getHeight());
            viewA.setTranslationX(rectFE.left - viewA.getLeft());
            viewA.setTranslationY(rectFE.top - viewA.getTop());
        }
    }

    public n8d0 g() {
        return e280.c;
    }

    public void c() {
    }

    public void d() {
    }
}
