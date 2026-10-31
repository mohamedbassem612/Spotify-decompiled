package p;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f2z {
    public final ConstraintLayout a;
    public final ArtworkView b;
    public final TextView c;
    public final TextView d;

    public f2z(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ArtworkView artworkView, TextView textView, TextView textView2) {
        this.a = constraintLayout2;
        this.b = artworkView;
        this.c = textView;
        this.d = textView2;
    }

    public static f2z a(View view) {
        int i = 2131427611;
        ArtworkView artworkViewT = m5n1.t(view, 2131427611);
        if (artworkViewT != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = 2131428509;
            DownloadBadgeView downloadBadgeView = (DownloadBadgeView) m5n1.t(view, 2131428509);
            if (downloadBadgeView != null) {
                i = 2131428510;
                DownloadBadgeView downloadBadgeView2 = (DownloadBadgeView) m5n1.t(view, 2131428510);
                if (downloadBadgeView2 != null) {
                    i = 2131431115;
                    TextView textView = (TextView) m5n1.t(view, 2131431115);
                    if (textView != null) {
                        i = 2131431356;
                        TextView textView2 = (TextView) m5n1.t(view, 2131431356);
                        if (textView2 != null) {
                            return new f2z(constraintLayout, artworkViewT, downloadBadgeView, downloadBadgeView2, textView, textView2);
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public f2z(ConstraintLayout constraintLayout, ArtworkView artworkView, DownloadBadgeView downloadBadgeView, DownloadBadgeView downloadBadgeView2, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = artworkView;
        this.c = textView;
        this.d = textView2;
    }

    public f2z(ConstraintLayout constraintLayout, DownloadBadgeView downloadBadgeView, DownloadBadgeView downloadBadgeView2, ArtworkView artworkView, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = artworkView;
        this.c = textView;
        this.d = textView2;
    }
}
