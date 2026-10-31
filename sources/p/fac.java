package p;

import android.widget.TextView;
import com.spotify.highlightsstats.statsdetails.uiusecases.bubblegraph.BubbleView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fac {
    public final TextView a;
    public final TextView b;
    public final BubbleView c;

    public fac(TextView textView, TextView textView2, BubbleView bubbleView) {
        this.a = textView;
        this.b = textView2;
        this.c = bubbleView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fac) {
            fac facVar = (fac) obj;
            return this.a.equals(facVar.a) && this.b.equals(facVar.b) && this.c == facVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
