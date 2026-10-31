package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g3v0 implements q570 {
    public final gw70 a;
    public final x10 b;
    public final mi30 c;
    public final k3v0 d;
    public fx40 e;

    public g3v0(gw70 gw70Var, Context context, mi30 mi30Var, k3v0 k3v0Var) {
        this.a = gw70Var;
        Drawable drawable = context.getDrawable(2131232442);
        if (drawable == null) {
            hhg1.n("Icon drawable resource must be valid");
            throw null;
        }
        int iO = ago1.o(context, 2130968791, 0);
        int iO2 = ago1.o(context, 2130968769, 0);
        drawable.setTint(iO);
        this.b = new x10(drawable, 1.0f, iO2, (byte) 2);
        this.c = mi30Var;
        this.d = k3v0Var;
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        Context context = viewGroup.getContext();
        fx40 fx40Var = new fx40(context);
        int iH = d4o1.h(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130968582});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        fx40Var.setStickyAreaSize(dimensionPixelSize + iH);
        this.e = fx40Var;
        return fx40Var;
    }

    public final EnumSet c() {
        return EnumSet.of(ix40.c);
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        fx40 fx40Var = (fx40) view;
        View viewInflate = LayoutInflater.from(fx40Var.getContext()).inflate(2131625422, (ViewGroup) fx40Var, false);
        TextView textView = (TextView) viewInflate.findViewById(2131430441);
        TextView textView2 = (TextView) viewInflate.findViewById(2131430439);
        TextView textView3 = (TextView) viewInflate.findViewById(2131430438);
        ImageView imageView = (ImageView) viewInflate.findViewById(2131430440);
        int color = Color.parseColor(y570Var.g().B("color"));
        fx40 fx40Var2 = this.e;
        mi30 mi30Var = this.c;
        z6p1.G(fx40Var2, color, mi30Var);
        this.e.setScrollObserver(new b3v0(mi30Var));
        String str = ((id70) y570Var.n()).a.a;
        cbr0 cbr0Var = this.d.a;
        if (str == null) {
            str = "";
        }
        cbr0Var.a(new yxe1(new ehc1(str)));
        textView2.setText(((id70) y570Var.n()).a.b);
        textView.setText(((id70) y570Var.n()).a.a);
        textView3.setText(((id70) y570Var.n()).a.d);
        String str2 = ((dd70) y570Var.k()).a.c.a.c;
        float dimensionPixelSize = imageView.getResources().getDimensionPixelSize(2131166841);
        x10 x10Var = this.b;
        gw70 gw70Var = this.a;
        if (str2 != null) {
            ixg ixgVarF = gw70Var.f(str2);
            ixgVarF.m(x10Var);
            ixgVarF.f(x10Var);
            ixgVarF.s(new fr31(Integer.valueOf((int) dimensionPixelSize)));
            ixgVarF.k(imageView, (ird1) null);
        } else {
            gw70Var.d(imageView);
            imageView.setImageDrawable(x10Var);
        }
        fx40Var.setContentViewBinder(new d3v0(viewInflate));
    }

    public final void e(View view, y570 y570Var, int[] iArr) {
    }
}
