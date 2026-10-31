package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v7j0 extends a8j0 {
    public final w6e0 U0;
    public final iu30 V0;

    public v7j0(w6e0 w6e0Var, hox0 hox0Var) {
        super((ConstraintLayout) w6e0Var.d);
        this.U0 = w6e0Var;
        this.V0 = hox0Var;
    }

    public final void E(h6j0 h6j0Var) {
        boolean zC = h6j0Var.c();
        w6e0 w6e0Var = this.U0;
        EncoreTextView encoreTextView = (EncoreTextView) w6e0Var.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) w6e0Var.d;
        EncoreTextView encoreTextView2 = (EncoreTextView) w6e0Var.c;
        if (!zC) {
            encoreTextView2.setVisibility(8);
            encoreTextView.setAlpha(1.0f);
            constraintLayout.setClickable(false);
            return;
        }
        encoreTextView2.setVisibility(0);
        encoreTextView.setAlpha(0.7f);
        if (h6j0Var.e) {
            encoreTextView2.setAlpha(1.0f);
            constraintLayout.setOnClickListener(new t230(this, h6j0Var, (byte) 14));
        } else {
            encoreTextView2.setAlpha(0.7f);
            constraintLayout.setClickable(false);
        }
    }
}
