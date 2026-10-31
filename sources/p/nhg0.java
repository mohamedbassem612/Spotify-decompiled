package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nhg0 implements qzh {
    public final boolean a;
    public final an b;
    public final fcs c;
    public final fcs d;
    public final eos e;
    public final eos f;
    public final ver g;
    public final wmy h;

    public nhg0(Context context, igx igxVar, zfx zfxVar, pp ppVar, pp ppVar2, pp ppVar3, pp ppVar4, boolean z) {
        this.a = z;
        this.b = new an(zfxVar);
        this.c = ppVar.a((l0i) null);
        this.d = igxVar.a((l0i) null);
        this.e = ppVar2.a((l0i) null);
        this.f = ppVar3.a((l0i) null);
        this.g = ppVar4.a((l0i) null);
        View viewInflate = LayoutInflater.from(context).inflate(2131625176, (ViewGroup) null, false);
        int i = 2131427422;
        View viewT = m5n1.t(viewInflate, 2131427422);
        if (viewT != null) {
            i = 2131427518;
            View viewT2 = m5n1.t(viewInflate, 2131427518);
            if (viewT2 != null) {
                i = 2131427874;
                View viewT3 = m5n1.t(viewInflate, 2131427874);
                if (viewT3 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    i = 2131427954;
                    View viewT4 = m5n1.t(viewInflate, 2131427954);
                    if (viewT4 != null) {
                        i = 2131429886;
                        View viewT5 = m5n1.t(viewInflate, 2131429886);
                        if (viewT5 != null) {
                            this.h = new wmy(linearLayout, viewT, viewT2, viewT3, viewT4, viewT5);
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        int i;
        yvm0 yvm0Var = (yvm0) obj;
        String str = yvm0Var.k;
        String str2 = yvm0Var.g;
        String str3 = yvm0Var.q;
        int i2 = yvm0Var.e;
        ArrayList arrayList = yvm0Var.d;
        String str4 = yvm0Var.b;
        String str5 = yvm0Var.l;
        w4g0 w4g0Var = yvm0Var.h;
        LinearLayout linearLayout = (LinearLayout) this.h.a;
        if (this.a) {
            linearLayout.findViewById(2131430368).setVisibility(8);
            ((LinearLayout) linearLayout.findViewById(2131430366)).setVisibility(8);
            linearLayout.findViewById(2131430385).setVisibility(8);
            linearLayout.findViewById(2131430924).setVisibility(8);
            linearLayout.findViewById(2131430377).setVisibility(8);
            linearLayout.findViewById(2131430378).setVisibility(0);
            linearLayout.findViewById(2131429887).setVisibility(0);
            linearLayout.findViewById(2131430382).setVisibility(0);
        } else {
            ((TextView) linearLayout.findViewById(2131431356)).setText(yvm0Var.a);
            TextView textView = (TextView) linearLayout.findViewById(2131431115);
            if (str4.length() > 0) {
                textView.setText(str4);
                textView.setVisibility(0);
            }
            linearLayout.findViewById(2131431049).setColor(yvm0Var.c);
            ((TextView) linearLayout.findViewById(2131428438)).setText(yvm0Var.f);
        }
        k8p1.o(linearLayout.findViewById(2131427518), (LinearLayout) ((a42) this.e.b).b);
        String str6 = w4g0Var.a;
        boolean z = w4g0Var.c;
        String str7 = w4g0Var.b;
        fcs fcsVar = this.d;
        fcsVar.getClass();
        wp20 wp20Var = (wp20) fcsVar.b;
        ((EncoreTextView) wp20Var.e).setText(str6);
        ((EncoreTextView) wp20Var.d).setText(str7);
        ((View) wp20Var.c).setVisibility(z ? 8 : 0);
        k8p1.o(linearLayout.findViewById(2131429886), (ConstraintLayout) wp20Var.a);
        an anVar = this.b;
        anVar.e = arrayList;
        anVar.h();
        RecyclerView recyclerViewFindViewById = linearLayout.findViewById(2131430375);
        recyclerViewFindViewById.setAdapter(anVar);
        recyclerViewFindViewById.getContext();
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(1));
        boolean z2 = z && arrayList.size() == 1;
        boolean z3 = z && i2 > 0;
        boolean z4 = str3.length() > 0;
        if ((z4 && i2 > 0) || !z4 || str.length() > 0) {
            jx jxVar = new jx(z2, z3, yvm0Var.j, yvm0Var.f25p, str);
            fcs fcsVar2 = this.c;
            fcsVar2.f(jxVar);
            k8p1.o(linearLayout.findViewById(2131427422), (ConstraintLayout) ((cp31) fcsVar2.b).a);
        }
        if (z4) {
            eos eosVar = this.f;
            eosVar.getClass();
            k8p1.o(linearLayout.findViewById(2131427874), (LinearLayout) ((ic9) eosVar.b).b);
            EncoreButton encoreButtonFindViewById = linearLayout.findViewById(2131427873);
            if (encoreButtonFindViewById != null) {
                encoreButtonFindViewById.setText(str3);
            }
        }
        if (str2.length() > 0) {
            Button button = (Button) linearLayout.findViewById(2131430499);
            button.setVisibility(0);
            button.setText(str2);
        }
        View viewFindViewById = linearLayout.findViewById(2131427954);
        viewFindViewById.getClass();
        if (yvm0Var.i) {
            k8p1.o(viewFindViewById, ((wde) this.g.b).a);
            i = 0;
        } else {
            i = 8;
        }
        viewFindViewById.setVisibility(i);
        if (str5.length() <= 0 && str5.equals("")) {
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
        textView2.setText(str5);
        TextView textView3 = (TextView) linearLayout.findViewById(2131427369);
        textView3.setVisibility(0);
        textView3.setText(yvm0Var.m);
    }

    public final View getView() {
        return (LinearLayout) this.h.a;
    }

    public final void n(iu30 iu30Var) {
        LinearLayout linearLayout = (LinearLayout) this.h.a;
        linearLayout.setOnClickListener(new jn90(iu30Var, (byte) 5));
        ((Button) linearLayout.findViewById(2131430499)).setOnClickListener(new jn90(iu30Var, (byte) 6));
        this.b.g = new yjf0(iu30Var, (byte) 25);
        this.c.n(new yjf0(iu30Var, (byte) 26));
        this.d.n(new yjf0(iu30Var, (byte) 27));
        this.e.n(new yjf0(iu30Var, (byte) 28));
        this.f.n(new yjf0(iu30Var, (byte) 29));
        this.g.n(new mhg0(iu30Var, (byte) 0));
        linearLayout.findViewById(2131427366).setOnClickListener(new jn90(iu30Var, (byte) 7));
    }
}
