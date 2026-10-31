package p;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class s470 extends z511 {
    public final l670 d;
    public final b570 e;
    public final t470 f;

    public s470(l670 l670Var, xb01 xb01Var) {
        l670Var.getClass();
        this.d = l670Var;
        b570 b570Var = new b570(l670Var);
        this.e = b570Var;
        this.f = new t470(b570Var);
        x(true);
        w(b570Var.e);
    }

    public static pe70 C(w611 w611Var) {
        if (w611Var instanceof r470) {
            return ((r470) w611Var).U0;
        }
        hhg1.n("Not a HubsAdapter view holder");
        return null;
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public r470 p(int i, ViewGroup viewGroup) {
        return new r470(pe70.b(i, viewGroup, this.d));
    }

    public final void B(List list) {
        if (list == null || list.isEmpty()) {
            ((WeakHashMap) ((yfu) this.f).b).clear();
        }
        b570 b570Var = this.e;
        if (list == null) {
            b570Var.getClass();
            b570Var.b = Collections.EMPTY_LIST;
            je70 je70Var = je70.d;
            return;
        }
        b570Var.b = list;
        de70 de70Var = b570Var.a.g;
        if (list == je70.d || list == Collections.EMPTY_LIST) {
            return;
        }
        w280 w280Var = b380.b;
        if (list == bg11.e) {
            return;
        }
        if ((list instanceof je70) && ((je70) list).c == de70Var) {
            return;
        }
        new je70(de70Var, list);
    }

    public final int e() {
        return this.e.b.size();
    }

    public final long f(int i) {
        b570 b570Var = this.e;
        uo5 uo5Var = b570Var.c;
        y570 y570Var = (y570) b570Var.b.get(i);
        y570Var.getClass();
        y570 y570Var2 = uo5Var.x(y570Var).a;
        y570 y570VarA = y570Var2.a();
        if (y570VarA != null) {
            y570Var2 = y570VarA;
        }
        return y570Var2.hashCode();
    }

    public final int g(int i) {
        b570 b570Var = this.e;
        uo5 uo5Var = b570Var.c;
        y570 y570Var = (y570) b570Var.b.get(i);
        y570Var.getClass();
        return uo5Var.x(y570Var).b;
    }

    public final void n(int i, w611 w611Var) {
        b570 b570Var = this.e;
        uo5 uo5Var = b570Var.c;
        y570 y570Var = (y570) b570Var.b.get(i);
        y570Var.getClass();
        ((r470) w611Var).U0.a(i, uo5Var.x(y570Var).a, this.f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s470(l670 l670Var) {
        this(l670Var, null);
        l670Var.getClass();
    }

    public final void m(RecyclerView recyclerView) {
    }

    public final void r(RecyclerView recyclerView) {
    }
}
