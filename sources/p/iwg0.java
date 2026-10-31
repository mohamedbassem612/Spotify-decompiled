package p;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.marquee.marquee.ui.OverlayBackgroundView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iwg0 implements isw {
    public final /* synthetic */ TextView N0;
    public final /* synthetic */ ImageView X;
    public final /* synthetic */ EncoreAddToButtonView Y;
    public final /* synthetic */ iu30 Z;
    public final View a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ Button e;
    public final /* synthetic */ OverlayBackgroundView f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ TextView h;
    public final /* synthetic */ p811 i;
    public final /* synthetic */ s060 t;

    public iwg0(View view, TextView textView, TextView textView2, TextView textView3, Button button, OverlayBackgroundView overlayBackgroundView, Context context, TextView textView4, p811 p811Var, s060 s060Var, ImageView imageView, EncoreAddToButtonView encoreAddToButtonView, iu30 iu30Var, TextView textView5) {
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = button;
        this.f = overlayBackgroundView;
        this.g = context;
        this.h = textView4;
        this.i = p811Var;
        this.t = s060Var;
        this.X = imageView;
        this.Y = encoreAddToButtonView;
        this.Z = iu30Var;
        this.N0 = textView5;
        this.a = view;
    }

    public final void a(Object obj, ysw yswVar) {
        fwg0 fwg0Var = (fwg0) obj;
        String str = fwg0Var.h;
        String str2 = fwg0Var.c;
        twg0 twg0Var = fwg0Var.l;
        String str3 = fwg0Var.d;
        TextView textView = this.b;
        textView.setText(str3);
        String str4 = fwg0Var.e;
        TextView textView2 = this.c;
        textView2.setText(str4);
        String str5 = fwg0Var.a;
        TextView textView3 = this.d;
        textView3.setText(str5);
        String str6 = fwg0Var.f;
        Button button = this.e;
        button.setText(str6);
        String str7 = fwg0Var.k;
        OverlayBackgroundView overlayBackgroundView = this.f;
        if (str7 != null) {
            try {
                overlayBackgroundView.a(Color.parseColor(str7), false);
            } catch (IllegalArgumentException unused) {
                overlayBackgroundView.a(-7829368, false);
            }
        } else {
            mgc mgcVar = fwg0Var.n;
            ((gw70) mgcVar.d).f((String) mgcVar.c).g(new jm1(overlayBackgroundView, (byte) 18), new cc2(overlayBackgroundView, mgcVar, (byte) 4));
        }
        TextView textView4 = this.h;
        Context context = this.g;
        twg0 twg0Var2 = twg0.DARK;
        if (twg0Var != null) {
            int i = twg0Var == twg0Var2 ? -16777216 : -1;
            int color = twg0Var == twg0Var2 ? context.getColor(2131102457) : context.getColor(2131102468);
            textView3.setTextColor(i);
            textView.setTextColor(i);
            textView2.setTextColor(color);
            textView4.setTextColor(color);
            if (twg0Var == twg0Var2) {
                button.setTextColor(-1);
                button.setBackgroundTintList(x74.E(context, 2131100263));
            }
        }
        p811 p811Var = this.i;
        boolean zJ = u890.j(str2, p811Var.a);
        iu30 iu30Var = this.Z;
        if (!zJ) {
            p811Var.a = str2;
            ((gw70) this.t.f).f(str2).k(this.X, new ba40(iu30Var, (byte) 1));
        }
        this.Y.g(new pk1(fwg0Var.o ? qk1.b : qk1.a, false, (String) null, (String) null, twg0Var == twg0Var2 ? rk1.c : tk1.c, 14));
        boolean z = fwg0Var.f19p;
        String str8 = fwg0Var.g;
        if (z || str == null || str.length() == 0) {
            textView4.setText(str8);
            textView4.setOnClickListener(null);
        } else {
            SpannableString spannableString = new SpannableString(xcg1.i(str8, " ", str));
            int iW0 = ihc1.w0(spannableString, str, 0, false, 6);
            spannableString.setSpan(new StyleSpan(1), iW0, str.length() + iW0, 33);
            textView4.setText(spannableString);
            textView4.setOnClickListener(new jn90(iu30Var, (byte) 12));
        }
        String str9 = fwg0Var.b;
        String str10 = fwg0Var.m;
        TextView textView5 = this.N0;
        if (str9 == null || str9.length() == 0) {
            textView5.setVisibility(8);
            return;
        }
        textView5.setVisibility(0);
        textView5.setText(str9);
        if (twg0Var == null) {
            twg0Var = twg0.LIGHT;
        }
        int color2 = twg0Var == twg0Var2 ? context.getColor(2131102457) : context.getColor(2131102468);
        if (str10 != null && ihc1.h0(str10, "icon", true)) {
            eyg0[] eyg0VarArrValues = eyg0.values();
            int length = eyg0VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    hhg1.n(f4i1.f("MarqueeVisualsType ", str10, " not recognized"));
                    return;
                }
                eyg0 eyg0Var = eyg0VarArrValues[i2];
                if (str10.equalsIgnoreCase(eyg0Var.a)) {
                    if (eyg0.ICON_RELEASED != eyg0Var) {
                        break;
                    }
                    int iU = jch0.U(context.getResources().getDisplayMetrics().density * 12.0f);
                    Drawable drawable = context.getDrawable(2131232508);
                    if (drawable != null) {
                        drawable.setTint(color2);
                        drawable.setBounds(0, 0, iU, iU);
                    } else {
                        drawable = null;
                    }
                    textView5.setCompoundDrawablesRelative(drawable, null, null, null);
                    textView5.setCompoundDrawablePadding(4);
                    break;
                }
                i2++;
            }
        }
        textView5.setTextColor(color2);
        if (context.getResources().getConfiguration().orientation == 1) {
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).topMargin = jch0.U(context.getResources().getDisplayMetrics().density * 24.0f);
        }
    }

    public final View getView() {
        return this.a;
    }
}
