package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g7k1 implements f080 {
    public ixg a;
    public pw70 b;
    public final knc1 c;
    public final knc1 d;
    public final WeakReference e;
    public boolean f = true;

    public g7k1(ImageView imageView, ixg ixgVar, pw70 pw70Var, knc1 knc1Var, knc1 knc1Var2) {
        this.a = ixgVar;
        this.b = pw70Var;
        this.c = knc1Var;
        this.d = knc1Var2;
        this.e = new WeakReference(imageView);
    }

    public final boolean a() {
        ImageView imageView;
        return this.f && ((Boolean) this.c.invoke(this)).booleanValue() && (imageView = (ImageView) this.e.get()) != null && imageView.isAttachedToWindow();
    }

    public final void b() {
        if (this.f) {
            ixg ixgVar = this.a;
            c();
            if (ixgVar != null) {
                ixgVar.c();
            }
        }
    }

    public final void c() {
        if (this.f) {
            this.f = false;
            this.a = null;
            this.b = null;
            this.d.invoke(this);
        }
    }

    public final void e(int i, Bitmap bitmap) {
        if (a()) {
            try {
                pw70 pw70Var = this.b;
                if (pw70Var != null) {
                    pw70Var.e(i, bitmap);
                }
            } finally {
                c();
            }
        }
    }

    public final void g(Drawable drawable) {
        pw70 pw70Var;
        if (!a() || (pw70Var = this.b) == null) {
            return;
        }
        pw70Var.g(drawable);
    }

    public final void m(Drawable drawable) {
        if (a()) {
            try {
                pw70 pw70Var = this.b;
                if (pw70Var != null) {
                    pw70Var.m(drawable);
                }
            } finally {
                c();
            }
        }
    }
}
