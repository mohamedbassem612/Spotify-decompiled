package p;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xo21 implements bik1 {
    public final lzn0 a;
    public final vnd1 b;

    public xo21(lzn0 lzn0Var, vnd1 vnd1Var) {
        this.a = lzn0Var;
        this.b = vnd1Var;
    }

    @Override // p.bik1
    public final w611 a(ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutL = eqq.l(viewGroup, 2131625591, viewGroup, false);
        int i = 2131427868;
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutL, 2131427868);
        if (encoreButtonT != null) {
            i = 2131431296;
            EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutL, 2131431296);
            if (encoreTextViewT != null) {
                return new vo21(this, new k811(constraintLayoutL, encoreButtonT, encoreTextViewT, (byte) 26));
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(i)));
        return null;
    }

    @Override // p.bik1
    public final void b(w611 w611Var, aik1 aik1Var) {
        vo21 vo21Var = (vo21) w611Var;
        yo21 yo21Var = (yo21) aik1Var;
        k811 k811Var = vo21Var.U0;
        ((EncoreTextView) k811Var.c).setText(yo21Var.b);
        EncoreButton encoreButton = (EncoreButton) k811Var.d;
        encoreButton.setText(yo21Var.a);
        encoreButton.setOnClickListener(new kw6(yo21Var, vo21Var.V0, vo21Var, (byte) 17));
    }
}
