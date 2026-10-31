package p;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.encoremobile.recyclerviewutil.FrameLayoutManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class w470 {
    public static RecyclerView a(Context context, boolean z) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setHasFixedSize(true);
        if (z) {
            recyclerView.setClipToPadding(false);
            rwq0.s(recyclerView, new dh((byte) 10));
        }
        return recyclerView;
    }

    public static RecyclerView b(Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new FrameLayoutManager());
        recyclerView.setHasFixedSize(true);
        return recyclerView;
    }

    public static void k(RecyclerView recyclerView, boolean z) {
        if (!z) {
            e611 itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.g();
            }
            a layoutManager = recyclerView.getLayoutManager();
            recyclerView.setLayoutManager((a) null);
            recyclerView.setLayoutManager(layoutManager);
        }
        recyclerView.setVisibility(z ? 0 : 8);
    }

    public abstract RecyclerView c();

    public abstract RecyclerView d();

    public abstract View e();

    public abstract void f(re70 re70Var);

    public abstract void g(Parcelable parcelable);

    public abstract Parcelable h();

    public void i(kz50 kz50Var) {
        ((oc70) kz50Var.d).registerObserver(new ic70(this, kz50Var, (byte) 0));
    }

    public void j(int... iArr) {
        bs51.t(c(), iArr);
    }
}
