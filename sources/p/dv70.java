package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.home.evopage.element.imagelinks.ImageLinkCarouselElementUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dv70 implements isw {
    public final boolean a;
    public final idd1 b;
    public final kdn0 c;
    public String d;
    public Set e;
    public Function0 f;
    public final ne g;
    public final idd1 h;
    public final View i;

    public dv70(kly0 kly0Var, ViewGroup viewGroup, iu30 iu30Var, Context context, boolean z) {
        m611 m611Var = new m611();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = z;
        this.b = new idd1(new pd3(kly0Var, (byte) 7));
        this.c = new kdn0();
        this.e = w7x.a;
        this.f = h050.b1;
        ne neVar = new ne(3, new fz40(this, iu30Var, (byte) 27));
        this.g = neVar;
        this.h = new idd1(new nd70(this, (byte) 5));
        View viewInflate = LayoutInflater.from(context).inflate(2131625088, viewGroup, false);
        RecyclerView recyclerViewN = b8k1.n(viewInflate, 2131427916);
        recyclerViewN.setRecycledViewPool(m611Var);
        recyclerViewN.setItemAnimator((e611) null);
        recyclerViewN.j(new ir60(context.getResources().getDimensionPixelSize(2131166148), c(context.getResources()), c(context.getResources())));
        neVar.f(recyclerViewN, new ImageLinkCarouselElementUI.view.1.1(this, linkedHashMap), false);
        this.i = viewInflate;
    }

    public final void a(Object obj, ysw yswVar) {
        dv70 dv70Var;
        Function0 function0A;
        pmb1 pmb1Var = (aob1) obj;
        this.f.invoke();
        this.f = h050.c1;
        if (!u890.j(this.d, pmb1Var.b())) {
            this.e = w7x.a;
        }
        String strB = pmb1Var.b();
        t8r0 t8r0Var = (t8r0) this.g.e;
        if (!strB.equals((String) t8r0Var.b) && ((String) t8r0Var.b).length() > 0) {
            Iterator it = ((ArrayList) t8r0Var.a).iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
        }
        t8r0Var.b = strB;
        this.d = pmb1Var.b();
        View view = this.i;
        int iC = c(view.getResources());
        View viewN = b8k1.n(view, 2131429104);
        viewN.setPaddingRelative(iC, viewN.getPaddingTop(), iC, viewN.getPaddingBottom());
        c460 c460Var = (c460) this.b.getValue();
        x360 x360VarA = pmb1Var.a();
        idd1 idd1Var = this.h;
        c460Var.a(x360VarA, (FrameLayout) idd1Var.getValue());
        boolean z = pmb1Var instanceof pmb1;
        kdn0 kdn0Var = this.c;
        if (z) {
            ArrayList arrayList = pmb1Var.a;
            b8k1.n(view, 2131427916).setVisibility(0);
            kdn0Var.m(arrayList);
            ((FrameLayout) idd1Var.getValue()).setVisibility(0);
            return;
        }
        if (!(pmb1Var instanceof kmb1)) {
            if (!(pmb1Var instanceof wmb1)) {
                eg.o();
                return;
            } else {
                b8k1.n(view, 2131427916).setVisibility(8);
                ((FrameLayout) b8k1.n(view, 2131429104)).setVisibility(8);
                return;
            }
        }
        Set set = this.e;
        kmb1 kmb1Var = (kmb1) pmb1Var;
        Set set2 = kmb1Var.e;
        Integer numF = p1p1.F(set, set2, kmb1Var.d);
        this.e = set2;
        if (numF != null) {
            int iIntValue = numF.intValue();
            String str = kmb1Var.b;
            RecyclerView recyclerViewN = b8k1.n(view, 2131427916);
            z511 adapter = recyclerViewN.getAdapter();
            if (adapter != null) {
                dv70Var = this;
                function0A = t3p1.A(new ka0(recyclerViewN, dv70Var, str, iIntValue, (byte) 6), new zi50(pmb1Var, (byte) 27), adapter);
            } else {
                dv70Var = this;
                function0A = h050.d1;
            }
            dv70Var.f = function0A;
        }
        ArrayList arrayList2 = kmb1Var.a;
        b8k1.n(view, 2131427916).setVisibility(0);
        kdn0Var.m(arrayList2);
        ((FrameLayout) idd1Var.getValue()).setVisibility(0);
    }

    public final String b() {
        return this.d;
    }

    public final int c(Resources resources) {
        return resources.getDimensionPixelSize(2131166148) + (this.a ? 0 : resources.getDimensionPixelSize(2131165289));
    }

    public final View getView() {
        return this.i;
    }
}
