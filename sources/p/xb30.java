package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xb30 extends z511 {
    public final gw70 d;
    public syf e = null;
    public List f = z6x.a;

    public xb30(gw70 gw70Var) {
        this.d = gw70Var;
    }

    public final void A(List list) {
        j4u j4uVarP = w0h1.p(new e7v0(this.f, list, (byte) 2));
        this.f = list;
        j4uVarP.b(this);
    }

    public final int e() {
        return this.f.size();
    }

    public final int g(int i) {
        tta ttaVar = (tta) this.f.get(i);
        if (ttaVar instanceof rta) {
            return 0;
        }
        if (ttaVar instanceof sta) {
            return 1;
        }
        if (ttaVar instanceof qta) {
            return 2;
        }
        eg.o();
        return 0;
    }

    public final void n(int i, w611 w611Var) {
        tta ttaVar = (tta) this.f.get(i);
        if (!(w611Var instanceof vb30)) {
            if (!(w611Var instanceof wb30)) {
                if (w611Var instanceof ub30) {
                    ((ub30) w611Var).U0.b.setText(((qta) ttaVar).a);
                    return;
                }
                return;
            }
            ij90 ij90Var = ((wb30) w611Var).U0;
            TextView textView = ij90Var.b;
            int i2 = ((sta) ttaVar).a;
            textView.setText("+ " + i2);
            textView.setContentDescription(ij90Var.a.getContext().getResources().getQuantityString(2131820690, i2, Integer.valueOf(i2)));
            return;
        }
        vb30 vb30Var = (vb30) w611Var;
        rta rtaVar = (rta) ttaVar;
        boolean z = rtaVar.c;
        x390 x390Var = vb30Var.U0;
        ShapeableImageView shapeableImageView = (ShapeableImageView) x390Var.c;
        FrameLayout frameLayout = (FrameLayout) x390Var.b;
        if (z) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setBackground(null);
        } else {
            int dimensionPixelSize = frameLayout.getContext().getResources().getDimensionPixelSize(2131166062);
            frameLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            frameLayout.setBackgroundResource(2131233089);
        }
        shapeableImageView.setContentDescription(rtaVar.b);
        ixg ixgVarF = vb30Var.V0.d.f(rtaVar.a);
        ixgVarF.h();
        ixgVarF.k(shapeableImageView, (ird1) null);
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int iC = l1d.C(l1d.H(3)[i]);
        if (iC == 0) {
            View viewInflate = layoutInflaterFrom.inflate(2131625101, viewGroup, false);
            ShapeableImageView shapeableImageViewT = m5n1.t(viewInflate, 2131428938);
            if (shapeableImageViewT != null) {
                return new vb30(this, new x390(viewInflate, (Object) shapeableImageViewT, (byte) 4));
            }
            bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131428938)));
            return null;
        }
        if (iC == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(2131625102, viewGroup, false);
            if (viewInflate2 != null) {
                TextView textView = (TextView) viewInflate2;
                return new wb30(this, new ij90(textView, textView));
            }
            bhn0.i("rootView");
            return null;
        }
        if (iC != 2) {
            eg.o();
            return null;
        }
        View viewInflate3 = layoutInflaterFrom.inflate(2131625100, viewGroup, false);
        if (viewInflate3 != null) {
            TextView textView2 = (TextView) viewInflate3;
            return new ub30(new hj90(textView2, textView2));
        }
        bhn0.i("rootView");
        return null;
    }
}
