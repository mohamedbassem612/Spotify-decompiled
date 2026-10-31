package p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p470 implements h611 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ Object d;

    public p470(h98 h98Var, RecyclerView recyclerView, int i) {
        this.a = (byte) 2;
        this.d = h98Var;
        this.c = recyclerView;
        this.b = i;
    }

    public final void a(View view) {
        byte b = this.a;
    }

    public final void c(View view) {
        byte b = this.a;
        int i = this.b;
        RecyclerView recyclerView = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (i == RecyclerView.R(view)) {
                    pwo1.u((int[]) obj, view, recyclerView);
                    recyclerView.o0(this);
                }
                break;
            case 1:
                recyclerView.getClass();
                if (i == RecyclerView.R(view)) {
                    s470.C(recyclerView.T(view)).f((int[]) obj);
                    recyclerView.o0(this);
                }
                break;
            default:
                h98 h98Var = (h98) obj;
                w611 w611VarN = recyclerView.N(i);
                if (w611VarN != null) {
                    recyclerView.o0(this);
                    ((h0z) h98Var.c).getClass();
                    if (w611VarN instanceof g0z) {
                        ((g0z) w611VarN).V0.c(zyz.e);
                    }
                }
                break;
        }
    }

    public /* synthetic */ p470(int i, RecyclerView recyclerView, int[] iArr, byte b) {
        this.a = b;
        this.b = i;
        this.c = recyclerView;
        this.d = iArr;
    }

    private final void b(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
