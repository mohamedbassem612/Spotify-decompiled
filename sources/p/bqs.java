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
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bqs implements qzh {
    public final nl51 a;

    public bqs(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131626143, (ViewGroup) null, false);
        if (viewInflate != null) {
            this.a = new nl51((LinearLayout) viewInflate, (byte) 14);
        } else {
            bhn0.i("rootView");
            throw null;
        }
    }

    public final void f(Object obj) {
        u191 u191Var = (u191) obj;
        String str = u191Var.g;
        String str2 = DateFormat.getDateInstance(3).format(new Date(u191Var.d));
        LinearLayout linearLayout = (LinearLayout) this.a.b;
        ((TextView) linearLayout.findViewById(2131431356)).setText(u191Var.a);
        linearLayout.findViewById(2131431049).setColor(u191Var.b);
        ((TextView) linearLayout.findViewById(2131428438)).setText(u191Var.e);
        String strI = xcg1.i(linearLayout.getContext().getString(2131960360), " • ", linearLayout.getContext().getString(2131960359));
        TypedValue typedValue = new TypedValue();
        linearLayout.getContext().getTheme().resolveAttribute(2130968788, typedValue, true);
        int color = linearLayout.getContext().getColor(typedValue.resourceId);
        TextView textView = (TextView) linearLayout.findViewById(2131430383);
        String string = linearLayout.getContext().getString(2131960359);
        SpannableString spannableString = new SpannableString(strI);
        spannableString.setSpan(new ForegroundColorSpan(color), ihc1.w0(strI, string, 0, false, 6), strI.length(), 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        ((TextView) linearLayout.findViewById(2131430380)).setText(linearLayout.getContext().getResources().getString(2131960335, str2.toString()));
        String str3 = u191Var.f;
        if (str3.length() > 0) {
            Button button = (Button) linearLayout.findViewById(2131430499);
            button.setText(str3);
            button.setVisibility(0);
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
        TextView textView2 = (TextView) linearLayout.findViewById(2131427371);
        textView2.setVisibility(0);
        textView2.setText(str);
        TextView textView3 = (TextView) linearLayout.findViewById(2131427369);
        textView3.setVisibility(0);
        textView3.setText(u191Var.h);
    }

    public final View getView() {
        return (LinearLayout) this.a.b;
    }

    public final void n(iu30 iu30Var) {
        LinearLayout linearLayout = (LinearLayout) this.a.b;
        linearLayout.setOnClickListener(new sis(iu30Var, (byte) 28));
        ((Button) linearLayout.findViewById(2131430499)).setOnClickListener(new sis(iu30Var, (byte) 29));
        linearLayout.findViewById(2131427366).setOnClickListener(new aqs(iu30Var, (byte) 0));
    }
}
