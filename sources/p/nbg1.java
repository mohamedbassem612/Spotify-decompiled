package p;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.transcript.list.TranscriptListView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nbg1 {
    public final /* synthetic */ TranscriptListView a;

    public nbg1(TranscriptListView transcriptListView) {
        this.a = transcriptListView;
    }

    public final LinearLayoutManager a() {
        LinearLayoutManager layoutManager = this.a.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return layoutManager;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    public final void b(int i) {
        w611 w611VarN;
        View view;
        LinearLayoutManager linearLayoutManagerA = a();
        RecyclerView recyclerView = this.a;
        if (linearLayoutManagerA == null || linearLayoutManagerA.D(i) == null) {
            int height = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) / 4;
            LinearLayoutManager linearLayoutManagerA2 = a();
            if (linearLayoutManagerA2 != null) {
                linearLayoutManagerA2.w1(i, height);
                return;
            }
            return;
        }
        int i2 = TranscriptListView.q2;
        if (i < 0) {
            w611VarN = null;
        } else {
            z511 adapter = recyclerView.getAdapter();
            if (i <= (adapter != null ? adapter.e() : 0)) {
                w611VarN = recyclerView.N(i);
            } else {
                w611VarN = null;
            }
        }
        mmr0 mmr0Var = (w611VarN == null || (view = w611VarN.a) == null) ? new mmr0(0, 0) : new mmr0(Integer.valueOf(view.getTop()), Integer.valueOf(view.getMeasuredHeight()));
        recyclerView.x0(0, Math.max(0, ((Number) mmr0Var.a).intValue() - ((recyclerView.getHeight() - ((Number) mmr0Var.b).intValue()) / 2)), new AccelerateInterpolator(0.2f), false);
    }
}
