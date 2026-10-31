package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m3v0 implements n570 {
    public final Context a;
    public final gw70 b;

    public m3v0(Context context, gw70 gw70Var) {
        this.a = context;
        this.b = gw70Var;
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        Context context = this.a;
        View viewInflate = LayoutInflater.from(context).inflate(2131625423, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(2131429124);
        TextView textView = (TextView) viewInflate.findViewById(2131427960);
        View viewR = t890.r(context, viewGroup, 2131625039);
        ux31 ux31Var = new ux31(viewR);
        viewR.setTag(2131429011, ux31Var);
        linearLayout.addView(viewR);
        viewR.setDuplicateParentStateEnabled(true);
        viewInflate.setTag(2131429011, new n3v0(viewInflate, ux31Var, textView));
        return viewInflate;
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        n3v0 n3v0Var = (n3v0) bs51.s(view, n3v0.class);
        v9w0 v9w0VarQ = b2u.q(view);
        ux31 ux31Var = n3v0Var.a;
        ImageView imageView = ux31Var.e;
        Collections.addAll(v9w0VarQ.d, imageView);
        TextView textView = ux31Var.c;
        TextView textView2 = ux31Var.d;
        TextView textView3 = n3v0Var.b;
        Collections.addAll(v9w0VarQ.c, textView, textView2, textView3);
        v9w0VarQ.a();
        two1.r(l670Var, view, y570Var);
        String str = ((id70) y570Var.n()).a.a;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        n3v0Var.setTitle(str);
        String str2 = ((id70) y570Var.n()).a.b;
        n3v0Var.setSubtitle(TextUtils.isEmpty(str2) ? "" : str2);
        Integer numR = y570Var.g().r("rowIndex");
        int iIntValue = numR != null ? numR.intValue() : -1;
        if (iIntValue != -1) {
            textView3.setVisibility(0);
            textView3.setText(String.valueOf(iIntValue));
        } else {
            textView3.setVisibility(8);
        }
        ld70 ld70Var = ((dd70) y570Var.k()).a.c;
        String str3 = ld70Var != null ? ld70Var.a.c : null;
        Context context = this.a;
        Drawable drawable = context.getDrawable(2131232442);
        if (drawable == null) {
            hhg1.n("Icon drawable resource must be valid");
            return;
        }
        int iO = ago1.o(context, 2130968791, 0);
        int iO2 = ago1.o(context, 2130968769, 0);
        drawable.setTint(iO);
        x10 x10Var = new x10(drawable, 1.0f, iO2, (byte) 2);
        float dimensionPixelSize = imageView.getResources().getDimensionPixelSize(2131166839);
        gw70 gw70Var = this.b;
        if (str3 != null) {
            ixg ixgVarF = gw70Var.f(str3);
            ixgVarF.m(x10Var);
            ixgVarF.f(x10Var);
            ixgVarF.s(new fr31(Integer.valueOf((int) dimensionPixelSize)));
            ixgVarF.k(imageView, (ird1) null);
        } else {
            gw70Var.d(imageView);
            imageView.setImageDrawable(x10Var);
        }
        String strB = y570Var.g().B("rankIcon");
        if (strB == null) {
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        int iHashCode = strB.hashCode();
        if (iHashCode == -1844222469) {
            strB.equals("unchanged");
        } else if (iHashCode != 3739) {
            if (iHashCode != 108960) {
                if (iHashCode == 3089570 && strB.equals("down")) {
                    g4b1 g4b1Var = new g4b1(context, j4b1.E1, context.getResources().getDimensionPixelSize(2131167068));
                    g4b1Var.b(context.getColor(2131103289));
                    textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) g4b1Var);
                    return;
                }
            } else if (strB.equals("new")) {
                textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getDrawable(2131231206));
                return;
            }
        } else if (strB.equals("up")) {
            g4b1 g4b1Var2 = new g4b1(context, j4b1.F1, context.getResources().getDimensionPixelSize(2131167068));
            g4b1Var2.b(context.getColor(2131101519));
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) g4b1Var2);
            return;
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void e(View view, y570 y570Var, int... iArr) {
        if (iArr.length <= 0) {
            return;
        }
        hhg1.h("Component does not support scrolling");
    }
}
