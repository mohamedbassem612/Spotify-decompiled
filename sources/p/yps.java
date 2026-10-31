package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yps implements qzh {
    public final Context a;
    public final wde b;

    public yps(Context context) {
        this.a = context;
        View viewInflate = LayoutInflater.from(context).inflate(2131626141, (ViewGroup) null, false);
        if (viewInflate != null) {
            this.b = new wde((LinearLayout) viewInflate);
        } else {
            bhn0.i("rootView");
            throw null;
        }
    }

    public final void f(Object obj) {
        int i;
        q191 q191Var = (q191) obj;
        String str = q191Var.g;
        String str2 = q191Var.h;
        LinearLayout linearLayout = this.b.a;
        ((TextView) linearLayout.findViewById(2131431356)).setText(q191Var.a);
        linearLayout.findViewById(2131431049).setColor(q191Var.b);
        String str3 = DateFormat.getDateInstance(3).format(new Date(q191Var.e));
        ((TextView) linearLayout.findViewById(2131428438)).setText(q191Var.f);
        int iC = l1d.C(q191Var.d);
        if (iC == 0) {
            i = 2131820855;
        } else if (iC == 1) {
            i = 2131820857;
        } else if (iC == 2) {
            i = 2131820856;
        } else {
            if (iC != 3) {
                eg.o();
                return;
            }
            i = 2131820858;
        }
        TextView textView = (TextView) linearLayout.findViewById(2131430383);
        Context context = this.a;
        Resources resources = context.getResources();
        int i2 = q191Var.c;
        textView.setText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        ((TextView) linearLayout.findViewById(2131430380)).setText(context.getResources().getString(2131960334, str3.toString()));
        if (str.length() > 0) {
            Button button = (Button) linearLayout.findViewById(2131430499);
            button.setVisibility(0);
            button.setText(str);
        }
        if (str2.length() <= 0 && str2.equals("")) {
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
        TextView textView2 = (TextView) linearLayout.findViewById(2131427371);
        textView2.setVisibility(0);
        textView2.setText(str2);
        TextView textView3 = (TextView) linearLayout.findViewById(2131427369);
        textView3.setVisibility(0);
        textView3.setText(q191Var.i);
    }

    public final View getView() {
        return this.b.a;
    }

    public final void n(iu30 iu30Var) {
        LinearLayout linearLayout = this.b.a;
        linearLayout.setOnClickListener(new sis(iu30Var, (byte) 22));
        ((Button) linearLayout.findViewById(2131430499)).setOnClickListener(new sis(iu30Var, (byte) 23));
        linearLayout.findViewById(2131427366).setOnClickListener(new sis(iu30Var, (byte) 24));
    }
}
