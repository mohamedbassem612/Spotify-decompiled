package p;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ez01 {
    public final Activity a;
    public final lzn0 b;
    public final i8h1 c;
    public final svo d;
    public final bbr0 e;
    public final int f;
    public final rrk0 g = i8p1.r();
    public final idd1 h = new idd1(w0n0.N0);

    public ez01(Activity activity, lzn0 lzn0Var, i8h1 i8h1Var, svo svoVar, bbr0 bbr0Var, int i) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = i8h1Var;
        this.d = svoVar;
        this.e = bbr0Var;
        this.f = i;
    }

    public final EncoreTextView a(int i) {
        EncoreTextView encoreTextView = new EncoreTextView(this.a, null, 0, 6, null);
        encoreTextView.setTextAppearance(2132018006);
        encoreTextView.setTextColor(ago1.p(encoreTextView, 2130968791));
        int dimensionPixelSize = encoreTextView.getContext().getResources().getDimensionPixelSize(2131165393);
        BulletSpan bulletSpan = new BulletSpan(dimensionPixelSize);
        SpannableString spannableString = new SpannableString(encoreTextView.getContext().getString(i));
        spannableString.setSpan(bulletSpan, 0, spannableString.length(), 33);
        encoreTextView.setText(spannableString);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = encoreTextView.getContext().getResources().getDimensionPixelSize(2131165394);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        encoreTextView.setLayoutParams(marginLayoutParams);
        return encoreTextView;
    }

    public final EncoreTextView b(int i) {
        EncoreTextView encoreTextView = new EncoreTextView(this.a, null, 0, 6, null);
        encoreTextView.setTextAppearance(2132018004);
        encoreTextView.setTextColor(ago1.p(encoreTextView, 2130968787));
        encoreTextView.setText(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = encoreTextView.getContext().getResources().getDimensionPixelSize(2131166959);
        encoreTextView.setLayoutParams(marginLayoutParams);
        return encoreTextView;
    }

    public final EncoreTextView c() {
        EncoreTextView encoreTextView = new EncoreTextView(this.a, null, 0, 6, null);
        encoreTextView.setTextAppearance(2132018006);
        encoreTextView.setTextColor(ago1.p(encoreTextView, 2130968787));
        encoreTextView.setText(2131960967);
        encoreTextView.setGravity(1);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = encoreTextView.getContext().getResources().getDimensionPixelSize(2131166739);
        encoreTextView.setLayoutParams(marginLayoutParams);
        return encoreTextView;
    }

    public final void d() {
        lik1 lik1Var;
        bn70 bn70VarA = this.e.b0(bn70.class).a();
        String str = (bn70VarA == null || (lik1Var = bn70VarA.b) == null) ? null : lik1Var.a;
        cwb cwbVar = new cwb(this.a, 2132017517);
        Window window = cwbVar.getWindow();
        if (window != null) {
            d55.b(window);
            new csj1(window, window.getDecorView()).f(false);
        }
        cwbVar.setContentView(2131625574);
        View viewFindViewById = cwbVar.findViewById(2131427752);
        if (viewFindViewById != null) {
            rwq0.s(viewFindViewById, krz0.g);
        }
        cwbVar.g().J(cwbVar.getContext().getResources().getDisplayMetrics().heightPixels);
        cwbVar.g().L(3);
        cwbVar.setOnCancelListener(new vae(this, (byte) 7));
        View viewFindViewById2 = cwbVar.findViewById(2131430934);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new kw6(this, cwbVar, str, (byte) 15));
        }
        LinearLayout linearLayout = (LinearLayout) cwbVar.findViewById(2131427592);
        View viewFindViewById3 = cwbVar.findViewById(2131431115);
        if (this.f == 2) {
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(0);
            }
            if (linearLayout != null) {
                linearLayout.addView(b(2131960968));
                linearLayout.addView(a(2131954977));
                linearLayout.addView(a(2131954978));
                linearLayout.addView(a(2131954979));
                linearLayout.addView(b(2131960974));
                linearLayout.addView(a(2131954981));
                linearLayout.addView(c());
            }
        } else {
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(8);
            }
            if (linearLayout != null) {
                linearLayout.addView(b(2131960972));
                linearLayout.addView(a(2131960969));
                linearLayout.addView(a(2131960970));
                linearLayout.addView(a(2131960971));
                linearLayout.addView(b(2131960974));
                linearLayout.addView(a(2131960973));
                linearLayout.addView(c());
            }
        }
        cwbVar.show();
    }
}
