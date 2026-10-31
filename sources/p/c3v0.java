package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.EnumSet;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c3v0 implements q570 {
    public final mi30 a;
    public final k3v0 b;
    public fx40 c;

    public c3v0(mi30 mi30Var, k3v0 k3v0Var) {
        this.a = mi30Var;
        this.b = k3v0Var;
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        Context context = viewGroup.getContext();
        fx40 fx40Var = new fx40(context);
        int iH = d4o1.h(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130968582});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        fx40Var.setStickyAreaSize(dimensionPixelSize + iH);
        this.c = fx40Var;
        return fx40Var;
    }

    public final EnumSet c() {
        return EnumSet.of(ix40.c);
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        fx40 fx40Var = (fx40) view;
        View viewInflate = LayoutInflater.from(fx40Var.getContext()).inflate(2131625421, (ViewGroup) fx40Var, false);
        TextView textView = (TextView) viewInflate.findViewById(2131430443);
        TextView textView2 = (TextView) viewInflate.findViewById(2131430442);
        fx40 fx40Var2 = this.c;
        mi30 mi30Var = this.a;
        Objects.requireNonNull(mi30Var);
        fx40Var2.setScrollObserver(new b3v0(mi30Var));
        if (!jhc1.F(y570Var.g().B("color"))) {
            z6p1.G(this.c, Color.parseColor(y570Var.g().B("color")), mi30Var);
        }
        String str = ((id70) y570Var.n()).a.a;
        cbr0 cbr0Var = this.b.a;
        if (str == null) {
            str = "";
        }
        cbr0Var.a(new yxe1(new ehc1(str)));
        textView2.setText(((id70) y570Var.n()).a.b);
        textView.setText(((id70) y570Var.n()).a.a);
        fx40Var.setContentViewBinder(new d3v0(viewInflate));
    }

    public final void e(View view, y570 y570Var, int[] iArr) {
    }
}
