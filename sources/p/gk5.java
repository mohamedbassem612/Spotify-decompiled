package p;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gk5 {
    public final ImageView a;
    public mal b;
    public int c = 0;

    public gk5(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        mal malVar;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            a8v.a(drawable);
        }
        if (drawable == null || (malVar = this.b) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = ck5.b;
        ex21.h(drawable, malVar, drawableState);
    }

    public final void b(AttributeSet attributeSet, int i) {
        int iQ;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = moz0.f;
        lvc1 lvc1VarE = lvc1.E(context, attributeSet, iArr, i);
        b8k1.o(imageView, imageView.getContext(), iArr, attributeSet, lvc1VarE.w(), i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (iQ = lvc1VarE.q(1, -1)) != -1 && (drawable = f0o1.j(imageView.getContext(), iQ)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                a8v.a(drawable);
            }
            if (lvc1VarE.y(2)) {
                u2p1.t(imageView, lvc1VarE.g(2));
            }
            if (lvc1VarE.y(3)) {
                u2p1.u(imageView, a8v.c(lvc1VarE.n(3, -1), null));
            }
        } finally {
            lvc1VarE.I();
        }
    }
}
