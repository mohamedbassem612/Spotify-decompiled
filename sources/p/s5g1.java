package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s5g1 implements f080 {
    public final ImageView a;
    public q5g1 b;
    public p5g1 c;

    public s5g1(ImageView imageView, q5g1 q5g1Var) {
        this.a = imageView;
        this.b = q5g1Var;
    }

    public final void e(int i, Bitmap bitmap) {
        Bitmap bitmap2;
        if (bitmap.isRecycled()) {
            eg.m("Check failed.");
            return;
        }
        p5g1 p5g1Var = this.c;
        if (p5g1Var == null) {
            q5g1 q5g1Var = this.b;
            q5g1Var.getClass();
            bitmap2 = bitmap;
            p5g1 p5g1Var2 = new p5g1(bitmap2, q5g1Var.b, q5g1Var.c, q5g1Var.d, q5g1Var.f, q5g1Var.g, q5g1Var.e, q5g1Var.a);
            this.c = p5g1Var2;
            p5g1Var = p5g1Var2;
        } else {
            bitmap2 = bitmap;
        }
        if (!u890.j(p5g1Var.a, bitmap2)) {
            p5g1Var.a = bitmap2;
            p5g1Var.b();
            p5g1Var.invalidateSelf();
        }
        this.a.setImageDrawable(this.c);
        if (bitmap2.isRecycled()) {
            eg.m("Check failed.");
        }
    }

    public final void g(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void m(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
