package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qp11 {
    public final vp11 a;
    public final l0x0 b;
    public final xmu0 c;
    public final rt01 d;
    public final dx0 e;
    public final y1c1 f;
    public final iac0 g;
    public final d0r h;
    public final r6h1 i;
    public final x4o j;
    public final Calendar k;
    public final Function0 l;
    public final boolean m;
    public final w6e0 n;
    public final boolean o;

    public qp11(vp11 vp11Var, l0x0 l0x0Var, xmu0 xmu0Var, rt01 rt01Var, dx0 dx0Var, y1c1 y1c1Var, iac0 iac0Var, d0r d0rVar, r6h1 r6h1Var, x4o x4oVar, Calendar calendar, Function0 function0, boolean z, w6e0 w6e0Var, boolean z2) {
        this.a = vp11Var;
        this.b = l0x0Var;
        this.c = xmu0Var;
        this.d = rt01Var;
        this.e = dx0Var;
        this.f = y1c1Var;
        this.g = iac0Var;
        this.h = d0rVar;
        this.i = r6h1Var;
        this.j = x4oVar;
        this.k = calendar;
        this.l = function0;
        this.m = z;
        this.n = w6e0Var;
        this.o = z2;
    }

    public static View b(laa laaVar, ViewGroup viewGroup, Object obj) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, laaVar, obj, (ipb1) null, 112).w;
    }

    public final View a(vu30 vu30Var, cp11 cp11Var, ViewGroup viewGroup) {
        return b((laa) vu30Var.invoke(this.f, this.g), viewGroup, cp11Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qp11) {
            qp11 qp11Var = (qp11) obj;
            if (this.a.equals(qp11Var.a) && this.b == qp11Var.b && this.c == qp11Var.c && this.d == qp11Var.d && this.e == qp11Var.e && this.f.equals(qp11Var.f) && u890.j(this.g, qp11Var.g) && u890.j(this.h, qp11Var.h) && this.i.equals(qp11Var.i) && this.j == qp11Var.j && this.k.equals(qp11Var.k) && this.l.equals(qp11Var.l) && this.m == qp11Var.m && this.n == qp11Var.n && this.o == qp11Var.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + ((this.n.hashCode() + xcg1.g(xcg1.g(rjx.n((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.l), 31, false), 31, this.m)) * 31);
    }
}
