package p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface e391 {
    default void a() {
        View view = getView();
        int iMin = Math.min((int) (view.getResources().getDisplayMetrics().widthPixels * 0.4f), a8o.y(200.0f, view.getResources()));
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iMin;
        } else {
            getView().setLayoutParams(new ViewGroup.LayoutParams(iMin, -2));
        }
    }

    ArtworkView b();

    default void e() {
        ((ViewGroup.MarginLayoutParams) ((qhl) b().getLayoutParams())).bottomMargin = a8o.y(12.0f, b().getResources());
    }

    View getView();
}
