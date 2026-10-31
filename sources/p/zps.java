package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zps implements qzh {
    public final zg30 a;

    public zps(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131626142, (ViewGroup) null, false);
        if (viewInflate != null) {
            this.a = new zg30((LinearLayout) viewInflate);
        } else {
            bhn0.i("rootView");
            throw null;
        }
    }

    public final void f(Object obj) {
        s191 s191Var = (s191) obj;
        String str = s191Var.f;
        LinearLayout linearLayout = this.a.a;
        ((TextView) linearLayout.findViewById(2131431356)).setText(s191Var.a);
        linearLayout.findViewById(2131431049).setColor(s191Var.b);
        ((TextView) linearLayout.findViewById(2131428438)).setText(s191Var.d);
        String str2 = s191Var.e;
        if (str2.length() > 0) {
            Button button = (Button) linearLayout.findViewById(2131430499);
            button.setVisibility(0);
            button.setText(str2);
        }
        if (str.length() <= 0 && str.equals("")) {
            linearLayout.findViewById(2131427366).setVisibility(8);
            linearLayout.findViewById(2131427368).setVisibility(8);
            linearLayout.findViewById(2131427367).setVisibility(8);
            ((TextView) linearLayout.findViewById(2131427371)).setVisibility(8);
            ((TextView) linearLayout.findViewById(2131427369)).setVisibility(8);
            linearLayout.findViewById(2131427372).setVisibility(8);
            return;
        }
        linearLayout.findViewById(2131427368).setVisibility(0);
        linearLayout.findViewById(2131427367).setVisibility(0);
        linearLayout.findViewById(2131427372).setVisibility(0);
        TextView textView = (TextView) linearLayout.findViewById(2131427371);
        textView.setVisibility(0);
        textView.setText(str);
        TextView textView2 = (TextView) linearLayout.findViewById(2131427369);
        textView2.setVisibility(0);
        textView2.setText(s191Var.g);
    }

    public final View getView() {
        return this.a.a;
    }

    public final void n(iu30 iu30Var) {
        LinearLayout linearLayout = this.a.a;
        linearLayout.setOnClickListener(new sis(iu30Var, (byte) 25));
        ((Button) linearLayout.findViewById(2131430499)).setOnClickListener(new sis(iu30Var, (byte) 26));
        linearLayout.findViewById(2131427366).setOnClickListener(new sis(iu30Var, (byte) 27));
    }
}
