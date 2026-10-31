package p;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.spotify.base.java.logging.Logger;
import com.spotify.legacyglue.emptystates.EmptyView;
import com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z970 extends f770 {
    public final fe70 d;

    public z970(fe70 fe70Var) {
        super(EnumSet.noneOf(ix40.class), f8x.class, (byte) 1);
        fe70Var.getClass();
        this.d = fe70Var;
    }

    @Override // p.f770
    public final void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        String str = ((id70) y570Var.n()).a.a;
        i0c0 i0c0Var = (i0c0) ((f8x) nx40Var);
        Button button = i0c0Var.c;
        i0c0Var.setTitle(str);
        i0c0Var.setSubtitle(((id70) y570Var.n()).a.d);
        i0c0 i0c0Var2 = (i0c0) i0c0Var.b.b;
        ImageView imageView = i0c0Var2.a.getImageView();
        if (imageView != null) {
            String str2 = ((dd70) y570Var.k()).a.f;
            ld70 ld70Var = ((dd70) y570Var.k()).a.c;
            fe70 fe70Var = this.d;
            if (str2 != null) {
                fe70Var.a(imageView);
                j4b1 j4b1Var = (j4b1) gc70.a.G(str2).h();
                g4b1 g4b1VarValueOf = null;
                if (j4b1Var != null) {
                    EmptyView emptyView = i0c0Var.a;
                    g4b1 g4b1Var = new g4b1(emptyView.getContext(), j4b1Var, a8o.y(64.0f, emptyView.getResources()));
                    String strB = y570Var.g().B("iconColor");
                    if (strB != null) {
                        try {
                            g4b1VarValueOf = Integer.valueOf(Color.parseColor(strB));
                        } catch (IllegalArgumentException unused) {
                            Logger.d("Could not parse color for icon in EmptyView", new Object[0]);
                        }
                    }
                    if (g4b1VarValueOf != null) {
                        g4b1Var.b(g4b1VarValueOf.intValue());
                    }
                    g4b1VarValueOf = g4b1Var;
                }
                i0c0Var2.a.setImageDrawable(g4b1VarValueOf);
            } else if (ld70Var != null) {
                i0c0Var2.a.getImageView().setVisibility(0);
                fe70Var.d(imageView, ld70Var, fa70.CARD);
            }
        }
        List listS = y570Var.s();
        if (listS.size() >= 1) {
            button.setVisibility(0);
            y570 y570Var2 = (y570) listS.get(0);
            button.setText(((id70) y570Var2.n()).a.a);
            two1.r(l670Var, button, y570Var2);
        } else {
            button.setVisibility(8);
        }
        if (listS.size() < 2) {
            i0c0Var2.d.setVisibility(8);
            return;
        }
        i0c0Var2.d.setVisibility(0);
        Button button2 = i0c0Var2.d;
        y570 y570Var3 = (y570) listS.get(1);
        button2.setText(((id70) y570Var3.n()).a.a);
        two1.r(l670Var, button2, y570Var3);
    }

    @Override // p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        Context context2 = viewGroup.getContext();
        EmptyView emptyView = new EmptyView(context2);
        i0c0 i0c0Var = new i0c0(emptyView);
        emptyView.setLayoutParams(PasteViewLayoutParamHelper.generateMatchParentWidthAndHeightLayoutParams(context2, viewGroup));
        emptyView.setTag(2131429011, i0c0Var);
        return i0c0Var;
    }

    @Override // p.f770
    public final void h(nx40 nx40Var, y570 y570Var, int[] iArr) {
        Button button;
        f8x f8xVar = (f8x) nx40Var;
        int length = iArr.length;
        if (length == 0) {
            if (iArr.length <= 0) {
                return;
            }
            hhg1.h("Component does not support scrolling");
        } else {
            if (length != 1) {
                hhg1.h("Empty states have at most one generation of children");
                return;
            }
            int i = iArr[0];
            if (i != 0) {
                button = i != 1 ? null : ((i0c0) ((i0c0) f8xVar).b.b).d;
            } else {
                button = ((i0c0) f8xVar).c;
            }
            if (button == null) {
                hhg1.n(gvg.e(i, "No child at ", " position"));
                return;
            }
            if (ha71.a.length <= 0) {
                return;
            }
            hhg1.h("Component does not support scrolling");
        }
    }
}
