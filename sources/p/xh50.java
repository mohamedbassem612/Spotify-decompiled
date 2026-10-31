package p;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xh50 implements gi50 {
    public final zfx a;
    public final t2b b;
    public final Resources c;
    public final byp d;
    public final ScrollView e;

    public xh50(LayoutInflater layoutInflater, ViewGroup viewGroup, zfx zfxVar, t2b t2bVar, Resources resources) {
        this.a = zfxVar;
        this.b = t2bVar;
        this.c = resources;
        View viewInflate = layoutInflater.inflate(2131625069, viewGroup, false);
        int i = 2131427863;
        Button button = (Button) m5n1.t(viewInflate, 2131427863);
        if (button != null) {
            i = 2131429026;
            View viewT = m5n1.t(viewInflate, 2131429026);
            if (viewT != null) {
                i = 2131429105;
                TextView textView = (TextView) m5n1.t(viewInflate, 2131429105);
                if (textView != null) {
                    i = 2131429662;
                    TextView textView2 = (TextView) m5n1.t(viewInflate, 2131429662);
                    if (textView2 != null) {
                        i = 2131429818;
                        ProgressBar progressBar = (ProgressBar) m5n1.t(viewInflate, 2131429818);
                        if (progressBar != null) {
                            i = 2131429957;
                            RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131429957);
                            if (recyclerViewT != null) {
                                i = 2131431115;
                                TextView textView3 = (TextView) m5n1.t(viewInflate, 2131431115);
                                if (textView3 != null) {
                                    i = 2131431356;
                                    TextView textView4 = (TextView) m5n1.t(viewInflate, 2131431356);
                                    if (textView4 != null) {
                                        ScrollView scrollView = (ScrollView) viewInflate;
                                        this.d = new byp(scrollView, button, viewT, textView, textView2, progressBar, recyclerViewT, textView3, textView4);
                                        this.e = scrollView;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        return new cn(this, consumer, (byte) 24);
    }

    @Override // p.gi50
    public final View getRoot() {
        return this.e;
    }
}
