package p;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.podcastuiplatform.uiusecases.episoderow.elements.description.EpisodeRowDescriptionView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class caz {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public caz(EpisodeRowDescriptionView episodeRowDescriptionView, TextView textView, ImageView imageView, TextView textView2) {
        this.b = textView;
        this.a = imageView;
        this.c = textView2;
    }

    public caz(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.a = imageView;
        this.b = textView;
        this.c = textView2;
    }
}
