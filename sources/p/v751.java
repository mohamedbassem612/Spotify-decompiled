package p;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v751 {
    public final RecyclerView a;
    public final Function0 b;
    public final iu30 c;
    public final iu30 d;
    public int e;
    public long f;
    public int g;
    public int h;
    public u751 i;
    public z511 j;
    public final pn k = new pn(this, (byte) 4);

    public v751(RecyclerView recyclerView, Function0 function0, iu30 iu30Var, iu30 iu30Var2) {
        this.a = recyclerView;
        this.b = function0;
        this.c = iu30Var;
        this.d = iu30Var2;
    }

    public final void a() {
        this.g++;
        u751 u751Var = this.i;
        if (u751Var != null) {
            u751Var.e = true;
            u751Var.f = false;
            this.b.invoke();
        }
    }

    public final void b(int i, long j, xb51 xb51Var, boolean z, Function0 function0) {
        if (xb51Var != null && i == this.e && j == this.f) {
            int i2 = xb51Var.a;
            boolean z2 = (z && this.g == this.h) ? false : true;
            boolean z3 = z2;
            this.i = new u751(i, j, i2, function0, z2);
            if (z3) {
                this.b.invoke();
            }
        }
    }
}
