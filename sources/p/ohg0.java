package p;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
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
public final class ohg0 implements qzh {
    public final boolean a;
    public final ur00 b;
    public final an c;
    public final fcs d;
    public final fcs e;
    public final eos f;
    public final ver g;

    public ohg0(Context context, igx igxVar, zfx zfxVar, pp ppVar, pp ppVar2, pp ppVar3, boolean z) {
        this.a = z;
        View viewInflate = LayoutInflater.from(context).inflate(2131625177, (ViewGroup) null, false);
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
                        this.b = new ur00(linearLayout, viewT, viewT2, viewT3, viewT4, (byte) 28);
                        this.c = new an(zfxVar);
                        this.d = ppVar.a((l0i) null);
                        this.e = igxVar.a((l0i) null);
                        this.f = ppVar2.a((l0i) null);
                        this.g = ppVar3.a((l0i) null);
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
        cwm0 cwm0Var = (cwm0) obj;
        ArrayList arrayList = cwm0Var.c;
        String str = cwm0Var.f;
        String str2 = cwm0Var.k;
        w4g0 w4g0Var = cwm0Var.g;
        LinearLayout linearLayout = (LinearLayout) this.b.b;
        if (this.a) {
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
            ((TextView) linearLayout.findViewById(2131431356)).setText(cwm0Var.a);
            linearLayout.findViewById(2131431049).setColor(cwm0Var.b);
            DateFormat dateInstance = DateFormat.getDateInstance(3);
            ((TextView) linearLayout.findViewById(2131428438)).setText(cwm0Var.e);
            String strF = f4i1.f(linearLayout.getContext().getString(2131960360), " • ", linearLayout.getContext().getString(2131960359));
            TypedValue typedValue = new TypedValue();
            linearLayout.getContext().getTheme().resolveAttribute(2130968788, typedValue, true);
            int color = linearLayout.getContext().getColor(typedValue.resourceId);
            TextView textView = (TextView) linearLayout.findViewById(2131430383);
            String string = linearLayout.getContext().getString(2131960359);
            SpannableString spannableString = new SpannableString(strF);
            spannableString.setSpan(new ForegroundColorSpan(color), ihc1.w0(strF, string, 0, false, 6), strF.length(), 33);
            textView.setText(spannableString, TextView.BufferType.SPANNABLE);
            ((TextView) linearLayout.findViewById(2131430380)).setText(linearLayout.getContext().getResources().getString(2131960335, dateInstance.format(new Date(0L)).toString()));
            if (str.length() > 0) {
                Button button = (Button) linearLayout.findViewById(2131430499);
                button.setVisibility(0);
                button.setText(str);
            }
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
        jx jxVar = new jx(z && arrayList.size() == 1, z && cwm0Var.d > 0, cwm0Var.i, "", cwm0Var.j);
        fcs fcsVar2 = this.d;
        fcsVar2.f(jxVar);
        k8p1.o(linearLayout.findViewById(2131427422), (ConstraintLayout) ((cp31) fcsVar2.b).a);
        View viewFindViewById = linearLayout.findViewById(2131427954);
        viewFindViewById.getClass();
        if (cwm0Var.h) {
            k8p1.o(viewFindViewById, ((wde) this.g.b).a);
            i = 0;
        } else {
            i = 8;
        }
        viewFindViewById.setVisibility(i);
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
        textView3.setText(cwm0Var.l);
    }

    public final View getView() {
        return (LinearLayout) this.b.b;
    }

    public final void n(iu30 iu30Var) {
        LinearLayout linearLayout = (LinearLayout) this.b.b;
        linearLayout.setOnClickListener(new jn90(iu30Var, (byte) 8));
        ((Button) linearLayout.findViewById(2131430499)).setOnClickListener(new jn90(iu30Var, (byte) 9));
        this.c.g = new mhg0(iu30Var, (byte) 1);
        this.d.n(new mhg0(iu30Var, (byte) 2));
        this.e.n(new mhg0(iu30Var, (byte) 3));
        this.f.n(new mhg0(iu30Var, (byte) 4));
        this.g.n(new mhg0(iu30Var, (byte) 5));
    }
}
