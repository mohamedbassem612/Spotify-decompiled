package p;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yy6 extends w611 {
    public final View U0;
    public final vu30 V0;
    public final vu30 W0;
    public final TextView X0;
    public final ArtworkView Y0;
    public final ImageView Z0;

    public yy6(View view, d0m d0mVar, d0m d0mVar2, gw70 gw70Var) {
        super(view);
        this.U0 = view;
        this.V0 = d0mVar;
        this.W0 = d0mVar2;
        this.X0 = (TextView) view.findViewById(2131431356);
        ArtworkView artworkViewFindViewById = view.findViewById(2131429612);
        this.Y0 = artworkViewFindViewById;
        ImageView imageView = (ImageView) view.findViewById(2131427972);
        this.Z0 = imageView;
        x8p1.r(view, 2130837541);
        x8p1.r(imageView, 2130837505);
        artworkViewFindViewById.setViewContext(new f47(gw70Var));
    }
}
