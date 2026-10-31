package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class f770 implements q570 {
    public final /* synthetic */ byte a;
    public final Class b;
    public final EnumSet c;

    public f770(EnumSet enumSet, Class cls, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                enumSet.getClass();
                this.c = enumSet;
                this.b = cls;
                break;
            default:
                enumSet.getClass();
                this.c = enumSet;
                this.b = cls;
                break;
        }
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return g(viewGroup.getContext(), viewGroup, l670Var).getView();
    }

    public final EnumSet c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        byte b = this.a;
        Class cls = this.b;
        switch (b) {
            case 0:
                f(bs51.s(view, cls), y570Var, l670Var, yfuVar);
                break;
            default:
                nx40 nx40VarS = bs51.s(view, cls);
                f(nx40VarS, y570Var, l670Var, yfuVar);
                if (nx40VarS instanceof qa0) {
                    ((qa0) nx40VarS).setActive("1".equals(y570Var.g().j("hubs:glue:highlight")));
                }
                View view2 = nx40VarS.getView();
                int i = y970.a;
                view2.setEnabled(!y570Var.g().b("disabled", false));
                break;
        }
    }

    public final void e(View view, y570 y570Var, int... iArr) {
        byte b = this.a;
        Class cls = this.b;
        switch (b) {
            case 0:
                bs51.s(view, cls).getView();
                if (iArr.length > 0) {
                    hhg1.h("Component does not support scrolling");
                    break;
                }
                break;
            default:
                h(bs51.s(view, cls), y570Var, iArr);
                break;
        }
    }

    public void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        kw31 kw31Var = (kw31) nx40Var;
        String str = ((id70) y570Var.n()).a.d;
        n57.j(str != null, "description not set");
        kw31Var.a(y570Var.g().n(Integer.MAX_VALUE, "maxLines"));
        kw31Var.h(str);
    }

    public nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        s7s0 s7s0VarR = t890.r(context, viewGroup, 2131625034);
        kw31 kw31Var = new kw31(s7s0VarR);
        kw31Var.a(Integer.MAX_VALUE);
        s7s0VarR.setTag(2131429011, kw31Var);
        return kw31Var;
    }

    public void h(nx40 nx40Var, y570 y570Var, int... iArr) {
        nx40Var.getView();
        if (iArr.length <= 0) {
            return;
        }
        hhg1.h("Component does not support scrolling");
    }
}
