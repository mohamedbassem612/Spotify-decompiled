package p;

import android.content.Context;
import android.icu.text.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cej1 implements isw {
    public final r4u N0;
    public final DateFormat O0;
    public boolean X;
    public int Y;
    public final r4u Z;
    public final x191 a;
    public final kko b;
    public final guj1 c;
    public final iu30 d;
    public final plb0 e;
    public final kdn0 f;
    public int g;
    public final zl7 h;
    public final cqw i;
    public boolean t;

    public cej1(Context context, lsw lswVar, lik1 lik1Var, h2q h2qVar, Function0 function0, x191 x191Var, kko kkoVar, guj1 guj1Var, iu30 iu30Var) {
        xcn0 xcn0Var = lswVar.a;
        this.a = x191Var;
        this.b = kkoVar;
        this.c = guj1Var;
        this.d = iu30Var;
        cqw cqwVar = null;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626310, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        int i = 2131430963;
        if (((TextView) m5n1.t(constraintLayoutInflate, 2131430963)) != null) {
            i = 2131431356;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
            if (textView != null) {
                i = 2131431585;
                RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131431585);
                if (recyclerViewT != null) {
                    this.e = new plb0(textView, constraintLayout, constraintLayout, recyclerViewT);
                    this.f = new kdn0(z6x.a);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167226);
                    lkb1 lkb1Var = new lkb1((byte) 0);
                    this.h = new zl7(this, (byte) 24);
                    gn10 gn10Var = new gn10("video-preview-carousel");
                    gj50 gj50Var = new gj50();
                    gj50Var.b = eak1.P0;
                    new zjk1(xcn0Var, new tak1(gj50Var, (byte) 6));
                    a6o1.t(lswVar, kvj1.Z, new bkk1(gj50Var, (byte) 0));
                    tl7 tl7Var = (tl7) function0.invoke();
                    if (tl7Var != null) {
                        cqw cqwVar2 = new cqw(tl7Var, xcn0Var, new aej1(this, (byte) 0), new aej1(this, (byte) 1));
                        xcn0Var.a(rc11.a.b(tsw.class), cqwVar2);
                        cqwVar = cqwVar2;
                    }
                    this.i = cqwVar;
                    ne neVar = new ne(3, new bej1(this, h2qVar.a(gn10Var, new bih1(this, iu30Var, (byte) 8), lik1Var, x191Var, kkoVar, guj1Var.d)));
                    recyclerViewT.j(new j1e(dimensionPixelSize, (byte) 0));
                    recyclerViewT.setPadding(recyclerViewT.getPaddingLeft(), recyclerViewT.getPaddingTop(), recyclerViewT.getPaddingRight(), dimensionPixelSize / 2);
                    lkb1Var.b(recyclerViewT);
                    neVar.f(recyclerViewT, new LinearLayoutManager(0), false);
                    z511 adapter = recyclerViewT.getAdapter();
                    if (adapter != null) {
                        adapter.w(new v01(this, recyclerViewT, (byte) 2));
                        recyclerViewT.addOnAttachStateChangeListener(new vgu(adapter, this, recyclerViewT, (byte) 4));
                    }
                    if (!x191Var.a()) {
                        gj50Var.b = new hcf1(1, this, cej1.class, "focusStateChanged", "focusStateChanged(Z)V", 0, (byte) 18);
                    }
                    this.Z = r4u.a(new a1g1(this, (byte) 8));
                    this.N0 = r4u.c(new r4u[]{new r4u(p5x0.V0, new q881(this, (byte) 29)), new r4u(r5x0.X0, new i2i1(this, (byte) 3))});
                    this.O0 = DateFormat.getPatternInstance("MMMd", new Locale(upn1.m()));
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(Object obj, ysw yswVar) {
        ouj1 ouj1Var = (ouj1) obj;
        boolean zIsEmpty = ouj1Var.d.isEmpty();
        this.e.a.setVisibility(!zIsEmpty ? 0 : 8);
        this.N0.e(ouj1Var);
        this.Z.e(new mmr0(ouj1Var.b, ouj1Var.c));
        if (zIsEmpty || !u890.j(ouj1Var.e, euj1.c)) {
            return;
        }
        this.a.d(new sjf1(0, this, cej1.class, "onActive", "onActive()V", 0, (byte) 13), new sjf1(0, this, cej1.class, "onInactive", "onInactive()V", 0, (byte) 14));
    }

    public final int b(String str) {
        List list = (List) this.f.e();
        if (list == null) {
            return -1;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (u890.j(((gi90) it.next()).e, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void c() {
        plb0 plb0Var = this.e;
        RecyclerView recyclerView = plb0Var.c;
        zl7 zl7Var = this.h;
        recyclerView.p0(zl7Var);
        plb0Var.c.m(zl7Var);
        List list = (List) this.f.e();
        if (list != null) {
            int size = list.size();
            int i = this.g;
            if (i >= 0 && i < size) {
                this.d.invoke(new luj1(i, ((gi90) list.get(i)).e));
            }
        }
        e(this.g);
    }

    public final void d() {
        this.e.c.p0(this.h);
        e(-1);
    }

    public final void e(int i) {
        int i2;
        kdn0 kdn0Var = this.f;
        List list = (List) kdn0Var.e();
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list == null) {
                return;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            int i3 = 0;
            for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                gi90 gi90Var = (gi90) next;
                if (i3 == i) {
                    i2 = 2;
                    if (gi90Var.n == 2) {
                        i2 = 3;
                    }
                } else {
                    i2 = 1;
                }
                if (gi90Var.n != i2) {
                    gi90Var = new gi90(gi90Var.a, gi90Var.b, gi90Var.c, gi90Var.d, gi90Var.e, gi90Var.f, gi90Var.g, gi90Var.h, gi90Var.i, gi90Var.j, gi90Var.k, gi90Var.l, gi90Var.m, i2, gi90Var.o, gi90Var.f16p, gi90Var.q, gi90Var.r, gi90Var.s, gi90Var.t);
                }
                arrayList.add(gi90Var);
                i3 = i4;
            }
            kdn0Var.j(arrayList);
        }
    }

    public final void f(String str) {
        int length = str.length();
        plb0 plb0Var = this.e;
        if (length == 0) {
            plb0Var.b.setVisibility(8);
        } else {
            plb0Var.b.setText(str);
            plb0Var.b.setVisibility(0);
        }
    }

    public final View getView() {
        return this.e.a;
    }
}
