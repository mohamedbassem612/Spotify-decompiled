package p;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class x511 extends f611 implements h611 {
    public final int a;
    public boolean b;

    public x511(int i) {
        this.a = i;
    }

    public void a(View view) {
        view.setTag(this.a, null);
    }

    public void c(View view) {
        view.setTag(this.a, null);
    }

    public final void e(Rect rect, View view, RecyclerView recyclerView, s611 s611Var) {
        int iR = RecyclerView.R(view);
        if (iR > -1) {
            int i = this.a;
            Boolean bool = (Boolean) view.getTag(i);
            if (bool == null || bool.booleanValue()) {
                j(iR, recyclerView.T(view));
                view.setTag(i, Boolean.valueOf(this.b));
            }
        }
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, s611 s611Var) {
        this.b = true;
    }

    public final void i(RecyclerView recyclerView) {
        this.b = false;
        recyclerView.j(this);
        recyclerView.k(this);
    }

    public abstract void j(int i, w611 w611Var);
}
