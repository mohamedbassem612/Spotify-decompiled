package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class avr implements qzh {
    public final hur a;

    public avr(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131624549, (ViewGroup) null, false);
        TextView textView = (TextView) m5n1.t(viewInflate, 2131430718);
        if (textView != null) {
            this.a = new hur((LinearLayout) viewInflate, textView, (byte) 27);
        } else {
            bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131430718)));
            throw null;
        }
    }

    public final void f(Object obj) {
        ((TextView) this.a.c).setText(((l7u) obj).a);
    }

    public final View getView() {
        return (LinearLayout) this.a.b;
    }

    public final void n(iu30 iu30Var) {
        ((LinearLayout) this.a.b).setOnClickListener(new trr(iu30Var, (byte) 3));
    }
}
