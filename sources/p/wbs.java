package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wbs implements qzh {
    public final gw70 a;
    public final boolean b;
    public final jvm0 c;

    public wbs(Context context, gw70 gw70Var, boolean z) {
        this.a = gw70Var;
        this.b = z;
        View viewInflate = LayoutInflater.from(context).inflate(2131625285, (ViewGroup) null, false);
        if (viewInflate != null) {
            this.c = new jvm0((LinearLayout) viewInflate);
        } else {
            bhn0.i("rootView");
            throw null;
        }
    }

    public final void f(Object obj) {
        ivm0 ivm0Var = (ivm0) obj;
        String str = ivm0Var.e;
        String str2 = ivm0Var.f;
        LinearLayout linearLayout = this.c.a;
        if (this.b) {
            linearLayout.findViewById(2131430368).setVisibility(8);
            ((LinearLayout) linearLayout.findViewById(2131430366)).setVisibility(8);
            linearLayout.findViewById(2131430385).setVisibility(8);
            linearLayout.findViewById(2131430924).setVisibility(8);
        } else {
            ((TextView) linearLayout.findViewById(2131431356)).setText(ivm0Var.a);
            linearLayout.findViewById(2131431049).setColor(ivm0Var.b);
            ((TextView) linearLayout.findViewById(2131428438)).setText(ivm0Var.d);
        }
        RecyclerView recyclerViewFindViewById = linearLayout.findViewById(2131430375);
        linearLayout.getContext();
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(1));
        linearLayout.findViewById(2131430375).setAdapter(new bk7(ivm0Var.c, this.a, (byte) 3));
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
        TextView textView = (TextView) linearLayout.findViewById(2131427371);
        textView.setVisibility(0);
        textView.setText(str2);
        TextView textView2 = (TextView) linearLayout.findViewById(2131427369);
        textView2.setVisibility(0);
        textView2.setText(ivm0Var.g);
    }

    public final View getView() {
        return this.c.a;
    }

    public final void n(iu30 iu30Var) {
        LinearLayout linearLayout = this.c.a;
        linearLayout.setOnClickListener(new o0s(iu30Var, (byte) 16));
        ((Button) linearLayout.findViewById(2131430499)).setOnClickListener(new o0s(iu30Var, (byte) 17));
        linearLayout.findViewById(2131427366).setOnClickListener(new o0s(iu30Var, (byte) 18));
    }
}
