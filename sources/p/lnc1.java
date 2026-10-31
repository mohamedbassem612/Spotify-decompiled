package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import app.p000rive.runtime.kotlin.R;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lnc1 implements lw40 {
    public final gw70 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public TextView g;
    public ImageView h;
    public g7k1 i;

    public lnc1(gw70 gw70Var, String str, String str2, String str3, String str4, String str5) {
        this.a = gw70Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final void a(View view) {
        this.g = (TextView) view.findViewById(2131427729);
        this.h = (ImageView) view.findViewById(2131429612);
        String str = this.e;
        if (str != null) {
            ((TextView) view.findViewById(R.id.title)).setText(str);
        }
        String str2 = this.f;
        if (str2 != null) {
            TextView textView = this.g;
            if (textView == null) {
                u890.C("bodyView");
                throw null;
            }
            textView.setText(str2);
        }
        ((TextView) view.findViewById(2131429623)).setText(this.b);
        ((TextView) view.findViewById(2131429621)).setText(this.c);
        ImageView imageView = this.h;
        if (imageView == null) {
            u890.C("imageView");
            throw null;
        }
        imageView.addOnAttachStateChangeListener(new c9s(this, imageView, (byte) 11));
        if (imageView.isAttachedToWindow()) {
            c(imageView);
        }
    }

    public final void b(ImageView imageView) {
        g7k1 g7k1Var = this.i;
        if (g7k1Var != null) {
            g7k1Var.b();
        }
        int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(2131166848);
        Context context = imageView.getContext();
        int width = imageView.getWidth();
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = qx21.a;
        Drawable drawable = resources.getDrawable(2131232442, theme);
        if (drawable != null) {
            drawable.setTint(ago1.o(context, 2130968791, -7829368));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(context.getColor(2131101501)), drawable});
        int i = ((int) (((double) width) * 0.1d)) / 2;
        layerDrawable.setLayerInset(1, i, i, i, i);
        ixg ixgVarF = this.a.f(this.d);
        ixgVarF.m(layerDrawable);
        ixgVarF.f(layerDrawable);
        int i2 = bcg.g;
        ir20 ir20Var = new ir20((byte) 3, dimensionPixelSize);
        pw70 pw70Var = (pw70) imageView.getTag(2131429630);
        if (pw70Var == null) {
            pw70Var = new pw70(imageView, ir20Var);
            imageView.setTag(2131429630, pw70Var);
        }
        pw70 pw70Var2 = pw70Var;
        pw70Var2.c = null;
        pw70Var2.b = ir20Var;
        g7k1 g7k1Var2 = new g7k1(imageView, ixgVarF, pw70Var2, new knc1(this, (byte) 0), new knc1(this, (byte) 1));
        this.i = g7k1Var2;
        try {
            ixg ixgVar = g7k1Var2.a;
            if (ixgVar != null) {
                ixgVar.j(g7k1Var2);
            }
        } catch (RuntimeException e) {
            g7k1Var2.b();
            throw e;
        }
    }

    public final void c(ImageView imageView) {
        if (!imageView.isLaidOut() || imageView.isLayoutRequested()) {
            imageView.addOnLayoutChangeListener(new x37(imageView, this, (byte) 16));
        } else if (imageView.isAttachedToWindow()) {
            b(imageView);
        }
    }

    public final void l(LayoutInflater layoutInflater, ScrollView scrollView) {
        a(layoutInflater.inflate(2131626211, (ViewGroup) scrollView, true));
    }

    public final int o() {
        TextView textView = this.g;
        if (textView != null) {
            return (int) Math.ceil(Math.abs(textView.getPaint().getFontMetrics().descent));
        }
        u890.C("bodyView");
        throw null;
    }
}
