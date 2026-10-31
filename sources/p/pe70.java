package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pe70 {
    public final int a;
    public final View b;
    public final n570 c;
    public final l670 d;
    public sw9 e;

    public pe70(int i, View view, n570 n570Var, l670 l670Var) {
        this.a = i;
        view.getClass();
        this.b = view;
        this.c = n570Var;
        l670Var.getClass();
        this.d = l670Var;
        l670Var.j.a(view);
    }

    public static pe70 b(int i, ViewGroup viewGroup, l670 l670Var) {
        n570 n570VarA = l670Var.d.a(i);
        if (n570VarA == null) {
            n570VarA = l670Var.i;
        }
        return new pe70(i, n570VarA.b(viewGroup, l670Var), n570VarA, l670Var);
    }

    public final void a(int i, y570 y570Var, yfu yfuVar) {
        this.e = new sw9(y570Var, i);
        l670 l670Var = this.d;
        l670Var.j.getClass();
        this.c.d(this.b, y570Var, l670Var, yfuVar);
        l670Var.j.getClass();
    }

    public final int c() {
        return this.a;
    }

    public final sw9 d() {
        sw9 sw9Var = this.e;
        if (sw9Var != null) {
            return sw9Var;
        }
        hhg1.n("View not bound to any component!");
        return null;
    }

    public final View e() {
        return this.b;
    }

    public final void f(int... iArr) {
        this.c.e(this.b, (y570) d().c, iArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("HubsViewHolder[");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" view: ");
        sb.append(this.b);
        sb.append(", binder: ");
        sb.append(this.c);
        sb.append(", binderId: ");
        sb.append(this.a);
        if (this.e != null) {
            sb.append(", position: ");
            sb.append(d().b);
            sb.append(", model: ");
            sb.append((y570) d().c);
        } else {
            sb.append(", not bound");
        }
        sb.append(']');
        return sb.toString();
    }
}
