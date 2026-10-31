package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.icons.IconArrowTopLeft;
import com.spotify.legacyglue.icons.SpotifyIconView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eir implements qzh, qad1 {
    public final ai4 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final oq51 e;
    public final yu3 f;
    public final v8o0 g;

    public eir(Context context, ai4 ai4Var, boolean z, boolean z2, boolean z3) {
        this.a = ai4Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = new oq51(context);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624076, (ViewGroup) null, false);
        int i = 2131429586;
        View view = (SpotifyIconView) m5n1.t(constraintLayoutInflate, 2131429586);
        if (view != null) {
            i = 2131430561;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430561);
            if (textView != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                i = 2131431216;
                View view2 = (IconArrowTopLeft) m5n1.t(constraintLayoutInflate, 2131431216);
                if (view2 != null) {
                    yu3 yu3Var = new yu3(constraintLayout, view, textView, view2, (byte) 19);
                    v9w0 v9w0VarQ = b2u.q(constraintLayout);
                    Collections.addAll(v9w0VarQ.c, textView);
                    Collections.addAll(v9w0VarQ.d, view, view2);
                    v9w0VarQ.a();
                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    this.f = yu3Var;
                    this.g = new v8o0(constraintLayout.getContext(), 3);
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final m9d1 a() {
        return this.g.c();
    }

    public final void f(Object obj) {
        j4b1 j4b1Var;
        t39 t39Var = (t39) obj;
        int i = t39Var.c;
        yu3 yu3Var = this.f;
        ConstraintLayout constraintLayout = (ConstraintLayout) yu3Var.b;
        TextView textView = (TextView) yu3Var.d;
        IconArrowTopLeft iconArrowTopLeft = (IconArrowTopLeft) yu3Var.e;
        SpotifyIconView spotifyIconView = (SpotifyIconView) yu3Var.c;
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), r(2131167073), constraintLayout.getPaddingRight(), r(t39Var.d ? 2131167068 : 2131167073));
        if (this.d) {
            int iR = r(2131166939);
            int iR2 = r(2131167073);
            spotifyIconView.setPadding(iR2, iR2, iR2, iR2);
            ViewGroup.LayoutParams layoutParams = spotifyIconView.getLayoutParams();
            layoutParams.width = iR;
            layoutParams.height = iR;
            spotifyIconView.setLayoutParams(layoutParams);
            int iR3 = r(2131167073);
            iconArrowTopLeft.setPadding(iR3, iR3, iR3, iR3);
            ViewGroup.LayoutParams layoutParams2 = iconArrowTopLeft.getLayoutParams();
            layoutParams2.height = iR;
            iconArrowTopLeft.setLayoutParams(layoutParams2);
        } else {
            int iR4 = r(2131166938);
            int iR5 = r(2131167065);
            spotifyIconView.setPadding(iR5, iR5, iR5, iR5);
            ViewGroup.LayoutParams layoutParams3 = spotifyIconView.getLayoutParams();
            layoutParams3.width = iR4;
            layoutParams3.height = iR4;
            spotifyIconView.setLayoutParams(layoutParams3);
            int iR6 = r(2131167068);
            iconArrowTopLeft.setPadding(iR6, iR6, iR6, iR6);
            ViewGroup.LayoutParams layoutParams4 = iconArrowTopLeft.getLayoutParams();
            layoutParams4.height = iR4;
            iconArrowTopLeft.setLayoutParams(layoutParams4);
        }
        if (this.c) {
            textView.setSingleLine(false);
            textView.setMaxLines(2);
        } else {
            textView.setSingleLine(true);
            textView.setMaxLines(1);
        }
        textView.setText(this.e.a(t39Var.b, false, this.a));
        int iC = l1d.C(i);
        if (iC == 0) {
            j4b1Var = j4b1.W5;
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            j4b1Var = j4b1.M5;
        }
        spotifyIconView.setIcon(j4b1Var);
        if (this.b) {
            spotifyIconView.setBackgroundResource(2131230967);
        }
        iconArrowTopLeft.setContentDescription(constraintLayout.getResources().getString(2131961566, textView.getText().toString()));
        this.g.b = i == 2;
    }

    public final View getView() {
        return (ConstraintLayout) this.f.b;
    }

    public final void n(iu30 iu30Var) {
        yu3 yu3Var = this.f;
        ((ConstraintLayout) yu3Var.b).setOnClickListener(new yer(iu30Var, (byte) 15));
        ((IconArrowTopLeft) yu3Var.e).setOnClickListener(new yer(iu30Var, (byte) 16));
        this.g.e = new qzn(iu30Var, (byte) 18);
    }

    public final int r(int i) {
        return ((ConstraintLayout) this.f.b).getResources().getDimensionPixelSize(i);
    }
}
