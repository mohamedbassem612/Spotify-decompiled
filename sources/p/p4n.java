package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p4n implements w1i {
    public final uq8 a;

    public p4n(uq8 uq8Var) {
        this.a = uq8Var;
    }

    @Override // p.w1i
    public final v1i a(ViewGroup viewGroup) {
        View viewL = eqq.l(viewGroup, 2131624474, (ViewGroup) null, false);
        TextView textView = (TextView) m5n1.t(viewL, 2131428251);
        if (textView == null) {
            bhn0.i("Missing required view with ID: ".concat(viewL.getResources().getResourceName(2131428251)));
            return null;
        }
        RelativeLayout relativeLayout = (RelativeLayout) viewL;
        l2a l2aVar = new l2a(relativeLayout, textView);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        uq8 uq8Var = this.a;
        uq8Var.b = l2aVar;
        return new q4n(uq8Var, relativeLayout);
    }

    @Override // p.w1i
    public final void b(Object obj, v1i v1iVar) {
        o4n o4nVar = (o4n) obj;
        uq8 uq8Var = ((q4n) v1iVar).a;
        String str = o4nVar.b;
        String strF = o4nVar.a;
        if (str != null) {
            strF = f4i1.f(str, "\n", strF);
        }
        l2a l2aVar = (l2a) uq8Var.b;
        if (l2aVar != null) {
            ((TextView) l2aVar.b).setText(strF);
        } else {
            u890.C("binding");
            throw null;
        }
    }
}
