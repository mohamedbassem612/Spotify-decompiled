package p;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorComposeView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public interface tzf1 {
    ConstraintLayout b();

    EnhancedBadgeView c();

    QuickActionView d();

    ViewStub e();

    View f();

    View g();

    ArtworkView getArtwork();

    ConstraintLayout getRoot();

    TextView getSubtitle();

    TextView getTitle();

    DownloadBadgeView i();

    ContentRestrictionBadgeView j();

    PremiumBadgeView k();

    PlayIndicatorComposeView l();

    FrameLayout m();

    void n();

    LockedBadgeView o();

    void setEnabled(boolean z);
}
