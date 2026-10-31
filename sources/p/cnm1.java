package p;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cnm1 extends z511 {
    public final zbh0 d;

    public cnm1(zbh0 zbh0Var) {
        this.d = zbh0Var;
    }

    public final int e() {
        return this.d.H1.e;
    }

    public final void n(int i, w611 w611Var) {
        zbh0 zbh0Var = this.d;
        int i2 = zbh0Var.H1.a.c + i;
        TextView textView = ((bnm1) w611Var).U0;
        String string = textView.getContext().getString(2131958959);
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        textView.setContentDescription(String.format(string, Integer.valueOf(i2)));
        cab cabVar = zbh0Var.K1;
        if (foi1.b().get(1) == i2) {
            Object obj = cabVar.c;
        } else {
            Object obj2 = cabVar.b;
        }
        throw null;
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        return new bnm1((TextView) eqq.l(viewGroup, 2131625270, viewGroup, false));
    }
}
