package p;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class irx0 {
    public final y441 a;
    public final y11 b;
    public final r4u c;

    public irx0(y441 y441Var, y11 y11Var) {
        this.a = y441Var;
        this.b = y11Var;
        ((EncoreTextView) y441Var.d).setText(2131955716);
        ((EncoreTextView) y441Var.c).setText(2131955715);
        ((EncoreButton) y441Var.b).setText(2131963433);
        this.c = r4u.c(new r4u[]{r4u.d(new hyr(grx0.b, (byte) 4), r4u.a(new sks0(this, (byte) 20))), r4u.d(new hyr(hrx0.b, (byte) 4), r4u.a(new jxp0(this, (byte) 22)))});
    }

    public final void a(svx0 svx0Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.a.a;
            constraintLayout.setAccessibilityPaneTitle(constraintLayout.getContext().getString(2131955752));
        }
        this.c.e(svx0Var);
    }
}
