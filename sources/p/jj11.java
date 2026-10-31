package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jj11 implements d4f1 {
    public View b;
    public final dg30 c;
    public View d;
    public final dg30 g;
    public final ij11 h;
    public final HashSet a = new HashSet(0);
    public Function0 e = cu9.e;
    public final s10 f = new s10(this, (byte) 14);

    public jj11(dg30 dg30Var, ij11 ij11Var) {
        this.c = dg30Var;
        this.g = dg30Var;
        this.h = ij11Var;
    }

    public final void a(e4f1 e4f1Var) {
        this.a.add(e4f1Var);
    }

    public final void b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131625579, viewGroup, false);
        this.b = viewInflate;
        viewInflate.getClass();
        viewGroup.addView(this.b);
        View view = this.b;
        this.d = view;
        ((TextView) view.findViewById(2131431356)).setText(this.h.a);
        ((TextView) view.findViewById(2131427439)).setText(2131961025);
        view.setOnClickListener(new c20(this, (byte) 9));
        int i = TooltipContainer.P0;
        TooltipContainer tooltipContainerFindViewById = this.c.findViewById(2131431413);
        tooltipContainerFindViewById.getClass();
        TooltipContainer tooltipContainer = tooltipContainerFindViewById;
        tooltipContainer.setOnTouchListener(new ica(tooltipContainer, this));
        view.postDelayed(this.f, 12000L);
        Integer numD = d();
        int iIntValue = numD.intValue();
        View view2 = this.b;
        if (iIntValue > 0) {
            lvx.t(view2, numD.intValue());
        } else {
            lvx.t(this.b, view2.getResources().getDimensionPixelSize(2131165925));
        }
    }

    public final Integer c() {
        return Integer.valueOf(this.c.getColor(2131103298));
    }

    public final Integer d() {
        return Integer.valueOf(this.c.getResources().getDimensionPixelSize(2131166913));
    }

    public final Integer e() {
        return Integer.valueOf(this.g.getResources().getDimensionPixelOffset(2131167147));
    }

    public final void f(ViewGroup viewGroup) {
        View view = this.b;
        if (view != null) {
            viewGroup.removeView(view);
            this.b = null;
        }
    }

    public final boolean g() {
        dg30 dg30Var = this.c;
        return (xoi1.b(dg30Var) || xoi1.a(dg30Var)) ? false : true;
    }

    public final void h() {
        View view = this.d;
        if (view == null) {
            u890.C("rootView");
            throw null;
        }
        view.removeCallbacks(this.f);
        HashSet<e4f1> hashSet = this.a;
        if (hashSet.isEmpty()) {
            return;
        }
        for (e4f1 e4f1Var : hashSet) {
            byte b = e4f1Var.a;
            Object obj = e4f1Var.b;
            switch (b) {
                case 0:
                    ((TooltipContainer) obj).b();
                    break;
                default:
                    ((Function0) obj).invoke();
                    break;
            }
        }
    }
}
