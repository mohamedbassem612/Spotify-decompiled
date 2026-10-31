package p;

import android.graphics.RectF;
import com.spotify.transcript.uiusecases.zoomimageview.ZoomImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f180 {
    public final ZoomImageView a;
    public final RectF b;

    public f180(ZoomImageView zoomImageView, RectF rectF) {
        this.a = zoomImageView;
        this.b = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f180) {
            f180 f180Var = (f180) obj;
            if (this.a == f180Var.a && u890.j(this.b, f180Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
