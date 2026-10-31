package p;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lkr implements qzh {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: Code duplicated, block: B:33:0x00f1 A[PHI: r9
      0x00f1: PHI (r9v6 int) = (r9v5 int), (r9v7 int) binds: [B:26:0x00c8, B:28:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    public lkr(Context context, byte b) {
        this.a = b;
        int i = 2131431115;
        int i2 = 2131431356;
        switch (b) {
            case 1:
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625296, (ViewGroup) null, false);
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                if (textView != null) {
                    TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                    if (textView2 != null) {
                        kqm0 kqm0Var = new kqm0(constraintLayout, textView, textView2);
                        eqq.t(-1, -1, constraintLayout);
                        this.b = kqm0Var;
                        return;
                    }
                    i = 2131431356;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            case 2:
                CardView cardViewInflate = LayoutInflater.from(context).inflate(2131625442, (ViewGroup) null, false);
                int i3 = 2131429775;
                if (((LinearLayout) m5n1.t(cardViewInflate, 2131429775)) != null) {
                    i3 = 2131430614;
                    RecyclerView recyclerViewT = m5n1.t(cardViewInflate, 2131430614);
                    if (recyclerViewT != null) {
                        TextView textView3 = (TextView) m5n1.t(cardViewInflate, 2131431356);
                        if (textView3 != null) {
                            CardView cardView = cardViewInflate;
                            aru0 aru0Var = new aru0(cardView, recyclerViewT, textView3, (byte) 17);
                            cardView.setLayoutParams(new qhl(-1, -2));
                            this.b = aru0Var;
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    i2 = i3;
                }
                bhn0.i("Missing required view with ID: ".concat(cardViewInflate.getResources().getResourceName(i2)));
                throw null;
            case 3:
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131625439, (ViewGroup) null, false);
                ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431258);
                if (textView4 == null) {
                    bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(2131431258)));
                    throw null;
                }
                wb80 wb80Var = new wb80(constraintLayout2, constraintLayout2, textView4);
                constraintLayout2.setLayoutParams(new qhl(-1, -2));
                this.b = wb80Var;
                return;
            case 4:
                ConstraintLayout constraintLayoutInflate3 = LayoutInflater.from(context).inflate(2131625445, (ViewGroup) null, false);
                TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate3, 2131431115);
                if (textView5 != null) {
                    TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate3, 2131431356);
                    if (textView6 != null) {
                        ConstraintLayout constraintLayout3 = constraintLayoutInflate3;
                        kqm0 kqm0Var2 = new kqm0(constraintLayout3, textView5, textView6);
                        constraintLayout3.setLayoutParams(new qhl(-1, -2));
                        this.b = kqm0Var2;
                        return;
                    }
                    i = 2131431356;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate3.getResources().getResourceName(i)));
                throw null;
            default:
                ConstraintLayout constraintLayoutInflate4 = LayoutInflater.from(context).inflate(2131624339, (ViewGroup) null, false);
                if (constraintLayoutInflate4 == null) {
                    bhn0.i("rootView");
                    throw null;
                }
                ConstraintLayout constraintLayout4 = constraintLayoutInflate4;
                nsg nsgVar = new nsg(constraintLayout4);
                eqq.t(-1, -2, constraintLayout4);
                this.b = nsgVar;
                return;
        }
    }

    public static boolean a(eqv0 eqv0Var) {
        ArrayList arrayList = eqv0Var.b;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!"CHECK".equalsIgnoreCase(((fqv0) it.next()).b)) {
                return false;
            }
        }
        return true;
    }

    public final void f(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (obj != null) {
                    bhn0.d();
                    break;
                }
                break;
            case 1:
                bdo0 bdo0Var = (bdo0) obj;
                kqm0 kqm0Var = (kqm0) obj2;
                kqm0Var.c.setText(bdo0Var.a);
                kqm0Var.b.setText(bdo0Var.b);
                break;
            case 2:
                eqv0 eqv0Var = (eqv0) obj;
                aru0 aru0Var = (aru0) obj2;
                CardView cardView = (CardView) aru0Var.b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cardView.getLayoutParams();
                DisplayMetrics displayMetrics = cardView.getContext().getResources().getDisplayMetrics();
                displayMetrics.getClass();
                int iApplyDimension = (int) TypedValue.applyDimension(1, 16.0f, displayMetrics);
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 12.0f, displayMetrics);
                marginLayoutParams.setMargins(iApplyDimension, iApplyDimension2, iApplyDimension, iApplyDimension2);
                cardView.setLayoutParams(marginLayoutParams);
                ((TextView) aru0Var.d).setText(eqv0Var.a);
                RecyclerView recyclerView = (RecyclerView) aru0Var.c;
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                if (!a(eqv0Var)) {
                    boolean z = lrn1.a;
                    lrn1.a = true;
                    if (!z) {
                        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerView.getContext(), 2130771980));
                    }
                }
                recyclerView.setAdapter(new dqv0(a(eqv0Var) ? 1 : 2, eqv0Var.b));
                break;
            case 3:
                otv0 otv0Var = (otv0) obj;
                wb80 wb80Var = (wb80) obj2;
                TextView textView = wb80Var.b;
                ConstraintLayout constraintLayout = wb80Var.a;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) constraintLayout.getLayoutParams();
                DisplayMetrics displayMetrics2 = constraintLayout.getContext().getResources().getDisplayMetrics();
                displayMetrics2.getClass();
                int iApplyDimension3 = (int) TypedValue.applyDimension(1, 16.0f, displayMetrics2);
                int iApplyDimension4 = (int) TypedValue.applyDimension(1, 12.0f, displayMetrics2);
                marginLayoutParams2.setMargins(iApplyDimension3, iApplyDimension4, iApplyDimension3, iApplyDimension4);
                constraintLayout.setLayoutParams(marginLayoutParams2);
                if (otv0Var.c == 2) {
                    textView.setGravity(8388611);
                }
                String str = otv0Var.a;
                if (str == null || str.length() == 0) {
                    textView.setText("");
                } else {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setText((Spannable) Html.fromHtml(str, 0));
                    int color = Color.parseColor(otv0Var.b);
                    textView.setTextColor(Color.argb((int) (((double) Color.alpha(color)) * 0.7d), Color.red(color), Color.green(color), Color.blue(color)));
                }
                break;
            case 4:
                kwv0 kwv0Var = (kwv0) obj;
                kqm0 kqm0Var2 = (kqm0) obj2;
                kqm0Var2.c.setText(kwv0Var.a);
                TextView textView2 = kqm0Var2.b;
                String str2 = kwv0Var.b;
                textView2.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
                textView2.setText(str2);
                break;
            default:
                ((TrackInfoView) obj2).y((lof1) obj);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((nsg) obj).a;
            case 1:
                return ((kqm0) obj).a;
            case 2:
                return (CardView) ((aru0) obj).b;
            case 3:
                return ((wb80) obj).a;
            case 4:
                return ((kqm0) obj).a;
            default:
                return (TrackInfoView) obj;
        }
    }

    public lkr(TrackInfoView trackInfoView) {
        this.a = (byte) 5;
        this.b = trackInfoView;
    }
}
