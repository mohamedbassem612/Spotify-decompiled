package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sb30 {
    public final ConstraintLayout a;
    public final RecyclerView b;

    public /* synthetic */ sb30(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = recyclerView;
    }

    public static sb30 b(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624655, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131430456);
        if (recyclerViewT != null) {
            return new sb30(constraintLayout, recyclerViewT);
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(2131430456)));
        return null;
    }

    public ConstraintLayout a() {
        return this.a;
    }
}
