package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lhg0 implements qzh {
    public final Context a;
    public final boolean b;
    public final an c;
    public final fcs d;
    public final fcs e;
    public final eos f;
    public final ver g;
    public final wp20 h;

    public lhg0(Context context, igx igxVar, zfx zfxVar, pp ppVar, pp ppVar2, pp ppVar3, boolean z) {
        this.a = context;
        this.b = z;
        this.c = new an(zfxVar);
        this.d = ppVar.a((l0i) null);
        this.e = igxVar.a((l0i) null);
        this.f = ppVar2.a((l0i) null);
        this.g = ppVar3.a((l0i) null);
        View viewInflate = LayoutInflater.from(context).inflate(2131625175, (ViewGroup) null, false);
        int i = 2131427422;
        View viewT = m5n1.t(viewInflate, 2131427422);
        if (viewT != null) {
            i = 2131427518;
            View viewT2 = m5n1.t(viewInflate, 2131427518);
            if (viewT2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i = 2131427954;
                View viewT3 = m5n1.t(viewInflate, 2131427954);
                if (viewT3 != null) {
                    i = 2131429886;
                    View viewT4 = m5n1.t(viewInflate, 2131429886);
                    if (viewT4 != null) {
                        this.h = new wp20(linearLayout, viewT, viewT2, viewT3, viewT4);
                        return;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        int i;
        int i2;
        uvm0 uvm0Var = (uvm0) obj;
        String str = uvm0Var.i;
        ArrayList arrayList = uvm0Var.f;
        String str2 = uvm0Var.m;
        w4g0 w4g0Var = uvm0Var.j;
        LinearLayout linearLayout = (LinearLayout) this.h.a;
        if (this.b) {
            linearLayout.findViewById(2131430368).setVisibility(8);
            ((LinearLayout) linearLayout.findViewById(2131430366)).setVisibility(8);
            linearLayout.findViewById(2131430385).setVisibility(8);
            linearLayout.findViewById(2131430924).setVisibility(8);
            linearLayout.findViewById(2131430369).setVisibility(8);
            linearLayout.findViewById(2131430367).setVisibility(8);
            linearLayout.findViewById(2131430377).setVisibility(8);
            linearLayout.findViewById(2131430378).setVisibility(0);
            linearLayout.findViewById(2131429887).setVisibility(0);
            linearLayout.findViewById(2131430382).setVisibility(0);
        } else {
            ((TextView) linearLayout.findViewById(2131431356)).setText(uvm0Var.a);
            linearLayout.findViewById(2131431049).setColor(uvm0Var.b);
            ((TextView) linearLayout.findViewById(2131428438)).setText(uvm0Var.h);
            int iC = l1d.C(uvm0Var.d);
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
            int i3 = uvm0Var.c;
            textView.setText(resources.getQuantityString(i, i3, Integer.valueOf(i3)));
            ((TextView) linearLayout.findViewById(2131430380)).setText(context.getResources().getString(2131960334, DateFormat.getDateInstance(3).format(new Date(uvm0Var.e)).toString()));
        }
        k8p1.o(linearLayout.findViewById(2131427518), (LinearLayout) ((a42) this.f.b).b);
        String str3 = w4g0Var.a;
        boolean z = w4g0Var.c;
        String str4 = w4g0Var.b;
        fcs fcsVar = this.e;
        fcsVar.getClass();
        wp20 wp20Var = (wp20) fcsVar.b;
        ((EncoreTextView) wp20Var.e).setText(str3);
        ((EncoreTextView) wp20Var.d).setText(str4);
        ((View) wp20Var.c).setVisibility(z ? 8 : 0);
        k8p1.o(linearLayout.findViewById(2131429886), (ConstraintLayout) wp20Var.a);
        an anVar = this.c;
        anVar.e = arrayList;
        anVar.h();
        RecyclerView recyclerViewFindViewById = linearLayout.findViewById(2131430375);
        recyclerViewFindViewById.setAdapter(anVar);
        recyclerViewFindViewById.getContext();
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(1));
        jx jxVar = new jx(z && arrayList.size() == 1, z && uvm0Var.g > 0, uvm0Var.l, "", "");
        fcs fcsVar2 = this.d;
        fcsVar2.f(jxVar);
        k8p1.o(linearLayout.findViewById(2131427422), (ConstraintLayout) ((cp31) fcsVar2.b).a);
        if (str.length() > 0) {
            Button button = (Button) linearLayout.findViewById(2131430499);
            button.setVisibility(0);
            button.setText(str);
        }
        View viewFindViewById = linearLayout.findViewById(2131427954);
        viewFindViewById.getClass();
        if (uvm0Var.k) {
            k8p1.o(viewFindViewById, ((wde) this.g.b).a);
            i2 = 0;
        } else {
            i2 = 8;
        }
        viewFindViewById.setVisibility(i2);
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
        textView3.setText(uvm0Var.n);
    }

    public final View getView() {
        return (LinearLayout) this.h.a;
    }

    public final void n(iu30 iu30Var) {
        LinearLayout linearLayout = (LinearLayout) this.h.a;
        linearLayout.setOnClickListener(new jn90(iu30Var, (byte) 2));
        ((Button) linearLayout.findViewById(2131430499)).setOnClickListener(new jn90(iu30Var, (byte) 3));
        this.c.g = new yjf0(iu30Var, (byte) 20);
        this.d.n(new yjf0(iu30Var, (byte) 21));
        this.e.n(new yjf0(iu30Var, (byte) 22));
        this.f.n(new yjf0(iu30Var, (byte) 23));
        this.g.n(new yjf0(iu30Var, (byte) 24));
        linearLayout.findViewById(2131427366).setOnClickListener(new jn90(iu30Var, (byte) 4));
    }
}
