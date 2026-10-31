package p;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pw70 implements f080 {
    public final ImageView a;
    public s7v b;
    public ird1 c;

    public pw70(ImageView imageView, s7v s7vVar) {
        this.a = imageView;
        this.b = s7vVar;
    }

    public final void e(int i, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            hhg1.n("Failed requirement.");
            return;
        }
        ird1 ird1Var = this.c;
        if (ird1Var != null) {
            ird1Var.onSuccess();
        }
        Drawable drawableF = this.b.f(bitmap);
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new b490(drawableF, drawable, i));
        if (bitmap.isRecycled()) {
            hhg1.n("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof pw70)) {
            return false;
        }
        pw70 pw70Var = (pw70) obj;
        return pw70Var.a == this.a && pw70Var.b == this.b;
    }

    public final void g(Drawable drawable) {
        ImageView imageView = this.a;
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void m(Drawable drawable) {
        ird1 ird1Var = this.c;
        if (ird1Var != null) {
            ird1Var.o((Exception) null);
        }
        this.a.setImageDrawable(drawable);
    }
}
