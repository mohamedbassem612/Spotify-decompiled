package p;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qtv0 extends ptv0 {
    public final ImageView U0;
    public final ConstraintLayout V0;
    public final TextView W0;
    public final /* synthetic */ stv0 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtv0(stv0 stv0Var, ViewGroup viewGroup) {
        super(viewGroup);
        this.X0 = stv0Var;
        this.U0 = (ImageView) viewGroup.findViewById(2131429223);
        this.V0 = viewGroup.findViewById(2131427703);
        this.W0 = (TextView) viewGroup.findViewById(2131430359);
    }
}
