package p;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kvc1 extends emc0 {
    public final hov0 e;
    public boolean f;

    public kvc1(hov0 hov0Var) {
        super(kn5.j);
        this.e = hov0Var;
        this.f = true;
    }

    public final void n(int i, w611 w611Var) {
        jvc1 jvc1Var = (jvc1) w611Var;
        wvx0 wvx0Var = (wvx0) A(i);
        lvc1 lvc1Var = jvc1Var.U0;
        LinearLayout linearLayout = (LinearLayout) lvc1Var.b;
        linearLayout.getBackground().mutate().setColorFilter(linearLayout.getContext().getColor(2131104059), PorterDuff.Mode.SRC);
        EncoreTextView encoreTextView = jvc1Var.V0;
        encoreTextView.setText(wvx0Var.b);
        kvc1 kvc1Var = jvc1Var.W0;
        encoreTextView.setOnClickListener(new rn(kvc1Var, wvx0Var, i, (byte) 5));
        encoreTextView.setEnabled(!kvc1Var.f);
        encoreTextView.setAlpha(kvc1Var.f ? 0.8f : 1.0f);
        ((ImageView) lvc1Var.d).setEnabled(!kvc1Var.f);
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        View viewL = eqq.l(viewGroup, 2131626215, viewGroup, false);
        int i2 = 2131431138;
        EncoreTextView encoreTextViewT = m5n1.t(viewL, 2131431138);
        if (encoreTextViewT != null) {
            i2 = 2131431140;
            ImageView imageView = (ImageView) m5n1.t(viewL, 2131431140);
            if (imageView != null) {
                return new jvc1(this, new lvc1((LinearLayout) viewL, encoreTextViewT, imageView, (byte) 0));
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewL.getResources().getResourceName(i2)));
        return null;
    }
}
