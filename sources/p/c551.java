package p;

import android.view.View;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c551 extends w611 {
    public final View U0;
    public final vu30 V0;
    public final vu30 W0;
    public final ArtworkView X0;
    public final TextView Y0;
    public final TextView Z0;
    public final ContentRestrictionBadgeView a1;

    public c551(View view, gw70 gw70Var, h351 h351Var, h351 h351Var2) {
        super(view);
        this.U0 = view;
        this.V0 = h351Var;
        this.W0 = h351Var2;
        ArtworkView artworkViewFindViewById = view.findViewById(2131427611);
        artworkViewFindViewById.setViewContext(new f47(gw70Var));
        this.X0 = artworkViewFindViewById;
        this.Y0 = (TextView) view.findViewById(2131431356);
        this.Z0 = (TextView) view.findViewById(2131431115);
        this.a1 = view.findViewById(2131430674);
    }
}
