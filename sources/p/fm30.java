package p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fm30 extends x511 {
    public final vx40 c;
    public boolean d;

    public fm30(vx40 vx40Var) {
        super(2131428967);
        this.c = vx40Var;
    }

    public final void a(View view) {
        view.setTag(((x511) this).a, null);
        if (this.d && (view instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) view;
            ((x511) this).b = false;
            recyclerView.n0(this);
            recyclerView.o0(this);
        }
    }

    public final void c(View view) {
        view.setTag(((x511) this).a, null);
        if (this.d && (view instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) view;
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            for (int i = 0; i < itemDecorationCount; i++) {
                int itemDecorationCount2 = recyclerView.getItemDecorationCount();
                if (i < 0 || i >= itemDecorationCount2) {
                    eg.g(ab80.m(i, itemDecorationCount2, " is an invalid index for size "));
                    return;
                } else {
                    if (this == ((f611) recyclerView.S0.get(i))) {
                        return;
                    }
                }
            }
            i(recyclerView);
        }
    }

    public final void j(int i, w611 w611Var) {
        this.c.v((y570) s470.C(w611Var).d().c);
    }
}
