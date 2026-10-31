package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y2v0 implements q570 {
    public final gw70 a;
    public final DisplayMetrics b;

    public y2v0(gw70 gw70Var, DisplayMetrics displayMetrics) {
        this.a = gw70Var;
        this.b = displayMetrics;
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        return eqq.l(viewGroup, 2131625420, viewGroup, false);
    }

    public final EnumSet c() {
        return EnumSet.of(ix40.b, ix40.d);
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        View viewFindViewById = view.findViewById(2131430434);
        TextView textView = (TextView) view.findViewById(2131430435);
        ImageView imageView = (ImageView) view.findViewById(2131430433);
        qhl qhlVar = (qhl) imageView.getLayoutParams();
        Resources resources = view.getResources();
        DisplayMetrics displayMetrics = this.b;
        ((ViewGroup.MarginLayoutParams) qhlVar).width = (displayMetrics.widthPixels / 2) - (a8o.y(12.0f, resources) * 2);
        imageView.setLayoutParams(qhlVar);
        int iY = (displayMetrics.widthPixels / 2) - (a8o.y(12.0f, view.getResources()) * 2);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(iY, -2));
        } else {
            layoutParams.width = iY;
        }
        float dimensionPixelSize = imageView.getResources().getDimensionPixelSize(2131166841);
        String str = ((dd70) y570Var.k()).a.c.a.c;
        gw70 gw70Var = this.a;
        if (str != null) {
            Context context = view.getContext();
            Resources resources2 = context.getResources();
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = qx21.a;
            Drawable drawable = resources2.getDrawable(2131232442, theme);
            drawable.setTint(ago1.o(context, 2130968791, -7829368));
            int i = ((int) (((double) iY) * 0.1d)) / 2;
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(context.getColor(2131101501)), drawable});
            layerDrawable.setLayerInset(1, i, i, i, i);
            ixg ixgVarF = gw70Var.f(str);
            ixgVarF.m(layerDrawable);
            ixgVarF.f(layerDrawable);
            ixgVarF.s(new fr31(Integer.valueOf((int) dimensionPixelSize)));
            ixgVarF.k(imageView, (ird1) null);
        } else {
            gw70Var.d(imageView);
            imageView.setImageDrawable(null);
        }
        textView.setText(((id70) y570Var.n()).a.a);
        o670 o670Var = new o670(l670Var.c);
        o670Var.c("click");
        o670Var.g(y570Var);
        o670Var.f(view);
        o670Var.d();
    }

    public final void e(View view, y570 y570Var, int... iArr) {
    }
}
