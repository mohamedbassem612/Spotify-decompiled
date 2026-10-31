package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h7k1 implements f080, View.OnAttachStateChangeListener {
    public az70 a;
    public final WeakReference b;
    public f080 c;

    public h7k1(ImageView imageView, az70 az70Var) {
        this.a = az70Var;
        this.b = new WeakReference(imageView);
    }

    public final void a() {
        ixg ixgVar = this.a;
        b();
        if (ixgVar != null) {
            ixgVar.c();
        }
    }

    public final boolean b() {
        ImageView imageView = (ImageView) this.b.get();
        boolean zC = c();
        if (zC && imageView != null) {
            imageView.setTag(2131429221, null);
        }
        if (imageView != null) {
            imageView.removeOnAttachStateChangeListener(this);
        }
        this.a = null;
        return zC;
    }

    public final boolean c() {
        ImageView imageView = (ImageView) this.b.get();
        return (imageView != null ? imageView.getTag(2131429221) : null) == this;
    }

    public final void e(int i, Bitmap bitmap) {
        if (c()) {
            f080 f080Var = this.c;
            if (f080Var != null) {
                f080Var.e(i, bitmap);
            } else {
                u890.C("target");
                throw null;
            }
        }
    }

    public final void g(Drawable drawable) {
        if (c()) {
            f080 f080Var = this.c;
            if (f080Var != null) {
                f080Var.g(drawable);
            } else {
                u890.C("target");
                throw null;
            }
        }
    }

    public final void m(Drawable drawable) {
        if (c()) {
            f080 f080Var = this.c;
            if (f080Var != null) {
                f080Var.m(drawable);
            } else {
                u890.C("target");
                throw null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
