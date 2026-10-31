package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fga1 extends cwb {
    public final tz01 Q0;
    public final Map R0;
    public et61 S0;
    public et61 T0;

    public fga1(Context context) {
        super(context, 2132017494);
        View viewInflate = LayoutInflater.from(context).inflate(2131626185, (ViewGroup) null, false);
        int i = 2131427563;
        TextView textView = (TextView) m5n1.t(viewInflate, 2131427563);
        if (textView != null) {
            i = 2131428519;
            TextView textView2 = (TextView) m5n1.t(viewInflate, 2131428519);
            if (textView2 != null) {
                i = 2131429075;
                if (((ImageView) m5n1.t(viewInflate, 2131429075)) != null) {
                    i = 2131430003;
                    if (((TextView) m5n1.t(viewInflate, 2131430003)) != null) {
                        i = 2131430140;
                        TextView textView3 = (TextView) m5n1.t(viewInflate, 2131430140);
                        if (textView3 != null) {
                            i = 2131430215;
                            TextView textView4 = (TextView) m5n1.t(viewInflate, 2131430215);
                            if (textView4 != null) {
                                i = 2131430556;
                                TextView textView5 = (TextView) m5n1.t(viewInflate, 2131430556);
                                if (textView5 != null) {
                                    i = 2131431547;
                                    TextView textView6 = (TextView) m5n1.t(viewInflate, 2131431547);
                                    if (textView6 != null) {
                                        ScrollView scrollView = (ScrollView) viewInflate;
                                        tz01 tz01Var = new tz01(scrollView, textView, textView2, textView3, textView4, textView5, textView6);
                                        this.R0 = sqg0.J(new mmr0[]{new mmr0(bb20.a, textView), new mmr0(bb20.b, textView2), new mmr0(bb20.c, textView6), new mmr0(aia1.b, textView3), new mmr0(aia1.c, textView4)});
                                        g().E = true;
                                        g().L(3);
                                        setContentView(scrollView);
                                        this.Q0 = tz01Var;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(yga1 yga1Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.R0);
        tz01 tz01Var = this.Q0;
        if (tz01Var != null) {
            TextView textView = (TextView) tz01Var.b;
            bia1 bia1Var = yga1Var.c;
            String str = bia1Var != null ? bia1Var.a : null;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            textView.setVisibility(bia1Var == null ? 8 : 0);
            textView.setOnClickListener(null);
            if (bia1Var != null) {
                linkedHashMap.put(bia1Var, textView);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            lpq0 lpq0Var = (lpq0) entry.getKey();
            TextView textView2 = (TextView) entry.getValue();
            String string = textView2.getContext().getString(2131962783);
            String string2 = textView2.getContext().getString(2131962784);
            fg fgVar = fg.g;
            if (!(lpq0Var instanceof bb20)) {
                string = string2;
            }
            b8k1.m(textView2, fgVar, string, (sh) null);
            Drawable drawable = textView2.getContext().getDrawable(2131231563);
            if (drawable != null) {
                drawable.setTintList(ColorStateList.valueOf(ago1.o(textView2.getContext(), 2130970419, 0)));
            }
            if (!u890.j(lpq0Var, yga1Var.b) && !u890.j(lpq0Var, yga1Var.a)) {
                drawable = null;
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            textView2.setOnClickListener(new kw6(this, textView2, lpq0Var, (byte) 25));
        }
        super/*android.app.Dialog*/.show();
    }

    public final void show() {
        i(new yga1(aia1.b, bb20.a, null));
    }
}
