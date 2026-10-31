package p;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class h180 implements kmg1, o5s, drd1 {
    public boolean a;
    public final ImageView b;

    public h180(ImageView imageView) {
        this.b = imageView;
    }

    public final void a() {
        Object drawable = this.b.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    @Override // p.drd1
    public final void b(oq70 oq70Var) {
        c(oq70Var);
    }

    public final void c(oq70 oq70Var) {
        ImageView imageView = this.b;
        Drawable drawableG = oq70Var != null ? x2p1.g(oq70Var, imageView.getResources()) : null;
        Object drawable = imageView.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawableG);
        a();
    }

    @Override // p.drd1
    public void e(oq70 oq70Var) {
        c(oq70Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h180) && u890.j(this.b, ((h180) obj).b);
    }

    @Override // p.drd1
    public final void f(oq70 oq70Var) {
        c(oq70Var);
    }

    @Override // p.kmg1
    public final Drawable g() {
        return this.b.getDrawable();
    }

    @Override // p.kmg1
    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // p.o5s
    public final void onStart(iac0 iac0Var) {
        this.a = true;
        a();
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        this.a = false;
        a();
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.b + ')';
    }
}
