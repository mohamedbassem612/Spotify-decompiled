package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v9b0 implements w1i {
    public final v1i a(ViewGroup viewGroup) {
        View viewL = eqq.l(viewGroup, 2131625112, viewGroup, false);
        if (viewL != null) {
            TextView textView = (TextView) viewL;
            return new w9b0(new hj90(textView, textView));
        }
        bhn0.i("rootView");
        return null;
    }

    public final void b(Object obj, v1i v1iVar) {
        r9b0 r9b0Var = (r9b0) obj;
        w9b0 w9b0Var = (w9b0) v1iVar;
        hj90 hj90Var = w9b0Var.a;
        TextView textView = hj90Var.b;
        textView.setText(r9b0Var.a);
        textView.setMaxLines(w9b0Var.c);
        textView.setTextAlignment(u890.j(r9b0Var.b, Boolean.TRUE) ? 4 : w9b0Var.d);
        hj90Var.a.setPaddingRelative(w9b0Var.e, w9b0Var.g, w9b0Var.f, w9b0Var.h);
    }
}
