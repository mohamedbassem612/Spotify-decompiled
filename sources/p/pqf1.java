package p;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.PlayIndicatorView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pqf1 extends w611 {
    public static final /* synthetic */ int c1 = 0;
    public final lvc1 U0;
    public final EncoreListRow V0;
    public final TextView W0;
    public final LinearLayout X0;
    public final LinearLayout Y0;
    public final PlayIndicatorView Z0;
    public final hrr0 a1;
    public final /* synthetic */ qqf1 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqf1(qqf1 qqf1Var, lvc1 lvc1Var, yqg yqgVar) {
        super((ConstraintLayout) lvc1Var.b);
        this.b1 = qqf1Var;
        this.U0 = lvc1Var;
        EncoreListRow encoreListRow = (EncoreListRow) lvc1Var.c;
        this.V0 = encoreListRow;
        this.W0 = (TextView) encoreListRow.getBinding().a.findViewById(2131431371);
        this.X0 = (LinearLayout) encoreListRow.getBinding().c();
        this.Y0 = (LinearLayout) encoreListRow.getBinding().d();
        PlayIndicatorView playIndicatorView = (PlayIndicatorView) encoreListRow.getBinding().b();
        this.Z0 = playIndicatorView;
        this.a1 = v8r.q("");
        gw70 gw70Var = qqf1Var.f;
        playIndicatorView.b = yqgVar;
        ((ArtworkView) playIndicatorView.a.b).setViewContext(new f47(gw70Var));
        ComposeView composeView = (ComposeView) lvc1Var.d;
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(new j2i(1468654078, new mqf1(this, qqf1Var), true));
    }
}
