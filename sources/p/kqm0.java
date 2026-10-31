package p;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.liveevents.uiusecases.multiavatar.MultiArtistAvatarView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kqm0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;

    public /* synthetic */ kqm0(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    public kqm0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    public kqm0(ConstraintLayout constraintLayout, MultiArtistAvatarView multiArtistAvatarView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.a = constraintLayout2;
        this.b = textView;
        this.c = textView2;
    }
}
