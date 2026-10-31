package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.transcript.placeholder.TranscriptionsPlaceholderUiHolder$getLinearLayoutManager$1;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class teg1 implements r6t0 {
    public final Context a;
    public final d83 b = new d83((byte) 9);
    public final seg1 c = new seg1(this, (byte) 0);
    public final ShimmerFrameLayout d;

    public teg1(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = context;
        ShimmerFrameLayout shimmerFrameLayoutInflate = layoutInflater.inflate(2131626288, viewGroup, false);
        RecyclerView recyclerViewFindViewById = shimmerFrameLayoutInflate.findViewById(2131429776);
        ViewGroup.LayoutParams layoutParams = shimmerFrameLayoutInflate.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = b(2131166815);
        marginLayoutParams.leftMargin = b(2131166812);
        marginLayoutParams.rightMargin = b(2131166812);
        shimmerFrameLayoutInflate.setLayoutParams(marginLayoutParams);
        int iB = b(2131166814);
        int iB2 = context.getResources().getDisplayMetrics().widthPixels - (b(2131166812) * 2);
        tr80 tr80VarQ = yoi1.Q(0, 20);
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
        lr80 it = tr80VarQ.iterator();
        while (((sr80) it).c) {
            it.nextInt();
            arrayList.add(new reg1(dqz0.b.h(iB, iB2), b(2131166813), b(2131166816)));
        }
        ne neVar = new ne(3, new rzf1(arrayList, this, (byte) 5));
        recyclerViewFindViewById.getClass();
        neVar.f(recyclerViewFindViewById, new TranscriptionsPlaceholderUiHolder$getLinearLayoutManager$1(1), false);
        ShimmerFrameLayout shimmerFrameLayout = shimmerFrameLayoutInflate;
        this.d = shimmerFrameLayout;
        rwq0.s(shimmerFrameLayout, rre1.t);
    }

    public final void a(boolean z) {
        ShimmerFrameLayout shimmerFrameLayout = this.d;
        if (!z) {
            shimmerFrameLayout.postDelayed(this.c, 500L);
        } else {
            shimmerFrameLayout.c(false);
            shimmerFrameLayout.d();
        }
    }

    public final int b(int i) {
        return this.a.getResources().getDimensionPixelSize(i);
    }

    public final Object getView() {
        return this.d;
    }

    public final void stop() {
        this.d.removeCallbacks(this.c);
    }

    public final void start() {
    }
}
