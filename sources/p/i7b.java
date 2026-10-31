package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i7b implements j630 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i7b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(i430 i430Var) {
        byte b = this.a;
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kt91 kt91Var = ((k7b) obj).c;
                kt91Var.b();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952763});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131952763, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                kt91 kt91Var2 = ((ngh1) obj).c;
                kt91Var2.b();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952763});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var2.k(new er91((fs91) null, "", 2131952763, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }

    private final void c(i430 i430Var) {
    }

    private final void d(i430 i430Var) {
    }
}
