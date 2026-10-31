package p;

import android.widget.ImageView;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class biy {
    public final ImageView a;
    public final ParagraphView b;

    public biy(ImageView imageView, ParagraphView paragraphView) {
        this.a = imageView;
        this.b = paragraphView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof biy) {
            biy biyVar = (biy) obj;
            return this.a.equals(biyVar.a) && this.b == biyVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
