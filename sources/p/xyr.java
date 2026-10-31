package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xyr implements qzh {
    public final bm00 a;

    public xyr(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131624635, (ViewGroup) null, false);
        if (viewInflate != null) {
            this.a = new bm00((LinearLayout) viewInflate, (byte) 2);
        } else {
            bhn0.i("rootView");
            throw null;
        }
    }

    public final void f(Object obj) {
        hi10 hi10Var = (hi10) obj;
        LinearLayout linearLayout = (LinearLayout) this.a.b;
        ((TextView) linearLayout.findViewById(2131431356)).setText(hi10Var.a);
        linearLayout.findViewById(2131431049).setColor(hi10Var.b);
        ((TextView) linearLayout.findViewById(2131428438)).setText(hi10Var.c);
        String str = hi10Var.d;
        if (str.length() > 0) {
            Button button = (Button) linearLayout.findViewById(2131430499);
            button.setVisibility(0);
            button.setText(str);
        }
    }

    public final View getView() {
        return (LinearLayout) this.a.b;
    }

    public final void n(iu30 iu30Var) {
        LinearLayout linearLayout = (LinearLayout) this.a.b;
        linearLayout.setOnClickListener(new trr(iu30Var, (byte) 23));
        ((Button) linearLayout.findViewById(2131430499)).setOnClickListener(new trr(iu30Var, (byte) 24));
    }
}
