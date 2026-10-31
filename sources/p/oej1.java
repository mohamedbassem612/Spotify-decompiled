package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oej1 implements isw {
    public final iu30 a;
    public final plb0 b;
    public final bpb1 c;
    public int d;
    public final zl7 e;
    public final jb3 f;

    public oej1(Context context, ViewGroup viewGroup, lik1 lik1Var, h2q h2qVar, iu30 iu30Var, x191 x191Var, lsw lswVar) {
        this.a = iu30Var;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626298, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        int i = 2131430963;
        if (((TextView) m5n1.t(constraintLayoutInflate, 2131430963)) != null) {
            i = 2131431356;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
            if (textView != null) {
                i = 2131431585;
                RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131431585);
                if (recyclerViewT != null) {
                    this.b = new plb0(textView, constraintLayout, constraintLayout, recyclerViewT);
                    this.c = gio1.b(z6x.a);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167226);
                    lkb1 lkb1Var = new lkb1((byte) 0);
                    this.e = new zl7(this, (byte) 25);
                    this.f = h2qVar.a(new gn10("video-preview-carousel"), new owf1(this, (byte) 9), lik1Var, x191Var, (kko) null, (njv0) null);
                    ne neVar = new ne(3, new nej1(this, viewGroup, (byte) 2));
                    recyclerViewT.j(new j1e(dimensionPixelSize, (byte) 1));
                    recyclerViewT.setPadding(recyclerViewT.getPaddingLeft(), recyclerViewT.getPaddingTop(), recyclerViewT.getPaddingRight(), dimensionPixelSize / 2);
                    lkb1Var.b(recyclerViewT);
                    neVar.f(recyclerViewT, new LinearLayoutManager(0), false);
                    c9s c9sVar = new c9s(new lej1(x191Var, this, (byte) 0), new lej1(x191Var, this, (byte) 1), (byte) 14);
                    a6o1.t(lswVar, new mej1(recyclerViewT, c9sVar, (byte) 0), new mej1(recyclerViewT, c9sVar, (byte) 1));
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(Object obj, ysw yswVar) {
        int i;
        kej1 kej1Var = (kej1) obj;
        List list = kej1Var.c;
        boolean zIsEmpty = list.isEmpty();
        plb0 plb0Var = this.b;
        if (zIsEmpty) {
            plb0Var.a.setVisibility(4);
            return;
        }
        bpb1 bpb1Var = this.c;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, list);
        String str = kej1Var.b;
        if (str.length() == 0) {
            plb0Var.b.setVisibility(8);
        } else {
            plb0Var.b.setText(str);
            plb0Var.b.setVisibility(0);
        }
        int i2 = kej1Var.a;
        ConstraintLayout constraintLayout = plb0Var.a;
        Context context = constraintLayout.getContext();
        if (i2 == 1) {
            i = 2131231257;
        } else {
            if (i2 != 2) {
                throw null;
            }
            i = 2131231258;
        }
        constraintLayout.setBackground(context.getDrawable(i));
        plb0Var.a.setVisibility(0);
    }

    public final int b(String str) {
        Iterator it = ((List) this.c.getValue()).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (u890.j(((jej1) it.next()).e, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final View getView() {
        return this.b.a;
    }
}
