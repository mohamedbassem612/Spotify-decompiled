package p;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dr70 implements jhh0 {
    public final Bitmap a;

    public dr70(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final View k(ConstraintLayout constraintLayout) {
        View viewInflate = LayoutInflater.from(constraintLayout.getContext()).inflate(2131625084, (ViewGroup) constraintLayout, false);
        ((ImageView) viewInflate).setImageBitmap(this.a);
        return viewInflate;
    }
}
